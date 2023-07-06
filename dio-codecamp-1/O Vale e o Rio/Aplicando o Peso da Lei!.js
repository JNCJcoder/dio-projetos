const atividades = gets().split(', ')

const listaDeAtividades = {
    Reflorestamento: gets(),
    EsgotoTratado: gets(),
    EmissaoDeCarbono: gets(),
    EnergiaSustentavel: gets(),
}

const status = {
  "Feito": "Não multar",
  "Em progresso": "Avaliação de progresso",
  "Não feito": "Multa"
}

atividades.forEach(atividade => print(status[listaDeAtividades[atividade]]));