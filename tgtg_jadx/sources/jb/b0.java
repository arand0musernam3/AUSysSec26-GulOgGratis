package jb;

import androidx.work.impl.WorkerStoppedException;
import com.braze.h2;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.f0;
import v80.j1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f24852j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f24853k;
    public final /* synthetic */ d0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(d0 d0Var, x70.c cVar, int i11) {
        super(2, cVar);
        this.f24852j = i11;
        this.l = d0Var;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f24852j) {
            case 0:
                return new b0(this.l, cVar, 0);
            default:
                return new b0(this.l, cVar, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v80.b0 b0Var = (v80.b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f24852j) {
        }
        return ((b0) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object xVar;
        switch (this.f24852j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f24853k;
                if (i11 == 0) {
                    ba0.g.M(obj);
                    this.f24853k = 1;
                    Object objA = d0.a(this.l, this);
                    return objA == aVar ? aVar : objA;
                }
                if (i11 == 1) {
                    ba0.g.M(obj);
                    return obj;
                }
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f24853k;
                d0 d0Var = this.l;
                try {
                    if (i12 == 0) {
                        ba0.g.M(obj);
                        j1 j1Var = d0Var.f24877m;
                        b0 b0Var = new b0(d0Var, null, 0);
                        this.f24853k = 1;
                        obj = f0.K(j1Var, b0Var, this);
                        if (obj == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i12 != 1) {
                            h2.b("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ba0.g.M(obj);
                    }
                    xVar = (a0) obj;
                    break;
                } catch (WorkerStoppedException e5) {
                    xVar = new z(e5.f4158a);
                } catch (CancellationException unused) {
                    xVar = new x();
                } catch (Throwable th2) {
                    ib.w.d().c(e0.f24882a, "Unexpected error in WorkerWrapper", th2);
                    xVar = new x();
                }
                Object objP = d0Var.f24873h.p(new y.a(new com.google.firebase.messaging.g(4, xVar, d0Var), 6));
                objP.getClass();
                return objP;
        }
    }
}
