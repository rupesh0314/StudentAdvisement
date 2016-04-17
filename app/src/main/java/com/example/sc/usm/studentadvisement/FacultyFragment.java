package com.example.sc.usm.studentadvisement;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.support.v4.widget.SimpleCursorAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.List;


public class FacultyFragment extends ListFragment {

    public FacultyFragment() {
        // Required empty public constructor
    }


    private Context mContext;
    private LayoutInflater mLayoutInflater;
    private SQLiteDatabase mSampleDb;
    private List<String> mResults;
    private Cursor mCursor;

    // Elements
    private ListView mListView;
    private SimpleCursorAdapter mListAdapter;

    // Constants
    private final String DB = "data.Faculty_db.s3db";
    private final String TABLE_NAME = "Faculty_Info";
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        // Set our attributes
        mContext = getActivity();
        mLayoutInflater = inflater;

        // Let's inflate & return the view
        View view = mLayoutInflater.inflate(R.layout.fragment_faculty, container, false);

        // Get the database handler & the cursor
        mSampleDb =  SQLiteDatabase.openOrCreateDatabase(DB, null);
        mCursor = mSampleDb.rawQuery("SELECT FirstName FROM " + TABLE_NAME , null);

        // Init
        init(view);

        // Return
        return view;





    }

    private void init(View view) {
        mListAdapter = new SimpleCursorAdapter(

                mContext,
              //  R.layout.your_list_item_layout,,
                android.R.layout.simple_list_item_1,
                mCursor,
                new String[] {"Faculty_Info.FirstName"},
                new int[] { R.id.faculty_rowitem},1

        );
        mListView.setAdapter(mListAdapter);

    }
}
