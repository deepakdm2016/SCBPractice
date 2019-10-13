words=input("please enter the words which are to be sorted seperated by space").split()
print(words)
sortedWords=sorted(words, key=None, reverse=False)
duplicatesRemoved=set({})
for w in sortedWords:
    duplicatesRemoved.add(w)
    
output=""
for i in sorted(list(duplicatesRemoved)):
    output+=(i+" ")
    
print(output)