package pc;

import com.braze.h2;
import ed.o;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;
import z70.i;
import zc.k;
import zc.l;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f34644j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f34645k;
    public final /* synthetic */ h l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ k f34646m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(h hVar, k kVar, x70.c cVar, int i11) {
        super(2, cVar);
        this.f34644j = i11;
        this.l = hVar;
        this.f34646m = kVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f34644j) {
            case 0:
                return new e(this.l, this.f34646m, cVar, 0);
            case 1:
                return new e(this.l, this.f34646m, cVar, 1);
            default:
                return new e(this.l, this.f34646m, cVar, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f34644j) {
        }
        return ((e) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        o oVar;
        switch (this.f34644j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f34645k;
                h hVar = this.l;
                if (i11 == 0) {
                    ba0.g.M(obj);
                    this.f34645k = 1;
                    obj = h.a(hVar, this.f34646m, 0, this);
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
                l lVar = (l) obj;
                if ((lVar instanceof zc.f) && (oVar = hVar.f34659e) != null) {
                    Throwable th2 = ((zc.f) lVar).f47438c;
                    if (oVar.getLevel() <= 6) {
                        oVar.log("RealImageLoader", 6, null, th2);
                    }
                }
                return obj;
            case 1:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f34645k;
                if (i12 == 0) {
                    ba0.g.M(obj);
                    this.f34645k = 1;
                    Object objA = h.a(this.l, this.f34646m, 1, this);
                    return objA == aVar2 ? aVar2 : objA;
                }
                if (i12 == 1) {
                    ba0.g.M(obj);
                    return obj;
                }
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                int i13 = this.f34645k;
                if (i13 == 0) {
                    ba0.g.M(obj);
                    this.f34645k = 1;
                    Object objA2 = h.a(this.l, this.f34646m, 1, this);
                    return objA2 == aVar3 ? aVar3 : objA2;
                }
                if (i13 == 1) {
                    ba0.g.M(obj);
                    return obj;
                }
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
