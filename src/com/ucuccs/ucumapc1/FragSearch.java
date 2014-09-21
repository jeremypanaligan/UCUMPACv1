package com.ucuccs.ucumapc1;

import java.util.ArrayList;
import java.util.HashMap;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class FragSearch extends Fragment {
	ListView lstData;
	String title = "Philosophy of Man";
	String author = "Terry Bogart";
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater
						.inflate(R.layout.searchfrag, container, false);	
		lstData = (ListView) rootView.findViewById(R.id.lstData);
		ArrayList<HashMap<String, String>> storestrings = new ArrayList<HashMap<String, String>>();
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put(title, "Philosophy of Man");
		map.put(author, "Terry Bogart");
		storestrings.add(map);
		storestrings.add(map);
		storestrings.add(map);
		storestrings.add(map);
		storestrings.add(map);
		storestrings.add(map);
		storestrings.add(map);
		storestrings.add(map);
		storestrings.add(map);
		storestrings.add(map);
		storestrings.add(map);
		storestrings.add(map);
		storestrings.add(map);
		storestrings.add(map);
		storestrings.add(map);
		ListAdapter adapter = new SimpleAdapter( rootView.getContext(), storestrings, R.layout.layout, new String[] { title, author }, new int[] {
		R.id.title, R.id.author });
		lstData.setAdapter(adapter);		
		return rootView;
		
	}
	
}