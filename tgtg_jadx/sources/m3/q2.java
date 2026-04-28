package m3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m2 f29382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f29383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f29384c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f29385d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public HashMap f29386e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public q1.g0 f29387f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f29388g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f29389h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f29390i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f29391j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f29392k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f29393m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f29394n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f29395o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b5.y f29396p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b5.y f29397q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b5.y f29398r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public q1.g0 f29399s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f29400t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f29401u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f29402v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f29403w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public q1.f0 f29404x;

    public q2(m2 m2Var) {
        this.f29382a = m2Var;
        int[] iArr = m2Var.f29337a;
        this.f29383b = iArr;
        Object[] objArr = m2Var.f29339c;
        this.f29384c = objArr;
        this.f29385d = m2Var.f29345i;
        this.f29386e = m2Var.f29346j;
        this.f29387f = m2Var.f29347k;
        int i11 = m2Var.f29338b;
        this.f29388g = i11;
        this.f29389h = (iArr.length / 5) - i11;
        int i12 = m2Var.f29340d;
        this.f29392k = i12;
        this.l = objArr.length - i12;
        this.f29393m = i11;
        this.f29396p = new b5.y();
        this.f29397q = new b5.y();
        this.f29398r = new b5.y();
        this.f29401u = i11;
        this.f29402v = -1;
    }

    public static int i(int i11, int i12, int i13, int i14) {
        return i11 > i12 ? -(((i14 - i13) - i11) + 1) : i11;
    }

    public static void z(q2 q2Var) {
        int i11 = q2Var.f29402v;
        int iR = q2Var.r(i11);
        int[] iArr = q2Var.f29383b;
        int i12 = (iR * 5) + 1;
        int i13 = iArr[i12];
        if ((i13 & 134217728) != 0) {
            return;
        }
        int i14 = (i13 & (-134217729)) | 134217728;
        iArr[i12] = i14;
        if ((67108864 & i14) != 0) {
            return;
        }
        q2Var.W(q2Var.G(i11, iArr));
    }

    public final void A(m2 m2Var, int i11) {
        if (this.f29394n <= 0) {
            v.a("Check failed");
        }
        if (i11 == 0 && this.f29400t == 0 && this.f29382a.f29338b == 0) {
            int[] iArr = m2Var.f29337a;
            int i12 = iArr[(i11 * 5) + 3];
            int i13 = m2Var.f29338b;
            if (i12 == i13) {
                int[] iArr2 = this.f29383b;
                Object[] objArr = this.f29384c;
                ArrayList arrayList = this.f29385d;
                HashMap map = this.f29386e;
                q1.g0 g0Var = this.f29387f;
                Object[] objArr2 = m2Var.f29339c;
                int i14 = m2Var.f29340d;
                HashMap map2 = m2Var.f29346j;
                q1.g0 g0Var2 = m2Var.f29347k;
                this.f29383b = iArr;
                this.f29384c = objArr2;
                this.f29385d = m2Var.f29345i;
                this.f29388g = i13;
                this.f29389h = (iArr.length / 5) - i13;
                this.f29392k = i14;
                this.l = objArr2.length - i14;
                this.f29393m = i13;
                this.f29386e = map2;
                this.f29387f = g0Var2;
                m2Var.f29337a = iArr2;
                m2Var.f29338b = 0;
                m2Var.f29339c = objArr;
                m2Var.f29340d = 0;
                m2Var.f29345i = arrayList;
                m2Var.f29346j = map;
                m2Var.f29347k = g0Var;
                return;
            }
        }
        q2 q2VarG = m2Var.g();
        try {
            p2.a(q2VarG, i11, this, true, true, false);
            q2VarG.e(true);
        } catch (Throwable th2) {
            q2VarG.e(false);
            throw th2;
        }
    }

    public final void B(int i11) {
        a aVar;
        int i12;
        a aVar2;
        int i13;
        int i14;
        int i15 = this.f29389h;
        int i16 = this.f29388g;
        if (i16 != i11) {
            if (!this.f29385d.isEmpty()) {
                int iO = o() - this.f29389h;
                ArrayList arrayList = this.f29385d;
                if (i16 < i11) {
                    for (int iA = o2.a(arrayList, i16, iO); iA < this.f29385d.size() && (i13 = (aVar2 = (a) this.f29385d.get(iA)).f29174a) < 0 && (i14 = i13 + iO) < i11; iA++) {
                        aVar2.f29174a = i14;
                    }
                } else {
                    for (int iA2 = o2.a(arrayList, i11, iO); iA2 < this.f29385d.size() && (i12 = (aVar = (a) this.f29385d.get(iA2)).f29174a) >= 0; iA2++) {
                        aVar.f29174a = -(iO - i12);
                    }
                }
            }
            if (i15 > 0) {
                int[] iArr = this.f29383b;
                int i17 = i11 * 5;
                int i18 = i15 * 5;
                int i19 = i16 * 5;
                if (i11 < i16) {
                    kotlin.collections.x.f(i18 + i17, iArr, i17, i19, iArr);
                } else {
                    kotlin.collections.x.f(i19, iArr, i19 + i18, i17 + i18, iArr);
                }
            }
            if (i11 < i16) {
                i16 = i11 + i15;
            }
            int iO2 = o();
            if (i16 >= iO2) {
                v.a("Check failed");
            }
            while (i16 < iO2) {
                int i21 = (i16 * 5) + 2;
                int i22 = this.f29383b[i21];
                int iP = i22 > -2 ? i22 : (p() + i22) - (-2);
                if (iP >= i11) {
                    iP = -((p() - iP) - (-2));
                }
                if (iP != i22) {
                    this.f29383b[i21] = iP;
                }
                i16++;
                if (i16 == i11) {
                    i16 += i15;
                }
            }
        }
        this.f29388g = i11;
    }

    public final void C(int i11, int i12) {
        int i13 = this.l;
        int i14 = this.f29392k;
        int i15 = this.f29393m;
        if (i14 != i11) {
            Object[] objArr = this.f29384c;
            if (i11 < i14) {
                System.arraycopy(objArr, i11, objArr, i11 + i13, i14 - i11);
            } else {
                int i16 = i14 + i13;
                System.arraycopy(objArr, i16, objArr, i14, (i11 + i13) - i16);
            }
        }
        int iMin = Math.min(i12 + 1, p());
        if (i15 != iMin) {
            int length = this.f29384c.length - i13;
            if (iMin < i15) {
                int iR = r(iMin);
                int iR2 = r(i15);
                int i17 = this.f29388g;
                while (iR < iR2) {
                    int i18 = (iR * 5) + 4;
                    int i19 = this.f29383b[i18];
                    if (i19 < 0) {
                        v.a("Unexpected anchor value, expected a positive anchor");
                    }
                    this.f29383b[i18] = -((length - i19) + 1);
                    iR++;
                    if (iR == i17) {
                        iR += this.f29389h;
                    }
                }
            } else {
                int iR3 = r(i15);
                int iR4 = r(iMin);
                while (iR3 < iR4) {
                    int i21 = (iR3 * 5) + 4;
                    int i22 = this.f29383b[i21];
                    if (i22 >= 0) {
                        v.a("Unexpected anchor value, expected a negative anchor");
                    }
                    this.f29383b[i21] = i22 + length + 1;
                    iR3++;
                    if (iR3 == this.f29388g) {
                        iR3 += this.f29389h;
                    }
                }
            }
            this.f29393m = iMin;
        }
        this.f29392k = i11;
    }

    public final List D(a aVar, q2 q2Var) {
        if (q2Var.f29394n <= 0) {
            v.a("Check failed");
        }
        if (this.f29394n != 0) {
            v.a("Check failed");
        }
        if (!aVar.a()) {
            v.a("Check failed");
        }
        int iC = c(aVar) + 1;
        int i11 = this.f29400t;
        if (i11 > iC || iC >= this.f29401u) {
            v.a("Check failed");
        }
        int iG = G(iC, this.f29383b);
        int iU = u(iC);
        int iF = y(iC) ? 1 : F(iC);
        List listA = p2.a(this, iC, q2Var, false, false, true);
        W(iG);
        boolean z11 = iF > 0;
        while (iG >= i11) {
            int iR = r(iG);
            int[] iArr = this.f29383b;
            int i12 = iR * 5;
            int i13 = i12 + 3;
            iArr[i13] = iArr[i13] - iU;
            if (z11) {
                int i14 = iArr[i12 + 1];
                if ((1073741824 & i14) != 0) {
                    z11 = false;
                } else {
                    o2.c(iR, (i14 & 67108863) - iF, iArr);
                }
            }
            iG = G(iG, this.f29383b);
        }
        if (z11) {
            if (this.f29395o < iF) {
                v.a("Check failed");
            }
            this.f29395o -= iF;
        }
        return listA;
    }

    public final Object E(int i11) {
        int iR = r(i11);
        int[] iArr = this.f29383b;
        if ((iArr[(iR * 5) + 1] & 1073741824) != 0) {
            return this.f29384c[h(g(iR, iArr))];
        }
        return null;
    }

    public final int F(int i11) {
        return this.f29383b[(r(i11) * 5) + 1] & 67108863;
    }

    public final int G(int i11, int[] iArr) {
        int i12 = iArr[(r(i11) * 5) + 2];
        return i12 > -2 ? i12 : (p() + i12) - (-2);
    }

    public final Object H(Object obj) {
        if (this.f29394n > 0) {
            x(1, this.f29402v);
        }
        Object[] objArr = this.f29384c;
        int i11 = this.f29390i;
        this.f29390i = i11 + 1;
        Object obj2 = objArr[h(i11)];
        if (this.f29390i > this.f29391j) {
            v.a("Writing to an invalid slot");
        }
        this.f29384c[h(this.f29390i - 1)] = obj;
        return obj2;
    }

    public final void I() {
        int i11;
        q1.f0 f0Var = this.f29404x;
        if (f0Var != null) {
            while (f0Var.f35790b != 0) {
                int iE = i.E(f0Var);
                int iR = r(iE);
                int iU = iE + 1;
                int iU2 = u(iE) + iE;
                while (true) {
                    if (iU >= iU2) {
                        i11 = 0;
                        break;
                    } else {
                        if ((this.f29383b[(r(iU) * 5) + 1] & 201326592) != 0) {
                            i11 = 1;
                            break;
                        }
                        iU += u(iU);
                    }
                }
                int[] iArr = this.f29383b;
                int i12 = (iR * 5) + 1;
                int i13 = iArr[i12];
                if (((67108864 & i13) != 0 ? 1 : 0) != i11) {
                    iArr[i12] = (i11 << 26) | ((-67108865) & i13);
                    int iG = G(iE, iArr);
                    if (iG >= 0) {
                        i.k(f0Var, iG);
                    }
                }
            }
        }
    }

    public final boolean J() {
        if (this.f29394n != 0) {
            v.a("Cannot remove group while inserting");
        }
        int i11 = this.f29400t;
        int i12 = this.f29390i;
        int iG = g(r(i11), this.f29383b);
        int iN = N();
        Q(this.f29402v);
        q1.f0 f0Var = this.f29404x;
        if (f0Var != null) {
            while (true) {
                int i13 = f0Var.f35790b;
                if (i13 == 0) {
                    break;
                }
                if (i13 == 0) {
                    qc.y.h("IntList is empty.");
                    return false;
                }
                if (f0Var.f35789a[0] < i11) {
                    break;
                }
                i.E(f0Var);
            }
        }
        boolean zK = K(i11, this.f29400t - i11);
        L(iG, this.f29390i - iG, i11 - 1);
        this.f29400t = i11;
        this.f29390i = i12;
        this.f29395o -= iN;
        return zK;
    }

    public final boolean K(int i11, int i12) {
        if (i12 > 0) {
            ArrayList arrayList = this.f29385d;
            B(i11);
            if (!arrayList.isEmpty()) {
                HashMap map = this.f29386e;
                int i13 = i11 + i12;
                int iA = o2.a(this.f29385d, i13, o() - this.f29389h);
                if (iA >= this.f29385d.size()) {
                    iA--;
                }
                int i14 = iA + 1;
                int i15 = 0;
                while (iA >= 0) {
                    a aVar = (a) this.f29385d.get(iA);
                    int iC = c(aVar);
                    if (iC < i11) {
                        break;
                    }
                    if (iC < i13) {
                        aVar.f29174a = Integer.MIN_VALUE;
                        if (map != null) {
                        }
                        if (i15 == 0) {
                            i15 = iA + 1;
                        }
                        i14 = iA;
                    }
                    iA--;
                }
                z = i14 < i15;
                if (z) {
                    this.f29385d.subList(i14, i15).clear();
                }
            }
            this.f29388g = i11;
            this.f29389h += i12;
            int i16 = this.f29393m;
            if (i16 > i11) {
                this.f29393m = Math.max(i11, i16 - i12);
            }
            int i17 = this.f29401u;
            if (i17 >= this.f29388g) {
                this.f29401u = i17 - i12;
            }
            int i18 = this.f29402v;
            if (i18 >= 0 && (this.f29383b[(r(i18) * 5) + 1] & 67108864) != 0) {
                W(i18);
            }
        }
        return z;
    }

    public final void L(int i11, int i12, int i13) {
        if (i12 > 0) {
            int i14 = this.l;
            int i15 = i11 + i12;
            C(i15, i13);
            this.f29392k = i11;
            this.l = i14 + i12;
            Arrays.fill(this.f29384c, i11, i15, (Object) null);
            int i16 = this.f29391j;
            if (i16 >= i11) {
                this.f29391j = i16 - i12;
            }
        }
    }

    public final Object M(int i11, int i12, Object obj) {
        int iP = P(r(i11), this.f29383b);
        int iG = g(r(i11 + 1), this.f29383b);
        int i13 = iP + i12;
        if (i13 < iP || i13 >= iG) {
            v.a("Write to an invalid slot index " + i12 + " for group " + i11);
        }
        int iH = h(i13);
        Object[] objArr = this.f29384c;
        Object obj2 = objArr[iH];
        objArr[iH] = obj;
        return obj2;
    }

    public final int N() {
        int iR = r(this.f29400t);
        int i11 = this.f29400t;
        int[] iArr = this.f29383b;
        int i12 = iR * 5;
        int i13 = iArr[i12 + 3] + i11;
        this.f29400t = i13;
        this.f29390i = g(r(i13), iArr);
        int i14 = this.f29383b[i12 + 1];
        if ((1073741824 & i14) != 0) {
            return 1;
        }
        return i14 & 67108863;
    }

    public final void O() {
        int i11 = this.f29401u;
        this.f29400t = i11;
        this.f29390i = g(r(i11), this.f29383b);
    }

    public final int P(int i11, int[] iArr) {
        if (i11 >= o()) {
            return this.f29384c.length - this.l;
        }
        int iB = o2.b(i11, iArr);
        return iB < 0 ? (this.f29384c.length - this.l) + iB + 1 : iB;
    }

    public final q0 Q(int i11) {
        a aVarT;
        HashMap map = this.f29386e;
        if (map == null || (aVarT = T(i11)) == null) {
            return null;
        }
        return (q0) map.get(aVarT);
    }

    public final void R() {
        if (this.f29394n != 0) {
            v.a("Key must be supplied when inserting");
        }
        f fVar = m.f29332a;
        S(fVar, fVar, false, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void S(Object obj, Object obj2, boolean z11, int i11) {
        int i12;
        int i13 = this.f29402v;
        Object[] objArr = this.f29394n > 0;
        this.f29398r.c(this.f29395o);
        f fVar = m.f29332a;
        if (objArr == true) {
            int i14 = this.f29400t;
            int iG = g(r(i14), this.f29383b);
            w(1);
            this.f29390i = iG;
            this.f29391j = iG;
            int iR = r(i14);
            int i15 = obj != fVar ? 1 : 0;
            int i16 = (z11 || obj2 == fVar) ? 0 : 1;
            int i17 = i(iG, this.f29392k, this.l, this.f29384c.length);
            if (i17 >= 0 && this.f29393m < i14) {
                i17 = -(((this.f29384c.length - this.l) - i17) + 1);
            }
            int[] iArr = this.f29383b;
            int i18 = this.f29402v;
            int i19 = iR * 5;
            iArr[i19] = i11;
            iArr[i19 + 1] = ((z11 ? 1 : 0) << 30) | (i15 << 29) | (i16 << 28);
            iArr[i19 + 2] = i18;
            iArr[i19 + 3] = 0;
            iArr[i19 + 4] = i17;
            int i21 = (z11 ? 1 : 0) + i15 + i16;
            if (i21 > 0) {
                x(i21, i14);
                Object[] objArr2 = this.f29384c;
                int i22 = this.f29390i;
                if (z11) {
                    objArr2[i22] = obj2;
                    i22++;
                }
                if (i15 != 0) {
                    objArr2[i22] = obj;
                    i22++;
                }
                if (i16 != 0) {
                    objArr2[i22] = obj2;
                    i22++;
                }
                this.f29390i = i22;
            }
            this.f29395o = 0;
            i12 = i14 + 1;
            this.f29402v = i14;
            this.f29400t = i12;
            if (i13 >= 0) {
                Q(i13);
            }
        } else {
            this.f29396p.c(i13);
            this.f29397q.c((o() - this.f29389h) - this.f29401u);
            int i23 = this.f29400t;
            int iR2 = r(i23);
            if (!Intrinsics.areEqual(obj2, fVar)) {
                if (z11) {
                    X(this.f29400t, obj2);
                } else {
                    V(obj2);
                }
            }
            this.f29390i = P(iR2, this.f29383b);
            this.f29391j = g(r(this.f29400t + 1), this.f29383b);
            int[] iArr2 = this.f29383b;
            int i24 = iR2 * 5;
            this.f29395o = iArr2[i24 + 1] & 67108863;
            this.f29402v = i23;
            this.f29400t = i23 + 1;
            i12 = i23 + iArr2[i24 + 3];
        }
        this.f29401u = i12;
    }

    public final a T(int i11) {
        ArrayList arrayList;
        int iD;
        if (i11 < 0 || i11 >= p() || (iD = o2.d((arrayList = this.f29385d), i11, p())) < 0) {
            return null;
        }
        return (a) arrayList.get(iD);
    }

    public final void U(Object obj) {
        if (this.f29394n <= 0 || this.f29390i == this.f29392k) {
            H(obj);
            return;
        }
        q1.g0 g0Var = this.f29399s;
        if (g0Var == null) {
            g0Var = new q1.g0();
        }
        this.f29399s = g0Var;
        int i11 = this.f29402v;
        Object objB = g0Var.b(i11);
        if (objB == null) {
            objB = new q1.o0();
            g0Var.i(i11, objB);
        }
        ((q1.o0) objB).g(obj);
    }

    public final void V(Object obj) {
        int iR = r(this.f29400t);
        int i11 = (iR * 5) + 1;
        if ((this.f29383b[i11] & 268435456) == 0) {
            v.a("Updating the data of a group that was not created with a data slot");
        }
        Object[] objArr = this.f29384c;
        int[] iArr = this.f29383b;
        objArr[h(Integer.bitCount(iArr[i11] >> 29) + g(iR, iArr))] = obj;
    }

    public final void W(int i11) {
        if (i11 >= 0) {
            q1.f0 f0Var = this.f29404x;
            if (f0Var == null) {
                f0Var = new q1.f0();
                this.f29404x = f0Var;
            }
            i.k(f0Var, i11);
        }
    }

    public final void X(int i11, Object obj) {
        int iR = r(i11);
        int[] iArr = this.f29383b;
        if (iR >= iArr.length || (iArr[(iR * 5) + 1] & 1073741824) == 0) {
            v.a("Updating the node of a group at " + i11 + " that was not created with as a node group");
        }
        this.f29384c[h(g(iR, this.f29383b))] = obj;
    }

    public final void a(int i11) {
        if (i11 < 0) {
            v.a("Cannot seek backwards");
        }
        if (this.f29394n > 0) {
            s1.b("Cannot call seek() while inserting");
        }
        if (i11 == 0) {
            return;
        }
        int i12 = this.f29400t + i11;
        if (i12 < this.f29402v || i12 > this.f29401u) {
            v.a("Cannot seek outside the current group (" + this.f29402v + '-' + this.f29401u + ')');
        }
        this.f29400t = i12;
        int iG = g(r(i12), this.f29383b);
        this.f29390i = iG;
        this.f29391j = iG;
    }

    public final a b(int i11) {
        ArrayList arrayList = this.f29385d;
        int iD = o2.d(arrayList, i11, p());
        if (iD >= 0) {
            return (a) arrayList.get(iD);
        }
        if (i11 > this.f29388g) {
            i11 = -(p() - i11);
        }
        a aVar = new a(i11);
        arrayList.add(-(iD + 1), aVar);
        return aVar;
    }

    public final int c(a aVar) {
        int i11 = aVar.f29174a;
        return i11 < 0 ? p() + i11 : i11;
    }

    public final void d() {
        int i11 = this.f29394n;
        this.f29394n = i11 + 1;
        if (i11 == 0) {
            this.f29397q.c((o() - this.f29389h) - this.f29401u);
        }
    }

    public final void e(boolean z11) {
        this.f29403w = true;
        if (z11 && this.f29396p.f6016b == 0) {
            B(p());
            C(this.f29384c.length - this.l, this.f29388g);
            int i11 = this.f29392k;
            Arrays.fill(this.f29384c, i11, this.l + i11, (Object) null);
            I();
        }
        int[] iArr = this.f29383b;
        int i12 = this.f29388g;
        Object[] objArr = this.f29384c;
        int i13 = this.f29392k;
        ArrayList arrayList = this.f29385d;
        HashMap map = this.f29386e;
        q1.g0 g0Var = this.f29387f;
        m2 m2Var = this.f29382a;
        if (!m2Var.f29343g) {
            s1.a("Unexpected writer close()");
        }
        m2Var.f29343g = false;
        m2Var.f29337a = iArr;
        m2Var.f29338b = i12;
        m2Var.f29339c = objArr;
        m2Var.f29340d = i13;
        m2Var.f29345i = arrayList;
        m2Var.f29346j = map;
        m2Var.f29347k = g0Var;
    }

    public final int f(int i11) {
        return g(r(i11), this.f29383b);
    }

    public final int g(int i11, int[] iArr) {
        if (i11 >= o()) {
            return this.f29384c.length - this.l;
        }
        int i12 = iArr[(i11 * 5) + 4];
        return i12 < 0 ? (this.f29384c.length - this.l) + i12 + 1 : i12;
    }

    public final int h(int i11) {
        return (this.l * (i11 < this.f29392k ? 0 : 1)) + i11;
    }

    public final void j() {
        q1.o0 o0Var;
        boolean z11 = this.f29394n > 0;
        int i11 = this.f29400t;
        int i12 = this.f29401u;
        int i13 = this.f29402v;
        int iR = r(i13);
        int i14 = this.f29395o;
        int i15 = i11 - i13;
        int i16 = iR * 5;
        int i17 = i16 + 1;
        boolean z12 = (this.f29383b[i17] & 1073741824) != 0;
        b5.y yVar = this.f29398r;
        if (z11) {
            q1.g0 g0Var = this.f29399s;
            if (g0Var != null && (o0Var = (q1.o0) g0Var.b(i13)) != null) {
                Object[] objArr = o0Var.f35721a;
                int i18 = o0Var.f35722b;
                for (int i19 = 0; i19 < i18; i19++) {
                    H(objArr[i19]);
                }
            }
            int[] iArr = this.f29383b;
            iArr[i16 + 3] = i15;
            o2.c(iR, i14, iArr);
            int iB = yVar.b();
            if (z12) {
                i14 = 1;
            }
            this.f29395o = iB + i14;
            int iG = G(i13, this.f29383b);
            this.f29402v = iG;
            int iP = iG < 0 ? p() : r(iG + 1);
            int iG2 = iP >= 0 ? g(iP, this.f29383b) : 0;
            this.f29390i = iG2;
            this.f29391j = iG2;
            return;
        }
        if (i11 != i12) {
            v.a("Expected to be at the end of a group");
        }
        int[] iArr2 = this.f29383b;
        int i21 = i16 + 3;
        int i22 = iArr2[i21];
        int i23 = iArr2[i17] & 67108863;
        iArr2[i21] = i15;
        o2.c(iR, i14, iArr2);
        int iB2 = this.f29396p.b();
        this.f29401u = (o() - this.f29389h) - this.f29397q.b();
        this.f29402v = iB2;
        int iG3 = G(i13, this.f29383b);
        int iB3 = yVar.b();
        this.f29395o = iB3;
        if (iG3 == iB2) {
            this.f29395o = iB3 + (z12 ? 0 : i14 - i23);
            return;
        }
        int i24 = i15 - i22;
        int i25 = z12 ? 0 : i14 - i23;
        if (i24 != 0 || i25 != 0) {
            while (iG3 != 0 && iG3 != iB2 && (i25 != 0 || i24 != 0)) {
                int iR2 = r(iG3);
                if (i24 != 0) {
                    int[] iArr3 = this.f29383b;
                    int i26 = (iR2 * 5) + 3;
                    iArr3[i26] = iArr3[i26] + i24;
                }
                if (i25 != 0) {
                    int[] iArr4 = this.f29383b;
                    o2.c(iR2, (iArr4[(iR2 * 5) + 1] & 67108863) + i25, iArr4);
                }
                int[] iArr5 = this.f29383b;
                if ((iArr5[(iR2 * 5) + 1] & 1073741824) != 0) {
                    i25 = 0;
                }
                iG3 = G(iG3, iArr5);
            }
        }
        this.f29395o += i25;
    }

    public final void k() {
        if (this.f29394n <= 0) {
            s1.b("Unbalanced begin/end insert");
        }
        int i11 = this.f29394n - 1;
        this.f29394n = i11;
        if (i11 == 0) {
            if (this.f29398r.f6016b != this.f29396p.f6016b) {
                v.a("startGroup/endGroup mismatch while inserting");
            }
            this.f29401u = (o() - this.f29389h) - this.f29397q.b();
        }
    }

    public final void l(int i11) {
        boolean z11 = false;
        if (!(this.f29394n <= 0)) {
            v.a("Cannot call ensureStarted() while inserting");
        }
        int i12 = this.f29402v;
        if (i12 != i11) {
            if (i11 >= i12 && i11 < this.f29401u) {
                z11 = true;
            }
            if (!z11) {
                v.a("Started group at " + i11 + " must be a subgroup of the group at " + i12);
            }
            int i13 = this.f29400t;
            int i14 = this.f29390i;
            int i15 = this.f29391j;
            this.f29400t = i11;
            R();
            this.f29400t = i13;
            this.f29390i = i14;
            this.f29391j = i15;
        }
    }

    public final void m(int i11, int i12, int i13) {
        if (i11 >= this.f29388g) {
            i11 = -((p() - i11) + 2);
        }
        while (i13 < i12) {
            this.f29383b[(r(i13) * 5) + 2] = i11;
            int i14 = this.f29383b[(r(i13) * 5) + 3] + i13;
            m(i13, i14, i13 + 1);
            i13 = i14;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0115, code lost:
    
        org.bouncycastle.jce.provider.a.v("Index must be between 0 and size");
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x011a, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(int r20, kotlin.jvm.functions.Function2 r21) {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.q2.n(int, kotlin.jvm.functions.Function2):void");
    }

    public final int o() {
        return this.f29383b.length / 5;
    }

    public final int p() {
        return o() - this.f29389h;
    }

    public final Object q(int i11) {
        int iR = r(i11);
        int[] iArr = this.f29383b;
        int i12 = (iR * 5) + 1;
        if ((iArr[i12] & 268435456) == 0) {
            return m.f29332a;
        }
        return this.f29384c[Integer.bitCount(iArr[i12] >> 29) + g(iR, iArr)];
    }

    public final int r(int i11) {
        return (this.f29389h * (i11 < this.f29388g ? 0 : 1)) + i11;
    }

    public final int s(int i11) {
        return this.f29383b[r(i11) * 5];
    }

    public final Object t(int i11) {
        int iR = r(i11);
        int[] iArr = this.f29383b;
        int i12 = iR * 5;
        int i13 = iArr[i12 + 1];
        if ((536870912 & i13) == 0) {
            return null;
        }
        return this.f29384c[Integer.bitCount(i13 >> 30) + iArr[i12 + 4]];
    }

    public final String toString() {
        return "SlotWriter(current = " + this.f29400t + " end=" + this.f29401u + " size = " + p() + " gap=" + this.f29388g + '-' + (this.f29388g + this.f29389h) + ')';
    }

    public final int u(int i11) {
        return this.f29383b[(r(i11) * 5) + 3];
    }

    public final boolean v(int i11, int i12) {
        int iO;
        int iU;
        if (i12 == this.f29402v) {
            iO = this.f29401u;
        } else {
            b5.y yVar = this.f29396p;
            if (i12 > yVar.a(0)) {
                iU = u(i12);
            } else {
                int[] iArr = yVar.f6015a;
                int iMin = Math.min(iArr.length, yVar.f6016b);
                int i13 = 0;
                while (true) {
                    if (i13 >= iMin) {
                        i13 = -1;
                        break;
                    }
                    if (iArr[i13] == i12) {
                        break;
                    }
                    i13++;
                }
                if (i13 < 0) {
                    iU = u(i12);
                } else {
                    iO = (o() - this.f29389h) - this.f29397q.f6015a[i13];
                }
            }
            iO = iU + i12;
        }
        return i11 > i12 && i11 < iO;
    }

    public final void w(int i11) {
        if (i11 > 0) {
            int i12 = this.f29400t;
            B(i12);
            int i13 = this.f29388g;
            int i14 = this.f29389h;
            int[] iArr = this.f29383b;
            int length = iArr.length / 5;
            int i15 = length - i14;
            if (i14 < i11) {
                int iMax = Math.max(Math.max(length * 2, i15 + i11), 32);
                int[] iArr2 = new int[iMax * 5];
                int i16 = iMax - i15;
                kotlin.collections.x.f(0, iArr, 0, i13 * 5, iArr2);
                kotlin.collections.x.f((i13 + i16) * 5, iArr, (i14 + i13) * 5, length * 5, iArr2);
                this.f29383b = iArr2;
                i14 = i16;
            }
            int i17 = this.f29401u;
            if (i17 >= i13) {
                this.f29401u = i17 + i11;
            }
            int i18 = i13 + i11;
            this.f29388g = i18;
            this.f29389h = i14 - i11;
            int i19 = i(i15 > 0 ? f(i12 + i11) : 0, this.f29393m >= i13 ? this.f29392k : 0, this.l, this.f29384c.length);
            for (int i21 = i13; i21 < i18; i21++) {
                this.f29383b[(i21 * 5) + 4] = i19;
            }
            int i22 = this.f29393m;
            if (i22 >= i13) {
                this.f29393m = i22 + i11;
            }
        }
    }

    public final void x(int i11, int i12) {
        if (i11 > 0) {
            C(this.f29390i, i12);
            int i13 = this.f29392k;
            int i14 = this.l;
            if (i14 < i11) {
                Object[] objArr = this.f29384c;
                int length = objArr.length;
                int i15 = length - i14;
                int iMax = Math.max(Math.max(length * 2, i15 + i11), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i16 = 0; i16 < iMax; i16++) {
                    objArr2[i16] = null;
                }
                int i17 = iMax - i15;
                int i18 = i14 + i13;
                System.arraycopy(objArr, 0, objArr2, 0, i13);
                System.arraycopy(objArr, i18, objArr2, i13 + i17, length - i18);
                this.f29384c = objArr2;
                i14 = i17;
            }
            int i19 = this.f29391j;
            if (i19 >= i13) {
                this.f29391j = i19 + i11;
            }
            this.f29392k = i13 + i11;
            this.l = i14 - i11;
        }
    }

    public final boolean y(int i11) {
        return (this.f29383b[(r(i11) * 5) + 1] & 1073741824) != 0;
    }
}
