#https://www.urionlinejudge.com.br/judge/pt/problems/view/1077
N = int(input())
for i in range(0,N):
	expression = input().split("(?=))")
	for e in expression:
		print(e)