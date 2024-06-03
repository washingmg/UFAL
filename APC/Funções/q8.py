# palavraA = 'acabou'
# palavraB = 'cabo'

palavraA = 'abobora'
palavraB = 'bora'

# palavraA = 'avisar'
# palavraB = 'vida'
 
# palavraA = 'abcdebchij'
# palavraB = 'bchj'

def substring(A,B):
    if len(B) > len(A): 
        return False 
    else:
        a = 0
        b = 0 
        while a < len(A) and b < len(B): 
            if A[a] == B[b]: 
                b+=1 
                a+=1
            else:
                if b > 0: 
                    b = 0
                else:
                    a+=1 

        if b == len(B): 
            return True 
        elif a == len(A): 
            return False   

print(substring(palavraA,palavraB))

