import java.io.File

/* ITERATING THROUGH INDICES
 * -------------------------
 * The code below iterates over an array `words`, finds each anagram of
 * the searchWord, and prints it along with its position in the array.
 *
 *     1. Refactor this code to use `words.withIndex()` or `words.forEachIndexed`.
 *
 *     2. How many anagrams of 'kale' are there?
 */

val searchWord = "loop" // Anagram subject

fun getAnagrams(words: Array<String>, searchWord: String) {
    println("Anagrams of '${searchWord}'...")

    for (index in words.indices) {
        val word = words[index]
        if (word != searchWord && isAnagram(word, searchWord))
            println("'${word}', at position $index")
    }
}


/* <<< DO NOT EDIT THIS CODE >>> */
val file = File("${__FILE__.getAbsoluteFile().parent}/../data/words_list.txt")
val bufferedReader = file.bufferedReader()
val words: Array<String> = (bufferedReader.readLines()).toTypedArray()

fun String.sortWord(): String {
    val arr = this.toCharArray()
    return arr.sorted().joinToString("")
}

fun isAnagram(word1: String, word2: String): Boolean {
    // Check if word1 is an anagram of word2 (case-sensitive)
    return word1.sortWord() == word2.sortWord()
}

getAnagrams(words, searchWord)
