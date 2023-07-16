import java.util.Scanner;
public class ClosestMinMax {
    static int findClosest(int[] array,int size)
    {
        int maxElement = Integer.MIN_VALUE;
        int minElement = Integer.MAX_VALUE;
        int latestMinIndex = -1, latestMaxIndex = -1;
        for (int i : array){
            maxElement = Math.max(i,maxElement);
            minElement = Math.min(i,minElement);
        }
        int count = Integer.MAX_VALUE;
        for (int i = 0 ; i < size ; i++){
            if (array[i] == maxElement){
                latestMaxIndex = i;
                if (latestMinIndex >= 0){
                    count = Math.min(Math.abs(i - latestMinIndex )+ 1,count);
                }
            }
            if (array[i] == minElement){
                latestMinIndex = i;
                if (latestMaxIndex >= 0){
                    count = Math.min(Math.abs(i-latestMaxIndex )+ 1,count);
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++)
        {
            A[i]=scanner.nextInt();
        }
        int closest=findClosest(A,n);
        System.out.println(closest);
    }
}
