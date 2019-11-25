package com.bawei.day20ks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import adapter.MyAdapeter;
import base.BaseActivity;
import base.BasePresenter;
import bean.Shop;
import contract.Icontract;
import presenter.MyPresenter;
import util.VolleyUtil;

public class MainActivity extends BaseActivity implements Icontract.Iview {
    RecyclerView RecyclerView_id;
    private MyPresenter myPresenter;

    @Override
    protected void initData() {
        myPresenter.success("http://172.17.8.100/movieApi/movie/v1/findReleaseMovieList?page=1&count=20");
    }

    @Override
    protected void initView() {
        RecyclerView_id=findViewById(R.id.RecyclerView_id);
        RecyclerView_id.setLayoutManager(new LinearLayoutManager(this));

    }

    @Override
    protected int initLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected BasePresenter PnitLayout() {
        myPresenter = new MyPresenter();
        return myPresenter;
    }

    @Override
    public void success(Shop shop) {
        MyAdapeter adapeter=new MyAdapeter(shop.getResult(),this);
        RecyclerView_id.setAdapter(adapeter);
    }
}
