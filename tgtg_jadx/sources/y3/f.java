package y3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.CharsKt;
import q1.g1;
import q1.t0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f45403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t0 f45404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public t0 f45405c;

    public f(Map map, Function1 function1) {
        t0 t0Var;
        this.f45403a = function1;
        if (map == null || map.isEmpty()) {
            t0Var = null;
        } else {
            t0Var = new t0(map.size());
            for (Map.Entry entry : map.entrySet()) {
                t0Var.m(entry.getKey(), entry.getValue());
            }
        }
        this.f45404b = t0Var;
    }

    @Override // y3.e
    public final boolean a(Object obj) {
        return ((Boolean) this.f45403a.invoke(obj)).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0091  */
    @Override // y3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map b() {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y3.f.b():java.util.Map");
    }

    @Override // y3.e
    public final Object c(String str) {
        t0 t0Var = this.f45404b;
        List list = t0Var != null ? (List) t0Var.k(str) : null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && t0Var != null) {
            List listSubList = list.subList(1, list.size());
            int i11 = t0Var.i(str);
            if (i11 < 0) {
                i11 = ~i11;
            }
            Object[] objArr = t0Var.f35754c;
            Object obj = objArr[i11];
            t0Var.f35753b[i11] = str;
            objArr[i11] = listSubList;
        }
        return list.get(0);
    }

    @Override // y3.e
    public final d d(String str, Function0 function0) {
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            if (!CharsKt.b(str.charAt(i11))) {
                t0 t0Var = this.f45405c;
                if (t0Var == null) {
                    long[] jArr = g1.f35760a;
                    t0Var = new t0();
                    this.f45405c = t0Var;
                }
                Object objD = t0Var.d(str);
                if (objD == null) {
                    objD = new ArrayList();
                    t0Var.m(str, objD);
                }
                ((List) objD).add(function0);
                return new t5.a(t0Var, str, function0, 23);
            }
        }
        i4.a.f("Registered key is empty or blank");
        return null;
    }
}
