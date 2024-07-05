public class BinarysSearch {
    public static void main(String[] arg){
        int arr[]={3,7,8,10,20,42,55};
        int n=arr.length;
        int key=20;

        int mid=n/2;
        int index = bst(arr,0,n-1,key);
        if(index != -1)
            System.out.println("Element found at index "+index);
        else
            System.out.println("Element not found");
    }

    static int bst(int arr[], int l, int r, int key){
        if(l>r){
            System.out.println("Element not found");
            return -1;
        }
        int mid = l + (r - l) / 2;
        if(arr[mid]==key){
            System.out.println("Element found at index "+mid);
            return mid;
        }
        if(arr[mid]>key){
            bst(arr,l,mid-1,key);
        }
        else{
            bst(arr,mid+1,r,key);
        }
return -1;
    }
}
