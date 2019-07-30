package com.example.lenovo.demoshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class personal extends AppCompatActivity {
    private Button q,w,e,r,t,y;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal);
        q=findViewById(R.id.shampoob);
        q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(personal.this,"Successfully Added",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(personal.this, Secondactivity.class));
            }
        });
        w=findViewById(R.id.cintholb);
        w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(personal.this,"Successfully Added",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(personal.this, Secondactivity.class));
            }
        });
    }
}
