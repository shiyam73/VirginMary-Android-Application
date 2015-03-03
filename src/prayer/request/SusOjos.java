package prayer.request;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.TextView;

public class SusOjos extends Activity 
{
	SusOjos self;
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sus_ojas);
		
		self=this;
		
		TextView sus_ojos=(TextView) findViewById(R.id.sus_ojos_tv);
		sus_ojos.setText("   According to many scientists who have inspected the image, it seems that in her eyes, in both of them and in the precise location as reflected by a live human eye, could be seen many figures that have been extensively analyzed and seem to correspond to the shape and size of human figures located in front of the image.");
		
		TextView sus_ojos1=(TextView) findViewById(R.id.sus_ojos_tv1);
		sus_ojos1.setText("   In 1929, Alfonso Marcue, who was the official photographer of the old Basilica of Guadalupe in Mexico City, found what seemed to be a clear image of a bearded man reflected in the right eye of the Virgin. Initially he did not believe what was before his eyes. How could it be? A bearded man inside of the eyes of the Virgin?. After many inspections of many of his black and white photographs he had no doubts and decided to inform the authorities of the Basilica. He was told that time to keep complete silence about the discovery, which he did.");
		
		TextView sus_ojos2=(TextView) findViewById(R.id.sus_ojos_tv2);
		sus_ojos2.setText("   More than 20 years later, on May 29, 1951, Jose Carlos Salinas Chavez, examining a good photograph of the face, rediscovers the image of what clearly appears to be a bearded man reflected in the right eye of the Virgin, and locates it on the left eye too.");
		
		TextView sus_ojos3=(TextView) findViewById(R.id.sus_ojos_tv3);
		sus_ojos3.setText("   Since then, many people had the opportunity to inspect closely the eyes of the Virgin on the tilma, including more than 20 physicians, ophthalmologists.");
		
		TextView sus_ojos4=(TextView) findViewById(R.id.sus_ojos_tv4);
		sus_ojos4.setText("   The first one, on March 27, 1956, was Dr. Javier Torroella Bueno, MDS, a prestigious ophthalmologist. In what is the first report on the eyes of the image issued by a physician, he certifies what seems to be the presence of the triple reflection (Samson-Purkinje effect) characteristic of all live human eyes and states that the resulting images are located exactly where they are supossed to be according to such effect, and also that the distortion of the images agree with the curvature of the cornea.");
		
		TextView sus_ojos5=(TextView) findViewById(R.id.sus_ojos_tv5);
		sus_ojos5.setText("   The same year another ophthalmologist, Dr. Rafael Torrija Lavoignet, examined the eyes of the image with an ophthalmoscope in great detail. He observed the apparent human figure in the corneas of both eyes, with the location and distortion of a normal human eye and specially noted a unique appearance of the eyes: they look strangely"+ "\""+"alive"+"\""+ "when examined.");
		
		TextView sus_ojos6=(TextView) findViewById(R.id.sus_ojos_tv6);
		sus_ojos6.setText("   Many other examinations by ophthalmologists have been done of the eyes of the image on the tilma after these first ones. With more or less details all agree with the conclusions of the ones mentioned above.");
		
		TextView sus_ojos7=(TextView) findViewById(R.id.sus_ojos_tv7);
		sus_ojos7.setText("   A new and interesting kind of analysis of the eyes started in 1979, when Dr. Jose Aste Tonsmann, Ph D, graduated from Cornell University, while working in IBM scanned at very high resolutions a very good photograph, taken from the original, of the face on the tilma. After filtering and processing the digitized images of the eyes to eliminate "+ "\""+"noise" +"\""+ " and enhance them, he reports he made some astonishing discoveries: not only the "+ "\""+"human bust"+"\""+ " was clearly present in both eyes, but another human figures were seen as reflected in the eyes too.");
		
		TextView sus_ojos8=(TextView) findViewById(R.id.sus_ojos_tv8);
		sus_ojos8.setText("   Dr. Aste Tonsmann published his last studies on the eyes on the tilma in the book "+ "\""+"El Secreto de sus Ojos"+"\""+ ", with complete details and photographs of his work . Perhaps one of the most interesting aspects of the studies is his conclusion that Our Lady of Guadalupe not only left us her miraculous image as proof of her apparition but some important messages too. These messages were hidden in the eyes on the image until our times, when new technologies would allow them to be discovered, when they are most necessary.");
		
		TextView sus_ojos9=(TextView) findViewById(R.id.sus_ojos_tv9);
		sus_ojos9.setText("   That would be the case with the image of a family in the center of the Virgin's eye, in times when families are under serious attack in our modern world. The image of various human figures that seem to constitute a family, including various children and a baby carried in the woman's back as used in the 16th century, appears in the center of the pupil, as shown in this great image of the right eye highlighting the family, generously provided by Dr. Tonsmann.");
	}
	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) 
	{
		startActivity(new Intent(self,GridMenu.class));
		finish();
		return super.onKeyDown(keyCode, event);
	}
}
