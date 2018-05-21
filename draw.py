import matplotlib.pyplot as plt

x = []
array_y = []
linked_y = []
array_file = open("array.txt")
for line in array_file:
    splited = line.split(",")
    x.append(splited[0])
    array_y.append(int(splited[1]))
array_file.close()

linked_file = open("linked.txt")
for line in linked_file:
    splited = line.split(",")
    linked_y.append(int(splited[1]))
linked_file.close()
print("+-----------------+")
print(array_y)
print(linked_y)
print(x)
plt.plot(x, array_y, 'r--')
plt.plot(x, linked_y, 'b--')
plt.xlabel('Amount of elements')
plt.ylabel('Time in milli seconds')
plt.title('Blue - linked list : Red - array list')
# plt.plot(x, linked_y, 'bo')
plt.show()
