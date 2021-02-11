package es.centroafuera.entregaPrimerServidor

import org.springframework.data.jpa.repository.JpaRepository

interface DogsRepository: JpaRepository<Dog, Long>