package d8;

import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f14647j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f14648k;
    public final /* synthetic */ y l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(y yVar, x70.c cVar, int i11) {
        super(2, cVar);
        this.f14647j = i11;
        this.l = yVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f14647j) {
            case 0:
                return new l(this.l, cVar, 0);
            case 1:
                return new l(this.l, cVar, 1);
            default:
                return new l(this.l, cVar, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f14647j) {
        }
        return ((l) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f14647j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f14648k;
                if (i11 == 0) {
                    ba0.g.M(obj);
                    this.f14648k = 1;
                    if (y.d(this.l, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ba0.g.M(obj);
                }
                return Unit.f26487a;
            case 1:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f14648k;
                y yVar = this.l;
                if (i12 == 0) {
                    ba0.g.M(obj);
                    com.google.firebase.messaging.a0 a0Var = yVar.f14743i;
                    this.f14648k = 1;
                    Object objM = ((v80.q) a0Var.f12780c).m(this);
                    if (objM != aVar2) {
                        objM = Unit.f26487a;
                    }
                    if (objM == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        if (i12 == 2) {
                            ba0.g.M(obj);
                            return Unit.f26487a;
                        }
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ba0.g.M(obj);
                }
                y80.i iVarE = y80.r.e(yVar.h().e(), -1);
                androidx.lifecycle.m mVar = new androidx.lifecycle.m(yVar, 5);
                this.f14648k = 2;
                if (iVarE.collect(mVar, this) == aVar2) {
                    return aVar2;
                }
                return Unit.f26487a;
            default:
                y yVar2 = this.l;
                z zVar = yVar2.f14742h;
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                int i13 = this.f14648k;
                try {
                    if (i13 == 0) {
                        ba0.g.M(obj);
                        if (zVar.b() instanceof i0) {
                            return zVar.b();
                        }
                        this.f14648k = 1;
                        if (y.e(yVar2, this) == aVar3) {
                            return aVar3;
                        }
                    } else {
                        if (i13 != 1) {
                            if (i13 == 2) {
                                ba0.g.M(obj);
                                return (e1) obj;
                            }
                            h2.b("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ba0.g.M(obj);
                    }
                    this.f14648k = 2;
                    obj = y.f(yVar2, false, this);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                    return (e1) obj;
                } catch (Throwable th2) {
                    return new v0(-1, th2);
                }
        }
    }
}
