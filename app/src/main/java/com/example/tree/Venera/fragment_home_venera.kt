package com.example.tree.Venera

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
 * Use the [fragment_home_venera.newInstance] factory method to
 * create an instance of this fragment.
 */
class fragment_home_venera : Fragment() {
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
        return inflater.inflate(R.layout.fragment_home_venera, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var counter = 0

        val array_of_images = arrayOf(
            R.drawable.venera_one,
            R.drawable.venera_two,
            R.drawable.venera_three,
            R.drawable.venera_four
        )

        val ImageSwitcher : ImageSwitcher = view.findViewById(R.id.image_venera_switcher)

        ImageSwitcher.setFactory(object :ViewSwitcher.ViewFactory{
            override fun makeView(): View {
                 val Image = ImageView(activity)
                Image.setImageResource(array_of_images[0])
                return Image
            }
        })

        val TextLink : TextView = view.findViewById(R.id.text_1_link_venera)
        TextLink.movementMethod = LinkMovementMethod.getInstance()


        val btn_pre : Button = view.findViewById(R.id.btn_pre_venera)
        btn_pre.setOnClickListener {
            if (counter > 0){
                counter--
                ImageSwitcher.setImageResource(array_of_images[counter])
            }
            else{
                counter = array_of_images.size - 1
                ImageSwitcher.setImageResource(array_of_images[counter])
            }
        }

        val btn_next : Button = view.findViewById(R.id.btn_next_venera)
        btn_next.setOnClickListener {
            if (counter < array_of_images.size - 1){
                counter++
                ImageSwitcher.setImageResource(array_of_images[counter])
            }
            else{
                counter = 0
                ImageSwitcher.setImageResource(array_of_images[counter])
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
         * @return A new instance of fragment fragment_home_venera.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            fragment_home_venera().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}