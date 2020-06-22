# # i=20
# # while i<=10:
# #     print(i)
# #     i+=1
# # else:
# #     print("finished")
# for i in range(0,3):
#     print(i+1)
#1. function with no arg and no return  value
def add():  #no arg
      a=int(input("enter a: "))
      b=int(input("enter b: "))
      result = a+b
      print("add= ", result)
add()  #function call

#2. function with arg and no return value
def add(a,b):
    result=a+b
    print("add=",result)

add(10,30)

#3.function with no arg and with return value

def add():
    a = int(input("enter a: "))
    b = int(input("enter b: "))
    return a+b
result=add()
print("add =", result)


#4.function with arg and with return values


def add(a,b):
    sum=a+b
    return sum

result=add(10, 20)
print("add =", result)





