package fm.ua.afv.myreminder;

import java.text.SimpleDateFormat;

/**
 * Created by afv on 03.08.2016.
 */
public class Utils {

    public static String getDate(long date){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.YY");
        return dateFormat.format(date);
    }
    public static String getTime(long time){
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH.mm");
        return timeFormat.format(time);
    }
}
