package w;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import b0.e1;
import s0.r2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class v implements r2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e1 f42789b;

    public v(Context context) {
        context.getClass();
        this.f42789b = e1.f5134g.a(context);
        if ((context instanceof Application) && wd.a.B(4, "CXCP")) {
            Log.i("CXCP", "The provided context (" + context + ") is application scoped and will be used to infer the default display for computing the default preview size, orientation, and default aspect ratio for UseCase outputs.");
        }
        if (wd.a.B(3, "CXCP")) {
            Log.d("CXCP", "Created UseCaseConfigurationMap");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0151 A[LOOP:1: B:34:0x014b->B:36:0x0151, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0187  */
    @Override // s0.r2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final s0.u0 a(s0.q2 r33, int r34) {
        /*
            Method dump skipped, instruction units count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w.v.a(s0.q2, int):s0.u0");
    }
}
