import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Paši - paši...
1. Izveido rindas.
2. Ievieto tajā desmit rindiņas.
3. Uzzini, kura rindiņa sarakstā atkārtojas: pati īsākā vai pati garākā.
Ja tādas rindiņas ir vairākas, tad jāievēro pašas pirmās no tām.
4. Izvadi uz ekrāna rindu no saraksta 3..


Требования:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Программа должна считывать 10 строк с клавиатуры и добавлять их в список.
3. Программа должна выводить на экран самую короткую строку, если она была раньше самой длинной.
4. Программа должна выводить на экран самую длинную строку, если она была раньше самой короткой.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++)
            list.add(reader.readLine());
        int minS = list.get(0).length(), maxS = minS;
        for (String s : list){
            if (s.length() > maxS)
                maxS = s.length();
            if (s.length() < minS)
                minS = s.length();
        }
        for (String s : list)
            if (s.length() == maxS || s.length() == minS){
                System.out.println(s);
                break;
            }
    }
}
