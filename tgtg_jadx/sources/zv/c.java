package zv;

import com.braze.enums.GeofenceTransitionType;
import com.braze.managers.BrazeGeofenceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f48112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ GeofenceTransitionType f48113c;

    public /* synthetic */ c(String str, GeofenceTransitionType geofenceTransitionType, int i11) {
        this.f48111a = i11;
        this.f48112b = str;
        this.f48113c = geofenceTransitionType;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f48111a) {
            case 0:
                return BrazeGeofenceManager.postGeofenceReport$lambda$23(this.f48112b, this.f48113c);
            default:
                return com.braze.managers.n.b(this.f48112b, this.f48113c);
        }
    }
}
