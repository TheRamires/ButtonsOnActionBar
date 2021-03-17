package ram.ramires.myactionbar

import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel

class MyViewModel: ViewModel() {
    var buttonFirst= ObservableField<Boolean>(false)
    var buttonSecond= ObservableField<Boolean>(false)

}