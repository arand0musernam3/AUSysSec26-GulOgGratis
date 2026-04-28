package s1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import z4.m1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f38651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m1 f38652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f38653c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(q qVar, m1 m1Var, long j9) {
        super(1);
        this.f38651a = qVar;
        this.f38652b = m1Var;
        this.f38653c = j9;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        b4.f fVar = this.f38651a.f38662r.f38674b;
        m1 m1Var = this.f38652b;
        z4.l1.n((z4.l1) obj, m1Var, fVar.a((((long) m1Var.f47184b) & 4294967295L) | (((long) m1Var.f47183a) << 32), this.f38653c, z5.m.Ltr));
        return Unit.f26487a;
    }
}
