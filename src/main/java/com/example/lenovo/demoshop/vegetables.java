package com.example.lenovo.demoshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class vegetables extends AppCompatActivity {
    private Button q,w,e,r,t,y;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegetables);

        q=findViewById(R.id.ptb);
        q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(vegetables.this,"Successfully Added",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(vegetables.this, Secondactivity.class));
            }
        });
        w=findViewById(R.id.tomatbb);
        w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(vegetables.this,"Successfully Added",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(vegetables.this, Secondactivity.class));
            }
        });
        e=findViewById(R.id.oninb);
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(vegetables.this,"Successfully Added",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(vegetables.this, Secondactivity.class));
            }
        });
        r=findViewById(R.id.cucemb);
        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(vegetables.this,"Successfully Added",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(vegetables.this, Secondactivity.class));
            }
        });
        t=findViewById(R.id.lemonb);
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(vegetables.this,"Successfully Added",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(vegetables.this, Secondactivity.class));
            }
        });


    }
}
