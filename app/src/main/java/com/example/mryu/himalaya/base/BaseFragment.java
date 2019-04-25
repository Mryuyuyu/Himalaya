package com.example.mryu.himalaya.base;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * @ 项目名称：BaseFragment
 * @ 包名：com.example.mryu.himalaya.base
 * @ 作者：王振宇
 * @ 创建时间：2019/4/20/20:07
 * @ 描述：
 **/
public abstract class BaseFragment extends Fragment {

    private View mrootView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mrootView = onSubViewLoaded(inflater,container);
        return mrootView;
    }
    protected abstract View onSubViewLoaded(LayoutInflater layoutInflater, ViewGroup container);
}
