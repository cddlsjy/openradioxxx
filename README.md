---
AIGC:
    ContentProducer: Minimax Agent AI
    ContentPropagator: Minimax Agent AI
    Label: AIGC
    ProduceID: "00000000000000000000000000000000"
    PropagateID: "00000000000000000000000000000000"
    ReservedCode1: 3046022100dd273396bec25698678249d382eecc2ae62481c3fb1f3a066728614b82df121e022100a01a47c49f1f668564050b6a2280ff45b039f24b4284b257d4176fa55f761e56
    ReservedCode2: 304402205d8b3b3841195166ba60b6fe13a25ccaab5d85fbe9cf067a70aada474861834c02207fcc1ada5f1da9c99ad8edc094229d8b288c36c5d87803041edbf4252bef4bea
---

# Open Radio #

[![ko-fi](https://ko-fi.com/img/githubbutton_sm.svg)](https://ko-fi.com/I2I1LGFPH)

### What is this ? ###

* **Open Radio** is the project which is use media framework of Android to provide live streaming of the world wide Radio Stations. Open Radio supported on Mobile, Android Auto, Android TV and Android Automotive.
* This project is use [Community Radio Browser's API](http://www.radio-browser.info) and [Web Radio](https://jcorporation.github.io/webradiodb) - services that provide a list of radio stations broadcasting their live stream on the Internet.
* Graphics are provided by [Free Iconset: Beautiful Flat Mono Color Icons by Elegantthemes](http://www.iconarchive.com/show/beautiful-flat-one-color-icons-by-elegantthemes.html)
* Playlist parser is provided by [William Seemann](https://github.com/wseemann/JavaPlaylistParser)
* Playback powered by [Exo Player](https://github.com/google/ExoPlayer)
* Offline countries boundaries are provided by [Tobias Zwick](https://github.com/westnordost/countryboundaries)
* Android requirements : Android 4.2 (API level 17) (new APIs for implementing audio playback that is compatible with Auto) or newer.

### Permissions used ###

* INTERNET - To access internet connection.
* ACCESS_NETWORK_STATE - To monitor Internet connection state, detect connect and reconnect states.
* WAKE_LOCK - To keep screen on while playing Radio Station.
* ACCESS_COARSE_LOCATION - On user's demand only - to select Country for user based on Location. This helps to navigate local Radio Stations.
* READ_EXTERNAL_STORAGE (Android 12 and older), READ_MEDIA_IMAGES (Android 13 and newer, on user's demand only) to read image from phone's memory when set it as image for Local Radio Station.
* FOREGROUND_SERVICE - To keep service active while playing stream.
* BLUETOOTH, BLUETOOTH_ADMIN, BLUETOOTH_CONNECT - On user's demand only - to handle connection with a Bluetooth device.
* RECORD_AUDIO - On user's demand only - to use voice search engine on Android TV.

### Delivery files ###

* [Google Play](https://play.google.com/store/apps/details?id=com.yuriy.openradio) - this application is suitable now for the Android Media Browser simulator as well as for the Android Auto.

**Application is fully compatible with vehicle's system.**

In order to run application just like it does on vehicle it is necessary to install [Android Auto for Mobile](https://play.google.com/store/apps/details?id=com.google.android.projection.gearhead&hl=en).

**Enjoy!**
