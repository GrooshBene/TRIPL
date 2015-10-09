package com.edcan.grooshbene.tripl;

import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TabHost;

/**
 * Created by GrooshBene on 15. 10. 9..
 */
public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabHost tabhost = getTabHost();
        TabHost.TabSpec spec;
        Intent intent;
        intent = new Intent().setClass(this, Activity1.class);
        spec = tabhost.newTabSpec("1");
        spec.setIndicator("1");
        spec.setContent(intent);
        tabhost.addTab(spec);
        intent = new Intent().setClass(this,Activity2.class);
        spec = tabhost.newTabSpec("2");
        spec.setIndicator("2");
        spec.setContent(intent);
        tabhost.addTab(spec);
        intent = new Intent().setClass(this,Activity3.class);
        spec = tabhost.newTabSpec("3");
        spec.setIndicator("3");
        spec.setContent(intent);
        tabhost.addTab(spec);
        tabhost.setCurrentTab(0);


    }
}
