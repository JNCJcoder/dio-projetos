class UsuarioTelefone:
    def __init__(self, nome, numero, plano):
        self.nome = nome
        self.numero = numero
        self.plano = plano
    
    def fazer_chamada(self, destinatario, duracao):
        novo_saldo = self.plano.deduzir_saldo(duracao)

        if novo_saldo == 0.00:
            return "Saldo insuficiente para fazer a chamada."

        return f'Chamada para {destinatario} realizada com sucesso. Saldo: ${novo_saldo:.2f}'

# Classe Pano, ela representa o plano de um usuário de telefone:
class Plano:
    def __init__(self, saldo_inicial):
        self.saldo = saldo_inicial
    
    def verificar_saldo(self):
        return self.saldo
    
    def custo_chamada(self, duracao):
        custo_por_minuto = 0.10
        return duracao * custo_por_minuto
    
    def deduzir_saldo(self, duracao):
        custo = self.custo_chamada(duracao)
        if self.saldo < custo:
            return 0.00
        else:
            self.saldo = self.saldo - custo
            return self.saldo

# Classe UsuarioPrePago, aqui vemos a herança onde UsuarioPrePago herda os atributos e métodos da classe UsuarioTelefone:
class UsuarioPrePago(UsuarioTelefone):
    def __init__(self, nome, numero, saldo_inicial):
        super().__init__(nome, numero, Plano(saldo_inicial))


# Recebendo as informações do usuário:
nome = input()
numero = input()
saldo_inicial = float(input())

# Objeto de UsuarioPrePago com os dados fornecidos:
usuario_pre_pago = UsuarioPrePago(nome, numero, saldo_inicial)
destinatario = input()
duracao = int(input())

# Chama o método fazer_chamada do objeto usuario_pre_pago e imprime o resultado:
print(usuario_pre_pago.fazer_chamada(destinatario, duracao))