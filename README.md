# 🗺️ Google Maps APP

Este proyecto muestra cómo integrar Google Maps en una app Android usando el patrón MVVM y Jetpack Compose. 
La app posiciona el mapa en una ubicación de prueba y muestra múltiples marcadores.

---

## 🚀 Características

- Muestra ubicación inicial en el mapa.
- Añade múltiples marcadores con coordenadas fijas.
- Arquitectura MVVM con Jetpack Compose.
- Uso de `maps-compose` para renderizar mapas.

---

## 🔧 Configuración

### 1. Obtener API Key

- Ve a [Google Cloud Console](https://console.cloud.google.com/).
- Crea un proyecto y habilita la API de Maps.
- Genera una API Key.
- Pega la API Key en `AndroidManifest.xml`:

```xml
<meta-data
    android:name="com.google.android.geo.API_KEY"
    android:value="TU_API_KEY_AQUÍ"/>
```
Si tienes problemas para crear tu Api Key, envíame un mensaje

### 2. Agregar dependencias

En tu archivo build.gradle (nivel módulo):

```
implementation("com.google.maps.android:maps-compose:2.11.0")
implementation("com.google.android.gms:play-services-maps:18.1.0")
implementation("androidx.compose.ui:ui:1.5.0")
```

## 📤 Subir a GitHub

Lo primero es crear tu repositorio en GitHub, Luego :

Opción A: Clonar desde cero
```
git clone https://github.com/tuusuario/Google-Maps.git
cd Google-Maps
git add .
git commit -m "Primer commit"
git push
```

Opción B: Subir proyecto existente ( si ya tienes desarrollos pero no has iniciado tu git )
```
git init
git add .
git commit -m "Subiendo proyecto con Google Maps"
git remote add origin https://github.com/tuusuario/Google-Maps.git
git push -u origin master
```

## 👤 Autor
Alvaro Maurelia 
al.maurelia@profesor.duoc.cl




