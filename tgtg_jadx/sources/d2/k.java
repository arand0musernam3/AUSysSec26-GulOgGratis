package d2;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z4.m1 f13819b;

    public /* synthetic */ k(z4.m1 m1Var, int i11) {
        this.f13818a = i11;
        this.f13819b = m1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        z4.l1 l1Var = (z4.l1) obj;
        switch (this.f13818a) {
            case 0:
                z4.l1.o(l1Var, this.f13819b, 0, 0);
                break;
            case 1:
                z4.l1.o(l1Var, this.f13819b, 0, 0);
                break;
            case 2:
                z5.m mVarE = l1Var.e();
                z5.m mVar = z5.m.Ltr;
                z4.m1 m1Var = this.f13819b;
                if (mVarE == mVar || l1Var.g() == 0) {
                    z4.l1.b(l1Var, m1Var);
                    m1Var.h0(z5.j.d(0L, m1Var.f47187e), 0.0f, null);
                } else {
                    int i11 = (int) 0;
                    long jG = ((long) ((l1Var.g() - m1Var.f47183a) - i11)) << 32;
                    z4.l1.b(l1Var, m1Var);
                    m1Var.h0(z5.j.d((((long) i11) & 4294967295L) | jG, m1Var.f47187e), 0.0f, null);
                }
                break;
            case 3:
                z4.l1.o(l1Var, this.f13819b, 0, 0);
                break;
            case 4:
                z4.l1.o(l1Var, this.f13819b, 0, 0);
                break;
            case 5:
                l1Var.j(this.f13819b, 0, 0, 0.0f);
                break;
            case 6:
                l1Var.j(this.f13819b, 0, 0, 0.0f);
                break;
            case 7:
                l1Var.j(this.f13819b, 0, 0, 0.0f);
                break;
            case 8:
                l1Var.j(this.f13819b, 0, 0, 0.0f);
                break;
            case 9:
                l1Var.j(this.f13819b, 0, 0, 0.0f);
                break;
            case 10:
                z4.l1.o(l1Var, this.f13819b, 0, 0);
                break;
            case 11:
                l1Var.j(this.f13819b, 0, 0, 0.0f);
                break;
            case 12:
                z4.l1.o(l1Var, this.f13819b, 0, 0);
                break;
            case 13:
                l1Var.j(this.f13819b, 0, 0, 0.0f);
                break;
            case 14:
                l1Var.j(this.f13819b, 0, 0, 0.0f);
                break;
            default:
                l1Var.j(this.f13819b, 0, 0, 0.0f);
                break;
        }
        return Unit.f26487a;
    }
}
