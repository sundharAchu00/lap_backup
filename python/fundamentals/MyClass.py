class MyClass:
    def __init__(self, sid, name, age, city):
        self.sid = sid
        self.name = name
        self.age = age
        self.city = city

    def __setattr__(self, __name, __value):
        super().__setattr__(__name, __value)

    def __str__(self):
        return "[id : ", self.sid, ", name : ", self.name, ", age : ", self.age, "]"


obj = MyClass(0o1, 'sundhar', 23, 'chennai')
obj.__setattr__('city', 'virudhunagar')
print(obj.__str__())
print(obj.city)

