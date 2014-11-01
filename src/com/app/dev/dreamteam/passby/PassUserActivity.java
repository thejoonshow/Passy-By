package com.app.dev.dreamteam.passby;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class PassUserActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_user);
		Intent intent = getIntent();
	}

}
