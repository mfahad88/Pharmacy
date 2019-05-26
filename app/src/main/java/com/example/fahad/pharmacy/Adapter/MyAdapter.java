package com.example.fahad.pharmacy.Adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.fahad.pharmacy.Fragment.AddMedicineFragment;

public class MyAdapter extends FragmentStatePagerAdapter {
    int totalTabs;
    Fragment fragment;
    public MyAdapter(FragmentManager fm,int totalTabs) {
        super(fm);

        this.totalTabs=totalTabs;
    }

    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case 0:
                 fragment = new AddMedicineFragment();
                return fragment;
            case 1:
                fragment = new AddMedicineFragment();
                return fragment;
            case 2:
                fragment = new AddMedicineFragment();
                return fragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return totalTabs;
    }
}
