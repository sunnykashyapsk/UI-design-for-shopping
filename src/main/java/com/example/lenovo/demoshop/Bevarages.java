package com.example.lenovo.demoshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Bevarages extends AppCompatActivity {

    private Button q,w,e,r,t,y;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bevarages);

        q=findViewById(R.id.pepb);
        q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Bevarages.this,"Successfully Added",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(Bevarages.this, Secondactivity.class));
            }
        });
        w=findViewById(R.id.thumb);
        w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Bevarages.this,"Successfully Added",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(Bevarages.this, Secondactivity.class));
            }
        });
        e=findViewById(R.id.lichib);
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Bevarages.this,"Successfully Added",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(Bevarages.this, Secondactivity.class));
            }
        });
        r=findViewById(R.id.orbb);
        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Bevarages.this,"Successfully Added",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(Bevarages.this, Secondactivity.class));
            }
        });
    }
}
