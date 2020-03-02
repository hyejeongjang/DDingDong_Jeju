package com.cookandroid.jeju;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
    Button song, culture, map, diary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);

        song = (Button) findViewById(R.id.song);
        culture=(Button)findViewById(R.id.culture);
        map=(Button)findViewById(R.id.map);
        diary=(Button)findViewById(R.id.diary);

        song.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(SecondActivity.this, Song.class); //민요 페이지
                startActivity(intent);
                finish();
            }
        });
        culture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(SecondActivity.this, Culture.class); //문화 페이지
                startActivity(intent);
                finish();
            }
        });  
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(SecondActivity.this, GoogleMap.class); //지도 페이지
            }
        });
        diary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(SecondActivity.this, Diary.class); //다이어리 페이지
                startActivity(intent);
                finish();
            }
        });
    }

}
