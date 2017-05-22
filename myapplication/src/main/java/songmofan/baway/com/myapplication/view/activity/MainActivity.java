package songmofan.baway.com.myapplication.view.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

import songmofan.baway.com.myapplication.R;
import songmofan.baway.com.myapplication.model.bean.HomeBean;
import songmofan.baway.com.myapplication.presenter.HomePresent;
import songmofan.baway.com.myapplication.view.adapter.MyListViewAdapter;
import songmofan.baway.com.myapplication.view.iview.HomeView;

public class MainActivity extends AppCompatActivity implements HomeView<HomeBean>{

    private ListView lv;
    private MyListViewAdapter ad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initData();

    }

    private void initData() {
        HomePresent p=new HomePresent();
        p.attath(this);
        ad = new MyListViewAdapter(this);
        p.getDatas(HomeBean.class);

    }

    private void initView() {
        lv = (ListView) findViewById(R.id.lv);
    }



    @Override
    public void callBack(HomeBean homeBean) {
        Toast.makeText(this, "homeBean=============="+homeBean, Toast.LENGTH_SHORT).show();

        List<HomeBean.ResultBean.DataBean> data = homeBean.getResult().getData();
        ad.setData(data);
        ad.notifyDataSetChanged();
    }

    @Override
    public void callBackErr() {

    }
}
