from collections import deque
answer = []
while True:
	N,K =[int(i) for i in input().split()]
	if N==0 and N==K :
		break
	ent = []
	exi = []
	exiKeys = {}
	keepParking = True
	for i in range(0,N):
		a, b = [int(i) for i in input().split()]
		if keepParking:
			#checks if next entrance > previous entrance
			if len(ent)>0 and ent[-1]>=a:
				keepParking = False
			#checks if entrance < exit	
			elif a > b:
				keepParking = False
			ent.append(a)
			exi.append(b)
			exiKeys[b]=i
	#print(ent)		
	#print(exi)
	#Check for uniqueness of exit times
	if len(exiKeys) < N:
		keepParking = False
	maxCars = K
	park = []

	if keepParking:
		for i in range(0,N):
			#print("park: ", end='')
			#print(park)
			actualIn = 	ent[i]
			actualOut = exi[i]
			#Parking lot not empty
			if len(park)>0:
				#checks if enter and exit are differents
				if actualIn!=actualOut:
					#checks if enter hour <= hour of the car at the top
					if actualIn<park[-1]:
						#checks if hour to leave is inside the interval
						if actualOut<park[-1]:
							#park.appendleft(actualIn)
							park.append(actualOut)
							if len(park)>maxCars:
								keepParking = False
								break
						#if hour to leave is > the exit time of the car at topmost
						#wont work
						else:
							keepParking = False
							break
		
					#if the enter hour is after the exit of the top car:	
					#(if actualIn>=park[-1])	
					else:
						while True:
							#park.popleft()
							park.pop()
							#checks if park is empty
							if len(park)==0:	
								park.append(actualOut)
								break
							else:
								#if actualIn <= exit of the top car	
								if actualIn<park[-1]:
									#and actualOut is also inside the interval
									if actualOut<park[-1]:
										#put actual in the park
										park.append(actualOut)
										break
									else:
										keepParking = False
										break
						if not keepParking:
							break				
				#if actualIn==actualOut
				else:
					if actualIn<park[-1]:
						if len(park)==maxCars:
							keepParking = False
							break

					else:
						while True:	
							park.pop()
							if len(park) == 0 or actualIn<park[-1]:
								break
			#parking lot empty 
			elif actualIn!=actualOut:
				park.append(actualOut)
	#print('park in the end: ',end='')
	#print(park)			
	result = "Sim" if keepParking else "Nao"			
	print(result)					