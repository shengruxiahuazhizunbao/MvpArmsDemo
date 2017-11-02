package ar.toprs.com.mvparmsdemo.module;

import com.jess.arms.di.scope.ActivityScope;
import com.jess.arms.mvp.BasePresenter;

import javax.inject.Inject;

/**
 * Created by TY on 2017/11/2.
 */
@ActivityScope
public class UserPresenter  extends BasePresenter<UserContract.Model,UserContract.View>{
    
    @Inject
    public UserPresenter(UserContract.Model model, UserContract.View rootView) {
        super(model, rootView);
    }
    //这里定义业务方法,相应用户的交互
    public void requestUsers(final  boolean pullToRefresh){
        
    }
    
}
