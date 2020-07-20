/*

Given a non-empty array of digits representing a non-negative integer, increment one to the integer.

The digits are stored such that the most significant digit is at the head of the list, 
and each element in the array contains a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.

Example 1:

Input: [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.

Example 2:

Input: [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.

*/

/**
 *
 * @param {number[]} digits
 * @returns {number[]}
 */
const plusOne = (digits) => {
  const { length } = digits;
  for (let index = length - 1; index >= 0; index--) {
    // if there's no need of a carry, just add one to the digit and return
    if (digits[index] < 9) {
      digits[index] += 1;
      return digits;
    }
    // else replace the digit with 0
    digits[index] = 0;
  }
  // if the first element of the array is now 0, add 1 to the start of the array
  // example [9] + 1 -> [0] -> [1, 0]
  digits.unshift(1);

  return digits;
};

plusOne([1, 2, 3]); // [1, 2, 4]
plusOne([4, 3, 2, 1]); // [4, 3, 2, 2]
plusOne([9]); // [1, 0]
