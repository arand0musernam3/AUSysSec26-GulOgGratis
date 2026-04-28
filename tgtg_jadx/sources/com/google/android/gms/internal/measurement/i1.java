package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class i1 implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k1 f11482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k1 f11483b;

    public i1(k1 k1Var) {
        this.f11482a = k1Var;
        if (k1Var.g()) {
            i4.a.f("Default instance must be immutable.");
            throw null;
        }
        this.f11483b = k1Var.i();
    }

    public static void a(int i11, List list) {
        int size = list.size() - i11;
        StringBuilder sb2 = new StringBuilder(String.valueOf(size).length() + 26);
        sb2.append("Element at index ");
        sb2.append(size);
        sb2.append(" is null.");
        String string = sb2.toString();
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < i11) {
                throw new NullPointerException(string);
            }
            list.remove(size2);
        }
    }

    public final void b() {
        if (this.f11483b.g()) {
            return;
        }
        k1 k1VarI = this.f11482a.i();
        j2.f11503c.a(k1VarI.getClass()).d(k1VarI, this.f11483b);
        this.f11483b = k1VarI;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final i1 clone() {
        i1 i1Var = (i1) this.f11482a.s(5);
        boolean zG = this.f11483b.g();
        k1 k1Var = this.f11483b;
        if (zG) {
            k1Var.getClass();
            j2.f11503c.a(k1Var.getClass()).f(k1Var);
            k1Var.h();
            k1Var = this.f11483b;
        }
        i1Var.f11483b = k1Var;
        return i1Var;
    }

    public final k1 d() {
        boolean zG = this.f11483b.g();
        k1 k1Var = this.f11483b;
        if (zG) {
            k1Var.getClass();
            j2.f11503c.a(k1Var.getClass()).f(k1Var);
            k1Var.h();
            k1Var = this.f11483b;
        }
        k1Var.getClass();
        if (k1.q(k1Var, true)) {
            return k1Var;
        }
        throw new zzafy();
    }

    public final void f(k1 k1Var) {
        k1 k1Var2 = this.f11482a;
        if (k1Var2.equals(k1Var)) {
            return;
        }
        if (!this.f11483b.g()) {
            k1 k1VarI = k1Var2.i();
            j2.f11503c.a(k1VarI.getClass()).d(k1VarI, this.f11483b);
            this.f11483b = k1VarI;
        }
        k1 k1Var3 = this.f11483b;
        j2.f11503c.a(k1Var3.getClass()).d(k1Var3, k1Var);
    }

    public final void h(byte[] bArr, int i11, c1 c1Var) throws zzaeh {
        if (!this.f11483b.g()) {
            k1 k1VarI = this.f11482a.i();
            j2.f11503c.a(k1VarI.getClass()).d(k1VarI, this.f11483b);
            this.f11483b = k1VarI;
        }
        try {
            j2.f11503c.a(this.f11483b.getClass()).h(this.f11483b, bArr, 0, i11, new q0(c1Var));
        } catch (zzaeh e5) {
            throw e5;
        } catch (IOException e11) {
            a40.d0.o("Reading from byte array should not throw IOException.", e11);
        } catch (IndexOutOfBoundsException unused) {
            c50.w.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }
}
