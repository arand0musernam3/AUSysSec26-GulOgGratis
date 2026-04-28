package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class k1 extends n0 {
    public static final /* synthetic */ int zzd = 0;
    private static final Map zze = new ConcurrentHashMap();
    private int zzb;
    protected r2 zzc;

    public k1() {
        this.zza = 0;
        this.zzb = -1;
        this.zzc = r2.f11809f;
    }

    public static k1 e(k1 k1Var, byte[] bArr, c1 c1Var) throws zzaeh {
        int length = bArr.length;
        if (length != 0) {
            k1 k1VarI = k1Var.i();
            try {
                m2 m2VarA = j2.f11503c.a(k1VarI.getClass());
                m2VarA.h(k1VarI, bArr, 0, length, new q0(c1Var));
                m2VarA.f(k1VarI);
                k1Var = k1VarI;
            } catch (zzaeh e5) {
                if (e5.f12098a) {
                    throw new zzaeh(e5.getMessage(), e5);
                }
                throw e5;
            } catch (zzafy e11) {
                throw e11.a();
            } catch (IOException e12) {
                if (e12.getCause() instanceof zzaeh) {
                    throw ((zzaeh) e12.getCause());
                }
                throw new zzaeh(e12.getMessage(), e12);
            } catch (IndexOutOfBoundsException unused) {
                c50.w.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return null;
            }
        }
        r(k1Var);
        return k1Var;
    }

    public static k1 n(Class cls) {
        Map map = zze;
        k1 k1Var = (k1) map.get(cls);
        if (k1Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                k1Var = (k1) map.get(cls);
            } catch (ClassNotFoundException e5) {
                wy.o.k("Class initialization cannot fail.", e5);
                return null;
            }
        }
        if (k1Var != null) {
            return k1Var;
        }
        k1 k1Var2 = (k1) ((k1) w2.d(cls)).s(6);
        if (k1Var2 != null) {
            map.put(cls, k1Var2);
            return k1Var2;
        }
        qc.y.e();
        return null;
    }

    public static void o(Class cls, k1 k1Var) {
        k1Var.h();
        zze.put(cls, k1Var);
    }

    public static Object p(Method method, k1 k1Var, Object... objArr) {
        try {
            return method.invoke(k1Var, objArr);
        } catch (IllegalAccessException e5) {
            a40.d0.o("Couldn't use Java reflection to implement protocol message reflection.", e5);
            return null;
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            a40.d0.o("Unexpected exception thrown by generated accessor method.", cause);
            return null;
        }
    }

    public static final boolean q(k1 k1Var, boolean z11) {
        byte bByteValue = ((Byte) k1Var.s(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zE = j2.f11503c.a(k1Var.getClass()).e(k1Var);
        if (z11) {
            k1Var.s(2);
        }
        return zE;
    }

    public static void r(k1 k1Var) throws zzaeh {
        if (k1Var != null && !q(k1Var, true)) {
            throw new zzafy().a();
        }
    }

    @Override // com.google.android.gms.internal.measurement.n0
    public final int c(m2 m2Var) {
        if (g()) {
            int iB = m2Var.b(this);
            if (iB >= 0) {
                return iB;
            }
            c50.w.f(String.valueOf(iB).length() + 42, iB);
            return 0;
        }
        int i11 = this.zzb & Integer.MAX_VALUE;
        if (i11 != Integer.MAX_VALUE) {
            return i11;
        }
        int iB2 = m2Var.b(this);
        if (iB2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | iB2;
            return iB2;
        }
        c50.w.f(String.valueOf(iB2).length() + 42, iB2);
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return j2.f11503c.a(getClass()).g(this, (k1) obj);
    }

    public final void f(b1 b1Var) {
        m2 m2VarA = j2.f11503c.a(getClass());
        s5 s5Var = b1Var.f11269a;
        if (s5Var == null) {
            s5Var = new s5(b1Var);
        }
        m2VarA.i(this, s5Var);
    }

    public final boolean g() {
        return (this.zzb & Integer.MIN_VALUE) != 0;
    }

    public final void h() {
        this.zzb &= Integer.MAX_VALUE;
    }

    public final int hashCode() {
        if (g()) {
            return j2.f11503c.a(getClass()).j(this);
        }
        int i11 = this.zza;
        if (i11 != 0) {
            return i11;
        }
        int iJ = j2.f11503c.a(getClass()).j(this);
        this.zza = iJ;
        return iJ;
    }

    public final k1 i() {
        return (k1) s(4);
    }

    public final i1 j() {
        return (i1) s(5);
    }

    public final i1 k() {
        i1 i1Var = (i1) s(5);
        i1Var.f(this);
        return i1Var;
    }

    public final void l() {
        this.zzb = (this.zzb & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final int m() {
        if (g()) {
            int iB = j2.f11503c.a(getClass()).b(this);
            if (iB >= 0) {
                return iB;
            }
            c50.w.f(String.valueOf(iB).length() + 42, iB);
            return 0;
        }
        int i11 = this.zzb & Integer.MAX_VALUE;
        if (i11 != Integer.MAX_VALUE) {
            return i11;
        }
        int iB2 = j2.f11503c.a(getClass()).b(this);
        if (iB2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | iB2;
            return iB2;
        }
        c50.w.f(String.valueOf(iB2).length() + 42, iB2);
        return 0;
    }

    public abstract Object s(int i11);

    public final String toString() {
        String string = super.toString();
        char[] cArr = d2.f11334a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(string);
        d2.b(this, sb2, 0);
        return sb2.toString();
    }
}
