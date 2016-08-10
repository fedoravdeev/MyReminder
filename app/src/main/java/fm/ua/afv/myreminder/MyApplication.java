package fm.ua.afv.myreminder;

import android.app.Application;

/**
 * Created by afv on 10.08.2016.
 */
public class MyApplication extends Application {

    private static boolean activityVisible;

    public static boolean isActivityVisible() {
        return activityVisible;
    }

    public static void activityResumed(){
        activityVisible = true;
    }

    public static void activityPaused(){
        activityVisible = false;
    }
}
