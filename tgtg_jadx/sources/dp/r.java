package dp;

import i4.s0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import m3.c3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class r implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c3 f15112b;

    public /* synthetic */ r(c3 c3Var, int i11) {
        this.f15111a = i11;
        this.f15112b = c3Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f15111a) {
            case 0:
                ((z5.c) obj).getClass();
                return new z5.j((((long) ((Number) this.f15112b.getValue()).intValue()) << 32) | (((long) 0) & 4294967295L));
            case 1:
                k4.d dVar = (k4.d) obj;
                long j9 = ((i4.v) this.f15112b.getValue()).f23317a;
                if (!i4.v.c(j9, i4.v.f23315h)) {
                    k4.d.B0(dVar, j9, 0L, 0L, 0.0f, 126);
                }
                return Unit.f26487a;
            case 2:
                ((s0) obj).c(((Number) this.f15112b.getValue()).floatValue());
                return Unit.f26487a;
            case 3:
                return new z5.j((((long) ((z5.c) obj).q0(((z5.f) this.f15112b.getValue()).f47277a)) << 32) | (((long) 0) & 4294967295L));
            case 4:
                ((s0) obj).c(((Number) this.f15112b.getValue()).floatValue());
                return Unit.f26487a;
            default:
                ((z5.c) obj).getClass();
                return new z5.j(((z5.j) this.f15112b.getValue()).f47280a);
        }
    }
}
