package com.zizmotrex.foodfast.login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.TableLayout;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;
import com.zizmotrex.foodfast.R;

public class LoginActivity extends AppCompatActivity {

    TabLayout tableLayout;
    ViewPager viewPager;
    FloatingActionButton ggl, fb, twitter;
    float v = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        tableLayout = findViewById(R.id.tab_layout);
        viewPager = findViewById(R.id.view_pager);
        ggl = findViewById(R.id.fab_google);
        fb = findViewById(R.id.fab_facebook);
        twitter = findViewById(R.id.fab_twitter);

        tableLayout.addTab(tableLayout.newTab().setText("Login"));
        tableLayout.addTab(tableLayout.newTab().setText("Sign up"));
        tableLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final LoginAdapter loginAdapter = new LoginAdapter(getSupportFragmentManager(), this, tableLayout.getTabCount());
        viewPager.setAdapter(loginAdapter);

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tableLayout));


        fb.setTranslationY(300);
        ggl.setTranslationY(300);
        twitter.setTranslationY(300);
      //  tableLayout.setTranslationY(300);


        fb.setAlpha(v);
        ggl.setAlpha(v);
        twitter.setAlpha(v);
      //  tableLayout.setAlpha(v);


        fb.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(400).start();
        ggl.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(600).start();
        twitter.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(800).start();
        //tableLayout.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(100).start();




    }
}