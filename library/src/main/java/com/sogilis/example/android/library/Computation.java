package com.sogilis.example.android.library;

import android.app.IntentService;
import android.content.Intent;


public class Computation extends IntentService {

    public static final String RESULT_INTENT_ACTION = "action";
    public static final String RESULT_VALUE_INTENT_EXTRA_KEY = "result";

    public Computation() {
        super("Computation");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Intent resultIntent = new Intent(RESULT_INTENT_ACTION);
        Integer result = Integer.valueOf("100");
        resultIntent.putExtra(RESULT_VALUE_INTENT_EXTRA_KEY, result);
        sendBroadcast(resultIntent);
    }
}
