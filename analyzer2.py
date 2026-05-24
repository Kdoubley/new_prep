import pandas as pd

# Load the CSV
df = pd.read_csv("students.csv")

# Print the full table
print(df)
print()

# Filter patients with severity > 7
critical = df[df["severity"] > 7]
print("Critical patients:")
print(critical)
print()

# Average severity per symptom
print("Average severity:")
print(df.groupby("symptom")["severity"].mean())
print()

# Overall stats
print("Summary:")
print(df["severity"].describe())