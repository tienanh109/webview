package com.tienanh109.webview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

	private LinearLayout linear2;
	private TextView textview1;
	private TextView textview3;
	private Button button2;
	private Button button3;
	private TextView textview2;

	private Intent open = new Intent();

	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
		initialize(_savedInstanceState);
		initializeLogic();
	}

	private void initialize(Bundle _savedInstanceState) {
		linear2 = findViewById(R.id.linear2);
		textview1 = findViewById(R.id.textview1);
		textview3 = findViewById(R.id.textview3);
		button2 = findViewById(R.id.button2);
		button3 = findViewById(R.id.button3);
		textview2 = findViewById(R.id.textview2);

		button2.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View _view) {
					open.setClass(getApplicationContext(), LocalActivity.class);
					startActivity(open);
				}
			});

		button3.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View _view) {
					open.setClass(getApplicationContext(), OnlineActivity.class);
					startActivity(open);
				}
			});
	}

	private void initializeLogic() {
		// Add your initialization logic here if needed
	}
}
