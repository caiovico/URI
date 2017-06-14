#https://www.urionlinejudge.com.br/judge/pt/problems/view/1026
answer = []
while True:
	try:
		data = str(input()).split()
		num1 = bin(int(data[0]))[2:].zfill(32)
		num2 = bin(int(data[1]))[2:].zfill(32)

		number = ''
		for i in range(0,32):
			if num1[i]!=num2[i]:
				number = number+'1'
			else:
				number = number+'0'

		answer.append(int(number,base=2))			
	except IndexError:
		break
	except EOFError:
		break	

for i in answer:
	print(i)		
