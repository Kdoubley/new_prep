def greet(name):
    return "Hello " + name

def add(a, b):
    return a + b

def is_passing(score):
    return score >= 10

print(greet("Youssef"))
print(add(5, 3))
print(is_passing(18))
print(is_passing(7))

# Normal way
scores = [18, 7, 15, 9, 20, 11]
passing = []
for score in scores:
    if score >= 10:
        passing.append(score)

# Python way — same thing in one line
passing = [score for score in scores if score >= 10]

print(passing)