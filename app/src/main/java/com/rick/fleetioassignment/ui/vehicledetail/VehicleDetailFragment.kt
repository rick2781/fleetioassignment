package com.rick.fleetioassignment.ui.vehicledetail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.rick.fleetioassignment.databinding.FragmentVehicleDetailBinding

class VehicleDetailFragment : Fragment() {

    private var _binding: FragmentVehicleDetailBinding? = null

    private val binding get() = _binding!!

    private val args: VehicleDetailFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentVehicleDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(args.vehicle) {

            binding.vehicleName.text = this.name

            Glide.with(this@VehicleDetailFragment)
                .load(this.imageUrl)
                .apply(RequestOptions.bitmapTransform(RoundedCorners(50)))
                .into(binding.vehiclePicture)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}