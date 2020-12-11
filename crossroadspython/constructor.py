class SampleClass:
    year = 2020 #class variable
    def __init__(self,name, age, place): #constructor object create cheymbol tanna work cheyn
       self.name = name
       self.age = age
       self.place = place

    def add_age(self):
        self.age = self.age+1 #object variable

    def relocate(self, place):
        self.place=place

    def display(self):
        print("Year :", SampleClass.year)
        print("Name = ", self.name)
        print("age = ", str(self.age))
        print("place = ", self.place)

    @classmethod #----class method
    def add_year(cls): #class object
        SampleClass.year = SampleClass.year+1
        cls.year = cls.year + 1

    @staticmethod #s
    def display_welcome():
        print("welcome")


x = SampleClass('ajmal', 23, "kaval") #constructor argument
y = SampleClass('ummj', 22, "pallimk")

SampleClass.display_welcome()
x.display()
y.display()
print("------------------------------")

SampleClass.year = SampleClass.year + 1 #class method

x.add_age()
x.display()
y.display()
print("-----------------")

SampleClass.add_year()#------class method

y.relocate("polayathode")
x.relocate("trivandrum")
x.display()
y.display()