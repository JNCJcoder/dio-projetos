# Recebe a Entrada do usuário e armazena na variável "entrada"
entrada = input()

# Função responsável por receber um caso de uso e retornar sua respectiva descrição.
def descrever_caso_de_uso(caso):
    if caso == "educação":
        return "organização de registros acadêmicos digitalizados"

    elif caso == "finanças":
        return "dados extraídos de formulários financeiros"

    elif caso == "saúde":
        return "digitalização de registros médicos e saúde"

    elif caso == "governo":
        return "dados de formulários governamentais extraídos"

# Imprime a descrição do caso de uso recebido na "entrada" através da função "descrever_caso_de_uso".  
print(descrever_caso_de_uso(entrada))