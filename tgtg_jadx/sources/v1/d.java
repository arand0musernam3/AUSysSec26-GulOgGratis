package v1;

import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f41706j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f41707k;
    public final /* synthetic */ b2.l l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b2.n f41708m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b2.l lVar, b2.n nVar, x70.c cVar) {
        super(2, cVar);
        this.l = lVar;
        this.f41708m = nVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f41706j) {
            case 0:
                return new d(this.f41708m, this.l, cVar);
            default:
                return new d(this.l, this.f41708m, cVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v80.b0 b0Var = (v80.b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f41706j) {
        }
        return ((d) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f41706j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f41707k;
                if (i11 != 0) {
                    if (i11 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    b2.o oVar = new b2.o(this.f41708m);
                    this.f41707k = 1;
                    if (this.l.b(oVar, this) == aVar) {
                    }
                }
                break;
            default:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f41707k;
                if (i12 != 0) {
                    if (i12 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    this.f41707k = 1;
                    if (this.l.b(this.f41708m, this) == aVar2) {
                    }
                }
                break;
        }
        return Unit.f26487a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b2.n nVar, b2.l lVar, x70.c cVar) {
        super(2, cVar);
        this.f41708m = nVar;
        this.l = lVar;
    }
}
