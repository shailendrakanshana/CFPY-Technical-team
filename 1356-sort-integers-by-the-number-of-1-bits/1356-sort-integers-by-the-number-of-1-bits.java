class Solution {
    public int[] sortByBits(int[] arr) {
        int n = arr.length;
        int ar[] = new int[n];
        for(int i = 0;i<n;i++){
            int a = arr[i];
            int c = 0;
            while(a!=0){
                c++;
                a = a&(a-1);
            }
            ar[i] = c;
        }
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                if(ar[j]<ar[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
                }
                if(ar[i]==ar[j] && arr[j]<arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}