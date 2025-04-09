import os
# f = open('demo.txt', 'r')

# for line in f:
#     print(line)

# print(f.read())

# print(f.readline())
# print(f.readline())
# print(f.readline())
# f.close()
# print(f.read())

f = open('demo.txt', 'a')

if f.writable():
    f.write("this is from my code ")
    f.writelines('this is done using writelines')
    f.close()
f = open('demo.txt','r')

# print(f.read())

print(os.curdir.upper())

print(os.pardir)

# f = open("myfile.txt", "x") # this will give us a FileExistError
f = open("myfile.txt", "w") # this will give us Exception

f.close()

if os.path.exists('myfile.txt') and os.path.exists('demo.txt'):
    os.remove('myfile.txt')
    os.remove('demo.txt')
else:
    print("the given file path doesn't exist")
