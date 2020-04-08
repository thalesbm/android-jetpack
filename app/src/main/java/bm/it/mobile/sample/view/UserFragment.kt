package bm.it.mobile.sample.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import bm.it.mobile.sample.R
import bm.it.mobile.sample.model.UserModel
import bm.it.mobile.sample.viewModel.UserViewModel
import kotlinx.android.synthetic.main.fragment_user.*

class UserFragment : Fragment() {

    lateinit var viewModel: UserViewModel

    companion object {
        fun newInstance(viewModel: UserViewModel): UserFragment {
            val fragment = UserFragment()
            fragment.viewModel = viewModel
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_user, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.getModelUpperCase().observe(this, Observer { userModel ->
            textview.text = userModel.name
        })

        button.setOnClickListener {
            viewModel.validate(edittext.text.toString())
        }
    }

}