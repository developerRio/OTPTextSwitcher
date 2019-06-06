package com.originalstocks.otptextswittcherdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText mOtpET1, mOtpET2, mOtpET3, mOtpET4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mOtpET1 = findViewById(R.id.otp_et_1);
        mOtpET2 = findViewById(R.id.otp_et_2);
        mOtpET3 = findViewById(R.id.otp_et_3);
        mOtpET4 = findViewById(R.id.otp_et_4);

        mOtpET1.setSelectAllOnFocus(true);
        mOtpET2.setSelectAllOnFocus(true);
        mOtpET3.setSelectAllOnFocus(true);
        mOtpET4.setSelectAllOnFocus(true);

        positionShifterOTP(mOtpET1, mOtpET2);
        positionShifterOTP(mOtpET2, mOtpET3);
        positionShifterOTP(mOtpET3, mOtpET4);

    }

    public static void positionShifterOTP(final EditText et1, final EditText et2){

        et1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(et1.getText().toString().length()== 1)     //size as per your requirement
                {
                    et2.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }

}
