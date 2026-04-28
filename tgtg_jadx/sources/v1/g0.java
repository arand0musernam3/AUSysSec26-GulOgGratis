package v1;

import com.braze.h2;
import kotlin.Unit;
import z1.k2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends z70.i implements i80.n {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f41731j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ k2 f41732k;
    public /* synthetic */ long l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ h0 f41733m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(h0 h0Var, x70.c cVar) {
        super(3, cVar);
        this.f41733m = h0Var;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j9 = ((h4.b) obj2).f21378a;
        g0 g0Var = new g0(this.f41733m, (x70.c) obj3);
        g0Var.f41732k = (k2) obj;
        g0Var.l = j9;
        return g0Var.invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        Object objN;
        Object obj2 = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f41731j;
        if (i11 == 0) {
            ba0.g.M(obj);
            k2 k2Var = this.f41732k;
            long j9 = this.l;
            h0 h0Var = this.f41733m;
            if (h0Var.f41726v) {
                this.f41731j = 1;
                b2.l lVar = h0Var.f41721q;
                if (lVar == null || (objN = v80.f0.n(new c(k2Var, j9, lVar, h0Var, null), this)) != obj2) {
                    objN = Unit.f26487a;
                }
                if (objN == obj2) {
                    return obj2;
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
