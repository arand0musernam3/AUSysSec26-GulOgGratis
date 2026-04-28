package w;

import android.util.Log;
import b0.e3;
import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f42692j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f42693k;
    public final /* synthetic */ j l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(j jVar, x70.c cVar, int i11) {
        super(2, cVar);
        this.f42692j = i11;
        this.l = jVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f42692j) {
            case 0:
                return new i(this.l, cVar, 0);
            default:
                return new i(this.l, cVar, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v80.b0 b0Var = (v80.b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f42692j) {
        }
        return ((i) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f42692j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f42693k;
                if (i11 == 0) {
                    ba0.g.M(obj);
                    o oVar = this.l.f42701e;
                    m0.e eVar = new m0.e(8);
                    synchronized (oVar.f42728a) {
                        try {
                            if (!oVar.f42734g) {
                                if (wd.a.B(3, "CXCP")) {
                                    Log.d("CXCP", "Camera is removed, forcing state to CLOSED.");
                                }
                                oVar.f42734g = true;
                                s0.h0 h0Var = s0.h0.CLOSED;
                                oVar.f42732e = h0Var;
                                oVar.f42733f = eVar;
                                oVar.c(h0Var, eVar);
                                oVar.f42731d = null;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                    e3 e3Var = this.l.f42697a;
                    this.f42693k = 1;
                    if (e3Var.d(this) == aVar) {
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
            default:
                j jVar = this.l;
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f42693k;
                if (i12 == 0) {
                    ba0.g.M(obj);
                    e3 e3Var2 = jVar.f42697a;
                    this.f42693k = 1;
                    if (e3Var2.d(this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ba0.g.M(obj);
                }
                v80.f0.j(jVar.f42700d.f5265a, null);
                return Unit.f26487a;
        }
    }
}
