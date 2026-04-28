package x2;

import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class z extends z70.i implements Function1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f43814j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f43815k;
    public final /* synthetic */ w l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(w wVar, x70.c cVar, int i11) {
        super(1, cVar);
        this.f43814j = i11;
        this.l = wVar;
    }

    @Override // z70.a
    public final x70.c create(x70.c cVar) {
        switch (this.f43814j) {
            case 0:
                return new z(this.l, cVar, 0);
            case 1:
                return new z(this.l, cVar, 1);
            default:
                return new z(this.l, cVar, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        x70.c cVar = (x70.c) obj;
        switch (this.f43814j) {
        }
        return ((z) create(cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f43814j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f43815k;
                if (i11 != 0) {
                    if (i11 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    this.f43815k = 1;
                    if (this.l.f(this) == aVar) {
                    }
                }
                break;
            case 1:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f43815k;
                if (i12 != 0) {
                    if (i12 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    w wVar = this.l;
                    boolean zBooleanValue = ((Boolean) wVar.f43799t.getValue()).booleanValue();
                    this.f43815k = 1;
                    if (wVar.e(zBooleanValue, this) == aVar2) {
                    }
                }
                break;
            default:
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                int i13 = this.f43815k;
                if (i13 != 0) {
                    if (i13 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    this.f43815k = 1;
                    if (this.l.s(this) == aVar3) {
                    }
                }
                break;
        }
        return Unit.f26487a;
    }
}
