#https://www.urionlinejudge.com.br/judge/pt/problems/view/1087
answer = []
while True:
	data = str(input())
	if data == '0 0 0 0':
		break
	data=data.split()
	x1 = int(data[0])
	y1 = int(data[1])
	x2 = int(data[2])
	y2 = int(data[3])

	if abs(x1-x2)==0:
		if abs(y1-y2)==0:
			answer.append(0)
		else:
			answer.append(1)	
	elif abs(y1-y2)==0:
		answer.append(1)
	elif abs(x1-x2)==abs(y1-y2):
		answer.append(1)
	else:	
		answer.append(2)

for a in answer:
	print(a)					