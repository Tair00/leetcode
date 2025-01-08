fun main() {
    val solution = Solution()
    val words1 = arrayOf("a", "aba", "ababa", "aa")
    println(solution.countPrefixSuffixPairs(words1)) // Output: 4

    val words2 = arrayOf("pa", "papa", "ma", "mama")
    println(solution.countPrefixSuffixPairs(words2)) // Output: 2

    val words3 = arrayOf("abab", "ab")
    println(solution.countPrefixSuffixPairs(words3)) // Output: 0
}
