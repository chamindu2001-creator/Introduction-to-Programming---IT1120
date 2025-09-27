BEGIN
    // Declare variables
    SET num1 AS number
    SET num2 AS number
    SET sum AS number
    SET average AS number

    // Input two numbers
    PRINT "Enter first number: "
    READ num1
    PRINT "Enter second number: "
    READ num2

    // Calculate sum and average
    SET sum = num1 + num2
    SET average = sum / 2

    // Output results
    PRINT "Sum is: ", sum
    PRINT "Average is: ", average

END