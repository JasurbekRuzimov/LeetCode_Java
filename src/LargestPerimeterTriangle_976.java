import java.util.Arrays;

public class LargestPerimeterTriangle_976 {
    public static void main(String[] args) {
        LargestPerimeterTriangle_976 triangle = new LargestPerimeterTriangle_976();
        System.out.println(triangle.largestPerimeter(new int[]{2,1,2}));
    }
    public int largestPerimeter(int[] A) {
        Arrays.sort(A);
        for (int i = A.length - 1; i >= 2; i--) {
            if (A[i] < A[i - 1] + A[i - 2]) {
                return A[i] + A[i - 1] + A[i - 2];
            }
        }
        return 0;
    }
}
