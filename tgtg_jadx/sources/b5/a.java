package b5;

import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n0 f5745a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(n0 n0Var) {
        super(1);
        this.f5745a = n0Var;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [b5.b, z4.m1] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        n0 n0Var;
        b bVar = (b) obj;
        if (bVar.x() != Integer.MAX_VALUE) {
            if (bVar.c().f5894b) {
                bVar.N();
            }
            Iterator it = bVar.c().f5901i.entrySet().iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                n0Var = this.f5745a;
                if (!zHasNext) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                n0.a(n0Var, (z4.a) entry.getKey(), ((Number) entry.getValue()).intValue(), bVar.j());
            }
            s1 s1Var = bVar.j().f5968r;
            s1Var.getClass();
            while (!Intrinsics.areEqual(s1Var, n0Var.f5893a.j())) {
                for (z4.a aVar : n0Var.b(s1Var).keySet()) {
                    n0.a(n0Var, aVar, n0Var.c(s1Var, aVar), s1Var);
                }
                s1Var = s1Var.f5968r;
                s1Var.getClass();
            }
        }
        return Unit.f26487a;
    }
}
