import math
import sys
import re
position=[0,0]
steps=input("Please enter sequence of steps like 'UP 5DOWN 3LEFT 3RIGHT 2'")
detailedSteps=re.split('(\d+)',steps)
directions=[int(i) for i in detailedSteps[1::2]]
if(len(directions)!=4):
    print("Sufficient details are not there to calculate the distance")
    sys.exit()

position[0]+=directions[0]
position[0]-=directions[1]
position[1]-=directions[2]
position[1]+=directions[3]
print("point is at this distance from original position",round(math.sqrt(position[0]**2+position[1]**2),2))