public class firstpair {
    public static void main(String args[]){
        int []arr={8,7,6,5,3,2};
    int target=10;
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]+arr[j]==target);
            System.out.println("pair found:"+arr[i]+" "+arr[j]);
        }
    }

    
    }
     }
