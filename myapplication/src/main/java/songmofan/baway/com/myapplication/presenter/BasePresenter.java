package songmofan.baway.com.myapplication.presenter;

import android.content.Context;

/**
 * 类的作用：
 * <p>
 * 作者： 宋莫凡
 * <p>
 * 思路：
 * <p>
 * on 2017/5/19 20
 */

public class BasePresenter<T> {
    private T mt;
    public  void  attath(T t){
      this.mt=t;
    };
    public  T getBaseView(){
        return mt;
    }

}
