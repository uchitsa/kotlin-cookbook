inline fun <R> Iterable<T>.fold(
   initial: R,
   operation: (R, T) -> R
): R
