inline fun <R> Iterable<T>.fold(
   initial: R,
   operation: (R, T) -> R
): R

fun sum(vararg nums:Int) =
   nums.fold(0) { acc, n -> acc + n }
