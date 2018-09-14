package com.dream.androidautosizedemo;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import me.jessyan.autosize.AutoSize;
import me.jessyan.autosize.internal.CustomAdapt;

/**
 * Created by Administrator on 2018/9/14.
 */

public class Fragment1 extends Fragment implements CustomAdapt{


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        AutoSize.autoConvertDensity(getActivity(),1080,true);
        return Fragment3.createTextView(inflater,"屏幕尺寸1080,我自身的尺寸360", Color.RED);
    }

    @Override
    public boolean isBaseOnWidth() {
        return true;
    }

    @Override
    public float getSizeInDp() {
        return 1080;
    }
}
