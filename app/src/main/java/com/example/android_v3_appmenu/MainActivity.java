package com.example.android_v3_appmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import android.widget.LinearLayout;
import android.widget.TextView;


import static com.example.android_v3_appmenu.R.id.itemPlus;
public class MainActivity extends AppCompatActivity {

    private boolean x = false;
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // активируем наш турбар для всех, добавить правильный импорт import androidx.appcompat.widget.Toolbar;
        Toolbar toolbar = (Toolbar) findViewById(R.id.myToolbar);
        setSupportActionBar(toolbar);

    }

    @Override   // ставим верхнее меню
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu); //указываем menu андройд сам выберит какое выводить на экран обысное/land
        return super.onCreateOptionsMenu(menu);
    }


    //ЗДЕСЬ НУЖНО ЧТОБЫ ТЕКСТ НЕ МЕНЯЛСЯ А БЫЛ ВСЕГДА ОДИН!!!

    //При нажатии появляется/проподает выпадающее боковая панель
    @Override  // по нажатию на кнопку плюс в меню, появляется всплывающее окно
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        TextView textView = (TextView)findViewById(R.id.textForPlus);
        LinearLayout linearLayout = (LinearLayout)findViewById(R.id.linerForVerticalMenu);


        int id = item.getItemId();
        // itemPlus -  добавил над классом import static com.example.android_v3_appmenu.R.id.itemPlus;
        if (id == itemPlus && !x) {
            linearLayout.setVisibility(View.VISIBLE);
//          textView.setText("есть меню");
            textView.setText( textView.getText());
            x=true;
        }
        else if (x) {
            linearLayout.setVisibility(View.INVISIBLE);
            textView.setText( textView.getText());
            x=false;
        }
        return super.onOptionsItemSelected(item);
    }




}


    //При нажатии появляется/проподает выпадающее боковая панель
//    @Override  // по нажатию на кнопку плюс в меню, появляется всплывающее окно
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        TextView textView = (TextView)findViewById(R.id.textForPlus);
//        LinearLayout linearLayout = (LinearLayout)findViewById(R.id.linerForVerticalMenu);
//        int id = item.getItemId();
//        // itemPlus -  добавил над классом import static com.example.android_v3_appmenu.R.id.itemPlus;
//        if (id == itemPlus && !x) {
//            linearLayout.setVisibility(View.VISIBLE);
//            textView.setText("есть меню");
//            x=true;
//        }
//        else if (x) {
//            linearLayout.setVisibility(View.INVISIBLE);
//            textView.setText("нет меню");
//            x=false;
//        }
//        return super.onOptionsItemSelected(item);
//    }