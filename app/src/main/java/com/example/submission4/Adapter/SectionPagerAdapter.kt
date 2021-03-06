package com.example.submission4.Adapter

import android.content.Context
import android.view.View
import androidx.annotation.Nullable
import androidx.annotation.StringRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.submission4.Fragment.MovieFragment
import com.example.submission4.Fragment.MovieFragment1
import com.example.submission4.Fragment.TvshowFragment
import com.example.submission4.Fragment.TvshowFragment1
import com.example.submission4.R

class SectionsPagerAdapter(private val mContext: Context, fm: FragmentManager) : FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    @StringRes
    private val TAB_TITLES = intArrayOf(R.string.tab_text_1, R.string.tab_text_2, R.string.tab_text_4, R.string.tab_text_3)
    override fun getItem(position: Int): Fragment {
        var fragment: Fragment? = null
        when (position) {
            0 -> fragment = MovieFragment()
            1 -> fragment = TvshowFragment()
            2 -> fragment = MovieFragment1()
            3 -> fragment = TvshowFragment1()
        }


        return fragment as Fragment
    }
    @Nullable
    override fun getPageTitle(position: Int): CharSequence? {
        return mContext.resources.getString(TAB_TITLES[position])
    }
    override fun getCount(): Int {
        return 4
    }

}