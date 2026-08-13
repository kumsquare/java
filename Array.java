import java.util.Arrays;

public class Array {
    private void Traversal(int []arr){
        for (int i=0;i<arr.length;i++){
            System.out.println(Arrays.toString(arr));
        }
    }
    private int [] Sort(int []arr){
        Arrays.sort(arr);
        return(arr);
    }
    private int SumOfElements(int []arr){
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        return(sum);
    }
    private int AverageOfElements(int []arr){
        int sum=SumOfElements(arr);
        int average=sum/arr.length;
        return average;
    }
    private boolean FindASpecificElement(int[] arr,int element){
        for(int i: arr){
            if(i==element)
                return true;
        }
        return false;
    }
    private int FindIndexOfAnElement(int [] arr, int element){
        for (int i=0;i<arr.length;i++){
            if(arr[i]==element){
                return i;
            }
        }
        return 0;
    }
    private int[] RemoveASpecificElementByIndex(int [] arr, int index){
        for(int i=index;i<arr.length;i++){
            arr[i]=arr[i+1];
        }
        return arr;
    }
    private int[] InsertElementByIndex( int [] arr, int index, int element){
        for(int i=arr.length-1;i>index;i--){
            arr[i]=arr[i-1];
        }
        arr[index]=element;
        return(arr);
    }
    
}
