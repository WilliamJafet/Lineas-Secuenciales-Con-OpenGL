# Lineas Secuenciales Con-OpenGL

La práctica consiste en realizar lo siguiente:
Realiza la siguiente gráfica haciendo USO SOLO DE LÍNEAS, NO POLIGONOS, NO FIGURAS, en pantalla completa. El tamaño debe ser proporcional. Los colores son opcionales.

![image](https://user-images.githubusercontent.com/72232712/145736251-3bfdaf96-61ff-4894-a54c-4e054d1dee66.png)

Para ello primero se explica el código fuente del programa realizado.
En principio se realiza la importación de librerías necesarias para realizar la práctica.

![image](https://user-images.githubusercontent.com/72232712/145736258-6024b297-4430-402a-ba7c-7cd41ff96379.png)

El siguiente bloque de código es la declaración de variables necesarias para realizar distintas acciones.

![image](https://user-images.githubusercontent.com/72232712/145736262-75056c90-9bf6-43fb-b1a0-b6be9c573067.png)

La función principal es importante debido a que es en esta parte donde empieza a ejecutarse el programa. En este bloque se realizan diversas configuraciones de la ventana para que se muestre al usuario.

![image](https://user-images.githubusercontent.com/72232712/145736267-714977d6-5d3e-4073-a4a3-8dbd4b5cf093.png)

La función init es parte de la librería OpenGL y se utiliza para inicializar los componentes del Canvas, este es un componente en el que se va a realizar el pintado del objeto.

![image](https://user-images.githubusercontent.com/72232712/145736278-0fa24d28-d04a-4d81-90c0-0d737b8c90bf.png)

En la función reshape no se realiza ninguna acción por ahora.

![image](https://user-images.githubusercontent.com/72232712/145736281-4b1e34a1-d8ad-400d-97b8-c82180b5fdab.png)

La función display es una de las funciones más importantes porque es aquí donde se programan las instrucciones para que el programa pinte lo que le estamos indicando.
En este caso primero asignamos un tamaño en pixeles y un color a las líneas.
En el ciclo for se inicia el pintado de las líneas. Con este ciclo for se hace posible el pintado de las líneas como se pide en el ejercicio.

![image](https://user-images.githubusercontent.com/72232712/145736289-f22d74a9-208f-457c-a0f7-8d0474761940.png)

La última función por el momento no se realiza ninguna acción.

![image](https://user-images.githubusercontent.com/72232712/145736295-f981c61e-db61-44a0-a1ab-8f9e0ddb9b81.png)

Ahora que se ha explicado el código fuente, la siguiente parte es mostrar el resultado.
Como resultado hemos obtenido lo que se muestra en la siguiente figura.

![image](https://user-images.githubusercontent.com/72232712/145736305-ae8c8e76-39ac-4900-8efc-a071d675231a.png)
