package prayer.request;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class FadeVirgin extends Activity 
{
	//create name of animation
	Animation myFadeInAnimation;
	Animation myFadeOutAnimation;

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fade_virgin);
		
		//grab the imageview and load the animations
	    ImageView myImageView = (ImageView) findViewById(R.id.fading_virgin); 
	    Animation myFadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.fadein);
	    Animation myFadeOutAnimation = AnimationUtils.loadAnimation(this, R.anim.fadeout);

	 //fade it in, and fade it out. 
	    myImageView.startAnimation(myFadeInAnimation);
	    myImageView.startAnimation(myFadeOutAnimation);
	    Thread tread=new Thread()
	    {
	    	public void run() {
	    		try {
					sleep(4000);
					startActivity(new Intent(FadeVirgin.this,GridMenu.class));
					finish();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    	}
	    };
	    tread.start();
	 }

	
}
