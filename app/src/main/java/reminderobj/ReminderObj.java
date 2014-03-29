package reminderobj;

/**
 * Created by schan on 3/28/14.
 */


public class ReminderObj {

    String text;
    public static class TextObj extends ReminderObj {

    }

    public static class PicObj extends ReminderObj {
        String location;
    }

    public static class MapObj extends ReminderObj {
        String location;
    }
}
