package a3;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j2 f492b;

    public /* synthetic */ n0(j2 j2Var, int i11) {
        this.f491a = i11;
        this.f492b = j2Var;
    }

    /* JADX WARN: Type inference failed for: r1v19, types: [T, m5.h] */
    /* JADX WARN: Type inference failed for: r1v20, types: [T, m5.t0] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int iNextIndex;
        v80.b0 b0Var;
        z4.z zVar;
        z4.z zVar2;
        h4.c cVar;
        int i11;
        z4.z zVar3;
        z4.z zVarC;
        int[] iArr;
        int[] iArr2;
        int i12;
        i0 i0Var;
        ArrayList arrayList;
        int i13;
        int i14;
        int i15 = this.f491a;
        int i16 = 1;
        j2 j2Var = this.f492b;
        switch (i15) {
            case 0:
                h4.b bVar = (h4.b) j2Var.f416p.getValue();
                return new h4.b(bVar != null ? bVar.f21378a : 9205357640488583168L);
            case 1:
                h4.b bVar2 = (h4.b) j2Var.f417q.getValue();
                return new h4.b(bVar2 != null ? bVar2.f21378a : 9205357640488583168L);
            case 2:
                j2 j2Var2 = this.f492b;
                j2Var2.f424x = true;
                j2Var2.o();
                j2Var2.f418r.setValue(null);
                j2Var2.f419s.setValue(null);
                if (j2Var2.f421u && j2Var2.h()) {
                    Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    Ref.LongRef longRef = new Ref.LongRef();
                    s2 s2Var = j2Var2.f402a;
                    ArrayList arrayListC = s2Var.c(j2Var2.j());
                    ListIterator listIterator = arrayListC.listIterator(arrayListC.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            i0 i0Var2 = (i0) s2Var.a().b(((s) listIterator.previous()).f549a);
                            if (i0Var2 != null && i0Var2.f385a.f367b != i0Var2.f386b.f367b) {
                                iNextIndex = listIterator.nextIndex();
                            }
                        } else {
                            iNextIndex = -1;
                        }
                    }
                    if (iNextIndex != -1) {
                        int size = arrayListC.size();
                        int i17 = 0;
                        while (true) {
                            if (i17 < size) {
                                s sVar = (s) arrayListC.get(i17);
                                i0 i0Var3 = (i0) s2Var.a().b(sVar.f549a);
                                if (i0Var3 != null) {
                                    ?? D = sVar.d();
                                    long jB = m5.k0.b(i0Var3.f385a.f367b, i0Var3.f386b.f367b);
                                    boolean z11 = i17 >= iNextIndex;
                                    long j9 = sVar.f549a;
                                    if (z11) {
                                        objectRef.element = D;
                                        objectRef2.element = new m5.t0(jB);
                                        longRef.element = j9;
                                    }
                                } else {
                                    i17++;
                                }
                            }
                        }
                    }
                    T t9 = objectRef.element;
                    if (t9 != 0 && objectRef2.element != 0 && longRef.element != 0 && ((CharSequence) t9).length() > 0 && (b0Var = j2Var2.f422v) != null) {
                        v80.f0.B(b0Var, null, null, new i2(j2Var2, objectRef, objectRef2, longRef, null), 3);
                    }
                }
                j2Var2.f421u = false;
                return Unit.f26487a;
            case 3:
                j2Var.i();
                return Unit.f26487a;
            case 4:
                s2 s2Var2 = j2Var.f402a;
                j2Var.f413m.getValue();
                if (j2Var.f() != null && (zVar = j2Var.l) != null && zVar.n()) {
                    ArrayList arrayListC2 = s2Var2.c(j2Var.j());
                    ArrayList arrayList2 = new ArrayList(arrayListC2.size());
                    int size2 = arrayListC2.size();
                    for (int i18 = 0; i18 < size2; i18++) {
                        s sVar2 = (s) arrayListC2.get(i18);
                        i0 i0Var4 = (i0) s2Var2.a().b(sVar2.f549a);
                        Pair pair = i0Var4 != null ? new Pair(sVar2, i0Var4) : null;
                        if (pair != null) {
                            arrayList2.add(pair);
                        }
                    }
                    int size3 = arrayList2.size();
                    List listH = arrayList2;
                    listH = arrayList2;
                    if (size3 != 0 && size3 != 1) {
                        listH = kotlin.collections.d0.h(CollectionsKt.O(arrayList2), CollectionsKt.W(arrayList2));
                    }
                    if (!listH.isEmpty()) {
                        boolean zIsEmpty = listH.isEmpty();
                        h4.c cVar2 = l2.f447a;
                        if (zIsEmpty) {
                            zVar2 = zVar;
                            cVar = cVar2;
                        } else {
                            int size4 = listH.size();
                            int i19 = 0;
                            float fMin = Float.POSITIVE_INFINITY;
                            float fMin2 = Float.POSITIVE_INFINITY;
                            float fMax = Float.NEGATIVE_INFINITY;
                            float fMax2 = Float.NEGATIVE_INFINITY;
                            while (i19 < size4) {
                                Pair pair2 = (Pair) listH.get(i19);
                                s sVar3 = (s) pair2.f26485a;
                                i0 i0Var5 = (i0) pair2.f26486b;
                                int i21 = i0Var5.f385a.f367b;
                                int i22 = i0Var5.f386b.f367b;
                                if (i21 == i22 || (zVarC = sVar3.c()) == null) {
                                    i11 = size4;
                                    zVar3 = zVar;
                                } else {
                                    boolean z12 = z;
                                    int iMin = Math.min(i21, i22);
                                    int iMax = Math.max(i21, i22) - i16;
                                    if (iMin == iMax) {
                                        iArr = new int[i16];
                                        iArr[z12 ? 1 : 0] = iMin;
                                    } else {
                                        int[] iArr3 = new int[2];
                                        iArr3[z12 ? 1 : 0] = iMin;
                                        iArr3[i16] = iMax;
                                        iArr = iArr3;
                                    }
                                    int length = iArr.length;
                                    int i23 = z12 ? 1 : 0;
                                    float fMin3 = Float.POSITIVE_INFINITY;
                                    float fMin4 = Float.POSITIVE_INFINITY;
                                    float fMax3 = Float.NEGATIVE_INFINITY;
                                    float fMax4 = Float.NEGATIVE_INFINITY;
                                    while (i23 < length) {
                                        int i24 = iArr[i23];
                                        int i25 = size4;
                                        m5.q0 q0Var = (m5.q0) sVar3.f551c.invoke();
                                        h4.c cVarB = h4.c.f21379e;
                                        if (q0Var == null) {
                                            iArr2 = iArr;
                                            i12 = length;
                                        } else {
                                            iArr2 = iArr;
                                            int length2 = q0Var.f29617a.f29603a.f29538b.length();
                                            i12 = length;
                                            if (length2 >= 1) {
                                                cVarB = q0Var.b(n80.p.c(i24, z12 ? 1 : 0, length2 - 1));
                                            }
                                        }
                                        h4.c cVar3 = cVarB;
                                        fMin3 = Math.min(fMin3, cVar3.f21380a);
                                        fMin4 = Math.min(fMin4, cVar3.f21381b);
                                        fMax3 = Math.max(fMax3, cVar3.f21382c);
                                        fMax4 = Math.max(fMax4, cVar3.f21383d);
                                        i23++;
                                        size4 = i25;
                                        iArr = iArr2;
                                        length = i12;
                                        z12 = false;
                                    }
                                    i11 = size4;
                                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMin3)) << 32) | (((long) Float.floatToRawIntBits(fMin4)) & 4294967295L);
                                    zVar3 = zVar;
                                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fMax3)) << 32) | (((long) Float.floatToRawIntBits(fMax4)) & 4294967295L);
                                    long jG = zVar3.g(zVarC, jFloatToRawIntBits);
                                    long jG2 = zVar3.g(zVarC, jFloatToRawIntBits2);
                                    fMin = Math.min(fMin, Float.intBitsToFloat((int) (jG >> 32)));
                                    fMin2 = Math.min(fMin2, Float.intBitsToFloat((int) (jG & 4294967295L)));
                                    fMax = Math.max(fMax, Float.intBitsToFloat((int) (jG2 >> 32)));
                                    fMax2 = Math.max(fMax2, Float.intBitsToFloat((int) (jG2 & 4294967295L)));
                                }
                                i19++;
                                zVar = zVar3;
                                size4 = i11;
                                z = false;
                                i16 = 1;
                            }
                            zVar2 = zVar;
                            cVar = new h4.c(fMin, fMin2, fMax, fMax2);
                        }
                        if (!Intrinsics.areEqual(cVar, cVar2)) {
                            h4.c cVarG = l2.c(zVar2).g(cVar);
                            if (cVarG.f21382c - cVarG.f21380a >= 0.0f && cVarG.f21383d - cVarG.f21381b >= 0.0f) {
                                h4.c cVarK = cVarG.k(zVar2.S(0L));
                                return h4.c.b(cVarK, 0.0f, 0.0f, (m1.f479b * 4) + cVarK.f21383d, 7);
                            }
                        }
                    }
                }
                return null;
            case 5:
                j2Var.b();
                if (j2Var.g()) {
                    j2Var.i();
                }
                return Unit.f26487a;
            case 6:
                return Boolean.valueOf((j2Var.f424x && j2Var.g()) ? false : true);
            default:
                s2 s2Var3 = j2Var.f402a;
                ArrayList arrayListC3 = s2Var3.c(j2Var.j());
                if (!arrayListC3.isEmpty()) {
                    q1.k0 k0Var = q1.w.f35850a;
                    q1.k0 k0Var2 = new q1.k0();
                    int size5 = arrayListC3.size();
                    int i26 = 0;
                    i0 i0Var6 = null;
                    i0 i0Var7 = null;
                    while (i26 < size5) {
                        s sVar4 = (s) arrayListC3.get(i26);
                        long j11 = sVar4.f549a;
                        m5.q0 q0Var2 = (m5.q0) sVar4.f551c.invoke();
                        if (q0Var2 == null) {
                            arrayList = arrayListC3;
                            i13 = size5;
                            i14 = i26;
                            i0Var = null;
                        } else {
                            int length3 = q0Var2.f29617a.f29603a.f29538b.length();
                            arrayList = arrayListC3;
                            i13 = size5;
                            i14 = i26;
                            i0Var = new i0(new h0(q0Var2.a(0), 0, j11), new h0(q0Var2.a(Math.max(length3 - 1, 0)), length3, j11), false);
                        }
                        if (i0Var != null) {
                            if (i0Var6 == null) {
                                i0Var6 = i0Var;
                            }
                            long j12 = sVar4.f549a;
                            int iD = k0Var2.d(j12);
                            Object[] objArr = k0Var2.f35836c;
                            Object obj = objArr[iD];
                            k0Var2.f35835b[iD] = j12;
                            objArr[iD] = i0Var;
                            i0Var7 = i0Var;
                        }
                        i26 = i14 + 1;
                        arrayListC3 = arrayList;
                        size5 = i13;
                    }
                    if (k0Var2.f35838e != 0) {
                        if (i0Var6 != i0Var7) {
                            i0Var6.getClass();
                            h0 h0Var = i0Var6.f385a;
                            i0Var7.getClass();
                            i0Var6 = new i0(h0Var, i0Var7.f386b, false);
                        }
                        s2Var3.f567k.setValue(k0Var2);
                        j2Var.f405d.invoke(i0Var6);
                        j2Var.f420t = null;
                    }
                }
                return Unit.f26487a;
        }
    }
}
