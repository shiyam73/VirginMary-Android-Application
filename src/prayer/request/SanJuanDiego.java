package prayer.request;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.TextView;

public class SanJuanDiego extends Activity 
{
	SanJuanDiego self;
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.san_juan_diego);
		self=this;
		
		TextView tv=(TextView) findViewById(R.id.san_juan_diego_tv);
		TextView tv1=(TextView) findViewById(R.id.san_juan_diego_tv1);
		TextView tv2=(TextView) findViewById(R.id.san_juan_diego_tv2);
		TextView tv3=(TextView) findViewById(R.id.san_juan_diego_tv3);
		TextView tv4=(TextView) findViewById(R.id.san_juan_diego_tv4);
		TextView tv5=(TextView) findViewById(R.id.san_juan_diego_tv5);
		TextView tv6=(TextView) findViewById(R.id.san_juan_diego_tv6);
		TextView tv7=(TextView) findViewById(R.id.san_juan_diego_tv7);
		TextView tv8=(TextView) findViewById(R.id.san_juan_diego_tv8);
		TextView tv9=(TextView) findViewById(R.id.san_juan_diego_tv9);
		
		tv.setText("Oracion a San Juan Diego");
		tv1.setText("Feastday: December 9  b.1474 d.1548");
		tv2.setText("   Juan Diego was born in 1474 in the calpulli or ward of Tlayacac in Cuauhtitlan, which was established in 1168 by Nahua tribesmen and conquered by the Aztec lord Axayacatl in 1467; and was located 20 kilometers (14 miles) north of Tenochtitlan (Mexico City).");
		tv3.setText("   On December 9, 1531, a native Mexican named Juan Diego rose before dawn to walk fifteen miles to daily Mass in what is now Mexico City. Juan lived a simple life as a weaver, farmer, and laborer. That morning, as Juan passed Tepeyac Hill, he heard music and saw a glowing cloud encircled by a rainbow. A woman's voice called him to the top of the hill. There he saw a beautiful young woman dressed like an Aztec princess. She said she was the Virgin Mary and asked Juan to tell the bishop to build a church on that site. She said, "+ "\""+"I vividly desire that a church be built on this site, so that in it I can be present and give my love, compassion, help, and defense, for I am your most devoted mother . . . to hear your laments and to remedy all your miseries, pains, and sufferings."+"\""+ "");
		tv4.setText("   The bishop was kind but skeptical. He asked Juan to bring proof of the Lady's identity. Before Juan could go back to the Lady, he found out his uncle was dying. Hurrying to get a priest, Juan missed his meeting with the Lady. The Lady, however, met him on his path and told him that his uncle had been cured.");
		tv5.setText("   She then told Juan to climb to the top of the hill where they first met. Juan was shocked to find flowers growing in the frozen soil. He gathered them in his cloak and took them at once to the bishop.");
		tv6.setText("   Juan told the bishop what had happened and opened his cloak. The flowers that fell to the ground were Castilian roses (which were not grown in Mexico). But the bishop's eyes were on the glowing image of the Lady imprinted inside Juan's cloak.");
		tv7.setText("   Soon after, a church was built on the site where our Lady appeared, and thousands converted to Christianity. Our Lady of Guadalupe was declared the patroness of the Americas.");
		tv8.setText("   He died on May 30, 1548, at the age of 74.");
		tv9.setText("   Juan Diego deeply loved the Holy Eucharist, and by special permission of the Bishop he received Holy Communion three times a week, a highly unusual occurrence in those times.");
	}
	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) 
	{
		startActivity(new Intent(self,GridMenu.class));
		finish();
		return super.onKeyDown(keyCode, event);
	}
}
