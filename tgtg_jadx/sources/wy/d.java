package wy;

import androidx.constraintlayout.widget.z;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d implements m40.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f43551a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m40.b f43552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m40.b f43553c;

    static {
        z zVarE = z.e();
        zVarE.f2542b = 1;
        f43552b = new m40.b("logSource", l1.i(l1.h(p40.e.class, zVarE.c())));
        z zVarE2 = z.e();
        zVarE2.f2542b = 2;
        f43553c = new m40.b("logEventDropped", l1.i(l1.h(p40.e.class, zVarE2.c())));
    }

    @Override // m40.a
    public final void a(Object obj, Object obj2) {
        zy.e eVar = (zy.e) obj;
        m40.d dVar = (m40.d) obj2;
        dVar.a(f43552b, eVar.f48419a);
        dVar.a(f43553c, eVar.f48420b);
    }
}
