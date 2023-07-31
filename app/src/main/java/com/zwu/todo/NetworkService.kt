package com.zwu.todo

import android.app.Service
import android.content.Intent
import android.os.IBinder
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.scopes.ServiceScoped
import io.reactivex.rxjava3.core.Observable;

class NetworkService: Service() {
    override fun onBind(p0: Intent?): IBinder? {
        TODO("Not yet implemented")
    }

    fun getTodoList(): Observable<TodoItem> {
        return Observable.fromCallable { TodoItem("test", java.sql.Timestamp(0)) }
    }
}