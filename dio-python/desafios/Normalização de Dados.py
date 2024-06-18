# Obtém os valores financeiros como uma lista de entrada do usuário,
# convertendo cada valor para float após remover espaços em branco e dividindo a entrada pelos caracteres de vírgula.
entrada = [float(valor.strip()) for valor in input().split(',')]

# Define a função de normalização Min-Max.
def min_max_normalization(data):
    # Encontra o menor e o maior valor na lista de dados.
    min_val = min(data)
    max_val = max(data)
    
    # Verifica se todos os valores são iguais.
    if max_val == min_val:
        # Se todos os valores são iguais, retorna uma lista de zeros.
        return [0.0] * len(data)
    
    normalized_data = [(val - min_val) / (max_val - min_val) for val in data]
    
    return normalized_data

# Imprime os valores normalizados.
print(min_max_normalization(entrada))