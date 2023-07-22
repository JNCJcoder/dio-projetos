valorHamburguer = float(input())
quantidadeHamburguer = int(input())
valorBebida = float(input())
quantidadeBebida = int(input())
valorPago = float(input())

valorTotalHamburguer = valorHamburguer * quantidadeHamburguer
valorTotalBebida = valorBebida * quantidadeBebida
valorTotal = valorTotalHamburguer + valorTotalBebida
valorTroco = valorPago - valorTotal

print(f'O preço final do pedido é R$ {valorTotal:.2f}. Seu troco é R$ {valorTroco:.2f}.')