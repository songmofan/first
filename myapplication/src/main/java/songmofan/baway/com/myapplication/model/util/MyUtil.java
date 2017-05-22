package songmofan.baway.com.myapplication.model.util;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.google.gson.Gson;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;

import songmofan.baway.com.myapplication.view.activity.MainActivity;

/**
 * 类的作用：
 * <p>
 * 作者： 宋莫凡
 * <p>
 * 思路：
 * <p>
 * on 2017/5/19 20
 */

public class MyUtil {
    public static final String TAG ="MyUtil";
    public static  <T>void getDataFromSerVer(String url, HashMap<String,String> hashmap, final UtilGetDataLinsenter utilGetDataLinsenter, final Class<T> t){
        RequestParams params=new RequestParams();
        params.setUri(url);
        if (hashmap!=null) {
            Iterator<String> iterator = hashmap.keySet().iterator();
            while (iterator.hasNext()) {
                String key = iterator.next();
                String values = hashmap.get(key);
                params.addQueryStringParameter(key,values);
            }

        }

        x.http().get(params, new Callback.CommonCallback<String>() {


            @Override
            public void onSuccess(String result) {
                Gson gson=new Gson();
                T t1 = gson.fromJson(result, t);
                Log.d(TAG, "onSuccess: tttttttttttttt1==="+t1);
                utilGetDataLinsenter.callBackData(t1);

            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {

            }

            @Override
            public void onCancelled(CancelledException cex) {

            }

            @Override
            public void onFinished() {

            }
        });


    }
    public  interface UtilGetDataLinsenter<T>{

        public void callBackData(T t);

    }

}
