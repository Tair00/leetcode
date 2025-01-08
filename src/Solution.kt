class Solution {
    fun countPrefixSuffixPairs(words: Array<String>): Int {
        // Function to check if str1 is both a prefix and suffix of str2
        fun isPrefixAndSuffix(str1: String, str2: String): Boolean {
            return str2.startsWith(str1) && str2.endsWith(str1)
        }

        var count = 0

        // Iterate through all pairs (i, j) where i < j
        for (i in words.indices) {
            for (j in i + 1 until words.size) {
                if (isPrefixAndSuffix(words[i], words[j])) {
                    count++
                }
            }
        }

        return count
    }
}
