package prayer.request;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class GridMenu extends Activity 
{
	GridView grid_main;
	Intent intent;
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.base_grid);
		Log.i("ListMenu Activity...:::", "Calling...");
		
		
        grid_main = (GridView)findViewById(R.id.GridView01);
        grid_main.setAdapter(new ImageAdapter(this));
        
	}
	public class ImageAdapter extends BaseAdapter
    {
        Context mContext;
        public static final int ACTIVITY_CREATE = 10;
        public ImageAdapter(Context c)
        {
//        	Log.i("ImageAdaptor Class ...:::", "Calling");
            mContext = c;
        }
       
		public int getCount() {
			// TODO Auto-generated method stub
//			Log.i("ImageAdaptor Class getCount()...:::", "Calling");
			return 10;
		}
		public Object getItem(int position) {
			// TODO Auto-generated method stub
			return null;
		}
		public long getItemId(int position) {
			// TODO Auto-generated method stub
			return 0;
		}
		public View getView(int position, View convertView, ViewGroup parent) {
			View v;
			Log.i("ImageAdaptor Class. getView(int position, View convertView, ViewGroup parent)...:::", "Calling");
            if(convertView==null){
                LayoutInflater li = getLayoutInflater();
                v = li.inflate(R.layout.gridmenu_contant, null);
                Log.i("ImageAdaptor Class. if(convertView==null)..:::", "Calling"+v);
                
                
                switch(position)
                {
                	case 0:
                		Log.i("ImageAdaptor Class. getView(int position, View convertView, ViewGroup parent).. switch(0)...:::", "Calling");
                		TextView tv = (TextView)v.findViewById(R.id.icon_text);
                        tv.setText("Historica");
                        ImageView iv = (ImageView)v.findViewById(R.id.icon_image);
                        iv.setImageResource(R.drawable.history);
                        
                        iv.setOnClickListener(new OnClickListener() 
                        {
							
							public void onClick(View v) 
							{
								
                				startActivity(new Intent(GridMenu.this,HistoryActivity.class));
                				finish();
                				
							}
						});
                        break;
                	case 1:
                		Log.i("ImageAdaptor Class. getView(int position, View convertView, ViewGroup parent).. switch(1)...:::", "Calling");
                		TextView tv1 = (TextView)v.findViewById(R.id.icon_text);
                        tv1.setText("Monto Estelar");
                        ImageView iv1 = (ImageView)v.findViewById(R.id.icon_image);
                        iv1.setImageResource(R.drawable.manto_estelar);
                        iv1.setOnClickListener(new OnClickListener() 
                        {
							
							public void onClick(View v)
							{
								
                				startActivity(new Intent(GridMenu.this,MantoEstelar.class));
                				finish();
							}
						});
                        break;
                	case 2:
                		Log.i("ImageAdaptor Class. getView(int position, View convertView, ViewGroup parent).. switch(2)...:::", "Calling");
                		TextView tv2 = (TextView)v.findViewById(R.id.icon_text);
                        tv2.setText("Sus Ojos");
                        ImageView iv2 = (ImageView)v.findViewById(R.id.icon_image);
                        iv2.setImageResource(R.drawable.sus_ojos);
                        iv2.setOnClickListener(new OnClickListener() 
                        {
							
							public void onClick(View v) 
							{
								
                				startActivity(new Intent(GridMenu.this,SusOjos.class));	
								finish();
							}
						});
						break;
                	case 3:
                		Log.i("ImageAdaptor Class. getView(int position, View convertView, ViewGroup parent).. switch(3)...:::", "Calling");
                		TextView tv3 = (TextView)v.findViewById(R.id.icon_text);
                        tv3.setText("Audio");
                        ImageView iv3 = (ImageView)v.findViewById(R.id.icon_image);
                        iv3.setImageResource(R.drawable.audio);
                        iv3.setOnClickListener(new OnClickListener() 
                        {
							
							public void onClick(View v)
							{
								startActivity(new Intent(GridMenu.this,Audio.class));	
								finish();
							}
						});
                        break;
                	case 4:
                		Log.i("ImageAdaptor Class. getView(int position, View convertView, ViewGroup parent).. switch(2)...:::", "Calling");
                		TextView tv4 = (TextView)v.findViewById(R.id.icon_text);
                        tv4.setText("Santo Rosario");
                        ImageView iv4 = (ImageView)v.findViewById(R.id.icon_image);
                        iv4.setImageResource(R.drawable.santa);
                        iv4.setOnClickListener(new OnClickListener() 
                        {
							
							public void onClick(View v) 
							{
								
                				startActivity(new Intent(GridMenu.this,SantoRosario.class));	
								finish();
							}
						});
						break;
                	case 5:
                		Log.i("ImageAdaptor Class. getView(int position, View convertView, ViewGroup parent).. switch(2)...:::", "Calling");
                		TextView tv5 = (TextView)v.findViewById(R.id.icon_text);
                        tv5.setText("San Juan Diego");
                        ImageView iv5 = (ImageView)v.findViewById(R.id.icon_image);
                        iv5.setImageResource(R.drawable.san_juan);
                        iv5.setOnClickListener(new OnClickListener() 
                        {
							
							public void onClick(View v) 
							{
								
                				startActivity(new Intent(GridMenu.this,SanJuanDiego.class));	
								finish();
							}
						});
						break;
                	case 6:
                		Log.i("ImageAdaptor Class. getView(int position, View convertView, ViewGroup parent).. switch(2)...:::", "Calling");
                		TextView tv6 = (TextView)v.findViewById(R.id.icon_text);
                        tv6.setText("La Basilica");
                        ImageView iv6 = (ImageView)v.findViewById(R.id.icon_image);
                        iv6.setImageResource(R.drawable.basilica);
                        iv6.setOnClickListener(new OnClickListener() 
                        {
							
							public void onClick(View v) 
							{
								
                				startActivity(new Intent(GridMenu.this,Basilica.class));	
								finish();
							}
						});
						break;
                	case 7:
                		Log.i("ImageAdaptor Class. getView(int position, View convertView, ViewGroup parent).. switch(2)...:::", "Calling");
                		TextView tv7 = (TextView)v.findViewById(R.id.icon_text);
                        tv7.setText("Petician");
                        ImageView iv7 = (ImageView)v.findViewById(R.id.icon_image);
                        iv7.setImageResource(R.drawable.petition);
                        iv7.setOnClickListener(new OnClickListener() 
                        {
							
							public void onClick(View v) 
							{
								
                				startActivity(new Intent(GridMenu.this,SendSMS.class));	
								finish();
							}
						});
						break;
                	case 8:
                		Log.i("ImageAdaptor Class. getView(int position, View convertView, ViewGroup parent).. switch(2)...:::", "Calling");
                		TextView tv8 = (TextView)v.findViewById(R.id.icon_text);
                        tv8.setText("Galeria");
                        ImageView iv8 = (ImageView)v.findViewById(R.id.icon_image);
                        iv8.setImageResource(R.drawable.gallery);
                        iv8.setOnClickListener(new OnClickListener() 
                        {
							public void onClick(View v) 
							{
								
                				startActivity(new Intent(GridMenu.this,GalleryActivity.class));	
								finish();
							}
						});
						break;
                	case 9:
                		Log.i("ImageAdaptor Class. getView(int position, View convertView, ViewGroup parent).. switch(2)...:::", "Calling");
                		TextView tv9 = (TextView)v.findViewById(R.id.icon_text);
                        tv9.setText("Exit");
                        ImageView iv9 = (ImageView)v.findViewById(R.id.icon_image);
                        iv9.setImageResource(R.drawable.exit);
                        iv9.setOnClickListener(new OnClickListener() 
                        {
							
							public void onClick(View v) 
							{
								android.os.Process.killProcess(android.os.Process.myPid());
                				
							}
						});
						break;
                }
                
            }
            else
            {
                v = convertView;
            }
            return v;
		}
    }
	
	
	public void showAppDialog()
	{
		Log.i("showAppDialog()...:::", "Calling");
		AlertDialog.Builder ab=new AlertDialog.Builder(GridMenu.this);
		ab.setMessage(Html.fromHtml("<b><font color=#ff0000> Html View " +"</font></b><br>Androidpeople.com"));
		ab.setPositiveButton("ok", null);
		ab.show();
	}

}
