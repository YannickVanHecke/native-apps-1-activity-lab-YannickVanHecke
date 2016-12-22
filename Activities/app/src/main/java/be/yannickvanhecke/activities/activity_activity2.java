package be.yannickvanhecke.activities;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import be.yannickvanhecke.activities.R;
import butterknife.BindView;
import butterknife.ButterKnife;

public class activity_activity2 extends Activity {
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
    @BindView(R.id.txtoncreateactivitytwo)
    TextView txtOnCreate;
    @BindView(R.id.txtondestroyactivitytwo)
    TextView txtOnDestroy;
    @BindView(R.id.txtonpauseactivitytwo)
    TextView txtOnPause;
    @BindView(R.id.txtonrestartactivitytwo)
    TextView txtOnRestart;
    @BindView(R.id.txtonresumeactivitytwo)
    TextView txtOnResume;
    @BindView(R.id.txtonstartactivitytwo)
    TextView txtOnStart;
    @BindView(R.id.txtonstopactivitytwo)
    TextView txtOnStop;

    @BindView(R.id.btnCloseActivity)
    Button btnCloseActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2);
        // TODO: Initialize textviews
        // Hint: findViewById()
        ButterKnife.bind(this);
        //TODO: Add a Onclicklistener to the button to start a new activity
        final Intent intent = new Intent(this, activity_activity1.class);
        btnCloseActivity.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                finish();
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
    public void onStart() {
        super.onStart();
        // TODO: LogCat message
        // TODO: Update count variable
        // TODO: Update the user interface
    }
    @Override
    public void onResume() {
        super.onResume();
        // TODO: LogCat message
        // TODO: Update the  count variable
        // TODO: Update the user interface
    }
    @Override
    public void onPause() {
        super.onPause();
        // TODO: LogCat message
        // TODO: Update the  count variable
        // TODO: Update the user interface
    }
    @Override
    public void onStop() {
        super.onStop();
        // TODO: LogCat message
        // TODO: Update the  count variable
        // TODO: Update the user interface
    }
    @Override
    public void onRestart() {
        super.onRestart();
        // TODO: LogCat message
        // TODO: Update the  count variable
        // TODO: Update the user interface
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        // TODO: LogCat message
        // TODO: Update the  count variable
        // TODO: Update the user interface
    }
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        // TODO:  Save the state  using key-value pairs in the Bundle
    }

    // Updates the counters
    public void updateCounts(int position){

    }
    // Updates de  counters
    public void displayCounts() {
        // TODO: show the countervariables in the interface
    }
}
