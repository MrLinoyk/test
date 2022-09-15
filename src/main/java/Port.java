import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Port {

    /* Метод, преобразовывающий массив строк indexes в массив
    последовательностей чисел;
    */

    public List<List<Integer>> stringArrayToArraySequence(String[] indexes) {

        List<List<Integer>> result = new ArrayList<>();
        for (String index : indexes) {
            String[] array = index.split(",");
            List<Integer> integers2 = new ArrayList<>();
            for (int i = 0; i < array.length; i++) {
                if(!array[i].contains("-")) {
                    integers2.add(Integer.parseInt(array[i]));
                } else {
                    String[] strings = array[i].split("-");
                    int y = Integer.parseInt(strings[0]);
                    int z = Integer.parseInt(strings[1]);
                    while (y<=z) {
                        integers2.add(y);
                        y++;
                    }
                }
            }
            result.add(integers2);
        }
        return result;
    }

    /* Метод, возвращающий всевозможные уникальные упорядоченные группы
    элементов полученных массивов чисел.
    */

    public <T> List<List<T>> decard (List<List<T>> cols) {
        if (cols == null) return Collections.emptyList();
        List<List<T>> cp = Collections.singletonList(Collections.emptyList());
        for (List<T> col : cols) {
            if (col == null || col.size() == 0) continue;
            List<List<T>> next = new ArrayList<>();
            for (List<T> row : cp) {
                for (T el : col) {
                    List<T> nRow = new ArrayList<>(row);
                    nRow.add(el);
                    next.add(nRow);
                }
            }
            cp = next;
        }
        return cp;
    }
    public List<List<Integer>> second3 (String[] indexes) {
        List<List<Integer>> listList = stringArrayToArraySequence(indexes);
        return decard(listList);
    }

}
