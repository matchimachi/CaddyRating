//　評価入力画面

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.caddyrating.MyPageFragment
import com.example.caddyrating.R

class EvaluationInput : Fragment() {

    companion object {
        private const val TAG = "FirstFragment"
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.evaluationinput, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val toSecondButton = view.findViewById<Button>(R.id.to_second_fragment_button)
        toSecondButton.setOnClickListener{
            Log.d(TAG, "tos MyPageButton pressed!")
            val secondFragment = MyPageFragment()
            val fragmentTransaction = fragmentManager?.beginTransaction()
            fragmentTransaction?.addToBackStack(null)
            fragmentTransaction?.replace(R.id.fragment_container, secondFragment)
            fragmentTransaction?.commit()
        }
    }
}