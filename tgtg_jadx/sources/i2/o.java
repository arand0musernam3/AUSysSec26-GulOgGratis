package i2;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0 f22883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v80.b0 f22884c;

    public /* synthetic */ o(e0 e0Var, v80.b0 b0Var, int i11) {
        this.f22882a = i11;
        this.f22883b = e0Var;
        this.f22884c = b0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        switch (this.f22882a) {
            case 0:
                e0 e0Var = this.f22883b;
                if (e0Var.c()) {
                    v80.f0.B(this.f22884c, null, null, new p(e0Var, null, 0), 3);
                    z11 = true;
                } else {
                    z11 = false;
                }
                break;
            case 1:
                e0 e0Var2 = this.f22883b;
                if (e0Var2.d()) {
                    v80.f0.B(this.f22884c, null, null, new p(e0Var2, null, 1), 3);
                    z12 = true;
                } else {
                    z12 = false;
                }
                break;
            case 2:
                e0 e0Var3 = this.f22883b;
                if (e0Var3.c()) {
                    v80.f0.B(this.f22884c, null, null, new p(e0Var3, null, 0), 3);
                    z13 = true;
                } else {
                    z13 = false;
                }
                break;
            case 3:
                e0 e0Var4 = this.f22883b;
                if (e0Var4.d()) {
                    v80.f0.B(this.f22884c, null, null, new p(e0Var4, null, 1), 3);
                    z14 = true;
                } else {
                    z14 = false;
                }
                break;
            case 4:
                v80.f0.B(this.f22884c, null, null, new p(this.f22883b, null, 5), 3);
                break;
            default:
                v80.f0.B(this.f22884c, null, null, new p(this.f22883b, null, 6), 3);
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ o(v80.b0 b0Var, e0 e0Var, int i11) {
        this.f22882a = i11;
        this.f22884c = b0Var;
        this.f22883b = e0Var;
    }
}
