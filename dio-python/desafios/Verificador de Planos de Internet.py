def recomendar_plano(consumo):
  if consumo > 20:
    return "Plano Premium Fibra - 300Mbps"
  elif consumo > 10 and consumo <= 20:
    return "Plano Prata Fibra - 100Mbps"
  elif consumo > 0 and consumo <= 10:
    return "Plano Essencial Fibra - 50Mbps"

# Solicita ao usuário que insira o consumo médio mensal de dados:
consumo = float(input())
# Chama a função recomendar_plano com o consumo inserido e imprime o plano recomendado:
print(recomendar_plano(consumo))