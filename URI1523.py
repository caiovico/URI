#https://www.urionlinejudge.com.br/judge/pt/problems/view/1523
#Estacionamento Linear
answer = []
while True:
	N,K = [int(i) for i in input().split()]
	if (N==0):
		break
	park = []
	entrance_reg = []
	exit_reg= []
	for car in range(0,N):
		e,o=[int(i) for i in input().split()]
		entrance_reg.append(e)
		exit_reg.append(o)

	min_hour = entrance_reg[0]
	max_hour = max(exit_reg)
	print(max_hour)

	for i in range(0,N):
		entrance_reg[i]-=min_hour
		exit_reg[i]-=min_hour

	entrances = []
	exits = []

	for i in range(0,max_hour):
		entrances.append(-1)
		exits.append(-1)
	#put each car registry in hour list
	for car in range(0,N):
		entrances[ entrance_reg[car] ] = car
		exits[ exit_reg[car] ] = car
	works = "Sim"
	#first car enter the park
	park.append(0)
	if exits[0]==0:
		park.pop()
	#now the play starts	
	for	hour in range(1,max_hour):
		if entrances[hour]!=-1 or exits[hour]!=-1:
			if entrances[hour] == exits[hour]:
				if len(park) == K:
					works = "Nao"
					break
				else:
					continue
			if exits[hour] != -1:
				if exits[hour] == park[-1]:
					park.pop()
					if entrances[hour] != -1:
						park.append(entrances[hour])
				else:
					works = "Nao"
					break		
			else:
				if len(park)==K:
					works = "Nao"
					break
				else:
					park.append(entrances[hour])								
	answer.append(works)
for a in answer:
	print(a)	