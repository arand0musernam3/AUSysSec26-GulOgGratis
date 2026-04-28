package r3;

import java.util.Arrays;
import kotlin.collections.x;
import kotlin.jvm.internal.Intrinsics;
import m3.s1;
import n80.p;
import o00.h0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l f37600e = new l(0, 0, new Object[0], null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f37602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t3.b f37603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object[] f37604d;

    public l(int i11, int i12, Object[] objArr, t3.b bVar) {
        this.f37601a = i11;
        this.f37602b = i12;
        this.f37603c = bVar;
        this.f37604d = objArr;
    }

    public static l j(int i11, Object obj, Object obj2, int i12, Object obj3, Object obj4, int i13, t3.b bVar) {
        if (i13 > 30) {
            return new l(0, 0, new Object[]{obj, obj2, obj3, obj4}, bVar);
        }
        int iZ = h0.z(i11, i13);
        int iZ2 = h0.z(i12, i13);
        if (iZ != iZ2) {
            return new l((1 << iZ) | (1 << iZ2), 0, iZ < iZ2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, bVar);
        }
        return new l(0, 1 << iZ, new Object[]{j(i11, obj, obj2, i12, obj3, obj4, i13 + 5, bVar)}, bVar);
    }

    public final Object[] a(int i11, int i12, int i13, Object obj, Object obj2, int i14, t3.b bVar) {
        Object obj3 = this.f37604d[i11];
        l lVarJ = j(obj3 != null ? obj3.hashCode() : 0, obj3, x(i11), i13, obj, obj2, i14 + 5, bVar);
        int iT = t(i12);
        int i15 = iT + 1;
        Object[] objArr = this.f37604d;
        Object[] objArr2 = new Object[objArr.length - 1];
        x.i(0, i11, 6, objArr, objArr2);
        x.d(i11, i11 + 2, i15, objArr, objArr2);
        objArr2[iT - 1] = lVarJ;
        x.d(iT, i15, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public final int b() {
        if (this.f37602b == 0) {
            return this.f37604d.length / 2;
        }
        int iBitCount = Integer.bitCount(this.f37601a);
        int length = this.f37604d.length;
        for (int i11 = iBitCount * 2; i11 < length; i11++) {
            iBitCount += s(i11).b();
        }
        return iBitCount;
    }

    public final boolean c(Object obj) {
        kotlin.ranges.a aVarH = p.h(2, p.j(0, this.f37604d.length));
        int i11 = aVarH.f26553a;
        int i12 = aVarH.f26554b;
        int i13 = aVarH.f26555c;
        if ((i13 > 0 && i11 <= i12) || (i13 < 0 && i12 <= i11)) {
            while (!Intrinsics.areEqual(obj, this.f37604d[i11])) {
                if (i11 != i12) {
                    i11 += i13;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(int i11, int i12, Object obj) {
        int iZ = 1 << h0.z(i11, i12);
        if (h(iZ)) {
            return Intrinsics.areEqual(obj, this.f37604d[f(iZ)]);
        }
        if (!i(iZ)) {
            return false;
        }
        l lVarS = s(t(iZ));
        return i12 == 30 ? lVarS.c(obj) : lVarS.d(i11, i12 + 5, obj);
    }

    public final boolean e(l lVar) {
        if (this == lVar) {
            return true;
        }
        if (this.f37602b != lVar.f37602b || this.f37601a != lVar.f37601a) {
            return false;
        }
        int length = this.f37604d.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (this.f37604d[i11] != lVar.f37604d[i11]) {
                return false;
            }
        }
        return true;
    }

    public final int f(int i11) {
        return Integer.bitCount((i11 - 1) & this.f37601a) * 2;
    }

    public final Object g(int i11, int i12, Object obj) {
        int iZ = 1 << h0.z(i11, i12);
        if (h(iZ)) {
            int iF = f(iZ);
            if (Intrinsics.areEqual(obj, this.f37604d[iF])) {
                return x(iF);
            }
            return null;
        }
        if (!i(iZ)) {
            return null;
        }
        l lVarS = s(t(iZ));
        if (i12 != 30) {
            return lVarS.g(i11, i12 + 5, obj);
        }
        kotlin.ranges.a aVarH = p.h(2, p.j(0, lVarS.f37604d.length));
        int i13 = aVarH.f26553a;
        int i14 = aVarH.f26554b;
        int i15 = aVarH.f26555c;
        if ((i15 <= 0 || i13 > i14) && (i15 >= 0 || i14 > i13)) {
            return null;
        }
        while (!Intrinsics.areEqual(obj, lVarS.f37604d[i13])) {
            if (i13 == i14) {
                return null;
            }
            i13 += i15;
        }
        return lVarS.x(i13);
    }

    public final boolean h(int i11) {
        return (i11 & this.f37601a) != 0;
    }

    public final boolean i(int i11) {
        return (i11 & this.f37602b) != 0;
    }

    public final l k(int i11, d dVar) {
        dVar.h(dVar.f37588f - 1);
        dVar.f37586d = x(i11);
        Object[] objArr = this.f37604d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f37603c != dVar.f37584b) {
            return new l(0, 0, h0.l(i11, objArr), dVar.f37584b);
        }
        this.f37604d = h0.l(i11, objArr);
        return this;
    }

    public final l l(int i11, Object obj, Object obj2, int i12, d dVar) {
        d dVar2;
        l lVarL;
        int iZ = 1 << h0.z(i11, i12);
        boolean zH = h(iZ);
        t3.b bVar = this.f37603c;
        if (zH) {
            int iF = f(iZ);
            if (!Intrinsics.areEqual(obj, this.f37604d[iF])) {
                dVar.h(dVar.f37588f + 1);
                t3.b bVar2 = dVar.f37584b;
                if (bVar != bVar2) {
                    return new l(this.f37601a ^ iZ, this.f37602b | iZ, a(iF, iZ, i11, obj, obj2, i12, bVar2), bVar2);
                }
                this.f37604d = a(iF, iZ, i11, obj, obj2, i12, bVar2);
                this.f37601a ^= iZ;
                this.f37602b |= iZ;
                return this;
            }
            dVar.f37586d = x(iF);
            if (x(iF) == obj2) {
                return this;
            }
            if (bVar == dVar.f37584b) {
                this.f37604d[iF + 1] = obj2;
                return this;
            }
            dVar.f37587e++;
            Object[] objArr = this.f37604d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            objArrCopyOf[iF + 1] = obj2;
            return new l(this.f37601a, this.f37602b, objArrCopyOf, dVar.f37584b);
        }
        if (!i(iZ)) {
            dVar.h(dVar.f37588f + 1);
            t3.b bVar3 = dVar.f37584b;
            int iF2 = f(iZ);
            Object[] objArr2 = this.f37604d;
            if (bVar != bVar3) {
                return new l(this.f37601a | iZ, this.f37602b, h0.k(objArr2, iF2, obj, obj2), bVar3);
            }
            this.f37604d = h0.k(objArr2, iF2, obj, obj2);
            this.f37601a |= iZ;
            return this;
        }
        int iT = t(iZ);
        l lVarS = s(iT);
        if (i12 == 30) {
            kotlin.ranges.a aVarH = p.h(2, p.j(0, lVarS.f37604d.length));
            int i13 = aVarH.f26553a;
            int i14 = aVarH.f26554b;
            int i15 = aVarH.f26555c;
            if ((i15 <= 0 || i13 > i14) && (i15 >= 0 || i14 > i13)) {
                dVar.h(dVar.f37588f + 1);
                lVarL = new l(0, 0, h0.k(lVarS.f37604d, 0, obj, obj2), dVar.f37584b);
                dVar2 = dVar;
            } else {
                while (!Intrinsics.areEqual(obj, lVarS.f37604d[i13])) {
                    if (i13 == i14) {
                        dVar.h(dVar.f37588f + 1);
                        lVarL = new l(0, 0, h0.k(lVarS.f37604d, 0, obj, obj2), dVar.f37584b);
                        break;
                    }
                    i13 += i15;
                }
                dVar.f37586d = lVarS.x(i13);
                if (lVarS.f37603c == dVar.f37584b) {
                    lVarS.f37604d[i13 + 1] = obj2;
                    lVarL = lVarS;
                } else {
                    dVar.f37587e++;
                    Object[] objArr3 = lVarS.f37604d;
                    Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length);
                    objArrCopyOf2[i13 + 1] = obj2;
                    lVarL = new l(0, 0, objArrCopyOf2, dVar.f37584b);
                }
                dVar2 = dVar;
            }
        } else {
            dVar2 = dVar;
            lVarL = lVarS.l(i11, obj, obj2, i12 + 5, dVar2);
        }
        return lVarS == lVarL ? this : r(iT, lVarL, dVar2.f37584b);
    }

    public final l m(l lVar, int i11, t3.a aVar, d dVar) {
        Object[] objArr;
        l lVarJ;
        if (this == lVar) {
            aVar.f39777a += b();
            return this;
        }
        int i12 = 0;
        if (i11 > 30) {
            t3.b bVar = dVar.f37584b;
            int i13 = lVar.f37602b;
            Object[] objArr2 = this.f37604d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length + lVar.f37604d.length);
            int length = this.f37604d.length;
            kotlin.ranges.a aVarH = p.h(2, p.j(0, lVar.f37604d.length));
            int i14 = aVarH.f26553a;
            int i15 = aVarH.f26554b;
            int i16 = aVarH.f26555c;
            if ((i16 > 0 && i14 <= i15) || (i16 < 0 && i15 <= i14)) {
                while (true) {
                    if (c(lVar.f37604d[i14])) {
                        aVar.f39777a++;
                    } else {
                        Object[] objArr3 = lVar.f37604d;
                        objArrCopyOf[length] = objArr3[i14];
                        objArrCopyOf[length + 1] = objArr3[i14 + 1];
                        length += 2;
                    }
                    if (i14 == i15) {
                        break;
                    }
                    i14 += i16;
                }
            }
            if (length != this.f37604d.length) {
                return length == lVar.f37604d.length ? lVar : length == objArrCopyOf.length ? new l(0, 0, objArrCopyOf, bVar) : new l(0, 0, Arrays.copyOf(objArrCopyOf, length), bVar);
            }
        } else {
            int i17 = this.f37602b | lVar.f37602b;
            int i18 = this.f37601a;
            int i19 = lVar.f37601a;
            int i21 = (i18 ^ i19) & (~i17);
            int i22 = i18 & i19;
            int i23 = i21;
            while (i22 != 0) {
                int iLowestOneBit = Integer.lowestOneBit(i22);
                if (Intrinsics.areEqual(this.f37604d[f(iLowestOneBit)], lVar.f37604d[lVar.f(iLowestOneBit)])) {
                    i23 |= iLowestOneBit;
                } else {
                    i17 |= iLowestOneBit;
                }
                i22 ^= iLowestOneBit;
            }
            if ((i17 & i23) != 0) {
                s1.b("Check failed.");
            }
            l lVar2 = (Intrinsics.areEqual(this.f37603c, dVar.f37584b) && this.f37601a == i23 && this.f37602b == i17) ? this : new l(i23, i17, new Object[Integer.bitCount(i17) + (Integer.bitCount(i23) * 2)], null);
            int i24 = i17;
            int i25 = 0;
            while (i24 != 0) {
                int iLowestOneBit2 = Integer.lowestOneBit(i24);
                Object[] objArr4 = lVar2.f37604d;
                int length2 = (objArr4.length - 1) - i25;
                if (i(iLowestOneBit2)) {
                    lVarJ = s(t(iLowestOneBit2));
                    if (lVar.i(iLowestOneBit2)) {
                        lVarJ = lVarJ.m(lVar.s(lVar.t(iLowestOneBit2)), i11 + 5, aVar, dVar);
                        objArr = objArr4;
                    } else if (lVar.h(iLowestOneBit2)) {
                        int iF = lVar.f(iLowestOneBit2);
                        Object obj = lVar.f37604d[iF];
                        Object objX = lVar.x(iF);
                        int i26 = dVar.f37588f;
                        objArr = objArr4;
                        lVarJ = lVarJ.l(obj != null ? obj.hashCode() : i12, obj, objX, i11 + 5, dVar);
                        if (dVar.f37588f == i26) {
                            aVar.f39777a++;
                        }
                    } else {
                        objArr = objArr4;
                    }
                } else {
                    objArr = objArr4;
                    if (lVar.i(iLowestOneBit2)) {
                        l lVarS = lVar.s(lVar.t(iLowestOneBit2));
                        if (h(iLowestOneBit2)) {
                            int iF2 = f(iLowestOneBit2);
                            Object obj2 = this.f37604d[iF2];
                            int i27 = i11 + 5;
                            if (lVarS.d(obj2 != null ? obj2.hashCode() : 0, i27, obj2)) {
                                aVar.f39777a++;
                                lVarJ = lVarS;
                            } else {
                                lVarJ = lVarS.l(obj2 != null ? obj2.hashCode() : 0, obj2, x(iF2), i27, dVar);
                            }
                        } else {
                            lVarJ = lVarS;
                        }
                    } else {
                        int iF3 = f(iLowestOneBit2);
                        Object obj3 = this.f37604d[iF3];
                        Object objX2 = x(iF3);
                        int iF4 = lVar.f(iLowestOneBit2);
                        Object obj4 = lVar.f37604d[iF4];
                        lVarJ = j(obj3 != null ? obj3.hashCode() : 0, obj3, objX2, obj4 != null ? obj4.hashCode() : 0, obj4, lVar.x(iF4), i11 + 5, dVar.f37584b);
                    }
                }
                objArr[length2] = lVarJ;
                i25++;
                i24 ^= iLowestOneBit2;
                i12 = 0;
            }
            int i28 = 0;
            while (i23 != 0) {
                int iLowestOneBit3 = Integer.lowestOneBit(i23);
                int i29 = i28 * 2;
                if (lVar.h(iLowestOneBit3)) {
                    int iF5 = lVar.f(iLowestOneBit3);
                    Object[] objArr5 = lVar2.f37604d;
                    objArr5[i29] = lVar.f37604d[iF5];
                    objArr5[i29 + 1] = lVar.x(iF5);
                    if (h(iLowestOneBit3)) {
                        aVar.f39777a++;
                    }
                } else {
                    int iF6 = f(iLowestOneBit3);
                    Object[] objArr6 = lVar2.f37604d;
                    objArr6[i29] = this.f37604d[iF6];
                    objArr6[i29 + 1] = x(iF6);
                }
                i28++;
                i23 ^= iLowestOneBit3;
            }
            if (!e(lVar2)) {
                return lVar.e(lVar2) ? lVar : lVar2;
            }
        }
        return this;
    }

    public final l n(int i11, Object obj, int i12, d dVar) {
        l lVarN;
        int iZ = 1 << h0.z(i11, i12);
        if (h(iZ)) {
            int iF = f(iZ);
            if (Intrinsics.areEqual(obj, this.f37604d[iF])) {
                return p(iF, iZ, dVar);
            }
        } else if (i(iZ)) {
            int iT = t(iZ);
            l lVarS = s(iT);
            if (i12 == 30) {
                kotlin.ranges.a aVarH = p.h(2, p.j(0, lVarS.f37604d.length));
                int i13 = aVarH.f26553a;
                int i14 = aVarH.f26554b;
                int i15 = aVarH.f26555c;
                if ((i15 <= 0 || i13 > i14) && (i15 >= 0 || i14 > i13)) {
                    lVarN = lVarS;
                    break;
                }
                while (!Intrinsics.areEqual(obj, lVarS.f37604d[i13])) {
                    if (i13 == i14) {
                        lVarN = lVarS;
                        break;
                    }
                    i13 += i15;
                }
                lVarN = lVarS.k(i13, dVar);
            } else {
                lVarN = lVarS.n(i11, obj, i12 + 5, dVar);
            }
            return q(lVarS, lVarN, iT, iZ, dVar.f37584b);
        }
        return this;
    }

    public final l o(int i11, Object obj, Object obj2, int i12, d dVar) {
        l lVar;
        l lVarO;
        int iZ = 1 << h0.z(i11, i12);
        if (h(iZ)) {
            int iF = f(iZ);
            if (Intrinsics.areEqual(obj, this.f37604d[iF]) && Intrinsics.areEqual(obj2, x(iF))) {
                return p(iF, iZ, dVar);
            }
        } else if (i(iZ)) {
            int iT = t(iZ);
            l lVarS = s(iT);
            if (i12 == 30) {
                kotlin.ranges.a aVarH = p.h(2, p.j(0, lVarS.f37604d.length));
                int i13 = aVarH.f26553a;
                int i14 = aVarH.f26554b;
                int i15 = aVarH.f26555c;
                if ((i15 <= 0 || i13 > i14) && (i15 >= 0 || i14 > i13)) {
                    lVarO = lVarS;
                    lVar = lVarS;
                } else {
                    while (true) {
                        if (!Intrinsics.areEqual(obj, lVarS.f37604d[i13]) || !Intrinsics.areEqual(obj2, lVarS.x(i13))) {
                            if (i13 == i14) {
                                break;
                            }
                            i13 += i15;
                        } else {
                            lVarO = lVarS.k(i13, dVar);
                            break;
                        }
                    }
                    lVarO = lVarS;
                    lVar = lVarS;
                }
            } else {
                lVar = lVarS;
                lVarO = lVar.o(i11, obj, obj2, i12 + 5, dVar);
            }
            return q(lVar, lVarO, iT, iZ, dVar.f37584b);
        }
        return this;
    }

    public final l p(int i11, int i12, d dVar) {
        dVar.h(dVar.f37588f - 1);
        dVar.f37586d = x(i11);
        Object[] objArr = this.f37604d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f37603c != dVar.f37584b) {
            return new l(i12 ^ this.f37601a, this.f37602b, h0.l(i11, objArr), dVar.f37584b);
        }
        this.f37604d = h0.l(i11, objArr);
        this.f37601a ^= i12;
        return this;
    }

    public final l q(l lVar, l lVar2, int i11, int i12, t3.b bVar) {
        t3.b bVar2 = this.f37603c;
        if (lVar2 != null) {
            return (bVar2 == bVar || lVar != lVar2) ? r(i11, lVar2, bVar) : this;
        }
        Object[] objArr = this.f37604d;
        if (objArr.length == 1) {
            return null;
        }
        if (bVar2 != bVar) {
            return new l(this.f37601a, i12 ^ this.f37602b, h0.m(i11, objArr), bVar);
        }
        this.f37604d = h0.m(i11, objArr);
        this.f37602b ^= i12;
        return this;
    }

    public final l r(int i11, l lVar, t3.b bVar) {
        Object[] objArr = this.f37604d;
        if (objArr.length == 1 && lVar.f37604d.length == 2 && lVar.f37602b == 0) {
            lVar.f37601a = this.f37602b;
            return lVar;
        }
        if (this.f37603c == bVar) {
            objArr[i11] = lVar;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i11] = lVar;
        return new l(this.f37601a, this.f37602b, objArrCopyOf, bVar);
    }

    public final l s(int i11) {
        Object obj = this.f37604d[i11];
        obj.getClass();
        return (l) obj;
    }

    public final int t(int i11) {
        return (this.f37604d.length - 1) - Integer.bitCount((i11 - 1) & this.f37602b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00cf, code lost:
    
        if (r14 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d8, code lost:
    
        if (r14 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00db, code lost:
    
        r14.f2543c = w(r12, r4, (r3.l) r14.f2543c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e5, code lost:
    
        return r14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.constraintlayout.widget.z u(int r12, java.lang.Object r13, java.lang.Object r14, int r15) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r3.l.u(int, java.lang.Object, java.lang.Object, int):androidx.constraintlayout.widget.z");
    }

    public final l v(int i11, int i12, Object obj) {
        l lVarV;
        int iZ = 1 << h0.z(i11, i12);
        if (h(iZ)) {
            int iF = f(iZ);
            if (Intrinsics.areEqual(obj, this.f37604d[iF])) {
                Object[] objArr = this.f37604d;
                if (objArr.length != 2) {
                    return new l(this.f37601a ^ iZ, this.f37602b, h0.l(iF, objArr), null);
                }
                return null;
            }
            return this;
        }
        if (i(iZ)) {
            int iT = t(iZ);
            l lVarS = s(iT);
            if (i12 == 30) {
                kotlin.ranges.a aVarH = p.h(2, p.j(0, lVarS.f37604d.length));
                int i13 = aVarH.f26553a;
                int i14 = aVarH.f26554b;
                int i15 = aVarH.f26555c;
                if ((i15 > 0 && i13 <= i14) || (i15 < 0 && i14 <= i13)) {
                    while (!Intrinsics.areEqual(obj, lVarS.f37604d[i13])) {
                        if (i13 != i14) {
                            i13 += i15;
                        }
                    }
                    Object[] objArr2 = lVarS.f37604d;
                    lVarV = objArr2.length == 2 ? null : new l(0, 0, h0.l(i13, objArr2), null);
                }
                lVarV = lVarS;
                break;
            }
            lVarV = lVarS.v(i11, i12 + 5, obj);
            if (lVarV == null) {
                Object[] objArr3 = this.f37604d;
                if (objArr3.length != 1) {
                    return new l(this.f37601a, iZ ^ this.f37602b, h0.m(iT, objArr3), null);
                }
                return null;
            }
            if (lVarS != lVarV) {
                return w(iT, iZ, lVarV);
            }
        }
        return this;
    }

    public final l w(int i11, int i12, l lVar) {
        Object[] objArr = lVar.f37604d;
        if (objArr.length != 2 || lVar.f37602b != 0) {
            Object[] objArr2 = this.f37604d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            objArrCopyOf[i11] = lVar;
            return new l(this.f37601a, this.f37602b, objArrCopyOf, null);
        }
        if (this.f37604d.length == 1) {
            lVar.f37601a = this.f37602b;
            return lVar;
        }
        int iF = f(i12);
        Object[] objArr3 = this.f37604d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        x.d(i11 + 2, i11 + 1, objArr3.length, objArrCopyOf2, objArrCopyOf2);
        x.d(iF + 2, iF, i11, objArrCopyOf2, objArrCopyOf2);
        objArrCopyOf2[iF] = obj;
        objArrCopyOf2[iF + 1] = obj2;
        return new l(this.f37601a ^ i12, i12 ^ this.f37602b, objArrCopyOf2, null);
    }

    public final Object x(int i11) {
        return this.f37604d[i11 + 1];
    }
}
