package fg;

import h2.b0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import m3.c3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f17735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17736c;

    public /* synthetic */ p(b0 b0Var, long j9) {
        this.f17734a = 2;
        this.f17736c = b0Var;
        this.f17735b = j9;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i11 = this.f17734a;
        Object obj2 = this.f17736c;
        switch (i11) {
            case 0:
                i4.i iVar = (i4.i) obj2;
                k4.d dVar = (k4.d) obj;
                dVar.getClass();
                dVar.H(this.f17735b, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (dVar.d() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), 2.0f, (496 & 16) != 0 ? 0 : 0, (496 & 32) != 0 ? null : iVar);
                break;
            case 1:
                k4.d.B0((k4.d) obj, this.f17735b, 0L, 0L, n80.p.b(((Number) ((c3) obj2).getValue()).floatValue(), 0.0f, 1.0f), 118);
                break;
            default:
                b0 b0Var = (b0) obj2;
                long jC = z5.j.c(((z5.j) ((t1.b) obj).d()).f47280a, this.f17735b);
                int i12 = b0.f21042t;
                b0Var.g(jC);
                b0Var.f21045c.invoke();
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ p(int i11, long j9, Object obj) {
        this.f17734a = i11;
        this.f17735b = j9;
        this.f17736c = obj;
    }
}
