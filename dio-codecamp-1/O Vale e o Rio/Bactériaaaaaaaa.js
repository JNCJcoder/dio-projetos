let plastico = parseInt(gets());
let diasNecessarios = 0;

while(plastico > 1)
{
  diasNecessarios++;
  plastico /= 2;
}

print(`Serão necessários ${diasNecessarios} dias`);