```groovy
def someMethod(a, b) {
  if (a == null || b == null) {
    return null //This is where the bug happens.  NullPointerException is thrown further down
  }
  // some code
  def result = a + b
  return result
}

def anotherMethod(x, y) {
  def value = someMethod(x, y)
  println value.length() //NullPointerException thrown here if someMethod returned null
}

anotherMethod(10, null)
```