package ar.toprs.com.mvparmsdemo.module;

import android.content.Intent;
import android.os.Bundle;

import com.jess.arms.base.BaseActivity;
import com.jess.arms.base.DefaultAdapter;
import com.jess.arms.di.component.AppComponent;


/**
 * Created by TY on 2017/11/2.
 */

public class UserActivity extends BaseActivity<UserPresenter>  implements  UserContract.View {
    @Override
    public void setAdapter(DefaultAdapter adapter) {
    }
    @Override
    public void startLoadMore() {
    }
    @Override
    public void endLoadMore() {
    }
    @Override
    public void setupActivityComponent(AppComponent appComponent) {
    }
    @Override
    public int initView(Bundle savedInstanceState) {
       return  0;
    }
    @Override
    public void initData(Bundle savedInstanceState) {
    }
    @Override
    public void showLoading() {
    }
    @Override
    public void hideLoading() {
    }
    @Override
    public void showMessage(String message) {
    }
    @Override
    public void launchActivity(Intent intent) {

    }
    @Override
    public void killMyself() {

    }
}
