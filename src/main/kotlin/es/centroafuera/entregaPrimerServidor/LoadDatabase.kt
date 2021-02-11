package es.centroafuera.entregaPrimerServidor


import org.slf4j.LoggerFactory
import org.springframework.context.annotation.Configuration
import org.springframework.boot.CommandLineRunner
import org.springframework.context.annotation.Bean


@Configuration
class LoadDatabase {
    companion object{
        val logger= LoggerFactory.getLogger(LoadDatabase.javaClass)
    }

    @Bean

    fun initDatabase(dogsRepository : DogsRepository) : CommandLineRunner {
        return CommandLineRunner { args: Array<String?> ->
            logger.info("PreLoading" + dogsRepository.save(Dog(73429, "https://random.dog/5d6792a5-a458-4077-b9ee-de7f15706cca.jpg")))
            logger.info("PreLoading" + dogsRepository.save(Dog(619734, "https://random.dog/e83bd9a7-e2c8-409f-be27-5faf3983c2cc.gif")))
            logger.info("PreLoading" + dogsRepository.save(Dog(187697, "https://random.dog/54876759-47df-4e09-b7d0-80476e658d89.jpg")))
            logger.info("PreLoading" + dogsRepository.save(Dog(134224, "https://random.dog/0f0ed568-0024-4107-a8c1-11368fe0f364.jpg")))
            logger.info("PreLoading" + dogsRepository.save(Dog(206651, "https://random.dog/e6e4f32c-bc93-461c-b785-e8a20c1c0be3.jpg")))
            logger.info("PreLoading" + dogsRepository.save(Dog(1053874, "https://random.dog/a57bd25b-403f-4140-ba54-b73fe3063767.mp4")))
            logger.info("PreLoading" + dogsRepository.save(Dog(1423490, "https://random.dog/33e049d2-1310-4612-87e0-7adbd43a182a.mp4")))
            logger.info("PreLoading" + dogsRepository.save(Dog(102978, "https://random.dog/c8b29dd6-951a-4444-9edd-e174adb1c7ab.jpg")))
            logger.info("PreLoading" + dogsRepository.save(Dog(2908140, "https://random.dog/bd7c2022-ac09-466b-a4e3-02a15504f51e.gif")))
            logger.info("PreLoading" + dogsRepository.save(Dog(2835270, "https://random.dog/7ff35bb5-5241-4e8b-8299-fdabd219d033.jpg")))
        }
    }
}