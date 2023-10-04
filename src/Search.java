import java.util.ArrayList;

public class Search {

    public static int linearSearch(int[] array, int value) {
        for(int i=0; i<array.length; i++){
            if (array[i]==value) return i;
        }
        return -1;

    }

    public static int linearSearch(ArrayList<String> list, String string) {
        for(int i=0; i<list.size(); i++){
            if (list.get(i).equals(string)) return i;
        }
        return -1;
    }

    public static int binarySearch(int[] array, int value) {
        System.out.println(value);
        System.out.println(" ");
        int l = 0; int r=array.length-1;
        while(l<=r){
            int mid = (l+r)/2;
            if(array[mid] == value) return mid;
            if(value > array[mid]){
                l = mid+1;
            }else{
                r = mid-1;
            }
            System.out.println(mid);
        }
        return -1;

    }

    public static int binarySearch(String[] array, String string) {
        int l = 0; int r=array.length-1;
        while(l<=r){
            int mid = (l+r)/2;
            if(array[mid].equals(string)) return mid;
        if(string.compareTo(array[mid])>0){
                l = mid+1;
            }else{
                r = mid-1;
            }
            System.out.println(mid);
        }
        return -1;

    }
}
