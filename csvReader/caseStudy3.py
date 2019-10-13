import csv,sys,re

class CustomerNotAllowedException(Exception):
    """Raised when customer is blacklisted"""
    pass

customerList=list()

class Customer:
    
    def __init__(self,title,firstName,lastName,blackListed):
        self.title=title
        self.firstName=firstName
        self.lastName=lastName
        self.blackListed=blackListed
        
    def createOrder(self):
        try:
            if(int(self.blackListed)==1):
                raise CustomerNotAllowedException
            else:
                print('Order created for : ',self.title,self.firstName,self.lastName)
        except CustomerNotAllowedException:
                print('order will not be created for this blacklisted customer: ',self.title,self.firstName,self.lastName)
                
        

def fairDeal():
    dataSet=set()
    with open('C:\\Users\\Deepak\\Desktop\\Edureka_dataScience\\FairDealCustomerData.csv') as csv_file:
            csv_reader = csv.reader(csv_file, delimiter=',')
            for row in csv_reader:
                
                title_firstName=row[1].split('.')
                title=title_firstName[0]
                firstName=title_firstName[1]
                
                customerList.append(Customer(title,firstName,row[0],row[2]))
            
            for cs in customerList:
                cs.createOrder() 
                
            csv_file.close()
    
fairDeal()

    

'''class customer:
    def __init__(self,title,firstName,lastName):
        print()
'''