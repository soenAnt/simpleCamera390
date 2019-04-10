package com.simplemobiletools.camera.activities;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import java.util.ArrayList;

@RunWith(RobolectricTestRunner.class)
public class StickerTests {

    private MainActivity activity = null;

    @Before
    public void setup() {
        activity = Robolectric.buildActivity(MainActivity.class)
                .create()
                .resume()
                .get();
    }


    @Test
    public void makeDisappearAllIconsTest(){

        ImageView gridlines_icon = Mockito.mock(ImageView.class);
        Switch seekbar_switch = Mockito.mock(Switch.class);
        ImageView sticker = Mockito.mock(ImageView.class);
        ImageView settings = Mockito.mock(ImageView.class);
        ImageView toggle_photo_video = Mockito.mock(ImageView.class);
        ImageView change_resolution = Mockito.mock(ImageView.class);
        ImageView filter = Mockito.mock(ImageView.class);
        ImageView toggle_camera = Mockito.mock(ImageView.class);
        ImageView shutter = Mockito.mock(ImageView.class);
        ImageView toggle_flash = Mockito.mock(ImageView.class);
        ImageView smiley = Mockito.mock(ImageView.class);
        ImageView clockStamp = Mockito.mock(ImageView.class);
        ImageView no_sticker = Mockito.mock(ImageView.class);
        ImageView solar = Mockito.mock(ImageView.class);
        ImageView bw = Mockito.mock(ImageView.class);
        ImageView invert = Mockito.mock(ImageView.class);
        ImageView no_filter = Mockito.mock(ImageView.class);
        LinearLayout btn_holder = Mockito.mock(LinearLayout.class);

        //calling the function under test
        activity.makeDisappearAllIcons(gridlines_icon, seekbar_switch,
                sticker, settings, toggle_photo_video,
                change_resolution, filter, toggle_camera,
                shutter, toggle_flash, smiley,
                clockStamp, no_sticker, solar,
                bw, invert, no_filter, btn_holder);


        //verifying that the values called are indeed gone
        Mockito.verify(gridlines_icon).setVisibility(View.GONE);
        Mockito.verify(seekbar_switch).setVisibility(View.GONE);
        Mockito.verify(sticker).setVisibility(View.GONE);
        Mockito.verify(settings).setVisibility(View.GONE);
        Mockito.verify(toggle_photo_video).setVisibility(View.GONE);
        Mockito.verify(change_resolution).setVisibility(View.GONE);
        Mockito.verify(filter).setVisibility(View.GONE);
        Mockito.verify(toggle_camera).setVisibility(View.GONE);
        Mockito.verify(shutter).setVisibility(View.GONE);
        Mockito.verify(toggle_flash).setVisibility(View.GONE);
        Mockito.verify(smiley).setVisibility(View.GONE);
        Mockito.verify(clockStamp).setVisibility(View.GONE);
        Mockito.verify(no_sticker).setVisibility(View.GONE);
        Mockito.verify(solar).setVisibility(View.GONE);
        Mockito.verify(bw).setVisibility(View.GONE);
        Mockito.verify(invert).setVisibility(View.GONE);
        Mockito.verify(no_filter).setVisibility(View.GONE);
        Mockito.verify(btn_holder).setVisibility(View.GONE);



    }


    @Test
    public void disableDayStampTest(){

        ImageView saturday = Mockito.mock(ImageView.class);
        ImageView monday = Mockito.mock(ImageView.class);
        ImageView tuesday = Mockito.mock(ImageView.class);
        ImageView wednesday = Mockito.mock(ImageView.class);
        ImageView thursday = Mockito.mock(ImageView.class);
        ImageView friday = Mockito.mock(ImageView.class);
        ImageView sunday = Mockito.mock(ImageView.class);


        //calling the function under test
        activity.disableDayStamp(saturday, monday, tuesday, wednesday, thursday, friday, sunday);

        //verifying that the values called are indeed gone
        Mockito.verify(saturday).setVisibility(View.GONE);
        Mockito.verify(monday).setVisibility(View.GONE);
        Mockito.verify(tuesday).setVisibility(View.GONE);
        Mockito.verify(wednesday).setVisibility(View.GONE);
        Mockito.verify(thursday).setVisibility(View.GONE);
        Mockito.verify(friday).setVisibility(View.GONE);
        Mockito.verify(sunday).setVisibility(View.GONE);


    }

    @Test
    public void disableSmileyTest(){

        ImageView smileyFace = Mockito.mock(ImageView.class);

        //calling the function under test
        activity.disableSmiley(smileyFace);

        //verifying that the values called are gone
        Mockito.verify(smileyFace).setVisibility(View.GONE);

    }
}
