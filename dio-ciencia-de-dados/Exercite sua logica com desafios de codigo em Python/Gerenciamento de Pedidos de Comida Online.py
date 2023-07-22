def main():
    n = int(input())
 
    total = 0
 
    for i in range(1, n + 1):
        pedido = input().split(" ")
        valor = float(pedido[1])
        total += valor
    
    desconto = input()
    
    if desconto == '20%':
      total *= 0.80
    elif desconto == '10%':
      total *= 0.90
    
    print(f'Valor total: {total:.2f}')
 
 
if __name__ == "__main__":
    main()