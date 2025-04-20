package com.healthsync.app.adapter

import android.graphics.drawable.GradientDrawable
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.healthsync.app.databinding.ItemTicketBinding
import com.healthsync.app.model.TicketSummary
import com.healthsync.app.utils.StatusColorUtil

class TicketSummaryAdapter(val data: List<TicketSummary>, private val onItemClicked: (TicketSummary) -> Unit ):

    RecyclerView.Adapter<TicketSummaryAdapter.ViewHolder>() {
    class ViewHolder(val binding: ItemTicketBinding) :
        RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemTicketBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val element = data[position]
        with(holder.binding){
            txtEstado.text = element.status
            txtFecha.text = element.date
            txtDescripcion.text = element.problemType

            val color = StatusColorUtil.getColorForStatus(holder.binding.root.context, element.status)
            val drawable = txtEstado.background as GradientDrawable
            drawable.setColor(color)
            hitboxTicket.setOnClickListener{
                onItemClicked(element)
            }

}


}
}

