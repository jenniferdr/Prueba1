package cl.jenni.prueba1;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class SectionsPagerAdapter extends FragmentPagerAdapter {

    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return AdvicesFragment.newInstance();
            case 1:
                return EvaluationFragment.newInstance();
        }
        return AdvicesFragment.newInstance();
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Consejo del día";
            case 1:
                return "Evaluación";
        }
        return null;
    }
}
