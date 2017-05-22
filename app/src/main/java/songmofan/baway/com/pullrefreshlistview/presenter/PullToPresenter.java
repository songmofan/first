package songmofan.baway.com.pullrefreshlistview.presenter;

import java.util.ArrayList;
import java.util.List;

/**
 * 类的作用：
 * <p>
 * 作者： 宋莫凡
 * <p>
 * 思路：
 * <p>
 * on 2017/5/19 16
 */

public class PullToPresenter {

    private ArrayList<String> list;

    public List<String> getDataFromServer(){
        list = new ArrayList<>();
        for (int i = 0; i <20 ; i++) {
            list.add("条目"+i);
        }
        return list;
    }

}
