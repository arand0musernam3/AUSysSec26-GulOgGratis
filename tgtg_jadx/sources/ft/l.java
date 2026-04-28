package ft;

import al.a0;
import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class l extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f17942j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f17943k;
    public final /* synthetic */ o l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(o oVar, x70.c cVar, int i11) {
        super(2, cVar);
        this.f17942j = i11;
        this.l = oVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f17942j) {
            case 0:
                return new l(this.l, cVar, 0);
            case 1:
                return new l(this.l, cVar, 1);
            case 2:
                return new l(this.l, cVar, 2);
            default:
                return new l(this.l, cVar, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f17942j) {
        }
        return ((l) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f17942j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f17943k;
                if (i11 != 0) {
                    if (i11 == 1) {
                        ba0.g.M(obj);
                        return obj;
                    }
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ba0.g.M(obj);
                a0 a0Var = new a0(this.l.f17951a.getData(), 11);
                this.f17943k = 1;
                Object objR = y80.r.r(a0Var, this);
                return objR == aVar ? aVar : objR;
            case 1:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f17943k;
                if (i12 != 0) {
                    if (i12 == 1) {
                        ba0.g.M(obj);
                        return obj;
                    }
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ba0.g.M(obj);
                a0 a0Var2 = new a0(this.l.f17951a.getData(), 12);
                this.f17943k = 1;
                Object objR2 = y80.r.r(a0Var2, this);
                return objR2 == aVar2 ? aVar2 : objR2;
            case 2:
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                int i13 = this.f17943k;
                if (i13 != 0) {
                    if (i13 == 1) {
                        ba0.g.M(obj);
                        return obj;
                    }
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ba0.g.M(obj);
                o oVar = this.l;
                oVar.f17955e = null;
                oVar.f17956f = null;
                oVar.f17957g = null;
                d8.f fVar = oVar.f17951a;
                bm.o oVar2 = new bm.o(2, null, 10);
                this.f17943k = 1;
                Object objR3 = xz.b.r(fVar, oVar2, this);
                return objR3 == aVar3 ? aVar3 : objR3;
            default:
                y70.a aVar4 = y70.a.COROUTINE_SUSPENDED;
                int i14 = this.f17943k;
                if (i14 != 0) {
                    if (i14 == 1) {
                        ba0.g.M(obj);
                        return obj;
                    }
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ba0.g.M(obj);
                a0 a0Var3 = new a0(this.l.f17951a.getData(), 13);
                this.f17943k = 1;
                Object objR4 = y80.r.r(a0Var3, this);
                return objR4 == aVar4 ? aVar4 : objR4;
        }
    }
}
