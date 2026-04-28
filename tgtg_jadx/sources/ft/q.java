package ft;

import al.a0;
import at.w;
import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class q extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f17960j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f17961k;
    public final /* synthetic */ s l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(s sVar, x70.c cVar, int i11) {
        super(2, cVar);
        this.f17960j = i11;
        this.l = sVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f17960j) {
            case 0:
                return new q(this.l, cVar, 0);
            case 1:
                return new q(this.l, cVar, 1);
            case 2:
                return new q(this.l, cVar, 2);
            default:
                return new q(this.l, cVar, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f17960j) {
        }
        return ((q) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f17960j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f17961k;
                if (i11 == 0) {
                    ba0.g.M(obj);
                    a0 a0Var = new a0(this.l.f17967a.getData(), 14);
                    this.f17961k = 1;
                    obj = y80.r.r(a0Var, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ba0.g.M(obj);
                }
                Boolean bool = (Boolean) obj;
                return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
            case 1:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f17961k;
                if (i12 == 0) {
                    ba0.g.M(obj);
                    s sVar = this.l;
                    w wVar = new w(4, sVar.f17967a.getData(), sVar);
                    this.f17961k = 1;
                    obj = y80.r.r(wVar, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ba0.g.M(obj);
                }
                Boolean bool2 = (Boolean) obj;
                return Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false);
            case 2:
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                int i13 = this.f17961k;
                if (i13 != 0) {
                    if (i13 == 1) {
                        ba0.g.M(obj);
                        return obj;
                    }
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ba0.g.M(obj);
                d8.f fVar = this.l.f17967a;
                bm.o oVar = new bm.o(2, null, 12);
                this.f17961k = 1;
                Object objR = xz.b.r(fVar, oVar, this);
                return objR == aVar3 ? aVar3 : objR;
            default:
                Object obj2 = y70.a.COROUTINE_SUSPENDED;
                int i14 = this.f17961k;
                if (i14 == 0) {
                    ba0.g.M(obj);
                    this.f17961k = 1;
                    Object objR2 = xz.b.r(this.l.f17967a, new bm.o(2, null, 11), this);
                    if (objR2 != obj2) {
                        objR2 = Unit.f26487a;
                    }
                    if (objR2 == obj2) {
                        return obj2;
                    }
                } else {
                    if (i14 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ba0.g.M(obj);
                }
                return Unit.f26487a;
        }
    }
}
