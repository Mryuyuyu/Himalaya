package com.example.mryu.himalaya.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.mryu.himalaya.utils.FragmentCreator;

/**
 * @ 项目名称：MainContentAdapter
 * @ 包名：com.example.mryu.himalaya.adapters
 * @ 作者：王振宇
 * @ 创建时间：2019/4/2/19:55
 * @ 描述：
 **/
public class MainContentAdapter extends FragmentPagerAdapter {
    public MainContentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return FragmentCreator.getFragment(position);
    }

    @Override
    public int getCount() {
        return FragmentCreator.PAGE_COUNT;
    }
}
