# Função para detectar tentativas de invasão em registros de log
def detectar_invasao(registros):
    # Variáveis para rastrear o ID do usuário atual e suas falhas consecutivas
    usuario_atual = None
    tentativas_consecutivas = 0
    invasor_detectado = None

    for registro in registros:
        usuario, status = registro.split(":")

        if usuario == usuario_atual:
            # Se o status é "falha", incremente o contador de tentativas falhas
            if status == "falha":
                tentativas_consecutivas += 1
            else:
                tentativas_consecutivas = 0
                
        else:
            if usuario_atual and tentativas_consecutivas >= 3:
                invasor_detectado = usuario_atual
                break

            usuario_atual = usuario

            # Se a nova tentativa for "falha", inicie a contagem em 1; caso contrário, inicie em 0
            tentativas_consecutivas = 1 if status == "falha" else 0  # Reseta contagem

    if tentativas_consecutivas >= 3:
        invasor_detectado = usuario_atual 

    # Retorna o resultado final
    return invasor_detectado if invasor_detectado else "Nenhum invasor detectado"

# Função principal para executar o programa
def main():
    # Solicita ao usuário que insira os registros de log
    entrada = input()
    
    registros = [registro.strip().strip('"') for registro in entrada.split(",")]

    resultado = detectar_invasao(registros)

    # Imprime o resultado
    print(resultado)

# Chama a função principal para executar o programa
if __name__ == "__main__":
    main()