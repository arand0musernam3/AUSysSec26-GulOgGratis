package p4;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f34294b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(f0 f0Var, int i11) {
        super(1);
        this.f34293a = i11;
        this.f34294b = f0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f34293a) {
            case 0:
                f0 f0Var = this.f34294b;
                f0Var.f34308d = true;
                f0Var.f34310f.invoke();
                return Unit.f26487a;
            default:
                k4.d dVar = (k4.d) obj;
                f0 f0Var2 = this.f34294b;
                c cVar = f0Var2.f34306b;
                float f11 = f0Var2.f34315k;
                float f12 = f0Var2.l;
                j30.g gVarG0 = dVar.g0();
                long jO = gVarG0.o();
                gVarG0.i().e();
                try {
                    ((jd.f) gVarG0.f24502b).o(f11, f12, 0L);
                    cVar.a(dVar);
                    r8.k.y(gVarG0, jO);
                    return Unit.f26487a;
                } catch (Throwable th2) {
                    r8.k.y(gVarG0, jO);
                    throw th2;
                }
        }
    }
}
