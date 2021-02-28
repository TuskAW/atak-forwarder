package com.paulmandal.atak.forwarder.plugin;

import com.atakmap.coremap.cot.event.CotEvent;
import com.paulmandal.atak.forwarder.comm.MessageType;
import com.paulmandal.atak.forwarder.comm.queue.CommandQueue;
import com.paulmandal.atak.forwarder.comm.queue.commands.QueuedCommand;
import com.paulmandal.atak.forwarder.comm.queue.commands.QueuedCommandFactory;
import com.paulmandal.atak.libcotshrink.pub.api.CotShrinker;

public class CotSpammer {
    public static void spamCots(CommandQueue commandQueue, QueuedCommandFactory queuedCommandFactory, CotShrinker cotShrinker) {
        CotEvent[] cotEvents = new CotEvent[20];
        cotEvents[0] = CotEvent.parse("<?xml version='1.0' encoding='UTF-8' standalone='yes'?><event version='2.0' uid='533e2070-77b6-4bab-8cab-98fb0ce5edd9' type='a-u-G' time='2020-09-17T16:21:57.721Z' start='2020-09-17T16:21:57.721Z' stale='2020-09-17T16:26:57.721Z' how='h-g-i-g-o'><point lat='39.726013960131404' lon='-105.10299605546003' hae='1668.9554962738666' ce='9999999.0' le='9999999.0' /><detail><status readiness='true'/><archive/><contact callsign='U.17.102107'/><usericon iconsetpath='COT_MAPPING_2525B/a-u/a-u-G'/><link uid='ANDROID-53af0912586418dc' production_time='2020-09-17T16:21:07.332Z' type='a-f-G-U-C' parent_callsign='dasuberdog' relation='p-p'/><archive/><precisionlocation altsrc='DTED2'/><remarks></remarks><color argb='-1'/></detail></event>");
        cotEvents[1] = CotEvent.parse("<?xml version='1.0' encoding='UTF-8' standalone='yes'?><event version='2.0' uid='5b917ac7-2edd-4f6a-970e-0f9c32f149e5' type='a-u-G' time='2020-09-17T16:21:59.564Z' start='2020-09-17T16:21:59.564Z' stale='2020-09-17T16:26:59.564Z' how='h-g-i-g-o'><point lat='39.728009981984385' lon='-105.08680430338087' hae='1643.464449255349' ce='9999999.0' le='9999999.0' /><detail><status readiness='true'/><archive/><contact callsign='U.17.102108'/><usericon iconsetpath='COT_MAPPING_2525B/a-u/a-u-G'/><link uid='ANDROID-53af0912586418dc' production_time='2020-09-17T16:21:08.177Z' type='a-f-G-U-C' parent_callsign='dasuberdog' relation='p-p'/><archive/><precisionlocation altsrc='DTED2'/><remarks></remarks><color argb='-1'/></detail></event>");
        cotEvents[2] = CotEvent.parse("<?xml version='1.0' encoding='UTF-8' standalone='yes'?><event version='2.0' uid='defd3d90-0b6c-49c4-a20e-a99d5a2c4e0f' type='a-u-G' time='2020-09-17T16:22:01.835Z' start='2020-09-17T16:22:01.835Z' stale='2020-09-17T16:27:01.835Z' how='h-g-i-g-o'><point lat='39.72894145884911' lon='-105.07186823819767' hae='1631.3768984742312' ce='9999999.0' le='9999999.0' /><detail><status readiness='true'/><archive/><contact callsign='U.17.102108.1'/><usericon iconsetpath='COT_MAPPING_2525B/a-u/a-u-G'/><link uid='ANDROID-53af0912586418dc' production_time='2020-09-17T16:21:08.948Z' type='a-f-G-U-C' parent_callsign='dasuberdog' relation='p-p'/><archive/><precisionlocation altsrc='DTED2'/><remarks></remarks><color argb='-1'/></detail></event>");
        cotEvents[3] = CotEvent.parse("<?xml version='1.0' encoding='UTF-8' standalone='yes'?><event version='2.0' uid='008c072a-7e2a-4a7d-bf91-09613a7ed04b' type='a-u-G' time='2020-09-17T16:22:03.753Z' start='2020-09-17T16:22:03.753Z' stale='2020-09-17T16:27:03.753Z' how='h-g-i-g-o'><point lat='39.73040520820796' lon='-105.05693217301445' hae='1623.3719200157225' ce='9999999.0' le='9999999.0' /><detail><status readiness='true'/><archive/><contact callsign='U.17.102109'/><usericon iconsetpath='COT_MAPPING_2525B/a-u/a-u-G'/><link uid='ANDROID-53af0912586418dc' production_time='2020-09-17T16:21:09.693Z' type='a-f-G-U-C' parent_callsign='dasuberdog' relation='p-p'/><archive/><precisionlocation altsrc='DTED2'/><remarks></remarks><color argb='-1'/></detail></event>");
        cotEvents[4] = CotEvent.parse("<?xml version='1.0' encoding='UTF-8' standalone='yes'?><event version='2.0' uid='25429138-0735-4041-a6b2-a00924636b17' type='a-u-G' time='2020-09-17T16:22:05.598Z' start='2020-09-17T16:22:05.598Z' stale='2020-09-17T16:27:05.598Z' how='h-g-i-g-o'><point lat='39.73173588944328' lon='-105.04100477607129' hae='1595.778988710875' ce='9999999.0' le='9999999.0' /><detail><status readiness='true'/><archive/><contact callsign='U.17.102110'/><usericon iconsetpath='COT_MAPPING_2525B/a-u/a-u-G'/><link uid='ANDROID-53af0912586418dc' production_time='2020-09-17T16:21:10.437Z' type='a-f-G-U-C' parent_callsign='dasuberdog' relation='p-p'/><archive/><precisionlocation altsrc='DTED2'/><remarks></remarks><color argb='-1'/></detail></event>");
        cotEvents[5] = CotEvent.parse("<?xml version='1.0' encoding='UTF-8' standalone='yes'?><event version='2.0' uid='4f241edb-3048-4cf9-bf2e-314bb2cf73d7' type='a-u-G' time='2020-09-17T16:22:07.540Z' start='2020-09-17T16:22:07.540Z' stale='2020-09-17T16:27:07.540Z' how='h-g-i-g-o'><point lat='39.72022549675777' lon='-105.03657682754351' hae='1598.7786039954215' ce='9999999.0' le='9999999.0' /><detail><status readiness='true'/><archive/><contact callsign='U.17.102115'/><usericon iconsetpath='COT_MAPPING_2525B/a-u/a-u-G'/><link uid='ANDROID-53af0912586418dc' production_time='2020-09-17T16:21:15.386Z' type='a-f-G-U-C' parent_callsign='dasuberdog' relation='p-p'/><archive/><precisionlocation altsrc='DTED2'/><remarks></remarks><color argb='-1'/></detail></event>");
        cotEvents[6] = CotEvent.parse("<?xml version='1.0' encoding='UTF-8' standalone='yes'?><event version='2.0' uid='f95c2560-b61c-40d9-b8ef-0656f623552a' type='a-u-G' time='2020-09-17T16:22:09.642Z' start='2020-09-17T16:22:09.642Z' stale='2020-09-17T16:27:09.642Z' how='h-g-i-g-o'><point lat='39.719693224263644' lon='-105.05250422448668' hae='1627.3241032332176' ce='9999999.0' le='9999999.0' /><detail><status readiness='true'/><archive/><contact callsign='U.17.102114.1'/><usericon iconsetpath='COT_MAPPING_2525B/a-u/a-u-G'/><link uid='ANDROID-53af0912586418dc' production_time='2020-09-17T16:21:14.723Z' type='a-f-G-U-C' parent_callsign='dasuberdog' relation='p-p'/><archive/><precisionlocation altsrc='DTED2'/><remarks></remarks><color argb='-1'/></detail></event>");
        cotEvents[7] = CotEvent.parse("<?xml version='1.0' encoding='UTF-8' standalone='yes'?><event version='2.0' uid='0a3d9ed3-1d28-4dd1-861e-54ad21b1407d' type='a-u-G' time='2020-09-17T16:22:11.730Z' start='2020-09-17T16:22:11.730Z' stale='2020-09-17T16:27:11.730Z' how='h-g-i-g-o'><point lat='39.71583424868121' lon='-105.06882815413383' hae='1645.5375915531708' ce='9999999.0' le='9999999.0' /><detail><status readiness='true'/><archive/><contact callsign='U.17.102114'/><usericon iconsetpath='COT_MAPPING_2525B/a-u/a-u-G'/><link uid='ANDROID-53af0912586418dc' production_time='2020-09-17T16:21:14.020Z' type='a-f-G-U-C' parent_callsign='dasuberdog' relation='p-p'/><archive/><precisionlocation altsrc='DTED2'/><remarks></remarks><color argb='-1'/></detail></event>");
        cotEvents[8] = CotEvent.parse("<?xml version='1.0' encoding='UTF-8' standalone='yes'?><event version='2.0' uid='4d2d7cdd-1840-48ed-9b90-0b1ffd84d52d' type='a-u-G' time='2020-09-17T16:22:13.682Z' start='2020-09-17T16:22:13.682Z' stale='2020-09-17T16:27:13.682Z' how='h-g-i-g-o'><point lat='39.71297328402528' lon='-105.08422684080502' hae='1664.9451311669416' ce='9999999.0' le='9999999.0' /><detail><status readiness='true'/><archive/><contact callsign='U.17.102113'/><usericon iconsetpath='COT_MAPPING_2525B/a-u/a-u-G'/><link uid='ANDROID-53af0912586418dc' production_time='2020-09-17T16:21:13.333Z' type='a-f-G-U-C' parent_callsign='dasuberdog' relation='p-p'/><archive/><precisionlocation altsrc='DTED2'/><remarks></remarks><color argb='-1'/></detail></event>");
        cotEvents[9] = CotEvent.parse("<?xml version='1.0' encoding='UTF-8' standalone='yes'?><event version='2.0' uid='9501a0ec-e8e6-475c-b858-696dded82509' type='a-u-G' time='2020-09-17T16:22:15.536Z' start='2020-09-17T16:22:15.536Z' stale='2020-09-17T16:27:15.536Z' how='h-g-i-g-o'><point lat='39.712307943407616' lon='-105.09936117234022' hae='1677.6504931236814' ce='9999999.0' le='9999999.0' /><detail><status readiness='true'/><archive/><contact callsign='U.17.102112'/><usericon iconsetpath='COT_MAPPING_2525B/a-u/a-u-G'/><link uid='ANDROID-53af0912586418dc' production_time='2020-09-17T16:21:12.635Z' type='a-f-G-U-C' parent_callsign='dasuberdog' relation='p-p'/><archive/><precisionlocation altsrc='DTED2'/><remarks></remarks><color argb='-1'/></detail></event>");
        cotEvents[10] = CotEvent.parse("<?xml version='1.0' encoding='UTF-8' standalone='yes'?><event version='2.0' uid='fa379ed1-a151-4d08-a0d9-3884579bdeb5' type='a-u-G' time='2020-09-17T16:22:17.508Z' start='2020-09-17T16:22:17.508Z' stale='2020-09-17T16:27:17.508Z' how='h-g-i-g-o'><point lat='39.69653937076909' lon='-105.09711415368433' hae='1683.6637210570307' ce='9999999.0' le='9999999.0' /><detail><status readiness='true'/><archive/><contact callsign='U.17.102116'/><usericon iconsetpath='COT_MAPPING_2525B/a-u/a-u-G'/><link uid='ANDROID-53af0912586418dc' production_time='2020-09-17T16:21:16.435Z' type='a-f-G-U-C' parent_callsign='dasuberdog' relation='p-p'/><archive/><precisionlocation altsrc='DTED2'/><remarks></remarks><color argb='-1'/></detail></event>");
        cotEvents[11] = CotEvent.parse("<?xml version='1.0' encoding='UTF-8' standalone='yes'?><event version='2.0' uid='f8f12f89-a1ac-4f9f-bd3b-2fb616337618' type='a-u-G' time='2020-09-17T16:22:19.390Z' start='2020-09-17T16:22:19.390Z' stale='2020-09-17T16:27:19.390Z' how='h-g-i-g-o'><point lat='39.69820272231323' lon='-105.08118675674118' hae='1670.9182195143512' ce='9999999.0' le='9999999.0' /><detail><status readiness='true'/><archive/><contact callsign='U.17.102117'/><usericon iconsetpath='COT_MAPPING_2525B/a-u/a-u-G'/><link uid='ANDROID-53af0912586418dc' production_time='2020-09-17T16:21:17.076Z' type='a-f-G-U-C' parent_callsign='dasuberdog' relation='p-p'/><archive/><precisionlocation altsrc='DTED2'/><remarks></remarks><color argb='-1'/></detail></event>");
        cotEvents[12] = CotEvent.parse("<?xml version='1.0' encoding='UTF-8' standalone='yes'?><event version='2.0' uid='b6ff821e-33fc-473e-94d8-3d935d4530eb' type='a-u-G' time='2020-09-17T16:22:21.211Z' start='2020-09-17T16:22:21.211Z' stale='2020-09-17T16:27:21.211Z' how='h-g-i-g-o'><point lat='39.69913419917796' lon='-105.06413585047007' hae='1648.7655463485657' ce='9999999.0' le='9999999.0' /><detail><status readiness='true'/><archive/><contact callsign='U.17.102117.1'/><usericon iconsetpath='COT_MAPPING_2525B/a-u/a-u-G'/><link uid='ANDROID-53af0912586418dc' production_time='2020-09-17T16:21:17.781Z' type='a-f-G-U-C' parent_callsign='dasuberdog' relation='p-p'/><archive/><precisionlocation altsrc='DTED2'/><remarks></remarks><color argb='-1'/></detail></event>");
        cotEvents[13] = CotEvent.parse("<?xml version='1.0' encoding='UTF-8' standalone='yes'?><event version='2.0' uid='954cdb8a-e06d-4931-9d35-e119730f7aff' type='a-u-G' time='2020-09-17T16:22:23.004Z' start='2020-09-17T16:22:23.004Z' stale='2020-09-17T16:27:23.004Z' how='h-g-i-g-o'><point lat='39.70339237913098' lon='-105.0483406310949' hae='1632.4331122972894' ce='9999999.0' le='9999999.0' /><detail><status readiness='true'/><archive/><contact callsign='U.17.102118'/><usericon iconsetpath='COT_MAPPING_2525B/a-u/a-u-G'/><link uid='ANDROID-53af0912586418dc' production_time='2020-09-17T16:21:18.478Z' type='a-f-G-U-C' parent_callsign='dasuberdog' relation='p-p'/><archive/><precisionlocation altsrc='DTED2'/><remarks></remarks><color argb='-1'/></detail></event>");
        cotEvents[14] = CotEvent.parse("<?xml version='1.0' encoding='UTF-8' standalone='yes'?><event version='2.0' uid='b56658da-86ac-4da3-947e-d57095787195' type='a-u-G' time='2020-09-17T16:22:24.848Z' start='2020-09-17T16:22:24.848Z' stale='2020-09-17T16:27:24.848Z' how='h-g-i-g-o'><point lat='39.709180842504615' lon='-105.0311575472558' hae='1615.3663972169968' ce='9999999.0' le='9999999.0' /><detail><status readiness='true'/><archive/><contact callsign='U.17.102119'/><usericon iconsetpath='COT_MAPPING_2525B/a-u/a-u-G'/><link uid='ANDROID-53af0912586418dc' production_time='2020-09-17T16:21:19.177Z' type='a-f-G-U-C' parent_callsign='dasuberdog' relation='p-p'/><archive/><precisionlocation altsrc='DTED2'/><remarks></remarks><color argb='-1'/></detail></event>");
        cotEvents[15] = CotEvent.parse("<?xml version='1.0' encoding='UTF-8' standalone='yes'?><event version='2.0' uid='2f32f42d-aa56-444e-a61a-53cee147c46d' type='a-u-G' time='2020-09-17T16:22:27.054Z' start='2020-09-17T16:22:27.054Z' stale='2020-09-17T16:27:27.054Z' how='h-g-i-g-o'><point lat='39.69547482578083' lon='-105.02382169223219' hae='1619.5820769870709' ce='9999999.0' le='9999999.0' /><detail><status readiness='true'/><archive/><contact callsign='U.17.102123'/><usericon iconsetpath='COT_MAPPING_2525B/a-u/a-u-G'/><link uid='ANDROID-53af0912586418dc' production_time='2020-09-17T16:21:23.096Z' type='a-f-G-U-C' parent_callsign='dasuberdog' relation='p-p'/><archive/><precisionlocation altsrc='DTED2'/><remarks></remarks><color argb='-1'/></detail></event>");
        cotEvents[16] = CotEvent.parse("<?xml version='1.0' encoding='UTF-8' standalone='yes'?><event version='2.0' uid='f80e67fa-24e6-4bc4-8ec5-ad04f6f91c66' type='a-u-G' time='2020-09-17T16:22:29.082Z' start='2020-09-17T16:22:29.082Z' stale='2020-09-17T16:27:29.082Z' how='h-g-i-g-o'><point lat='39.688621817418934' lon='-105.04311961715918' hae='1634.6890722504531' ce='9999999.0' le='9999999.0' /><detail><status readiness='true'/><archive/><contact callsign='U.17.102122'/><usericon iconsetpath='COT_MAPPING_2525B/a-u/a-u-G'/><link uid='ANDROID-53af0912586418dc' production_time='2020-09-17T16:21:22.271Z' type='a-f-G-U-C' parent_callsign='dasuberdog' relation='p-p'/><archive/><precisionlocation altsrc='DTED2'/><remarks></remarks><color argb='-1'/></detail></event>");
        cotEvents[17] = CotEvent.parse("<?xml version='1.0' encoding='UTF-8' standalone='yes'?><event version='2.0' uid='ed425278-9d8c-4471-9b6a-cca4a08a59df' type='a-u-G' time='2020-09-17T16:22:31.554Z' start='2020-09-17T16:22:31.554Z' stale='2020-09-17T16:27:31.554Z' how='h-g-i-g-o'><point lat='39.687490738368915' lon='-105.06129403275821' hae='1650.4759237504356' ce='9999999.0' le='9999999.0' /><detail><status readiness='true'/><archive/><contact callsign='U.17.102121'/><usericon iconsetpath='COT_MAPPING_2525B/a-u/a-u-G'/><link uid='ANDROID-53af0912586418dc' production_time='2020-09-17T16:21:21.563Z' type='a-f-G-U-C' parent_callsign='dasuberdog' relation='p-p'/><archive/><precisionlocation altsrc='DTED2'/><remarks></remarks><color argb='-1'/></detail></event>");
        cotEvents[18] = CotEvent.parse("<?xml version='1.0' encoding='UTF-8' standalone='yes'?><event version='2.0' uid='4ca035b8-e251-43a6-9107-18ee9295e953' type='a-u-G' time='2020-09-17T16:22:33.401Z' start='2020-09-17T16:22:33.401Z' stale='2020-09-17T16:27:33.401Z' how='h-g-i-g-o'><point lat='39.684496705589446' lon='-105.07794840632535' hae='1669.9608118342908' ce='9999999.0' le='9999999.0' /><detail><status readiness='true'/><archive/><contact callsign='U.17.102120.1'/><usericon iconsetpath='COT_MAPPING_2525B/a-u/a-u-G'/><link uid='ANDROID-53af0912586418dc' production_time='2020-09-17T16:21:20.870Z' type='a-f-G-U-C' parent_callsign='dasuberdog' relation='p-p'/><archive/><precisionlocation altsrc='DTED2'/><remarks></remarks><color argb='-1'/></detail></event>");
        cotEvents[19] = CotEvent.parse("<?xml version='1.0' encoding='UTF-8' standalone='yes'?><event version='2.0' uid='24caba2d-faa9-4088-8950-7aa8968a7b7c' type='a-u-G' time='2020-09-17T16:22:35.246Z' start='2020-09-17T16:22:35.246Z' stale='2020-09-17T16:27:35.246Z' how='h-g-i-g-o'><point lat='39.68150267280998' lon='-105.09447060232448' hae='1688.3471296883324' ce='9999999.0' le='9999999.0' /><detail><status readiness='true'/><archive/><contact callsign='U.17.102120'/><usericon iconsetpath='COT_MAPPING_2525B/a-u/a-u-G'/><link uid='ANDROID-53af0912586418dc' production_time='2020-09-17T16:21:20.195Z' type='a-f-G-U-C' parent_callsign='dasuberdog' relation='p-p'/><archive/><precisionlocation altsrc='DTED2'/><remarks></remarks><color argb='-1'/></detail></event>");

        for (CotEvent cotEvent : cotEvents) {
            byte[] cotProtobuf = cotShrinker.toByteArray(cotEvent);
            commandQueue.queueSendMessage(queuedCommandFactory.createSendMessageCommand(QueuedCommand.PRIORITY_HIGH, cotEvent, cotProtobuf, null, MessageType.PLI), false);
        }
    }
}
