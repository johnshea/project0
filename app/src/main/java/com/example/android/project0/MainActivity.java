package com.example.android.project0;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView btnCapstone;
        btnCapstone = (TextView) findViewById(R.id.btnCapstone);
        btnCapstone.setOnClickListener(this);

        TextView btnSpotifyStreamer;
        btnSpotifyStreamer = (TextView) findViewById(R.id.btnSpotifyStreamer);
        btnSpotifyStreamer.setOnClickListener(this);

        TextView btnScores;
        btnScores = (TextView) findViewById(R.id.btnScores);
        btnScores.setOnClickListener(this);

        TextView btnLibrary;
        btnLibrary = (TextView) findViewById(R.id.btnLibrary);
        btnLibrary.setOnClickListener(this);

        TextView btnBuildItBigger;
        btnBuildItBigger = (TextView) findViewById(R.id.btnBuildItBigger);
        btnBuildItBigger.setOnClickListener(this);

        TextView btnXyzReader;
        btnXyzReader = (TextView) findViewById(R.id.btnXyzReader);
        btnXyzReader.setOnClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        TextView buttonPressed = (TextView) v;

        CharSequence appName = "unknown";

        switch (buttonPressed.getId()) {
            case R.id.btnSpotifyStreamer:
                appName = "spotify streamer";
                break;
            case R.id.btnScores:
                appName = "scores";
                break;
            case R.id.btnLibrary:
                appName = "library";
                break;
            case R.id.btnBuildItBigger:
                appName = "build it bigger";
                break;
            case R.id.btnXyzReader:
                appName="xyz reader";
                break;
            case R.id.btnCapstone:
                appName = "capstone";
                break;
        }

        Context context = getApplicationContext();
        CharSequence text = "This button will launch my " + appName + " app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }
}
