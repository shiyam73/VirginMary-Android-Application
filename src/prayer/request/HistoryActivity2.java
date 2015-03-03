package prayer.request;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class HistoryActivity2 extends Activity 
{
	
	private Animation animShow, animHide;
	HistoryActivity2 self;
	public void onCreate(Bundle icicle) {
    	
        super.onCreate(icicle);
        Log.i("Enter into History Activity 2::::", "Yesudasan");
        setContentView(R.layout.history1);
        self=this;
        
        initPopup();
    }
    
    private void initPopup() {
    	
    	final TransparentPanel popup = (TransparentPanel) findViewById(R.id.popup_window1);

//    	  Start out with the popup initially hidden.
//    	popup.setVisibility(View.GONE);
    	
    	
    	animShow = AnimationUtils.loadAnimation( this, R.anim.popup_show);
    	animHide = AnimationUtils.loadAnimation( this, R.anim.popup_hide);
    	final ImageView   showButton = (ImageView) findViewById(R.id.show_history_button1);
    	final Button   hideButton = (Button) findViewById(R.id.hide_popup_button1);
    	
    	if(Common.visible)
        {
        	popup.setVisibility(View.VISIBLE);
			popup.startAnimation( animShow );
			showButton.setEnabled(false);
			hideButton.setEnabled(true);
        }
    	
    	showButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				popup.setVisibility(View.VISIBLE);
				popup.startAnimation( animShow );
				showButton.setEnabled(false);
				hideButton.setEnabled(true);
        }});
        
        hideButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				popup.startAnimation( animHide );
				showButton.setEnabled(true);
				hideButton.setEnabled(false);
				popup.setVisibility(View.GONE);
				Common.visible=false;
        }});


    	final TextView locationName = (TextView) findViewById(R.id.location_name1);
        final TextView locationDescription = (TextView) findViewById(R.id.location_description2);
        final ImageView back=(ImageView) findViewById(R.id.history_back);
        
        locationName.setText("History of Virgin Mary");
        locationDescription.setText("	Yet the Bible says nothing about Mary's death."
                                       + " This silence, combined with growing devotion to Mary, allowed new material to flourish."
                                       + " The deathbed scene is derived from apocryphal narratives describing Mary's last days and dying, as well as her funeral, burial,resurrection, and assumption into heaven."
                                       + " Versions of this story survive in Syriac and Greek texts dating from the third to the fifth centuries."
                                       + " Emperor Maurice (582–602) set August 15 for the feast of Mary's Dormition "+"("+"Koimesis, or"+"\""+"falling asleep"+")"
                                       + " throughout the Byzantine church, and since the late seventh century the Roman church has celebrated Mary's Assumption on the same date."
                                       + " Once the feast was officially placed in church calendars, its narratives shaped preaching, doctrine, and art.");
        
        back.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) 
			{
				startActivity(new Intent(self,HistoryActivity.class));
				finish();
			}
		});							
	}
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) 
    {
    	startActivity(new Intent(self,HistoryActivity.class));
    	finish();
    	return true;
    }
}
