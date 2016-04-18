package com.example.sc.usm.studentadvisement;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FaqFragment extends AppCompatActivity {
    TextView que_1, que_2, que_3, que_4, que_5, que_6, que_7, que_8, que_9, que_10, que_11, que_12, que_13, que_14, que_15, que_16, que_17;
    TextView que_18, que_19, que_20, que_21, que_22, que_23, que_24, que_25, que_26, que_27, que_28, que_29;


    public FaqFragment() {
        // Required empty public constructor
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_faq);



        // Inflate the layout for this fragment

    // inside Activity



        que_1 = (TextView) findViewById(R.id.que_1_content);
// hide until its title is clicked
        que_1.setVisibility(View.GONE);
        que_2 = (TextView) findViewById(R.id.que_2_content);
// hide until its title is clicked
        que_2.setVisibility(View.GONE);
        que_3 = (TextView) findViewById(R.id.que_3_content);
// hide until its title is clicked
        que_3.setVisibility(View.GONE);
        que_4 = (TextView) findViewById(R.id.que_4_content);
// hide until its title is clicked
        que_4.setVisibility(View.GONE);
        que_5 = (TextView) findViewById(R.id.que_5_content);
// hide until its title is clicked
        que_5.setVisibility(View.GONE);
        que_6 = (TextView) findViewById(R.id.que_6_content);
// hide until its title is clicked
        que_6.setVisibility(View.GONE);
        que_7 = (TextView) findViewById(R.id.que_7_content);
// hide until its title is clicked
        que_7.setVisibility(View.GONE);
        que_8 = (TextView) findViewById(R.id.que_8_content);
// hide until its title is clicked
        que_8.setVisibility(View.GONE);
        que_9 = (TextView) findViewById(R.id.que_9_content);
// hide until its title is clicked
        que_9.setVisibility(View.GONE);
        que_10 = (TextView) findViewById(R.id.que_10_content);
// hide until its title is clicked
        que_10.setVisibility(View.GONE);
        que_11 = (TextView) findViewById(R.id.que_11_content);
// hide until its title is clicked
        que_11.setVisibility(View.GONE);
        que_12 = (TextView) findViewById(R.id.que_12_content);
// hide until its title is clicked
        que_12.setVisibility(View.GONE);
        que_13 = (TextView) findViewById(R.id.que_13_content);
// hide until its title is clicked
        que_13.setVisibility(View.GONE);
        que_14 = (TextView) findViewById(R.id.que_14_content);
// hide until its title is clicked
        que_14.setVisibility(View.GONE);
        que_15 = (TextView) findViewById(R.id.que_15_content);
// hide until its title is clicked
        que_15.setVisibility(View.GONE);
        que_16 = (TextView) findViewById(R.id.que_16_content);
// hide until its title is clicked
        que_16.setVisibility(View.GONE);
        que_17 = (TextView) findViewById(R.id.que_17_content);
// hide until its title is clicked
        que_17.setVisibility(View.GONE);
        que_18 = (TextView) findViewById(R.id.que_18_content);
// hide until its title is clicked
        que_18.setVisibility(View.GONE);
        que_19 = (TextView) findViewById(R.id.que_19_content);
// hide until its title is clicked
        que_19.setVisibility(View.GONE);
        que_20 = (TextView) findViewById(R.id.que_20_content);
// hide until its title is clicked
        que_20.setVisibility(View.GONE);
        que_21 = (TextView) findViewById(R.id.que_21_content);
// hide until its title is clicked
        que_21.setVisibility(View.GONE);
        que_22 = (TextView) findViewById(R.id.que_22_content);
// hide until its title is clicked
        que_22.setVisibility(View.GONE);
        que_23 = (TextView) findViewById(R.id.que_23_content);
// hide until its title is clicked
        que_23.setVisibility(View.GONE);
        que_24 = (TextView) findViewById(R.id.que_24_content);
// hide until its title is clicked
        que_24.setVisibility(View.GONE);
        que_25 = (TextView) findViewById(R.id.que_25_content);
// hide until its title is clicked
        que_25.setVisibility(View.GONE);
        que_26 = (TextView) findViewById(R.id.que_26_content);
// hide until its title is clicked
        que_26.setVisibility(View.GONE);
        que_27 = (TextView) findViewById(R.id.que_27_content);
// hide until its title is clicked
        que_27.setVisibility(View.GONE);
        que_28 = (TextView) findViewById(R.id.que_28_content);
// hide until its title is clicked
        que_28.setVisibility(View.GONE);
        que_29 = (TextView) findViewById(R.id.que_29_content);
// hide until its title is clicked
        que_29.setVisibility(View.GONE);

    }

        /**
         * onClick handler
         */

    public void toggle_contents(View v) {

        switch (v.getId()) {


            case R.id.que_1:
                que_1.setVisibility(que_1.isShown()
                        ? View.GONE
                        : View.VISIBLE);
                break;
            case R.id.que_2:
                que_2.setVisibility(que_2.isShown()
                        ? View.GONE
                        : View.VISIBLE);
                break;
            case R.id.que_3:
                que_3.setVisibility(que_3.isShown()
                        ? View.GONE
                        : View.VISIBLE);
                break;
            case R.id.que_4:
                que_4.setVisibility(que_4.isShown()
                        ? View.GONE
                        : View.VISIBLE);
                break;
            case R.id.que_5:
                que_5.setVisibility(que_5.isShown()
                        ? View.GONE
                        : View.VISIBLE);
                break;
            case R.id.que_6:
                que_6.setVisibility(que_6.isShown()
                        ? View.GONE
                        : View.VISIBLE);
                break;
            case R.id.que_7:
                que_7.setVisibility(que_7.isShown()
                        ? View.GONE
                        : View.VISIBLE);
                break;
            case R.id.que_8:
                que_8.setVisibility(que_8.isShown()
                        ? View.GONE
                        : View.VISIBLE);
                break;
            case R.id.que_9:
                que_9.setVisibility(que_9.isShown()
                        ? View.GONE
                        : View.VISIBLE);
                break;
            case R.id.que_10:
                que_10.setVisibility(que_10.isShown()
                        ? View.GONE
                        : View.VISIBLE);
                break;
            case R.id.que_11:
                que_11.setVisibility(que_11.isShown()
                        ? View.GONE
                        : View.VISIBLE);
                break;
            case R.id.que_12:
                que_12.setVisibility(que_12.isShown()
                        ? View.GONE
                        : View.VISIBLE);
                break;
            case R.id.que_13:
                que_13.setVisibility(que_13.isShown()
                        ? View.GONE
                        : View.VISIBLE);
                break;
            case R.id.que_14:
                que_14.setVisibility(que_14.isShown()
                        ? View.GONE
                        : View.VISIBLE);
                break;
            case R.id.que_15:
                que_15.setVisibility(que_15.isShown()
                        ? View.GONE
                        : View.VISIBLE);
                break;

            case R.id.que_16:
                que_16.setVisibility(que_16.isShown()
                        ? View.GONE
                        : View.VISIBLE);
                break;
            case R.id.que_17:
                que_17.setVisibility(que_17.isShown()
                        ? View.GONE
                        : View.VISIBLE);
                break;
            case R.id.que_18:
                que_18.setVisibility(que_18.isShown()
                        ? View.GONE
                        : View.VISIBLE);
                break;
            case R.id.que_19:
                que_19.setVisibility(que_19.isShown()
                        ? View.GONE
                        : View.VISIBLE);
                break;
            case R.id.que_20:
                que_20.setVisibility(que_20.isShown()
                        ? View.GONE
                        : View.VISIBLE);
                break;
            case R.id.que_21:
                que_21.setVisibility(que_21.isShown()
                        ? View.GONE
                        : View.VISIBLE);
                break;
            case R.id.que_22:
                que_22.setVisibility(que_22.isShown()
                        ? View.GONE
                        : View.VISIBLE);
                break;
            case R.id.que_23:
                que_23.setVisibility(que_23.isShown()
                        ? View.GONE
                        : View.VISIBLE);
                break;
            case R.id.que_24:
                que_24.setVisibility(que_24.isShown()
                        ? View.GONE
                        : View.VISIBLE);
                break;
            case R.id.que_25:
                que_25.setVisibility(que_25.isShown()
                        ? View.GONE
                        : View.VISIBLE);
                break;
            case R.id.que_26:
                que_26.setVisibility(que_26.isShown()
                        ? View.GONE
                        : View.VISIBLE);
                break;
            case R.id.que_27:
                que_27.setVisibility(que_27.isShown()
                        ? View.GONE
                        : View.VISIBLE);
                break;
            case R.id.que_28:
                que_28.setVisibility(que_28.isShown()
                        ? View.GONE
                        : View.VISIBLE);
                break;
            case R.id.que_29:
                que_29.setVisibility(que_29.isShown()
                        ? View.GONE
                        : View.VISIBLE);
                break;
        }
    }
}
