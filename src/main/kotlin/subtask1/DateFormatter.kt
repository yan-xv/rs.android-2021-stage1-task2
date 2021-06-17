package subtask1
import java.text.SimpleDateFormat
import java.util.*

class DateFormatter {

    // TODO: Complete the following function
    fun toTextDay(day: String, month: String, year: String): String {
        // получим дату по шаблону год-месяц-день
        val date = SimpleDateFormat("yyyy-M-d", Locale("ru")).parse("$year-$month-$day")

        // проверим дату обратным преобразованием
        return if ( SimpleDateFormat("d")   .format(date) == day &&
                    SimpleDateFormat("M")   .format(date) == month &&
                    SimpleDateFormat("yyyy").format(date) == year )
            SimpleDateFormat("dd MMMM, EEEE", Locale("ru")).format(date)
        else
            "Такого дня не существует"
    }
}
