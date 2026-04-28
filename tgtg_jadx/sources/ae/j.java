package ae;

import android.os.SystemClock;
import com.braze.models.BrazeGeofence;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements e {
    @Override // ae.e, ed.m
    public final boolean e() {
        boolean z11;
        synchronized (d.f1247a) {
            try {
                int i11 = d.f1249c;
                d.f1249c = i11 + 1;
                if (i11 >= 30 || SystemClock.uptimeMillis() > d.f1250d + ((long) BrazeGeofence.DEFAULT_NOTIFICATION_RESPONSIVENESS_MS)) {
                    d.f1249c = 0;
                    d.f1250d = SystemClock.uptimeMillis();
                    String[] list = d.f1248b.list();
                    if (list == null) {
                        list = new String[0];
                    }
                    d.f1251e = list.length < 800;
                }
                z11 = d.f1251e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    @Override // ae.e
    public final boolean f(ud.h hVar) {
        ud.c cVar = hVar.f41060a;
        if ((cVar instanceof ud.a ? ((ud.a) cVar).f41055a : Integer.MAX_VALUE) <= 100) {
            return false;
        }
        ud.c cVar2 = hVar.f41061b;
        return (cVar2 instanceof ud.a ? ((ud.a) cVar2).f41055a : Integer.MAX_VALUE) > 100;
    }
}
