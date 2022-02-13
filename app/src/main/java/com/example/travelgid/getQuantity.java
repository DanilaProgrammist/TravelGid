package com.example.travelgid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.Collections;

public class getQuantity extends AppCompatActivity {
    private Spinner spinner;
    private Button butt;
    int[] count = {1,2,3,4,5,6,7,8,9,10};
    JourneyData journeyData = new JourneyData();//Создаём объект класса
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_quantity);
        spinner = findViewById(R.id.get_quantity);
        butt = findViewById(R.id.button);
        // Создаем адаптер ArrayAdapter с помощью массива строк и стандартной разметки элемета spinner
        ArrayAdapter<Integer> adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, Collections.singletonList(count));
        // Определяем разметку для использования при выборе элемента
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Применяем адаптер к элементу spinner
        spinner.setAdapter(adapter);
        AdapterView.OnItemSelectedListener itemSelectedListener = new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                journeyData.quantity = (int)parent.getItemAtPosition(position);//Сохраняем полученные данные в поле класса
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(getQuantity.this, "Выберите корректные данные", Toast.LENGTH_SHORT).show();
            }
        };
        butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent nextPage = new Intent(".getBudget");//Метод переключения страниц
                startActivity(nextPage);
            }
        });

    }
}