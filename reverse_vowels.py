# Given a string, reverse only vowels in it. Leave the remaining string as it is.

# Input Format

# One string.

# Constraints

# 1 <= Length of string <= 10^5

# Output Format

# One string, the original string with vowels reversed.

# Sample Input 0

# trumpisshit
# Sample Output 0

# trimpisshut
in1 = input('')
list1 = []

for i in range(0, len(in1)):
    if in1[i] == 'a' or in1[i] == 'e' or in1[i] == 'i' or in1[i] == 'o' or in1[i] == 'u' or in1[i] == 'A' or in1[i] == 'E' or in1[i] == 'I' or in1[i] == 'O' or in1[i] == 'U':
        #print(in1[i])
        list1.append(in1[i])
    else:
        continue
        
        
list1.reverse()

j = 0

for i in range(0, len(in1)):
    if in1[i] == 'a' or in1[i] == 'e' or in1[i] == 'i' or in1[i] == 'o' or in1[i] == 'u' or in1[i] == 'A' or in1[i] == 'E' or in1[i] == 'I' or in1[i] == 'O' or in1[i] == 'U':
        print(list1[j], end = "")
        j = j+1
    else:
        print(in1[i], end = "")

    
