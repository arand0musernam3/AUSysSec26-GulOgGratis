package f0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f16772j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f16773k;
    public final /* synthetic */ p0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(p0 p0Var, x70.c cVar, int i11) {
        super(2, cVar);
        this.f16772j = i11;
        this.l = p0Var;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f16772j) {
            case 0:
                return new m0(this.l, cVar, 0);
            case 1:
                return new m0(this.l, cVar, 1);
            default:
                return new m0(this.l, cVar, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v80.b0 b0Var = (v80.b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f16772j) {
        }
        return ((m0) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [T, f0.s2] */
    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        f4 f4Var;
        ?? r42;
        Object objCollect;
        switch (this.f16772j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f16773k;
                if (i11 == 0) {
                    ba0.g.M(obj);
                    p0 p0Var = this.l;
                    y80.h1 h1Var = p0Var.f16820g.f16932g;
                    l0 l0Var = new l0(p0Var, 0);
                    this.f16773k = 1;
                    if (h1Var.f45488a.collect(l0Var, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ba0.g.M(obj);
                }
                qc.y.m();
                return null;
            case 1:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f16773k;
                if (i12 == 0) {
                    ba0.g.M(obj);
                    p0 p0Var2 = this.l;
                    y80.g1 g1Var = p0Var2.f16820g.f16934i;
                    l0 l0Var2 = new l0(p0Var2, 1);
                    this.f16773k = 1;
                    if (g1Var.f45482a.collect(l0Var2, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ba0.g.M(obj);
                }
                qc.y.m();
                return null;
            default:
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                int i13 = this.f16773k;
                if (i13 == 0) {
                    ba0.g.M(obj);
                    p0 p0Var3 = this.l;
                    this.f16773k = 1;
                    Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    synchronized (p0Var3.f16829q) {
                        f4Var = p0Var3.f16837y;
                        r42 = p0Var3.f16838z;
                        objectRef.element = r42;
                    }
                    if (f4Var == null || r42 == 0 || (objCollect = f4Var.f16667i.collect(new o0(objectRef, p0Var3), this)) != aVar3) {
                        objCollect = Unit.f26487a;
                    }
                    if (objCollect == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i13 != 1) {
                        com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ba0.g.M(obj);
                }
                return Unit.f26487a;
        }
    }
}
