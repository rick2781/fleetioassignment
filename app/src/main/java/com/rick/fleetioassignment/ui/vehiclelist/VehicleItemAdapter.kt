package com.rick.fleetioassignment.ui.vehiclelist

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.rick.fleetioassignment.databinding.VehicleListItemBinding
import com.rick.fleetioassignment.model.Vehicle

class VehicleItemAdapter(private val context: Context) :
    RecyclerView.Adapter<VehicleItemAdapter.DealItemViewHolder>() {

    private val diffUtilItemCallback = object : DiffUtil.ItemCallback<Vehicle>() {
        override fun areItemsTheSame(oldItem: Vehicle, newItem: Vehicle): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Vehicle, newItem: Vehicle): Boolean {
            return oldItem == newItem
        }
    }

    private val listDiffer = AsyncListDiffer(this, diffUtilItemCallback)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DealItemViewHolder {
        val binding =
            VehicleListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DealItemViewHolder(binding, context)
    }

    override fun getItemCount(): Int = listDiffer.currentList.size

    fun submitList(list: List<Vehicle>) = listDiffer.submitList(list)

    override fun onBindViewHolder(holder: DealItemViewHolder, position: Int) {
        holder.bind(listDiffer.currentList[position])
    }

    class DealItemViewHolder(
        private val binding: VehicleListItemBinding,
        private val context: Context
    ) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(item: Vehicle) {
            with(binding) {
                vehicleName.text = item.name
                vehicleMake.text = item.make
                vehicleModel.text = item.model
                vehicleVin.text = item.vin

                root.setOnClickListener {
                    val action =
                        VehicleListFragmentDirections.actionVehicleListFragmentToSecondFragment()
                    binding.root.findNavController().navigate(action)
                }
            }

            Glide.with(context)
                .load(item.imageUrl)
                .apply(RequestOptions.bitmapTransform(RoundedCorners(50)))
                .into(binding.vehiclePicture)
        }
    }
}