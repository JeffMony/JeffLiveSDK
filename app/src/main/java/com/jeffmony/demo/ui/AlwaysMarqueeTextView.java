package com.jeffmony.demo.ui;

import android.content.Context;
import android.widget.TextView;

public class AlwaysMarqueeTextView extends TextView {
  
    // com.duopin.app.AlwaysMaguequeScrollView  
    public AlwaysMarqueeTextView(Context context) {
  
        super(context);  
  
        // TODO Auto-generated constructor stub  
    }  
  

    @Override
    public boolean isFocused() {  
        return true;
    }
  

}  