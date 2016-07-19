package com.tridev.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.zip.Inflater;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {
    TextView fragName;
    TextView fragNo;
    TextView fragCompany;
    public BlankFragment() {
        // Required empty public constructor
    }


    public void getdetails(int position){
        int pos = position;
        ArrayList<Students.Student> studata = Students.getStudents();
        Students.Student this_stu ;
        this_stu=studata.get(pos);
        fragName.setText(this_stu.name);
        fragCompany.setText(String.valueOf(this_stu.company));
        fragNo.setText(String.valueOf(this_stu.sNo));
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view;
        view = inflater.inflate(R.layout.fragment_main, container,false);
        fragNo= (TextView)view.findViewById(R.id.nam);
        fragName = (TextView)view.findViewById(R.id.roll);
        fragCompany = (TextView)view.findViewById(R.id.mar);
        return view;
    }

}
