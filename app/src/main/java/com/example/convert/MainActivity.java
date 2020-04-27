package com.example.convert;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.GridView;
import android.widget.ImageView;

@SuppressWarnings("deprecation")
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("갤러리 영화 포스터");

        Gallery gallery = (Gallery) findViewById(R.id.gallery1);
        MyGalleryAdapter galAdapter = new MyGalleryAdapter(this);
        gallery.setAdapter(galAdapter);
    }

    public class MyGalleryAdapter extends BaseAdapter{
        Context context;
        Integer[] posterID={
                R.drawable.mov01, R.drawable.mov02,
                R.drawable.mov03, R.drawable.mov04,
                R.drawable.mov05, R.drawable.mov06,
                R.drawable.mov07, R.drawable.mov08,
                R.drawable.mov09, R.drawable.mov10,
                R.drawable.mov11, R.drawable.mov12,
                R.drawable.mov13, R.drawable.mov14,
                R.drawable.mov15, R.drawable.mov16,
                R.drawable.mov17, R.drawable.mov18,
                R.drawable.mov19, R.drawable.mov20,
                R.drawable.mov21, R.drawable.mov22,
                R.drawable.mov23, R.drawable.mov24,
                R.drawable.mov25, R.drawable.mov26,
                R.drawable.mov27, R.drawable.mov28,
                R.drawable.mov29, R.drawable.mov30,
                R.drawable.mov31, R.drawable.mov32,
                R.drawable.mov33, R.drawable.mov34,
                R.drawable.mov35, R.drawable.mov36,
                R.drawable.mov37, R.drawable.mov38,
                R.drawable.mov39, R.drawable.mov40,
                R.drawable.mov41, R.drawable.mov42,
                R.drawable.mov43, R.drawable.mov44,
                R.drawable.mov45, R.drawable.mov46,
                R.drawable.mov47, R.drawable.mov48,
                R.drawable.mov49, R.drawable.mov50,
                R.drawable.mov51, R.drawable.mov52,
                R.drawable.mov53, R.drawable.mov54,
                R.drawable.mov55, R.drawable.mov56,
                R.drawable.mov57, R.drawable.mov58,
                R.drawable.mov59, R.drawable.mov60,
                R.drawable.mov61
        };

        public MyGalleryAdapter(Context c) {context=c;}

        @Override
        public int getCount() {
            return posterID.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView imageView;

            if(convertView==null) {
                imageView = new ImageView(context);
                imageView.setLayoutParams(new Gallery.LayoutParams(200, 300));
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setPadding(5,5,5,5);
            }else {
                imageView=(ImageView)convertView;
            }
            imageView.setImageResource(posterID[position]);
            final int pos = position;
            imageView.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    ImageView ivPoster = (ImageView)findViewById(R.id.ivPoster);
                    ivPoster.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    ivPoster.setImageResource(posterID[pos]);
                    return false;
                }
            });

            return imageView;

        }
    }
}
