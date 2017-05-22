package songmofan.baway.com.pullrefreshlistview.view.adapter;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import songmofan.baway.com.pullrefreshlistview.R;

/**
 * 类的作用：
 * <p>
 * 作者： 宋莫凡
 * <p>
 * 思路：
 * <p>
 * on 2017/5/19 16
 */

public class PullToRefreshAdapter extends BaseAdapter {
    private static final String TAG = "PullToRefreshAdapter";
    private Context context;
    private  ArrayList<String> lists=new ArrayList<>();
    public PullToRefreshAdapter(Context context){
        this.context=context;
    }

    @Override
    public int getCount() {
        return lists.size();
    }

    @Override
    public Object getItem(int position) {
        return lists.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView==null) {
            convertView = convertView.inflate(context, R.layout.pull_layout, null);
        }
            TextView te=(TextView) convertView.findViewById(R.id.te);
            te.setText(lists.get(position));
            return convertView;
    }
    public  void setData(ArrayList<String> list){
        Log.d(TAG, "setData: list================"+list);
        if (list!=null) {
            lists.addAll(list);

        }

    }

}
