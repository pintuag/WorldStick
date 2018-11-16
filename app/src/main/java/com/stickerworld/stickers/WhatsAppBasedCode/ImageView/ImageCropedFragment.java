package com.stickerworld.stickers.WhatsAppBasedCode.ImageView;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.stickerworld.stickers.R;
import com.stickerworld.stickers.WhatsAppBasedCode.StickerPackDetailsActivity;
import com.stickerworld.stickers.WhatsAppBasedCode.StickerPackListActivity;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class ImageCropedFragment extends Fragment{

    byte[] byteArray = null;
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view =inflater.inflate(R.layout.image_croped_fragment,container,false);

        ImageView im_crop = (ImageView) view.findViewById(R.id.im_crop);
        Button select = (Button)view.findViewById(R.id.select);
        byteArray = getArguments().getByteArray("image");
        Bitmap bmp = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
        im_crop.setImageBitmap(bmp);

        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(GlobalFunctions.getImageviewindex()==1) {
                    Intent intent = new Intent(getActivity(), StickerPackListActivity.class);
                    Log.e("Bytearray"," j "+byteArray.length);
                    intent.putExtra("imagebyte", byteArray);
                    startActivity(intent);
                    getActivity().finish();
                }
            }
        });

        return view;
    }

}
