package ar.toprs.com.mvparmsdemo.module;

import com.jess.arms.di.component.AppComponent;
import com.jess.arms.di.scope.ActivityScope;

import dagger.Component;

/**
 * Created by TY on 2017/11/2.
 */
@ActivityScope
@Component(modules = UserModule.class,dependencies = AppComponent.class)
public interface UserComponent {
    void  inject ();
}
