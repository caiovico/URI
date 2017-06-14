#https://www.urionlinejudge.com.br/judge/pt/problems/view/1451
#Teclado Quebrado
answer_list=[]
while True:
	try:
		homes = input().split('[')
		answer = ''
		for h in homes:
			ends = h.split(']')
			answer = ends[0]+answer
			for e in range(1,len(ends)):
				answer+=ends[e]
		answer_list.append(answer)

	except EOFError:
		break
for a in answer_list:
	print(a)
