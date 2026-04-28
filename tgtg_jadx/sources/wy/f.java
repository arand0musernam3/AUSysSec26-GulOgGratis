package wy;

import androidx.constraintlayout.widget.z;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f implements m40.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f43555a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m40.b f43556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m40.b f43557c;

    static {
        z zVarE = z.e();
        zVarE.f2542b = 1;
        f43556b = new m40.b("currentCacheSizeBytes", l1.i(l1.h(p40.e.class, zVarE.c())));
        z zVarE2 = z.e();
        zVarE2.f2542b = 2;
        f43557c = new m40.b("maxCacheSizeBytes", l1.i(l1.h(p40.e.class, zVarE2.c())));
    }

    @Override // m40.a
    public final void a(Object obj, Object obj2) {
        zy.f fVar = (zy.f) obj;
        m40.d dVar = (m40.d) obj2;
        dVar.b(f43556b, fVar.f48421a);
        dVar.b(f43557c, fVar.f48422b);
    }
}
