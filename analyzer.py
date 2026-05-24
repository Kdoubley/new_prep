name = "Youssef"
age = 21
languages = ["Python", "Java", "JavaScript"]
scores = {"math": 18, "physics": 16, "cs": 20}

print(name)
print(age)
print(languages[0])
print(scores["cs"])

# List operations
languages.append("React")
print(languages)

# Loop through a list
for lang in languages:
    print("I know " + lang)

# Loop through a dictionary
for subject, score in scores.items():
    print(subject + ": " + str(score))