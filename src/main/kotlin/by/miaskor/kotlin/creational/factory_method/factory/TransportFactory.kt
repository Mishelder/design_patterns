package by.miaskor.kotlin.creational.factory_method.factory

import by.miaskor.kotlin.creational.factory_method.domain.Transport

interface TransportFactory {

  fun make(): Transport
}
