import csv,sys


def jobReader():
    jobs=set({})
    minAge=1000
    maxAge=0
    with open('C:\\Users\\Deepak\\Desktop\\Edureka_dataScience\\bank-data.csv') as csv_file:
            csv_reader = csv.reader(csv_file, delimiter=',')
            line_count = 0
            for row in csv_reader:
                if line_count == 0:
                    print(f'Column names are {", ".join(row)}')
                    line_count += 1
                else:
                    if(int(row[0])<minAge):
                        minAge=int(row[0])
                    elif(int(row[0])>maxAge):
                        maxAge=int(row[0])
                    jobs.add(row[1])
                    line_count += 1
            
    return(jobs,maxAge,minAge)


relJobs=set({})
relJobs,mxAge,mnAge=jobReader()
l=list(relJobs)
print(l,mxAge,mnAge)

while(1):
    data=input("Please enter occupation and age seperated by comma, Enter 'END,0' to exit ").split(',')
    occupation=data[0]
    if(occupation=='END'):
        print("Exiting program")
        sys.exit()
    age=int(data[1])
    output=[i for i in l if i.lower()==data[0].lower()]
    
    if(len(output)==1 and age>=mnAge and age<=mxAge):
        print("Eligible to give loans")
    else:
        print("Not Eligible to give loans, should be one of the ocuupations in",l,"and min and max age are",mnAge,mxAge," respectively")
