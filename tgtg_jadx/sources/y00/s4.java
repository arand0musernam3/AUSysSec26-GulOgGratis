package y00;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.g6;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class s4 implements d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g6 f45135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f45136b;

    public s4(AppMeasurementDynamiteService appMeasurementDynamiteService, g6 g6Var) {
        this.f45136b = appMeasurementDynamiteService;
        this.f45135a = g6Var;
    }

    @Override // y00.d2
    public final void a(String str, String str2, Bundle bundle, long j9) {
        try {
            this.f45135a.h(str, str2, bundle, j9);
        } catch (RemoteException e5) {
            n1 n1Var = this.f45136b.f12155g;
            if (n1Var != null) {
                w0 w0Var = n1Var.f44987f;
                n1.m(w0Var);
                w0Var.f45263j.b(e5, "Event listener threw exception");
            }
        }
    }
}
