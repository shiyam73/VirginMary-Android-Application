package prayer.request;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;

public class MantoEstelar extends Activity 
{
	MantoEstelar self;
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.manto_estaler);
		self=this;
	}
	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) 
	{
		startActivity(new Intent(self,GridMenu.class));
		finish();
		return super.onKeyDown(keyCode, event);
	}
}
