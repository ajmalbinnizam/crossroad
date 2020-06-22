# num=int(input('enter row'))
num=5
for i in range(0, num):
    for j in range(0, num-i-1):
     print(" ", end="")
    for j in range(0, i+1):
     print("*", end=" ")
    print()