#https://www.urionlinejudge.com.br/judge/pt/problems/view/1031

answer=[]
while True:
	N = int(input())
	if N==0:
		break
	base = [i for i in range(1,N+1)]
	stop_searching = False
	i=0
	while True:
		i+=1
		cities = list(base)
		index = 0	
		while True:
			while index>=len(cities):
				index-=len(cities)	
			if cities[index]==13:
				break
			del cities[index]
			index+=i-1
			if len(cities)==1:
				if cities[0]==13:
					stop_searching = True
					answer.append(i)
				break
		if stop_searching:
			break
for a in answer:
	print(a)			




		