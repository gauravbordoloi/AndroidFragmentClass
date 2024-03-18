package com.codercampy.fragmentclass

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.codercampy.fragmentclass.databinding.FragmentDetailBinding
import java.text.SimpleDateFormat
import java.util.Locale

class FragmentDetail : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return FragmentDetailBinding.inflate(layoutInflater).root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val currentTime = FragmentDetailArgs.fromBundle(requireArguments()).currentTime
        view.findViewById<TextView>(R.id.tv).text =
            SimpleDateFormat("hh:mm a, dd MMM yyyy", Locale.getDefault()).format(currentTime)

    }

}