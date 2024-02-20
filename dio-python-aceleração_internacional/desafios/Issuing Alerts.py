metrics = [
    ('CPU', int(input())),
    ('RAM memory', int(input())),
    ('response time', int(input()))
]

def monitor_and_alert(metrics):
    alerts = []

    for metric in metrics:
      if metric[0] == 'CPU':
        if metric[1] >= 80:
          alerts.append("Alert: High CPU usage detected ({}%)".format(metric[1]))
          break
        
      if metric[0] == 'RAM memory':
        if metric[1] >= 70:
          alerts.append("Alert: High RAM memory usage detected ({}%)".format(metric[1]))
          break
        
      if metric[0] == 'response time':
        if metric[1] >= 250:
          alerts.append("Alert: Application response time above the limit ({}ms)".format(metric[1]))
          break
    
    if len(alerts) == 0:
      alerts.append("No anomalies detected")

    return '\n'.join(alerts)

print(monitor_and_alert(metrics))