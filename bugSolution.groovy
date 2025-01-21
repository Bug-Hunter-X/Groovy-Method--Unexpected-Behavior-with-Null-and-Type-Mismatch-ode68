```groovy
def myMethod(a, b) {
  if (a == null || b == null) {
    throw new IllegalArgumentException("Null values are not allowed.")
  }
  if (!(a instanceof Number && b instanceof Number)) {
    throw new IllegalArgumentException("Both parameters must be numbers.")
  }
  return a + b
}

println myMethod(1, 2) // Correct: Output 3

try {
  println myMethod(null, 2)
} catch (IllegalArgumentException e) {
  println "Exception caught: ${e.message}"
}

try {
  println myMethod([1, 2], 2)
} catch (IllegalArgumentException e) {
  println "Exception caught: ${e.message}"
}

try {
  println myMethod(null, null)
} catch (IllegalArgumentException e) {
  println "Exception caught: ${e.message}"
}
```