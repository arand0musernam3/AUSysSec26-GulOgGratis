package v90;

import ia0.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;
import q90.n;
import q90.o;
import q90.p;
import q90.p0;
import q90.t;
import q90.v;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class f {
    static {
        j jVar = j.f23646d;
        r40.d.p("\"\\");
        r40.d.p("\t ,=");
    }

    public static final boolean a(p0 p0Var) {
        if (Intrinsics.areEqual(p0Var.f36582a.f36506b, "HEAD")) {
            return false;
        }
        int i11 = p0Var.f36585d;
        return (((i11 >= 100 && i11 < 200) || i11 == 204 || i11 == 304) && r90.g.e(p0Var) == -1 && !"chunked".equalsIgnoreCase(p0.e("Transfer-Encoding", p0Var))) ? false : true;
    }

    public static final void b(p pVar, v vVar, t tVar) {
        pVar.getClass();
        vVar.getClass();
        tVar.getClass();
        if (pVar == p.f36581o0) {
            return;
        }
        Pattern pattern = o.f36554k;
        List listH = tVar.h("Set-Cookie");
        int size = listH.size();
        List listUnmodifiableList = null;
        ArrayList arrayList = null;
        for (int i11 = 0; i11 < size; i11++) {
            o oVarB = n.b(vVar, (String) listH.get(i11));
            if (oVarB != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(oVarB);
            }
        }
        if (arrayList != null) {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
            listUnmodifiableList.getClass();
        }
        if (listUnmodifiableList == null) {
            listUnmodifiableList = n0.f26529a;
        }
        if (listUnmodifiableList.isEmpty()) {
            return;
        }
        pVar.b(vVar, listUnmodifiableList);
    }
}
