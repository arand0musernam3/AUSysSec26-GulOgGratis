package gf;

import com.google.firebase.messaging.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements qf.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qf.c f20403a = qf.c.Observe;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public xe.a f20404b;

    @Override // qf.d
    public final void a(ye.b bVar) {
        bVar.getClass();
        String str = bVar.f45852a.f45890e;
        Object obj = xe.a.f44236c;
        xe.a aVarB = ox.h.B(str);
        this.f20404b = aVarB;
        a0 a0Var = aVarB.f44238a;
        j30.g gVar = bVar.f45853b;
        a0Var.X(new xe.b((String) gVar.f24502b, (String) gVar.f24503c, 4));
    }

    @Override // qf.d
    public final pf.a b(pf.a aVar) {
        return null;
    }

    @Override // qf.d
    public final qf.c getType() {
        return this.f20403a;
    }
}
