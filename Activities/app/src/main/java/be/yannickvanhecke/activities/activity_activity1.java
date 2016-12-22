package be.yannickvanhecke.activities;
import android.app.Activity;
import android.content.Intent;
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

public class activity_activity1 extends AppCompatActivity
{
    // String for LogCat documentation
    private final static String TAG = "Activity_1";
    /**
     * TODO: Create counter variables for onCreate(), onRestart(), onStart() and onResume() etc which you increment with every method call
     */
    private int onCreateCounter = 0;
    private int onDestroyCounter = 0;
    private int onPauseCounter = 0;
    private int onRestartCounter = 0;
    private int onResumeCounter = 0;
    private int onStartCounter = 0;
    private int onStopCounter = 0;



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

    @BindView(R.id.btnLaunchActivityTwo)
    Button btnLaunchActivityTwo;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity1);
        // TODO: Initialize textviews
        // Hint: findViewById()
        ButterKnife.bind(this);
        //TODO: Add a Onclicklistener to the button to start a new activity
        final Intent intent = new Intent(this, activity_activity2.class);
        btnLaunchActivityTwo.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(intent);
            }
        });

        // TODO: Check saved state
        if (savedInstanceState != null) {
            // TODO: Recover counter values from saved state

        }
        // TODO: LogCat message
        // TODO: Update user interface using the displayCounts() method

    }

    @Override
    public void onStart()
    {
        super.onStart();
        // TODO: LogCat message
        // TODO: Update count variable
        // TODO: Update the user interface
    }

    @Override
    public void onResume()
    {
        super.onResume();
        // TODO: LogCat message
        // TODO: Update the  count variable
        // TODO: Update the user interface
    }

    @Override
    public void onPause()
    {
        super.onPause();
        // TODO: LogCat message
        // TODO: Update the  count variable
        // TODO: Update the user interface
    }

    @Override
    public void onStop()
    {
        super.onStop();
        // TODO: LogCat message
        // TODO: Update the  count variable
        // TODO: Update the user interface
    }

    @Override
    public void onRestart()
    {
        super.onRestart();
        // TODO: LogCat message
        // TODO: Update the  count variable
        // TODO: Update the user interface
    }

    @Override
    public void onDestroy()
    {
        super.onDestroy();
        // TODO: LogCat message
        // TODO: Update the  count variable
        // TODO: Update the user interface
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState)
    {
        // TODO:  Save the state  using key-value pairs in the Bundle
    }

    // Updates de  counters
    public void displayCounts()
    {
        // TODO: show the countervariables in the interface
    }

}
