# android-notas-kotlin

![stack: Kotlin](https://img.shields.io/badge/stack--Kotlin-0d9488?style=flat-square) ![stack: Jetpack Compose](https://img.shields.io/badge/stack--Jetpack%20Compose-0d9488?style=flat-square) ![stack: Android](https://img.shields.io/badge/stack--Android-0d9488?style=flat-square)
![IA: asistido](https://img.shields.io/badge/IA--asistido-6366f1?style=flat-square)

App Android con Jetpack Compose y Kotlin: lista de notas con estado y formulario.

> **Transparencia sobre IA:** este proyecto se desarrollo con asistencia de inteligencia artificial (generacion de codigo, revision y documentacion). El codigo fue leido, ejecutado y probado manualmente antes de publicarse. No declara clientes, metricas ni resultados que no puedan verificarse.

## Problema que resuelve

Crear una pantalla de notas en Android con el enfoque declarativo actual, sin XML ni findViewById.

## Solucion implementada

Jetpack Compose con estado observable (mutableStateOf/mutableStateListOf) y formulario validado.

### Funcionalidades principales

- UI declarativa con Compose
- Estado con snapshot state
- LazyColumn para listas
- Modulo Gradle con dependencias Compose

## Stack

- Kotlin
- Jetpack Compose
- Android

## Estructura

```
app/src/main/java/com/example/notas/MainActivity.kt  # UI Compose
app/build.gradle.kts                                  # modulo y dependencias
```

## Puesta en marcha

```bash
# Abrir la carpeta en Android Studio y ejecutar el modulo app
```

## Complejidad del proyecto

**Nivel: Intermedio** — Framework nativo con modelo declarativo y build de Gradle.

El nivel describe la complejidad tecnica del proyecto, no el grado de dominio de quien lo escribio.

## Despliegue

App Android; se distribuye por APK/Play Store, no como pagina web.  
El codigo fuente si esta disponible en este repositorio.

## Autor

**Luis Felipe Zuniga Leon** — Desarrollador de software asistido por IA

- GitHub: <https://github.com/Luisf2020>

---

_Proyecto de portafolio. El desarrollo se apoyo en herramientas de IA bajo revision tecnica humana._
