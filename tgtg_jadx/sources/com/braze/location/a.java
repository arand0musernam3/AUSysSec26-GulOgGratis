package com.braze.location;

import com.braze.storage.GeofenceDataStoreProvider;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GeofenceDataStoreProvider f9901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IBrazeGeofenceApi f9902b;

    public a(GeofenceDataStoreProvider geofenceDataStoreProvider) {
        geofenceDataStoreProvider.getClass();
        this.f9901a = geofenceDataStoreProvider;
        IBrazeGeofenceApi iBrazeGeofenceApi = null;
        try {
            Object objNewInstance = Class.forName("com.braze.location.BrazeInternalGeofenceApi").getDeclaredConstructor(null).newInstance(null);
            objNewInstance.getClass();
            iBrazeGeofenceApi = (IBrazeGeofenceApi) objNewInstance;
        } catch (Exception unused) {
        }
        this.f9902b = iBrazeGeofenceApi;
    }
}
