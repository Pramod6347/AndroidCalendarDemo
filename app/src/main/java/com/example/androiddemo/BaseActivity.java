package com.example.androiddemo;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.Toast;

public abstract class BaseActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.base_bottom);
		
		
		BroadcastReceiver broadcastReceiver = new BroadcastReceiver() {
			
			@Override
			public void onReceive(Context arg0, Intent arg1) {
				
				
				Toast.makeText(getApplicationContext(), "Broadcast",Toast.LENGTH_SHORT).show();
				// TODO Auto-generated method stub
				
			}
		};
		registerReceiver(broadcastReceiver, new IntentFilter("Hello"));
	}
	
	public abstract int getLayoutName();

}
