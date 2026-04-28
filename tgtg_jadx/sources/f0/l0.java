package f0;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 implements y80.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p0 f16758b;

    public /* synthetic */ l0(p0 p0Var, int i11) {
        this.f16757a = i11;
        this.f16758b = p0Var;
    }

    @Override // y80.j
    public final Object emit(Object obj, x70.c cVar) {
        switch (this.f16757a) {
            case 0:
                j0.m mVar = (j0.m) obj;
                p0 p0Var = this.f16758b;
                e0.n nVar = p0Var.f16817d;
                if (!(mVar instanceof j0.i)) {
                    if (mVar instanceof j0.k) {
                        if (!Intrinsics.areEqual(((j0.k) mVar).f24299a, nVar.f15369a)) {
                            com.braze.h2.b("Check failed.");
                        } else {
                            p0.a(p0Var, mVar);
                        }
                    }
                    break;
                } else if (!Intrinsics.areEqual(((j0.i) mVar).f24297a, nVar.f15369a)) {
                    com.braze.h2.b("Check failed.");
                } else {
                    p0.a(p0Var, mVar);
                }
                break;
            default:
                p0.a(this.f16758b, j0.j.f24298a);
                break;
        }
        return Unit.f26487a;
    }
}
