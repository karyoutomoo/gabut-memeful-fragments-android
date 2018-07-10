package com.itsjustfaiq.rectanglefragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentHome extends Fragment {

    private ArrayAdapter mAdapter;
    private ListView listViewContact;
    private ArrayList mArrayListContact;

    public FragmentHome() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment_home, container, false);
        mArrayListContact = new ArrayList();
        listViewContact = view.findViewById(R.id.lvContact);

        addData();

        mAdapter = new ArrayAdapter(FragmentHome.this.getContext(),android.R.layout.simple_list_item_1, mArrayListContact);
        listViewContact.setAdapter(mAdapter);
        listViewContact.setOnItemClickListener(myListClickListener);
        return view;
    }

    private void addData(){
        mArrayListContact.add("Superman");
        mArrayListContact.add("Batman");
        mArrayListContact.add("Wonder Woman");
        mArrayListContact.add("The Flash");
        mArrayListContact.add("Green Lantern");
        mArrayListContact.add("Aquaman");
        mArrayListContact.add("Cyborg");
        mArrayListContact.add("Green Arrow");
        mArrayListContact.add("Hawkman");
        mArrayListContact.add("Nightwing");
        mArrayListContact.add("Supergirl");
        mArrayListContact.add("Kid Flash");
        mArrayListContact.add("Constantine");
        mArrayListContact.add("Robin");
        mArrayListContact.add("J'onn Jonzz");
        mArrayListContact.add("Hawkgirl");

    }

    private AdapterView.OnItemClickListener myListClickListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView adapterView, View view, int i, long l) {
            String info = ((TextView) view).getText().toString();
            Log.d("FragmentHome", "text : " + info);

            Intent intent = new Intent(FragmentHome.this.getContext(), NameActivity.class);
            intent.putExtra("DISPLAY NAMA", info);
            startActivity(intent);
        }
    };
}
