# Ejercicio_Nro._7_Restaurante_San_Mart-n
Ejercicio Numero 7
El restaurante “San Martín” nos contrata para hacer un software que controle los costos
de sus platos. Los platos están compuestos por ingredientes los cuales pueden ser platos
o ingredientes básicos. Por ejemplo los panqueques con dulce de leche, está compuesto
por panqueques (que es un plato) y dulce de leche que es un ingrediente básico. El
software debe mantener el costo de cada uno de los platos, y el costo está dado por la
suma de los costos de los ingredientes (básicos o platos).

# Patron Estructural Elegido: Composite


# Cómo Implementarlo
Asegúrate de que el modelo central de tu aplicación pueda representarse como una estructura de árbol. Intenta dividirlo en elementos simples y contenedores. Recuerda que los contenedores deben ser capaces de contener tanto elementos simples como otros contenedores.

Declara la interfaz componente con una lista de métodos que tengan sentido para componentes simples y complejos.

Crea una clase hoja para representar elementos simples. Un programa puede tener varias clases hoja diferentes.

Crea una clase contenedora para representar elementos complejos. Incluye un campo matriz en esta clase para almacenar referencias a subelementos. La matriz debe poder almacenar hojas y contenedores, así que asegúrate de declararla con el tipo de la interfaz componente.

Al implementar los métodos de la interfaz componente, recuerda que un contenedor debe delegar la mayor parte del trabajo a los subelementos.

Por último, define los métodos para añadir y eliminar elementos hijos dentro del contenedor.

Ten en cuenta que estas operaciones se pueden declarar en la interfaz componente. Esto violaría el Principio de segregación de la interfaz porque los métodos de la clase hoja estarían vacíos. No obstante, el cliente podrá tratar a todos los elementos de la misma manera, incluso al componer el árbol.

