object PetAppTest  extends App {


  val wolf= new Wolf()
  println(s"${wolf.talk} ${wolf.huntwalk} ${wolf.stalkwalk}")

val frenchie = new Frenchie()
  println(s"${frenchie.talk} ${frenchie.walk}")

val boarder = new Boarder()
println(s"${boarder.huntwalk} ${boarder.talk}")

val persian = new Persian()
  println(s"${persian.walk} ${persian.talk}")

  val wildcat = new WildCat()
  println(s"${wildcat.stalkwalk} ${wildcat.huntwalk} ${wildcat.walk} ${wildcat.talk}")
}
