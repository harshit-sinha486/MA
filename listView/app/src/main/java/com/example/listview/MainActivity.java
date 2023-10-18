package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    ListView simpleList;
    String touristplaces[] = {"Bangalore", "Coorg", "Mysore", "Gokarna",
            "Madikeri", "Hampi", "Shimoga"};
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simpleList = (ListView)findViewById(R.id.simpleListView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                R.layout.activity_listview, R.id.textView, touristplaces);
        simpleList.setAdapter(arrayAdapter);
        simpleList.setOnItemClickListener(
        new AdapterView.OnItemClickListener() {
          @Override
          public void onItemClick(AdapterView<?> parent, View view, int position,long
                  id) {
              String s=(String)parent.getItemAtPosition(position);

              Toast.makeText(getBaseContext(),"You Have Selected " + s,Toast.LENGTH_LONG).show();
          }
});
    }
}
