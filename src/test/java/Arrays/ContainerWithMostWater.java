package Arrays;

/**You are given an integer array height of length n.
 * There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
 Find two lines that together with the x-axis form a container, such that the container contains the most water.

 Return the maximum amount of water a container can store.

 Notice that you may not slant the container.

*/



 public class ContainerWithMostWater {
 public int maxArea(int[] height) {
  int ans = 0;
  int l = 0;
  int r = height.length - 1;

  while (l < r) {
   final int minHeight = Math.min(height[l], height[r]);
   ans = Math.max(ans, minHeight * (r - l));
   if (height[l] < height[r])
    ++l;
   else
    --r;
  }

  return ans;
 }

 public static void main(String[] args) {
  ContainerWithMostWater solution = new ContainerWithMostWater();
  int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
  System.out.println("Maximum area: " + solution.maxArea(height));  // Output: 49
 }
}
