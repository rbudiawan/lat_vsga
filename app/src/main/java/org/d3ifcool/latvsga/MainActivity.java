package org.d3ifcool.latvsga;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //aksi menekan tombol
                btn.setBackgroundColor(Color.RED);
                btn.setTextColor(Color.WHITE);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.optionmenu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        //menghubungkan antara aksi dengan menu item
        if(item.getItemId() == R.id.menu1){
            //pindah ke mainactivity2
            startActivity(new Intent(this,MainActivity2.class));
        }else if(item.getItemId() == R.id.menu2){
            //pindah ke mainactivity3
            startActivity(new Intent(this,MainActivity3.class));
        }
        return super.onOptionsItemSelected(item);
    }
}