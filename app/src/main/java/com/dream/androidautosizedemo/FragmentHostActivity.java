package com.dream.androidautosizedemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Administrator on 2018/9/14.
 */

public class FragmentHostActivity extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_host_fragment);

        getSupportFragmentManager().beginTransaction().add(R.id.container_1,new Fragment1()).commitAllowingStateLoss();
        getSupportFragmentManager().beginTransaction().add(R.id.container_2,new Fragment2()).commitAllowingStateLoss();
        getSupportFragmentManager().beginTransaction().add(R.id.container_3,new Fragment3()).commitAllowingStateLoss();
    }
}
