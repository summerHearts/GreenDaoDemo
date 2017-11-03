package com.example.kenvin.greendaodemo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.example.kenvin.greendaodemo.gen.DaoMaster;
import com.example.kenvin.greendaodemo.gen.UserDao;

import org.greenrobot.greendao.database.Database;

/**
 * Created by Kenvin on 2017/11/2.
 */
public class DownloadOpenHelper extends DaoMaster.OpenHelper{


    public DownloadOpenHelper(Context context, String name) {
        super(context, name);
    }

    public DownloadOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory) {
        super(context, name, factory);
    }
    /**
     * 升级数据库
     * @param db
     * @param oldVersion
     * @param newVersion
     */
    @Override
    public void onUpgrade(Database db, int oldVersion, int newVersion) {
        //操作数据库的更新

        MigrationHelper.getInstance().migrate(db,UserDao.class);
        Log.i("MANAGWR", "更新了数据库");
    }
}
