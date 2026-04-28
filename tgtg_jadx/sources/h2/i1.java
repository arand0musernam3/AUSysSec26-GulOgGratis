package h2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k1 f21138b;

    public /* synthetic */ i1(k1 k1Var, int i11) {
        this.f21137a = i11;
        this.f21138b = k1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f21137a) {
            case 0:
                k0 k0Var = (k0) this.f21138b.f21149o.invoke();
                int iA = k0Var.a();
                int i11 = 0;
                while (true) {
                    if (i11 >= iA) {
                        i11 = -1;
                    } else if (!Intrinsics.areEqual(k0Var.b(i11), obj)) {
                        i11++;
                    }
                }
                return Integer.valueOf(i11);
            default:
                int iIntValue = ((Integer) obj).intValue();
                k1 k1Var = this.f21138b;
                k0 k0Var2 = (k0) k1Var.f21149o.invoke();
                if (iIntValue < 0 || iIntValue >= k0Var2.a()) {
                    StringBuilder sbK = org.bouncycastle.jcajce.provider.asymmetric.a.k(iIntValue, "Can't scroll to index ", ", it is out of bounds [0, ");
                    sbK.append(k0Var2.a());
                    sbK.append(')');
                    c2.a.a(sbK.toString());
                }
                v80.f0.B(k1Var.getCoroutineScope(), null, null, new b0.a1(k1Var, iIntValue, null, 4), 3);
                return Boolean.TRUE;
        }
    }
}
