package fm.ua.afv.myreminder;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by afv on 30.07.2016.
 */
public class PreferenceHelper {
    public static final String SPLASH_IS_INVISIBLE = "splash_is_invisible";
    private static PreferenceHelper instance;
    private Context context;
    private SharedPreferences preferences;

    private PreferenceHelper(){

    }

    public static PreferenceHelper getInstance(){
        if(instance == null ){
            instance = new PreferenceHelper();
        }
        return instance;
    }

    public void init(Context context){
        this.context = context;
        preferences = context.getSharedPreferences("preferences", Context.MODE_PRIVATE);

    }

    public void putBoolean(String key, boolean value){
        SharedPreferences.Editor editor = preferences.edit();
        editor.putBoolean(key,value);
        editor.apply();

    }
    public boolean getBoolean(String key){
        return preferences.getBoolean(key, false);
    }
}
