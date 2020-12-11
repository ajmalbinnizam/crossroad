class MySample:
    def hello(self, n):
        self.name = n

    def print_hello(self, m):
        print(m, self.name)
        print()


x = MySample()
y = MySample()
x.hello("aju")
y.hello("ummj")
x.print_hello("hi")
y.print_hello("hi")