# Recebe uma entrada do usuário e a divide em uma lista de strings utilizando ', ' como delimitador
strings = input().split(', ')
# Recebe uma entrada do usuário como a palavra-chave para filtragem
palavra_chave = input()

# Define a função para filtrar strings por uma palavra-chave específica
def filtrar_por_palavra_chave(strings, palavra_chave):
    strings_filtradas = []

    for string in strings:
        if palavra_chave in string:
            strings_filtradas.append(string)
    
    return strings_filtradas

# Chama a função filtrar_por_palavra_chave com as strings e a palavra-chave fornecidas pelo usuário
print(filtrar_por_palavra_chave(strings, palavra_chave))