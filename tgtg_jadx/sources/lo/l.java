package lo;

import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;
import y80.a2;
import y80.m1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class l extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f27978j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f27979k;
    public final /* synthetic */ m l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(m mVar, x70.c cVar, int i11) {
        super(2, cVar);
        this.f27978j = i11;
        this.l = mVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f27978j) {
            case 0:
                return new l(this.l, cVar, 0);
            case 1:
                return new l(this.l, cVar, 1);
            case 2:
                return new l(this.l, cVar, 2);
            default:
                return new l(this.l, cVar, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f27978j) {
        }
        return ((l) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f27978j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f27979k;
                if (i11 != 0) {
                    if (i11 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    a2 a2Var = this.l.f27999u;
                    Boolean bool = Boolean.FALSE;
                    this.f27979k = 1;
                    a2Var.getClass();
                    a2Var.k(null, bool);
                    if (Unit.f26487a == aVar) {
                    }
                }
                break;
            case 1:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f27979k;
                if (i12 != 0) {
                    if (i12 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    m1 m1Var = this.l.f27991m;
                    IllegalStateException illegalStateException = new IllegalStateException("Error opening chat");
                    this.f27979k = 1;
                    if (m1Var.emit(illegalStateException, this) == aVar2) {
                    }
                }
                break;
            case 2:
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                int i13 = this.f27979k;
                if (i13 != 0) {
                    if (i13 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    a2 a2Var2 = this.l.f27997s;
                    Boolean bool2 = Boolean.FALSE;
                    this.f27979k = 1;
                    a2Var2.getClass();
                    a2Var2.k(null, bool2);
                    if (Unit.f26487a == aVar3) {
                    }
                }
                break;
            default:
                y70.a aVar4 = y70.a.COROUTINE_SUSPENDED;
                int i14 = this.f27979k;
                if (i14 != 0) {
                    if (i14 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    a2 a2Var3 = this.l.f27999u;
                    Boolean bool3 = Boolean.TRUE;
                    this.f27979k = 1;
                    a2Var3.getClass();
                    a2Var3.k(null, bool3);
                    if (Unit.f26487a == aVar4) {
                    }
                }
                break;
        }
        return Unit.f26487a;
    }
}
