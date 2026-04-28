package g2;

import b0.x1;
import h2.z0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b0 f18273a;

    public z(b0 b0Var) {
        this.f18273a = b0Var;
    }

    public final ArrayList a(int i11) {
        ArrayList arrayList = new ArrayList();
        b0 b0Var = this.f18273a;
        z3.g gVarC = z3.v.c();
        Function1 function1E = gVarC != null ? gVarC.e() : null;
        z3.g gVarD = z3.v.d(gVarC);
        try {
            r rVar = b0Var.f18127b ? b0Var.f18128c : (r) b0Var.f18130e.getValue();
            if (rVar != null) {
                Ref.IntRef intRef = new Ref.IntRef();
                intRef.element = 1;
                List list = (List) rVar.f18218k.invoke(Integer.valueOf(i11));
                int size = list.size();
                for (int i12 = 0; i12 < size; i12++) {
                    Pair pair = (Pair) list.get(i12);
                    z0 z0Var = b0Var.f18139o;
                    int iIntValue = ((Number) pair.f26485a).intValue();
                    long j9 = ((z5.a) pair.f26486b).f47271a;
                    ub.a aVar = b0.f18125w;
                    intRef = intRef;
                    arrayList.add(z0Var.a(iIntValue, j9, false, new x1((ArrayList) null, intRef, list, i11, rVar)));
                }
            }
            z3.v.f(gVarC, gVarD, function1E);
            return arrayList;
        } catch (Throwable th2) {
            z3.v.f(gVarC, gVarD, function1E);
            throw th2;
        }
    }
}
