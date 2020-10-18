package com.example.myapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new RestourantFragment();
            case 1:
                return new MallFragment();
            case 2:
                return new ParkFragment();
            default:
                return null;
        }
    }


    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getString(R.string.res);
            case 1:
                return mContext.getString(R.string.mon);
            case 2:
                return mContext.getString(R.string.par);
            default:
                return null;
        }
    }


    @Override
    public int getCount() {
        return 3;
    }
}
