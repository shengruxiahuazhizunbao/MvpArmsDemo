package ar.toprs.com.mvparmsdemo.module;

import com.jess.arms.integration.IRepositoryManager;
import com.jess.arms.mvp.BaseModel;

import java.util.List;

import ar.toprs.com.mvparmsdemo.Bean.User;
import io.reactivex.Observable;

/**
 * Created by TY on 2017/11/2.
 */

public class UserModel extends BaseModel  implements UserContract.Model {
    public UserModel(IRepositoryManager repositoryManager) {
        super(repositoryManager);
    }
    @Override
    public Observable<List<User>> getUsers(int lastIdQueried, boolean update) {
        return null;
    }
}
