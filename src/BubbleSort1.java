public class BubbleSort1 {
    public static void printArr(int a , int[] arr){
        System.out.printf("%d: ", a);
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i] );
        }
        System.out.println();
    }
    public static void bubbleShort (int[] list){
        int n = list.length;
        for (int i = 0; i < n; i++) {
            boolean isShorted = true;
            for (int j = 0; j < n-i-1 ; j++) {
               if(list[j] > list[j + 1]){
                   isShorted = false;
                   int temp = list[j];
                   list[j] = list[j+1];
                   list[j + 1] = temp;
               }
            }
            printArr(i,list);
//            if (isShorted)
//            break;
        }
    }


    public static void main(String[] args) {
        int[] list = {4,3,2,5,9,1,0,8};
        bubbleShort(list);
    }
}
