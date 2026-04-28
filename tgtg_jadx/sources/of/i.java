package of;

import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f32492j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f32493k;
    public final /* synthetic */ l l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p f32494m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ double f32495n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(l lVar, p pVar, double d3, x70.c cVar, int i11) {
        super(2, cVar);
        this.f32492j = i11;
        this.l = lVar;
        this.f32494m = pVar;
        this.f32495n = d3;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f32492j) {
            case 0:
                return new i(this.l, this.f32494m, this.f32495n, cVar, 0);
            default:
                return new i(this.l, this.f32494m, this.f32495n, cVar, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f32492j) {
        }
        return ((i) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f32492j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f32493k;
                if (i11 != 0) {
                    if (i11 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    this.f32493k = 1;
                    if (l.d(this.l, this.f32494m, this.f32495n) == aVar) {
                    }
                }
                break;
            default:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f32493k;
                if (i12 != 0) {
                    if (i12 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    this.f32493k = 1;
                    if (l.d(this.l, this.f32494m, this.f32495n) == aVar2) {
                    }
                }
                break;
        }
        return Unit.f26487a;
    }
}
