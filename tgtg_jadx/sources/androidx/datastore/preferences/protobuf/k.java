package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import java.nio.charset.Charset;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f2995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2997c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2998d = 0;

    public k(i iVar) {
        Charset charset = b0.f2930a;
        this.f2995a = iVar;
        iVar.f2988b = this;
    }

    public final int a() {
        int i11 = this.f2998d;
        if (i11 != 0) {
            this.f2996b = i11;
            this.f2998d = 0;
        } else {
            this.f2996b = this.f2995a.u();
        }
        int i12 = this.f2996b;
        if (i12 == 0 || i12 == this.f2997c) {
            return Integer.MAX_VALUE;
        }
        return i12 >>> 3;
    }

    public final void b(Object obj, a1 a1Var, n nVar) {
        int i11 = this.f2997c;
        this.f2997c = ((this.f2996b >>> 3) << 3) | 4;
        try {
            a1Var.h(obj, this, nVar);
            if (this.f2996b == this.f2997c) {
            } else {
                throw new InvalidProtocolBufferException("Failed to parse the message.");
            }
        } finally {
            this.f2997c = i11;
        }
    }

    public final void c(Object obj, a1 a1Var, n nVar) throws InvalidProtocolBufferException {
        i iVar = this.f2995a;
        int iV = iVar.v();
        if (iVar.f2987a >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iE = iVar.e(iV);
        iVar.f2987a++;
        a1Var.h(obj, this, nVar);
        iVar.a(0);
        iVar.f2987a--;
        iVar.d(iE);
    }

    public final void d(a0 a0Var) throws InvalidProtocolBufferException {
        int iU;
        int i11 = this.f2996b & 7;
        i iVar = this.f2995a;
        if (i11 == 0) {
            do {
                ((y0) a0Var).add(Boolean.valueOf(iVar.f()));
                if (iVar.c()) {
                    return;
                } else {
                    iU = iVar.u();
                }
            } while (iU == this.f2996b);
            this.f2998d = iU;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iB = iVar.b() + iVar.v();
        do {
            ((y0) a0Var).add(Boolean.valueOf(iVar.f()));
        } while (iVar.b() < iB);
        v(iB);
    }

    public final f e() throws InvalidProtocolBufferException.InvalidWireTypeException {
        w(2);
        return this.f2995a.g();
    }

    public final void f(a0 a0Var) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iU;
        if ((this.f2996b & 7) != 2) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            ((y0) a0Var).add(e());
            i iVar = this.f2995a;
            if (iVar.c()) {
                return;
            } else {
                iU = iVar.u();
            }
        } while (iU == this.f2996b);
        this.f2998d = iU;
    }

    public final void g(a0 a0Var) throws InvalidProtocolBufferException {
        int iU;
        int i11 = this.f2996b & 7;
        i iVar = this.f2995a;
        if (i11 == 1) {
            do {
                ((y0) a0Var).add(Double.valueOf(iVar.h()));
                if (iVar.c()) {
                    return;
                } else {
                    iU = iVar.u();
                }
            } while (iU == this.f2996b);
            this.f2998d = iU;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iV = iVar.v();
        if ((iV & 7) != 0) {
            throw new InvalidProtocolBufferException("Failed to parse the message.");
        }
        int iB = iVar.b() + iV;
        do {
            ((y0) a0Var).add(Double.valueOf(iVar.h()));
        } while (iVar.b() < iB);
    }

    public final void h(a0 a0Var) throws InvalidProtocolBufferException {
        int iU;
        int i11 = this.f2996b & 7;
        i iVar = this.f2995a;
        if (i11 == 0) {
            do {
                ((y0) a0Var).add(Integer.valueOf(iVar.i()));
                if (iVar.c()) {
                    return;
                } else {
                    iU = iVar.u();
                }
            } while (iU == this.f2996b);
            this.f2998d = iU;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iB = iVar.b() + iVar.v();
        do {
            ((y0) a0Var).add(Integer.valueOf(iVar.i()));
        } while (iVar.b() < iB);
        v(iB);
    }

    public final Object i(v1 v1Var, Class cls, n nVar) throws InvalidProtocolBufferException {
        int i11 = j.f2991a[v1Var.ordinal()];
        i iVar = this.f2995a;
        switch (i11) {
            case 1:
                w(0);
                return Boolean.valueOf(iVar.f());
            case 2:
                return e();
            case 3:
                w(1);
                return Double.valueOf(iVar.h());
            case 4:
                w(0);
                return Integer.valueOf(iVar.i());
            case 5:
                w(5);
                return Integer.valueOf(iVar.j());
            case 6:
                w(1);
                return Long.valueOf(iVar.k());
            case 7:
                w(5);
                return Float.valueOf(iVar.l());
            case 8:
                w(0);
                return Integer.valueOf(iVar.m());
            case 9:
                w(0);
                return Long.valueOf(iVar.n());
            case 10:
                w(2);
                a1 a1VarA = x0.f3059c.a(cls);
                z zVarI = a1VarA.i();
                c(zVarI, a1VarA, nVar);
                a1VarA.c(zVarI);
                return zVarI;
            case 11:
                w(5);
                return Integer.valueOf(iVar.o());
            case 12:
                w(1);
                return Long.valueOf(iVar.p());
            case 13:
                w(0);
                return Integer.valueOf(iVar.q());
            case 14:
                w(0);
                return Long.valueOf(iVar.r());
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                w(2);
                return iVar.t();
            case 16:
                w(0);
                return Integer.valueOf(iVar.v());
            case 17:
                w(0);
                return Long.valueOf(iVar.w());
            default:
                i4.a.f("unsupported field type.");
                return null;
        }
    }

    public final void j(a0 a0Var) throws InvalidProtocolBufferException {
        int iU;
        int i11 = this.f2996b & 7;
        i iVar = this.f2995a;
        if (i11 == 2) {
            int iV = iVar.v();
            if ((iV & 3) != 0) {
                throw new InvalidProtocolBufferException("Failed to parse the message.");
            }
            int iB = iVar.b() + iV;
            do {
                ((y0) a0Var).add(Integer.valueOf(iVar.j()));
            } while (iVar.b() < iB);
            return;
        }
        if (i11 != 5) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            ((y0) a0Var).add(Integer.valueOf(iVar.j()));
            if (iVar.c()) {
                return;
            } else {
                iU = iVar.u();
            }
        } while (iU == this.f2996b);
        this.f2998d = iU;
    }

    public final void k(a0 a0Var) throws InvalidProtocolBufferException {
        int iU;
        int i11 = this.f2996b & 7;
        i iVar = this.f2995a;
        if (i11 == 1) {
            do {
                ((y0) a0Var).add(Long.valueOf(iVar.k()));
                if (iVar.c()) {
                    return;
                } else {
                    iU = iVar.u();
                }
            } while (iU == this.f2996b);
            this.f2998d = iU;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iV = iVar.v();
        if ((iV & 7) != 0) {
            throw new InvalidProtocolBufferException("Failed to parse the message.");
        }
        int iB = iVar.b() + iV;
        do {
            ((y0) a0Var).add(Long.valueOf(iVar.k()));
        } while (iVar.b() < iB);
    }

    public final void l(a0 a0Var) throws InvalidProtocolBufferException {
        int iU;
        int i11 = this.f2996b & 7;
        i iVar = this.f2995a;
        if (i11 == 2) {
            int iV = iVar.v();
            if ((iV & 3) != 0) {
                throw new InvalidProtocolBufferException("Failed to parse the message.");
            }
            int iB = iVar.b() + iV;
            do {
                ((y0) a0Var).add(Float.valueOf(iVar.l()));
            } while (iVar.b() < iB);
            return;
        }
        if (i11 != 5) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            ((y0) a0Var).add(Float.valueOf(iVar.l()));
            if (iVar.c()) {
                return;
            } else {
                iU = iVar.u();
            }
        } while (iU == this.f2996b);
        this.f2998d = iU;
    }

    public final void m(a0 a0Var) throws InvalidProtocolBufferException {
        int iU;
        int i11 = this.f2996b & 7;
        i iVar = this.f2995a;
        if (i11 == 0) {
            do {
                ((y0) a0Var).add(Integer.valueOf(iVar.m()));
                if (iVar.c()) {
                    return;
                } else {
                    iU = iVar.u();
                }
            } while (iU == this.f2996b);
            this.f2998d = iU;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iB = iVar.b() + iVar.v();
        do {
            ((y0) a0Var).add(Integer.valueOf(iVar.m()));
        } while (iVar.b() < iB);
        v(iB);
    }

    public final void n(a0 a0Var) throws InvalidProtocolBufferException {
        int iU;
        int i11 = this.f2996b & 7;
        i iVar = this.f2995a;
        if (i11 == 0) {
            do {
                ((y0) a0Var).add(Long.valueOf(iVar.n()));
                if (iVar.c()) {
                    return;
                } else {
                    iU = iVar.u();
                }
            } while (iU == this.f2996b);
            this.f2998d = iU;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iB = iVar.b() + iVar.v();
        do {
            ((y0) a0Var).add(Long.valueOf(iVar.n()));
        } while (iVar.b() < iB);
        v(iB);
    }

    public final void o(a0 a0Var) throws InvalidProtocolBufferException {
        int iU;
        int i11 = this.f2996b & 7;
        i iVar = this.f2995a;
        if (i11 == 2) {
            int iV = iVar.v();
            if ((iV & 3) != 0) {
                throw new InvalidProtocolBufferException("Failed to parse the message.");
            }
            int iB = iVar.b() + iV;
            do {
                ((y0) a0Var).add(Integer.valueOf(iVar.o()));
            } while (iVar.b() < iB);
            return;
        }
        if (i11 != 5) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            ((y0) a0Var).add(Integer.valueOf(iVar.o()));
            if (iVar.c()) {
                return;
            } else {
                iU = iVar.u();
            }
        } while (iU == this.f2996b);
        this.f2998d = iU;
    }

    public final void p(a0 a0Var) throws InvalidProtocolBufferException {
        int iU;
        int i11 = this.f2996b & 7;
        i iVar = this.f2995a;
        if (i11 == 1) {
            do {
                ((y0) a0Var).add(Long.valueOf(iVar.p()));
                if (iVar.c()) {
                    return;
                } else {
                    iU = iVar.u();
                }
            } while (iU == this.f2996b);
            this.f2998d = iU;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iV = iVar.v();
        if ((iV & 7) != 0) {
            throw new InvalidProtocolBufferException("Failed to parse the message.");
        }
        int iB = iVar.b() + iV;
        do {
            ((y0) a0Var).add(Long.valueOf(iVar.p()));
        } while (iVar.b() < iB);
    }

    public final void q(a0 a0Var) throws InvalidProtocolBufferException {
        int iU;
        int i11 = this.f2996b & 7;
        i iVar = this.f2995a;
        if (i11 == 0) {
            do {
                ((y0) a0Var).add(Integer.valueOf(iVar.q()));
                if (iVar.c()) {
                    return;
                } else {
                    iU = iVar.u();
                }
            } while (iU == this.f2996b);
            this.f2998d = iU;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iB = iVar.b() + iVar.v();
        do {
            ((y0) a0Var).add(Integer.valueOf(iVar.q()));
        } while (iVar.b() < iB);
        v(iB);
    }

    public final void r(a0 a0Var) throws InvalidProtocolBufferException {
        int iU;
        int i11 = this.f2996b & 7;
        i iVar = this.f2995a;
        if (i11 == 0) {
            do {
                ((y0) a0Var).add(Long.valueOf(iVar.r()));
                if (iVar.c()) {
                    return;
                } else {
                    iU = iVar.u();
                }
            } while (iU == this.f2996b);
            this.f2998d = iU;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iB = iVar.b() + iVar.v();
        do {
            ((y0) a0Var).add(Long.valueOf(iVar.r()));
        } while (iVar.b() < iB);
        v(iB);
    }

    public final void s(a0 a0Var, boolean z11) throws InvalidProtocolBufferException.InvalidWireTypeException {
        String strS;
        int iU;
        if ((this.f2996b & 7) != 2) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            i iVar = this.f2995a;
            if (z11) {
                w(2);
                strS = iVar.t();
            } else {
                w(2);
                strS = iVar.s();
            }
            ((y0) a0Var).add(strS);
            if (iVar.c()) {
                return;
            } else {
                iU = iVar.u();
            }
        } while (iU == this.f2996b);
        this.f2998d = iU;
    }

    public final void t(a0 a0Var) throws InvalidProtocolBufferException {
        int iU;
        int i11 = this.f2996b & 7;
        i iVar = this.f2995a;
        if (i11 == 0) {
            do {
                ((y0) a0Var).add(Integer.valueOf(iVar.v()));
                if (iVar.c()) {
                    return;
                } else {
                    iU = iVar.u();
                }
            } while (iU == this.f2996b);
            this.f2998d = iU;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iB = iVar.b() + iVar.v();
        do {
            ((y0) a0Var).add(Integer.valueOf(iVar.v()));
        } while (iVar.b() < iB);
        v(iB);
    }

    public final void u(a0 a0Var) throws InvalidProtocolBufferException {
        int iU;
        int i11 = this.f2996b & 7;
        i iVar = this.f2995a;
        if (i11 == 0) {
            do {
                ((y0) a0Var).add(Long.valueOf(iVar.w()));
                if (iVar.c()) {
                    return;
                } else {
                    iU = iVar.u();
                }
            } while (iU == this.f2996b);
            this.f2998d = iU;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iB = iVar.b() + iVar.v();
        do {
            ((y0) a0Var).add(Long.valueOf(iVar.w()));
        } while (iVar.b() < iB);
        v(iB);
    }

    public final void v(int i11) throws InvalidProtocolBufferException {
        if (this.f2995a.b() != i11) {
            throw InvalidProtocolBufferException.e();
        }
    }

    public final void w(int i11) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if ((this.f2996b & 7) != i11) {
            throw InvalidProtocolBufferException.b();
        }
    }

    public final boolean x() {
        int i11;
        i iVar = this.f2995a;
        if (iVar.c() || (i11 = this.f2996b) == this.f2997c) {
            return false;
        }
        return iVar.x(i11);
    }
}
