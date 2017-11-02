package ar.toprs.com.mvparmsdemo;

import android.app.Application;
import android.content.Context;
import android.support.v4.app.FragmentManager;

import com.jess.arms.base.delegate.AppLifecycles;
import com.jess.arms.http.GlobalHttpHandler;
import com.jess.arms.integration.ConfigModule;

import java.util.List;

/**
 * Created by TY on 2017/11/2.
 */

public class GlobalConfigModule  implements ConfigModule {
    @Override
    public void applyOptions(Context context, com.jess.arms.di.module.GlobalConfigModule.Builder builder) {
        //使用builder可以为框架配置一些配置信息
        //使用builder可以为框架配置一些配置信息
//        builder.baseurl(Api.APP_DOMAIN)
//                .cacheFile(New File("cache"));
        
       
    }
      
    @Override
    public void injectAppLifecycle(Context context, List<AppLifecycles> lifecycles) {
//向Application的生命周期中注入一些自定义逻辑
        lifecycles.add(new AppLifecycles() {
            
            
            @Override
            public void attachBaseContext(Context base) {
                
            }

            @Override
            public void onCreate(Application application) {

            }

            @Override
            public void onTerminate(Application application) {

            }
        });
        
    }

    @Override
    public void injectActivityLifecycle(Context context, List<Application.ActivityLifecycleCallbacks> lifecycles) {
//向Activity的生命周期中注入一些自定义逻辑
    }

    @Override
    public void injectFragmentLifecycle(Context context, List<FragmentManager.FragmentLifecycleCallbacks> lifecycles) {
//向Fragment的生命周期中注入一些自定义逻辑
    }
}
