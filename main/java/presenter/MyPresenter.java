package presenter;

import com.bawei.day20ks.MainActivity;
import com.google.gson.Gson;

import base.BasePresenter;
import bean.Shop;
import contract.Icontract;
import model.MyModel;

/*
 *@auther:郝世龙
 *@Date: 2019-11-25
 *@Time:9:02
 *@Description:${DESCRIPTION}
 **/public class MyPresenter extends BasePresenter implements Icontract.Ipresenter {
    MyModel myModel;

    public MyPresenter() {
        myModel=new MyModel();
    }

    @Override
    public void success(String url) {
        myModel.TOo(url, new Icontract.CallBack() {
            @Override
            public void success(String json) {
                //解析
                Gson gson=new Gson();
                Shop shop = gson.fromJson(json, Shop.class);
                MainActivity activity= (MainActivity) v;
                activity.success(shop);
            }

            @Override
            public void error(String er) {

            }
        });
    }
}
