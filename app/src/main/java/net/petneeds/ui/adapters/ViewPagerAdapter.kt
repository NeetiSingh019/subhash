package net.petneeds.ui.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import net.petneeds.ui.auth.LoginFragment
import net.petneeds.ui.lostandfound.FoundFragment
import net.petneeds.ui.lostandfound.LostFragment


class ViewPagerAdapter(
    fm: FragmentManager
) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        var fragment: Fragment? = null
        if (position == 0)
            fragment = LostFragment()
        else if (position == 1)
            fragment = FoundFragment()
        return fragment!!
    }

    override fun getCount(): Int {
        return 2
    }

    override fun getPageTitle(position: Int): CharSequence? {
        var title: String? = null
        if (position == 0)
            title = "LOST"
        else if (position == 1)
            title = "FOUND"
        return title
    }
}