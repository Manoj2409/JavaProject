package rough.Collections.list;
import java.util.ArrayList;
// mostly used in storage of data and accessing of data
// not good in manipulation of data compared with linkedList
// default capacity is 10
public class arraylist
{
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(7);
        arrayList.add(9);

        ArrayList<Integer> arrayList1=new ArrayList<Integer>();
        arrayList1.add(7);
        arrayList1.add(9);
        arrayList.addAll(arrayList1);
        System.out.println(arrayList);
    }

    public static void print(String string){
        System.out.println(string);
    }
    public static void print(int string){
        System.out.println(string);
    }
}
