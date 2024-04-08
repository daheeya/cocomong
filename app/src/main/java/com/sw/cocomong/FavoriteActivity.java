package com.sw.cocomong;

import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.sw.cocomong.Favorite.FoodAdapter;
import com.sw.cocomong.Favorite.FoodListItem;

import java.util.ArrayList;
import java.util.List;

public class FavoriteActivity extends AppCompatActivity {
    ListView list;
    FoodListItem onion = new FoodListItem("양파", "채소", "24-4-13", true);
    FoodListItem garlic = new FoodListItem("마늘", "채소", "24-5-1", false);

    List<FoodListItem> foodListItems=new ArrayList<>();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food_list);

        list = (ListView) findViewById(R.id.list_food);
        foodListItems.add(onion);
        foodListItems.add(garlic);

        FoodAdapter foodAdapter = new FoodAdapter(FavoriteActivity.this, foodListItems);
        list.setAdapter(foodAdapter);

    }
}