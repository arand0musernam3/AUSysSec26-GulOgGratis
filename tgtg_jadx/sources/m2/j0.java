package m2;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e1 f28916b;

    public /* synthetic */ j0(e1 e1Var, int i11) {
        this.f28915a = i11;
        this.f28916b = e1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f28915a) {
            case 0:
                z4.z zVar = (z4.z) obj;
                a2 a2VarD = this.f28916b.d();
                if (a2VarD != null) {
                    a2VarD.f28764c = zVar;
                }
                return Unit.f26487a;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                this.f28916b.f28833q.setValue(bool);
                return Unit.f26487a;
            case 2:
                e1 e1Var = this.f28916b;
                m3.k1 k1Var = e1Var.f28836t;
                r5.y yVar = (r5.y) obj;
                String str = yVar.f37714a.f29538b;
                m5.h hVar = e1Var.f28827j;
                if (!Intrinsics.areEqual(str, hVar != null ? hVar.f29538b : null)) {
                    e1Var.f28828k.setValue(u0.None);
                    if (((Boolean) k1Var.getValue()).booleanValue()) {
                        k1Var.setValue(Boolean.FALSE);
                    } else {
                        e1Var.f28835s.setValue(Boolean.FALSE);
                    }
                }
                long j9 = m5.t0.f29648b;
                e1Var.f(j9);
                e1Var.e(j9);
                e1Var.f28837u.invoke(yVar);
                e1Var.f28819b.b();
                return Unit.f26487a;
            case 3:
                this.f28916b.f28834r.b(((r5.l) obj).f37687a);
                return Unit.f26487a;
            default:
                return Boolean.valueOf(this.f28916b.f28834r.b(((r5.l) obj).f37687a));
        }
    }
}
