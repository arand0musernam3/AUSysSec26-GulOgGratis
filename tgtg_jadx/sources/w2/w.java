package w2;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f43065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f43066c;

    public /* synthetic */ w(int i11, int i12, int i13) {
        this.f43064a = i13;
        this.f43065b = i11;
        this.f43066c = i12;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i11 = this.f43064a;
        int i12 = 0;
        int i13 = this.f43066c;
        int i14 = this.f43065b;
        v2.a aVar = (v2.a) obj;
        switch (i11) {
            case 0:
                if (i14 < 0 || i13 < 0) {
                    c2.a.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i14 + " and " + i13 + " respectively.");
                }
                int i15 = 0;
                int i16 = 0;
                while (true) {
                    if (i15 < i14) {
                        int i17 = i16 + 1;
                        long j9 = aVar.f41922d;
                        k0 k0Var = aVar.f41920b;
                        int i18 = m5.t0.f29649c;
                        int i19 = (int) (j9 >> 32);
                        if (i19 > i17) {
                            i16 = (Character.isHighSurrogate(k0Var.charAt((i19 - i17) + (-1))) && Character.isLowSurrogate(k0Var.charAt(((int) (aVar.f41922d >> 32)) - i17))) ? i16 + 2 : i17;
                            i15++;
                        } else {
                            i16 = i19;
                        }
                    }
                }
                int length = 0;
                while (true) {
                    if (i12 < i13) {
                        int i21 = length + 1;
                        long j11 = aVar.f41922d;
                        k0 k0Var2 = aVar.f41920b;
                        int i22 = m5.t0.f29649c;
                        if (((int) (j11 & 4294967295L)) + i21 < k0Var2.length()) {
                            length = (Character.isHighSurrogate(k0Var2.charAt((((int) (aVar.f41922d & 4294967295L)) + i21) + (-1))) && Character.isLowSurrogate(k0Var2.charAt(((int) (4294967295L & aVar.f41922d)) + i21))) ? length + 2 : i21;
                            i12++;
                        } else {
                            length = k0Var2.length() - ((int) (aVar.f41922d & 4294967295L));
                        }
                    }
                }
                long j12 = aVar.f41922d;
                int i23 = m5.t0.f29649c;
                int i24 = (int) (j12 & 4294967295L);
                c0.p(aVar, i24, length + i24);
                int i25 = (int) (aVar.f41922d >> 32);
                c0.p(aVar, i25 - i16, i25);
                break;
            default:
                m5.t0 t0Var = aVar.f41923e;
                k0 k0Var3 = aVar.f41920b;
                if (t0Var != null) {
                    aVar.e(null);
                }
                int iC = n80.p.c(i14, 0, k0Var3.length());
                int iC2 = n80.p.c(i13, 0, k0Var3.length());
                if (iC != iC2) {
                    if (iC < iC2) {
                        aVar.d(null, iC, iC2);
                    } else {
                        aVar.d(null, iC2, iC);
                    }
                }
                break;
        }
        return Unit.f26487a;
    }
}
