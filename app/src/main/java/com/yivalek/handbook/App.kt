package com.yivalek.handbook

import android.app.Application
import com.yivalek.handbook.data.MainDB

public class App : Application() {
    val dataBase by lazy {
        MainDB.createDataBase(this)
    }
}
