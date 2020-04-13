package bm.it.mobile.sample.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import bm.it.mobile.sample.R
import bm.it.mobile.sample.repository.UserRepository
import bm.it.mobile.sample.viewModel.UserViewModel
import kotlinx.android.synthetic.main.fragment_user.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class UserFragment : Fragment() {

    private lateinit var adapter: UserAdapter
    // private lateinit var viewModel: UserViewModel
    private val viewModel by viewModel<UserViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_user, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        init()
        setObserves()
    }

    private fun init() {
//        viewModel = ViewModelProvider(this,
//            UserViewModel.UserViewModelProvider(UserRepository())).get(UserViewModel::class.java)

        button.setOnClickListener {
            viewModel.validate(edittext.text.toString())
        }

        adapter = UserAdapter()
        recyclerview.adapter = adapter
    }

    private fun setObserves() {
        viewModel.getModelUpperCase().observe(this, Observer { list ->
            adapter.updateList(list)
            edittext.text.clear()
        })
    }
}
