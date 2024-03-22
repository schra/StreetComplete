package de.westnordost.streetcomplete.data.map

import de.westnordost.streetcomplete.Prefs
import de.westnordost.streetcomplete.data.osm.mapdata.LatLon
import de.westnordost.streetcomplete.util.prefs.Preferences

/** Stores position of map camera */
class MapCameraPositionStore(private val prefs: Preferences) {
    var position: LatLon
        set(value) {
            prefs.putDouble(Prefs.MAP_LATITUDE, value.latitude)
            prefs.putDouble(Prefs.MAP_LONGITUDE, value.longitude)
        }
        get() = LatLon(
            prefs.getDouble(Prefs.MAP_LATITUDE, 0.0),
            prefs.getDouble(Prefs.MAP_LONGITUDE, 0.0)
        )

    var rotation: Double
        set(value) { prefs.putDouble(Prefs.MAP_ROTATION, value) }
        get() = prefs.getDouble(Prefs.MAP_ROTATION, 0.0)

    var tilt: Double
        set(value) { prefs.putDouble(Prefs.MAP_TILT, value) }
        get() = prefs.getDouble(Prefs.MAP_TILT, 0.0)

    var zoom: Double
        set(value) { prefs.putDouble(Prefs.MAP_ZOOM, value) }
        get() = prefs.getDouble(Prefs.MAP_ZOOM, 1.0)
}
