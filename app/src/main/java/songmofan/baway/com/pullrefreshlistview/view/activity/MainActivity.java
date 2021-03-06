package songmofan.baway.com.pullrefreshlistview.view.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshListView;

import java.util.ArrayList;

import songmofan.baway.com.pullrefreshlistview.R;
import songmofan.baway.com.pullrefreshlistview.presenter.PullToPresenter;
import songmofan.baway.com.pullrefreshlistview.view.adapter.PullToRefreshAdapter;

public class MainActivity extends AppCompatActivity implements PullToRefreshListView.OnRefreshListener2{

    private static final String TAG ="MainActivity" ;
    private PullToRefreshListView pull_list;
    private ArrayList<String> list;
    private PullToRefreshAdapter ad;
    private PullToPresenter p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();


        initData();


    }

    private void initData() {
        p = new PullToPresenter();
        list = (ArrayList<String>) p.getDataFromServer();
        ad.setData(list);
        ad.notifyDataSetChanged();
        Log.i(TAG, "initData: hahhah");
        Log.i(TAG, "initData: hahhah");
        Log.i(TAG, "initData: hahhah");
        Log.i(TAG, "initData: hahhah");







    }

    private void initView() {
        pull_list = (PullToRefreshListView) findViewById(R.id.pull);
        ad = new PullToRefreshAdapter(this);
        pull_list.setAdapter(ad);
        //pull_list.setRefreshing(false);

    }

    @Override
    public void onPullDownToRefresh(PullToRefreshBase refreshView) {

        // TODO: 2017/5/19


    }

    @Override
    public void onPullUpToRefresh(PullToRefreshBase refreshView) {

    }
}
