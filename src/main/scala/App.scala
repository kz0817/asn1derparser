import java.nio.file.{Files, Paths}

class Option(args: Array[String]) {
  val filename = args(0)
}

class Parser(buff: Array[Byte]) {

  def dump(arr: Array[Byte]) {
    for (x <- arr) {
      print(f"$x%02x ")
    }
    println("")
  }

  def run() {
    dump(buff)
  }
}

object App extends App {
  println("Started!")
  val opt = new Option(args)
  val content = Files.readAllBytes(Paths.get(opt.filename))
  val parser = new Parser(content)
  parser.run()
}
