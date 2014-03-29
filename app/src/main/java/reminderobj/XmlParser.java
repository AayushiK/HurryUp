package reminderobj;

import android.content.res.XmlResourceParser;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by schan on 3/28/14.
 */
public class XmlParser {
    static final int TEXT_OBJECT = 0;
    static final int PIC_OBJECT = 1;
    static final int MAP_OBJECT = 2;

    public static List<ReminderObj> getReminderObj(XmlResourceParser xrp){
        List<ReminderObj> lists = new ArrayList<ReminderObj>();
        try {
            while (xrp.getEventType() != XmlResourceParser.END_DOCUMENT){
                String s = xrp.getName();
                if (xrp.getEventType() == XmlResourceParser.START_TAG){
                    if (s.equals("object")) {
                        ReminderObj obj;
                        int type = xrp.getAttributeIntValue(null, "type", -1);
                        switch (type) {
                            case TEXT_OBJECT:
                                obj = new ReminderObj.TextObj();
                                break;
                            case PIC_OBJECT:
                                ReminderObj.PicObj picObj = new ReminderObj.PicObj();
                                picObj.location = xrp.getAttributeValue(null, "location");
                                obj = picObj;
                                break;
                            case MAP_OBJECT:
                                ReminderObj.MapObj mapObj = new ReminderObj.MapObj();
                                mapObj.location = xrp.getAttributeValue(null, "location");
                                obj = mapObj;
                                break;
                            default:
                                obj = new ReminderObj();
                        }
                        obj.text = xrp.getAttributeValue(null, "text");
                        lists.add(obj);
                    }
                }
                xrp.next();
            }
            xrp.close();
        } catch (Exception e) {
            e.printStackTrace();
            Log.e("XML Error", e.toString());
        }
        return lists;
    }

    public static void addReminderObj(XmlResourceParser xrp, ReminderObj obj){
        //TODO:
    }


}
