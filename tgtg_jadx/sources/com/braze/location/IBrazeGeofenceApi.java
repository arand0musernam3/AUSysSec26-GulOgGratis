package com.braze.location;

import android.app.PendingIntent;
import android.content.Context;
import com.braze.models.BrazeGeofence;
import com.braze.storage.GeofenceDataStoreProvider;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0003H&J.\u0010\n\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, d2 = {"Lcom/braze/location/IBrazeGeofenceApi;", "", "getGeofenceTransitionPendingIntent", "Landroid/app/PendingIntent;", "context", "Landroid/content/Context;", "teardownGeofences", "", "applicationContext", "intent", "registerGeofences", "geofenceList", "", "Lcom/braze/models/BrazeGeofence;", "geofenceRequestIntent", "dataStoreProvider", "Lcom/braze/storage/GeofenceDataStoreProvider;", "deleteRegisteredGeofenceCache", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IBrazeGeofenceApi {
    void deleteRegisteredGeofenceCache(GeofenceDataStoreProvider dataStoreProvider);

    PendingIntent getGeofenceTransitionPendingIntent(Context context);

    void registerGeofences(Context context, List<BrazeGeofence> geofenceList, PendingIntent geofenceRequestIntent, GeofenceDataStoreProvider dataStoreProvider);

    void teardownGeofences(Context applicationContext, PendingIntent intent);
}
