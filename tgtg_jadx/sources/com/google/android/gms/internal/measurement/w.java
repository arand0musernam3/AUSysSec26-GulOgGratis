package com.google.android.gms.internal.measurement;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class w extends AbstractMap {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final t f11973f = new t(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f11974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f11975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f11976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Integer f11977d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f11978e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.measurement.w, java.util.AbstractMap] */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.measurement.w] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public w(w wVar, w wVar2) {
        int i11;
        Object obj;
        Object[] objArr;
        ?? abstractMap = new AbstractMap();
        abstractMap.f11976c = new v(abstractMap, -1);
        abstractMap.f11977d = null;
        abstractMap.f11978e = null;
        int size = wVar2.size() + wVar.size();
        int i12 = wVar.f11975b[wVar.size()] + wVar2.f11975b[wVar2.size()];
        int i13 = size + 1;
        Object[] objArr2 = new Object[i12];
        int[] iArr = new int[i13];
        int i14 = 0;
        iArr[0] = size;
        Map.Entry entryD = wVar.d(0);
        Map.Entry entryD2 = wVar2.d(0);
        int i15 = 0;
        int i16 = 0;
        int iA = size;
        int i17 = 0;
        while (true) {
            if (entryD == null && entryD2 == null) {
                break;
            }
            int i18 = i17 + 1;
            if (entryD != null) {
                if (entryD2 != null) {
                    int iCompareTo = ((String) entryD.getKey()).compareTo((String) entryD2.getKey());
                    if (iCompareTo == 0) {
                        int i19 = i15 + 1;
                        int i21 = i16 + 1;
                        objArr2[i17] = new AbstractMap.SimpleImmutableEntry((String) entryD.getKey(), new v(abstractMap, i17));
                        v vVar = (v) entryD.getValue();
                        v vVar2 = (v) entryD2.getValue();
                        int i22 = 0;
                        int i23 = 0;
                        abstractMap = abstractMap;
                        while (true) {
                            int iC = vVar.c();
                            w wVar3 = vVar.f11949b;
                            if (i22 >= iC - vVar.b() && i23 >= vVar2.c() - vVar2.b()) {
                                break;
                            }
                            int iCompare = i22 == vVar.c() - vVar.b() ? 1 : i23 == vVar2.c() - vVar2.b() ? -1 : 0;
                            if (iCompare == 0) {
                                t tVar = y.f12046b;
                                i11 = i22;
                                iCompare = y.f12046b.compare(wVar3.f11974a[vVar.b() + i22], vVar2.f11949b.f11974a[vVar2.b() + i23]);
                            } else {
                                i11 = i22;
                            }
                            if (iCompare < 0) {
                                i22 = i11 + 1;
                                obj = wVar3.f11974a[vVar.b() + i11];
                            } else {
                                int i24 = i23 + 1;
                                Object obj2 = vVar2.f11949b.f11974a[vVar2.b() + i23];
                                if (iCompare == 0) {
                                    i23 = i24;
                                    obj = obj2;
                                    i22 = i11 + 1;
                                } else {
                                    i23 = i24;
                                    obj = obj2;
                                    i22 = i11;
                                }
                            }
                            objArr2[iA] = obj;
                            abstractMap = this;
                            iA++;
                        }
                        iArr[i18] = iA;
                        entryD = wVar.d(i21);
                        entryD2 = wVar2.d(i19);
                        i16 = i21;
                        i15 = i19;
                        i17 = i18;
                        i14 = 0;
                    } else {
                        if (iCompareTo < 0) {
                        }
                        i17 = i18;
                        i14 = 0;
                        abstractMap = this;
                    }
                }
                i16++;
                iA = a(entryD, i17, iA, objArr2, iArr);
                entryD = wVar.d(i16);
                i17 = i18;
                i14 = 0;
                abstractMap = this;
            }
            Map.Entry entry = entryD;
            i15++;
            int iA2 = a(entryD2, i17, iA, objArr2, iArr);
            entryD2 = wVar2.d(i15);
            iA = iA2;
            entryD = entry;
            i17 = i18;
            i14 = 0;
            abstractMap = this;
        }
        int i25 = iArr[i14];
        int i26 = i25 - i17;
        if (i26 != 0) {
            for (int i27 = i14; i27 <= i17; i27++) {
                iArr[i27] = iArr[i27] - i26;
            }
            int i28 = iArr[i17];
            int i29 = i28 - i17;
            if (b(i12, i28)) {
                objArr = new Object[i28];
                System.arraycopy(objArr2, i14, objArr, i14, i17);
            } else {
                objArr = objArr2;
            }
            System.arraycopy(objArr2, i25, objArr, i17, i29);
            objArr2 = objArr;
        }
        abstractMap.f11974a = objArr2;
        int i31 = iArr[i14] + 1;
        abstractMap.f11975b = b(i13, i31) ? Arrays.copyOf(iArr, i31) : iArr;
    }

    public static boolean b(int i11, int i12) {
        return i11 > 16 && i11 * 9 > i12 * 10;
    }

    public final int a(Map.Entry entry, int i11, int i12, Object[] objArr, int[] iArr) {
        v vVar = (v) entry.getValue();
        int iC = vVar.c() - vVar.b();
        System.arraycopy(vVar.f11949b.f11974a, vVar.b(), objArr, i12, iC);
        objArr[i11] = new AbstractMap.SimpleImmutableEntry((String) entry.getKey(), new v(this, i11));
        int i13 = i12 + iC;
        iArr[i11 + 1] = i13;
        return i13;
    }

    public final Map.Entry d(int i11) {
        if (i11 < this.f11975b[0]) {
            return (Map.Entry) this.f11974a[i11];
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return this.f11976c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        if (this.f11977d == null) {
            this.f11977d = Integer.valueOf(super.hashCode());
        }
        return this.f11977d.intValue();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        if (this.f11978e == null) {
            this.f11978e = super.toString();
        }
        return this.f11978e;
    }

    public w() {
        List list = Collections.EMPTY_LIST;
        this.f11976c = new v(this, -1);
        this.f11977d = null;
        this.f11978e = null;
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            int size = list.size();
            Object[] objArr = new Object[size];
            Iterator it2 = list.iterator();
            if (!it2.hasNext()) {
                int[] iArr = {0};
                this.f11974a = b(size, 0) ? Arrays.copyOf(objArr, 0) : objArr;
                this.f11975b = iArr;
                return;
            }
            throw e0.f.e(it2);
        }
        throw e0.f.e(it);
    }
}
