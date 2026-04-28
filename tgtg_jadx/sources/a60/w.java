package a60;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final r f929i = new r(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public u f936g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public u f937h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f933d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f934e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparator f930a = f929i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f932c = new v();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v[] f931b = new v[16];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f935f = 12;

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    public final v a(Object obj, boolean z11) {
        int iCompareTo;
        v vVar;
        boolean z12;
        v vVar2;
        v vVar3;
        v vVar4;
        v vVar5;
        v vVar6;
        v[] vVarArr = this.f931b;
        int iHashCode = obj.hashCode();
        int i11 = iHashCode ^ ((iHashCode >>> 20) ^ (iHashCode >>> 12));
        int i12 = ((i11 >>> 7) ^ i11) ^ (i11 >>> 4);
        boolean z13 = true;
        int length = i12 & (vVarArr.length - 1);
        v vVar7 = vVarArr[length];
        r rVar = f929i;
        v vVar8 = null;
        Comparator comparator = this.f930a;
        if (vVar7 != null) {
            Comparable comparable = comparator == rVar ? (Comparable) obj : null;
            while (true) {
                Object obj2 = vVar7.f925f;
                iCompareTo = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (iCompareTo == 0) {
                    return vVar7;
                }
                v vVar9 = iCompareTo < 0 ? vVar7.f921b : vVar7.f922c;
                if (vVar9 == null) {
                    break;
                }
                vVar7 = vVar9;
            }
        } else {
            iCompareTo = 0;
        }
        if (!z11) {
            return null;
        }
        v vVar10 = this.f932c;
        if (vVar7 != null) {
            v vVar11 = vVar7;
            vVar = new v(vVar11, obj, i12, vVar10, vVar10.f924e);
            if (iCompareTo < 0) {
                vVar11.f921b = vVar;
            } else {
                vVar11.f922c = vVar;
            }
            b(vVar11, true);
        } else {
            if (comparator == rVar && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            vVar = new v(vVar7, obj, i12, vVar10, vVar10.f924e);
            vVarArr[length] = vVar;
        }
        int i13 = this.f933d;
        this.f933d = i13 + 1;
        if (i13 > this.f935f) {
            v[] vVarArr2 = this.f931b;
            int length2 = vVarArr2.length;
            int i14 = length2 * 2;
            v[] vVarArr3 = new v[i14];
            s sVar = new s();
            s sVar2 = new s();
            int i15 = 0;
            while (i15 < length2) {
                v vVar12 = vVarArr2[i15];
                if (vVar12 == null) {
                    z12 = z13;
                    vVar3 = vVar8;
                } else {
                    v vVar13 = vVar8;
                    for (v vVar14 = vVar12; vVar14 != null; vVar14 = vVar14.f921b) {
                        vVar14.f920a = vVar13;
                        vVar13 = vVar14;
                    }
                    int i16 = 0;
                    int i17 = 0;
                    while (true) {
                        if (vVar13 != null) {
                            z12 = z13;
                            v vVar15 = vVar13.f920a;
                            vVar13.f920a = vVar8;
                            v vVar16 = vVar13.f922c;
                            while (true) {
                                v vVar17 = vVar16;
                                vVar2 = vVar15;
                                vVar15 = vVar17;
                                if (vVar15 == null) {
                                    break;
                                }
                                vVar15.f920a = vVar2;
                                vVar16 = vVar15.f921b;
                            }
                        } else {
                            v vVar18 = vVar13;
                            vVar13 = vVar8;
                            vVar2 = vVar18;
                            z12 = z13;
                        }
                        if (vVar13 == null) {
                            break;
                        }
                        if ((vVar13.f926g & length2) == 0) {
                            i16++;
                        } else {
                            i17++;
                        }
                        vVar13 = vVar2;
                        z13 = z12;
                        vVar8 = null;
                    }
                    sVar.f909a = ((Integer.highestOneBit(i16) * 2) - 1) - i16;
                    sVar.f911c = 0;
                    sVar.f910b = 0;
                    vVar3 = null;
                    sVar.f912d = null;
                    sVar2.f909a = ((Integer.highestOneBit(i17) * 2) - 1) - i17;
                    sVar2.f911c = 0;
                    sVar2.f910b = 0;
                    sVar2.f912d = null;
                    v vVar19 = null;
                    while (vVar12 != null) {
                        vVar12.f920a = vVar19;
                        v vVar20 = vVar12;
                        vVar12 = vVar12.f921b;
                        vVar19 = vVar20;
                    }
                    while (true) {
                        if (vVar19 != null) {
                            v vVar21 = vVar19.f920a;
                            vVar19.f920a = null;
                            v vVar22 = vVar19.f922c;
                            while (true) {
                                v vVar23 = vVar22;
                                vVar4 = vVar21;
                                vVar21 = vVar23;
                                if (vVar21 == null) {
                                    break;
                                }
                                vVar21.f920a = vVar4;
                                vVar22 = vVar21.f921b;
                            }
                        } else {
                            vVar4 = vVar19;
                            vVar19 = null;
                        }
                        if (vVar19 == null) {
                            break;
                        }
                        if ((vVar19.f926g & length2) == 0) {
                            sVar.a(vVar19);
                        } else {
                            sVar2.a(vVar19);
                        }
                        vVar19 = vVar4;
                    }
                    if (i16 > 0) {
                        vVar5 = (v) sVar.f912d;
                        if (vVar5.f920a != null) {
                            qc.y.e();
                            return null;
                        }
                    } else {
                        vVar5 = null;
                    }
                    vVarArr3[i15] = vVar5;
                    int i18 = i15 + length2;
                    if (i17 > 0) {
                        vVar6 = (v) sVar2.f912d;
                        if (vVar6.f920a != null) {
                            qc.y.e();
                            return null;
                        }
                    } else {
                        vVar6 = null;
                    }
                    vVarArr3[i18] = vVar6;
                }
                i15++;
                vVar8 = vVar3;
                z13 = z12;
            }
            this.f931b = vVarArr3;
            this.f935f = (i14 / 4) + (i14 / 2);
        }
        this.f934e++;
        return vVar;
    }

    public final void b(v vVar, boolean z11) {
        while (vVar != null) {
            v vVar2 = vVar.f921b;
            v vVar3 = vVar.f922c;
            int i11 = vVar2 != null ? vVar2.f928i : 0;
            int i12 = vVar3 != null ? vVar3.f928i : 0;
            int i13 = i11 - i12;
            if (i13 == -2) {
                v vVar4 = vVar3.f921b;
                v vVar5 = vVar3.f922c;
                int i14 = (vVar4 != null ? vVar4.f928i : 0) - (vVar5 != null ? vVar5.f928i : 0);
                if (i14 != -1 && (i14 != 0 || z11)) {
                    g(vVar3);
                }
                f(vVar);
                if (z11) {
                    return;
                }
            } else if (i13 == 2) {
                v vVar6 = vVar2.f921b;
                v vVar7 = vVar2.f922c;
                int i15 = (vVar6 != null ? vVar6.f928i : 0) - (vVar7 != null ? vVar7.f928i : 0);
                if (i15 != 1 && (i15 != 0 || z11)) {
                    f(vVar2);
                }
                g(vVar);
                if (z11) {
                    return;
                }
            } else if (i13 == 0) {
                vVar.f928i = i11 + 1;
                if (z11) {
                    return;
                }
            } else {
                vVar.f928i = Math.max(i11, i12) + 1;
                if (!z11) {
                    return;
                }
            }
            vVar = vVar.f920a;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Arrays.fill(this.f931b, (Object) null);
        this.f933d = 0;
        this.f934e++;
        v vVar = this.f932c;
        v vVar2 = vVar.f923d;
        while (vVar2 != vVar) {
            v vVar3 = vVar2.f923d;
            vVar2.f924e = null;
            vVar2.f923d = null;
            vVar2 = vVar3;
        }
        vVar.f924e = vVar;
        vVar.f923d = vVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        v vVarA = null;
        if (obj != null) {
            try {
                vVarA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return vVarA != null;
    }

    public final void d(v vVar, boolean z11) {
        v vVar2;
        v vVar3;
        int i11;
        if (z11) {
            v vVar4 = vVar.f924e;
            vVar4.f923d = vVar.f923d;
            vVar.f923d.f924e = vVar4;
            vVar.f924e = null;
            vVar.f923d = null;
        }
        v vVar5 = vVar.f921b;
        v vVar6 = vVar.f922c;
        v vVar7 = vVar.f920a;
        int i12 = 0;
        if (vVar5 == null || vVar6 == null) {
            if (vVar5 != null) {
                e(vVar, vVar5);
                vVar.f921b = null;
            } else if (vVar6 != null) {
                e(vVar, vVar6);
                vVar.f922c = null;
            } else {
                e(vVar, null);
            }
            b(vVar7, false);
            this.f933d--;
            this.f934e++;
            return;
        }
        if (vVar5.f928i > vVar6.f928i) {
            v vVar8 = vVar5.f922c;
            while (true) {
                v vVar9 = vVar8;
                vVar3 = vVar5;
                vVar5 = vVar9;
                if (vVar5 == null) {
                    break;
                } else {
                    vVar8 = vVar5.f922c;
                }
            }
        } else {
            v vVar10 = vVar6.f921b;
            while (true) {
                vVar2 = vVar6;
                vVar6 = vVar10;
                if (vVar6 == null) {
                    break;
                } else {
                    vVar10 = vVar6.f921b;
                }
            }
            vVar3 = vVar2;
        }
        d(vVar3, false);
        v vVar11 = vVar.f921b;
        if (vVar11 != null) {
            i11 = vVar11.f928i;
            vVar3.f921b = vVar11;
            vVar11.f920a = vVar3;
            vVar.f921b = null;
        } else {
            i11 = 0;
        }
        v vVar12 = vVar.f922c;
        if (vVar12 != null) {
            i12 = vVar12.f928i;
            vVar3.f922c = vVar12;
            vVar12.f920a = vVar3;
            vVar.f922c = null;
        }
        vVar3.f928i = Math.max(i11, i12) + 1;
        e(vVar, vVar3);
    }

    public final void e(v vVar, v vVar2) {
        v vVar3 = vVar.f920a;
        vVar.f920a = null;
        if (vVar2 != null) {
            vVar2.f920a = vVar3;
        }
        if (vVar3 == null) {
            int i11 = vVar.f926g;
            this.f931b[i11 & (r0.length - 1)] = vVar2;
        } else if (vVar3.f921b == vVar) {
            vVar3.f921b = vVar2;
        } else {
            vVar3.f922c = vVar2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        u uVar = this.f936g;
        if (uVar != null) {
            return uVar;
        }
        u uVar2 = new u(this, 0);
        this.f936g = uVar2;
        return uVar2;
    }

    public final void f(v vVar) {
        v vVar2 = vVar.f921b;
        v vVar3 = vVar.f922c;
        v vVar4 = vVar3.f921b;
        v vVar5 = vVar3.f922c;
        vVar.f922c = vVar4;
        if (vVar4 != null) {
            vVar4.f920a = vVar;
        }
        e(vVar, vVar3);
        vVar3.f921b = vVar;
        vVar.f920a = vVar3;
        int iMax = Math.max(vVar2 != null ? vVar2.f928i : 0, vVar4 != null ? vVar4.f928i : 0) + 1;
        vVar.f928i = iMax;
        vVar3.f928i = Math.max(iMax, vVar5 != null ? vVar5.f928i : 0) + 1;
    }

    public final void g(v vVar) {
        v vVar2 = vVar.f921b;
        v vVar3 = vVar.f922c;
        v vVar4 = vVar2.f921b;
        v vVar5 = vVar2.f922c;
        vVar.f921b = vVar5;
        if (vVar5 != null) {
            vVar5.f920a = vVar;
        }
        e(vVar, vVar2);
        vVar2.f922c = vVar;
        vVar.f920a = vVar2;
        int iMax = Math.max(vVar3 != null ? vVar3.f928i : 0, vVar5 != null ? vVar5.f928i : 0) + 1;
        vVar.f928i = iMax;
        vVar2.f928i = Math.max(iMax, vVar4 != null ? vVar4.f928i : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        v vVarA;
        if (obj != null) {
            try {
                vVarA = a(obj, false);
            } catch (ClassCastException unused) {
                vVarA = null;
            }
        } else {
            vVarA = null;
        }
        if (vVarA != null) {
            return vVarA.f927h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        u uVar = this.f937h;
        if (uVar != null) {
            return uVar;
        }
        u uVar2 = new u(this, 1);
        this.f937h = uVar2;
        return uVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            c50.w.l("key == null");
            return null;
        }
        v vVarA = a(obj, true);
        Object obj3 = vVarA.f927h;
        vVarA.f927h = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        v vVarA;
        if (obj != null) {
            try {
                vVarA = a(obj, false);
            } catch (ClassCastException unused) {
                vVarA = null;
            }
        } else {
            vVarA = null;
        }
        if (vVarA != null) {
            d(vVarA, true);
        }
        if (vVarA != null) {
            return vVarA.f927h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f933d;
    }
}
