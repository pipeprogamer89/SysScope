package com.sys.scope;

import android.animation.*;
import android.app.*;
import android.app.Activity;
import android.app.DialogFragment;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.*;
import android.content.Context;
import android.content.Intent;
import android.content.res.*;
import android.graphics.*;
import android.graphics.Typeface;
import android.graphics.drawable.*;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.*;
import android.net.*;
import android.net.Uri;
import android.os.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.view.*;
import android.view.View;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import java.io.*;
import java.text.*;
import java.text.DecimalFormat;
import java.util.*;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.*;
import org.json.*;

public class MainActivity extends Activity {
	
	private Timer _timer = new Timer();
	
	private double mem_usage = 0;
	private double mem_max = 0;
	private String out = "";
	private String arch = "";
	private String kernelVersion = "";
	private boolean start = false;
	private double ping = 0;
	private double one = 0;
	
	private LinearLayout linear2;
	private LinearLayout linear3;
	private LinearLayout linear4;
	private ImageView imageview42;
	private TextView textview1;
	private ImageView imageview28;
	private LinearLayout devlay;
	private LinearLayout syslay;
	private LinearLayout batlay;
	private ScrollView vscroll1;
	private LinearLayout linear5;
	private LinearLayout linear9;
	private LinearLayout linear10;
	private LinearLayout linear11;
	private LinearLayout linear12;
	private LinearLayout linear13;
	private LinearLayout linear14;
	private LinearLayout linear15;
	private LinearLayout linear16;
	private LinearLayout linear17;
	private LinearLayout linear18;
	private LinearLayout linear19;
	private LinearLayout linear20;
	private LinearLayout linear48;
	private LinearLayout linear46;
	private ImageView imageview5;
	private TextView textview5;
	private TextView textview6;
	private ImageView imageview6;
	private TextView textview7;
	private TextView textview8;
	private ImageView imageview7;
	private TextView textview15;
	private TextView textview10;
	private ImageView imageview9;
	private TextView textview11;
	private TextView textview12;
	private ImageView imageview8;
	private TextView textview13;
	private TextView textview14;
	private ImageView imageview10;
	private TextView textview9;
	private TextView textview16;
	private ImageView imageview11;
	private TextView textview17;
	private TextView textview18;
	private ImageView imageview12;
	private TextView textview19;
	private TextView total;
	private ImageView imageview13;
	private TextView textview21;
	private TextView avail;
	private ImageView imageview14;
	private TextView textview22;
	private TextView textview25;
	private ImageView imageview15;
	private TextView textview23;
	private TextView textview26;
	private ImageView imageview16;
	private TextView textview27;
	private ProgressBar progressbar1;
	private ImageView imageview43;
	private TextView textview73;
	private TextView textview74;
	private TextView textview75;
	private TextView cpuinfo;
	private ScrollView vscroll2;
	private LinearLayout linear6;
	private LinearLayout linear21;
	private LinearLayout linear22;
	private LinearLayout linear23;
	private LinearLayout linear24;
	private LinearLayout linear25;
	private LinearLayout linear26;
	private LinearLayout linear27;
	private LinearLayout linear28;
	private LinearLayout linear29;
	private LinearLayout linear40;
	private LinearLayout linear30;
	private ImageView imageview17;
	private TextView textview28;
	private TextView textview38;
	private ImageView imageview27;
	private TextView textview29;
	private TextView textview39;
	private ImageView imageview19;
	private TextView textview30;
	private TextView textview40;
	private ImageView imageview26;
	private TextView textview31;
	private TextView textview41;
	private ImageView imageview25;
	private TextView textview32;
	private TextView textview42;
	private ImageView imageview24;
	private TextView textview33;
	private TextView textview43;
	private ImageView imageview20;
	private TextView textview34;
	private TextView textview44;
	private ImageView imageview21;
	private TextView textview35;
	private TextView textview45;
	private ImageView imageview23;
	private TextView textview36;
	private TextView textview46;
	private ImageView imageview35;
	private TextView textview63;
	private TextView textview64;
	private ImageView imageview22;
	private TextView textview37;
	private TextView textview47;
	private ScrollView vscroll3;
	private LinearLayout linear7;
	private LinearLayout linear32;
	private LinearLayout linear33;
	private LinearLayout linear34;
	private LinearLayout linear35;
	private LinearLayout linear36;
	private LinearLayout linear37;
	private LinearLayout linear38;
	private LinearLayout linear39;
	private LinearLayout linear41;
	private LinearLayout linear42;
	private LinearLayout linear43;
	private LinearLayout linear44;
	private LinearLayout linear49;
	private ImageView imageview39;
	private TextView textview48;
	private ImageView imageview32;
	private TextView textview50;
	private TextView state;
	private ImageView imageview29;
	private TextView textview51;
	private TextView textview55;
	private ImageView imageview30;
	private TextView textview52;
	private TextView level;
	private ProgressBar prog;
	private ImageView imageview31;
	private TextView textview53;
	private TextView textview57;
	private ImageView imageview41;
	private TextView textview49;
	private ImageView imageview33;
	private TextView textview58;
	private TextView textview61;
	private ImageView imageview34;
	private TextView textview59;
	private TextView textview62;
	private ImageView imageview40;
	private TextView textview65;
	private ImageView imageview37;
	private TextView textview66;
	private TextView textview69;
	private ImageView imageview36;
	private TextView textview67;
	private TextView textview70;
	private ImageView imageview38;
	private TextView textview68;
	private TextView textview71;
	private LinearLayout device_btn;
	private LinearLayout sys_btn;
	private LinearLayout bat_btn;
	private ImageView imageview2;
	private TextView textview2;
	private ImageView imageview3;
	private TextView textview3;
	private ImageView imageview4;
	private TextView textview4;
	
