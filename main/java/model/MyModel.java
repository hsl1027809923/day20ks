package model;

import contract.Icontract;
import util.VolleyUtil;

/*
 *@auther:郝世龙
 *@Date: 2019-11-25
 *@Time:9:02
 *@Description:${DESCRIPTION}
 **/public class MyModel {
    public void TOo(String url, Icontract.CallBack callBack){
        VolleyUtil.getInstance().ToGet(url, callBack);
    }
}
