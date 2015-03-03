package prayer.request;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class HistoryActivity extends Activity 
{
	private Animation animShow, animHide;
	HistoryActivity self;
	public void onCreate(Bundle icicle) {
    	
        super.onCreate(icicle);

        setContentView(R.layout.history);
        self=this;
        initPopup();
    }
    
    private void initPopup() {
    	
    	final TransparentPanel popup = (TransparentPanel) findViewById(R.id.popup_window);

    	//  Start out with the popup initially hidden.
    	popup.setVisibility(View.GONE);
    	
    	
    	animShow = AnimationUtils.loadAnimation( this, R.anim.popup_show);
    	animHide = AnimationUtils.loadAnimation( this, R.anim.popup_hide);
    	
    	final ImageView   showButton = (ImageView) findViewById(R.id.show_history_button);
    	final Button   hideButton = (Button) findViewById(R.id.hide_popup_button);
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
        }});


    	final TextView locationName = (TextView) findViewById(R.id.location_name);
        final TextView locationDescription = (TextView) findViewById(R.id.location_description);
        final ImageView more=(ImageView) findViewById(R.id.history_more);
        
        locationName.setText("History of Virgin Mary");
        locationDescription.setText("	In Byzantine icons and Western medieval art, the most common deathbed scene is that of the Virgin Mary."
        							+ " In her study of Marian iconography, Gertrud Schiller reproduced more than 100 images of Mary reclining" 
        							+ " in bed surrounded by the apostles who grieve, pray, and in late medieval art perform the rites for the dying."
        							+ " In these images, Jesus either stands at the bedside or hovers above it, and holds Mary's soul in the form"
        							+ " of a young child. This scene reflects the belief that Mary was the mother of Jesus, the incarnate Son of God,"
        							+ " and therefore enjoyed the privilege of an especially holy death.");
        
        more.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) 
			{
				startActivity(new Intent(self,HistoryActivity2.class));
				finish();
			}
		});							
	}
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) 
    {
    	startActivity(new Intent(self,GridMenu.class));
    	finish();
    	return true;
    }
}
