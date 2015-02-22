package comd7shah.github.www.finalquizzapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by dhrutishah on 15-02-22.
 */
public class PagerAdapter extends FragmentPagerAdapter {
    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int arg0) {
        switch (arg0){
            case 0:
                return new FragmentOne();

            case 1:
                return new FragmentTwo();

            case 2:
                return new FragmentThree();

            case 3:
                return new FragmentFour();

            case 4:
                return new FragmentFive();

            case 5:
                return new SubmitQuiz();

            default:
                break;

        }
        return null;
    }

    @Override
    public int getCount() {
        return 6;
    }
}
