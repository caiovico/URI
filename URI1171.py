#https://www.urionlinejudge.com.br/judge/pt/problems/view/1171

N = int(input())
answer = {0:0}
for i in range(0,N):
	data = int(input())
	if data in answer:
		answer[data]+=1
	else:
		answer[data]=1
del answer[0]	
for a,b in sorted(answer.items()):		
	print('%d aparece %d vez(es)'%(a,b))