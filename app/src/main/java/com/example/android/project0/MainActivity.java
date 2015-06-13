package com.example.android.project0;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    Map<Integer, String> buttons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttons = new HashMap<>();

        buttons.put(R.id.btnSpotifyStreamer, getString(R.string.spotify_app_name));
        buttons.put(R.id.btnScores, getString(R.string.scores_app_name));
        buttons.put(R.id.btnLibrary, getString(R.string.library_app_name));
        buttons.put(R.id.btnBuildItBigger, getString(R.string.buildItBigger_app_name));
        buttons.put(R.id.btnXyzReader, getString(R.string.xyzReader_app_name));
        buttons.put(R.id.btnCapstone, getString(R.string.capstone_app_name));

        Set<Integer> keys = buttons.keySet();

        for(Integer i : keys) {
            TextView button;
            button = (TextView) findViewById(i);
            button.setOnClickListener(this);
        }

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

        CharSequence appName = getString(R.string.unknown_app_name);

        Integer button_id = buttonPressed.getId();

        if ( buttons.containsKey(button_id) ) {
            appName = (String) buttons.get(v.getId());
        }

        Context context = getApplicationContext();

        Resources res = getResources();
        String text = String.format(res.getString(R.string.toast_message), appName);

        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }
}
