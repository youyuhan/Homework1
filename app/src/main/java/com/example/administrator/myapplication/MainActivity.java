package com.example.administrator.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Button add,sub,zero;
    Button tranfer;
    TextView textView;
    int point;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        point=0;
    }
    void init(){
        add=(Button)findViewById(R.id.add);
        sub=(Button)findViewById(R.id.substract);
        zero=(Button)findViewById(R.id.zero);
        tranfer=(Button)findViewById(R.id.transfer);
        textView=(TextView)findViewById(R.id.point);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                point=point+1;
                textView.setText(""+point);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                point=point-1;
                textView.setText(""+point);
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                point=0;
                textView.setText(""+point);
            }
        });
        tranfer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=textView.getText().toString();
                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("point",str);
                startActivity(intent);
            }
        });
    }

}
