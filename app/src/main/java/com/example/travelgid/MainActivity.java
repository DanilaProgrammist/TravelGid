package com.example.travelgid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button mainButton;
    private EditText cityGet;

    JourneyData journeyData = new JourneyData();//Создаём объект
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        mainButton = findViewById(R.id.button);
        cityGet = findViewById(R.id.yourCity);
        mainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cityGet.getText().toString().trim().equals("")){
                    Toast.makeText(MainActivity.this, "Введите город", Toast.LENGTH_SHORT).show();
                }
                else {
                    String city = cityGet.getText().toString();
                    journeyData.city = city;//Сохраняем значение в поле класса
                    Intent nextPage = new Intent(".getQuantity");//метод перехода на следующую страницу
                    startActivity(nextPage);
                }
            }
        });

    }
}