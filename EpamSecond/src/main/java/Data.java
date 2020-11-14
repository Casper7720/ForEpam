import java.util.Comparator;
import java.util.Objects;

public class Data{
    private int number;
    private String name;

    public Data(int number, String name){
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Data data = (Data) o;
        return number == data.number &&
                Objects.equals(name, data.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, name);
    }
    //    public static Comparator<Data> numberComparator = new Comparator<Data>(){
//
//        @Override
//        public int compare(Data d1, Data d2) {
//            return d1.getNumber() - d2.getNumber();
//        }
//    };
//
//    public static Comparator<Data> nameComparator = new Comparator<Data>() {
//        @Override
//        public int compare(Data o1, Data o2) {
//            return o1.getName().compareTo(o2.getName());
//        }
//    };
}
