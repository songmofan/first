package songmofan.baway.com.myapplication.view.iview;

/**
 * 类的作用：
 * <p>
 * 作者： 宋莫凡
 * <p>
 * 思路：
 * <p>
 * on 2017/5/19 20
 */

public interface HomeView<T> extends BaseView {
    void callBack(T t);
    void callBackErr();

}
