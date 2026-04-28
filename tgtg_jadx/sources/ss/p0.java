package ss;

import ao.r3;
import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class p0 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f39226j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f39227k;
    public final /* synthetic */ w0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(int i11, w0 w0Var, x70.c cVar) {
        super(2, cVar);
        this.f39226j = i11;
        this.l = w0Var;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f39226j) {
            case 0:
                return new p0(0, this.l, cVar);
            default:
                return new p0(1, this.l, cVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v80.b0 b0Var = (v80.b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f39226j) {
        }
        return ((p0) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f39226j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f39227k;
                if (i11 != 0) {
                    if (i11 == 1) {
                        ba0.g.M(obj);
                        return obj;
                    }
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ba0.g.M(obj);
                r3 r3Var = this.l.f39261a;
                this.f39227k = 1;
                Object objB = r3Var.b(this);
                return objB == aVar ? aVar : objB;
            default:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f39227k;
                if (i12 != 0) {
                    if (i12 == 1) {
                        ba0.g.M(obj);
                        return obj;
                    }
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ba0.g.M(obj);
                r3 r3Var2 = this.l.f39261a;
                this.f39227k = 1;
                Object objC = r3Var2.c(this);
                return objC == aVar2 ? aVar2 : objC;
        }
    }
}
