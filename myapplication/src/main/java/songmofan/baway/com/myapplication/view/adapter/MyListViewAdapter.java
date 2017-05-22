package songmofan.baway.com.myapplication.view.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.net.IDN;
import java.util.ArrayList;
import java.util.List;

import songmofan.baway.com.myapplication.R;
import songmofan.baway.com.myapplication.model.bean.HomeBean;

/**
 * 类的作用：
 * <p>
 * 作者： 宋莫凡
 * <p>
 * 思路：
 * <p>
 * on 2017/5/19 21
 */

public class MyListViewAdapter extends BaseAdapter {
    private  Context context;
    private List<HomeBean.ResultBean.DataBean> list=new ArrayList<>();

    public MyListViewAdapter(Context context){
        this.context=context;

    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView==null) {
            convertView=convertView.inflate(context, R.layout.listview,null);

        }
       ImageView tu= (ImageView) convertView.findViewById(R.id.tu);
       TextView text= (TextView) convertView.findViewById(R.id.text);
        text.setText(list.get(position).getTitle());
        return convertView;
    }
    public void setData(List<HomeBean.ResultBean.DataBean> data){
        if (data!=null) {
            list.addAll(data);
        }
    }

}
