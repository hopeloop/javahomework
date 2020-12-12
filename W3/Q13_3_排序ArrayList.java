package W3;
import java.util.ArrayList;

public class Q13_3_排序ArrayList {
    public static void main(String[] args) {
        Sort sort = new Sort();
        sort.list.add(4);
        sort.list.add(3);
        sort.list.add(9);
        sort.list.add(8);
        sort.list.add(5);
        sort.Sort(sort.list);
        for(Number num: sort.list){
            System.out.println(num);
        }
    }
}
class Sort{
    ArrayList<Number> list = new ArrayList<Number>();

    public Sort(){
    }

    public static void Sort(ArrayList<Number> list){
        if(list==null||list.size()==0)
            return;

        for(int i = list.size()-1;i>=0;i--){
            for(int j =0;j<i;j++){
                if(list.get(j).doubleValue()>list.get(j+1).doubleValue()){
                    int idx = j;
                    Number larger = list.get(j);
                    list.set(idx,list.get(j+1));
                    list.set(j+1,larger);
                }
            }
        }
    }
}