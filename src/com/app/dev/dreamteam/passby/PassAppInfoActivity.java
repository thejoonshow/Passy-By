package com.app.dev.dreamteam.passby;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class PassAppInfoActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_appinfo);
		Intent intent = getIntent();
	}
}
