package com.zizmotrex.foodfast.login;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class LoginAdapter extends FragmentPagerAdapter {

    private Context context;
    int totlalTabs;

    public LoginAdapter(FragmentManager fm, Context ctx, int totlalTabs){
        super(fm);
        this.context = ctx;
        this.totlalTabs = totlalTabs;
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                LoginTabFragment loginTabFragment = new LoginTabFragment();
                return loginTabFragment;
            case 1:
                SignUpFragment signUpFragment = new SignUpFragment();
                return signUpFragment;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return totlalTabs;
    }
}
