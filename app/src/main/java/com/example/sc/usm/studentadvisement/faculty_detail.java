package com.example.sc.usm.studentadvisement;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class faculty_detail extends Fragment {


    String[] faculty_list = {"Adams,Todd",
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


    int[] faculty_images = {R.drawable.toddadams,
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
            R.drawable.tomrishel,
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

    String[] faculty_phone_number_list = {
            "601 - 266 - 6413",
            "601 - 266 - 6513",
            "601 - 266 - 6287",
            "601 - 266 - 5952",
            "601 - 266 - 5628",
            "601 - 266 - 4118",
            "601 - 266 - 6291",
            "601 - 266 - 4890",
            "601 - 266 - 4900",
            "601 - 266 - 4496",
            "601 - 266 - 4366",
            "601 - 266 - 5253",
            "601 - 266 - 4312",
            "601 - 266 - 5531",
            "601 - 266 - 3283",
            "601 - 266 - 6107",
            "601 - 266 - 5902",
            "601 - 266 - 6927",
            "601 - 266 - 6831",
            "601 - 266 - 6286",
            "601 - 266 - 4864",
            "601 - 266 - 4961",
            "601 - 266 - 4949",
            "601 - 266 - 4482",
            "601 - 266 - 4784",
            "601 - 266 - 5712",


    };

    String[] faculty_email_list = {
            "Stephen.Adams@usm.edu",
            "Dia.Ali@usm.edu",
            "Bikramjit.Banerjee@usm.edu",
            "Kuo.Chen@usm.edu",
            "James.L.Clark@usm.edu",
            "Amer.Dawoud@usm.edu",
            "Daniel.Garcia@usm.edu",
            "J.Graves@usm.edu",
            "Ricky.Hawkins@sm.edu",
            "John.Heath@usm.edu",
            "Wonryull.Koh@usm.edu",
            "Sean.McCarthy@usm.edu",
            "Beddhu.Murali@usm.edu",
            "John.Rahaim@usm.edu",
            "Tom.Rishel@usm.edu",
            "Kelly.robinson@usm.edu",
            "jonathan.Sun@usm.edu",
            "Andrew.Sung@usm.edu",
            "Dennis.Vital@usm.edu",
            "Nan.wang@usm.edu",
            "Zheng.Wang@usm.edu",
            "Kebin.xu@usm.edu",
            "Chaoyang.Zhang@usm.edu",
            "Zhaoxian.Zhou@usm.edu",
            "Olivia.E.Davis@usm.edu",
            "Sherry.Smith@usm.edu"

    };

    String[] hours_mon_list = {
            "10:00 AM - 11:00 AM",
            "12:00 PM - 1:30 PM",
            "11:00 AM - 12:00 PM",
            "1:15 PM - 5:15 PM",
            "2:00 PM - 4:00 PM",
            "2:00 PM - 3:00 PM",
            "11:00 AM - 12:00 PM",
            "1:00 PM - 2:00 PM",
            "1:00 PM - 2:00 PM",
            "1:00 PM - 3:00 PM",
            "-",
            "ONLINE",
            "11:00 AM - 1:00 PM",
            "10:00 AM - 11:00 AM",
            "3:30 PM - 5:00 PM",
            "4:15 PM - 5:00 PM, 6:15 PM - 6:30 PM",
            "9:00 AM - 10:00 AM",
            "11:00 AM - 1:00 PM",
            "-",
            "10:00 AM - 11:30 AM",
            "-",
            "9:00 AM - 2:00 PM",
            "-",
            "8:00 AM - 12:00 PM",
            "8:00 AM - 5:00 PM",
            "8:00 AM - 5:00 PM"

    };
    String[] hours_tue_list = {
            "1:30 PM - 3:00 PM",
            "12:00 PM - 1:00 PM",
            "1:00 PM - 2:30 PM",
            "-",
            "-",
            "12:00 PM - 1:00 PM",
            "10:00 AM - 11:00 AM",
            "9:00 AM - 10:00 AM",
            "12:00 PM - 1:00 PM, 2:30 PM - 3:30 PM",
            "-",
            "12:00 PM - 3:00 PM",
            "ONLINE",
            "11:00 AM - 1:00 PM",
            "12:00 PM - 1:00 PM",
            "2:30 PM - 6:00 PM",
            "-",
            "9:00 AM - 10:00 AM",
            "11:00 AM - 1:00 PM",
            "10:00 AM - 11:00 AM",
            "-",
            "9:30 AM - 12:00PM",
            "-",
            "1:00 PM - 3:30 PM",
            "-",
            "8:00 AM - 5:00 PM",
            "8:00 AM - 5:00 PM"
    };
    String[] hours_wed_list = {
            "10:00AM - 11:00AM",
            "12:00 PM - 1:30 PM",
            "11:00 AM - 12:00 PM",
            "11:30 AM - 2:15 PM",
            "10:00 AM - 12:00 PM, 2:00 PM - 4:00 PM",
            "2:00 PM - 1:00 PM",
            "11:00 AM - 12:00 PM",
            "-",
            "1:00 PM - 2:00 PM",
            "1:00 PM - 3:00 PM",
            "-",
            "ONLINE",
            "11:00 AM - 1:00 PM",
            "10:00 AM - 11:00 AM",
            "3:30 PM - 5:00 PM",
            "4:15 PM - 5:00 PM, 6:15 PM - 6:30 PM",
            "9:00 AM - 10:00 AM",
            "11:00 AM - 1:00 PM",
            "-",
            "10:00 AM - 11:30 AM",
            "-",
            "9:00 AM - 11:30 AM",
            "-",
            "8:00 AM - 12:00 PM",
            "8:00 AM - 5:00 PM",
            "8:00 AM - 5:00 PM"

    };
    String[] hours_thu_list = {
            "10:00 AM - 11:00 AM",
            "12:00 PM - 1:30 PM",
            "11:00 AM - 12:00 PM",
            "11:30 AM - 2:15 PM",
            "10:00 AM - 12:00 PM, 2:00 PM - 4:00 PM",
            "2:00 PM - 1:00 PM",
            "11:00 AM - 12:00 PM",
            "-",
            "1:00 PM - 2:00 PM",
            "1:00 PM - 3:00 PM",
            "-",
            "ONLINE",
            "11:00 AM - 1:00 PM",
            "10:00 AM - 11:00 AM",
            "3:30 PM - 5:00 PM",
            "4:15 PM - 5:00 PM, 6:15 PM - 6:30 PM",
            "9:00 AM - 10:00 AM",
            "11:00 AM - 1:00 PM",
            "-",
            "10:00 AM - 11:30 AM",
            "-",
            "9:00 AM - 11:30 AM",
            "-",
            "8:00 AM - 12:00 PM",
            "8:00 AM - 5:00 PM",
            "8:00 AM - 5:00 PM",
            "-",
    };
    String[] hours_fri_list = {
            "By Appointment",
            "-",
            "-",
            "-",
            "-",
            "-",
            "-",
            "10:00AM - 11:00AM",
            "-",
            "-",
            "-",
            "ONLINE",
            "-",
            "9:30AM - 11:30AM",
            "9:00AM - 11:00AM",
            "-",
            "9:00AM - 10:00AM",
            "-",
            "-",
            "-",
            "2:00PM - 3:30PM",
            "9:00AM - 11:30AM",
            "-",
            "-",
            "8:00AM - 5:00PM",
            "8:00AM - 5:00PM",
    };

        String[] office_room_list={
                "TEC 325",
                "TEC251",
                "TEC 201",
                "TEC 332",
                "TEC 214B",
                "TEC 326",
                "TEC 330",
                "TEC 334",
                "TEC 320",
                "TEC 207B",
                "TEC 234",
                "ONLINE",
                "TEC 210",
                "TEC 335",
                "COAST",
                "TEC 327",
                "TEC 211",
                "TEC 214A",
                "TEC 329",
                "TEC 232",
                "TEC 208",
                "TEC 213",
                "TEC 206",
                "TEC 318C",
                "TEC 214C",
                "TEC 214"
        };


    public faculty_detail() {
        // Required empty public constructor


    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
            View rootview=inflater.inflate(R.layout.faculty_detail, container, false);

            Bundle args = this.getArguments();
            int position = getArguments().getInt("position");
        ImageView img = (ImageView) rootview.findViewById(R.id.faculty_detail_image);
        TextView faculty_name = (TextView) rootview.findViewById(R.id.faculty_detail_name);
        TextView faculty_phone = (TextView) rootview.findViewById(R.id.faculty_detail_phone);
        TextView faculty_email = (TextView) rootview.findViewById(R.id.faculty_detail_email);
        TextView hours_mon = (TextView) rootview.findViewById(R.id.hours_mon);
        TextView hours_tue = (TextView) rootview.findViewById(R.id.hours_tue);
        TextView hours_wed = (TextView) rootview.findViewById(R.id.hours_wed);
        TextView hours_thu = (TextView) rootview.findViewById(R.id.hours_thu);
        TextView hours_fri = (TextView) rootview.findViewById(R.id.hours_fri);
            TextView office_room=(TextView) rootview.findViewById(R.id.office_number);


        img.setImageResource(faculty_images[position]);
        faculty_name.setText(faculty_list[position]);
        faculty_phone.setText(faculty_phone_number_list[position]);
        faculty_email.setText(faculty_email_list[position]);
        hours_mon.setText(hours_mon_list[position]);
        hours_tue.setText(hours_tue_list[position]);
        hours_wed.setText(hours_wed_list[position]);
        hours_thu.setText(hours_thu_list[position]);
        hours_fri.setText(hours_fri_list[position]);
            office_room.setText(office_room_list[position]);
        // Inflate the layout for this fragment
        return rootview;
    }

}
