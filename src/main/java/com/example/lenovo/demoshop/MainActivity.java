package com.example.lenovo.demoshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private CardView a,b,c,d,e,f,g,h,i,j,k,l,m,n;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a=findViewById(R.id.speaker);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Secondactivity.class));
            }
        });
        b=findViewById(R.id.mouse);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Secondactivity.class));
            }
        });
        c=findViewById(R.id.keyboard);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Secondactivity.class));
            }
        });
        d=findViewById(R.id.cv4);
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Secondactivity.class));
            }
        });
        e=findViewById(R.id.cv5);
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Secondactivity.class));
            }
        });
        f=findViewById(R.id.cv6);
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, vegetables.class));
            }
        });
        g=findViewById(R.id.cv7);
        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Snacks.class));
            }
        });
        h=findViewById(R.id.cv8);
        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, grocery.class));
            }
        });
        i=findViewById(R.id.cv9);
        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Bevarages.class));
            }
        });
        j=findViewById(R.id.cvhousehold);
        j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, household.class));
            }
        });
        k=findViewById(R.id.cv11);
        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, personal.class));
            }
        });

    }
}
