package xz;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f44517b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ky.b f44518a;

    static {
        c cVar = new c();
        cVar.f44518a = null;
        f44517b = cVar;
    }

    public static ky.b a(Context context) {
        ky.b bVar;
        c cVar = f44517b;
        synchronized (cVar) {
            try {
                if (cVar.f44518a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    cVar.f44518a = new ky.b(context, (short) 0);
                }
                bVar = cVar.f44518a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }
}
