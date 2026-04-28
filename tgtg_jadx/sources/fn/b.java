package fn;

import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f17792j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f17793k;
    public final /* synthetic */ c l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, x70.c cVar2, int i11) {
        super(2, cVar2);
        this.f17792j = i11;
        this.l = cVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f17792j) {
            case 0:
                return new b(this.l, cVar, 0);
            default:
                return new b(this.l, cVar, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f17792j) {
        }
        return ((b) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f17792j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f17793k;
                if (i11 != 0) {
                    if (i11 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                        ((u70.q) obj).getClass();
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    gm.b bVar = this.l.f17802i;
                    this.f17793k = 1;
                    if (bVar.a(this) == aVar) {
                    }
                }
                break;
            default:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f17793k;
                if (i12 != 0) {
                    if (i12 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    d8.f fVar = this.l.f17805m;
                    bm.o oVar = new bm.o(2, null, 9);
                    this.f17793k = 1;
                    if (xz.b.r(fVar, oVar, this) == aVar2) {
                    }
                }
                break;
        }
        return Unit.f26487a;
    }
}
