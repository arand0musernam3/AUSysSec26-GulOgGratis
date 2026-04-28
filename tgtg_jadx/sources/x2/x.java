package x2;

import cj.j0;
import com.braze.h2;
import kotlin.Unit;
import v80.f0;
import z1.k2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends z70.i implements i80.n {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f43805j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ k2 f43806k;
    public /* synthetic */ long l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b2.l f43807m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ w f43808n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(b2.l lVar, w wVar, x70.c cVar) {
        super(3, cVar);
        this.f43807m = lVar;
        this.f43808n = wVar;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j9 = ((h4.b) obj2).f21378a;
        x xVar = new x(this.f43807m, this.f43808n, (x70.c) obj3);
        xVar.f43806k = (k2) obj;
        xVar.l = j9;
        return xVar.invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f43805j;
        if (i11 == 0) {
            ba0.g.M(obj);
            k2 k2Var = this.f43806k;
            long j9 = this.l;
            b2.l lVar = this.f43807m;
            if (lVar != null) {
                j0 j0Var = new j0(k2Var, this.f43808n, j9, lVar, (x70.c) null);
                this.f43805j = 1;
                if (f0.n(j0Var, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i11 != 1) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ba0.g.M(obj);
        }
        return Unit.f26487a;
    }
}
