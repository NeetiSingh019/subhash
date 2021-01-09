package aw.environment;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewpageAdapter extends FragmentPagerAdapter {

    private final List<Fragment> dataList = new ArrayList<>();
    private final List<String> dataTitles = new ArrayList<>();
    public ViewpageAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return dataList.get(position);
    }

    @Override
    public int getCount() {
        return dataTitles.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return dataTitles.get(position);
    }

    public void AddFragment (Fragment fragment, String title){

        dataList.add(fragment);
        dataTitles.add(title);
    }



}
