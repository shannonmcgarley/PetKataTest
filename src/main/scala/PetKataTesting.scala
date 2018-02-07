class PetKataTesting extends App {

}

abstract class Animal{

}

trait Walking{
  def walk : String
}

trait WiggleWalk extends Walking{
  override def walk = "Wiggle"
}

trait HuntWalk{
  def huntwalk : String  = "Hunt"
}

trait StalkWalk{
  def stalkwalk : String = "Stalk"
}

trait Talking{
  def talk : String
}
trait Howling extends Talking{
  override def talk = "Howl"
}
trait Yapping extends Talking {
  override def talk = "Yap"
}
trait Barking extends Talking{
  override def talk = "Woof"
}
trait Meowing extends Talking{
  override def talk = "Meow"
}

abstract class Cat() extends Animal{

}

abstract class Dog() extends Animal{

}

class Wolf() extends Dog with HuntWalk with StalkWalk with Howling {

}

class Frenchie() extends Dog with WiggleWalk with Yapping {

}
class Boarder() extends Dog with HuntWalk with Barking{

}
class Persian() extends Cat with WiggleWalk with Meowing{

}
class WildCat() extends Cat with WiggleWalk with StalkWalk with HuntWalk with Meowing



