package com.example.tree.Earth

import android.os.Bundle
import android.text.method.LinkMovementMethod
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.example.tree.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [fragment_home_earth.newInstance] factory method to
 * create an instance of this fragment.
 */
class fragment_home_earth : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home_earth, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val text_1_link_earth : TextView = view.findViewById(R.id.text_1_link_earth)
        text_1_link_earth.movementMethod = LinkMovementMethod.getInstance()

        val text_2_link_earth : TextView = view.findViewById(R.id.text_2_link_earth)
        text_2_link_earth.movementMethod = LinkMovementMethod.getInstance()
        
        var counter = 0

        val array_of_images = arrayOf(
            R.drawable.earth_one,
            R.drawable.earth_two,
            R.drawable.earth_three,
            R.drawable.earth_four,
            R.drawable.earth_five,
            R.drawable.earth_six,
            R.drawable.earth_seven,
        )

        val image_earth_swicher : ImageSwitcher = view.findViewById(R.id.image_earth_swicher)
        image_earth_swicher.setFactory( object : ViewSwitcher.ViewFactory{
            override fun makeView(): View {
                val ImageView = ImageView(activity)
                ImageView.setImageResource(array_of_images[0])
                return ImageView
            }
        })

        val btn_pre : Button = view.findViewById(R.id.btn_pre_earth)
        val btn_next : Button = view.findViewById(R.id.btn_next_earth)

        btn_next.setOnClickListener {
            if (counter < array_of_images.size - 1){
                counter++
                image_earth_swicher.setImageResource(array_of_images[counter])
            }
            else{
                counter = 0
                image_earth_swicher.setImageResource(array_of_images[counter])
            }
        }

        btn_pre.setOnClickListener {
            if (counter > 0){
                counter--
                image_earth_swicher.setImageResource(array_of_images[counter])
            }
            else{
                counter = array_of_images.size - 1
                image_earth_swicher.setImageResource(array_of_images[counter])
            }
        }



    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment fragment_home_earth.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            fragment_home_earth().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}