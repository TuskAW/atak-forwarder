package com.paulmandal.atak.forwarder.plugin.ui.viewmodels;

import android.content.SharedPreferences;

import androidx.annotation.CallSuper;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.paulmandal.atak.forwarder.channel.ChannelConfig;
import com.paulmandal.atak.forwarder.helpers.HashHelper;
import com.paulmandal.atak.forwarder.plugin.Destroyable;
import com.paulmandal.atak.forwarder.plugin.DestroyableSharedPrefsListener;
import com.paulmandal.atak.forwarder.preferences.PreferencesKeys;

import java.util.ArrayList;
import java.util.List;

public class ChannelStatusViewModel extends DestroyableSharedPrefsListener {
    private final MutableLiveData<String> mChannelName = new MutableLiveData<>();
    private final MutableLiveData<String> mPskHash = new MutableLiveData<>();
    private final MutableLiveData<Integer> mModemConfig = new MutableLiveData<>();

    private final HashHelper mHashHelper;

    public ChannelStatusViewModel(List<Destroyable> destroyables,
                                  SharedPreferences sharedPreferences,
                                  HashHelper hashHelper) {
        super(destroyables,
                sharedPreferences,
                new String[]{
                        PreferencesKeys.KEY_CHANNEL_DATA,
                },
                new String[]{});

        mHashHelper = hashHelper;

        complexUpdate(sharedPreferences, "");
    }

    public LiveData<String> getChannelName() {
        return mChannelName;
    }

    public LiveData<Integer> getModemConfig() {
        return mModemConfig;
    }

    public LiveData<String> getPskHash() {
        return mPskHash;
    }

    @CallSuper
    public void clearData() {
        mChannelName.postValue(null);
        mModemConfig.postValue(null);
        mPskHash.postValue(null);
    }

    @Override
    protected void updateSettings(SharedPreferences sharedPreferences) {
        Gson gson = new Gson();
        List<ChannelConfig> channelConfigs = gson.fromJson(sharedPreferences.getString(PreferencesKeys.KEY_CHANNEL_DATA, null), new TypeToken<ArrayList<ChannelConfig>>() {}.getType());
        if (channelConfigs == null) {
            return;
        }

        for (ChannelConfig channelConfig : channelConfigs) {
            if (channelConfig.isDefault) {
                mChannelName.postValue(channelConfig.name);
                mModemConfig.postValue(channelConfig.modemConfig);
                mPskHash.postValue(mHashHelper.hashFromBytes(channelConfig.psk));
            }
        }
    }

    @Override
    protected void complexUpdate(SharedPreferences sharedPreferences, String key) {
        // Do nothing
    }
}