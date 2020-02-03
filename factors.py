def factor(num):
    """Returns the factors of a number."""
    factors = []
    for factor in range(1, num+1):
        if num % factor == 0:
            factors.append(factor)
    if num < 0:
        for factor in range(-1, num-1, -1):
            if num % factor == 0:
                factors.append(factor)

    if factors == [1, num]:
        return "The number is a prime number"
    return ", ".join([str(factor) for factor in factors])


x = factor(-36)  # returns list of all factors of the number
print(x)
