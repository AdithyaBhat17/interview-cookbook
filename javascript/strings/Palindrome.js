/*
 * Check if a given string is a palindrome.
 * Palindrome is a string that is the same when read forward so as backward e.g. 'madam'
 */

/**
 * Checks if the given word is a palindrome
 * @param {string} word
 * @param {boolean} [caseSensitive=false]
 */
function isPalindrome(word, caseSensitive = false) {
    if (!caseSensitive) {
        word = word.toLowerCase()
    }

    return word === word.split('').reverse().join('');
}

console.log(isPalindrome('madam')); // True
console.log(isPalindrome('anything')); // False
console.log(isPalindrome('Madam', true)); // False