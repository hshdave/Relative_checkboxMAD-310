package com.example.relative_check;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CheckBox ck_first,ck_last;
    RadioGroup r_group;
    TextView txt_second,txt_first;
    RadioButton r_btn,r_male,r_female;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ck_first = findViewById(R.id.first_ck);
        ck_last = findViewById(R.id.second_ck);
        txt_second = findViewById(R.id.txt_second);
        txt_first = findViewById(R.id.txt_first);
        r_male = findViewById(R.id.r_male);
        r_female = findViewById(R.id.r_female);


        r_group = findViewById(R.id.gen_rgroup);


        if(ck_first.isChecked())
        {
            txt_second.setText(ck_first.getText());
        }
        else{
            txt_second.setText(ck_last.getText());
        }


        ck_first.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(ck_first.isChecked())
                {
                    txt_second.setText(ck_first.getText());
                }
                else{
                    txt_second.setText(ck_last.getText());
                }
            }
        });

        ck_last.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(ck_first.isChecked())
                {
                    txt_second.setText(ck_first.getText());
                }
                else{
                    txt_second.setText(ck_last.getText());
                }
            }
        });


        int rid = r_group.getCheckedRadioButtonId();





        r_male.setChecked(true);



        r_group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                r_btn = findViewById(checkedId);

                txt_first.setText(r_btn.getText().toString());
            }
        });







    }
}
