package o80;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.c0;
import kotlin.collections.d0;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;
import qc.y;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public class r extends p {
    public static int f(Sequence sequence) {
        sequence.getClass();
        Iterator it = sequence.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            it.next();
            i11++;
            if (i11 < 0) {
                d0.m();
                throw null;
            }
        }
        return i11;
    }

    public static Sequence g(Sequence sequence, int i11) {
        sequence.getClass();
        if (i11 >= 0) {
            return i11 == 0 ? sequence : sequence instanceof c ? ((c) sequence).a(i11) : new b(sequence, i11);
        }
        i4.a.i(r8.k.h(i11, "Requested element count ", " is less than zero."));
        return null;
    }

    public static f h(Sequence sequence, Function1 function1) {
        sequence.getClass();
        function1.getClass();
        return new f(sequence, true, function1);
    }

    public static f i(Sequence sequence, Function1 function1) {
        sequence.getClass();
        function1.getClass();
        return new f(sequence, false, function1);
    }

    public static Object j(f fVar) {
        e eVar = new e(fVar);
        if (eVar.hasNext()) {
            return eVar.next();
        }
        return null;
    }

    public static String k(Sequence sequence, String str) throws IOException {
        sequence.getClass();
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int i11 = 0;
        for (Object obj : sequence) {
            i11++;
            if (i11 > 1) {
                sb2.append((CharSequence) str);
            }
            kotlin.text.r.a(sb2, obj, null);
        }
        sb2.append((CharSequence) "");
        return sb2.toString();
    }

    public static Object l(Sequence sequence) {
        sequence.getClass();
        Iterator it = sequence.iterator();
        if (!it.hasNext()) {
            y.h("Sequence is empty.");
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static s m(Sequence sequence, Function1 function1) {
        sequence.getClass();
        function1.getClass();
        return new s(sequence, function1);
    }

    public static f n(Sequence sequence, Function1 function1) {
        sequence.getClass();
        function1.getClass();
        return i(new s(sequence, function1), new nv.a(5));
    }

    public static List o(Sequence sequence) {
        sequence.getClass();
        Iterator it = sequence.iterator();
        if (!it.hasNext()) {
            return n0.f26529a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return c0.c(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
