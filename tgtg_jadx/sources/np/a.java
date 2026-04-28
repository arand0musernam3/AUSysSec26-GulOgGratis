package np;

import androidx.lifecycle.m1;
import ba0.g;
import com.app.tgtg.model.local.AppConstants;
import com.app.tgtg.model.remote.item.LatLngInfo;
import com.braze.h2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.w0;
import kotlin.jvm.functions.Function2;
import m5.d0;
import op.l;
import op.m;
import sp.f;
import u70.o;
import u70.p;
import u70.q;
import v80.b0;
import v80.f0;
import y80.a2;
import y80.h;
import y80.h1;
import y80.r;
import z70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f31312j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f31313k;
    public final /* synthetic */ b l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b bVar, x70.c cVar, int i11) {
        super(2, cVar);
        this.f31312j = i11;
        this.l = bVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f31312j) {
            case 0:
                return new a(this.l, cVar, 0);
            case 1:
                return new a(this.l, cVar, 1);
            case 2:
                return new a(this.l, cVar, 2);
            default:
                return new a(this.l, cVar, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f31312j) {
        }
        return ((a) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object objB;
        Object objE;
        int i11 = this.f31312j;
        int i12 = 10;
        b bVar = this.l;
        x70.c cVar = null;
        switch (i11) {
            case 0:
                a2 a2Var = bVar.f31316c;
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i13 = this.f31313k;
                if (i13 == 0) {
                    g.M(obj);
                    f fVar = bVar.f31314a;
                    this.f31313k = 1;
                    objA = fVar.a(this);
                    if (objA == aVar) {
                    }
                } else if (i13 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                } else {
                    g.M(obj);
                    objA = ((q) obj).f40851a;
                }
                o oVar = q.f40850b;
                if (!(objA instanceof p)) {
                    List list = ((qp.c) objA).f37223a;
                    if (list.size() == 1) {
                        a2Var.j(m.STATION);
                        op.c cVar2 = (op.c) list.get(0);
                        cVar2.getClass();
                        f0.B(m1.d(bVar), null, null, new mn.g(bVar, cVar2, cVar, i12), 3);
                    } else {
                        a2Var.j(m.LINE);
                        bVar.f31320g.j(list);
                    }
                }
                if (q.a(objA) != null) {
                    b.a(bVar);
                }
                break;
            case 1:
                a2 a2Var2 = bVar.f31325m;
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i14 = this.f31313k;
                if (i14 == 0) {
                    g.M(obj);
                    f fVar2 = bVar.f31314a;
                    this.f31313k = 1;
                    objB = fVar2.b(this);
                    if (objB == aVar2) {
                    }
                } else if (i14 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                } else {
                    g.M(obj);
                    objB = ((q) obj).f40851a;
                }
                o oVar2 = q.f40850b;
                if (!(objB instanceof p)) {
                    a2Var2.j(((qp.i) objB).f37230a);
                    bVar.f31327o.j(a2Var2.getValue());
                }
                break;
            case 2:
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                int i15 = this.f31313k;
                if (i15 == 0) {
                    g.M(obj);
                    h hVarM = r.m(r.k(bVar.f31329q, 300L), new d0(24), r.f45561b);
                    is.h hVar = new is.h(bVar, cVar, 17);
                    this.f31313k = 1;
                    if (r.i(hVarM, hVar, this) == aVar3) {
                    }
                } else if (i15 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                } else {
                    g.M(obj);
                }
                break;
            default:
                a2 a2Var3 = bVar.f31325m;
                a2 a2Var4 = bVar.f31327o;
                y70.a aVar4 = y70.a.COROUTINE_SUSPENDED;
                int i16 = this.f31313k;
                if (i16 == 0) {
                    g.M(obj);
                    Iterable iterable = (Iterable) a2Var4.getValue();
                    ArrayList arrayList = new ArrayList(e0.o(iterable, 10));
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new Long(((l) it.next()).f32909b));
                    }
                    f fVar3 = bVar.f31314a;
                    pp.i iVar = new pp.i();
                    iVar.f35600a = arrayList;
                    this.f31313k = 1;
                    objE = fVar3.e(iVar, this);
                    if (objE == aVar4) {
                    }
                } else if (i16 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                } else {
                    g.M(obj);
                    objE = ((q) obj).f40851a;
                }
                o oVar3 = q.f40850b;
                if (!(objE instanceof p)) {
                    h1 h1Var = bVar.f31326n;
                    a2Var3.j(((qp.i) objE).f37230a);
                    if (ft.c.B() != null && ft.c.t() == jl.b.STATIONS && !CollectionsKt.I((Iterable) h1Var.f45488a.getValue(), ft.c.B())) {
                        ft.c.i0(jl.b.NONE);
                        ft.c.m0(null);
                        ft.c.k0(new LatLngInfo(0.0d, 0.0d));
                        ft.c.g0(AppConstants.LOCATION_PICKER_NO_SELECTED_LOCATION);
                    }
                    a2Var4.j(a2Var3.getValue());
                    cv.b bVar2 = bVar.f31315b;
                    Map mapB = w0.b(new Pair(dv.a.HAS_ADDED_STATION, Boolean.valueOf(!((Collection) h1Var.f45488a.getValue()).isEmpty())));
                    bVar2.getClass();
                    mapB.getClass();
                    bVar2.f13428a.c(mapB);
                }
                if (q.a(objE) != null) {
                    b.a(bVar);
                }
                break;
        }
        return Unit.f26487a;
    }
}
