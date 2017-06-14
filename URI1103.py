#https://www.urionlinejudge.com.br/judge/pt/problems/view/1103
answer=[]
while True:
	try:
		line = str(input())
		if line.strip() == "0 0 0 0":
			break
		h1, m1, h2, m2 = [int(l) for l in line.split()]
		minutesA = h1*60+m1
		minutesB = h2*60+m2
		if minutesA < minutesB:
			answer.append(minutesB-minutesA)
		else:
			answer.append(1440-(minutesA-minutesB))	
	except EOFError:
		break
	except ValueError:
		break			
for a in answer:
	print(a)

#10% não passa no URI
#Already tested for identical times (1440 and 0)
#Both 10%WA
