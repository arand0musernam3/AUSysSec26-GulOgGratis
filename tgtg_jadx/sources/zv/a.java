package zv;

import com.braze.managers.BrazeGeofenceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BrazeGeofenceManager f48109b;

    public /* synthetic */ a(BrazeGeofenceManager brazeGeofenceManager, int i11) {
        this.f48108a = i11;
        this.f48109b = brazeGeofenceManager;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f48108a) {
            case 0:
                return BrazeGeofenceManager.configureFromServerConfig$lambda$28(this.f48109b);
            case 1:
                return BrazeGeofenceManager.configureFromServerConfig$lambda$30(this.f48109b);
            case 2:
                return BrazeGeofenceManager.registerGeofences$lambda$37$lambda$34(this.f48109b);
            default:
                return BrazeGeofenceManager.registerGeofences$lambda$37$lambda$36(this.f48109b);
        }
    }
}
