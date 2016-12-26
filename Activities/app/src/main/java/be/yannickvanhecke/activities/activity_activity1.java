package be.yannickvanhecke.activities;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import org.w3c.dom.Text;

import be.yannickvanhecke.activities.R;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class activity_activity1 extends AppCompatActivity
{
    // String for LogCat documentation
    private final static String TAG = "Activity_1";
    /**
     * TODO: Create counter variables for onCreate(), onRestart(), onStart() and onResume() etc which you increment with every method call
     */
    private int[] counters = {0, 0, 0, 0, 0, 0, 0};


    /**
     * TODO: Creëer variabelen voor de verschillende textviews
     */
    @BindView(R.id.txtoncreateactivityone)
    TextView txtOnCreate;
    @BindView(R.id.txtondestroyactivityone)
    TextView txtOnDestroy;
    @BindView(R.id.txtonpauseactivityone)
    TextView txtOnPause;
    @BindView(R.id.txtonrestartactivityone)
    TextView txtOnRestart;
    @BindView(R.id.txtonresumeactivityone)
    TextView txtOnResume;
    @BindView(R.id.txtonstartactivityone)
    TextView txtOnStart;
    @BindView(R.id.txtonstopactivityone)
    TextView txtOnStop;

    @BindView(R.id.btnStartActivityTwo)
    Button btnLaunchActivityTwo;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */

    @OnClick(R.id.btnStartActivityTwo)
    public void LaunchActivityTwo(){
        Intent intent = new Intent(this, activity_activity2.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity1);
        // TODO: Initialize textviews
        // Hint: findViewById()
        ButterKnife.bind(this);
        //TODO: Add a Onclicklistener to the button to start a new activity



        // TODO: Check saved state
        if (savedInstanceState != null) {
            // TODO: Recover counter values from saved state
            SharedPreferences sharedPreferences = this.getPreferences(MODE_PRIVATE);

            this.counters[R.integer.onCreatePosition] = sharedPreferences.getInt(getResources().getString(R.string.savedInstanceStateKeyOnCreateCounterActivityOne), 0);
            this.counters[R.integer.onDestroyPosition] = sharedPreferences.getInt(getResources().getString(R.string.savedInstanceStateKeyOnDestroyCounterActivityOne), 0);
            this.counters[R.integer.onPausePosition] = sharedPreferences.getInt(getResources().getString(R.string.savedInstanceStateKeyOnPauseCounterActivityOne), 0);
            this.counters[R.integer.onRestartPosition] = sharedPreferences.getInt(getResources().getString(R.string.savedInstanceStateKeyOnRestartCounterActivityOne),0);
            this.counters[R.integer.onResumePosition] = sharedPreferences.getInt(getResources().getString(R.string.savedInstanceStateKeyOnResumeCounterActivityOne),0);
            this.counters[R.integer.onStartPosition] = sharedPreferences.getInt(getResources().getString(R.string.savedInstanceStateKeyOnStartCounterActivityOne),0);
            this.counters[R.integer.onStopPosition] = sharedPreferences.getInt(getResources().getString(R.string.savedInstanceStateKeyOnStopCounterActivityOne),0);
        }
        // TODO: LogCat message
        Log.i("onCreateCounter", String.format("%d", this.counters[getResources().getInteger(R.integer.onCreatePosition)]));

        // TODO: Update count variable
        this.updateCounts(getResources().getInteger(R.integer.onCreatePosition));

        // TODO: Update user interface using the displayCounts() method
        this.displayCounts();
    }

    @Override
    public void onStart()
    {
        super.onStart();
        // TODO: LogCat message
        Log.i("onStartCounter", String.format("%d", this.counters[getResources().getInteger(R.integer.onStartPosition)]));
        // TODO: Update count variable
        
        this.updateCounts(getResources().getInteger(R.integer.onStartPosition));
        // TODO: Update the user interface
        this.displayCounts();
    }

    @Override
    public void onResume()
    {
        super.onResume();
        // TODO: LogCat message
        Log.i("onResumeCounter", String.format("%d", this.counters[getResources().getInteger(R.integer.onResumePosition)]));
        // TODO: Update the  count variable
        this.updateCounts(getResources().getInteger(R.integer.onResumePosition));
        // TODO: Update the user interface
        this.displayCounts();
    }

    @Override
    public void onPause()
    {
        super.onPause();
        // TODO: LogCat message
        Log.i("onPauseCounter", String.format("%d", this.counters[getResources().getInteger(R.integer.onPausePosition)]));
        // TODO: Update the  count variable
        this.updateCounts(getResources().getInteger(R.integer.onPausePosition));
        // TODO: Update the user interface
        this.displayCounts();
    }

    @Override
    public void onStop()
    {
        super.onStop();
        // TODO: LogCat message
        Log.i("onStopCounter", String.format("%d", this.counters[getResources().getInteger(R.integer.onStopPosition)]));
        // TODO: Update the  count variable
        this.updateCounts(getResources().getInteger(R.integer.onStopPosition));
        // TODO: Update the user interface
        this.displayCounts();
    }

    @Override
    public void onRestart()
    {
        super.onRestart();
        // TODO: LogCat message
        Log.i("onRestartCounter", String.format("%d", this.counters[getResources().getInteger(R.integer.onRestartPosition)]));
        // TODO: Update the  count variable
        this.updateCounts(getResources().getInteger(R.integer.onRestartPosition));
        // TODO: Update the user interface
        this.displayCounts();
    }

    @Override
    public void onDestroy()
    {
        super.onDestroy();
        // TODO: LogCat message
        Log.i("onDestroyCounter", String.format("%d", this.counters[getResources().getInteger(R.integer.onDestroyPosition)]));
        // TODO: Update the  count variable
        this.updateCounts(getResources().getInteger(R.integer.onDestroyPosition));
        // TODO: Update the user interface
        this.displayCounts();
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState)
    {
        // TODO:  Save the state using key-value pairs in the Bundle
        SharedPreferences sharedPreferences = getPreferences(MODE_PRIVATE);
        sharedPreferences.edit().putInt(getResources().getString(R.string.savedInstanceStateKeyOnCreateCounterActivityOne), this.counters[getResources().getInteger(R.integer.onCreatePosition)]);
        sharedPreferences.edit().putInt(getResources().getString(R.string.savedInstanceStateKeyOnStartCounterActivityOne), this.counters[getResources().getInteger(R.integer.onStartPosition)]);
        sharedPreferences.edit().putInt(getResources().getString(R.string.savedInstanceStateKeyOnPauseCounterActivityOne), this.counters[getResources().getInteger(R.integer.onPausePosition)]);
        sharedPreferences.edit().putInt(getResources().getString(R.string.savedInstanceStateKeyOnResumeCounterActivityOne), this.counters[getResources().getInteger(R.integer.onResumePosition)]);
        sharedPreferences.edit().putInt(getResources().getString(R.string.savedInstanceStateKeyOnStopCounterActivityOne), this.counters[getResources().getInteger(R.integer.onStopPosition)]);
        sharedPreferences.edit().putInt(getResources().getString(R.string.savedInstanceStateKeyOnRestartCounterActivityOne), this.counters[getResources().getInteger(R.integer.onRestartPosition)]);
        sharedPreferences.edit().putInt(getResources().getString(R.string.savedInstanceStateKeyOnDestroyCounterActivityOne), this.counters[getResources().getInteger(R.integer.onDestroyPosition)]);
        sharedPreferences.edit().commit();
        super.onSaveInstanceState(savedInstanceState);
    }

    // Updates the counters
    public void updateCounts(int position){
        this.counters[position]++;

    }

    // Updates de  counters
    public void displayCounts()
    {
        // TODO: show the countervariables in the interface
        txtOnCreate.setText(String.format("%s: %d", getResources().getString(R.string.onCreate), this.counters[getResources().getInteger(R.integer.onCreatePosition)]));
        txtOnDestroy.setText(String.format("%s: %d", getResources().getString(R.string.onDestroy), this.counters[getResources().getInteger(R.integer.onDestroyPosition)]));
        txtOnPause.setText(String.format("%s: %d", getResources().getString(R.string.onPause), this.counters[getResources().getInteger(R.integer.onPausePosition)]));
        txtOnResume.setText(String.format("%s: %d", getResources().getString(R.string.onResume), this.counters[getResources().getInteger(R.integer.onResumePosition)]));
        txtOnRestart.setText(String.format("%s: %d", getResources().getString(R.string.onRestart), this.counters[getResources().getInteger(R.integer.onRestartPosition)]));
        txtOnStart.setText(String.format("%s: %d", getResources().getString(R.string.onStart), this.counters[getResources().getInteger(R.integer.onStartPosition)]));
        txtOnStop.setText(String.format("%s, %d", getResources().getString(R.string.onStop), this.counters[getResources().getInteger(R.integer.onStopPosition)]));
    }

}
