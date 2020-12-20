package com.zizmotrex.foodfast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class IntrodactoryActivity extends AppCompatActivity {

    ImageView logo,splashImage;
    TextView appName;
    LottieAnimationView lottieAnimationView;

    private static final int NUM_PAGES = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introdactory);

        logo = findViewById(R.id.logo);
        appName = findViewById(R.id.app_text);
        splashImage = findViewById(R.id.image);
        lottieAnimationView = findViewById(R.id.lottie_img);

        ViewPager viewPager = findViewById(R.id.pager);
        ScreenSlidePagerAdapter pagerAdapter = new ScreenSlidePagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(pagerAdapter);

        splashImage.animate().translationY(-2500).setDuration(1000).setStartDelay(4000);
        logo.animate().translationY(1800).setDuration(1000).setStartDelay(4000);
        appName.animate().translationY(1800).setDuration(1000).setStartDelay(4000);
        lottieAnimationView.animate().translationY(1800).setDuration(1000).setStartDelay(4000);

    }

    private static class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {


        public ScreenSlidePagerAdapter(@NonNull FragmentManager fm) {
            super(fm);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0:
                    return new OnBoarding_1Fragment();
                case 1:
                    return new OnBoarding_2Fragment();
                case 2:
                    return new OnBoarding_3Fragment();
            }
            return null;
        }

        @Override
        public int getCount() {
            return NUM_PAGES;
        }
    }
}