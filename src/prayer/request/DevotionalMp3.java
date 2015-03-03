package prayer.request;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.Toast;

public class DevotionalMp3 extends Activity implements OnClickListener
{
	ImageView playButton;
	DevotionalMp3 self;
	MediaPlayer mediaPlayer;
	
	
		
		public void onClick(View v) 
		{
			Log.d("DevotionalMp3","onClicked"+v);
			if(v.getId() == R.id.pause_button)
			{
				playpause();
			}
		}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.music);
		
		self=this;
		Log.d("onCreate ():::","Calling......");
		if(Common.heard == false)
		{
			Log.d("Heard","heard is calling"+Common.heard);
			Common.mediaPlayer=MediaPlayer.create(this, R.raw.devotion);
			Common.mediaPlayer.setLooping(false);
			mediaPlayer=Common.mediaPlayer;
    		playButton = (ImageView) findViewById(R.id.pause_button);
			
			playButton.setOnClickListener(this);
			
			play();
			Common.heard=true;
		}
		else 
		{
			Log.d("Heard","heard is calling"+Common.heard);
			mediaPlayer=Common.mediaPlayer;
			playButton = (ImageView) findViewById(R.id.pause_button);
			playButton.setOnClickListener(this);
			
			playpause();
			
		}

	}
	public void pause()
	{
		mediaPlayer.pause();
		playButton.setImageResource(R.drawable.play_button);
		Toast.makeText(this, "Stopped Devotional Mp3", Toast.LENGTH_LONG).show();
		Log.d("Pause","pause method is calling");

	}
	
	public void play()
	{
		mediaPlayer.start();
		playButton.setImageResource(R.drawable.pause_button);
		Toast.makeText(this, "Playing Devotional Mp3", Toast.LENGTH_LONG).show();
		Log.d("Play","play method is calling");

	}
	
	public void playpause()
	{
		if(mediaPlayer.isPlaying())
		{
			pause();
			
		}
		else
		{
			play();
		}
	}
	
	
	@Override
	protected void onPause() 
	{
		// TODO Auto-generated method stub
		super.onPause();
		mediaPlayer.pause();
	}

}
