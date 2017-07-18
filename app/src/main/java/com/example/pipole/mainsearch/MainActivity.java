package com.example.pipole.mainsearch;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

/**
 * Created by PIPOLE_VR19 on 2017/7/18.
 */

public class MainActivity extends Activity {

    Button TestButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        SetInit();
        SetEvent();
    }


    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if(hasFocus && Build.VERSION.SDK_INT >= 19)
        {
            View DecorView = getWindow().getDecorView();
            DecorView.setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                            | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                            | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                            | View.SYSTEM_UI_FLAG_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        }
    }

    private void SetInit() {
        TestButton = (Button) findViewById(R.id.test);
    }

    private void SetEvent()
    {
        TestButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //"pipole.com.drawAPP"
               // "pipole.drawcanvas"

                Intent intent = new Intent("android.intent.action.MAIN");
                intent.addCategory("pipole.drawcanvas");
                intent.putExtra("Email", "This is Email");
                startActivity(intent);
                finish();
            }
        });
    }

}
