package com.ucuccs.ucumapc1;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragAbout extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState)
		{
		View rootView = inflater
		
				.inflate(R.layout.fragabout, container, false);	
		return rootView;
	
		
		}
}
