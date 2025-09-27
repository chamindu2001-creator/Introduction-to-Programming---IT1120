BEGIN
    // Declare variables
    SET pricePerKg AS number
    SET kilograms AS number
    SET totalBill AS number
    SET discount AS number
    SET amountToPay AS number

    // Input price per kg and number of kilograms
    PRINT "Enter price of 1kg of rice (Rs): "
    READ pricePerKg
    PRINT "Enter number of kilograms: "
    READ kilograms

    // Calculate total bill
    SET totalBill = pricePerKg * kilograms

    // Calculate discount (10% of total bill)
    SET discount = totalBill * 0.10

    // Calculate amount to pay after discount
    SET amountToPay = totalBill - discount

    // Output results
    PRINT "Total bill: ", totalBill
    PRINT "Discount (10%): ", discount
    PRINT "Amount to pay after discount: ", amountToPay

END