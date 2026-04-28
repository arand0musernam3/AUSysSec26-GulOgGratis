package c50;

import android.util.Log;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d1 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f7514j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f7515k;
    public final /* synthetic */ f1 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d1(f1 f1Var, x70.c cVar, int i11) {
        super(2, cVar);
        this.f7514j = i11;
        this.l = f1Var;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f7514j) {
            case 0:
                d1 d1Var = new d1(this.l, cVar, 0);
                d1Var.f7515k = obj;
                return d1Var;
            default:
                d1 d1Var2 = new d1(this.l, cVar, 1);
                d1Var2.f7515k = obj;
                return d1Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        l0 l0Var = (l0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f7514j) {
        }
        return ((d1) create(l0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        boolean z11;
        int i11 = this.f7514j;
        f1 f1Var = this.l;
        switch (i11) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                l0 l0Var = (l0) this.f7515k;
                f1Var.f7536d.getClass();
                return l0.a(l0Var, null, k1.a(), null, 5);
            default:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                l0 l0Var2 = (l0) this.f7515k;
                g0 g0Var = f1Var.f7538f;
                boolean zE = f1Var.e(l0Var2);
                Map mapB = l0Var2.f7601c;
                if (mapB != null) {
                    g0Var.getClass();
                    z11 = false;
                    if (!g0Var.f7553f) {
                        ArrayList<h0> arrayListA = i0.a(g0Var.f7548a);
                        ArrayList<Pair> arrayList = new ArrayList();
                        for (h0 h0Var : arrayListA) {
                            e0 e0Var = (e0) mapB.get(h0Var.f7569a);
                            Pair pair = e0Var != null ? new Pair(h0Var, e0Var) : null;
                            if (pair != null) {
                                arrayList.add(pair);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            z11 = true;
                        } else {
                            for (Pair pair2 : arrayList) {
                                h0 h0Var2 = (h0) pair2.f26485a;
                                e0 e0Var2 = (e0) pair2.f26486b;
                                boolean zAreEqual = Intrinsics.areEqual(g0Var.a(), h0Var2.f7569a);
                                int i12 = h0Var2.f7570b;
                                if (zAreEqual) {
                                    if (i12 != e0Var2.f7520a || !Intrinsics.areEqual((String) g0Var.f7551d.getValue(), e0Var2.f7521b)) {
                                    }
                                } else if (i12 != e0Var2.f7520a) {
                                }
                            }
                            z11 = true;
                        }
                    }
                    if (z11) {
                        Log.d("FirebaseSessions", "Cold app start detected");
                    }
                } else {
                    Log.d("FirebaseSessions", "No process data map");
                    z11 = true;
                }
                boolean zD = f1Var.d(l0Var2);
                if (z11) {
                    g0Var.getClass();
                    kotlin.collections.o0 o0Var = kotlin.collections.o0.f26530a;
                    o0Var.getClass();
                    mapB = g0Var.b(o0Var);
                } else if (zD) {
                    mapB = g0Var.b(mapB);
                }
                q0 q0Var = z11 ? null : l0Var2.f7599a;
                if (!zE && !z11) {
                    return zD ? l0.a(l0Var2, null, null, g0Var.b(mapB), 3) : l0Var2;
                }
                q0 q0VarA = f1Var.f7534b.a(q0Var);
                u0 u0Var = f1Var.f7535c;
                v80.f0.B(v80.f0.b(u0Var.f7640e), null, null, new al.k(u0Var, q0VarA, null), 3);
                g0Var.f7553f = true;
                return new l0(q0VarA, null, mapB);
        }
    }
}
