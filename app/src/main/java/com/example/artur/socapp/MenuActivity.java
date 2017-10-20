package com.example.artur.socapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {


    private Button mCameraButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        mCameraButton = (Button)findViewById(R.id.cameraButton);
    }

    public void onCameraButtonClick(View view){
        Intent intent = new Intent(MenuActivity.this, CameraActivity.class);
        startActivity(intent);
    }
}
