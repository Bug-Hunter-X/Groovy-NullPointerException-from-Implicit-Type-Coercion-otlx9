```groovy
def someMethod(a, b) {
  if (a == null || b == null) {
    return "" // Return an empty string instead of null
  }
  // some code
  def result = a + b
  return result.toString() // Ensure result is a String
}

def anotherMethod(x, y) {
  def value = someMethod(x, y)
  println value.length() // No longer throws NullPointerException
}

anotherMethod(10, null)
anotherMethod(null,20)
```