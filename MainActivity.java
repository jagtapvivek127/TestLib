package com.example.myapplication;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

private int i;
private TextView tvMater;
private Button btnLogin;	

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();// TO initialize the views
	setOnCLickListeners();// To initailize the view onClickListerners		
    }


private void initialize(){
tvMaster = findViewById(R.id.tvMaster);
btnLogin = findViewById(R.id.btnLogin);
}

}
