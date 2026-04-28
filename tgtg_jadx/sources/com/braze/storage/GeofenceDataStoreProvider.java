package com.braze.storage;

import android.content.Context;
import com.braze.enums.DataStoreKey;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/braze/storage/GeofenceDataStoreProvider;", "Lcom/braze/storage/DataStoreProvider;", "Landroid/content/Context;", "context", "", "apiKey", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "getDataStoreFileName", "()Ljava/lang/String;", "Ld8/f;", "Lh8/g;", "getDataStore", "()Ld8/f;", "Ljava/lang/String;", "getApiKey", "Companion", "com/braze/storage/b2", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GeofenceDataStoreProvider extends DataStoreProvider {
    public static final b2 Companion = new b2();
    public static final String GEOFENCES_DATA_STORE_STORAGE = "com.braze.geofences";
    public static final String GEOFENCE_GLOBAL_ELIGIBILITY_SHARED_PREFS_LOCATION = "com.appboy.managers.geofences.eligibility.global";
    public static final String GEOFENCE_INDIVIDUAL_ELIGIBILITY_SHARED_PREFS_LOCATION = "com.appboy.managers.geofences.eligibility.individual";
    public static final String GEOFENCE_STORAGE_SHARED_PREFS_LOCATION = "com.appboy.managers.geofences.storage";
    public static final String REGISTERED_GEOFENCE_SHARED_PREFS_LOCATION = "com.appboy.support.geofences";
    private final String apiKey;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeofenceDataStoreProvider(Context context, String str) {
        super(context);
        context.getClass();
        str.getClass();
        this.apiKey = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getDataStore$migrateGeofencesListToJson(b2 b2Var, f8.d dVar, h8.g gVar, x70.c cVar) {
        b2Var.getClass();
        dVar.getClass();
        gVar.getClass();
        return b2Var.a(dVar, gVar, DataStoreKey.GEOFENCES.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object getDataStore$migrateIndividualReeligibilityMapToJson(b2 b2Var, f8.d dVar, h8.g gVar, x70.c cVar) {
        return b2Var.a(dVar, gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getDataStore$migrateRegisteredGeofencesListToJson(b2 b2Var, f8.d dVar, h8.g gVar, x70.c cVar) {
        b2Var.getClass();
        dVar.getClass();
        gVar.getClass();
        return b2Var.a(dVar, gVar, DataStoreKey.REGISTERED_GEOFENCES.getKey());
    }

    public final String getApiKey() {
        return this.apiKey;
    }

    @Override // com.braze.storage.DataStoreProvider
    public d8.f getDataStore() {
        f8.b bVarA = g8.k.a(getContext(), e0.f.k("com.appboy.managers.geofences.eligibility.global.", this.apiKey), kotlin.collections.y.W(new String[]{DataStoreKey.GLOBAL_LAST_REPORT.getKey(), DataStoreKey.GLOBAL_LAST_REQUEST.getKey()}));
        Context context = getContext();
        String strK = e0.f.k("com.appboy.managers.geofences.eligibility.individual.", this.apiKey);
        b2 b2Var = Companion;
        return createOrGetDataStore(kotlin.collections.d0.h(bVarA, new f8.b(context, strK, (aa.l0) null, new c2(b2Var), 12), new f8.b(getContext(), e0.f.k("com.appboy.managers.geofences.storage.", this.apiKey), (aa.l0) null, new d2(b2Var), 12), new f8.b(getContext(), REGISTERED_GEOFENCE_SHARED_PREFS_LOCATION, (aa.l0) null, new e2(b2Var), 12)));
    }

    @Override // com.braze.storage.DataStoreProvider
    public String getDataStoreFileName() {
        return e0.f.k("com.braze.geofences.", this.apiKey);
    }
}
