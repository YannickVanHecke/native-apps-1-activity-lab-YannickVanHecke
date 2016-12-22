package be.yannickvanhecke.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class activity_activity1 extends AppCompatActivity
{

    @BindView(R.id.bLaunchActivityTwo)
    Button btnLaunchActivityTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity1);
        ButterKnife.bind(this);
    }
    @OnClick(R.id.bLaunchActivityTwo)
    public void startActivityTwo(){
        Intent intent = new Intent(this, activity_activity2.class);
        startActivity(intent);
    }

}
