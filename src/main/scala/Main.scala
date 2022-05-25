@main def grep(keyword: String, dst: String): Unit = 
  (dst <<: keyword) foreach println

extension (s:String) 
  def <<:(key:String):Iterator[String] = 
    for line <- s.linesIterator
        if line.contains(key)
      yield 
        line

      

