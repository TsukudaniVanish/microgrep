@main def grep(keyword: String, dst: String): Unit = 
  for s <- dst <<: keyword
  do println(s)

extension (s:String) 
  def <<:(key:String):Iterator[String] = 
      for line <- s.linesIterator
        if line.contains(key)
      yield 
        line


