import java.util.*;
//largest rectangular in histogram
import java.util.Stack;
class maxarea {
    int maxArea(int[] a) {
        int maxans = 0;
        int ps[] = prevSmaller(a);
        int ns[] = nextSmaller(a);
        for (int i = 0; i < a.length; i++) {
            int curr = (ns[i] - ps[i] - 1) * a[i];
            maxans = Math.max(maxans, curr);
        }
        return maxans;
    }

    int[] prevSmaller(int[] a) {
        int ps[] = new int[a.length];
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < a.length; i++) {
            while (!s.isEmpty() && a[s.peek()] >= a[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                ps[i] = -1;
            } else {
                ps[i] = s.peek();
            }
            s.push(i);
        }
        return ps;
    }

    public int[] nextSmaller(int[] a) {
        int ns[] = new int[a.length];
        Stack<Integer> s = new Stack<>();
        for (int i = a.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && a[s.peek()] <= a[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                ns[i] = -1;
            } else {
                ns[i] = s.peek();
            }
            s.push(i);
        }
        return ns;
    }

    public static void main(String[] args) {
        maxarea m = new maxarea();
        int[] a = {4,2,1,5,6,3,2,4,2};
        System.out.print(m.maxArea(a));
    }
}

//tut45
//largest area submatrix with all 1's
// 0 1 1 0
// 1 1 1 1
// 1 1 1 1
// 1 1 0 0
// Output :8

class areaSubmatrix{
    public static int largestArea(int [][]arr){
        int curRow[]=arr[0];
        int maxans=maxHistogram(curRow);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==1){
                    curRow[j]+=1;
                }else{
                    curRow[j]+=0;
                }

            }
            int curAns=maxHistogram(curRow);
            maxans=Math.max(maxans,curAns);
        }
        return maxans;
    }

    public static int maxHistogram(int[] heights) {
        int maxArea = 0;
        Stack<Integer> stack = new Stack<>();
        int n = heights.length;

        for (int i = 0; i <= n; i++) {
            while (!stack.isEmpty() && (i == n || heights[i] < heights[stack.peek()])) {
                int height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, height * width);
            }
            stack.push(i);
        }
        return maxArea;
    }
    public static void main(String[] args) {
        int arr[][] = {
            { 0, 1, 1, 0 },
            { 1, 1, 1, 1 },
            { 1, 1, 1, 1 },
            { 1, 1, 0, 0 },
        };
        System.out.println(largestArea(arr));
    }
}