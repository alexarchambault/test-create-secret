for (arg <- args) {
  print(s"$arg=")
  val value = Option(System.getenv(arg)).getOrElse("")
  for (c <- value)
    print(s"$c ")
  println()
}
