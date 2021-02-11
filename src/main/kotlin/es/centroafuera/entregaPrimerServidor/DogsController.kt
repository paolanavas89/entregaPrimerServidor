package es.centroafuera.entregaPrimerServidor

import org.springframework.web.bind.annotation.*

@RestController
class DogsController(private val dogsRepository: DogsRepository){

    @GetMapping("/dogs")    //Esto hace la llamada a lo q se le pasa x parametro
    fun getAllDogs() : List<Dog>{
        return dogsRepository.findAll()
    }
    //manda los datos
    @PostMapping("/dog")
    fun insertDog(@RequestBody dog : Dog){
        dogsRepository.save(dog)
    }

    @GetMapping("/dog/{id}")
    fun getDog(@PathVariable id : Long) : Dog {
        return dogsRepository.findById(id).get()
    }
    //Borra el objeto
    @DeleteMapping("/dog/{id}")
    fun deleteDog(@PathVariable id : Long){
        dogsRepository.deleteById(id)
    }


}

