package com.example.sc.usm.studentadvisement;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class CourseFragment extends ListFragment{


    public CourseFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        ViewGroup rootview=(ViewGroup)inflater.inflate(R.layout.fragment_course, container, false);
        //return inflater.inflate(R.layout.fragment_course, container, false);
        String[] courses={"Computer Science","ITC"};
        //create adapter
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(getActivity(),R.layout.fragment_cs,R.id.txtitem,courses);
        //bind adapter to list fragment
        setListAdapter(adapter);
        //Reatin list fragment instance across  configuration changes
        setRetainInstance(true);
        return rootview;

    }
    //handling itemclick
    public void onListItemClick(ListView l, View view, int position, long id){
        ViewGroup viewGroup=(ViewGroup)view;
        TextView txt=(TextView)viewGroup.findViewById(R.id.txtitem);
        Toast.makeText(getActivity(),txt.getText().toString(), Toast.LENGTH_SHORT).show();
    }


}
