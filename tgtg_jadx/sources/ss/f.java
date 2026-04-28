package ss;

import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f39169j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f39170k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ w f39171m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i11, w wVar, x70.c cVar) {
        super(2, cVar);
        this.f39169j = i11;
        this.f39171m = wVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f39169j) {
            case 0:
                f fVar = new f(0, this.f39171m, cVar);
                fVar.l = obj;
                return fVar;
            default:
                f fVar2 = new f(1, this.f39171m, cVar);
                fVar2.l = obj;
                return fVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        y80.j jVar = (y80.j) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f39169j) {
        }
        return ((f) create(jVar, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f39169j) {
            case 0:
                y80.j jVar = (y80.j) this.l;
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f39170k;
                if (i11 != 0) {
                    if (i11 == 1 || i11 == 2) {
                        ba0.g.M(obj);
                    } else {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    e1 e1Var = (e1) this.f39171m.f39260h.getValue();
                    if (e1Var instanceof d1) {
                        d1 d1VarA = d1.a((d1) e1Var, false, null, null, 0, 983);
                        this.l = null;
                        this.f39170k = 1;
                        if (jVar.emit(d1VarA, this) == aVar) {
                        }
                    } else {
                        this.l = null;
                        this.f39170k = 2;
                        if (jVar.emit(e1Var, this) == aVar) {
                        }
                    }
                }
                break;
            default:
                y80.j jVar2 = (y80.j) this.l;
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f39170k;
                if (i12 != 0) {
                    if (i12 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    this.l = null;
                    this.f39170k = 1;
                    if (jVar2.emit(z0.f39277a, this) == aVar2) {
                    }
                }
                this.f39171m.f39256d.i(new ts.t(3));
                break;
        }
        return Unit.f26487a;
    }
}
