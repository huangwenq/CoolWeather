package com.example.coolweather;

import com.idescout.sql.SqlScoutServer;

import org.litepal.LitePalApplication;

/**
 * Created by VULCAN on 2017/12/12.
 */

public class BaseApplication extends LitePalApplication {


    @Override
    public void onCreate() {
        super.onCreate();
        SqlScoutServer.create(this, getPackageName());
    }
}
