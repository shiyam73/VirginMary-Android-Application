package prayer.request;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class VirginMaryActivity extends Activity 
{
	VirginMaryActivity self;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        self=this;
        ImageView virgin_start=(ImageView)findViewById(R.id.virgin_start_button);
        virgin_start.setOnClickListener(new OnClickListener() 
        {
        	public void onClick(View v) 
        	{
				startActivity(new Intent(self,FadeVirgin.class));
				finish();
			}
		});
    }
}