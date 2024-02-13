class stock1{
    public static int MaxProfit(int arr[]){
        int MaxProfit=0;
        int Min=arr[0];
        for(int i=0;i<arr.length;i++){
            Min = Math.min(Min, arr[i]);
            int Profit = arr[i]-Min;
            MaxProfit = Math.max(MaxProfit, Profit);
        }
        return MaxProfit;
    }
    public static void main(String[] args) {
        int arr[]={5,2,6,1,4};
        System.out.println(MaxProfit(arr));
    }
}


class stock2{
    //multiple buy and sell
    public static int TotalProfit(int arr[]){
        int profit=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                profit += (arr[i]-arr[i-1]);
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int arr[]={5,2,6,1,4,7,3,6};
        System.out.println(TotalProfit(arr));
    }
}