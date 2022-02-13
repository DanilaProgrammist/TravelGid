package com.example.travelgid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class getBudget extends AppCompatActivity {
    private TextView minBudg;
    private TextView maxBudg;
    private Button button;
    String val;//Переменная для поочерёдного хранения введённых данных
    JourneyData journeyData = new JourneyData();//Создаём объект класса

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_budget);
        minBudg = findViewById(R.id.minBudget);
        maxBudg = findViewById(R.id.maxBudget);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((minBudg.getText().toString().trim().equals(""))||(maxBudg.getText().toString().trim().equals(""))){//Проверка заполности поля
                    Toast.makeText(getBudget.this, "Заполните поля", Toast.LENGTH_SHORT).show();
                }
                else{
                    val = minBudg.getText().toString();
                    journeyData.minbudget = Integer.parseInt(val);//Записываем введённые данные в поля класса
                    val = maxBudg.getText().toString();
                    journeyData.maxbudget = Integer.parseInt(val);
                    Intent nextPage = new Intent(".getPurpose");//Процедура перехода на следующую страницу
                    startActivity(nextPage);
                }
            }
        });
    }
}