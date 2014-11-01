package com.app.dev.dreamteam.passby;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

public class PassUserActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_user);
		Intent intent = getIntent();
	}
	
	public boolean onOpionsItemSelected(MenuItem item){
		switch (item.getItemId()){
			case R.id.home_item:
				Intent intent = new Intent( PassUserActivity.this, PassActivity.class);
				startActivity(intent);
				return true;
			case R.id.login_item:
				return true;
			case R.id.info_item:
				return true;
				
			default:
				return super.onOptionsItemSelected(item);
		}
	}
}
