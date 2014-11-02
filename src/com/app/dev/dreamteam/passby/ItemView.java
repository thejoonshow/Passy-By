package com.app.dev.dreamteam.passby;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class ItemView extends RelativeLayout {
	private TextView NameTextView;
	private TextView CountTextView;
	private ImageView ImageView;

	public ItemView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		LayoutInflater.from(context).inflate(R.layout.item_view_children, this,
				true);
		setupChildren();
	}

	private void setupChildren() {
		NameTextView = (TextView) findViewById(R.id.item_nameTextView);
		CountTextView = (TextView) findViewById(R.id.item_countTextView);
		ImageView = (ImageView) findViewById(R.id.item_imageView);
	}

	public void setItem(Item item) {
		NameTextView.setText(item.getName());
		CountTextView.setText(item.getCount());
		// TODO: set up image URL
	}

	public static ItemView inflate(ViewGroup parent) {
		ItemView itemView = (ItemView) LayoutInflater.from(parent.getContext())
				.inflate(R.layout.pass_listview, parent, false);
		return itemView;
	}
}
