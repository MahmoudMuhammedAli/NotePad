package com.example.notepad;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class createNote extends Service {
    public createNote() {
    }

    @Override
    public void onCreate() {
        System.out.println("on create");
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        System.out.println("on start command");

        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        System.out.println("on destroy");

        super.onDestroy();
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}