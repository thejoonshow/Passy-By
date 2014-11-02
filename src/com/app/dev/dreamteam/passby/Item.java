package com.app.dev.dreamteam.passby;

public class Item {
	private String imageURL;
	private String name;
	private String count;

	public Item(String imageURL, String name, String count) {
		this.setImageURL(imageURL);
		this.setName(name);
		this.setCount(count);
	}

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}

}
