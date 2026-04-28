package aa;

import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1132j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1133k;
    public final /* synthetic */ v80.q l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(v80.q qVar, x70.c cVar, int i11) {
        super(2, cVar);
        this.f1132j = i11;
        this.l = qVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f1132j) {
            case 0:
                return new k0(this.l, cVar, 0);
            default:
                return new k0(this.l, cVar, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v80.b0 b0Var = (v80.b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f1132j) {
        }
        return ((k0) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f1132j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f1133k;
                if (i11 == 0) {
                    ba0.g.M(obj);
                    this.f1133k = 1;
                    Object objM = this.l.m(this);
                    return objM == aVar ? aVar : objM;
                }
                if (i11 == 1) {
                    ba0.g.M(obj);
                    return obj;
                }
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f1133k;
                if (i12 == 0) {
                    ba0.g.M(obj);
                    this.f1133k = 1;
                    if (this.l.m(this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ba0.g.M(obj);
                }
                return Unit.f26487a;
        }
    }
}
