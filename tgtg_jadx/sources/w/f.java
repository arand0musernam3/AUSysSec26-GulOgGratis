package w;

import android.content.Context;
import com.google.android.gms.internal.measurement.te;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import s0.l1;
import y80.g1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w2.z f42676a = new w2.z(11);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [com.google.android.gms.internal.measurement.te, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v7, types: [kotlin.collections.n0] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.util.ArrayList] */
    public final te a(Context context, s0.f fVar, m0.s sVar, long j9, m0.z zVar, ub.a aVar) {
        ?? arrayList;
        context.getClass();
        u70.t tVarB = u70.l.b(new androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.c(29, this, context, fVar, j9 == -1 ? null : new h0.d(j9)));
        if (zVar == null) {
            zVar = new m0.z(l1.e(new m0.x(0).f28633a));
        }
        context.getClass();
        fVar.getClass();
        m0.z zVar2 = zVar;
        w2.z zVar3 = this.f42676a;
        zVar3.getClass();
        ?? teVar = new te();
        teVar.f11894b = tVarB;
        teVar.f11895c = sVar;
        teVar.f11896d = aVar;
        teVar.f11897e = zVar2;
        teVar.f11898f = new e((e0.b0) tVarB.getValue(), ((e0.b0) tVarB.getValue()).b());
        u70.t tVarB2 = u70.l.b(new androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.c(28, context, fVar, teVar, zVar3));
        teVar.f11900h = tVarB2;
        teVar.f11893a = kotlin.collections.p0.f26531a;
        teVar.f11901i = new Object();
        teVar.f11902j = new AtomicBoolean(false);
        ArrayList arrayListA = j0.b.a(((a0.a) tVarB2.getValue()).a());
        if (arrayListA != null) {
            arrayList = new ArrayList(kotlin.collections.e0.o(arrayListA, 10));
            Iterator it = arrayListA.iterator();
            while (it.hasNext()) {
                arrayList.add(((e0.s) it.next()).f15403a);
            }
        } else {
            arrayList = kotlin.collections.n0.f26529a;
        }
        g1 g1Var = ((f0.g0) ((e0.b0) ((u70.t) teVar.f11894b).getValue()).b().d()).f16675b.f16593k;
        Executor executor = fVar.f38326a;
        executor.getClass();
        teVar.f11899g = new j0(g1Var, v80.f0.b(v80.f0.q(executor)), arrayList, context);
        teVar.j(arrayList);
        return teVar;
    }
}
