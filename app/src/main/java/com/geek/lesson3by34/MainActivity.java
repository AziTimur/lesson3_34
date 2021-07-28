package com.geek.lesson3by34;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

     private ArrayList<Country> list;
     private RecyclerView recyclerView;
     private  Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getData();
        setUpRecycler();
    }

    private void setUpRecycler() {
        recyclerView=findViewById(R.id.main_rv);
        adapter=new Adapter();
        recyclerView.setAdapter(adapter);
        adapter.addlist(list);
    }

    private void getData() {
        list= new ArrayList<>();
        list.add(new Country(R.drawable.ic_tr,"Туркия","Стамбул"));
        list.add(new Country(R.drawable.ic_az,"Азербейджан","Баку"));
        list.add(new Country(R.drawable.ic_tm,"Turkmenistan","Ашхабат"));
        list.add(new Country(R.drawable.ic_kz,"Казахстан","Нурсултан"));
        list.add(new Country(R.drawable.ic_kg,"Кыргызстан","Бишкек"));
        list.add(new Country(R.drawable.ic_uz,"Узбекстан","Ташкент"));
        list.add(new Country(R.drawable.ic_ru,"Россия","Москва"));
        list.add(new Country(R.drawable.ic_de,"Германия","Берлин"));
        list.add(new Country(R.drawable.ic_jp,"Япония","Токио"));
        list.add(new Country(R.drawable.ic_kr,"Корея","Сеул"));
        list.add(new Country(R.drawable.ic_ch,"Швейцария","Берн"));
        list.add(new Country(R.drawable.ic_fr,"Франция","Париж"));
        list.add(new Country(R.drawable.ic_kw,"Кувейт","Эль-Кувейт"));
        list.add(new Country(R.drawable.ic_cu,"Куба","Гавана"));
        list.add(new Country(R.drawable.ic_eg,"Египет","Каир"));
    }
}