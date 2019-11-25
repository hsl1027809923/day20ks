package util;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import app.MyApp;
import contract.Icontract;

/*
 *@auther:郝世龙
 *@Date: 2019-11-25
 *@Time:9:03
 *@Description:${DESCRIPTION}
 **/public class VolleyUtil {
    //创建队列
    RequestQueue queue= Volley.newRequestQueue(MyApp.context);
    //单例模式
    public static VolleyUtil util=new VolleyUtil();
    private VolleyUtil() {
    }
    public static VolleyUtil getInstance(){
        return util;
    }
    //Get请求
    public void ToGet(String url, final Icontract.CallBack callBack){
        StringRequest request=new StringRequest(0, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                callBack.success(response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                callBack.error(error.getMessage());
            }
        });
        queue.add(request);
    }
}
