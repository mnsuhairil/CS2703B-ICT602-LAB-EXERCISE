package com.example.lab2bsuhairil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=(ListView)findViewById(R.id.listView);
        String[] values =new String[] {
                "ICT650",
                "LAB ACTIVITY 8",
                "ANDROID STUDIO",
                "Valorant",
                "DOTA 2",
                "Counter Strike Global",
                "Mana Mana Rancak Berdozaa!",
                "Mana saya tau",
                "Saya Kan Ikan",
                "Apa Kau MAU?",
                "LA DI LA DI DA DU ~~~~"
        };

        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,android.R.id.text1,values);
        listView.setAdapter(adapter);
    }


}