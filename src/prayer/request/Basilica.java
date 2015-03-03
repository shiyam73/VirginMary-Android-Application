package prayer.request;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;

public class Basilica extends Activity 
{
	Basilica self;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.basilica);
		
		self=this;
	}
	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		// TODO Auto-generated method stub
		startActivity(new Intent(self,GridMenu.class));
		finish();
		return super.onKeyDown(keyCode, event);
	}
}
