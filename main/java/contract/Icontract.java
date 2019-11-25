package contract;

import bean.Shop;

/*
 *@auther:郝世龙
 *@Date: 2019-11-25
 *@Time:9:07
 *@Description:${DESCRIPTION}
 **/public interface Icontract {
    //Iv
    interface Iview{
        void success(Shop shop);
    }
    //Ip
    interface Ipresenter{
        void success(String url);
    }
    //CallBack
    interface CallBack{
        void success(String json);
        void error(String er);
    }
}
