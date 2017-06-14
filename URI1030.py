#https://www.urionlinejudge.com.br/judge/pt/problems/view/1030

NC = int(input())
answer = []
for i in range(0,NC):
	n,k = [int(j) for j in input().split()]
	people = [i for i in range(1,n+1)]
	actual = -1
		 
	while True:
		if len(people)>1:
			actual += k
		else:
			answer.append(people[0])
			break
		while True:
			if actual<len(people):
				break
			else:
				actual-=len(people)	
		del people[actual]
		actual-=1

for	i in range(0,NC):
	print('Case %d: %d'%(i+1, answer[i]))	
			
