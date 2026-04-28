package wy;

import androidx.constraintlayout.widget.z;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements m40.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f43541a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m40.b f43542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m40.b f43543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m40.b f43544d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m40.b f43545e;

    static {
        z zVarE = z.e();
        zVarE.f2542b = 1;
        f43542b = new m40.b("window", l1.i(l1.h(p40.e.class, zVarE.c())));
        z zVarE2 = z.e();
        zVarE2.f2542b = 2;
        f43543c = new m40.b("logSourceMetrics", l1.i(l1.h(p40.e.class, zVarE2.c())));
        z zVarE3 = z.e();
        zVarE3.f2542b = 3;
        f43544d = new m40.b("globalMetrics", l1.i(l1.h(p40.e.class, zVarE3.c())));
        z zVarE4 = z.e();
        zVarE4.f2542b = 4;
        f43545e = new m40.b("appNamespace", l1.i(l1.h(p40.e.class, zVarE4.c())));
    }

    @Override // m40.a
    public final void a(Object obj, Object obj2) {
        zy.a aVar = (zy.a) obj;
        m40.d dVar = (m40.d) obj2;
        dVar.a(f43542b, aVar.f48411a);
        dVar.a(f43543c, aVar.f48412b);
        dVar.a(f43544d, aVar.f48413c);
        dVar.a(f43545e, aVar.f48414d);
    }
}
