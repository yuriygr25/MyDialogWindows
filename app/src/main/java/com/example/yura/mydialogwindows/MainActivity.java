package com.example.yura.mydialogwindows;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    AlertDialog builder;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.activity_main,
                (ViewGroup)findViewById(R.id.toast_layout));

        TextView text = (TextView)layout.findViewById(R.id.dialogTextView);
        text.setText("Закрыть? Вы уверены?");

        builder = new AlertDialog.Builder(MainActivity.this, R.style.AppCompatAlertDialogStyle);
        builder.setView(layout);

    }
}
