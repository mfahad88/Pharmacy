package com.example.fahad.pharmacy.Fragment;


import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fahad.pharmacy.Adapter.MyAdapter;
import com.example.fahad.pharmacy.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MedicineFragment extends Fragment {
    View mView;
    TabLayout tabLayout;
    ViewPager viewPager;
    MyAdapter adapter;
    public MedicineFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView=inflater.inflate(R.layout.fragment_medicine, container, false);
        initViews();





        adapter = new MyAdapter(getFragmentManager(),tabLayout.getTabCount());

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        viewPager.setOffscreenPageLimit(tabLayout.getTabCount());

        tabLayout.setTabTextColors(ColorStateList.valueOf(Color.BLACK));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                viewPager.setCurrentItem(tab.getPosition());

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {
                tabLayout.getTabAt(i).select();
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });






        return mView;
    }


    private void initViews(){
        tabLayout=mView.findViewById(R.id.tabLayout);
        viewPager=mView.findViewById(R.id.viewPager);
        tabLayout.addTab(tabLayout.newTab().setText("Add"),true);
        tabLayout.addTab(tabLayout.newTab().setText("Modify"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
    }
}
