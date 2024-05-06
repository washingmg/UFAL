vetor1 = [14,21,5,45,12,3,86,98,46,53,24,2,1,15,90,47]
vetor2 = [2,0,-5,-1,3,10,43,12,-2,-2,1,4,6,8,23]
vetor3 = [1,2,3,4,5]


def quickSort(vetor,):
 
    
    if len(vetor) <= 1:
        return vetor
    else:
        pivor = vetor[len(vetor) // 2]
        L = [x for x in vetor if x < pivor]
        M = [x for x in vetor if x == pivor]
        R = [ x for x in vetor if x > pivor]

  
    return quickSort(L) + M + quickSort(R)


print(quickSort(vetor1))
print(quickSort(vetor2))
print(quickSort(vetor3))

