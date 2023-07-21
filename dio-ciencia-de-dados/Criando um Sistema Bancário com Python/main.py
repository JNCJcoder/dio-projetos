def menu():
    menu = """

    [1] Depósito
    [2] Saque
    [3] Extrato
    [4] Nova Conta
    [5] Listar Contas
    [6] Novo Usuário
    [7] Finalizar Operação
    -> """
    return input(menu)

def depositar(saldo, valor, extrato, /):
    if valor > 0:
        saldo += valor
        extrato += f'Depósito: R$ {valor:.2f}\n'
        print('Depósito realizado com sucesso!')
    else:
        print('Operação falhou! Valor para depósito negativo.')

    return saldo, extrato

def sacar(*, saldo, valor, extrato, limite, numeroDeSaques, limiteDeSaques):
    if valor > saldo:
        print('Saldo insuficiente.')
    elif valor > limite:
        print('Valor do saque excede o limite.')
    elif numeroDeSaques >= limiteDeSaques:
        print('Número máximo de saques excedido.')
    elif valor > 0:
        saldo -= valor
        extrato += f'Saque: R$ {valor:.2f}\n'
        numero_saque += 1
        print('Saque realizado com sucesso!')
    else:
        print('Falha na Operação! Tente novamente.')  

    return saldo, extrato

def exibirExtrato(saldo, /, *, extrato):
    print('\n==================== Extrato ====================')
    if extrato:
        print(extrato)
    else:
        print('      Não foram realizadas movimentações.')
    print(f'\n                 Saldo: R$ {saldo:.2f}') 
    print('=' * 49)

def criarUsuario(usuarios):
    cpf = input('Informe o CPF: ')
    usuario = filtrarUsuarios(cpf, usuarios)

    if usuario: 
        print('CPF já cadastrado.')
        return
    
    nome = input('Informe o nome completo: ')
    dataDeNascimento = input('Informe a data de nascimento (dd-mm-aaaa): ')
    endereco = input('Informe o endereço: ')

    usuarios.append({'nome': nome, 'dataDeNascimento': dataDeNascimento, 'cpf': cpf, 'endereco': endereco})

    print('Usuário cadastrado com sucesso!')

def filtrarUsuarios(cpf, usuarios):
    usuariosFiltrados = [usuario for usuario in usuarios if usuario['cpf'] == cpf]
    return usuariosFiltrados[0] if usuariosFiltrados else None

def criarConta(agencia, numeroDaConta, usuarios):
    cpf = input('Informe o CPF: ')
    usuario = filtrarUsuarios(cpf, usuarios)

    if usuario:
        print('Conta criada com sucesso!')
        return {'agencia': agencia, 'numeroDaConta': numeroDaConta, 'usuario': usuario}
    
    print('Usuário não encontrado. Criação de conta encerrada!')

def listarContas(contas):
    for conta in contas:
        linha = f"""
            Agência: {conta['agencia']}
            C/C: {conta['numeroDaConta']}
            Titular: {conta['usuario']['nome']}
         """
        
        print('=' * 100)
        print(linha)

def main():
    AGENCIA = '0001'
    LIMITE_DE_SAQUE = 3

    saldo = 0
    limite = 500
    extrato = ''
    numeroDeSaques = 0

    usuarios = []
    contas = []

    while True:

        opcao = menu()

        if opcao == '1':
            valor = float(input('Informe o valor do depósito: '))

            saldo, extrato = depositar(saldo, valor, extrato)
        elif opcao == '2':
            valor = float(input('Informe o valor do saque: '))
            saldo, extrato = sacar(
                saldo = saldo,
                valor = valor,
                extrato = extrato,
                limite = limite,
                numeroDeSaques = numeroDeSaques,
                limiteDeSaques = LIMITE_DE_SAQUE,
            )
        elif opcao == '3':
            exibirExtrato(saldo, extrato = extrato)
        elif opcao == '4':
            criarUsuario(usuarios)
        elif opcao == '5':
            numeroDaConta = len(contas) + 1
            conta = criarConta(AGENCIA, numeroDaConta, usuarios) 

            if conta:
                contas.append(conta)
        elif opcao == '6':
            listarContas(contas)
        elif opcao == '7':
            break
        else: 
            print('Operação inválida, Por favor selecione novamente a operação desejada.')

main()