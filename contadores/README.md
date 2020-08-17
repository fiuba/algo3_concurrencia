## Contadores

En el ejemplo se crea un hilo para realizar una cuenta y mostrarlo en una ventana usando el paquete Swing que viene por defecto con Java.

- Contador1: Se ve el problema al querer hacer un contador sin hilos ya que Java por defecto solo tiene un solo hilo entonces no se puede actualizar la vista y se `cuelga` el programa.

- Contador2: Hay dos implementaciones de un hilo contador, la primera heredando directamente de `Thread` y la segunda implementado `Runnable`.
