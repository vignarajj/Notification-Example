 package noti.exm;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class NotifyexmActivity extends Activity {
	NotificationManager notmgr;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        notmgr=(NotificationManager)getSystemService(NOTIFICATION_SERVICE);
        final Notification notifyDetails=new Notification(R.drawable.pic2,"Button Checked",System.currentTimeMillis());
        Button start=(Button)findViewById(R.id.bt1);
        Button stop=(Button)findViewById(R.id.bt2);
start.setOnClickListener(new OnClickListener() {	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		CharSequence ContentTitle="Notification Details";
		CharSequence ContentText="Browse GOOGLE by Clicking";
		Intent notifyintent=new Intent(android.content.Intent.ACTION_VIEW,Uri.parse("http://www.google.co.in"));
		PendingIntent intent=PendingIntent.getActivity(NotifyexmActivity.this, 0,notifyintent,android.content.Intent.FLAG_ACTIVITY_NEW_TASK);
		notifyDetails.setLatestEventInfo(NotifyexmActivity.this, ContentTitle, ContentText, intent);
		notmgr.notify(0,notifyDetails);
	}
});
stop.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		notmgr.cancel(0);
		// TODO Auto-generated method stub
		
	}
});
{
	
}
    }
}   