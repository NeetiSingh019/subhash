package net.petneeds.ui.lostandfound

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import net.petneeds.R
import net.petneeds.ui.adapters.ViewPagerAdapter


class LostAndFoundActivity : AppCompatActivity() {
    var tabLayout: TabLayout? = null
    var viewPager: ViewPager? = null
    var viewPagerAdapter: ViewPagerAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lost_and_found)

        viewPager = findViewById(R.id.view_pager);
        tabLayout = findViewById(R.id.taablayout);

        viewPagerAdapter = ViewPagerAdapter(
                getSupportFragmentManager());
        viewPager!!.setAdapter(viewPagerAdapter);

        // It is used to join TabLayout with ViewPager.
        tabLayout!!.setupWithViewPager(viewPager);
    }
}