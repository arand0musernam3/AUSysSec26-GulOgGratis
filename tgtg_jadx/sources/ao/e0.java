package ao;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e0 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f4230j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f4231k;
    public final /* synthetic */ m0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(m0 m0Var, x70.c cVar, int i11) {
        super(2, cVar);
        this.f4230j = i11;
        this.l = m0Var;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f4230j) {
            case 0:
                return new e0(this.l, cVar, 0);
            default:
                return new e0(this.l, cVar, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v80.b0 b0Var = (v80.b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f4230j) {
        }
        return ((e0) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f4230j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f4231k;
                if (i11 != 0) {
                    if (i11 == 1) {
                        ba0.g.M(obj);
                        return obj;
                    }
                    com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ba0.g.M(obj);
                al.a0 a0Var = new al.a0(this.l.f4357h.getData(), 2);
                this.f4231k = 1;
                Object objQ = y80.r.q(a0Var, this);
                return objQ == aVar ? aVar : objQ;
            default:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f4231k;
                if (i12 == 0) {
                    ba0.g.M(obj);
                    al.a0 a0Var2 = new al.a0(this.l.f4357h.getData(), 1);
                    this.f4231k = 1;
                    obj = y80.r.q(a0Var2, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ba0.g.M(obj);
                }
                Long l = (Long) obj;
                return new Long(l != null ? l.longValue() : 0L);
        }
    }
}
