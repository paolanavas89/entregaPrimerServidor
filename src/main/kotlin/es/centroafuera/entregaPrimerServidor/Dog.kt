package es.centroafuera.entregaPrimerServidor
import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Dog (var fileSizeBytes : Int, var url: String){
    @Id
    @GeneratedValue
    private val id: Long? = null

    override fun equals(other: Any?): Boolean {
        if (other is Dog){
            return other.id == id && id != null
        } else {
            return false
        }
    }

    override fun hashCode(): Int {
        return Objects.hash(id, fileSizeBytes, url)
    }

    override fun toString(): String {
        return "$id es una imagen con tamaño $fileSizeBytes y url $url"
    }

}