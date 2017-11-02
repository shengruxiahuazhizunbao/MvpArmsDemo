package ar.toprs.com.mvparmsdemo.module;

import com.jess.arms.base.DefaultAdapter;
import com.jess.arms.mvp.IModel;
import com.jess.arms.mvp.IView;

import java.util.List;

import ar.toprs.com.mvparmsdemo.Bean.User;
import io.reactivex.Observable;

/**
 * Created by TY on 2017/11/2.
 */

public interface UserContract {
    interface View extends IView{
        void setAdapter(DefaultAdapter adapter);
        void startLoadMore();
        void endLoadMore();
        
    }
    //Model层定义接口,外部只需关心Model返回的数据,无需关心内部细节,即是否使用缓存
    interface Model extends IModel {
        Observable<List<User>> getUsers(int lastIdQueried, boolean update);
    }
    
    
}
