package af;

import android.view.View;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.g;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0009, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final af.e a(af.d r6, android.view.View r7, java.util.List r8, kf.b r9, kotlin.Pair r10) {
        /*
            kotlin.collections.t r0 = new kotlin.collections.t
            r0.<init>()
            r0.addLast(r7)
            r7 = 0
        L9:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L81
            java.lang.Object r1 = r0.removeFirst()     // Catch: java.util.NoSuchElementException -> L7b
            android.view.View r1 = (android.view.View) r1     // Catch: java.util.NoSuchElementException -> L7b
            boolean r2 = r1 instanceof android.view.ViewGroup
            if (r2 == 0) goto L36
            r2 = r1
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            h7.z0 r3 = new h7.z0
            r3.<init>(r2)
            java.util.Iterator r2 = r3.iterator()
        L25:
            r3 = r2
            h7.a1 r3 = (h7.a1) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L36
            java.lang.Object r3 = r3.next()
            r0.addLast(r3)
            goto L25
        L36:
            if (r8 == 0) goto L41
            boolean r2 = r8.isEmpty()     // Catch: java.lang.ClassCastException -> L3f
            if (r2 != 0) goto L9
            goto L41
        L3f:
            r1 = move-exception
            goto L69
        L41:
            java.util.Iterator r2 = r8.iterator()     // Catch: java.lang.ClassCastException -> L3f
        L45:
            boolean r3 = r2.hasNext()     // Catch: java.lang.ClassCastException -> L3f
            if (r3 == 0) goto L9
            java.lang.Object r3 = r2.next()     // Catch: java.lang.ClassCastException -> L3f
            ef.b r3 = (ef.b) r3     // Catch: java.lang.ClassCastException -> L3f
            af.e r3 = r3.a(r1, r10, r6)     // Catch: java.lang.ClassCastException -> L3f
            if (r3 == 0) goto L5f
            af.d r7 = af.d.Clickable     // Catch: java.lang.ClassCastException -> L3f
            if (r6 != r7) goto L5d
            r7 = 1
            goto L63
        L5d:
            r7 = r3
            goto L81
        L5f:
            r3 = 0
            r5 = r3
            r3 = r7
            r7 = r5
        L63:
            if (r7 == 0) goto L67
            r7 = r3
            goto L9
        L67:
            r7 = r3
            goto L45
        L69:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Error while locating target in view hierarchy: "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r9.a(r1)
            goto L9
        L7b:
            java.lang.String r1 = "Unable to get view from queue"
            r9.a(r1)
            goto L9
        L81:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: af.c.a(af.d, android.view.View, java.util.List, kf.b, kotlin.Pair):af.e");
    }

    public static final e b(d dVar, View view, List list, kf.b bVar, Pair pair) {
        list.getClass();
        dVar.getClass();
        bVar.getClass();
        return (e) f0.E(g.f26549a, new b(view, bVar, pair, dVar, list, (x70.c) null, 0));
    }
}
