package com.app.dev.dreamteam.passby;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

public class PassAppInfoActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_appinfo);
		Intent intent = getIntent();
		ActionBar actionBar = getActionBar();
	    actionBar.setDisplayHomeAsUpEnabled(true);
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		Intent intent;
		switch (item.getItemId()) {
		case R.id.home_item:
			intent = new Intent(PassAppInfoActivity.this, PassActivity.class);
			startActivity(intent);
			return true;
		case R.id.login_item:
			intent = new Intent(PassAppInfoActivity.this, PassLogActivity.class);
			startActivity(intent);
			return true;
		case R.id.user_item:
			intent = new Intent(PassAppInfoActivity.this, PassUserActivity.class);
			startActivity(intent);
			return true;

		default:
			return super.onOptionsItemSelected(item);
		}
	}
}
