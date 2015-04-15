package edu.washington.apache78.activityspy;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;


public class GreetingsUW extends Activity {
    private static final String TAG = "GreetingsUW";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greetings_uw);
        Log.i(TAG, "onCreate event fired");
        if(savedInstanceState != null){
            Log.i(TAG, savedInstanceState.toString());
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "We're going down, Captain!");
        Log.i(TAG, "onDestroy event fired");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i(TAG, "onPause event fired");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i(TAG, "onResume event fired");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.i(TAG, "onStop event fired");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.i(TAG, "onStart event fired");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i(TAG, "onRestart event fired");
    }


}
