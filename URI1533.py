#https://www.urionlinejudge.com.br/judge/pt/problems/view/1533
answer=[]
while True:
	N = int(input())
	if N==0:
		break
	data = input()
	lista = [int(i) for i in data.split()]
	indexA=0
	A = 0
	first = max(lista)
	for i in range(0,N):
		if lista[i]>A and lista[i]<first:
			A=lista[i]
			indexA=i
	answer.append(indexA+1)		
for a in answer:
	print(a)