package f50;

import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;
import y80.r;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f17360j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f17361k;
    public final /* synthetic */ o l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(o oVar, x70.c cVar, int i11) {
        super(2, cVar);
        this.f17360j = i11;
        this.l = oVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f17360j) {
            case 0:
                return new m(this.l, cVar, 0);
            default:
                return new m(this.l, cVar, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f17360j) {
        }
        return ((m) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f17360j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f17361k;
                if (i11 == 0) {
                    ba0.g.M(obj);
                    o oVar = this.l;
                    y80.i data = oVar.f17366c.getData();
                    l lVar = new l(oVar.f17367d);
                    this.f17361k = 1;
                    if (data.collect(lVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ba0.g.M(obj);
                }
                return Unit.f26487a;
            default:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f17361k;
                if (i12 != 0) {
                    if (i12 == 1) {
                        ba0.g.M(obj);
                        return obj;
                    }
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ba0.g.M(obj);
                y80.i data2 = this.l.f17366c.getData();
                this.f17361k = 1;
                Object objQ = r.q(data2, this);
                return objQ == aVar2 ? aVar2 : objQ;
        }
    }
}
