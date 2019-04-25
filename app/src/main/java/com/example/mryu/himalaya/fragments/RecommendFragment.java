package com.example.mryu.himalaya.fragments;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mryu.himalaya.R;
import com.example.mryu.himalaya.base.BaseFragment;

/**
 * @ 项目名称：RecommendFragment
 * @ 包名：com.example.mryu.himalaya.fragments
 * @ 作者：王振宇
 * @ 创建时间：2019/4/20/20:04
 * @ 描述：
 **/
public class RecommendFragment extends BaseFragment {
    @Override
    protected View onSubViewLoaded(LayoutInflater layoutInflater, ViewGroup container) {
        View rootView = layoutInflater.inflate(R.layout.fragment_recommend,container,false);
        return rootView;
    }

}
