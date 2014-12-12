package com.gdmec.demo_progressbar;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.ProgressBar;

public class MainActivity extends Activity {
	ProgressBar bar1,bar2,bar3,bar4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bar1=(ProgressBar) findViewById(R.id.progressBar1);
        bar2=(ProgressBar) findViewById(R.id.progressBar2);
        bar3=(ProgressBar) findViewById(R.id.progressBar3);
        bar4=(ProgressBar) findViewById(R.id.progressBar4);
        
        bar4.setMax(200);
        bar4.setProgress(10);
        bar4.setSecondaryProgress(100);
        
        bar1.setVisibility(View.VISIBLE);
        bar2.setVisibility(View.INVISIBLE);
        bar3.setVisibility(View.GONE);
    }

}
