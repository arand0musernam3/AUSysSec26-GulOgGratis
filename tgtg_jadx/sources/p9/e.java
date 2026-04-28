package p9;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import m3.i1;
import m3.k1;
import s1.e0;
import s1.s;
import t1.q1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f34605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f34606c;

    public /* synthetic */ e(Object obj, float f11, int i11) {
        this.f34604a = i11;
        this.f34606c = obj;
        this.f34605b = f11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f34604a) {
            case 0:
                Function1 function1 = (Function1) this.f34606c;
                s sVar = (s) obj;
                return new e0(((e0) function1.invoke(sVar)).f38572a, ((e0) function1.invoke(sVar)).f38573b, this.f34605b, null);
            default:
                q1 q1Var = (q1) this.f34606c;
                long jLongValue = ((Long) obj).longValue();
                boolean zH = q1Var.h();
                i1 i1Var = q1Var.f39543g;
                if (!zH) {
                    if (i1Var.h() == Long.MIN_VALUE) {
                        i1Var.i(jLongValue);
                        ((k1) q1Var.f39537a.f21216b).setValue(Boolean.TRUE);
                    }
                    long jH = jLongValue - i1Var.h();
                    float f11 = this.f34605b;
                    if (f11 != 0.0f) {
                        jH = j80.c.c(jH / ((double) f11));
                    }
                    q1Var.o(jH);
                    q1Var.i(jH, f11 == 0.0f);
                }
                return Unit.f26487a;
        }
    }
}
