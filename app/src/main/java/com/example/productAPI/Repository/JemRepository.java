package com.example.productAPI.Repository;

import android.util.Log;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.productAPI.models.ModelM;
import com.example.productAPI.remote_data.RetrofitClient;

import java.util.List;

public class JemRepository {
    final MutableLiveData<List<ModelM>> data = new MutableLiveData<>();

    public LiveData<List<ModelM>> getDashJeminyList() {
        Call<List<ModelM>> apiCall = RetrofitClient.getInstance().getApi().getStoreProducts();

        apiCall.enqueue(new Callback<List<ModelM>>() {
            @Override
            public void onResponse(Call<List<ModelM>> call, Response<List<ModelM>> response) {
                if (response.body() != null) {
                    data.postValue(response.body());
                }
            }

            @Override
            public void onFailure(Call<List<ModelM>> call, Throwable throwable) {
                Log.e("TAG", "NO DATA" + throwable.getLocalizedMessage());
                data.postValue(null);
            }
        });
        return data;
    }
}
