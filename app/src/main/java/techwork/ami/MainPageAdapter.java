package techwork.ami;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.Button;

/**
 * Created by Daniel on 27-07-2016.
 */
public class MainPageAdapter extends FragmentPagerAdapter {
    private static final int HOME = 0 ;
    private static final int MAP =2;
    private static final int NECESIDAD = 3;
    final int PAGE_COUNT = 4;
    final String tabTitles[] = new String[] {"AMI", "Mis reservas", "Mapa", "Necesidades"};
    ;
    public MainPageAdapter (FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment f = null;
        switch(position) {
            case HOME:
               f = layout.FragmentHome.newInstance();
                break;
            case 1:
                f = layout.FragmentHome.newInstance();
                break;
            case MAP:
                f = layout.FragmentMap.newInstance();
                break;
            case NECESIDAD:
                f = layout.FragmentHome.newInstance();
                break;
        }
        return f;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}
