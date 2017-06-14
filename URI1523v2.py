#https://www.urionlinejudge.com.br/judge/pt/problems/view/1523
#Estacionamento Linear
answer = []
while True:
	N,K = [int(i) for i in input().split()]
	if N==0 and K==0:
		break
	works = "Sim"	
	keepParking = True	
	park = []
	entries = []
	exits = {}
	events = {}
	for c in range(0,N):
		entry, exit = [int(i) for i in input().split()]
		if keepParking:
			if entry < exit:
				works = "Nao"
				keepParking = False
			if entry in entries:
				works = "Nao"
				keepParking = False			
			if exit in exits.keys():
				works = "Nao"
				keepParking = False	
		entries.append(entry)
		exits[exit] = c

		
	if keepParking:
		for car in range(0,N):
			toDelete = []
			alreadyEnteredActual = False	
			for j in sorted(exits.keys()):#goes through all keys (hours before actual)
				if j > entries[car]: #loops until exit hour >= actual hour
					break
				if j == entries[car]:#if reach the same hour
					if exits[j] == car:#check if the time to enter is the same as leave (same numbers)
						if len(park) == K:#if yes check if the park is full
							works = "Nao"
							keepParking = False
							break
						else:
							alreadyEnteredActual = True
							toDelete.append(j)#else delete from exits
					elif exits[j] != park.pop():#if exists a car to leave the same time to enter
						works = "Nao"
						keepParking = False
						break
					else:
						toDelete.append(j)#delete register						
				elif exits[j] != park.pop():
					works = "Nao"
					keepParking = False
					break
				else:
					toDelete.append(j)
				for d in toDelete:
					del exits[d]					
			if keepParking and not alreadyEnteredActual:
				if len(park) == K:
					works = "Nao"
					missing = N-car
					break
				else:
					park.append(car)
			else:
				break
			if car == N-1:
				for j in sorted(exits.keys()):
					if exits[j] != park.pop():
						works = "Nao"
						break					
	answer.append(works)
for a in answer:
	print(a)		