def capsSmall(word):
    caps=0
    small=0
    for c in word:
        if(c>='A' and c<='Z'):
            caps+=1
        elif(c>='a' and c<='z'):
            small+=1
        else:
            pass
    print("UPPER CASE",caps)
    print("LOWER CASE",small)
    return("")
    
print(capsSmall('Hello world!'))
        
