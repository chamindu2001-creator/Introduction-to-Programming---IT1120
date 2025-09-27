BEGIN
    // Declare variables
    SET sideLength AS number
    SET perimeter AS number
    SET radius AS number
    SET pi AS number

    // Set constant value for pi
    SET pi = 22 / 7

    // Input the length of a side of the square
    PRINT "Enter the length of a side of the square: "
    READ sideLength

    // Calculate the perimeter of the square
    SET perimeter = 4 * sideLength

    // Calculate the radius of the circular fence
    // Circumference = 2 * pi * radius, so radius = perimeter / (2 * pi)
    SET radius = perimeter / (2 * pi)

    // Output the radius
    PRINT "The radius of the circular fence is: ", radius

END