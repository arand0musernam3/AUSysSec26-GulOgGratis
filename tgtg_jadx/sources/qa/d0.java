package qa;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public y f36662b;

    public /* synthetic */ d0(y yVar, int i11) {
        this.f36661a = i11;
        this.f36662b = yVar;
    }

    @Override // qa.z, qa.w
    public void a(y yVar) {
        switch (this.f36661a) {
            case 1:
                e0 e0Var = (e0) this.f36662b;
                if (!e0Var.J) {
                    e0Var.Q();
                    e0Var.J = true;
                }
                break;
        }
    }

    @Override // qa.z, qa.w
    public void c(y yVar) {
        switch (this.f36661a) {
            case 1:
                e0 e0Var = (e0) this.f36662b;
                int i11 = e0Var.I - 1;
                e0Var.I = i11;
                if (i11 == 0) {
                    e0Var.J = false;
                    e0Var.o();
                }
                yVar.F(this);
                break;
            case 2:
                this.f36662b.I();
                yVar.F(this);
                break;
        }
    }

    @Override // qa.z, qa.w
    public void g(y yVar) {
        switch (this.f36661a) {
            case 0:
                e0 e0Var = (e0) this.f36662b;
                e0Var.G.remove(yVar);
                if (!e0Var.x()) {
                    e0Var.C(e0Var, x.f36746c, false);
                    e0Var.f36766s = true;
                    e0Var.C(e0Var, x.f36745b, false);
                }
                break;
        }
    }

    public /* synthetic */ d0() {
        this.f36661a = 1;
    }
}
