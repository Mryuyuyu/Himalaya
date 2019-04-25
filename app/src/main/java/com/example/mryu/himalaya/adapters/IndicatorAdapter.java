package com.example.mryu.himalaya.adapters;

import android.content.Context;
import android.graphics.Color;
import android.view.View;

import com.example.mryu.himalaya.R;

import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.CommonNavigatorAdapter;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerTitleView;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.indicators.LinePagerIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.ColorTransitionPagerTitleView;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.SimplePagerTitleView;

/**
 * @ 项目名称：IndicatorAdapter
 * @ 包名：com.example.mryu.himalaya.adapters
 * @ 作者：王振宇
 * @ 创建时间：2019/3/27/21:22
 * @ 描述：
 **/
public class IndicatorAdapter extends CommonNavigatorAdapter {

    private final String[] mtitles;
    private OnIndicatorTapClickListener mOnTapClickListener;

    public IndicatorAdapter(Context context){
        mtitles = context.getResources().getStringArray(R.array.indicator_title);

    }
    @Override
    public int getCount() {
        if (mtitles != null) {
            return mtitles.length;
        }
        return 0;
    }

    @Override
    public IPagerTitleView getTitleView(Context context, final int index) {
        //创建view
        ColorTransitionPagerTitleView colorTransitionPagerTitleView=new ColorTransitionPagerTitleView(context);
        //设置一般情况下的颜色为灰创
        colorTransitionPagerTitleView.setNormalColor(Color.parseColor("#aaffffff"));
        //设置选中情况下的颜色为黑色
        colorTransitionPagerTitleView.setSelectedColor(Color.parseColor("#ffffff"));
        //单位sp
        colorTransitionPagerTitleView.setText(mtitles[index]);
        //设置title的点击事件，这里的话，如果点击了title，那么就选中下面的viewPager到对应的index里面去
        //也就是说，当我们点击了title的时候，下面的viewPager会对应着index进行切换内容。
        colorTransitionPagerTitleView.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View view){
        //切换viewPager的内容，如果index不一样的话。
            if (mOnTapClickListener != null) {
                mOnTapClickListener.onTapClick(index);
            }
            }
        });
        return colorTransitionPagerTitleView;
    }

    @Override
    public IPagerIndicator getIndicator(Context context) {
        LinePagerIndicator linePagerIndicator = new LinePagerIndicator(context);
        linePagerIndicator.setMode(LinePagerIndicator.MODE_WRAP_CONTENT);
        linePagerIndicator.setColors(Color.parseColor("#ffffff"));
        return linePagerIndicator;
    }

    public void setOnIndicatorTapClickListener(OnIndicatorTapClickListener listener){
        this.mOnTapClickListener = listener;
    }

    public interface OnIndicatorTapClickListener{
        void onTapClick(int index);
    }
}
