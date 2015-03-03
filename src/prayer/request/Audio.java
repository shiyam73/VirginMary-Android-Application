package prayer.request;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class Audio extends Activity 
{
	Audio self;
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.audio);
		self=this;
		
		TextView ave_maria=(TextView) findViewById(R.id.ave_maria_mp3);
		ave_maria.setOnClickListener(new OnClickListener() 
		{
			public void onClick(View v) 
			{
				Common.heard=false;
				startActivity(new Intent(self,AveMariaMp3.class));
				
			}
		});
		
		TextView santo_rosario=(TextView) findViewById(R.id.san_rosario_mp3);
		santo_rosario.setOnClickListener(new OnClickListener() 
		{
			public void onClick(View v) 
			{
				Common.heard=false;
				startActivity(new Intent(self,SantoRosarioMp3.class));
				
			}
		});
		
		TextView devotional=(TextView) findViewById(R.id.devotional_mp3);
		devotional.setOnClickListener(new OnClickListener() 
		{
			
			public void onClick(View v) 
			{
				Common.heard=false;
				startActivity(new Intent(self,DevotionalMp3.class));
				
			}
		});
		
	}
	

	public boolean onKeyDown(int keyCode, KeyEvent event) 
	{
		startActivity(new Intent(self,GridMenu.class));
		finish();
		return true;
	}
	
}
