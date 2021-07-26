public class Problem1 {
    public static void subarray(int value, int[] arr){
        for(int i = 0; i < arr.length; i++){
            int total = 0;
            for(int j = i; j < arr.length; j++){
                
                total+=arr[j];
                if(total < value){
                    continue;
                }else if(total == value){
                    System.out.print("{ ");
                    for(int k = i; k <= j; k++){
                        System.out.print(arr[k] + " ");

                    }
                    System.out.println("}");
                    return;
                }else{
                    break;
                }


                
            }
        }
        return;
    }
}
