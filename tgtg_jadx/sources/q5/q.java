package q5;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.i0;
import kotlin.jvm.internal.Intrinsics;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f36036a;

    public q(p... pVarArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (pVarArr.length > 0) {
            p pVar = pVarArr[0];
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.size() != 1) {
                i4.a.i(l1.f(e0.f.s("'", str, "' must be unique. Actual [ ["), CollectionsKt.U(list, null, null, null, null, 63), ']'));
                throw null;
            }
            i0.s(list, arrayList);
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.f36036a = arrayList2;
        if (arrayList2.size() <= 0) {
            return;
        }
        arrayList2.get(0).getClass();
        org.bouncycastle.jce.provider.a.c();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            return Intrinsics.areEqual(this.f36036a, ((q) obj).f36036a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f36036a.hashCode();
    }
}
