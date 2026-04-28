package j5;

import c5.l3;
import c5.o2;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.e0;
import kotlin.collections.w0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicInteger f24691a = new AtomicInteger(0);

    public static final void a(o2 o2Var, n nVar) {
        l3 l3Var = o2Var.f7309c;
        int iA = w0.a(e0.o(nVar, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        Iterator it = nVar.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(((a0) entry.getKey()).f24611a, entry.getValue());
        }
        l3Var.b(linkedHashMap, "properties");
    }

    public static final b4.t b(b4.t tVar, Function1 function1) {
        return tVar.then(new c(function1));
    }

    public static final b4.t c(b4.t tVar, boolean z11, Function1 function1) {
        return tVar.then(new b(function1, z11));
    }
}
