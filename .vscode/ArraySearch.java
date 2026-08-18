package.vscode;

public class ArraySearch {
    void search()
    {

    void search(int ref[], int key) {
        boolean found = true;
        for (int i = 0; i <= ref.length - 1; i++) {
            if (ref[i] == key) {
                System.out.println("Element found at index :" + i);
                found = false;
            }
        }
        if (found) {
            System.out.println("Element not found...");
        }
    }}

    Class Main{

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };
        ArraySearch as = new ArraySearch();
        as.search(arr, 30);
    }
}

}
