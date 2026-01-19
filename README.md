# Tarea 2 | Desarrollo de Software II

## Objetivo

Practicar el uso de hileras de caracteres en Java mediante operaciones básicas
como longitud, acceso a caracteres, comparación, concatenación y búsqueda de
texto.

## Parte I: Diferencia entre un caracter y una hilera.

### Un caracter (char)

Char, en Java, es un tipo de dato primitivo que almacena un único caracter. Se utiliza las comillas simples para representarlo: '1', 'E', '@'. Permite un mejor rendimiento cuando se requiere almacenar un único dígito.

### Una hilera (String)

Una hilera en Java, también conocido como String, es una clase que representa una secuencia o hilera de cero o más caracteres. Estas secuencias se definen con comillas dobles: "React", "Diez", "".
Además, String se implementa por medio de un array final de tipo char (private final char value[]).

#### Posibles operaciones

  - **length():** devuelve la cantidad de caracteres.
  - **charAt():** permite obtener acceso al caracter en la posición dada.
  - **indexOf() & lastIndexOf():** devuelve, respectivamente, la posición de la primera o última coincidencia con el caracter o hilera dada.
  - **startsWith() & endsWith():** comprueban si una hilera comienza o termina con otra hilera.
  - **equals() & equalsIgnoreCase():** compara el contenido exacto con otra hilera, ignorando o no las mayúsculas.
  - **compareTo():** compara el contenido de una hilera con otra empleando Unicode.
  - **toLowerCase() & toUpperCase():** convierte una hilera a minúsculas o mayúsculas.
  - **trim():** elimina espacios al principio y final de la hilera.

## Parte II: Resolver

<img width="700" height="700" alt="image" src="https://github.com/user-attachments/assets/0aa98d76-0394-4641-a12c-c179087fb7fc" />
