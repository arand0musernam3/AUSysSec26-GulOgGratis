package wi;

import androidx.lifecycle.Lifecycle;
import cj.e0;
import g4.v;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import mv.m0;
import v80.b0;
import xg.x;
import xg.y;
import zc.t;
import zc.u;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class s extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f43497j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f43498k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(Object obj, x70.c cVar, int i11) {
        super(2, cVar);
        this.f43497j = i11;
        this.f43498k = obj;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f43497j) {
            case 0:
                return new s((e0) this.f43498k, cVar, 0);
            case 1:
                return new s((x) this.f43498k, cVar, 1);
            case 2:
                return new s((u) this.f43498k, cVar, 2);
            default:
                return new s((v) this.f43498k, cVar, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f43497j) {
        }
        return ((s) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f43497j;
        Object obj2 = this.f43498k;
        switch (i11) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                ((e0) obj2).m(cv.i.SCREEN_POSTAL_CODE_VALIDATION);
                break;
            case 1:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                m0 m0Var = sa0.a.f38953a;
                m0Var.h("Authentication");
                m0Var.a("Continue with Email", new Object[0]);
                y yVar = ((x) obj2).f44301a;
                ah.f fVar = ah.f.INSTANCE;
                yVar.getClass();
                fVar.getClass();
                yVar.f44304a.a(new f70.c(fVar));
                break;
            case 2:
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                u uVar = (u) obj2;
                t tVar = uVar.f47525d;
                if (tVar != null) {
                    Lifecycle lifecycle = tVar.f47520d;
                    tVar.f47521e.a(null);
                    bd.a aVar4 = tVar.f47519c;
                    if (aVar4 != null) {
                        lifecycle.d(aVar4);
                    }
                    lifecycle.d(tVar);
                }
                uVar.f47525d = null;
                break;
            default:
                y70.a aVar5 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                v.a((v) obj2);
                break;
        }
        return Unit.f26487a;
    }
}
