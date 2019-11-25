package base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.Layout;

/*
 *@auther:郝世龙
 *@Date: 2019-11-25
 *@Time:8:56
 *@Description:${DESCRIPTION}
 **/public abstract class BaseActivity<P extends BasePresenter> extends AppCompatActivity {
    public  P p;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(initLayout());
        p=PnitLayout();
        //绑定方法
        if (p!=null){
            p.attach(this);
        }
        initView();
        initData();
    }

    protected abstract void initData();

    protected abstract void initView();

    protected abstract int initLayout();
    protected abstract P PnitLayout();
    //解绑


    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (p!=null){
            p.Uattach();
            p=null;
        }
    }
}
