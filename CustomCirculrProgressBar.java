package com.example.aliyounes.learnnet;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.ProgressBar;

/**
 * Created by ali.younes on 1/9/2017. this code is unreliable
 */

public class CustomCirculrProgressBar extends ProgressBar {
    protected ImageView imgDone = null;
    public CustomCirculrProgressBar(Context context) {
        super(context);
    }
    public CustomCirculrProgressBar(Context context, AttributeSet attrs)
    {
        super(context , attrs);
    }
    public CustomCirculrProgressBar(Context context, AttributeSet attrs, int defStyleAttr)
    {
        super(context , attrs , defStyleAttr);
    }

    public void setImgDone(ImageView imgDone) {
        this.imgDone = imgDone;
    }

    @Override
    public void setProgress(int progress)
    {
        super.setProgress(progress);
        if(imgDone != null)
        {
            if(progress == 100)
            {
                //Do stuff when progress is max
                this.imgDone.setVisibility(VISIBLE);
            }else
            {
                this.imgDone.setVisibility(GONE);
            }
        }
    }
}
