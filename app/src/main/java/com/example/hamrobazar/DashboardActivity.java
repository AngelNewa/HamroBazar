package com.example.hamrobazar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class DashboardActivity extends AppCompatActivity {
    ViewFlipper v_flipper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

      v_flipper = findViewById(R.id.v_flipper);
      int images [] = {R.drawable.bajajpulsar, R.drawable.marutiespresso,R.drawable.house};


      for (int image: images){
          flipperImages(image);
      }
    }

    public void flipperImages (int image){
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);

        v_flipper.addView(imageView);
        v_flipper.setFlipInterval(4000);
        v_flipper.setAutoStart(true);

        //animation
        v_flipper.setInAnimation(this, android.R.anim.slide_in_left);
        v_flipper.setOutAnimation(this, android.R.anim.slide_out_right);



    }
}
