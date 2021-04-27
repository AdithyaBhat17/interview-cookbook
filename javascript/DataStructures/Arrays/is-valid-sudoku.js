/**
Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated 
according to the following rules:

Each row must contain the digits 1-9 without repetition.
Each column must contain the digits 1-9 without repetition.
Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
Note:

A Sudoku board (partially filled) could be valid but is not necessarily solvable.
Only the filled cells need to be validated according to the mentioned rules.
 */

/*
Example: 

Input: board = 
[["5","3",".",".","7",".",".",".","."]
,["6",".",".","1","9","5",".",".","."]
,[".","9","8",".",".",".",".","6","."]
,["8",".",".",".","6",".",".",".","3"]
,["4",".",".","8",".","3",".",".","1"]
,["7",".",".",".","2",".",".",".","6"]
,[".","6",".",".",".",".","2","8","."]
,[".",".",".","4","1","9",".",".","5"]
,[".",".",".",".","8",".",".","7","9"]]

Output: true
*/

/**
 Input: board = 
[["8","3",".",".","7",".",".",".","."]
,["6",".",".","1","9","5",".",".","."]
,[".","9","8",".",".",".",".","6","."]
,["8",".",".",".","6",".",".",".","3"]
,["4",".",".","8",".","3",".",".","1"]
,["7",".",".",".","2",".",".",".","6"]
,[".","6",".",".",".",".","2","8","."]
,[".",".",".","4","1","9",".",".","5"]
,[".",".",".",".","8",".",".","7","9"]]

Output: false
Explanation: Same as Example 1, except with the 5 in the top left corner 
being modified to 8. Since there are two 8's in the top left 3x3 sub-box, it is invalid.
 */

/**
Constraints:

board.length == 9
board[i].length == 9
board[i][j] is a digit or '.'.
 */

/**

Algorithm:

1. Move along the board
    - check for each cell value if it was seen already in the current row/column/box.
        - Return false if yes.
    - Keep this value for further trace.
2. Return true

Traversing through the box.
- You can traverse through each row in a box by using
3 * i//3 + j//3
- we have to wait to traverse all columns in a row before moving to the next row.
- Traverse through each column in a row of the box using
3 * (i%3) + (j%3)

 */

function isValidSudoku(board) {
  for (let i = 0; i < board.length; i++) {
    let rows = new Set();
    let cols = new Set();
    let boxes = new Set();

    for (let j = 0; j < board.length; j++) {
      let rowElement = board[i][j];
      let colElement = board[j][i];
      let boxElement =
        board[3 * Math.floor(i / 3) + Math.floor(j / 3)][3 * (i % 3) + (j % 3)];

      if (rowElement !== ".") {
        if (rows.has(rowElement)) return false;
        rows.add(rowElement);
      }
      if (colElement !== ".") {
        if (cols.has(colElement)) return false;
        cols.add(colElement);
      }
      if (boxElement !== ".") {
        if (boxes.has(boxElement)) return false;
        boxes.add(boxElement);
      }
    }
  }

  return true;
}

let board = [
  ["8", "3", ".", ".", "7", ".", ".", ".", "."],
  ["6", ".", ".", "1", "9", "5", ".", ".", "."],
  [".", "9", "8", ".", ".", ".", ".", "6", "."],
  ["8", ".", ".", ".", "6", ".", ".", ".", "3"],
  ["4", ".", ".", "8", ".", "3", ".", ".", "1"],
  ["7", ".", ".", ".", "2", ".", ".", ".", "6"],
  [".", "6", ".", ".", ".", ".", "2", "8", "."],
  [".", ".", ".", "4", "1", "9", ".", ".", "5"],
  [".", ".", ".", ".", "8", ".", ".", "7", "9"],
];

isValidSudoku(board); //? false

board = [
  ["5", "3", ".", ".", "7", ".", ".", ".", "."],
  ["6", ".", ".", "1", "9", "5", ".", ".", "."],
  [".", "9", "8", ".", ".", ".", ".", "6", "."],
  ["8", ".", ".", ".", "6", ".", ".", ".", "3"],
  ["4", ".", ".", "8", ".", "3", ".", ".", "1"],
  ["7", ".", ".", ".", "2", ".", ".", ".", "6"],
  [".", "6", ".", ".", ".", ".", "2", "8", "."],
  [".", ".", ".", "4", "1", "9", ".", ".", "5"],
  [".", ".", ".", ".", "8", ".", ".", "7", "9"],
];

isValidSudoku(board); //? true
