/*

You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. 
DO NOT allocate another 2D matrix and do the rotation.

Example 1:
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[7,4,1],[8,5,2],[9,6,3]]

Example 2:
Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]

Example 3:
Input: matrix = [[1,2],[3,4]]
Output: [[3,1],[4,2]]

*/

/**
 * Rotates an image clockwise in-place.
 * @param {number[][]} image
 * @returns void
 */
function rotateImage(image) {
  // If we create a transpose of [[1,2],[3,4]] we get [[1,3],[2,4]]
  // whereas if we reverse the matrix to [[3,4], [1,2]], the transpose would be [[3,1], [4,2]]
  // we could also achieve this by reversing each row of the transpose of a matrix [[1,3],[2,4]] -> [[3,1],[4,2]]
  image.reverse();

  let temp;

  // Find the transpose of the image matrix.
  for (let i = 0; i < image.length; i++) {
    for (let j = i + 1; j < image[i].length; j++) {
      temp = image[i][j];
      image[i][j] = image[j][i];
      image[j][i] = temp;
    }
  }
}

let image = [
  [1, 2],
  [3, 4],
];
rotateImage(image);
console.log(image); //? [[3,1],[4,2]]
