package com.androidbook.myfirstandroidapp;

import android.app.Activity;
import android.os.Bundle;
import android.media.MediaPlayer;
import android.net.Uri;

public class MyFirstAndroidAppActivity extends Activity {
    private MediaPlayer mp;
    
    public void playMusicFromWeb() {
    	try {
    		Uri file = Uri.parse("http://www.smildata.appspot.com/AudioSource?id=4002");
    		mp = MediaPlayer.create(this, file);
    		mp.start();
    	}
    	catch (Exception e) {
    	}
    }
		
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        playMusicFromWeb();
    }

	@Override
	protected void onStop() {
		if (mp !=null) {
			mp.stop();
			mp.release();
		}
		super.onStop();
	}
    
    
}