package com.example.sc.usm.studentadvisement;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.ListFragment;
import android.support.v4.widget.SimpleCursorAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class FacultyFragment extends ListFragment {
    String[] faculty_list={"Adams,Todd",
            "Ali, Dr.Dia",
            "Banerjee,Dr.Bikramjit",
            "Chen, Dr.Kuo",
            "Clark, Dr.James",
            "Dawoud, Dr.Amer",
            "Garcia, Mr.Dan",
            "Graves, Mr.Jermy",
            "Hawkins, Dr.Rick",
            "Heath, Dr.John",
            "Koh, Dr.Wonryull",
            "McCarthy, Dr.Sean",
            "Murali, Dr.Beddhu",
            "Rahaim, Mr.Tony",
            "Rishel, Mr.Tom",
            "Robinson, Ms.Kelly",
            "Sun, Dr.Jonathan",
            "Sung, Dr.Andrew",
          "Vital, Mr.Dennis",
            "Wang, Dr.Nan",
            "Wang, Dr.Zheng",
            "Xu, Dr.Kebin",
            "Zhang, Dr.Joe",
            "Zhou, Dr.Zhaoxian",
           "Davis, Mr.Penny",
            "Sherry, Mrs.Smith"
    };


    int[] faculty_images ={R.drawable.toddadams,
    R.drawable.diaali,
            R.drawable.bikramjitbanerjee,
                    R.drawable.kuochen,
                    R.drawable.jameslclark,
                    R.drawable.amerdawoud,
                    R.drawable.danielpgarcia,
                    R.drawable.jeremygraves,
                    R.drawable.rickhawkins,
                    R.drawable.johnhheath,
                    R.drawable.wonryullkoh,
            R.drawable.sean,
                    R.drawable.beddhumurali,
            R.drawable.rahaim,
            R.drawable.tom_rishel,
                    R.drawable.kellyrobinson,
            R.drawable.jonathansun,
            R.drawable.andrewhsung,
          R.drawable.vital,
            R.drawable.nanwang,
            R.drawable.zhengwang,
            R.drawable.kebinxu,
            R.drawable.chaoyangjoezhang,
            R.drawable.zhaoxianzhou,
            R.drawable.penny,
            R.drawable.sherrysmith

    };

    ArrayList<HashMap<String,String>> data;
    SimpleAdapter simpleAdapter;



    public FacultyFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        HashMap<String,String> map=new HashMap<String,String>();

        for (int i=0;i<faculty_list.length ; i++)
        {
            map=new HashMap<String,String>();
            map.put("faculty_list",faculty_list[i]);
            map.put("faculty_images",Integer.toString(faculty_images[i]));
            data.add(map);

        }
        String[] from={"name","image"};
        int[] to={R.id.faculty_name,R.id.faculty_image};
        simpleAdapter=new SimpleAdapter(getActivity(),data,R.layout.faculty_list,from,to);
        setListAdapter(simpleAdapter);



        return super.onCreateView(inflater, container, savedInstanceState);


    }


    @Override
    public void onStart() {
        super.onStart();

        getListView().setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity(),data.get(position).get("name"),Toast.LENGTH_SHORT).show();

            }

           // FragmentTransaction fragmentTransaction= getActivity().getSupportFragmentManager().beginTransaction();
           // fragmentTransaction.replace(R.id.fragment_container, fragment);
            //fragmentTransaction.commit();
        });

    }


}
