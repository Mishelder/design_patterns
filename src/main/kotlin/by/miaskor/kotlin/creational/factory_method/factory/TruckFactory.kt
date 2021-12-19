package by.miaskor.kotlin.creational.factory_method.factory

import by.miaskor.kotlin.creational.factory_method.domain.Truck

class TruckFactory : TransportFactory {
  override fun make() = Truck()
}
