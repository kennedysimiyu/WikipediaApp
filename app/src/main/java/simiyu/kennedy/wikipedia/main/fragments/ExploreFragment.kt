package simiyu.kennedy.wikipedia.main.fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import simiyu.kennedy.wikipedia.R


/**
 * A simple [Fragment] subclass.
 */
class ExploreFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_explore, container, false)
    }

}// Required empty public constructor
