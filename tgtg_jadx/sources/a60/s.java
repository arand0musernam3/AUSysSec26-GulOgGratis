package a60;

import android.view.View;
import androidx.core.view.ViewCompat;
import com.google.android.gms.internal.measurement.c1;
import com.google.android.gms.internal.measurement.j2;
import com.google.android.gms.internal.measurement.k1;
import com.google.android.gms.internal.measurement.l1;
import com.google.android.gms.internal.measurement.m2;
import com.google.android.gms.internal.measurement.t1;
import com.google.android.gms.internal.measurement.u0;
import com.google.android.gms.internal.measurement.x0;
import com.google.android.gms.internal.measurement.x1;
import com.google.android.gms.internal.measurement.z2;
import com.google.android.gms.internal.measurement.zzaeg;
import com.google.android.gms.internal.measurement.zzaeh;
import java.lang.reflect.Array;
import n3.m0;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f912d;

    public s(x0 x0Var) {
        this.f911c = 0;
        this.f912d = x0Var;
        x0Var.f12023c = this;
    }

    public static final void B(int i11) throws zzaeh {
        if ((i11 & 3) == 0) {
            return;
        }
        c50.w.o("Failed to parse the message.");
    }

    public static final void C(int i11) throws zzaeh {
        if ((i11 & 7) == 0) {
            return;
        }
        c50.w.o("Failed to parse the message.");
    }

    public void A(int i11) throws zzaeh {
        if (((x0) this.f912d).e() == i11) {
            return;
        }
        c50.w.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public int D() {
        int iL = this.f911c;
        if (iL != 0) {
            this.f909a = iL;
            this.f911c = 0;
        } else {
            iL = ((x0) this.f912d).l();
            this.f909a = iL;
        }
        if (iL == 0 || iL == this.f910b) {
            return Integer.MAX_VALUE;
        }
        return iL >>> 3;
    }

    public u0 E() {
        w(2);
        return ((x0) this.f912d).y();
    }

    public void F(t1 t1Var) throws zzaeh {
        int iL;
        x0 x0Var = (x0) this.f912d;
        int i11 = this.f909a & 7;
        if (i11 == 1) {
            do {
                t1Var.add(Double.valueOf(x0Var.o()));
                if (x0Var.d()) {
                    return;
                } else {
                    iL = x0Var.l();
                }
            } while (iL == this.f909a);
            this.f911c = iL;
            return;
        }
        if (i11 != 2) {
            c50.w.n();
            return;
        }
        int iA = x0Var.A();
        C(iA);
        int iE = x0Var.e() + iA;
        do {
            t1Var.add(Double.valueOf(x0Var.o()));
        } while (x0Var.e() < iE);
    }

    public void G(t1 t1Var) throws zzaeh {
        int iL;
        x0 x0Var = (x0) this.f912d;
        int i11 = this.f909a & 7;
        if (i11 == 2) {
            int iA = x0Var.A();
            B(iA);
            int iE = x0Var.e() + iA;
            do {
                t1Var.add(Float.valueOf(x0Var.p()));
            } while (x0Var.e() < iE);
            return;
        }
        if (i11 != 5) {
            c50.w.n();
            return;
        }
        do {
            t1Var.add(Float.valueOf(x0Var.p()));
            if (x0Var.d()) {
                return;
            } else {
                iL = x0Var.l();
            }
        } while (iL == this.f909a);
        this.f911c = iL;
    }

    public void H(t1 t1Var) throws zzaeh {
        int iL;
        int iL2;
        x0 x0Var = (x0) this.f912d;
        boolean z11 = t1Var instanceof x1;
        int i11 = this.f909a;
        if (z11) {
            x1 x1Var = (x1) t1Var;
            int i12 = i11 & 7;
            if (i12 != 0) {
                if (i12 != 2) {
                    c50.w.n();
                    return;
                }
                int iE = x0Var.e() + x0Var.A();
                do {
                    x1Var.e(x0Var.q());
                } while (x0Var.e() < iE);
                A(iE);
                return;
            }
            do {
                x1Var.e(x0Var.q());
                if (x0Var.d()) {
                    return;
                } else {
                    iL2 = x0Var.l();
                }
            } while (iL2 == this.f909a);
        } else {
            int i13 = i11 & 7;
            if (i13 != 0) {
                if (i13 != 2) {
                    c50.w.n();
                    return;
                }
                int iE2 = x0Var.e() + x0Var.A();
                do {
                    t1Var.add(Long.valueOf(x0Var.q()));
                } while (x0Var.e() < iE2);
                A(iE2);
                return;
            }
            do {
                t1Var.add(Long.valueOf(x0Var.q()));
                if (x0Var.d()) {
                    return;
                } else {
                    iL = x0Var.l();
                }
            } while (iL == this.f909a);
            iL2 = iL;
        }
        this.f911c = iL2;
    }

    public void a(v vVar) {
        vVar.f922c = null;
        vVar.f920a = null;
        vVar.f921b = null;
        vVar.f928i = 1;
        int i11 = this.f909a;
        if (i11 > 0) {
            int i12 = this.f911c;
            if ((i12 & 1) == 0) {
                this.f911c = i12 + 1;
                this.f909a = i11 - 1;
                this.f910b++;
            }
        }
        vVar.f920a = (v) this.f912d;
        this.f912d = vVar;
        int i13 = this.f911c;
        int i14 = i13 + 1;
        this.f911c = i14;
        int i15 = this.f909a;
        if (i15 > 0 && (i14 & 1) == 0) {
            this.f911c = i13 + 2;
            this.f909a = i15 - 1;
            this.f910b++;
        }
        int i16 = 4;
        while (true) {
            int i17 = i16 - 1;
            if ((this.f911c & i17) != i17) {
                return;
            }
            int i18 = this.f910b;
            if (i18 == 0) {
                v vVar2 = (v) this.f912d;
                v vVar3 = vVar2.f920a;
                v vVar4 = vVar3.f920a;
                vVar3.f920a = vVar4.f920a;
                this.f912d = vVar3;
                vVar3.f921b = vVar4;
                vVar3.f922c = vVar2;
                vVar3.f928i = vVar2.f928i + 1;
                vVar4.f920a = vVar3;
                vVar2.f920a = vVar3;
            } else if (i18 == 1) {
                v vVar5 = (v) this.f912d;
                v vVar6 = vVar5.f920a;
                this.f912d = vVar6;
                vVar6.f922c = vVar5;
                vVar6.f928i = vVar5.f928i + 1;
                vVar5.f920a = vVar6;
                this.f910b = 0;
            } else if (i18 == 2) {
                this.f910b = 0;
            }
            i16 *= 2;
        }
    }

    public void b() {
        View view = (View) this.f912d;
        ViewCompat.N(view, this.f911c - (view.getTop() - this.f909a));
        ViewCompat.M(view, 0 - (view.getLeft() - this.f910b));
    }

    public c40.n c() {
        return ((c40.n[]) this.f912d)[this.f909a];
    }

    public int d(int i11) {
        return ((m0) this.f912d).f30475j[this.f910b + i11];
    }

    public Object e(int i11) {
        return ((m0) this.f912d).l[this.f911c + i11];
    }

    public byte[][] f(int i11, int i12) {
        int i13 = this.f910b * i12;
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i13, this.f911c * i11);
        for (int i14 = 0; i14 < i13; i14++) {
            int i15 = (i13 - i14) - 1;
            byte[] bArr2 = ((c40.n[]) this.f912d)[i14 / i12].f7084a;
            int length = bArr2.length * i11;
            byte[] bArr3 = new byte[length];
            for (int i16 = 0; i16 < length; i16++) {
                bArr3[i16] = bArr2[i16 / i11];
            }
            bArr[i15] = bArr3;
        }
        return bArr;
    }

    public void g(t1 t1Var) throws zzaeh {
        int iL;
        int iL2;
        x0 x0Var = (x0) this.f912d;
        boolean z11 = t1Var instanceof x1;
        int i11 = this.f909a;
        if (z11) {
            x1 x1Var = (x1) t1Var;
            int i12 = i11 & 7;
            if (i12 != 0) {
                if (i12 != 2) {
                    c50.w.n();
                    return;
                }
                int iE = x0Var.e() + x0Var.A();
                do {
                    x1Var.e(x0Var.r());
                } while (x0Var.e() < iE);
                A(iE);
                return;
            }
            do {
                x1Var.e(x0Var.r());
                if (x0Var.d()) {
                    return;
                } else {
                    iL2 = x0Var.l();
                }
            } while (iL2 == this.f909a);
        } else {
            int i13 = i11 & 7;
            if (i13 != 0) {
                if (i13 != 2) {
                    c50.w.n();
                    return;
                }
                int iE2 = x0Var.e() + x0Var.A();
                do {
                    t1Var.add(Long.valueOf(x0Var.r()));
                } while (x0Var.e() < iE2);
                A(iE2);
                return;
            }
            do {
                t1Var.add(Long.valueOf(x0Var.r()));
                if (x0Var.d()) {
                    return;
                } else {
                    iL = x0Var.l();
                }
            } while (iL == this.f909a);
            iL2 = iL;
        }
        this.f911c = iL2;
    }

    public void h(t1 t1Var) throws zzaeh {
        int iL;
        int iL2;
        x0 x0Var = (x0) this.f912d;
        boolean z11 = t1Var instanceof l1;
        int i11 = this.f909a;
        if (z11) {
            l1 l1Var = (l1) t1Var;
            int i12 = i11 & 7;
            if (i12 != 0) {
                if (i12 != 2) {
                    c50.w.n();
                    return;
                }
                int iE = x0Var.e() + x0Var.A();
                do {
                    l1Var.e(x0Var.s());
                } while (x0Var.e() < iE);
                A(iE);
                return;
            }
            do {
                l1Var.e(x0Var.s());
                if (x0Var.d()) {
                    return;
                } else {
                    iL2 = x0Var.l();
                }
            } while (iL2 == this.f909a);
        } else {
            int i13 = i11 & 7;
            if (i13 != 0) {
                if (i13 != 2) {
                    c50.w.n();
                    return;
                }
                int iE2 = x0Var.e() + x0Var.A();
                do {
                    t1Var.add(Integer.valueOf(x0Var.s()));
                } while (x0Var.e() < iE2);
                A(iE2);
                return;
            }
            do {
                t1Var.add(Integer.valueOf(x0Var.s()));
                if (x0Var.d()) {
                    return;
                } else {
                    iL = x0Var.l();
                }
            } while (iL == this.f909a);
            iL2 = iL;
        }
        this.f911c = iL2;
    }

    public void i(t1 t1Var) throws zzaeh {
        int iL;
        int iL2;
        x0 x0Var = (x0) this.f912d;
        boolean z11 = t1Var instanceof x1;
        int i11 = this.f909a;
        if (z11) {
            x1 x1Var = (x1) t1Var;
            int i12 = i11 & 7;
            if (i12 != 1) {
                if (i12 != 2) {
                    c50.w.n();
                    return;
                }
                int iA = x0Var.A();
                C(iA);
                int iE = x0Var.e() + iA;
                do {
                    x1Var.e(x0Var.t());
                } while (x0Var.e() < iE);
                return;
            }
            do {
                x1Var.e(x0Var.t());
                if (x0Var.d()) {
                    return;
                } else {
                    iL2 = x0Var.l();
                }
            } while (iL2 == this.f909a);
        } else {
            int i13 = i11 & 7;
            if (i13 != 1) {
                if (i13 != 2) {
                    c50.w.n();
                    return;
                }
                int iA2 = x0Var.A();
                C(iA2);
                int iE2 = x0Var.e() + iA2;
                do {
                    t1Var.add(Long.valueOf(x0Var.t()));
                } while (x0Var.e() < iE2);
                return;
            }
            do {
                t1Var.add(Long.valueOf(x0Var.t()));
                if (x0Var.d()) {
                    return;
                } else {
                    iL = x0Var.l();
                }
            } while (iL == this.f909a);
            iL2 = iL;
        }
        this.f911c = iL2;
    }

    public void j(t1 t1Var) throws zzaeh {
        int iL;
        int iL2;
        x0 x0Var = (x0) this.f912d;
        boolean z11 = t1Var instanceof l1;
        int i11 = this.f909a;
        if (z11) {
            l1 l1Var = (l1) t1Var;
            int i12 = i11 & 7;
            if (i12 == 2) {
                int iA = x0Var.A();
                B(iA);
                int iE = x0Var.e() + iA;
                do {
                    l1Var.e(x0Var.u());
                } while (x0Var.e() < iE);
                return;
            }
            if (i12 != 5) {
                c50.w.n();
                return;
            }
            do {
                l1Var.e(x0Var.u());
                if (x0Var.d()) {
                    return;
                } else {
                    iL2 = x0Var.l();
                }
            } while (iL2 == this.f909a);
        } else {
            int i13 = i11 & 7;
            if (i13 == 2) {
                int iA2 = x0Var.A();
                B(iA2);
                int iE2 = x0Var.e() + iA2;
                do {
                    t1Var.add(Integer.valueOf(x0Var.u()));
                } while (x0Var.e() < iE2);
                return;
            }
            if (i13 != 5) {
                c50.w.n();
                return;
            }
            do {
                t1Var.add(Integer.valueOf(x0Var.u()));
                if (x0Var.d()) {
                    return;
                } else {
                    iL = x0Var.l();
                }
            } while (iL == this.f909a);
            iL2 = iL;
        }
        this.f911c = iL2;
    }

    public void k(t1 t1Var) throws zzaeh {
        int iL;
        x0 x0Var = (x0) this.f912d;
        int i11 = this.f909a & 7;
        if (i11 == 0) {
            do {
                t1Var.add(Boolean.valueOf(x0Var.v()));
                if (x0Var.d()) {
                    return;
                } else {
                    iL = x0Var.l();
                }
            } while (iL == this.f909a);
            this.f911c = iL;
            return;
        }
        if (i11 != 2) {
            c50.w.n();
            return;
        }
        int iE = x0Var.e() + x0Var.A();
        do {
            t1Var.add(Boolean.valueOf(x0Var.v()));
        } while (x0Var.e() < iE);
        A(iE);
    }

    public void l(t1 t1Var, boolean z11) throws zzaeg {
        String strW;
        int iL;
        x0 x0Var = (x0) this.f912d;
        if ((this.f909a & 7) != 2) {
            c50.w.n();
            return;
        }
        do {
            if (z11) {
                w(2);
                strW = x0Var.x();
            } else {
                w(2);
                strW = x0Var.w();
            }
            t1Var.add(strW);
            if (x0Var.d()) {
                return;
            } else {
                iL = x0Var.l();
            }
        } while (iL == this.f909a);
        this.f911c = iL;
    }

    public void m(t1 t1Var, m2 m2Var, c1 c1Var) throws zzaeh {
        int iL;
        int i11 = this.f909a;
        if ((i11 & 7) != 2) {
            c50.w.n();
            return;
        }
        do {
            k1 k1VarA = m2Var.a();
            x(k1VarA, m2Var, c1Var);
            m2Var.f(k1VarA);
            t1Var.add(k1VarA);
            x0 x0Var = (x0) this.f912d;
            if (x0Var.d() || this.f911c != 0) {
                return;
            } else {
                iL = x0Var.l();
            }
        } while (iL == i11);
        this.f911c = iL;
    }

    public void n(t1 t1Var, m2 m2Var, c1 c1Var) throws zzaeg {
        int iL;
        int i11 = this.f909a;
        if ((i11 & 7) != 3) {
            c50.w.n();
            return;
        }
        do {
            k1 k1VarA = m2Var.a();
            y(k1VarA, m2Var, c1Var);
            m2Var.f(k1VarA);
            t1Var.add(k1VarA);
            x0 x0Var = (x0) this.f912d;
            if (x0Var.d() || this.f911c != 0) {
                return;
            } else {
                iL = x0Var.l();
            }
        } while (iL == i11);
        this.f911c = iL;
    }

    public void o(t1 t1Var) throws zzaeg {
        int iL;
        if ((this.f909a & 7) != 2) {
            c50.w.n();
            return;
        }
        do {
            t1Var.add(E());
            x0 x0Var = (x0) this.f912d;
            if (x0Var.d()) {
                return;
            } else {
                iL = x0Var.l();
            }
        } while (iL == this.f909a);
        this.f911c = iL;
    }

    public void p(t1 t1Var) throws zzaeh {
        int iL;
        int iL2;
        x0 x0Var = (x0) this.f912d;
        boolean z11 = t1Var instanceof l1;
        int i11 = this.f909a;
        if (z11) {
            l1 l1Var = (l1) t1Var;
            int i12 = i11 & 7;
            if (i12 != 0) {
                if (i12 != 2) {
                    c50.w.n();
                    return;
                }
                int iE = x0Var.e() + x0Var.A();
                do {
                    l1Var.e(x0Var.A());
                } while (x0Var.e() < iE);
                A(iE);
                return;
            }
            do {
                l1Var.e(x0Var.A());
                if (x0Var.d()) {
                    return;
                } else {
                    iL2 = x0Var.l();
                }
            } while (iL2 == this.f909a);
        } else {
            int i13 = i11 & 7;
            if (i13 != 0) {
                if (i13 != 2) {
                    c50.w.n();
                    return;
                }
                int iE2 = x0Var.e() + x0Var.A();
                do {
                    t1Var.add(Integer.valueOf(x0Var.A()));
                } while (x0Var.e() < iE2);
                A(iE2);
                return;
            }
            do {
                t1Var.add(Integer.valueOf(x0Var.A()));
                if (x0Var.d()) {
                    return;
                } else {
                    iL = x0Var.l();
                }
            } while (iL == this.f909a);
            iL2 = iL;
        }
        this.f911c = iL2;
    }

    public void q(t1 t1Var) throws zzaeh {
        int iL;
        int iL2;
        x0 x0Var = (x0) this.f912d;
        boolean z11 = t1Var instanceof l1;
        int i11 = this.f909a;
        if (z11) {
            l1 l1Var = (l1) t1Var;
            int i12 = i11 & 7;
            if (i12 != 0) {
                if (i12 != 2) {
                    c50.w.n();
                    return;
                }
                int iE = x0Var.e() + x0Var.A();
                do {
                    l1Var.e(x0Var.B());
                } while (x0Var.e() < iE);
                A(iE);
                return;
            }
            do {
                l1Var.e(x0Var.B());
                if (x0Var.d()) {
                    return;
                } else {
                    iL2 = x0Var.l();
                }
            } while (iL2 == this.f909a);
        } else {
            int i13 = i11 & 7;
            if (i13 != 0) {
                if (i13 != 2) {
                    c50.w.n();
                    return;
                }
                int iE2 = x0Var.e() + x0Var.A();
                do {
                    t1Var.add(Integer.valueOf(x0Var.B()));
                } while (x0Var.e() < iE2);
                A(iE2);
                return;
            }
            do {
                t1Var.add(Integer.valueOf(x0Var.B()));
                if (x0Var.d()) {
                    return;
                } else {
                    iL = x0Var.l();
                }
            } while (iL == this.f909a);
            iL2 = iL;
        }
        this.f911c = iL2;
    }

    public void r(t1 t1Var) throws zzaeh {
        int iL;
        int iL2;
        x0 x0Var = (x0) this.f912d;
        boolean z11 = t1Var instanceof l1;
        int i11 = this.f909a;
        if (z11) {
            l1 l1Var = (l1) t1Var;
            int i12 = i11 & 7;
            if (i12 == 2) {
                int iA = x0Var.A();
                B(iA);
                int iE = x0Var.e() + iA;
                do {
                    l1Var.e(x0Var.C());
                } while (x0Var.e() < iE);
                return;
            }
            if (i12 != 5) {
                c50.w.n();
                return;
            }
            do {
                l1Var.e(x0Var.C());
                if (x0Var.d()) {
                    return;
                } else {
                    iL2 = x0Var.l();
                }
            } while (iL2 == this.f909a);
        } else {
            int i13 = i11 & 7;
            if (i13 == 2) {
                int iA2 = x0Var.A();
                B(iA2);
                int iE2 = x0Var.e() + iA2;
                do {
                    t1Var.add(Integer.valueOf(x0Var.C()));
                } while (x0Var.e() < iE2);
                return;
            }
            if (i13 != 5) {
                c50.w.n();
                return;
            }
            do {
                t1Var.add(Integer.valueOf(x0Var.C()));
                if (x0Var.d()) {
                    return;
                } else {
                    iL = x0Var.l();
                }
            } while (iL == this.f909a);
            iL2 = iL;
        }
        this.f911c = iL2;
    }

    public void s(t1 t1Var) throws zzaeh {
        int iL;
        int iL2;
        x0 x0Var = (x0) this.f912d;
        boolean z11 = t1Var instanceof x1;
        int i11 = this.f909a;
        if (z11) {
            x1 x1Var = (x1) t1Var;
            int i12 = i11 & 7;
            if (i12 != 1) {
                if (i12 != 2) {
                    c50.w.n();
                    return;
                }
                int iA = x0Var.A();
                C(iA);
                int iE = x0Var.e() + iA;
                do {
                    x1Var.e(x0Var.D());
                } while (x0Var.e() < iE);
                return;
            }
            do {
                x1Var.e(x0Var.D());
                if (x0Var.d()) {
                    return;
                } else {
                    iL2 = x0Var.l();
                }
            } while (iL2 == this.f909a);
        } else {
            int i13 = i11 & 7;
            if (i13 != 1) {
                if (i13 != 2) {
                    c50.w.n();
                    return;
                }
                int iA2 = x0Var.A();
                C(iA2);
                int iE2 = x0Var.e() + iA2;
                do {
                    t1Var.add(Long.valueOf(x0Var.D()));
                } while (x0Var.e() < iE2);
                return;
            }
            do {
                t1Var.add(Long.valueOf(x0Var.D()));
                if (x0Var.d()) {
                    return;
                } else {
                    iL = x0Var.l();
                }
            } while (iL == this.f909a);
            iL2 = iL;
        }
        this.f911c = iL2;
    }

    public void t(t1 t1Var) throws zzaeh {
        int iL;
        int iL2;
        x0 x0Var = (x0) this.f912d;
        boolean z11 = t1Var instanceof l1;
        int i11 = this.f909a;
        if (z11) {
            l1 l1Var = (l1) t1Var;
            int i12 = i11 & 7;
            if (i12 != 0) {
                if (i12 != 2) {
                    c50.w.n();
                    return;
                }
                int iE = x0Var.e() + x0Var.A();
                do {
                    l1Var.e(x0Var.E());
                } while (x0Var.e() < iE);
                A(iE);
                return;
            }
            do {
                l1Var.e(x0Var.E());
                if (x0Var.d()) {
                    return;
                } else {
                    iL2 = x0Var.l();
                }
            } while (iL2 == this.f909a);
        } else {
            int i13 = i11 & 7;
            if (i13 != 0) {
                if (i13 != 2) {
                    c50.w.n();
                    return;
                }
                int iE2 = x0Var.e() + x0Var.A();
                do {
                    t1Var.add(Integer.valueOf(x0Var.E()));
                } while (x0Var.e() < iE2);
                A(iE2);
                return;
            }
            do {
                t1Var.add(Integer.valueOf(x0Var.E()));
                if (x0Var.d()) {
                    return;
                } else {
                    iL = x0Var.l();
                }
            } while (iL == this.f909a);
            iL2 = iL;
        }
        this.f911c = iL2;
    }

    public void u(t1 t1Var) throws zzaeh {
        int iL;
        int iL2;
        x0 x0Var = (x0) this.f912d;
        boolean z11 = t1Var instanceof x1;
        int i11 = this.f909a;
        if (z11) {
            x1 x1Var = (x1) t1Var;
            int i12 = i11 & 7;
            if (i12 != 0) {
                if (i12 != 2) {
                    c50.w.n();
                    return;
                }
                int iE = x0Var.e() + x0Var.A();
                do {
                    x1Var.e(x0Var.F());
                } while (x0Var.e() < iE);
                A(iE);
                return;
            }
            do {
                x1Var.e(x0Var.F());
                if (x0Var.d()) {
                    return;
                } else {
                    iL2 = x0Var.l();
                }
            } while (iL2 == this.f909a);
        } else {
            int i13 = i11 & 7;
            if (i13 != 0) {
                if (i13 != 2) {
                    c50.w.n();
                    return;
                }
                int iE2 = x0Var.e() + x0Var.A();
                do {
                    t1Var.add(Long.valueOf(x0Var.F()));
                } while (x0Var.e() < iE2);
                A(iE2);
                return;
            }
            do {
                t1Var.add(Long.valueOf(x0Var.F()));
                if (x0Var.d()) {
                    return;
                } else {
                    iL = x0Var.l();
                }
            } while (iL == this.f909a);
            iL2 = iL;
        }
        this.f911c = iL2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x007e, code lost:
    
        r12.put(r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0081, code lost:
    
        r1.b(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0084, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void v(com.google.android.gms.internal.measurement.z1 r12, a8.h r13, com.google.android.gms.internal.measurement.c1 r14) {
        /*
            r11 = this;
            r0 = 2
            r11.w(r0)
            java.lang.Object r1 = r11.f912d
            com.google.android.gms.internal.measurement.x0 r1 = (com.google.android.gms.internal.measurement.x0) r1
            int r2 = r1.A()
            int r2 = r1.a(r2)
            java.lang.Object r3 = r13.f975d
            java.lang.String r4 = ""
            r5 = r3
        L15:
            int r6 = r11.D()     // Catch: java.lang.Throwable -> L49
            r7 = 2147483647(0x7fffffff, float:NaN)
            if (r6 == r7) goto L7e
            boolean r7 = r1.d()     // Catch: java.lang.Throwable -> L49
            if (r7 == 0) goto L25
            goto L7e
        L25:
            r7 = 1
            r8 = 0
            java.lang.String r9 = "Unable to parse map entry."
            if (r6 == r7) goto L5a
            if (r6 == r0) goto L4d
            boolean r6 = r1.d()     // Catch: java.lang.Throwable -> L49 com.google.android.gms.internal.measurement.zzaeg -> L4b
            if (r6 != 0) goto L3f
            int r6 = r11.f909a     // Catch: java.lang.Throwable -> L49 com.google.android.gms.internal.measurement.zzaeg -> L4b
            int r7 = r11.f910b     // Catch: java.lang.Throwable -> L49 com.google.android.gms.internal.measurement.zzaeg -> L4b
            if (r6 != r7) goto L3a
            goto L3f
        L3a:
            boolean r6 = r1.n(r6)     // Catch: java.lang.Throwable -> L49 com.google.android.gms.internal.measurement.zzaeg -> L4b
            goto L40
        L3f:
            r6 = r8
        L40:
            if (r6 == 0) goto L43
            goto L15
        L43:
            com.google.android.gms.internal.measurement.zzaeh r6 = new com.google.android.gms.internal.measurement.zzaeh     // Catch: java.lang.Throwable -> L49 com.google.android.gms.internal.measurement.zzaeg -> L4b
            r6.<init>(r9)     // Catch: java.lang.Throwable -> L49 com.google.android.gms.internal.measurement.zzaeg -> L4b
            throw r6     // Catch: java.lang.Throwable -> L49 com.google.android.gms.internal.measurement.zzaeg -> L4b
        L49:
            r12 = move-exception
            goto L85
        L4b:
            r6 = move-exception
            goto L64
        L4d:
            java.lang.Object r6 = r13.f974c     // Catch: java.lang.Throwable -> L49 com.google.android.gms.internal.measurement.zzaeg -> L4b
            com.google.android.gms.internal.measurement.z2 r6 = (com.google.android.gms.internal.measurement.z2) r6     // Catch: java.lang.Throwable -> L49 com.google.android.gms.internal.measurement.zzaeg -> L4b
            java.lang.Class r7 = r3.getClass()     // Catch: java.lang.Throwable -> L49 com.google.android.gms.internal.measurement.zzaeg -> L4b
            java.lang.Object r5 = r11.z(r6, r7, r14)     // Catch: java.lang.Throwable -> L49 com.google.android.gms.internal.measurement.zzaeg -> L4b
            goto L15
        L5a:
            java.lang.Object r6 = r13.f973b     // Catch: java.lang.Throwable -> L49 com.google.android.gms.internal.measurement.zzaeg -> L4b
            com.google.android.gms.internal.measurement.z2 r6 = (com.google.android.gms.internal.measurement.z2) r6     // Catch: java.lang.Throwable -> L49 com.google.android.gms.internal.measurement.zzaeg -> L4b
            r7 = 0
            java.lang.Object r4 = r11.z(r6, r7, r7)     // Catch: java.lang.Throwable -> L49 com.google.android.gms.internal.measurement.zzaeg -> L4b
            goto L15
        L64:
            boolean r7 = r1.d()     // Catch: java.lang.Throwable -> L49
            if (r7 != 0) goto L75
            int r7 = r11.f909a     // Catch: java.lang.Throwable -> L49
            int r10 = r11.f910b     // Catch: java.lang.Throwable -> L49
            if (r7 != r10) goto L71
            goto L75
        L71:
            boolean r8 = r1.n(r7)     // Catch: java.lang.Throwable -> L49
        L75:
            if (r8 == 0) goto L78
            goto L15
        L78:
            com.google.android.gms.internal.measurement.zzaeh r12 = new com.google.android.gms.internal.measurement.zzaeh     // Catch: java.lang.Throwable -> L49
            r12.<init>(r9, r6)     // Catch: java.lang.Throwable -> L49
            throw r12     // Catch: java.lang.Throwable -> L49
        L7e:
            r12.put(r4, r5)     // Catch: java.lang.Throwable -> L49
            r1.b(r2)
            return
        L85:
            r1.b(r2)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: a60.s.v(com.google.android.gms.internal.measurement.z1, a8.h, com.google.android.gms.internal.measurement.c1):void");
    }

    public void w(int i11) {
        if ((this.f909a & 7) == i11) {
            return;
        }
        c50.w.n();
    }

    public void x(Object obj, m2 m2Var, c1 c1Var) throws zzaeh {
        x0 x0Var = (x0) this.f912d;
        int iA = x0Var.A();
        if (x0Var.f12021a + x0Var.f12022b >= 100) {
            c50.w.o("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return;
        }
        int iA2 = x0Var.a(iA);
        x0Var.f12021a++;
        m2Var.c(obj, this, c1Var);
        x0Var.m(0);
        x0Var.f12021a--;
        x0Var.b(iA2);
    }

    public void y(Object obj, m2 m2Var, c1 c1Var) {
        int i11 = this.f910b;
        this.f910b = ((this.f909a >>> 3) << 3) | 4;
        try {
            m2Var.c(obj, this, c1Var);
            if (this.f909a == this.f910b) {
            } else {
                throw new zzaeh("Failed to parse the message.");
            }
        } finally {
            this.f910b = i11;
        }
    }

    public Object z(z2 z2Var, Class cls, c1 c1Var) throws zzaeh {
        x0 x0Var = (x0) this.f912d;
        z2 z2Var2 = z2.zza;
        switch (z2Var.ordinal()) {
            case 0:
                w(1);
                return Double.valueOf(x0Var.o());
            case 1:
                w(5);
                return Float.valueOf(x0Var.p());
            case 2:
                w(0);
                return Long.valueOf(x0Var.r());
            case 3:
                w(0);
                return Long.valueOf(x0Var.q());
            case 4:
                w(0);
                return Integer.valueOf(x0Var.s());
            case 5:
                w(1);
                return Long.valueOf(x0Var.t());
            case 6:
                w(5);
                return Integer.valueOf(x0Var.u());
            case 7:
                w(0);
                return Boolean.valueOf(x0Var.v());
            case 8:
                w(2);
                return x0Var.x();
            case 9:
            default:
                i4.a.f("unsupported field type.");
                return null;
            case 10:
                w(2);
                m2 m2VarA = j2.f11503c.a(cls);
                k1 k1VarA = m2VarA.a();
                x(k1VarA, m2VarA, c1Var);
                m2VarA.f(k1VarA);
                return k1VarA;
            case 11:
                return E();
            case 12:
                w(0);
                return Integer.valueOf(x0Var.A());
            case 13:
                w(0);
                return Integer.valueOf(x0Var.B());
            case 14:
                w(5);
                return Integer.valueOf(x0Var.C());
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                w(1);
                return Long.valueOf(x0Var.D());
            case 16:
                w(0);
                return Integer.valueOf(x0Var.E());
            case 17:
                w(0);
                return Long.valueOf(x0Var.F());
        }
    }

    public /* synthetic */ s(Object obj) {
        this.f912d = obj;
    }
}
