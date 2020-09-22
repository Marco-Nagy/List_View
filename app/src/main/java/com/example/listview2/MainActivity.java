package com.example.listview2;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ArrayList<Animal> animals = new ArrayList<>();

        animals.add(new Animal("Bear", R.drawable.bear,R.raw.bear));
        animals.add(new Animal("Bird", R.drawable.bird,R.raw.bird));
        animals.add(new Animal("Camel", R.drawable.camel,R.raw.camel));
        animals.add(new Animal("Cat", R.drawable.cat,R.raw.cat));
        animals.add(new Animal("Dog", R.drawable.dog,R.raw.dog));
        animals.add(new Animal("Elephant", R.drawable.elephant,R.raw.elephant));
        animals.add(new Animal("Fish", R.drawable.fish,R.raw.fish));
        animals.add(new Animal("Lion", R.drawable.lion,R.raw.lion));
        animals.add(new Animal("Monkey", R.drawable.monkey,R.raw.monkey));
        animals.add(new Animal("Turtle", R.drawable.turtle,R.raw.turtle));
        final CustomAdapter adapter =new CustomAdapter(animals,this)  ;
              ListView lv = findViewById(R.id.lv);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                final MediaPlayer mediaPlayer =MediaPlayer.create(MainActivity.this,animals.get(i).getSound());
               mediaPlayer.start();
             
               
            }
        });
    }


    }

