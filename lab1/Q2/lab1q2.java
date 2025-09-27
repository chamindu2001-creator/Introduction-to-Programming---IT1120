BEGIN
    // Declare variables
    SET knownHeights AS array of 3 numbers
    SET average AS number
    SET totalHeight AS number
    SET missingHeight AS number

    // Input the heights of the known three people
    FOR i = 0 TO 2 DO
        PRINT "Enter height of person ", i + 1, ": "
        READ knownHeights[i]
    END FOR

    // Input the calculated average
    PRINT "Enter the calculated average height: "
    READ average

    // Calculate the total height of all 5 people
    SET totalHeight = average * 5

    // Calculate the sum of known heights
    SET sumKnown = knownHeights[0] + knownHeights[1] + knownHeights[2]

    // Calculate the missing height (same for both due to being almost the same)
    SET missingHeight = (totalHeight - sumKnown) / 2

    // Output the missing height
    PRINT "The missing height is: ", missingHeight

END