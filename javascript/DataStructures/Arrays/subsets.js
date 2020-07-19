/*

Given a set of distinct integers, numbers, return all possible subsets (the power set).

Note: The solution set must not contain duplicate subsets.

Example:

Input: numbers = [1,2,3]
Output:
[
  [3],
  [1],
  [2],
  [1,2,3],
  [1,3],
  [2,3],
  [1,2],
  []
]

*/

((numbers) => {
  return numbers.reduce(
    (subsets, current) => {
      return subsets.concat(subsets.map((subset) => [...subset, current]));
    },
    [[]]
  );
})([1, 2, 3]);
