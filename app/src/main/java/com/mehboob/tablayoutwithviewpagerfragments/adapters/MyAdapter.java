package com.mehboob.tablayoutwithviewpagerfragments.adapters;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import com.mehboob.tablayoutwithviewpagerfragments.fragments.CallFragment;
import com.mehboob.tablayoutwithviewpagerfragments.fragments.ChatFragment;
import com.mehboob.tablayoutwithviewpagerfragments.fragments.GroupFragment;
import com.mehboob.tablayoutwithviewpagerfragments.fragments.MessagesFragment;

public class MyAdapter extends FragmentPagerAdapter {

    private Context context;
    private int totalTabs;
    public MyAdapter(@NonNull FragmentManager fm,Context context, int totalTabs) {
        super(fm);
        this.context=context;
        this.totalTabs=totalTabs;
    }



    @NonNull
    @Override
    public Fragment getItem(int position) {
      switch (position){

          case 0:
              ChatFragment chatFragment = new ChatFragment();
              return chatFragment;
          case 1:
              CallFragment callFragment = new CallFragment();
              return callFragment;
          case 2:
              MessagesFragment messagesFragment = new MessagesFragment();
              return  messagesFragment;

          case 3:
              GroupFragment groupFragment = new GroupFragment();
              return groupFragment;

          default:
              return null;
      }
    }

    @Override
    public int getCount() {
        return totalTabs;
    }
}
