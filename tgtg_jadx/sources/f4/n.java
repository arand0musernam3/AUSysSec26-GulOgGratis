package f4;

import i4.e0;
import q1.c1;
import q1.o0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o0 f17313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e0 f17314b;

    @Override // i4.e0
    public final void a(l4.b bVar) {
        e0 e0Var = this.f17314b;
        if (e0Var != null) {
            e0Var.a(bVar);
        }
    }

    @Override // i4.e0
    public final k8.d b() {
        e0 e0Var = this.f17314b;
        if (!(e0Var != null)) {
            y4.a.b("GraphicsContext not provided");
        }
        return e0Var.b();
    }

    @Override // i4.e0
    public final l4.b c() {
        e0 e0Var = this.f17314b;
        if (e0Var == null) {
            y4.a.b("GraphicsContext not provided");
        }
        l4.b bVarC = e0Var.c();
        o0 o0Var = this.f17313a;
        if (o0Var != null) {
            o0Var.g(bVarC);
            return bVarC;
        }
        Object[] objArr = c1.f35730a;
        o0 o0Var2 = new o0(1);
        o0Var2.g(bVarC);
        this.f17313a = o0Var2;
        return bVarC;
    }

    public final void d() {
        o0 o0Var = this.f17313a;
        if (o0Var != null) {
            Object[] objArr = o0Var.f35721a;
            int i11 = o0Var.f35722b;
            for (int i12 = 0; i12 < i11; i12++) {
                a((l4.b) objArr[i12]);
            }
            o0Var.j();
        }
    }
}
