"""

# Euclid's Algorithm 

- Find the greatest common deniminator (GCD) of two integers.

Example: GCD of 20 and 8 is 4 
because 8/4 is 2 and 20/4 is 5 

- Steps: 
* For two integers a and b, where a > b, divide a by b.
* If the remainder, r, is 0, then stop. GCD is b.
* Otherwise, set a to b, b to r, and repeat step 1 until r is 0. 

"""

def find_gcd_of(a, b):
    x = 1
    y = 1
    if (a > b):
        x = a
        y = b 
    else:
        x = b 
        y = a 

    return calculate_divider(x, y)

def calculate_divider(x, y):
    r = x % y 
    if (r == 0):
        return y 
    else:
        x = y
        y = r 
        return calculate_divider(x, y)

def gcd(a, b):
    while (b != 0):
        t = a 
        a = b 
        b = t % b 
    
    return a

if __name__ == "__main__":
    print("GCD of 20 and 10 is: ", find_gcd_of(20, 10))
    print("GCD of 20 and 8 is: ", find_gcd_of(20, 8))
    print("GCD of 20 and 8 is: ", gcd(4, 8))
