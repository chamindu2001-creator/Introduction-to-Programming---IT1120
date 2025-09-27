BEGIN
    // Declare variables
    SET amount AS number
    SET remaining AS number
    SET note5000 AS number
    SET note1000 AS number
    SET note500 AS number
    SET note200 AS number
    SET note100 AS number
    SET note50 AS number
    SET note20 AS number
    SET note10 AS number
    SET note5 AS number
    SET note2 AS number
    SET coin1 AS number

    // Input the rupee amount
    PRINT "Enter the rupee amount: "
    READ amount

    // Set remaining amount to the input amount
    SET remaining = amount

    // Calculate number of 5000 notes
    SET note5000 = remaining DIV 5000
    SET remaining = remaining MOD 5000

    // Calculate number of 1000 notes
    SET note1000 = remaining DIV 1000
    SET remaining = remaining MOD 1000

    // Calculate number of 500 notes
    SET note500 = remaining DIV 500
    SET remaining = remaining MOD 500

    // Calculate number of 200 notes
    SET note200 = remaining DIV 200
    SET remaining = remaining MOD 200

    // Calculate number of 100 notes
    SET note100 = remaining DIV 100
    SET remaining = remaining MOD 100

    // Calculate number of 50 notes
    SET note50 = remaining DIV 50
    SET remaining = remaining MOD 50

    // Calculate number of 20 notes
    SET note20 = remaining DIV 20
    SET remaining = remaining MOD 20

    // Calculate number of 10 notes
    SET note10 = remaining DIV 10
    SET remaining = remaining MOD 10

    // Calculate number of 5 notes
    SET note5 = remaining DIV 5
    SET remaining = remaining MOD 5

    // Calculate number of 2 notes
    SET note2 = remaining DIV 2
    SET remaining = remaining MOD 2

    // Calculate number of 1 coins
    SET coin1 = remaining

    // Output the results
    PRINT "5000 Notes- ", note5000
    PRINT "1000 Notes- ", note1000
    PRINT "500 Notes- ", note500
    PRINT "200 Notes- ", note200
    PRINT "100 Notes- ", note100
    PRINT "50 Notes- ", note50
    PRINT "20 Notes- ", note20
    PRINT "10 Notes- ", note10
    PRINT "05 Notes- ", note5
    PRINT "02 Notes- ", note2
    PRINT "01 Notes- ", coin1

END