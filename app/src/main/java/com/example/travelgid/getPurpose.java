package com.example.travelgid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class getPurpose extends AppCompatActivity {
    private RadioGroup radioGroup;
    private RadioButton relaxionButt;
    private RadioButton earningButt;
    private RadioButton cultureButt;
    private RadioButton travelButt;
    private Button next;
    JourneyData journeyData = new JourneyData();//Создаём объект класса
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_purpose);
        next = findViewById(R.id.button);

        relaxionButt = findViewById(R.id.relaxion);

        earningButt = findViewById(R.id.earning);

        cultureButt = findViewById(R.id.culture);

        travelButt = findViewById(R.id.travel);

        View.OnClickListener radioButtonClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioButton value = (RadioButton) v;
                String purpose;//Переменная храения значения
                switch (value.getId()){
                    case R.id.relaxion:
                        journeyData.purpose = "relax";//Сохраняем значение в поле класса
                        break;
                    case  R.id.earning:
                        journeyData.purpose = "earning";//Сохраняем значение в поле класса
                        break;
                    case  R.id.culture:
                        journeyData.purpose = "culture";//Сохраняем значение в поле класса
                        break;
                    case  R.id.travel:
                        journeyData.purpose = "travel";//Сохраняем значение в поле класса
                        break;
                }
            }
        };

    }
}