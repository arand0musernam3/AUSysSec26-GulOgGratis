package fd;

import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f17585j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f17586k;
    public final /* synthetic */ t l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ td.i f17587m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(t tVar, td.i iVar, x70.c cVar, int i11) {
        super(2, cVar);
        this.f17585j = i11;
        this.l = tVar;
        this.f17587m = iVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f17585j) {
            case 0:
                return new r(this.l, this.f17587m, cVar, 0);
            default:
                return new r(this.l, this.f17587m, cVar, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f17585j) {
        }
        return ((r) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f17585j;
        td.i iVar = this.f17587m;
        t tVar = this.l;
        switch (i11) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f17586k;
                if (i12 != 0) {
                    if (i12 == 1) {
                        ba0.g.M(obj);
                        return obj;
                    }
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ba0.g.M(obj);
                this.f17586k = 1;
                int i13 = t.f17594f;
                Object objB = tVar.b(iVar, 0, this);
                return objB == aVar ? aVar : objB;
            default:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i14 = this.f17586k;
                if (i14 != 0) {
                    if (i14 == 1) {
                        ba0.g.M(obj);
                        return obj;
                    }
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ba0.g.M(obj);
                this.f17586k = 1;
                int i15 = t.f17594f;
                Object objB2 = tVar.b(iVar, 1, this);
                return objB2 == aVar2 ? aVar2 : objB2;
        }
    }
}
