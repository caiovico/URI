#https://www.urionlinejudge.com.br/judge/pt/problems/view/1379
#Problema com Mediana e Media
while True:
	A,B=[int(i) for i in input().split()]
	if A == 0 and B == 0:
		break
	C = 2*A-B
	print(C)