n = int(input())
lines = []

for _ in range(0, n):
    lines.append(input())
# Parses each line of input, splitting it by commas, converting the resulting strings to integers, and storing the values in a nested list machines, where each sublist represents the microservices capacities of a machine.
machines = [[int(num) for num in line.split(',')] for line in lines]

# TODO: Define a function that recursively calculates the maximum total capacity by cycling through the machines.
def calculate_capacity(machines, i, n, current_capacity, total_max):
    return

# TODO: Define a function that calculates the minimum memory capacity required
def calculate_minimum_capacity(n, machines):
    return

# Calculate and print the minimum memory capacity needed
print(calculate_minimum_capacity(n, machines))