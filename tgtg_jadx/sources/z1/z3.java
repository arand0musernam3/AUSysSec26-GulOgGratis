package z1;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yj.m f46794a = new yj.m(11);

    public static final void a(x0.e eVar, t4.b bVar, h2 h2Var, t4.a aVar, a60.y yVar, long j9) {
        float fIntBitsToFloat;
        ArrayList arrayList = yVar.f940a;
        long j11 = bVar.f39782c;
        boolean z11 = bVar.f39783d;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j11 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (bVar.f39782c & 4294967295L));
        boolean z12 = bVar.f39787h;
        if (!z12 && z11) {
            yVar.f941b = 0;
            arrayList.clear();
        }
        if (!b(bVar) && (z12 || !z11)) {
            if (arrayList.size() == 3) {
                int i11 = yVar.f941b;
                yVar.f941b = i11 + 1;
                arrayList.set(i11, bVar);
            } else {
                arrayList.add(bVar);
            }
            if (yVar.f941b == 3) {
                yVar.f941b = 0;
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                arrayList2.add(Float.valueOf(Float.intBitsToFloat((int) (((t4.b) arrayList.get(i12)).f39782c >> 32))));
            }
            fIntBitsToFloat2 = (float) CollectionsKt.G(arrayList2);
            ArrayList arrayList3 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i13 = 0; i13 < size2; i13++) {
                arrayList3.add(Float.valueOf(Float.intBitsToFloat((int) (((t4.b) arrayList.get(i13)).f39782c & 4294967295L))));
            }
            fIntBitsToFloat3 = (float) CollectionsKt.G(arrayList3);
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L);
        if (h2Var != null) {
            int i14 = aVar.f39779a;
            if (i14 == 1) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
            } else if (i14 == 2) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
            }
            jFloatToRawIntBits = h2Var == h2.Horizontal ? (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) : (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
        }
        ((x4.b) eVar.f43625b).a(bVar.f39781b, h4.b.f(jFloatToRawIntBits, j9));
    }

    public static final boolean b(t4.b bVar) {
        return bVar.f39787h && !bVar.f39783d;
    }

    public static final boolean c(w4.k0 k0Var) {
        List list = k0Var.f43144f.f43159s.f43165a;
        int size = list.size();
        boolean z11 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                break;
            }
            if (((w4.v) list.get(i11)).f43181d) {
                z11 = true;
                break;
            }
            i11++;
        }
        return !z11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        if (c(r7) == false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0048 -> B:19:0x004b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(w4.k0 r7, w4.o r8, z70.a r9) {
        /*
            boolean r0 = r9 instanceof z1.m1
            if (r0 == 0) goto L13
            r0 = r9
            z1.m1 r0 = (z1.m1) r0
            int r1 = r0.f46603m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f46603m = r1
            goto L18
        L13:
            z1.m1 r0 = new z1.m1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.l
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f46603m
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2e
            w4.o r7 = r0.f46602k
            w4.k0 r8 = r0.f46601j
            ba0.g.M(r9)
            r6 = r8
            r8 = r7
            r7 = r6
            goto L4b
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r7)
            r7 = 0
            return r7
        L35:
            ba0.g.M(r9)
            boolean r9 = c(r7)
            if (r9 != 0) goto L64
        L3e:
            r0.f46601j = r7
            r0.f46602k = r8
            r0.f46603m = r3
            java.lang.Object r9 = r7.b(r8, r0)
            if (r9 != r1) goto L4b
            return r1
        L4b:
            w4.n r9 = (w4.n) r9
            java.util.List r9 = r9.f43165a
            int r2 = r9.size()
            r4 = 0
        L54:
            if (r4 >= r2) goto L64
            java.lang.Object r5 = r9.get(r4)
            w4.v r5 = (w4.v) r5
            boolean r5 = r5.f43181d
            if (r5 == 0) goto L61
            goto L3e
        L61:
            int r4 = r4 + 1
            goto L54
        L64:
            kotlin.Unit r7 = kotlin.Unit.f26487a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.z3.d(w4.k0, w4.o, z70.a):java.lang.Object");
    }

    public static final Object e(w4.y yVar, Function2 function2, x70.c cVar) {
        Object objL0 = ((w4.m0) yVar).L0(new a3.g2(cVar.getContext(), function2, (x70.c) null), cVar);
        return objL0 == y70.a.COROUTINE_SUSPENDED ? objL0 : Unit.f26487a;
    }

    public static final long f(t4.b bVar, h2 h2Var, t4.a aVar) {
        float fIntBitsToFloat;
        long jFloatToRawIntBits;
        long j9;
        if (h2Var == null) {
            return bVar.f39782c;
        }
        int i11 = aVar.f39779a;
        if (i11 == 1) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (bVar.f39782c >> 32));
        } else {
            if (i11 != 2) {
                return bVar.f39782c;
            }
            fIntBitsToFloat = Float.intBitsToFloat((int) (bVar.f39782c & 4294967295L));
        }
        if (h2Var == h2.Horizontal) {
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat);
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j9 = jFloatToRawIntBits2 << 32;
        } else {
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
            jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
            j9 = jFloatToRawIntBits3 << 32;
        }
        return j9 | (4294967295L & jFloatToRawIntBits);
    }

    public static final long g(t4.b bVar, h2 h2Var, t4.a aVar) {
        float fIntBitsToFloat;
        long j9 = bVar.f39786g;
        if (h2Var == null) {
            return j9;
        }
        int i11 = aVar.f39779a;
        if (i11 == 1) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (j9 >> 32));
        } else {
            if (i11 != 2) {
                return j9;
            }
            fIntBitsToFloat = Float.intBitsToFloat((int) (j9 & 4294967295L));
        }
        if (h2Var == h2.Horizontal) {
            return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
    }
}
