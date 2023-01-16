num = int(input("Please enter the number to find its prime factor "))
divisor=2 
factors=[]
while divisor <=num:
    if num%divisor==0:
        factors.append(divisor)
        num=num//divisor
    else:
        divisor+=1
print(factors)
