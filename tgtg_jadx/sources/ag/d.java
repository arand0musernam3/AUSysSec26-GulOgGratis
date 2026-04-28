package ag;

import c50.w;
import qc.y;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements s70.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f1297b;

    public /* synthetic */ d(Object obj, int i11) {
        this.f1296a = i11;
        this.f1297b = obj;
    }

    public static d a(Object obj) {
        if (obj != null) {
            return new d(obj, 2);
        }
        w.l("instance cannot be null");
        return null;
    }

    public static void b(d dVar, s70.c cVar) {
        if (((s70.c) dVar.f1297b) == null) {
            dVar.f1297b = cVar;
        } else {
            y.e();
        }
    }

    @Override // t70.a
    public final Object get() {
        switch (this.f1296a) {
            case 0:
                cv.b bVar = (cv.b) ((i) this.f1297b).E.get();
                bVar.getClass();
                return new dj.a(bVar);
            case 1:
                s70.c cVar = (s70.c) this.f1297b;
                if (cVar != null) {
                    return cVar.get();
                }
                y.e();
                return null;
            default:
                return this.f1297b;
        }
    }

    public /* synthetic */ d() {
        this.f1296a = 1;
    }
}
