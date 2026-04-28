package k3;

import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f25853j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f25854k;
    public final /* synthetic */ s l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(s sVar, x70.c cVar, int i11) {
        super(2, cVar);
        this.f25853j = i11;
        this.l = sVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f25853j) {
            case 0:
                return new p(this.l, cVar, 0);
            case 1:
                return new p(this.l, cVar, 1);
            default:
                return new p(this.l, cVar, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f25853j) {
        }
        return ((p) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f25853j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f25854k;
                if (i11 != 0) {
                    if (i11 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    s sVar = this.l;
                    t tVar = sVar.f25863t;
                    float f11 = sVar.f25860q ? 1.0f : 0.0f;
                    this.f25854k = 1;
                    Object objF = tVar.f25869a.f(new Float(f11), this);
                    if (objF != aVar) {
                        objF = Unit.f26487a;
                    }
                    if (objF == aVar) {
                    }
                }
                break;
            case 1:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f25854k;
                if (i12 != 0) {
                    if (i12 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    s sVar2 = this.l;
                    if (!sVar2.f25863t.f25869a.e()) {
                        t tVar2 = sVar2.f25863t;
                        float fH = sVar2.f25866w.h() / sVar2.R0();
                        this.f25854k = 1;
                        Object objF2 = tVar2.f25869a.f(new Float(fH), this);
                        if (objF2 != aVar2) {
                            objF2 = Unit.f26487a;
                        }
                        if (objF2 == aVar2) {
                        }
                    }
                }
                break;
            default:
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                int i13 = this.f25854k;
                if (i13 != 0) {
                    if (i13 == 1 || i13 == 2) {
                        ba0.g.M(obj);
                    } else {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    s sVar3 = this.l;
                    if (sVar3.f25860q) {
                        this.f25854k = 2;
                        if (s.O0(sVar3, this) == aVar3) {
                        }
                    } else {
                        this.f25854k = 1;
                        if (sVar3.P0(this) == aVar3) {
                        }
                    }
                }
                break;
        }
        return Unit.f26487a;
    }
}
