package com.example.seungkyu.dreamtodream;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by junyepoh on 2016. 12. 12..
 */

public class CharityRanking extends FragmentActivity {
    TextView todaySleepTime, totalCharityDay, myRank;
    Button nextPage;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        if (Build.VERSION.SDK_INT >= 21) {   //상태바 색
            getWindow().setStatusBarColor(Color.parseColor("#FF48D1CC"));
        }
        setContentView(R.layout.activity_charity_ranking_page);

        Intent intent = getIntent();
        todaySleepTime = (TextView)findViewById(R.id.today_sleep_time);
        todaySleepTime.setText(intent.getExtras().getString("curSleepTime"));

        totalCharityDay = (TextView)findViewById(R.id.total_charity_text);
        totalCharityDay.setText("17");

        myRank = (TextView)findViewById(R.id.my_ranking_text);
        myRank.setText("3");

        nextPage = (Button) findViewById(R.id.nextPage);
        nextPage.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0){
                Intent intent =  new Intent(getApplicationContext(),CompanyList.class);
                startActivity(intent);

            }
        });

    }
}
