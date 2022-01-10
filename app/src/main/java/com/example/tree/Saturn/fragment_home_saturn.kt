package com.example.tree.Saturn

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
 * Use the [fragment_home_saturn.newInstance] factory method to
 * create an instance of this fragment.
 */
class fragment_home_saturn : Fragment() {
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
        return inflater.inflate(R.layout.fragment_home_saturn, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var counter = 0

        val array_of_images = arrayOf(
            R.drawable.saturn_one,
            R.drawable.saturn_two,
            R.drawable.saturn_three,
            R.drawable.saturn_four,
            R.drawable.saturn_five,
            R.drawable.saturn_seven,
            R.drawable.saturn_eight,
            R.drawable.saturn_nine,
        )

        val image_saturn_switcher : ImageSwitcher = view.findViewById(R.id.image_saturn_switcher)
        image_saturn_switcher.setFactory (object : ViewSwitcher.ViewFactory{
            override fun makeView(): View {
                val img = ImageView(activity)
                img.setImageResource(array_of_images[0])
                return img
            }
        })


        val btn_pre : Button = view.findViewById(R.id.btn_pre_saturn)
        val btn_next : Button = view.findViewById(R.id.btn_next_saturn)

        btn_next.setOnClickListener {
            if (counter < array_of_images.size - 1){
                counter++
                image_saturn_switcher.setImageResource(array_of_images[counter])
            }
            else{
                counter = 0
                image_saturn_switcher.setImageResource(array_of_images[counter])
            }
        }

        btn_pre.setOnClickListener {
            if (counter > 0){
                counter--
                image_saturn_switcher.setImageResource(array_of_images[counter])
            }
            else{
                counter = array_of_images.size - 1
                image_saturn_switcher.setImageResource(array_of_images[counter])
            }
        }

        val image_1_link_saturn : TextView = view.findViewById(R.id.text_1_link_saturn)
        image_1_link_saturn.movementMethod = LinkMovementMethod.getInstance()
        val image_2_link_saturn : TextView = view.findViewById(R.id.text_2_link_saturn)
        image_2_link_saturn.movementMethod = LinkMovementMethod.getInstance()



    }


    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment fragment_home_saturn.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            fragment_home_saturn().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}