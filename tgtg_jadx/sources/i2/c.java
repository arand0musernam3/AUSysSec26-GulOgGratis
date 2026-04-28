package i2;

import kotlin.jvm.functions.Function0;
import m3.h1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0 f22793b;

    public /* synthetic */ c(e0 e0Var, int i11) {
        this.f22792a = i11;
        this.f22793b = e0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int iO;
        int iL;
        switch (this.f22792a) {
            case 0:
                iO = this.f22793b.o();
                break;
            case 1:
                iO = this.f22793b.o();
                break;
            case 2:
                e0 e0Var = this.f22793b;
                return Integer.valueOf(e0Var.f22829k.b() ? e0Var.f22837t.h() : e0Var.l());
            case 3:
                e0 e0Var2 = this.f22793b;
                boolean zB = e0Var2.f22829k.b();
                h1 h1Var = e0Var2.f22836s;
                if (!zB) {
                    iL = e0Var2.l();
                } else if (h1Var.h() != -1) {
                    iL = h1Var.h();
                } else if (Math.abs(e0Var2.m()) >= Math.abs(Math.min(e0Var2.f22834q.c0(g0.f22857a), e0Var2.p() / 2.0f) / e0Var2.p())) {
                    boolean zBooleanValue = ((Boolean) e0Var2.G.getValue()).booleanValue();
                    int i11 = e0Var2.f22823e;
                    iL = zBooleanValue ? i11 + 1 : i11;
                } else {
                    iL = e0Var2.l();
                }
                iO = e0Var2.k(iL);
                break;
            case 4:
                iO = this.f22793b.o();
                break;
            case 5:
                iO = this.f22793b.l();
                break;
            default:
                iO = this.f22793b.l();
                break;
        }
        return Integer.valueOf(iO);
    }
}
