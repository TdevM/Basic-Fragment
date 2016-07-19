package com.tridev.fragments;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Students.Student> StudentList;
    ListView myList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final BlankFragment frg_one = new BlankFragment();

        final FragmentManager frg_mgr = getSupportFragmentManager();

        final FragmentTransaction frg_txn = frg_mgr.beginTransaction();
        frg_txn.add(R.id.tv_frame, frg_one, null);
        frg_txn.commit();



        StudentList = Students.getStudents();
        myList = (ListView) findViewById(R.id.tv_list);

        StudentAdapter studentAdapter = new StudentAdapter(StudentList);
        myList.setAdapter(studentAdapter);

        myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                frg_one.getdetails(position);

            }
        });

    }



    private class StudentAdapter extends BaseAdapter {
        private class ViewHolder {
            ImageView image;
        }

        public ArrayList<Students.Student> mstudents;

        public StudentAdapter(ArrayList<Students.Student> mstudents) {
            this.mstudents = mstudents;
        }

        @Override
        public int getCount() {
            return mstudents.size();
        }

        @Override
        public Students.Student getItem(int position) {
            return mstudents.get(position);
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            LayoutInflater li = getLayoutInflater();
            ViewHolder viewHolder;
            if (convertView == null) {
                convertView = li.inflate(R.layout.image_list, null);


                viewHolder = new ViewHolder();
                viewHolder.image = (ImageView) convertView.findViewById(R.id.tvImage);
                convertView.setTag(viewHolder);
            } else {
                viewHolder = (ViewHolder) convertView.getTag();

            }

            Students.Student thisStudent = getItem(position);
            viewHolder.image.setImageResource(thisStudent.image_id);
            return convertView;
        }
    }
}


