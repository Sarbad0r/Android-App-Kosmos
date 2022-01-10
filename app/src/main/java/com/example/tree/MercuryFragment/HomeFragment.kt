package com.example.tree.MercuryFragment

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
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment(){
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
        // Inflate the layout for this fragmen
        return inflater.inflate(R.layout.fragment_home_mercury, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        lateinit var image_mercury_switcher : ImageSwitcher

        val array_of_images_mercury = arrayOf(
            R.drawable.mercury_one,
            R.drawable.mercury_two,
            R.drawable.mercury_three,
            R.drawable.mercury_four
        )

        val TextViewLink_1 :TextView

        var counter = 0


        TextViewLink_1 = view.findViewById(R.id.text_1_link)
        TextViewLink_1.movementMethod  = LinkMovementMethod.getInstance()


        image_mercury_switcher = view.findViewById(R.id.image_mercury_switcher)
        image_mercury_switcher.setFactory(object: ViewSwitcher.ViewFactory{
            override fun makeView(): View {
                val imageView = ImageView(activity)
                imageView.setImageResource(array_of_images_mercury[0])
                return imageView
            }
        })

        val btn_pre : Button = view.findViewById(R.id.btn_pre_mercury)
        val btn_next : Button = view.findViewById(R.id.btn_next_mercury)

        btn_next.setOnClickListener {
            if (counter < array_of_images_mercury.size - 1){
                counter++
                image_mercury_switcher.setImageResource(array_of_images_mercury[counter])
            }
            else{
                counter = 0
                image_mercury_switcher.setImageResource(array_of_images_mercury[counter])
            }
        }

        btn_pre.setOnClickListener {
            if (counter > 0) {
                counter--
                image_mercury_switcher.setImageResource(array_of_images_mercury[counter])
            }
            else{
                counter = array_of_images_mercury.size - 1
                image_mercury_switcher.setImageResource(array_of_images_mercury[counter])
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
         * @return A new instance of fragment HomeFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            HomeFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}