def binaryToDecimal(num):
    rem=0
    i=0
    output=0
    while(num!=0):
        rem=num%10
        output=output+rem*2**i
        i+=1
        num//=10
        
    return output

print(binaryToDecimal(1111))

binarynumbers=input("Please enter 4 digit bunary numbers seperated by comma").split(',')

output=[int(i) for i in binarynumbers if (binaryToDecimal(int(i))) % 5==0 ]
print(output)