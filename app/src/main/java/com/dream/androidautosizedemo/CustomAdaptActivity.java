package com.dream.androidautosizedemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import me.jessyan.autosize.internal.CustomAdapt;

/**
 * Created by Administrator on 2018/9/14.
 */

public class CustomAdaptActivity extends AppCompatActivity implements CustomAdapt{


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapt_custom);
    }

    /**
     *
     * @return false按照高度适配 true按照宽度适配
     */
    @Override
    public boolean isBaseOnWidth() {
        return false;
    }

    @Override
    public float getSizeInDp() {
        return 667;
    }

    public void internal(View view){
        startActivity(new Intent(this,FragmentHostActivity.class));
    }
}
