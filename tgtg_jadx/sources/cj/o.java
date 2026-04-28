package cj;

import androidx.lifecycle.c1;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.braze.h2;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ui.m3;
import v80.j2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class o extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f8300j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f8301k;
    public final /* synthetic */ q l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f8302m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(q qVar, String str, x70.c cVar, int i11) {
        super(2, cVar);
        this.f8300j = i11;
        this.l = qVar;
        this.f8302m = str;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f8300j) {
            case 0:
                return new o(this.l, this.f8302m, cVar, 0);
            default:
                return new o(this.l, this.f8302m, cVar, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v80.b0 b0Var = (v80.b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f8300j) {
        }
        return ((o) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objN;
        int i11 = this.f8300j;
        String str = this.f8302m;
        q qVar = this.l;
        x70.c cVar = null;
        switch (i11) {
            case 0:
                c1 c1Var = qVar.f8331a;
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f8301k;
                if (i12 == 0) {
                    ba0.g.M(obj);
                    m3 m3Var = qVar.f8337d;
                    this.f8301k = 1;
                    objN = m3Var.n(str, this);
                    if (objN == aVar) {
                        return aVar;
                    }
                } else {
                    if (i12 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ba0.g.M(obj);
                    objN = ((u70.q) obj).f40851a;
                }
                u70.o oVar = u70.q.f40850b;
                if (!(objN instanceof u70.p)) {
                    c1Var.d((BasicItem) objN, "ITEM");
                    c1Var.d(qVar.f(), "ITEM");
                }
                Throwable thA = u70.q.a(objN);
                if (thA != null) {
                    qVar.l().i(new Pair(thA, Boolean.FALSE));
                }
                return new u70.q(objN);
            default:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i13 = this.f8301k;
                try {
                    if (i13 == 0) {
                        ba0.g.M(obj);
                        o oVar2 = new o(qVar, str, cVar, 0);
                        this.f8301k = 1;
                        obj = j2.b(30000L, oVar2, this);
                        if (obj == aVar2) {
                            obj = aVar2;
                        }
                    } else {
                        if (i13 != 1) {
                            h2.b("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ba0.g.M(obj);
                    }
                    return obj;
                } catch (Exception e5) {
                    qVar.l().i(new Pair(e5, Boolean.FALSE));
                    return Unit.f26487a;
                }
        }
    }
}
