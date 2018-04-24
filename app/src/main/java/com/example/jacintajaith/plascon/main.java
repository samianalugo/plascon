package com.example.jacintajaith.plascon;

import android.app.FragmentManager;
import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class main extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    FragmentManager fragmentManager = getFragmentManager();
    android.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
    Configuration configInfo = getResources().getConfiguration();

        if (configInfo.orientation == Configuration.ORIENTATION_LANDSCAPE) {
        FragmentLandscape fragmentLandscape = new FragmentLandscape();
        fragmentTransaction.replace(android.R.id.content, fragmentLandscape);
        // setContentView(R.layout.activity_main2);
    }
        else{
        FragmentPortrait fragmentPortrait = new FragmentPortrait();
    }
        fragmentTransaction.commit();


}

}