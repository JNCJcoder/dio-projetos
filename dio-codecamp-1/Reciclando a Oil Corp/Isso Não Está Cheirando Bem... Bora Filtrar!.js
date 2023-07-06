const lista = [
  ...gets().split(', '),
  ...gets().split(', '),
  ...gets().split(', ')
];

const usarFiltroSimples = lista.every(molecula => {
  switch(molecula)
  {
    case "NO2":
    case "SO2":
    case "FHO":
    case "CO":
      print(`Filtro Específico para a Molécula ${molecula}`);
      return false;
    default: break;
  }
  return true;
});

if(usarFiltroSimples)
{
  print("Filtro Simples");
}