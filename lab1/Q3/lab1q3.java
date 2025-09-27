BEGIN
    // Declare variables
    SET perimeter AS number
    SET length AS number
    SET width AS number

    // Input the perimeter
    PRINT "Enter the perimeter of the fence: "
    READ perimeter

    // Calculate length (since width = 3/4 * length, use perimeter = 2 * (length + width))
    // Let length = x, then width = (3/4) * x
    // Perimeter = 2 * (x + (3/4)x) = 2 * (7/4)x = (7/2)x
    // So, length = (2/7) * perimeter
    SET length = (2 / 7) * perimeter

    // Calculate width
    SET width = (3 / 4) * length

    // Output the results
    PRINT "Length of the fence: ", length
    PRINT "Width of the fence: ", width

END