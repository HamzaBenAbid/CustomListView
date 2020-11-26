package com.example.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
protected ListView list ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list =findViewById(R.id.listviewperso);

    ArrayList<HashMap<String,String>> listitem =new ArrayList<>();
    HashMap<String,String > map;
    map =new HashMap<>();
    map.put("titre","word");
    map.put("description","editeur dde text");
        map.put("img",String.valueOf(R.drawable.word));
        listitem.add(map);
        map =new HashMap<>();
        map.put("titre","excel");
        map.put("description","editeur dde text");
        map.put("img",String.valueOf(R.drawable.excel));
        listitem.add(map);
        map =new HashMap<>();
        map.put("titre","outlook");
        map.put("description","editeur dde text");
        map.put("img",String.valueOf(R.drawable.outlook));
        listitem.add(map);
        map =new HashMap<>();
        map.put("titre","powerpoint");
        map.put("description","editeur dde text");
        map.put("img",String.valueOf(R.drawable.powerpoint));
        listitem.add(map);

        SimpleAdapter adapter = new SimpleAdapter(this.getBaseContext(),
                listitem,
                R.layout.activity_list_item,
                new String[]{"img","titre","description"},
                new int[]{R.id.img,R.id.titre,R.id.description}
                );
        list.setAdapter(adapter);
    }
}