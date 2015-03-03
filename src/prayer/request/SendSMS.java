package prayer.request;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.text.Html;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SendSMS extends Activity 
{
	SendSMS self;
	String phoneNo="8144739975",message;
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.send_sms);
		
		self=this;
		
		
		
		ImageView send=(ImageView) findViewById(R.id.send_petition);
		send.setOnClickListener(new OnClickListener() 
		{
			public void onClick(View v) 
			{
				EditText recipient_msg=(EditText) findViewById(R.id.prayer_msg);
				message=recipient_msg.getText().toString();
				if(message.equals(""))
				{
					showAppDialog1();
					
				}
				else
				{
					sendSms(phoneNo,message);
					
					Toast.makeText(self, "Petition Send", Toast.LENGTH_LONG).show();
					startActivity(new Intent(self,GridMenu.class));
					finish();
					

				}
				
				
			}
		});
		
		
	}
	private void sendSms(String phoneNo2, String message2) 
	{
		PendingIntent pi=PendingIntent.getActivity(self, 0, new Intent(self,GridMenu.class), 0);
		SmsManager sms=SmsManager.getDefault();
		sms.sendTextMessage(phoneNo2, null, message2, pi, null);
		
		
	}
	
	/*public void showAppDialog()
	{
		
		AlertDialog.Builder ab=new AlertDialog.Builder(SendSMS.this);
		ab.setMessage(Html.fromHtml("<b><font color=#C12267> Prayer Request " +"</font></b><br>Send Successfully"));
		ab.setPositiveButton("ok", new DialogInterface.OnClickListener()
		{

			@Override
			public void onClick(DialogInterface dialog, int which) 
			{
				startActivity(new Intent(SendSMS.this,GridMenu.class));
				finish();
			}
			
		});
		ab.show();
	}*/
	public void showAppDialog1()
	{
		
		Builder alertDialog = new AlertDialog.Builder(SendSMS.this);
		alertDialog.setTitle("Caution..");
		alertDialog.setMessage("Please enter your Request...");
		alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() 
		{
			
			public void onClick(DialogInterface dialog, int which) 
			{
				
				startActivity(new Intent(SendSMS.this,SendSMS.class));
				finish();
			}
		});
		
		alertDialog.setIcon(R.drawable.warranty);
		alertDialog.show();
	}
	
	@Override
    public boolean onKeyDown(int keyCode, KeyEvent event) 
    {
    	startActivity(new Intent(self,GridMenu.class));
    	finish();
    	return true;
    }
}
