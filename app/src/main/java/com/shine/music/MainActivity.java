package com.shine.music;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.AudioManager;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AudioManager audioManager = ((AudioManager) getSystemService(Context.AUDIO_SERVICE));
        boolean isMusicActive = audioManager.isMusicActive();
        Log.e("shine",isMusicActive + "");
    }

    public void lastMusic(View view) {
        KeyEvent downEvent = new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_MEDIA_PREVIOUS);
        KeyEvent upEvent = new KeyEvent(KeyEvent.ACTION_UP, KeyEvent.KEYCODE_MEDIA_PREVIOUS);
        ((AudioManager) getSystemService(Context.AUDIO_SERVICE)).dispatchMediaKeyEvent(downEvent);
        ((AudioManager) getSystemService(Context.AUDIO_SERVICE)).dispatchMediaKeyEvent(upEvent);
    }

    public void playMusicLocal(View view) {
        KeyEvent downEvent = new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_MEDIA_PLAY_PAUSE);
        KeyEvent upEvent = new KeyEvent(KeyEvent.ACTION_UP, KeyEvent.KEYCODE_MEDIA_PLAY_PAUSE);
        ((AudioManager) getSystemService(Context.AUDIO_SERVICE)).dispatchMediaKeyEvent(downEvent);
        ((AudioManager) getSystemService(Context.AUDIO_SERVICE)).dispatchMediaKeyEvent(upEvent);
    }

    public void nextMusicLocal(View view) {
        KeyEvent downEvent = new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_MEDIA_NEXT);
        KeyEvent upEvent = new KeyEvent(KeyEvent.ACTION_UP, KeyEvent.KEYCODE_MEDIA_NEXT);
        ((AudioManager) getSystemService(Context.AUDIO_SERVICE)).dispatchMediaKeyEvent(downEvent);
        ((AudioManager) getSystemService(Context.AUDIO_SERVICE)).dispatchMediaKeyEvent(upEvent);
    }
}