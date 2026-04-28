package s1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import z4.m1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g1 extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f38600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f38602c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z4.w0 f38603d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m1 f38604e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(h1 h1Var, long j9, int i11, int i12, z4.w0 w0Var, m1 m1Var) {
        super(1);
        this.f38600a = j9;
        this.f38601b = i11;
        this.f38602c = i12;
        this.f38603d = w0Var;
        this.f38604e = m1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        z4.l1 l1Var = (z4.l1) obj;
        long j9 = (((long) this.f38601b) << 32) | (((long) this.f38602c) & 4294967295L);
        z5.m layoutDirection = this.f38603d.getLayoutDirection();
        long j11 = this.f38600a;
        float f11 = (((int) (j9 >> 32)) - ((int) (j11 >> 32))) / 2.0f;
        float f12 = (((int) (j9 & 4294967295L)) - ((int) (j11 & 4294967295L))) / 2.0f;
        float f13 = layoutDirection == z5.m.Ltr ? -1.0f : (-1) * (-1.0f);
        float f14 = 1;
        float f15 = (f13 + f14) * f11;
        z4.l1.n(l1Var, this.f38604e, (((long) Math.round((f14 - 1.0f) * f12)) & 4294967295L) | (((long) Math.round(f15)) << 32));
        return Unit.f26487a;
    }
}
