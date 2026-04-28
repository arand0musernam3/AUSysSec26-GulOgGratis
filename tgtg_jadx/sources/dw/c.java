package dw;

import com.braze.managers.BrazeGeofenceManager;
import com.braze.managers.p;
import com.braze.models.IBrazeLocation;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IBrazeLocation f15184b;

    public /* synthetic */ c(IBrazeLocation iBrazeLocation, int i11) {
        this.f15183a = i11;
        this.f15184b = iBrazeLocation;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f15183a) {
            case 0:
                return com.braze.models.outgoing.event.a.b(this.f15184b);
            case 1:
                return BrazeGeofenceManager.onLocationRequestComplete$lambda$40(this.f15184b);
            default:
                return p.b(this.f15184b);
        }
    }
}
