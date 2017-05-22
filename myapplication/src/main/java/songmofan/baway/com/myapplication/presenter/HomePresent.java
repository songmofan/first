package songmofan.baway.com.myapplication.presenter;

import java.util.HashMap;

import songmofan.baway.com.myapplication.model.util.MyUtil;
import songmofan.baway.com.myapplication.view.iview.HomeView;

/**
 * 类的作用：
 * <p>
 * 作者： 宋莫凡
 * <p>
 * 思路：
 * <p>
 * on 2017/5/19 20
 */

public class HomePresent extends BasePresenter<HomeView>{

    public <T>void getDatas(Class<T> t){
        String url="";
        HashMap<String,String> hashMap=new HashMap<>();
        MyUtil.getDataFromSerVer(url, hashMap, new MyUtil.UtilGetDataLinsenter<T>() {
            @Override
            public void callBackData(T t) {
                getBaseView().callBack(t);
            }
        },t);


    }
}
