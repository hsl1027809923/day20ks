package base;

/*
 *@auther:郝世龙
 *@Date: 2019-11-25
 *@Time:8:56
 *@Description:${DESCRIPTION}
 **/public class BasePresenter<V extends BaseActivity> {
    public V v;
    //绑定方法
    public void attach(V v){
        this.v=v;
    }
    //解绑方法
    public void Uattach(){
        if (v!=null){
            v=null;
        }
    }
}
