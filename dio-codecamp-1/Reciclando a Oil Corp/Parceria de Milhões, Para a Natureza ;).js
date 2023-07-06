const moleculas = gets().split(', ');
let qualFiltro = 0;

moleculas.forEach(molecula => {
  if(molecula.length > qualFiltro)
  {
    qualFiltro = molecula.length;
  }
});

if(qualFiltro <= 5)
{
  print(`O filtro deve ser: Filtro Normal`);
}
else if(qualFiltro > 5 && qualFiltro <= 10)
{
  print(`O filtro deve ser: Filtro Específico`);
}
else
{
  print(`O filtro deve ser: Filtro Duplo Específico`);
}