package com.example.animationsinandroid;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //class declarations
    private TextView tvHelloWorld;
    private TextView tvHiWorld;
    private ImageView ivLion;
    private ImageView ivLeopard;
    private boolean isHelloWorldShowing; //boolean defaults to false

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialize our views
        tvHelloWorld = findViewById(R.id.tvHelloWorld);
        tvHiWorld = findViewById(R.id.tvHiWorld);
        ivLion = findViewById(R.id.ivLion);
        ivLeopard = findViewById(R.id.ivLeopard);

        tvHelloWorld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


/*
              //  Log.i("MyTag", "Hello World!!");
                tvHelloWorld.animate().alpha(0).setDuration(3000); //1000 = 1 sec
                //scaleX, alpha (which has to be between 0 and 1) are other commonly used instead or with rotation
                //i.e. tvHelloWorld.animate.scaleX
                tvHiWorld.animate().alpha(1).setDuration(3000); //1000 = 1 sec
*/
                if (isHelloWorldShowing){

                    tvHelloWorld.animate().alpha(0).setDuration(3000); //1000 = 1 sec
                    tvHiWorld.animate().alpha(1).setDuration(3000); //1000 = 1 sec
                    isHelloWorldShowing = false;//assigns false so it's always at the beginning
                    }
                    else if (!isHelloWorldShowing)
                    {
                    tvHelloWorld.animate().alpha(1).setDuration(3000); //1000 = 1 sec
                    tvHiWorld.animate().alpha(0).setDuration(3000); //1000 = 1 sec
                    isHelloWorldShowing = true;
                }
            }
        });

        ivLion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ivLion.animate().translationX(3000).setDuration(2000);
                ivLion.animate().translationX(-3000).setDuration(2000);
            }
        });
    }
}
