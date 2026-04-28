package ap;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.m1;
import bp.v;
import ep.d0;
import g9.f0;
import g9.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import m3.b1;
import m3.c3;
import m3.h1;
import o00.x0;
import v80.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class k extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f4543j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ b1 f4544k;
    public final /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b1 f4545m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f4546n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f4547o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f4548p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f4549q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ArrayList arrayList, h1 h1Var, f0 f0Var, b1 b1Var, n nVar, Activity activity, b1 b1Var2, x70.c cVar) {
        super(2, cVar);
        this.f4546n = arrayList;
        this.f4547o = h1Var;
        this.f4548p = f0Var;
        this.f4544k = b1Var;
        this.l = nVar;
        this.f4549q = activity;
        this.f4545m = b1Var2;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f4543j) {
            case 0:
                return new k((ArrayList) this.f4546n, (h1) this.f4547o, (f0) this.f4548p, this.f4544k, (n) this.l, (Activity) this.f4549q, this.f4545m, cVar);
            case 1:
                return new k(this.f4544k, (n) this.l, this.f4545m, (v) this.f4546n, (b1) this.f4547o, (List) this.f4548p, (c3) this.f4549q, cVar);
            default:
                return new k((k8.d) this.f4546n, (f0) this.f4548p, (d0) this.f4547o, (Context) this.l, (c3) this.f4549q, this.f4544k, this.f4545m, cVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f4543j) {
        }
        return ((k) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f4543j;
        Object[] objArr = 0;
        b1 b1Var = this.f4544k;
        b1 b1Var2 = this.f4545m;
        Object obj2 = this.f4549q;
        Object obj3 = this.l;
        Object obj4 = this.f4547o;
        Object obj5 = this.f4548p;
        Object obj6 = this.f4546n;
        switch (i11) {
            case 0:
                f0 f0Var = (f0) obj5;
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                ArrayList arrayList = (ArrayList) obj6;
                h1 h1Var = (h1) obj4;
                if (((Number) b1Var.getValue()).intValue() >= arrayList.size()) {
                    n nVar = (n) obj3;
                    x0.i(nVar, (Activity) obj2);
                    h1Var.i(arrayList.size());
                    b1Var2.setValue(Boolean.TRUE);
                    v80.f0.B(m1.d(nVar), null, null, new defpackage.k(nVar, objArr == true ? 1 : 0, 1), 3);
                    p.e(f0Var, bp.m.INSTANCE);
                } else if (h1Var.h() < ((Number) b1Var.getValue()).intValue()) {
                    p.e(f0Var, arrayList.get(((Number) b1Var.getValue()).intValue()));
                } else {
                    f0Var.g();
                }
                h1Var.i(((Number) b1Var.getValue()).intValue());
                break;
            case 1:
                v vVar = (v) obj6;
                n nVar2 = (n) obj3;
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                if (((Boolean) b1Var.getValue()).booleanValue()) {
                    nVar2.h((List) b1Var2.getValue(), (((List) b1Var2.getValue()).contains(CollectionsKt.W((List) obj5)) || nVar2.j()) ? (String) ((b1) obj4).getValue() : null, vVar);
                    nVar2.k(nx.d.t(zz.f.j((c3) obj2), vVar));
                }
                break;
            default:
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                k8.d dVar = (k8.d) obj6;
                ep.h hVar = new ep.h((f0) obj5, (d0) obj4, (Context) obj3, (c3) obj2, this.f4544k, this.f4545m, 1);
                dVar.getClass();
                dVar.f26134b = hVar;
                break;
        }
        return Unit.f26487a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(k8.d dVar, f0 f0Var, d0 d0Var, Context context, c3 c3Var, b1 b1Var, b1 b1Var2, x70.c cVar) {
        super(2, cVar);
        this.f4546n = dVar;
        this.f4548p = f0Var;
        this.f4547o = d0Var;
        this.l = context;
        this.f4549q = c3Var;
        this.f4544k = b1Var;
        this.f4545m = b1Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(b1 b1Var, n nVar, b1 b1Var2, v vVar, b1 b1Var3, List list, c3 c3Var, x70.c cVar) {
        super(2, cVar);
        this.f4544k = b1Var;
        this.l = nVar;
        this.f4545m = b1Var2;
        this.f4546n = vVar;
        this.f4547o = b1Var3;
        this.f4548p = list;
        this.f4549q = c3Var;
    }
}
