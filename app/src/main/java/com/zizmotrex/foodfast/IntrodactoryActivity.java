package com.zizmotrex.foodfast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class IntrodactoryActivity extends AppCompatActivity {

    ImageView logo,splashImage;
    TextView appName;
    LottieAnimationView lottieAnimationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introdactory);

        logo = findViewById(R.id.logo);
        appName = findViewById(R.id.app_text);
        splashImage = findViewById(R.id.image);
        lottieAnimationView = findViewById(R.id.lottie_img);

        splashImage.animate().translationY(-2500).setDuration(1000).setStartDelay(4000);
        logo.animate().translationY(1800).setDuration(1000).setStartDelay(4000);
        appName.animate().translationY(1800).setDuration(1000).setStartDelay(4000);
        lottieAnimationView.animate().translationY(1800).setDuration(1000).setStartDelay(4000);


    }
}