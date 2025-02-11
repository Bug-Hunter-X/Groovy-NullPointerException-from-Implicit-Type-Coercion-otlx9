# Groovy NullPointerException from Implicit Type Coercion

This repository demonstrates a common issue in Groovy where implicit type coercion interacts with null values, leading to unexpected `NullPointerExceptions`. The problem stems from not explicitly handling `null` returns from methods.  The `bug.groovy` file showcases the problem, while `bugSolution.groovy` presents the correction.

## Issue Description

The `someMethod` in `bug.groovy` can return `null` if its input parameters are null. However, `anotherMethod` assumes `someMethod` returns a value that responds to the `length()` method.  When `someMethod` returns `null`, the call to `length()` causes the exception.

## Solution

The `bugSolution.groovy` file modifies `someMethod` to return a default value (an empty string) if either input parameter is `null`. This prevents the `NullPointerException` in `anotherMethod`.  Explicit null handling is crucial in Groovy to avoid such errors, especially when interfacing with methods that might produce nulls.