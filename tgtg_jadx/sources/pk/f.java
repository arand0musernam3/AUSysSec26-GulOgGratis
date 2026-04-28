package pk;

import bm.o;
import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import mn.j;
import v80.b0;
import y80.r;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f35451j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f35452k;
    public final /* synthetic */ i l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(i iVar, x70.c cVar, int i11) {
        super(2, cVar);
        this.f35451j = i11;
        this.l = iVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f35451j) {
            case 0:
                return new f(this.l, cVar, 0);
            default:
                return new f(this.l, cVar, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f35451j) {
        }
        return ((f) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f35451j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f35452k;
                if (i11 == 0) {
                    ba0.g.M(obj);
                    j jVar = new j(this.l.f35470f.getData(), 4);
                    this.f35452k = 1;
                    obj = r.r(jVar, this);
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
            default:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f35452k;
                if (i12 == 0) {
                    ba0.g.M(obj);
                    d8.f fVar = this.l.f35470f;
                    o oVar = new o(2, null, 27);
                    this.f35452k = 1;
                    if (xz.b.r(fVar, oVar, this) == aVar2) {
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
