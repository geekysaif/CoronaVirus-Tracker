package logic.mania.covid19_tracker.ui.main

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import logic.mania.covid19_tracker.R
import logic.mania.covid19_tracker.ui.main.adapter.ContactAdapter
import org.json.JSONArray
import org.json.JSONObject

class EmergencyContactActivity : AppCompatActivity() {

    private var recyclerView: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_emergency_contact)

        recyclerView = findViewById(R.id.recyclerView)
        checkPermission()
        get_number()

        findViewById<View>(R.id.back).setOnClickListener { finish() }
    }

    /*method for get number */
    fun get_number() {

        val jsonArray = JSONArray()

        val jsonObject0 = JSONObject()
        jsonObject0.put("name", "central helpline number")
        jsonObject0.put("number", "011-23978046")

        val jsonObject1 = JSONObject()
        jsonObject1.put("name", "Andaman & Nicobar")
        jsonObject1.put("number", "03192-232102")

        val jsonObject2 = JSONObject()
        jsonObject2.put("name", "Andhra Pradesh")
        jsonObject2.put("number", "0866-2410978")


        val jsonObject3 = JSONObject()
        jsonObject3.put("name", "Arunachal Pradesh")
        jsonObject3.put("number", "9436055743")


        val jsonObject4 = JSONObject()
        jsonObject4.put("name", "Assam")
        jsonObject4.put("number", "6913347770")


        val jsonObject5 = JSONObject()
        jsonObject5.put("name", "Bihar")
        jsonObject5.put("number", "104")

        val jsonObject6 = JSONObject()
        jsonObject6.put("name", "Chandigarh")
        jsonObject6.put("number", "9779558282")

        val jsonObject7 = JSONObject()
        jsonObject7.put("name", "Chhattisgarh")
        jsonObject7.put("number", "104")

        val jsonObject8 = JSONObject()
        jsonObject8.put("name", "Dadra Nagar Haveli")
        jsonObject8.put("number", "104")

        val jsonObject9 = JSONObject()
        jsonObject9.put("name", "Delhi")
        jsonObject9.put("number", "011-22307145")

        val jsonObject10 = JSONObject()
        jsonObject10.put("name", "Goa")
        jsonObject10.put("number", "104")

        val jsonObject11 = JSONObject()
        jsonObject11.put("name", "Gujarat")
        jsonObject11.put("number", "104")

        val jsonObject12 = JSONObject()
        jsonObject12.put("name", "Haryana")
        jsonObject12.put("number", "8558893911")

        val jsonObject13 = JSONObject()
        jsonObject13.put("name", "Himachal Pradesh")
        jsonObject13.put("number", "104")

        val jsonObject14 = JSONObject()
        jsonObject14.put("name", "Jammu")
        jsonObject14.put("number", "01912520982")

        val jsonObject15 = JSONObject()
        jsonObject15.put("name", "Jharkhand")
        jsonObject15.put("number", "104")

        val jsonObject16 = JSONObject()
        jsonObject16.put("name", "Karnataka")
        jsonObject16.put("number", "104")

        val jsonObject17 = JSONObject()
        jsonObject17.put("name", "Kashmir")
        jsonObject17.put("number", "01942440283")

        val jsonObject18 = JSONObject()
        jsonObject18.put("name", "Kerala")
        jsonObject18.put("number", "0471-2552056")

        val jsonObject19 = JSONObject()
        jsonObject19.put("name", "Ladakh")
        jsonObject19.put("number", "01982256462")

        val jsonObject20 = JSONObject()
        jsonObject20.put("name", "Lakshadweep")
        jsonObject20.put("number", "104")

        val jsonObject21 = JSONObject()
        jsonObject21.put("name", "Madhya Pradesh")
        jsonObject21.put("number", "104")

        val jsonObject22 = JSONObject()
        jsonObject22.put("name", "Maharashtra")
        jsonObject22.put("number", "020-26127394")

        val jsonObject23 = JSONObject()
        jsonObject23.put("name", "Manipur")
        jsonObject23.put("number", "3852411668")

        val jsonObject24 = JSONObject()
        jsonObject24.put("name", "Meghalaya")
        jsonObject24.put("number", "108")

        val jsonObject25 = JSONObject()
        jsonObject25.put("name", "Mizoram")
        jsonObject25.put("number", "102")

        val jsonObject26 = JSONObject()
        jsonObject26.put("name", "Nagaland")
        jsonObject26.put("number", "7005539653")

        val jsonObject27= JSONObject()
        jsonObject27.put("name", "Odisha")
        jsonObject27.put("number", "9439994859")

        val jsonObject28 = JSONObject()
        jsonObject28.put("name", "Puducherry")
        jsonObject28.put("number", "104")

        val jsonObject29 = JSONObject()
        jsonObject29.put("name", "Punjab")
        jsonObject29.put("number", "104")

        val jsonObject30 = JSONObject()
        jsonObject30.put("name", "Rajasthan")
        jsonObject30.put("number", "0141-2225624")

        val jsonObject31 = JSONObject()
        jsonObject31.put("name", "Sikkim")
        jsonObject31.put("number", "104")

        val jsonObject32 = JSONObject()
        jsonObject32.put("name", "Tamil Nadu")
        jsonObject32.put("number", "044-29510500")

        val jsonObject33 = JSONObject()
        jsonObject33.put("name", "Telangana")
        jsonObject33.put("number", "104")

        val jsonObject34 = JSONObject()
        jsonObject34.put("name", "Tripura")
        jsonObject34.put("number", "0381-2315879")

        val jsonObject35 = JSONObject()
        jsonObject35.put("name", "Uttarakhand")
        jsonObject35.put("number", "104")

        val jsonObject36 = JSONObject()
        jsonObject36.put("name", "Uttar Pradesh")
        jsonObject36.put("number", "18001805145")

        val jsonObject37 = JSONObject()
        jsonObject37.put("name", "West Bengal-1")
        jsonObject37.put("number", "1800313444222")

        val jsonObject38 = JSONObject()
        jsonObject38.put("name", "West Bengal-2")
        jsonObject38.put("number", "03323412600")


        jsonArray.put(jsonObject0)
        jsonArray.put(jsonObject1)
        jsonArray.put(jsonObject2)
        jsonArray.put(jsonObject3)
        jsonArray.put(jsonObject4)
        jsonArray.put(jsonObject5)
        jsonArray.put(jsonObject6)
        jsonArray.put(jsonObject7)
        jsonArray.put(jsonObject8)
        jsonArray.put(jsonObject9)
        jsonArray.put(jsonObject10)
        jsonArray.put(jsonObject11)
        jsonArray.put(jsonObject12)
        jsonArray.put(jsonObject13)
        jsonArray.put(jsonObject14)
        jsonArray.put(jsonObject15)
        jsonArray.put(jsonObject16)
        jsonArray.put(jsonObject17)
        jsonArray.put(jsonObject18)
        jsonArray.put(jsonObject19)
        jsonArray.put(jsonObject20)
        jsonArray.put(jsonObject21)
        jsonArray.put(jsonObject22)
        jsonArray.put(jsonObject23)
        jsonArray.put(jsonObject24)
        jsonArray.put(jsonObject25)
        jsonArray.put(jsonObject26)
        jsonArray.put(jsonObject27)
        jsonArray.put(jsonObject28)
        jsonArray.put(jsonObject29)
        jsonArray.put(jsonObject30)
        jsonArray.put(jsonObject31)
        jsonArray.put(jsonObject32)
        jsonArray.put(jsonObject33)
        jsonArray.put(jsonObject34)
        jsonArray.put(jsonObject35)
        jsonArray.put(jsonObject36)
        jsonArray.put(jsonObject37)
        jsonArray.put(jsonObject38)

        recyclerView!!.adapter =
            ContactAdapter(jsonArray, applicationContext)
        recyclerView!!.layoutManager = LinearLayoutManager(applicationContext)

    }


    /*call permission*/
    fun checkPermission() {
        if (ContextCompat.checkSelfPermission(
                this,
                Manifest.permission.CALL_PHONE
            )
            != PackageManager.PERMISSION_GRANTED
        ) {

            // Permission is not granted
            // Should we show an explanation?
            if (ActivityCompat.shouldShowRequestPermissionRationale(
                    this,
                    Manifest.permission.CALL_PHONE
                )
            ) {
                // Show an explanation to the user *asynchronously* -- don't block
                // this thread waiting for the user's response! After the user
                // sees the explanation, try again to request the permission.
            } else {
                // No explanation needed, we can request the permission.
                ActivityCompat.requestPermissions(
                    this,
                    arrayOf(Manifest.permission.CALL_PHONE),
                    42
                )
            }
        } else {
            // Permission has already been granted
             
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<String>, grantResults: IntArray
    ) {
        if (requestCode == 42) {
            // If request is cancelled, the result arrays are empty.
            if ((grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED)) {
                // permission was granted, yay!
                
            } else {
                // permission denied, boo! Disable the
                // functionality
            }
            return
        }
    }

 
}