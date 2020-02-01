def bin_to_dec(num):
    """Takes a positive binary number as argument, returns decimal equivalent of the number."""
    strNum = str(num)
    for num in strNum:
        if num not in ['0', '1']:
            raise ValueError

    weightages = [pow(2, weightage) for weightage in range(0, len(strNum)+1)]

    bin = [int(digit) for digit in strNum]
    bin.reverse()

    index = 0
    dec = 0

    while index != len(bin):
        dec += bin[index] * weightages[index]
        index += 1

    return dec


number = bin_to_dec(1101)  # should return 13
print(number)
