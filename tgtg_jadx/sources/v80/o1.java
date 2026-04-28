package v80;

import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class o1 extends k1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f42138e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d90.e f42139f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s1 f42140g;

    public /* synthetic */ o1(s1 s1Var, d90.e eVar, int i11) {
        this.f42138e = i11;
        this.f42140g = s1Var;
        this.f42139f = eVar;
    }

    @Override // v80.k1
    public final boolean k() {
        switch (this.f42138e) {
        }
        return false;
    }

    @Override // v80.k1
    public final void l(Throwable th2) {
        switch (this.f42138e) {
            case 0:
                s1 s1Var = this.f42140g;
                s1Var.getClass();
                Object objJ = s1.f42157a.get(s1Var);
                if (!(objJ instanceof t)) {
                    objJ = f0.J(objJ);
                }
                this.f42139f.i(s1Var, objJ);
                break;
            default:
                this.f42139f.i(this.f42140g, Unit.f26487a);
                break;
        }
    }
}
