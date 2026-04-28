package lw;

import com.braze.managers.BrazeGeofenceManager;
import com.braze.models.BrazeGeofence;
import com.braze.storage.b2;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BrazeGeofence f28320b;

    public /* synthetic */ k(BrazeGeofence brazeGeofence, int i11) {
        this.f28319a = i11;
        this.f28320b = brazeGeofence;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f28319a) {
            case 0:
                return b2.a(this.f28320b);
            default:
                return BrazeGeofenceManager.registerGeofences$lambda$37$lambda$35(this.f28320b);
        }
    }
}
