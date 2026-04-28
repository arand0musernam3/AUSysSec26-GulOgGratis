package ix;

import android.os.Bundle;
import android.os.OutcomeReceiver;
import android.util.Log;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements OutcomeReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24232a;

    public final void onError(Throwable th2) {
        String str;
        hx.a aVar;
        String str2;
        hx.a aVar2;
        switch (this.f24232a) {
            case 0:
                Exception exc = (Exception) th2;
                exc.getClass();
                hx.a aVar3 = null;
                if (yx.a.f46339a.contains(c.class)) {
                    str = null;
                } else {
                    try {
                        str = c.f24234b;
                    } catch (Throwable th3) {
                        yx.a.a(c.class, th3);
                        str = null;
                    }
                }
                Log.d(str, "OUTCOME_RECEIVER_TRIGGER_FAILURE");
                if (yx.a.f46339a.contains(c.class)) {
                    aVar = null;
                } else {
                    try {
                        aVar = c.f24236d;
                    } catch (Throwable th4) {
                        yx.a.a(c.class, th4);
                        aVar = null;
                    }
                }
                if (aVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("gpsDebugLogger");
                } else {
                    aVar3 = aVar;
                }
                Bundle bundle = new Bundle();
                bundle.putString("gps_ara_failed_reason", exc.toString());
                aVar3.a(bundle, "gps_ara_failed");
                break;
            default:
                Exception exc2 = (Exception) th2;
                exc2.getClass();
                hx.a aVar4 = null;
                if (yx.a.f46339a.contains(jx.a.class)) {
                    str2 = null;
                } else {
                    try {
                        str2 = jx.a.f25432b;
                    } catch (Throwable th5) {
                        yx.a.a(jx.a.class, th5);
                        str2 = null;
                    }
                }
                Log.e(str2, exc2.toString());
                if (yx.a.f46339a.contains(jx.a.class)) {
                    aVar2 = null;
                } else {
                    try {
                        aVar2 = jx.a.f25436f;
                    } catch (Throwable th6) {
                        yx.a.a(jx.a.class, th6);
                        aVar2 = null;
                    }
                }
                if (aVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("gpsDebugLogger");
                } else {
                    aVar4 = aVar2;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("gps_pa_failed_reason", exc2.toString());
                aVar4.a(bundle2, "gps_pa_failed");
                break;
        }
    }

    public final void onResult(Object obj) {
        String str;
        hx.a aVar;
        String str2;
        hx.a aVar2;
        int i11 = this.f24232a;
        obj.getClass();
        switch (i11) {
            case 0:
                if (yx.a.f46339a.contains(c.class)) {
                    str = null;
                } else {
                    try {
                        str = c.f24234b;
                    } catch (Throwable th2) {
                        yx.a.a(c.class, th2);
                        str = null;
                    }
                }
                Log.d(str, "OUTCOME_RECEIVER_TRIGGER_SUCCESS");
                if (yx.a.f46339a.contains(c.class)) {
                    aVar = null;
                } else {
                    try {
                        aVar = c.f24236d;
                    } catch (Throwable th3) {
                        yx.a.a(c.class, th3);
                        aVar = null;
                    }
                }
                if (aVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("gpsDebugLogger");
                    aVar = null;
                }
                aVar.a(null, "gps_ara_succeed");
                break;
            default:
                if (yx.a.f46339a.contains(jx.a.class)) {
                    str2 = null;
                } else {
                    try {
                        str2 = jx.a.f25432b;
                    } catch (Throwable th4) {
                        yx.a.a(jx.a.class, th4);
                        str2 = null;
                    }
                }
                Log.i(str2, "Successfully joined custom audience");
                if (yx.a.f46339a.contains(jx.a.class)) {
                    aVar2 = null;
                } else {
                    try {
                        aVar2 = jx.a.f25436f;
                    } catch (Throwable th5) {
                        yx.a.a(jx.a.class, th5);
                        aVar2 = null;
                    }
                }
                if (aVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("gpsDebugLogger");
                    aVar2 = null;
                }
                aVar2.a(null, "gps_pa_succeed");
                break;
        }
    }
}
