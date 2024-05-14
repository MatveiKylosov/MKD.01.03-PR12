package com.example.pr_12;

import android.os.Bundle;
import android.content.DialogInterface;
import android.provider.Telephony;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText FullName;
    EditText Phone;
    EditText Address;

    public void AlertDialog(String title, String message){
        // Создает и отображает диалоговое окно с заданным заголовком и сообщением.
        // Диалоговое окно не может быть отменено и содержит кнопку “OK”, которая закрывает диалог.
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(title)
                .setMessage(message)
                .setCancelable(false)
                .setNegativeButton("OK", (dialog, which) -> dialog.cancel());

        AlertDialog alter = builder.create();
        alter.show();
    }

    public void OnArrange(View view){
        FullName = findViewById(R.id.FullName);
        Phone = findViewById(R.id.Phone);
        Address = findViewById(R.id.Address);

        if(FullName.getText().length() == 0)
        {
            AlertDialog("Уведомление", "Пожалуйста, укажите ФИО.");
            return;
        }

        if(Phone.getText().length() == 0)
        {
            AlertDialog("Уведомление", "Пожалуйста, укажите номер телефона.");
            return;
        }

        if(Address.getText().length() == 0)
        {
            AlertDialog("Уведомление", "Пожалуйста, укажите адрес доставки.");
            return;
        }

        AlertDialog("Уведомление", "Заказ оформлен.");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}