	private TimerTask ram_timer;
	private TimerTask pingchecker;
	private RequestNetwork pingtester;
	private RequestNetwork.RequestListener _pingtester_request_listener;
	private Intent i = new Intent();
	private TimerTask exit;
	private SensorManager gyro;
	private SensorEventListener _gyro_sensor_listener;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear2 = findViewById(R.id.linear2);
		linear3 = findViewById(R.id.linear3);
		linear4 = findViewById(R.id.linear4);
		imageview42 = findViewById(R.id.imageview42);
		textview1 = findViewById(R.id.textview1);
		imageview28 = findViewById(R.id.imageview28);
		devlay = findViewById(R.id.devlay);
		syslay = findViewById(R.id.syslay);
		batlay = findViewById(R.id.batlay);
		vscroll1 = findViewById(R.id.vscroll1);
		linear5 = findViewById(R.id.linear5);
		linear9 = findViewById(R.id.linear9);
		linear10 = findViewById(R.id.linear10);
		linear11 = findViewById(R.id.linear11);
		linear12 = findViewById(R.id.linear12);
		linear13 = findViewById(R.id.linear13);
		linear14 = findViewById(R.id.linear14);
		linear15 = findViewById(R.id.linear15);
		linear16 = findViewById(R.id.linear16);
		linear17 = findViewById(R.id.linear17);
		linear18 = findViewById(R.id.linear18);
		linear19 = findViewById(R.id.linear19);
		linear20 = findViewById(R.id.linear20);
		linear48 = findViewById(R.id.linear48);
		linear46 = findViewById(R.id.linear46);
		imageview5 = findViewById(R.id.imageview5);
		textview5 = findViewById(R.id.textview5);
		textview6 = findViewById(R.id.textview6);
		imageview6 = findViewById(R.id.imageview6);
		textview7 = findViewById(R.id.textview7);
		textview8 = findViewById(R.id.textview8);
		imageview7 = findViewById(R.id.imageview7);
		textview15 = findViewById(R.id.textview15);
		textview10 = findViewById(R.id.textview10);
		imageview9 = findViewById(R.id.imageview9);
		textview11 = findViewById(R.id.textview11);
		textview12 = findViewById(R.id.textview12);
		imageview8 = findViewById(R.id.imageview8);
		textview13 = findViewById(R.id.textview13);
		textview14 = findViewById(R.id.textview14);
		imageview10 = findViewById(R.id.imageview10);
		textview9 = findViewById(R.id.textview9);
		textview16 = findViewById(R.id.textview16);
		imageview11 = findViewById(R.id.imageview11);
		textview17 = findViewById(R.id.textview17);
		textview18 = findViewById(R.id.textview18);
		imageview12 = findViewById(R.id.imageview12);
		textview19 = findViewById(R.id.textview19);
		total = findViewById(R.id.total);
		imageview13 = findViewById(R.id.imageview13);
		textview21 = findViewById(R.id.textview21);
		avail = findViewById(R.id.avail);
		imageview14 = findViewById(R.id.imageview14);
		textview22 = findViewById(R.id.textview22);
		textview25 = findViewById(R.id.textview25);
		imageview15 = findViewById(R.id.imageview15);
		textview23 = findViewById(R.id.textview23);
		textview26 = findViewById(R.id.textview26);
		imageview16 = findViewById(R.id.imageview16);
		textview27 = findViewById(R.id.textview27);
		progressbar1 = findViewById(R.id.progressbar1);
		imageview43 = findViewById(R.id.imageview43);
		textview73 = findViewById(R.id.textview73);
		textview74 = findViewById(R.id.textview74);
		textview75 = findViewById(R.id.textview75);
		cpuinfo = findViewById(R.id.cpuinfo);
		vscroll2 = findViewById(R.id.vscroll2);
		linear6 = findViewById(R.id.linear6);
		linear21 = findViewById(R.id.linear21);
		linear22 = findViewById(R.id.linear22);
		linear23 = findViewById(R.id.linear23);
		linear24 = findViewById(R.id.linear24);
		linear25 = findViewById(R.id.linear25);
		linear26 = findViewById(R.id.linear26);
		linear27 = findViewById(R.id.linear27);
		linear28 = findViewById(R.id.linear28);
		linear29 = findViewById(R.id.linear29);
		linear40 = findViewById(R.id.linear40);
		linear30 = findViewById(R.id.linear30);
		imageview17 = findViewById(R.id.imageview17);
		textview28 = findViewById(R.id.textview28);
		textview38 = findViewById(R.id.textview38);
		imageview27 = findViewById(R.id.imageview27);
		textview29 = findViewById(R.id.textview29);
		textview39 = findViewById(R.id.textview39);
		imageview19 = findViewById(R.id.imageview19);
		textview30 = findViewById(R.id.textview30);
		textview40 = findViewById(R.id.textview40);
		imageview26 = findViewById(R.id.imageview26);
		textview31 = findViewById(R.id.textview31);
		textview41 = findViewById(R.id.textview41);
		imageview25 = findViewById(R.id.imageview25);
		textview32 = findViewById(R.id.textview32);
		textview42 = findViewById(R.id.textview42);
		imageview24 = findViewById(R.id.imageview24);
		textview33 = findViewById(R.id.textview33);
		textview43 = findViewById(R.id.textview43);
		imageview20 = findViewById(R.id.imageview20);
		textview34 = findViewById(R.id.textview34);
		textview44 = findViewById(R.id.textview44);
		imageview21 = findViewById(R.id.imageview21);
		textview35 = findViewById(R.id.textview35);
		textview45 = findViewById(R.id.textview45);
		imageview23 = findViewById(R.id.imageview23);
		textview36 = findViewById(R.id.textview36);
		textview46 = findViewById(R.id.textview46);
		imageview35 = findViewById(R.id.imageview35);
		textview63 = findViewById(R.id.textview63);
		textview64 = findViewById(R.id.textview64);
		imageview22 = findViewById(R.id.imageview22);
		textview37 = findViewById(R.id.textview37);
		textview47 = findViewById(R.id.textview47);
		vscroll3 = findViewById(R.id.vscroll3);
		linear7 = findViewById(R.id.linear7);
		linear32 = findViewById(R.id.linear32);
		linear33 = findViewById(R.id.linear33);
		linear34 = findViewById(R.id.linear34);
		linear35 = findViewById(R.id.linear35);
		linear36 = findViewById(R.id.linear36);
		linear37 = findViewById(R.id.linear37);
		linear38 = findViewById(R.id.linear38);
		linear39 = findViewById(R.id.linear39);
		linear41 = findViewById(R.id.linear41);
		linear42 = findViewById(R.id.linear42);
		linear43 = findViewById(R.id.linear43);
		linear44 = findViewById(R.id.linear44);
		linear49 = findViewById(R.id.linear49);
		imageview39 = findViewById(R.id.imageview39);
		textview48 = findViewById(R.id.textview48);
		imageview32 = findViewById(R.id.imageview32);
		textview50 = findViewById(R.id.textview50);
		state = findViewById(R.id.state);
		imageview29 = findViewById(R.id.imageview29);
		textview51 = findViewById(R.id.textview51);
		textview55 = findViewById(R.id.textview55);
		imageview30 = findViewById(R.id.imageview30);
		textview52 = findViewById(R.id.textview52);
		level = findViewById(R.id.level);
		prog = findViewById(R.id.prog);
		imageview31 = findViewById(R.id.imageview31);
		textview53 = findViewById(R.id.textview53);
		textview57 = findViewById(R.id.textview57);
		imageview41 = findViewById(R.id.imageview41);
		textview49 = findViewById(R.id.textview49);
		imageview33 = findViewById(R.id.imageview33);
		textview58 = findViewById(R.id.textview58);
		textview61 = findViewById(R.id.textview61);
		imageview34 = findViewById(R.id.imageview34);
		textview59 = findViewById(R.id.textview59);
		textview62 = findViewById(R.id.textview62);
		imageview40 = findViewById(R.id.imageview40);
		textview65 = findViewById(R.id.textview65);
		imageview37 = findViewById(R.id.imageview37);
		textview66 = findViewById(R.id.textview66);
		textview69 = findViewById(R.id.textview69);
		imageview36 = findViewById(R.id.imageview36);
		textview67 = findViewById(R.id.textview67);
		textview70 = findViewById(R.id.textview70);
		imageview38 = findViewById(R.id.imageview38);
		textview68 = findViewById(R.id.textview68);
		textview71 = findViewById(R.id.textview71);
		device_btn = findViewById(R.id.device_btn);
		sys_btn = findViewById(R.id.sys_btn);
		bat_btn = findViewById(R.id.bat_btn);
		imageview2 = findViewById(R.id.imageview2);
		textview2 = findViewById(R.id.textview2);
		imageview3 = findViewById(R.id.imageview3);
		textview3 = findViewById(R.id.textview3);
		imageview4 = findViewById(R.id.imageview4);
		textview4 = findViewById(R.id.textview4);
		pingtester = new RequestNetwork(this);
		gyro = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
		if (gyro.getDefaultSensor(Sensor.TYPE_GYROSCOPE) == null) {
			SketchwareUtil.showMessage(getApplicationContext(), "Gyroscope is not supported on this device");
		}
		
