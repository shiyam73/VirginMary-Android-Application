package prayer.request;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

public class GalleryActivity extends Activity 
{
	GalleryActivity self;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gallery);
        self=this;
        Gallery g = (Gallery) this.findViewById(R.id.Gallery);  
        g.setAdapter(new ImageAdapter(this));
    }
    
    public class ImageAdapter extends BaseAdapter 
    {  

        private Context mContext;  
        private Integer[] mImageIds = {  
                //each image's size is 320x60
                R.drawable.eustache_le_sueur,  
                R.drawable.madonna_in_sorrow,  
                R.drawable.madonna_catacomb,
                R.drawable.mary,
                R.drawable.maryleft,
                R.drawable.santorosario,
                R.drawable.guadalupa
                
        };  
        public ImageAdapter(Context c)
        {  
            this.mContext = c;  
        }
       public int getCount() 
        {
            // TODO Auto-generated method stub
            return mImageIds.length;
        }
       
        public Object getItem(int position) 
        {
            // TODO Auto-generated method stub
            return null;
        }
      
        public long getItemId(int position)
        {
            // TODO Auto-generated method stub
            return 0;
        }
       
        public View getView(int position, View convertView, ViewGroup parent) 
        {
            // TODO Auto-generated method stub
            ImageView imageView = new ImageView(mContext);  
            imageView.setImageResource(mImageIds[position]);  
            imageView.setLayoutParams(new Gallery.LayoutParams(420,360));    
            return imageView;  
        }
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) 
    {
    	startActivity(new Intent(self,GridMenu.class));
    	finish();
    	return true;
    }
}