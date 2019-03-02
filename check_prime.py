#Check if prime or not using preemptive methods Python
def isprime(n):
    
    if n == 2:
        return True
    if n == 3:
        return True
    if n % 2 == 0:
        return False
    if n % 3 == 0:
        return False

    i = 5
    w = 2

    while i * i <= n:
        if n % i == 0:
            return False

        i += w
        w = 6 - w

    return True

in1 = int(input())
if in1 == 1:
    print("no")
elif isprime(in1) == True:
    print("yes")
else:
    print("no")