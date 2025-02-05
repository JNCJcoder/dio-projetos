# Recebe a Entrada do usuário e armazena na variável "entrada"
entrada = input()

# Função responsável por receber um caso de uso e retornar sua respectiva descrição.
def descrever_caso_de_uso(caso):
    if caso == "análise de chamadas e assistência do atendente":
        return "transcrição de chamadas para melhorar a qualidade do atendimento"

    elif caso == "legendas para vídeos e reuniões":
        return "geração automática de legendas para vídeos e reuniões"

    elif caso == "detecção de toxicidade":
        return "identificação de linguagem ofensiva ou inapropriada em textos"
        
    elif caso == "documentação clínica":
        return "transcrição de consultas médicas para documentação precisa"

# Imprime a descrição do caso de uso recebido na "entrada" através da função "descrever_caso_de_uso".  
print(descrever_caso_de_uso(entrada))