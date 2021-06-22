package kr.hs.dgsw.where_corona.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.bumptech.glide.Glide
import kr.hs.dgsw.where_corona.R
import kr.hs.dgsw.where_corona.adapter.PrecautionAdapter.PrecautionViewHolder
import kr.hs.dgsw.where_corona.databinding.FragmentHomeBinding
import kr.hs.dgsw.where_corona.databinding.ItemPrecautionBinding

class PrecautionAdapter(private val imageList: List<Int>)
    : RecyclerView.Adapter<PrecautionViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PrecautionAdapter.PrecautionViewHolder {
        return PrecautionViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.item_precaution,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return imageList.size
    }

    override fun onBindViewHolder(holder: PrecautionViewHolder, position: Int) {
        holder.precaution.findViewById<ImageView>(R.id.iv_precaution).setImageResource(imageList[position])
    }

    inner class PrecautionViewHolder(private var binding: ItemPrecautionBinding) :
        RecyclerView.ViewHolder(binding.root) {
            val precaution = binding.ivPrecaution
    }
}
