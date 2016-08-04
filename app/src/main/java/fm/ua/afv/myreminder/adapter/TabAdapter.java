package fm.ua.afv.myreminder.adapter;


import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v13.app.FragmentStatePagerAdapter;

import fm.ua.afv.myreminder.fragment.CurrentTaskFragment;
import fm.ua.afv.myreminder.fragment.DoneTaskFragment;

/**
 * Created by afv on 31.07.2016.
 */
public class TabAdapter  extends FragmentStatePagerAdapter{

    private int numberOfTabs;

    public static final int CURRENT_TASK_FRAGMENT_POSITION = 0;
    public static final int DONE_TASK_FRAGMENT_POSITION = 1;

    private CurrentTaskFragment currentTaskFragment;
    private DoneTaskFragment doneTaskFragment;

    public TabAdapter(FragmentManager fm, int numberOfTas ) {
        super(fm);
        this.numberOfTabs = numberOfTas;
        currentTaskFragment = new CurrentTaskFragment();
        doneTaskFragment    = new DoneTaskFragment();
    }

    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0:
                return currentTaskFragment;
            case 1:
                return doneTaskFragment;
            default:
                return null;

        }
    }

    @Override
    public int getCount() {
        return numberOfTabs;
    }
}
