package com.mbxk.custombottomnavigation;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<AHBottomNavigationItem> bottomNavigationItems = new ArrayList<>();
    private AHBottomNavigation bottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        bottomNavigation = (AHBottomNavigation) findViewById(R.id.bottom_navigation);
        AHBottomNavigationItem item1 = new AHBottomNavigationItem("首页", R.drawable.ic_selector_selectable_home_index, R.color.red);
        AHBottomNavigationItem item2 = new AHBottomNavigationItem("首页", R.drawable.ic_selector_selectable_home_index, R.color.red);
        AHBottomNavigationItem item3 = new AHBottomNavigationItem("首页", R.drawable.ic_selector_selectable_home_index, R.color.red);
        AHBottomNavigationItem item4 = new AHBottomNavigationItem("首页", R.drawable.ic_selector_selectable_home_index, R.color.red);

        bottomNavigationItems.add(item1);
        bottomNavigationItems.add(item2);
        bottomNavigationItems.add(item3);
        bottomNavigationItems.add(item4);
        bottomNavigation.addItems(bottomNavigationItems);



        bottomNavigation.setTitleState(AHBottomNavigation.TitleState.ALWAYS_SHOW);
        bottomNavigation.setTranslucentNavigationEnabled(true);
        // Disable the translation inside the CoordinatorLayout
        bottomNavigation.setBehaviorTranslationEnabled(false);
        bottomNavigation.setOnTabSelectedListener(new AHBottomNavigation.OnTabSelectedListener() {
            @Override
            public boolean onTabSelected(int position, boolean wasSelected) {
                return true;
            }
        });
    }
}
