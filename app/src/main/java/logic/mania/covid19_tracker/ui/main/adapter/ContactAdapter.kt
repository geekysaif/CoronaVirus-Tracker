package logic.mania.covid19_tracker.ui.main.adapter

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.items_contact.view.*
import logic.mania.covid19_tracker.R

import org.json.JSONArray

class ContactAdapter(val jsonArray: JSONArray, val context: Context?) :
    RecyclerView.Adapter<ContactAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(
                context
            ).inflate(R.layout.items_contact, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder?.state_name?.text = jsonArray.getJSONObject(position).getString("name")
        holder?.state_number?.text = jsonArray.getJSONObject(position).getString("number")

        holder?.v_card_view.setOnClickListener {

            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + jsonArray.getJSONObject(position).getString("number")))
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            context?.startActivity(intent)

        }


    }
    override fun getItemCount() = jsonArray.length()

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val state_name = view.state_name
        val state_number = view.state_number
        val v_card_view = view.v_card_view

    }





}