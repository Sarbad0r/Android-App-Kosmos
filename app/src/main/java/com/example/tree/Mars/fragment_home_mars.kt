package com.example.tree.Mars

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
 * Use the [fragment_home_mars.newInstance] factory method to
 * create an instance of this fragment.
 */
class fragment_home_mars : Fragment() {
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
        return inflater.inflate(R.layout.fragment_home_mars, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var counter = 0

        val array_of_images = arrayOf(
            R.drawable.mars_one,
            R.drawable.mars_two,
            R.drawable.mars_three,
            R.drawable.mars_four,
            R.drawable.mars_five,
            R.drawable.mars_six,
            R.drawable.mars_seven,
        )

        val image_switcher_mars : ImageSwitcher = view.findViewById(R.id.image_switcher_mars)

        image_switcher_mars.setFactory(object : ViewSwitcher.ViewFactory{
            override fun makeView(): View {
                val ImageView = ImageView(activity)
                ImageView.setImageResource(array_of_images[0])
                return ImageView
            }
        })
        val btn_pre : Button = view.findViewById(R.id.btn_pre_mars)
        val btn_next : Button = view.findViewById(R.id.btn_next_mars)

        btn_next.setOnClickListener {
            if (counter < array_of_images.size - 1){
                counter++
                image_switcher_mars.setImageResource(array_of_images[counter])
            }
            else{
                counter = 0
                image_switcher_mars.setImageResource(array_of_images[counter])
            }
        }
        btn_pre.setOnClickListener {
            if (counter > 0){
                counter--
                image_switcher_mars.setImageResource(array_of_images[counter])
            }
            else{
                counter = array_of_images.size - 1
                image_switcher_mars.setImageResource(array_of_images[counter])
            }
        }

        val text_1_link_mars : TextView = view.findViewById(R.id.text_1_link_mars)
        val text_2_link_mars : TextView = view.findViewById(R.id.text_2_link_mars)

        text_1_link_mars.movementMethod = LinkMovementMethod.getInstance()
        text_2_link_mars.movementMethod = LinkMovementMethod.getInstance()



    }

    companion object {

        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment fragment_home_mars.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            fragment_home_mars().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}