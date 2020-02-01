
def armstrong(num):
    '''Takes an int as an argument and determines whether argument is Armstrong number or not.'''

    strNum = str(num)
    intNum = [int(num) for num in strNum]
    result = sum([num**len(intNum) for num in intNum])

    if result == num:
        print(f"The number {num} is an Armstrong number.")
    else:
        print(f"The number {num} is not an Armstrong number.")


armstrong(32164049650)  # 10 digit Armstrong number
armstrong(32164049652)  # not an armstrong number
