#https://www.urionlinejudge.com.br/judge/pt/problems/view/1514
answer = []


while True:
	N,M=[int(i) for i in input().split()]
	if N==0 or M==0:
		break
	matrix = []
	for i in range(0,N):
		line = [int(i) for i in input().split()]
		matrix.append(list(line))
	#test1 (line by line checking if it is fulfilled):
	answer.append(4)
	for i in range(0,N):
		if sum(matrix[i]) == M:
			answer[-1]-=1
			break
	#test2 (collecting collumns looking for a 0 sum)
	for i in range(0,M):
		if sum([matrix[j][i] for j in range(0,N)])==0:
			answer[-1]-=1
			break
	#test3 (collecting collumns looking for a N sum)
	for i in range(0,M):
		if sum([matrix[j][i] for j in range(0,N)])==N:
			answer[-1]-=1
			break			
	#test4 (lines  )		
	for i in range(0,N):
		if sum(matrix[i]) == 0:
			answer[-1]-=1
			break
for a in answer:
	print (a)