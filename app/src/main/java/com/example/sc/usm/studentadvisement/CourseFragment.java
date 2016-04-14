package com.example.sc.usm.studentadvisement;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class CourseFragment extends Fragment{
    private ListView mylistview;
    private String[] strListiew;


    public CourseFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootview= inflater.inflate(R.layout.fragment_course,container,false);

        mylistview= (ListView) rootview.findViewById(R.id.my_list_View);

        strListiew=getResources().getStringArray(R.array.stream_list);

        ArrayAdapter<String> objAdapter=new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_expandable_list_item_1,strListiew);
        mylistview.setAdapter(objAdapter);

        mylistview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity(),"clicked " + strListiew[position].toString(),Toast.LENGTH_SHORT).show();
            }
        });
        return rootview;

    }





}
