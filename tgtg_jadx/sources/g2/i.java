package g2;

import a3.z1;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends h2.q {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final cn.u f18170f = new cn.u(25, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y f18171c = new y(this);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a3.j f18172d = new a3.j(2, (byte) 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f18173e;

    public i(Function1 function1) {
        function1.invoke(this);
    }

    public static void p(i iVar, Function1 function1, u3.d dVar) {
        iVar.f18172d.e(1, new f(null, new h(function1, 0), new cp.i(24), new u3.d(new z1(dVar, 3), true, -291643851)));
        iVar.f18173e = true;
    }

    public static void q(i iVar, int i11, u3.d dVar) {
        iVar.f18172d.e(i11, new f(null, f18170f, v.f18260a, dVar));
    }

    @Override // h2.q
    public final a3.j k() {
        return this.f18172d;
    }
}
