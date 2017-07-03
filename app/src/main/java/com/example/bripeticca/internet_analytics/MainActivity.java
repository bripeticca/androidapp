package com.example.bripeticca.internet_analytics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    /*WifiManager wifiManager = (WifiManager) getActivity().
            getSystemService(Context.WIFI_SERVICE);*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = (Button) findViewById(R.id.firstButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("firstButton", "the button has been clicked");

            }
        });
    }

}