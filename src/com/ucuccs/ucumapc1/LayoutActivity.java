package com.ucuccs.ucumapc1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Toast;

public class LayoutActivity extends Activity {
	ImageView favnot, favselect;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout);
		favnot = (ImageView) findViewById (R.id.favnot);
		favselect = (ImageView) findViewById (R.id.favselected);

		favnot.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View view) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), "LALALAALA", Toast.LENGTH_LONG).show();
			}
		});
		
	}
}
