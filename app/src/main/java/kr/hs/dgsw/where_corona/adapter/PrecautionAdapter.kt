package kr.hs.dgsw.where_corona.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import kr.hs.dgsw.where_corona.R
import kr.hs.dgsw.where_corona.adapter.PrecautionAdapter.PrecautionViewHolder
import kr.hs.dgsw.where_corona.databinding.FragmentPrecautionBinding
import kr.hs.dgsw.where_corona.view.activity.view.fragment.HomeFragment
import kr.hs.dgsw.where_corona.view.fragment.PrecautionFragment

class PrecautionAdapter(itemList: ArrayList<Int>) : Adapter<PrecautionViewHolder>() {

    var item = itemList

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ) : PrecautionAdapter.PrecautionViewHolder {
        return PrecautionViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.fragment_precaution,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int = item.size

    override fun onBindViewHolder(holder: PrecautionViewHolder, position: Int) {
        holder.precaution.setImageResource(item[position])
    }

    inner class PrecautionViewHolder(private var binding: FragmentPrecautionBinding) :
        RecyclerView.ViewHolder(binding.root) {

        val precaution = binding.ivPrecaution!!
    }
}
