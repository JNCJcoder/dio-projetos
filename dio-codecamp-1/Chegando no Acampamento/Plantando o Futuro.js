const id = parseInt(gets());
const distancia = Math.abs(id - 10);

if(id > 10)
{
  print(`O buraco deve retroceder ${distancia} metros`);
}
else if(id < 10)
{
  print(`O buraco deve avançar ${distancia} metros`);
}
else
{
  print("Plantar!");
}