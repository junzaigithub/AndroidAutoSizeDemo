package com.dream.androidautosizedemo;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import me.jessyan.autosize.AutoSize;
import me.jessyan.autosize.AutoSizeConfig;
import me.jessyan.autosize.internal.CustomAdapt;
import me.jessyan.autosize.utils.AutoSizeUtils;

/**
 * Created by Administrator on 2018/9/14.
 */

public class Fragment3 extends Fragment implements CustomAdapt{


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        AutoSize.autoConvertDensity(getActivity(),360,true);
        return createTextView(inflater,"屏幕尺寸360,我自身的尺寸360", Color.BLUE);
    }

    @Override
    public boolean isBaseOnWidth() {
        return true;
    }

    @Override
    public float getSizeInDp() {
        return 360;
    }


    public static View createTextView(LayoutInflater inflater, String content, int backgroundColor) {
        TextView view = new TextView(inflater.getContext());
        ViewGroup.LayoutParams layoutParams =
                new ViewGroup.LayoutParams((AutoSizeUtils.dp2px(inflater.getContext(), 360)),
                        ViewGroup.LayoutParams.MATCH_PARENT);
        view.setLayoutParams(layoutParams);
        view.setText(content);
        view.setTextColor(0xffffffff);
        view.setGravity(Gravity.CENTER);
        view.setTextSize(30);
        view.setBackgroundColor(backgroundColor);
        return view;
    }
}
