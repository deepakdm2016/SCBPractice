import sys
import math
def binSearch(li,search):
    f=0
    l=len(li)-1
    
    
    while(f<=l and (f+l)/2>1):
        if(li[int((f+l)/2)]==search):
            print("first If",li[((f+l)//2)])
            return ("element found")
            print(f,l)

        
    
        elif(search<li[int((f+l)/2)]):
            print("second If",li[((f+l)//2)])
            l=((f+l)//2)
            print(f,l)

    
        else:
            if(f!=l):
                print("in else",li[math.ceil((f+l)/2)])
                f=math.ceil((f+l)/2)
                print(f,l)
            else:
                return("Element not found")
                

    
    return("Element not found")
            

li=[1,4,6,8,9]
print(binSearch(li, 0.5))
    
    