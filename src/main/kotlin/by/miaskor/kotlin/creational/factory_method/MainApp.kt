package by.miaskor.kotlin.creational.factory_method

import by.miaskor.kotlin.creational.factory_method.factory.BoatFactory
import by.miaskor.kotlin.creational.factory_method.factory.TransportFactory
import by.miaskor.kotlin.creational.factory_method.factory.TruckFactory

fun main() {
  val boatFactory: TransportFactory = BoatFactory()
  val truckFactory: TransportFactory = TruckFactory()

  println(boatFactory.make())
  println(truckFactory.make())
}
