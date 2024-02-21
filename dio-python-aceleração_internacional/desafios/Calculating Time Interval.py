n = int(input())
usage_ranges = []

for _ in range(n):
    hours_range_str = input().split(',')
    hours_range = [int(hour) for hour in hours_range_str]
    usage_ranges.append(hours_range)

def find_shutdown_range(n, usage_ranges):
  
    min = 23
    max = 0
    
    for index in range(n):
      listValue = usage_ranges[index] 
      valueOne = int(listValue[0])
      valueTwo = int(listValue[1])
      
      if min > valueOne:
        min = valueOne
      
      if max < valueTwo:
        max = valueTwo

    unused_range = f'{max},{min}'

    return unused_range

shutdown_range = find_shutdown_range(n, usage_ranges)

print(shutdown_range)