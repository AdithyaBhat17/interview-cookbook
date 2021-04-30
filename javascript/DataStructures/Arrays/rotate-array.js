// Rotate an array k times to the right where k is non-negative.

// Example
// Input -> nums = [1,2,3,4,5,6,7], k =3
// Output -> nums = [5,6,7,1,2,3,4]

// Approach 1
function rotate(nums, k) {
  for (let i = 0; i < k % nums.length; i++) {
    let previous = nums[nums.length - 1];
    let temp;
    for (let j = 0; j < nums.length; j++) {
      temp = nums[j];
      nums[j] = previous;
      previous = temp;
    }
  }
}

// Approach 2 (Reverse array)
function rotate(nums, k) {
  // nums -> [1,2,3,4,5,6,7]
  k = k % nums.length;
  // reverse the entire array
  reverse(nums, 0, nums.length - 1); // nums -> [7,6,5,4,3,2,1]
  // reverse the first k members of the array
  reverse(nums, 0, k - 1); // nums -> [5,6,7,4,3,2,1]
  // reverse the last k members of the array
  reverse(nums, k, nums.length - 1); // nums -> [5,6,7,1,2,3,4]
}

function reverse(nums, start, end) {
  let temp;
  while (start < end) {
    temp = nums[start];
    nums[start] = nums[end];
    nums[end] = temp;
    start++;
    end--;
  }
}

let num = [1, 2, 3, 4, 5, 6, 7];
rotate(num, 3);
console.log(num); // [5,6,7,1,2,3,4]
