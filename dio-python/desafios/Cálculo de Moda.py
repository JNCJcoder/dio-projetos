# Entrada do usuário e conversão para lista de números
lista_numeros = list(map(int, input().split(",")))

def calcular_moda(lista):
    # Conta a frequência de cada número na lista
    contador = {}
    for num in lista:
        contador[num] = contador.get(num, 0) + 1
    
    # Encontra a frequência máxima
    max_frequencia = max(contador.values())
    
    moda = [num for num, freq in contador.items() if freq == max_frequencia]
    
    # Se houver mais de uma moda, retorna a lista de modas
    # Caso contrário, retorna a única moda
    return moda if len(moda) > 1 else moda[0]

# Calcula e imprime a moda
print(calcular_moda(lista_numeros))