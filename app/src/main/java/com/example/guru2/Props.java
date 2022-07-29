package com.example.guru2;

import android.os.Bundle;
import android.app.Activity;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;


public class Props extends Activity {
    int[] images=new int[]{R.drawable.ballon,R.drawable.redglass,R.drawable.heartglass,R.drawable.crown,
    R.drawable.flower,R.drawable.sunglass,R.drawable.doll,R.drawable.teddy};

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_props);

        ImageView mImageView=(ImageView)findViewById(R.id.SYSDOCU);
        int imageId=(int)(Math.random()*images.length);
        mImageView.setBackgroundResource(images[imageId]);
    }
}
