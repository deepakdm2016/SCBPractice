import math
def mathFormula(num,c=50,h=30):
    return int(math.sqrt(2*c*num/h))

numbers=input("Please enter the numbers seperated by comma")
n=numbers.split(',')

output=[mathFormula(int(i)) for i in  n]
print(output)

    

    
    