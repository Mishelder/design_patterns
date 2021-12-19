package by.miaskor.kotlin.creational.factory_method.factory

import by.miaskor.kotlin.creational.factory_method.domain.Boat

class BoatFactory : TransportFactory {
  override fun make() = Boat()
}
