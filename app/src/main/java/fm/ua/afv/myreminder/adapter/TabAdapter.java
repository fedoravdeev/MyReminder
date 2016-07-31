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

    public TabAdapter(FragmentManager fm, int numberOfTas ) {
        super(fm);
        this.numberOfTabs = numberOfTas;
    }

    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0:
                return new CurrentTaskFragment();
            case 1:
                return new DoneTaskFragment();
            default:
                return null;

        }
    }

    @Override
    public int getCount() {
        return numberOfTabs;
    }
}
