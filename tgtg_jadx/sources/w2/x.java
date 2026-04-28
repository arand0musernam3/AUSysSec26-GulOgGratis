package w2;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43075a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f43076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f43077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v f43078d;

    public /* synthetic */ x(int i11, int i12, v vVar) {
        this.f43076b = i11;
        this.f43077c = i12;
        this.f43078d = vVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i11 = this.f43075a;
        v vVar = this.f43078d;
        int i12 = this.f43077c;
        int i13 = this.f43076b;
        v2.a aVar = (v2.a) obj;
        switch (i11) {
            case 0:
                long jC = vVar.c(m5.k0.b(0, aVar.f41920b.length()));
                int iG = m5.t0.g(jC);
                int iF = m5.t0.f(jC);
                if (i13 < iG) {
                    i13 = iG;
                }
                if (i13 <= iF) {
                    iF = i13;
                }
                int iG2 = m5.t0.g(jC);
                int iF2 = m5.t0.f(jC);
                if (i12 < iG2) {
                    i12 = iG2;
                }
                if (i12 <= iF2) {
                    iF2 = i12;
                }
                aVar.f(vVar.b(m5.k0.b(iF, iF2)));
                break;
            default:
                if (i13 < 0 || i12 < 0) {
                    c2.a.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i13 + " and " + i12 + " respectively.");
                }
                long jC2 = vVar.c(aVar.f41922d);
                int i14 = m5.t0.f29649c;
                int i15 = (int) (4294967295L & jC2);
                int iA = i15 + i12;
                if (((i12 ^ iA) & (i15 ^ iA)) < 0) {
                    iA = vVar.a();
                }
                long jB = vVar.b(m5.k0.b(i15, Math.min(iA, vVar.a())));
                c0.p(aVar, m5.t0.g(jB), m5.t0.f(jB));
                int i16 = (int) (jC2 >> 32);
                int i17 = i16 - i13;
                if (((i13 ^ i16) & (i16 ^ i17)) < 0) {
                    i17 = 0;
                }
                long jB2 = vVar.b(m5.k0.b(Math.max(0, i17), i16));
                c0.p(aVar, m5.t0.g(jB2), m5.t0.f(jB2));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ x(v vVar, int i11, int i12) {
        this.f43078d = vVar;
        this.f43076b = i11;
        this.f43077c = i12;
    }
}
