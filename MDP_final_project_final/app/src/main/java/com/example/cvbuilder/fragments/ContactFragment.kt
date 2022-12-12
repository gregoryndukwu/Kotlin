package com.example.cvbuilder.fragments

import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.cvbuilder.R
import java.util.*


class ContactFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_contact, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //  INSTAGRAM
        getView()?.findViewById<Button>(R.id.contact_btn_instagram)?.setOnClickListener {
            openAppOrBrowser("instagram://Gregory", "https://www.instagram.com/microsoft/")
        }

        //  PHONE NUMBER
        getView()?.findViewById<Button>(R.id.contact_btn_phone)?.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:6419884456")
            startActivity(intent)
        }

        // OPEN GOOGLE MAPS
        getView()?.findViewById<Button>(R.id.contact_btn_address)?.setOnClickListener {
            val lat = "41.006586"
            val long = "-91.954493"
            val geoUri = "http://maps.google.com/maps?q=loc:" + lat+ "," + long + " ( Gregory Houses )"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(geoUri))
            requireContext().startActivity(intent)
        }

        // OPEN EMAIL CLIENT
        getView()?.findViewById<Button>(R.id.contact_btn_email)?.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            intent.type = "plain/text"
            intent.putExtra(Intent.EXTRA_EMAIL, arrayOf("ndukwusud@gmail.com"))
            intent.putExtra(Intent.EXTRA_SUBJECT, "CVBuilder contact")
            intent.putExtra(Intent.EXTRA_TEXT, "Gregory I founded Your Resume, using your APP")
            startActivity(Intent.createChooser(intent, "Open with"))
        }

        // OPEN LINKEDIN
        getView()?.findViewById<Button>(R.id.contact_btn_linkedin)?.setOnClickListener {
            openAppOrBrowser("linkedin://Gregory-Augusto", "https://www.linkedin.com/in/gregoryndukwu/")
        }


    }

    fun openAppOrBrowser(appURL: String, browserURL: String) {
        var intent = Intent(Intent.ACTION_VIEW, Uri.parse(appURL))
        val packageManager = requireContext().packageManager
        val list = packageManager.queryIntentActivities(intent!!, PackageManager.MATCH_DEFAULT_ONLY)
        if (list.isEmpty()) {
            intent = Intent(Intent.ACTION_VIEW, Uri.parse(browserURL))
        }
        startActivity(intent)
    }
}