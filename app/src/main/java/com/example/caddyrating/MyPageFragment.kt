//　マイページ画面

package com.example.caddyrating

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class MyPageFragment : Fragment() {

    companion object {
        private const val TAG = "SecondFragment"
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_mypage, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val backButton = view.findViewById<Button>(R.id.back_button)
        backButton.setOnClickListener{
            Log.d(TAG, "BackButton pressed!")
            fragmentManager?.popBackStack()
        }
    }
}