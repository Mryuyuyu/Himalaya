package com.example.mryu.himalaya.utils;

import com.example.mryu.himalaya.base.BaseFragment;
import com.example.mryu.himalaya.fragments.HistoryFragment;
import com.example.mryu.himalaya.fragments.RecommendFragment;
import com.example.mryu.himalaya.fragments.SubscriptionFragment;

import java.util.HashMap;
import java.util.Map;

/**
 * @ 项目名称：FragmentCreator
 * @ 包名：com.example.mryu.himalaya.utils
 * @ 作者：王振宇
 * @ 创建时间：2019/4/20/20:36
 * @ 描述：
 **/
public class FragmentCreator {
    public final static int INDEX_RECOMMEND = 0;
    public final static int INDEX_SUBSCRIPTION = 1;
    public final static int INDEX_HISTORY = 2;

    public final static int PAGE_COUNT = 3;

    private static Map<Integer,BaseFragment> sCache = new HashMap<>();

    public  static BaseFragment getFragment(int index){
        BaseFragment baseFragment = sCache.get(index);
        if (baseFragment != null) {
            return baseFragment;
        }
        switch (index){
            case INDEX_RECOMMEND:
                baseFragment = new RecommendFragment();
                break;
            case INDEX_SUBSCRIPTION:
                baseFragment = new SubscriptionFragment();
                break;
            case INDEX_HISTORY:
                baseFragment = new HistoryFragment();
                break;
        }
        sCache.put(index,baseFragment);
        return baseFragment;
    }

}
