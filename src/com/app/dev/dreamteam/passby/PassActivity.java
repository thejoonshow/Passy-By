package com.app.dev.dreamteam.passby;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ListView;

public class PassActivity extends Activity {

	public static final String TAG = "PassActivity";

	private ItemAdapter adapter;
	private ArrayList<Item> items;
	private ListView listView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pass);
		items = new ArrayList<Item>();
		items.add(new Item("url1", "John Doe", "1"));
		items.add(new Item("url2", "Jane Doe", "4"));
		adapter = new ItemAdapter(this, items);
		listView = new ListView(this);

		listView.setAdapter(adapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.pass, menu);

		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		Intent intent;
		switch (item.getItemId()) {
		case R.id.user_item:
			intent = new Intent(PassActivity.this, PassUserActivity.class);
			startActivity(intent);
			return true;
		case R.id.login_item:
			intent = new Intent(PassActivity.this, PassLogActivity.class);
			startActivity(intent);
			return true;
		case R.id.info_item:
			return true;

		default:
			return super.onOptionsItemSelected(item);
		}
	}

	@Override
	public void onStart() {
		super.onStart();
		Log.d(TAG, "onStart() called");
	}

	@Override
	public void onPause() {
		super.onPause();
		Log.d(TAG, "onPause() called");
	}

	@Override
	public void onResume() {
		super.onResume();
		Log.d(TAG, "onResume() called");
	}

	@Override
	public void onStop() {
		super.onStop();
		Log.d(TAG, "onStop() called");
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
		Log.d(TAG, "onDestroy() called");
	}
}