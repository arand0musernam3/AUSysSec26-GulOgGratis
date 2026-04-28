package b0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f5508j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f5509k;
    public final /* synthetic */ b1 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(b1 b1Var, x70.c cVar, int i11) {
        super(2, cVar);
        this.f5508j = i11;
        this.l = b1Var;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f5508j) {
            case 0:
                return new y0(this.l, cVar, 0);
            case 1:
                return new y0(this.l, cVar, 1);
            default:
                return new y0(this.l, cVar, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v80.b0 b0Var = (v80.b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f5508j) {
        }
        return ((y0) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f5508j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f5509k;
                if (i11 != 0) {
                    if (i11 == 1) {
                        ba0.g.M(obj);
                        return obj;
                    }
                    com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ba0.g.M(obj);
                x2 x2VarL = b1.l(this.l);
                this.f5509k = 1;
                Object objA = x2VarL.a(this);
                return objA == aVar ? aVar : objA;
            case 1:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f5509k;
                if (i12 != 0) {
                    if (i12 == 1) {
                        ba0.g.M(obj);
                        return obj;
                    }
                    com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ba0.g.M(obj);
                v80.i0 i0VarH = b1.l(this.l).h();
                this.f5509k = 1;
                Object objM = ((v80.q) i0VarH).m(this);
                return objM == aVar2 ? aVar2 : objM;
            default:
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                int i13 = this.f5509k;
                if (i13 != 0) {
                    if (i13 == 1) {
                        ba0.g.M(obj);
                        return obj;
                    }
                    com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ba0.g.M(obj);
                v80.i0 i0VarB = b1.l(this.l).b();
                this.f5509k = 1;
                Object objM2 = ((v80.q) i0VarB).m(this);
                return objM2 == aVar3 ? aVar3 : objM2;
        }
    }
}
