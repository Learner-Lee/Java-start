package BasePackage;

public class EasySort {
    private int[] arr;

    public EasySort(int[] arr) {
        this.arr = arr;
    }

    public void Sort(){
        Sort(arr);
    }
    // 编写一个堆排序的方法
    public static void Sort(int[] arr) {
        //1.构建大顶堆
        for(int i=arr.length/2-1;i>=0;i--){
            //从第一个非叶子结点从下至上，从右至左调整结构
            adjustHeap(arr,i,arr.length);
        }
        //2.调整堆结构+交换堆顶元素与末尾元素
        for(int j=arr.length-1;j>0;j--){
            swap(arr,0,j);//将堆顶元素与末尾元素进行交换
            adjustHeap(arr,0,j);//重新对堆进行调整
        }

    }


    // 将一个数组（二叉树），调整成一个大顶堆
    // 如何得到最后一个非叶子结点 ：arr.length/2-1 = 5/2-1 = 1;
    /**
     * 功能：完成将以 i 对应的非叶子结点的树调整成大顶堆
     * 举例 int[] arr = {4,6,8,5,9}; => i = 1 => adjustHeap => {4,9,8,5,6};
     * 如果再次调用 adjustHeap 传入的是 i = 0 => 得到 {4,9,8,5,6} => {9,6,8,5,4};
     * @param arr   待调整的数组
     * @param i     表示非叶子结点在数组中的索引
     * @param len   表示对多少个元素继续调整，len 是在逐渐减少
     */
    public static void adjustHeap(int[] arr, int i, int len){

        int temp = arr[i];//先取出当前元素的值，保存在临时变量
        // 开始调整
        // 说明
        // 1. k = i * 2 + 1   k 是 i 结点的左子树
        for (int k = i * 2 + 1; k < len; k = k * 2 + 1) {
            if (k+1 < len && arr[k] < arr[k+1]) {// 说明左子节点的值小于右子节点的值
                k++; // k 指向右子节点
            }
            if (arr[k] > temp) { // 如果子节点大于父亲结点
                arr[i] = arr[k]; // 把较大的值赋给当前结点
                i = k; // i 指向 K，继续循环比较
            }else {
                break;
            }
        }
        // 当for 循环结束后，我们已经将以 i 为父结点的树的最大值，放在了最顶（局部）
        arr[i] = temp;// 将temp值放到调整后的位置
    }


    /**
     * 交换元素
     * @param arr   数组
     * @param a     下标a
     * @param b     下标b
     */
    public static void swap(int []arr,int a ,int b){
        int temp=arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}