		imageview28.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				PopupMenu popup = new PopupMenu(MainActivity.this, imageview28);
				
				Menu menu = popup.getMenu();
				menu.add("About App");
				menu.add("Join Telegram");
				menu.add("Close App");
				
				popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
					    public boolean onMenuItemClick(MenuItem item) {
						        switch (item.getTitle().toString()) {
							            case "About App":
							                i.setClass(getApplicationContext(), AboutActivity.class);
							                startActivity(i);
							                return true;
							
							            case "Join Telegram":
							                Intent telegramIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/magisk2024"));
							                startActivity(telegramIntent);
							                return true;
							
							            case "Close App":
							                finishAffinity();
							                return true;
							
							            default:
							                return false;
							        }
						    }
				});
				
				popup.show();
				
			}
		});
		
		device_btn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_ICC(imageview2, "#2196F3", "#2196F3");
				_ICC(imageview3, "#757575", "#757575");
				_ICC(imageview4, "#757575", "#757575");
				textview2.setTextColor(0xFF2196F3);
				textview3.setTextColor(0xFF757575);
				textview4.setTextColor(0xFF757575);
				devlay.setVisibility(View.VISIBLE);
				syslay.setVisibility(View.GONE);
				batlay.setVisibility(View.GONE);
				textview1.setText("SysScope");
			}
		});
		
		sys_btn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_ICC(imageview3, "#2196F3", "#2196F3");
				_ICC(imageview2, "#757575", "#757575");
				_ICC(imageview4, "#757575", "#757575");
				textview3.setTextColor(0xFF2196F3);
				textview2.setTextColor(0xFF757575);
				textview4.setTextColor(0xFF757575);
				devlay.setVisibility(View.GONE);
				syslay.setVisibility(View.VISIBLE);
				batlay.setVisibility(View.GONE);
				textview1.setText("SysScope - SYSTEM INFO");
			}
		});
		
		bat_btn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_ICC(imageview4, "#2196F3", "#2196F3");
				_ICC(imageview3, "#757575", "#757575");
				_ICC(imageview2, "#757575", "#757575");
				textview4.setTextColor(0xFF2196F3);
				textview3.setTextColor(0xFF757575);
				textview2.setTextColor(0xFF757575);
				devlay.setVisibility(View.GONE);
				syslay.setVisibility(View.GONE);
				batlay.setVisibility(View.VISIBLE);
				textview1.setText("SysScope - Battery and Network info");
			}
		});
		
		_pingtester_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				start = false;
				textview61.setText(String.valueOf(ping).concat("ms"));
				textview62.setText("Connected :)");
				pingchecker = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								start = true;
								ping = 0;
								pingtester.startRequestNetwork(RequestNetworkController.GET, "Https://www.google.com", "A", _pingtester_request_listener);
								_repeat();
							}
						});
					}
				};
				_timer.schedule(pingchecker, (int)(500));
			}
			
			@Override
			public void onErrorResponse(String _param1, String _param2) {
				final String _tag = _param1;
				final String _message = _param2;
				start = true;
				textview61.setText("-- ms");
				textview62.setText("Not Connected :(");
			}
		};
		
		_gyro_sensor_listener = new SensorEventListener() {
			@Override
			public void onSensorChanged(SensorEvent _param1) {
				float[] _rotationMatrix = new float[16];
				SensorManager.getRotationMatrixFromVector(_rotationMatrix, _param1.values);
				float[] _remappedRotationMatrix = new float[16];
				SensorManager.remapCoordinateSystem(_rotationMatrix, SensorManager.AXIS_X, SensorManager.AXIS_Z, _remappedRotationMatrix);
				float[] _orientations = new float[3];
				SensorManager.getOrientation(_remappedRotationMatrix, _orientations);
				for (int _i = 0; _i < 3; _i++) {
					_orientations[_i] = (float)(Math.toDegrees(_orientations[_i]));
				}
				final double _x = _orientations[0];
				final double _y = _orientations[1];
				final double _z = _orientations[2];
				textview69.setText(String.valueOf((long)(_x)));
				textview70.setText(String.valueOf((long)(_y)));
				textview71.setText(String.valueOf((long)(_z)));
			}
			
			@Override
			public void onAccuracyChanged(Sensor _param1, int _param2) {
				
			}
		};
		gyro.registerListener(_gyro_sensor_listener, gyro.getDefaultSensor(Sensor.TYPE_GAME_ROTATION_VECTOR), SensorManager.SENSOR_DELAY_NORMAL);
	}
	
	private void initializeLogic() {
		{
			android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
			int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
			SketchUi.setColor(0xFF2196F3);SketchUi.setCornerRadii(new float[]{
				d*0,d*0,d*0 ,d*0,d*13,d*13 ,d*13,d*13});
			linear2.setElevation(d*5);
			linear2.setBackground(SketchUi);
		}
		{
			android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
			int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
			SketchUi.setColor(0xFFFFFFFF);
			linear4.setElevation(d*11);
			linear4.setBackground(SketchUi);
		}
		vscroll1.setHorizontalScrollBarEnabled(false);
		vscroll1.setVerticalScrollBarEnabled(false);
		vscroll1.setOverScrollMode(ScrollView.OVER_SCROLL_NEVER);
		
		vscroll2.setHorizontalScrollBarEnabled(false);
		vscroll2.setVerticalScrollBarEnabled(false);
		vscroll2.setOverScrollMode(ScrollView.OVER_SCROLL_NEVER);
		
		vscroll3.setHorizontalScrollBarEnabled(false);
		vscroll3.setVerticalScrollBarEnabled(false);
		vscroll3.setOverScrollMode(ScrollView.OVER_SCROLL_NEVER);
		
		
		_ICC(imageview2, "#21F321", "#21F321");
		_ICC(imageview3, "#757575", "#757575");
		_ICC(imageview4, "#757575", "#757575");
		textview1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/default_font.ttf"), 0);
		textview2.setTextColor(0xFF2196F3);
		textview3.setTextColor(0xFF757575);
		textview4.setTextColor(0xFF757575);
		_RippleView("#2196F3", device_btn);
		_RippleView("#2196F3", sys_btn);
		_RippleView("#2196F3", bat_btn);
		_BottomNavigationColor("#FFFFFF");
		syslay.setVisibility(View.GONE);
		batlay.setVisibility(View.GONE);
		gyro.registerListener(_gyro_sensor_listener, gyro.getDefaultSensor(Sensor.TYPE_GAME_ROTATION_VECTOR), SensorManager.SENSOR_DELAY_NORMAL);
		start = true;
		pingtester.startRequestNetwork(RequestNetworkController.GET, "https://www.google.com", "A", _pingtester_request_listener);
		_DeviceInformation();
		_SystemInformation();
		_BatteryInformation();
		_CPU_Info();
		_SketchUi();
		_RAM();
		_Colorfilter();
		SketchwareUtil.showMessage(getApplicationContext(), "Developer: @pipecitooficial");
	}
	
	@Override
	public void onBackPressed() {
		one++;
		if (one == 1) {
			SketchwareUtil.showMessage(getApplicationContext(), "Press again to exit");
			exit = new TimerTask() {
				@Override
				public void run() {
					runOnUiThread(new Runnable() {
						@Override
						public void run() {
							if (one == 1) {
								one = 0;
							}
						}
					});
				}
			};
			_timer.schedule(exit, (int)(3000));
		}
		else {
			if (one == 2) {
				finishAffinity();
			}
		}
	}
	public void _ICC(final ImageView _img, final String _c1, final String _c2) {
		_img.setImageTintList(new android.content.res.ColorStateList(new int[][] {{-android.R.attr.state_pressed},{android.R.attr.state_pressed}},new int[]{Color.parseColor(_c1), Color.parseColor(_c2)}));
	}
	
	
	public void _RippleView(final String _color, final View _view) {
		android.content.res.ColorStateList CSL = new android.content.res.ColorStateList(new int[][]{new int[]{}},new int[]
		
		//Your Ripple Color Here
		{Color.parseColor(_color)});
		
		android.graphics.drawable.RippleDrawable Ripple = new android.graphics.drawable.RippleDrawable(CSL, null, null);
		
		//Set View Background To Ripple
		_view.setBackground(Ripple);
	}
	
	
	public void _BottomNavigationColor(final String _color) {
		
		Window window = this.getWindow();window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS); window.setNavigationBarColor(Color.parseColor(_color));
	}
	
	
	public void _SketchUi() {
		{
			android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
			int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
			SketchUi.setColor(0xFFFFFFFF);
			SketchUi.setCornerRadius(d*13);
			linear9.setElevation(d*4);
			linear9.setBackground(SketchUi);
		}
		{
			android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
			int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
			SketchUi.setColor(0xFFFFFFFF);
			SketchUi.setCornerRadius(d*13);
			linear10.setElevation(d*4);
			linear10.setBackground(SketchUi);
		}
		{
			android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
			int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
			SketchUi.setColor(0xFFFFFFFF);
			SketchUi.setCornerRadius(d*13);
			linear11.setElevation(d*4);
			linear11.setBackground(SketchUi);
		}
		{
			android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
			int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
			SketchUi.setColor(0xFFFFFFFF);
			SketchUi.setCornerRadius(d*13);
			linear12.setElevation(d*4);
			linear12.setBackground(SketchUi);
		}
		{
			android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
			int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
			SketchUi.setColor(0xFFFFFFFF);
			SketchUi.setCornerRadius(d*13);
			linear13.setElevation(d*4);
			linear13.setBackground(SketchUi);
		}
		{
			android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
			int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
			SketchUi.setColor(0xFFFFFFFF);
			SketchUi.setCornerRadius(d*13);
			linear14.setElevation(d*4);
			linear14.setBackground(SketchUi);
		}
		{
			android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
			int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
			SketchUi.setColor(0xFFFFFFFF);
			SketchUi.setCornerRadius(d*13);
			linear15.setElevation(d*4);
			linear15.setBackground(SketchUi);
		}
		{
			android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
			int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
			SketchUi.setColor(0xFFFFFFFF);
			SketchUi.setCornerRadius(d*13);
			linear16.setElevation(d*4);
			linear16.setBackground(SketchUi);
		}
		{
			android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
			int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
			SketchUi.setColor(0xFFFFFFFF);
			SketchUi.setCornerRadius(d*13);
			linear17.setElevation(d*4);
			linear17.setBackground(SketchUi);
		}
		{
			android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
			int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
			SketchUi.setColor(0xFFFFFFFF);
			SketchUi.setCornerRadius(d*13);
			linear18.setElevation(d*4);
			linear18.setBackground(SketchUi);
		}
		{
			android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
			int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
			SketchUi.setColor(0xFFFFFFFF);
			SketchUi.setCornerRadius(d*13);
			linear19.setElevation(d*4);
			linear19.setBackground(SketchUi);
		}
		{
			android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
			int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
			SketchUi.setColor(0xFFFFFFFF);
			SketchUi.setCornerRadius(d*13);
			linear20.setElevation(d*4);
			linear20.setBackground(SketchUi);
		}
		{
			android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
			int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
			SketchUi.setColor(0xFFFFFFFF);
			SketchUi.setCornerRadius(d*13);
			linear21.setElevation(d*4);
			linear21.setBackground(SketchUi);
		}
		{
			android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
			int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
			SketchUi.setColor(0xFFFFFFFF);
			SketchUi.setCornerRadius(d*13);
			linear22.setElevation(d*4);
			linear22.setBackground(SketchUi);
		}
		{
			android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
			int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
			SketchUi.setColor(0xFFFFFFFF);
			SketchUi.setCornerRadius(d*13);
			linear23.setElevation(d*4);
			linear23.setBackground(SketchUi);
		}
		{
			android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
			int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
			SketchUi.setColor(0xFFFFFFFF);
			SketchUi.setCornerRadius(d*13);
			linear24.setElevation(d*4);
			linear24.setBackground(SketchUi);
		}
		{
			android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
			int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
			SketchUi.setColor(0xFFFFFFFF);
			SketchUi.setCornerRadius(d*13);
			linear25.setElevation(d*4);
			linear25.setBackground(SketchUi);
		}
		{
			android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
			int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
			SketchUi.setColor(0xFFFFFFFF);
			SketchUi.setCornerRadius(d*13);
			linear26.setElevation(d*4);
			linear26.setBackground(SketchUi);
		}
		{
			android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
			int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
			SketchUi.setColor(0xFFFFFFFF);
			SketchUi.setCornerRadius(d*13);
			linear27.setElevation(d*4);
			linear27.setBackground(SketchUi);
		}
		{
			android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
			int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
			SketchUi.setColor(0xFFFFFFFF);
			SketchUi.setCornerRadius(d*13);
			linear28.setElevation(d*4);
			linear28.setBackground(SketchUi);
		}
		{
			android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
			int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
			SketchUi.setColor(0xFFFFFFFF);
			SketchUi.setCornerRadius(d*13);
			linear29.setElevation(d*4);
			linear29.setBackground(SketchUi);
		}
		{
			android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
			int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
			SketchUi.setColor(0xFFFFFFFF);
			SketchUi.setCornerRadius(d*13);
			linear46.setElevation(d*4);
			linear46.setBackground(SketchUi);
		}
		{
			android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
			int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
			SketchUi.setColor(0xFFFFFFFF);
			SketchUi.setCornerRadius(d*13);
			linear30.setElevation(d*4);
			linear30.setBackground(SketchUi);
		}
		{
			android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
			int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
			SketchUi.setColor(0xFFFFFFFF);
			SketchUi.setCornerRadius(d*13);
			linear33.setElevation(d*4);
			linear33.setBackground(SketchUi);
		}
		{
			android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
			int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
			SketchUi.setColor(0xFFFFFFFF);
			SketchUi.setCornerRadius(d*13);
			linear34.setElevation(d*4);
			linear34.setBackground(SketchUi);
		}
		{
			android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
			int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
			SketchUi.setColor(0xFFFFFFFF);
			SketchUi.setCornerRadius(d*13);
			linear35.setElevation(d*4);
			linear35.setBackground(SketchUi);
		}
		{
			android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
			int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
			SketchUi.setColor(0xFFFFFFFF);
			SketchUi.setCornerRadius(d*13);
			linear36.setElevation(d*4);
			linear36.setBackground(SketchUi);
		}
		{
			android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
			int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
			SketchUi.setColor(0xFFFFFFFF);
			SketchUi.setCornerRadius(d*13);
			linear38.setElevation(d*4);
			linear38.setBackground(SketchUi);
		}
		{
			android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
			int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
			SketchUi.setColor(0xFFFFFFFF);
			SketchUi.setCornerRadius(d*13);
			linear39.setElevation(d*4);
			linear39.setBackground(SketchUi);
		}
		{
			android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
			int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
			SketchUi.setColor(0xFFFFFFFF);
			SketchUi.setCornerRadius(d*13);
			linear40.setElevation(d*4);
			linear40.setBackground(SketchUi);
		}
		{
			android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
			int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
			SketchUi.setColor(0xFFFFFFFF);
			SketchUi.setCornerRadius(d*13);
			linear42.setElevation(d*4);
			linear42.setBackground(SketchUi);
		}
		{
			android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
			int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
			SketchUi.setColor(0xFFFFFFFF);
			SketchUi.setCornerRadius(d*13);
			linear43.setElevation(d*4);
			linear43.setBackground(SketchUi);
		}
		{
			android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
			int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
			SketchUi.setColor(0xFFFFFFFF);
			SketchUi.setCornerRadius(d*13);
			linear44.setElevation(d*4);
			linear44.setBackground(SketchUi);
		}
		{
			android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
			int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
			SketchUi.setColor(0xFFFFFFFF);
			SketchUi.setCornerRadius(d*13);
			linear48.setElevation(d*4);
			linear48.setBackground(SketchUi);
		}
		{
			android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
			int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
			SketchUi.setColor(0xFFFFFFFF);
			SketchUi.setCornerRadius(d*13);
			linear48.setElevation(d*4);
			linear48.setBackground(SketchUi);
		}
	}
	
	
	public void _DeviceInformation() {
		textview6.setText(Build.BRAND);
		textview8.setText(Build.MODEL);
		textview10.setText(Build.PRODUCT);
		textview12.setText(Build.BOARD);
		textview14.setText(Build.HOST);
		textview16.setText(Build.MANUFACTURER.concat(" ".concat(Build.MODEL)));
		DisplayMetrics DM = new DisplayMetrics();
		
		getWindowManager().getDefaultDisplay().getMetrics(DM);
		
		int Width = DM.widthPixels;
		
		int Height = DM.heightPixels;
		
		textview18.setText(String.valueOf(Height).concat(" x ".concat(String.valueOf(Width))));
		StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
		long bytesTotal;
		long bytesAvailable;
		String string4;
		String string5;
		double bytesTotalInt;
		double bytesAvailableInt;
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR2) {
			          
			bytesTotal =
			statFs.getBlockCountLong() * statFs.getBlockSizeLong();
			           
			 bytesAvailable = statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
			        
		} else {
			            
			bytesTotal = ( (long) statFs.getBlockCountLong() * (long) statFs.getBlockSizeLong());
			           
			 bytesAvailable = ( (long) statFs.getAvailableBlocksLong() * (long) statFs.getBlockSizeLong());
			
		}
		Long megabytesTotal = bytesTotal / 0x400L;       
		Long megabytesAvailable = bytesAvailable / 0x400L;
		
		        string4 = String.valueOf((Object)megabytesTotal);
		        string5 = String.valueOf((Object)megabytesAvailable);
		_formatBytes(String.valueOf((long)bytesAvailable), avail);
		_formatBytes(String.valueOf((long)bytesTotal), total);
		String currentTime = new SimpleDateFormat("HH:mm", Locale.getDefault()).format(new Date());
		textview64.setText(currentTime);
		textview74.setText(Build.CPU_ABI);
		_execute_shell("cat /proc/cpuinfo");
		cpuinfo.setText(out);
	}
	
	
	public void _SystemInformation() {
		final String release = Build.VERSION.RELEASE;
		
		textview38.setText(release);
		textview39.setText(Build.VERSION.SDK);
		textview40.setText(Build.ID);
		
		
		textview41.setText(Build.TYPE);
		
		
		textview42.setText(Build.BOOTLOADER);
		
		
		textview43.setText(Build.VERSION.SECURITY_PATCH);
		try {
					Runtime.getRuntime().exec("su"); 
					//Code To Run When Root Found
			textview44.setText("Root Found");
		} catch (Exception e ) {
						//Code To Run When Root Not Found
			textview44.setText("Not Rooted");
		}
		String arch = System.getProperty("os.arch");
		textview45.setText(arch);
		kernelVersion = System.getProperty("os.version");
		textview46.setText(kernelVersion);
		final String Language = Locale.getDefault().getDisplayLanguage();
		
		textview47.setText(Language);
	}
	
	
	public void _BatteryInformation() {
		IntentFilter IM = new IntentFilter(Intent.ACTION_BATTERY_CHANGED);
		Intent batteryStatus = registerReceiver(null, IM);
		
		int chargingState = batteryStatus.getIntExtra(BatteryManager.EXTRA_PLUGGED,-1);
		
		boolean isUSBCharging = chargingState == BatteryManager.BATTERY_PLUGGED_USB;
		
		boolean isACCharging = chargingState == BatteryManager.BATTERY_PLUGGED_AC;
		
		
		if (isUSBCharging) {
				state.setText("USB Charging");
		}
		else {
				if (isACCharging) {
						state.setText("Charging");
				}
				else {
						state.setText("Not Charging");
				}
		}
		BroadcastReceiver BR = new BroadcastReceiver() {
				@Override
				public void onReceive(Context context, Intent intent) {
						float BT = (float)(intent.getIntExtra(BatteryManager.EXTRA_TEMPERATURE,0))/10;
						//Code To Run When Temperature Received
						textview57.setText(BT +" "+ (char) 0x00B0 +"C");
				}
		};
		
		IntentFilter IF = new IntentFilter(Intent.ACTION_BATTERY_CHANGED);
		getApplicationContext().registerReceiver(BR,IF);
		BatteryManager bm = (BatteryManager)getSystemService(BATTERY_SERVICE); int batLevel = bm.getIntProperty(BatteryManager.BATTERY_PROPERTY_CAPACITY);
		level.setText(Integer.toString(batLevel)); prog.setProgress((int)Double.parseDouble(level.getText().toString()));
		level.append((CharSequence)"%");
		BroadcastReceiver BK = new BroadcastReceiver() {
				@Override
				public void onReceive(Context context, Intent intent) {
						int BK = intent.getIntExtra(BatteryManager.EXTRA_HEALTH,0);
						
						if (BK == BatteryManager.BATTERY_HEALTH_DEAD) {
								//Code To Run If Battery Health Is Dead
					textview55.setText("Charge your Phone");
						}
						if (BK == BatteryManager.BATTERY_HEALTH_GOOD) {
								//Code To Run if Battery Health Is Good
					textview55.setText("Good");
						}
						if (BK == BatteryManager.BATTERY_HEALTH_OVERHEAT) {
								//Code To Run if Battery Health Is Overheated
					textview55.setText("Over Heat");
						}
						if (BK == BatteryManager.BATTERY_HEALTH_OVER_VOLTAGE) {
								//Code To Run if Battery Health Is Over Voltage
					textview55.setText("Over Voltage");
						}
						if (BK == BatteryManager.BATTERY_HEALTH_UNKNOWN) {
								//Code To Run if Battery Health Is Unknown
					textview55.setText("Unknown");
						}
						if (BK == BatteryManager.BATTERY_HEALTH_UNSPECIFIED_FAILURE) {
								//Code To Run if Battery Health Has Unspecified Failure
					textview55.setText("Unknown");
						}
				}
		};
		
		IntentFilter IN = new IntentFilter(Intent.ACTION_BATTERY_CHANGED);
		getApplicationContext().registerReceiver(BK,IN);
	}
	
	
	public void _formatBytes(final String _bytes, final TextView _textview) {
		if (Double.parseDouble(_bytes) > 109951162777d) {
			String formatTB = String.valueOf(Double.parseDouble(_bytes) / 1024 / 1024 / 1024 / 1024);
			_textview.setText(formatTB.substring((int)(0), (int)(formatTB.lastIndexOf(".") + 3)) + " TB");
		}
		else {
			if (Double.parseDouble(_bytes) > 1073741824) {
				String formatGB = String.valueOf(Double.parseDouble(_bytes) / 1024 / 1024 / 1024);
				_textview.setText(formatGB.substring((int)(0), (int)(formatGB.lastIndexOf(".") + 3)) + " GB");
			}
			else {
				if (Double.parseDouble(_bytes) > (1024 * 1024)) {
					String formatMB = String.valueOf(Double.parseDouble(_bytes) / 1024 / 1024);
					_textview.setText(formatMB + " MB");
				}
				else {
					String formatKB = String.valueOf(Double.parseDouble(_bytes) / 1024 );
					_textview.setText(formatKB + " KB");
				}
			}
		}
	}
	
	
	public void _RAM() {
		ram_timer = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						_execute_shell("cat /proc/meminfo");
						// Getting the Total Memory
						
						String[] s = out.split("\n")[0].split(" ");
						mem_max = Integer.parseInt(s[s.length - 2]);
						// Getting the current memory
						
						String[] l = out.split("\n")[2].split(" ");
						mem_usage = mem_max - Integer.parseInt(l[l.length - 2]);
						progressbar1.setProgress((int)mem_usage);
						progressbar1.setMax((int)mem_max);
						textview26.setText(String.valueOf((long)(mem_usage / 1024)).concat(" MB"));
						textview25.setText(String.valueOf((long)(mem_max / 1024)).concat(" MB"));
					}
				});
			}
		};
		_timer.scheduleAtFixedRate(ram_timer, (int)(0), (int)(500));
	}
	private int dptopx(int dp) {
		return (int) (dp * getApplicationContext ().getResources().getDisplayMetrics().density);
	}
	
	
	public void _execute_shell(final String _command) {
		StringBuilder output = new StringBuilder();
		try {
			java.lang.Process cmdProc = Runtime.getRuntime().exec(_command);
			
			
			java.io.BufferedReader stdoutReader = new java.io.BufferedReader(
			         new java.io.InputStreamReader(cmdProc.getInputStream()));
			String line;
			while ((line = stdoutReader.readLine()) != null) {
				   // process procs standard output here
				  output.append(line + "\n");
			}
			
			this.out = output.toString();
			
		} catch (java.io.IOException e) {
			this.out = "Error occurred";
		}
	}
	
	
	public void _repeat() {
		if (start) {
			pingtester.startRequestNetwork(RequestNetworkController.GET, "https://www.google.com", "A", _pingtester_request_listener);
			pingchecker = new TimerTask() {
				@Override
				public void run() {
					runOnUiThread(new Runnable() {
						@Override
						public void run() {
							ping++;
							_repeat();
						}
					});
				}
			};
			_timer.schedule(pingchecker, (int)(10));
		}
	}
	
	
	public void _CPU_Info() {
		
	}
	
	
	public void _Colorfilter() {
		_ICC(imageview5, "#2196F3", "#2196F3");
		_ICC(imageview6, "#2196F3", "#2196F3");
		_ICC(imageview7, "#2196F3", "#2196F3");
		_ICC(imageview8, "#2196F3", "#2196F3");
		_ICC(imageview9, "#2196F3", "#2196F3");
		_ICC(imageview10, "#2196F3", "#2196F3");
		_ICC(imageview11, "#2196F3", "#2196F3");
		_ICC(imageview12, "#2196F3", "#2196F3");
		_ICC(imageview13, "#2196F3", "#2196F3");
		_ICC(imageview14, "#2196F3", "#2196F3");
		_ICC(imageview15, "#2196F3", "#2196F3");
		_ICC(imageview16, "#2196F3", "#2196F3");
		_ICC(imageview17, "#2196F3", "#2196F3");
		_ICC(imageview27, "#2196F3", "#2196F3");
		_ICC(imageview19, "#2196F3", "#2196F3");
		_ICC(imageview24, "#2196F3", "#2196F3");
		_ICC(imageview25, "#2196F3", "#2196F3");
		_ICC(imageview26, "#2196F3", "#2196F3");
		_ICC(imageview20, "#2196F3", "#2196F3");
		_ICC(imageview21, "#2196F3", "#2196F3");
		_ICC(imageview23, "#2196F3", "#2196F3");
		_ICC(imageview35, "#2196F3", "#2196F3");
		_ICC(imageview22, "#2196F3", "#2196F3");
		_ICC(imageview29, "#2196F3", "#2196F3");
		_ICC(imageview30, "#2196F3", "#2196F3");
		_ICC(imageview31, "#2196F3", "#2196F3");
		_ICC(imageview32, "#2196F3", "#2196F3");
		_ICC(imageview33, "#2196F3", "#2196F3");
		_ICC(imageview34, "#2196F3", "#2196F3");
		_ICC(imageview36, "#2196F3", "#2196F3");
		_ICC(imageview37, "#2196F3", "#2196F3");
		_ICC(imageview38, "#2196F3", "#2196F3");
		_ICC(imageview39, "#2196F3", "#2196F3");
		_ICC(imageview40, "#2196F3", "#2196F3");
		_ICC(imageview41, "#2196F3", "#2196F3");
		_ICC(imageview43, "#2196F3", "#2196F3");
	}
	
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input) {
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels() {
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels() {
		return getResources().getDisplayMetrics().heightPixels;
	}
}