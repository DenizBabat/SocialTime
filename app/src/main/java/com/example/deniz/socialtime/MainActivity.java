package com.example.deniz.socialtime;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mPlayer;
    boolean flag=true;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button git = (Button)findViewById(R.id.play_git);
        Button face = (Button)findViewById(R.id.play_face);
        Button ins = (Button)findViewById(R.id.play_ins);
        Button twit = (Button)findViewById(R.id.play_twit);
        Button link = (Button)findViewById(R.id.play_link);
        Button  snap = (Button)findViewById(R.id.play_snap);


        playSound();
        animateButton(git);
        animateButton(face);
        animateButton(ins);
        animateButton(twit);
        animateButton(link);
        animateButton(snap);
        playSound();

    }


    void animateButton(Button btt) {
        // Load the animation

        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);
        double animationDuration = getDurationValue() * 1000;
        myAnim.setDuration((long)animationDuration);

        // Use custom animation interpolator to achieve the bounce effect
        MyBounceInterpolator interpolator = new MyBounceInterpolator(getAmplitudeValue(), getFrequencyValue());

        myAnim.setInterpolator(interpolator);

        // Animate the button,

        btt.startAnimation(myAnim);



        // Run button animation again after it finished
        myAnim.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation arg0) {
            }

            @Override
            public void onAnimationRepeat(Animation arg0) {
            }

            @Override
            public void onAnimationEnd(Animation arg0) {

            }
        });

    }

    void playSound() {
        if (mPlayer != null) {
            mPlayer.stop();
            mPlayer.reset();
        }

        mPlayer = MediaPlayer.create(MainActivity.this, R.raw.bubble);
        mPlayer.start();
    }

    double getDurationValue() {
        return 5;
    }
    double getAmplitudeValue() {
        return 0.5;
    }

    double getFrequencyValue() {

        return 20;
    }

    public void gitButton(View view) {
        playSound();
        Intent s = new Intent(getApplicationContext(), Github.class);
        startActivity(s);
    }
    public void insButton(View view) {
        playSound();
        Intent s = new Intent(getApplicationContext(), Instagram.class);
        startActivity(s);
    }

    public void twitButton(View view) {
        playSound();
        Intent s = new Intent(getApplicationContext(), Twitter.class);
        startActivity(s);
    }
    public void linkButton(View view) {
        playSound();
        Intent s = new Intent(getApplicationContext(), Linkedin.class);
        startActivity(s);
    }
    public void faceButton(View view) {
        playSound();
        Intent s = new Intent(getApplicationContext(), Facebook.class);
        startActivity(s);
    }

    public void snapButton(View view) {
        playSound();
        Intent s = new Intent(getApplicationContext(), Snapchat.class);
        startActivity(s);
    }
}
