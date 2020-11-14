import java.util.Comparator;

public class CompNumName implements Comparator<Data> {
    @Override
    public int compare(Data o1, Data o2) {
        int flag = o1.getNumber() - o2.getNumber();

        if (flag == 0){
            return  o1.getName().compareTo(o2.getName());
        }
        return flag;
    }
}
