package h0;

import a3.b2;
import b5.j1;
import v80.b0;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r80.a f20964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f20965c;

    public e(e90.a aVar) {
        this.f20963a = 0;
        aVar.getClass();
        this.f20965c = aVar;
        this.f20964b = w.b.p(false);
    }

    public final boolean a() {
        switch (this.f20963a) {
        }
        return this.f20964b.b();
    }

    public final boolean b() {
        switch (this.f20963a) {
            case 0:
                if (!this.f20964b.a()) {
                    return false;
                }
                ((e90.a) this.f20965c).e(null);
                return true;
            default:
                if (!this.f20964b.a()) {
                    return false;
                }
                j1 j1Var = (j1) this.f20965c;
                synchronized (j1Var.f5851e) {
                    int i11 = j1Var.f5847a - 1;
                    j1Var.f5847a = i11;
                    if (i11 == 0 && !j1Var.f5848b) {
                        j1Var.f5852f = f0.B((b0) j1Var.f5849c, null, null, new b2(j1Var, null, 29), 3);
                    }
                    break;
                }
                return true;
        }
    }

    public e(j1 j1Var) {
        this.f20963a = 1;
        this.f20965c = j1Var;
        this.f20964b = w.b.p(false);
    }
}
