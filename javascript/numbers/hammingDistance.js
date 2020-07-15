/* 

The [Hamming distance](https://en.wikipedia.org/wiki/Hamming_distance) between two integers is the number of positions at which the corresponding bits are different.

Given two integers `x` and `y`, calculate the Hamming distance.

Input: x = 1, y = 4

Output: 2

Explanation:
1   (0 0 0 1)
4   (0 1 0 0)
       ↑   ↑

The above arrows point to positions where the corresponding bits are different.

*/

/**
 *
 * @param {number} x
 * @param {number} y
 * @returns {number}
 */
const hammingDistance = (x, y) => {
  /* 
    input -> 1, 4
    1. XOR of two numbers -> 1 ^ 4
    2. Convert the number to its binary form -> 101
    3. Remove 0s from the string and return the length of this new string
  */
  return (x ^ y).toString(2).replace(/0/g, "").length;
};

hammingDistance(1, 4); // 2
hammingDistance(2, 5); // 3
