package a3;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j2 f556b;

    public /* synthetic */ s0(j2 j2Var, int i11) {
        this.f555a = i11;
        this.f556b = j2Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        h0 h0Var;
        h0 h0Var2;
        switch (this.f555a) {
            case 0:
                break;
            case 1:
                z4.z zVar = (z4.z) obj;
                j2 j2Var = this.f556b;
                h4.c cVar = (h4.c) j2Var.f411j.getValue();
                if (cVar != null) {
                    z4.z zVar2 = j2Var.l;
                    if (zVar2 == null) {
                        c2.a.d("Required value was null.");
                        qc.y.m();
                    }
                }
                break;
            case 2:
                long jLongValue = ((Long) obj).longValue();
                j2 j2Var2 = this.f556b;
                if (j2Var2.f402a.a().a(jLongValue)) {
                    j2Var2.i();
                    j2Var2.l(null);
                }
                break;
            case 3:
                long jLongValue2 = ((Long) obj).longValue();
                j2 j2Var3 = this.f556b;
                i0 i0VarF = j2Var3.f();
                if (i0VarF != null && (h0Var2 = i0VarF.f385a) != null && jLongValue2 == h0Var2.f368c) {
                    j2Var3.f416p.setValue(null);
                }
                i0 i0VarF2 = j2Var3.f();
                if (i0VarF2 != null && (h0Var = i0VarF2.f386b) != null && jLongValue2 == h0Var.f368c) {
                    j2Var3.f417q.setValue(null);
                }
                if (j2Var3.f402a.a().a(jLongValue2)) {
                    j2Var3.o();
                }
                break;
            case 4:
                z4.z zVar3 = (z4.z) obj;
                j2 j2Var4 = this.f556b;
                j2Var4.l = zVar3;
                if (((Boolean) j2Var4.f410i.getValue()).booleanValue() && j2Var4.f() != null) {
                    h4.b bVar = zVar3 != null ? new h4.b(zVar3.e(0L)) : null;
                    if (!Intrinsics.areEqual(j2Var4.f412k, bVar)) {
                        j2Var4.f412k = bVar;
                        j2Var4.m();
                        j2Var4.o();
                    }
                }
                break;
            case 5:
                j2 j2Var5 = this.f556b;
                m3.k1 k1Var = j2Var5.f410i;
                g4.b0 b0Var = (g4.b0) ((g4.z) obj);
                if (!b0Var.a() && ((Boolean) k1Var.getValue()).booleanValue()) {
                    j2Var5.i();
                }
                k1Var.setValue(Boolean.valueOf(b0Var.a()));
                break;
            case 6:
                this.f556b.k(((Boolean) obj).booleanValue());
                break;
            case 7:
                this.f556b.l((i0) obj);
                break;
            default:
                long jLongValue3 = ((Long) obj).longValue();
                j2 j2Var6 = this.f556b;
                if (j2Var6.f402a.a().a(jLongValue3)) {
                    j2Var6.f413m.setValue(Unit.f26487a);
                    j2Var6.m();
                    j2Var6.o();
                }
                break;
        }
        return Unit.f26487a;
    }
}
