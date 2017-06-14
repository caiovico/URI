#https://www.urionlinejudge.com.br/judge/pt/problems/view/1089
answer=[]
while True:
	N = int(input())
	if N == 0:
		break
	points = [int(i) for i in input().split()]
	count = 0	
	for i in range(-1,N-1):
		if points[i-1]<points[i] and points[i+1]<points[i] :
			count+=1
		elif points[i-1] > points[i] and points[i+1]>points[i]:
			count+=1
		#print("count: %d"%(count))	
	answer.append(count)
for a in answer:
	print (a)