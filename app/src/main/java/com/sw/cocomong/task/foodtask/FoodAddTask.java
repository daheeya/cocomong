package com.sw.cocomong.task.foodtask;

import android.util.Log;

import androidx.annotation.NonNull;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class FoodAddTask {
    static String url = "http://58.224.91.191:8080/foods/post";
    public FoodAddTask(String username, String foodname, String expiredate, String category, String memo, String favorite, int refnum) throws JSONException {

        //Request에 사용할 JSON 작성
        JSONObject data = new JSONObject();
        data.put("username", username);
        data.put("foodname", foodname);
        data.put("expiredate", expiredate);
        data.put("category", category);
        data.put("memo", memo);
        data.put("favorite", favorite);
        data.put("refnum", refnum);
        RequestBody requestBody = RequestBody.create(MediaType.get("application/json; charset=utf-8"), data.toString());

        //request 작성
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(url).post(requestBody).build();

        // 응답 콜백
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(@NonNull Call call, @NonNull IOException e) {
                e.printStackTrace();
            }
            @Override
            public void onResponse(@NonNull Call call, @NonNull Response response) throws IOException {
                if (!response.isSuccessful()) {
                    //응답 실패
                    Log.i("tag", "응답실패");
                }else{
                    // 응답 성공
                    Log.i("tag", "응답성공");
                    final String responseData = response.body().string();
                    Log.i("tag", responseData);
                }

            }
        });

    }

}