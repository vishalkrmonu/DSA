import java.util.HashMap;
//find the subarray with given sum
class tut28{
    public static void Subarray(int arr[], int sum){
        int curSum=0;
        int start=0;
        int end=-1;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            curSum+=arr[i];
            if(curSum-sum==0){
                start=0;end=i;
                break;
            }
            if(map.containsKey(curSum-sum)){
                start=map.get(curSum-sum)+1;
                end=i;
                break;
            }
            map.put(curSum,i);
        }
        if(end==-1){
            System.out.println("not found");
        }else{
            System.out.println(start + " "+ end);
        }
    }
    public static void main(String[] args) {
        int arr[]={10,15,-5,15,-10,5};
        int sum=5;
        Subarray(arr, sum);
    }
}


// question : find largest subarray with equal no of 1 ans 0
// [1,1,0,1,1,0,0]
//convert 0 into -1
// new array [1,1,-1,1,1,-1,-1]


//count the distinct element in every window of size k
class tut29{
    public static void CountDistinctElement(int arr[],int k){
HashMap<Integer,Integer>map =new HashMap<>();
for(int i=0;i<k;i++){
    map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
}
System.out.println(map.size());
for(int i=k;i<arr.length;i++){
    if(map.get(arr[i-k])==1){
        map.remove(arr[i-k]);
    }
    else
        map.put(arr[i-k],map.get(arr[i-k])-1);
    
    map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
    System.out.println(map.size());
}
    }
    public static void main(String[] args) {
        int arr[]={1,2,2,1,3,1,1,3};
        int k=4;
        CountDistinctElement(arr, k);
    }
}