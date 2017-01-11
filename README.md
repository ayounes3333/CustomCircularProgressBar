# CustomCircularProgressBar
a custom circular progress bar with an image inside that will be visible when progress = 100 

## Usage
1 Copy the file "circular_progress_bar.xml" to your drawable directory.
2 Copy the file "CustomCirculrProgressBar.java" to your java sourse folder.
3 Add or include this layout in your destination layout:
```xml
  <RelativeLayout
       xmlns:android="http://schemas.android.com/apk/res/android"
       android:orientation="vertical"
       android:layout_width="60sp"
       android:id="@+id/custom_circular_progress_bar"
       android:layout_height="60sp">
       <com.example.aliyounes.learnnet.CustomCirculrProgressBar
           android:id="@+id/circularProgressbar"
           android:layout_width="match_parent"
           android:layout_height="match_parent"
           style="?android:attr/progressBarStyleHorizontal"
           android:indeterminate="false"
           android:progress="100"
           android:max="100"
           android:secondaryProgress="100"
           android:progressDrawable="@drawable/circular_progress_bar" />
       <ImageView
           android:layout_width="match_parent"
           android:layout_height="match_parent"
           android:id="@+id/innerImage"
           android:src="@drawable/done"
           android:layout_margin="20sp"
           android:scaleType="centerCrop"
           android:layout_centerInParent="true"
          />
   </RelativeLayout>
```
4 When you setup your views remember to asign the inner image like so:
```Java
customProgressBarVar.setImgDone(customViewHolder.imgSign);  
```
5 Thats it, Enjoy Coding :).
