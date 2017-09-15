package com.coolweather.app.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by LX-PC on 2017/5/23.
 */

public class CoolWeatherOpenHelper extends SQLiteOpenHelper {

    //Province表
    public static final String CREATE_PROVINCE = "create table Province("
        + "id integer primary key autoincrement,"
        + "province_name text,"
        +"province_code text)";

    //City
    public static final String CREATE_CITY = "create_city("
        + "id integer primary key autoincrement,"
        + "city_name text,"
        + "city_code text,"
        + "province_id integer)";

    //County
    public static final String CREATE_COUNTY = "create_county("
            + "id integer primary key autoincrement,"
            + "county_name text,"
            + "county_code text,"
            + "city_id integer)";

    public CoolWeatherOpenHelper(Context context , String name , SQLiteDatabase.CursorFactory factory , int version){
        super (context , name , factory , version);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL(CREATE_PROVINCE);
        db.execSQL(CREATE_CITY);
        db.execSQL(CREATE_COUNTY);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db , int oldVersion , int newVersion){

    }

}
