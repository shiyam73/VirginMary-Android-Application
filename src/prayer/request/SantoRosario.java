package prayer.request;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.TextView;

public class SantoRosario extends Activity
{	
	SantoRosario self;
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.santo_rosario);
		
		self=this;
		TextView tv1=(TextView) findViewById(R.id.santo_rosario__tv1);
		tv1.setText("	By the sign of the Cross, deliver us from our enemies Lord our God.   In the name of the Father and the Son and the Holy Spirit. Amen.");
		
		TextView tv2=(TextView) findViewById(R.id.santo_rosario__tv2);
		tv2.setText("	Lord Jesus Christ, God and true man, Creator, Father and Redeemer, for being you who you are, infinite goodness, and because I love above all things, I regret having offended Thee my heart, I am sorry because you can also punished with the pains of hell. Aided by your divine grace, firmly resolve never to sin, confess and do penance I were imposed. Amen.");
		
		TextView tv3=(TextView) findViewById(R.id.santo_rosario__tv3);
		tv3.setText("	Our Father who art in heaven, hallowed be thy name Thy kingdom, Thy will be done on earth as in heaven. Give us this day our daily bread and forgive us our trespasses as we forgive those who trespass against us Lead us not into temptation, but deliver us from evil. Amen.");
		
		TextView tv4=(TextView) findViewById(R.id.santo_rosario__tv4);
		tv4.setText("	Hail Mary, full of grace, the Lord is with thee: blessed art thou among women and blessed is the fruit of thy womb, Jesus. Holy Mary, Mother of God, pray for us sinners now and at the hour of our death. Amen.");
		
		TextView tv5=(TextView) findViewById(R.id.santo_rosario__tv5);
		tv5.setText("   -Glory to the Father and the Son, and Holy Spirit.");
		
		TextView tv6=(TextView) findViewById(R.id.santo_rosario__tv6);
		tv6.setText("   -As it was in the beginning is now and always");
			
		TextView tv7=(TextView) findViewById(R.id.santo_rosario__tv7);
		tv7.setText("    and forever and ever. Amen.");
	}
	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) 
	{
		startActivity(new Intent(self,GridMenu.class));
		finish();
		return super.onKeyDown(keyCode, event);
	}
}
