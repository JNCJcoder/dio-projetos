fun main() {
  val urls = mutableListOf<String>()

  while (true) {
    val input = readLine() ?: break
    if (input.isBlank()) break
    urls.add(input)
  }

  println("Iniciando downloads...")

  // Cria uma lista de Pair (indice, tamanho)
  val results = mutableListOf<Pair<Int, Int>>()

  val threads = urls.mapIndexed { index, url ->
    Thread {
      val length = openLink(url)
      synchronized(results) {
        results.add(Pair(index, length))
      }
    }
  }

  for(fio in threads)
  {
    fio.start()
  }

  // Sort results by index to print in the correct order
  results.sortedBy { it.first }.forEachIndexed { idx, result ->
    println("Arq${idx + 1}: ${result.second}")
  }

  println("Tempo total: ${urls.size}")
}

fun openLink(url: String): Int {
    return url.length
}