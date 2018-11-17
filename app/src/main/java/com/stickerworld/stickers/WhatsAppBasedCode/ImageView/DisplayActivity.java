package com.stickerworld.stickers.WhatsAppBasedCode.ImageView;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.stickerworld.stickers.R;
import com.stickerworld.stickers.WhatsAppBasedCode.StickerPackDetailsActivity;
import com.stickerworld.stickers.WhatsAppBasedCode.StickerPackListActivity;

public class DisplayActivity extends AppCompatActivity {

    byte[] byteArray = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        ImageView im_crop = (ImageView) findViewById(R.id.im_crop);
        Button select = (Button)findViewById(R.id.select);
        Intent extras = this.getIntent();
        if(extras!=null) {
            byteArray = extras.getByteArrayExtra("image");
        }
        Bitmap bmp = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
        im_crop.setImageBitmap(bmp);

        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(GlobalFunctions.getImageviewindex()==1) {
                    Intent intent = new Intent(DisplayActivity.this, StickerPackListActivity.class);
                    Log.e("Bytearray"," j "+byteArray.length);
                    intent.putExtra("imagebyte", byteArray);
                    startActivity(intent);
                    finishAffinity();
                    // getActivity().finish();
                }else if(GlobalFunctions.getImageviewindex()==2){
                    Intent intent = new Intent(DisplayActivity.this, StickerPackDetailsActivity.class);
                    Log.e("Bytearray"," j "+byteArray.length);
                    intent.putExtra("imagebyte", byteArray);
                    startActivity(intent);
                    finishAffinity();
                    // getActivity().finish();
                }
            }
        });
    }
}
