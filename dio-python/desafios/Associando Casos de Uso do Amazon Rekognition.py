# Recebe a Entrada do usuário e armazena na variável "entrada"
entrada = input()

# Função responsável por receber um caso de uso e retornar sua respectiva descrição.
def descrever_caso_de_uso(caso):
    if caso == "detectar conteúdo impróprio":
        return "identificar conteúdo inadequado em imagens e vídeos"
  
    elif caso == "verificar a identidade online":
        return "verificar a identidade de usuários remotamente"
  
    elif caso == "simplificar a análise de mídia":
        return "detectar segmentos de vídeo importantes automaticamente"
  
    elif caso == "enviar alertas inteligentes a residências conectadas":
        return "enviar alertas quando um objeto é detectado em vídeo ao vivo"

# Imprime a descrição do caso de uso recebido na "entrada" através da função "descrever_caso_de_uso". 
print(descrever_caso_de_uso(entrada))