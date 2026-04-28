package ja0;

import com.adyen.checkout.ui.core.internal.ui.view.ExpiryDateInput;
import ia0.a0;
import j4.s;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ia0.j f24795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ia0.j f24796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ia0.j f24797c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ia0.j f24798d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ia0.j f24799e;

    static {
        ia0.j jVar = ia0.j.f23646d;
        f24795a = r40.d.p(ExpiryDateInput.SEPARATOR);
        f24796b = r40.d.p("\\");
        f24797c = r40.d.p("/\\");
        f24798d = r40.d.p(".");
        f24799e = r40.d.p("..");
    }

    public static final int a(a0 a0Var) {
        ia0.j jVar = a0Var.f23603a;
        if (jVar.e() != 0) {
            if (jVar.j(0) != 47) {
                if (jVar.j(0) == 92) {
                    if (jVar.e() > 2 && jVar.j(1) == 92) {
                        ia0.j jVar2 = f24796b;
                        jVar2.getClass();
                        int iG = jVar.g(2, jVar2.i());
                        return iG == -1 ? jVar.e() : iG;
                    }
                } else if (jVar.e() > 2 && jVar.j(1) == 58 && jVar.j(2) == 92) {
                    char cJ = (char) jVar.j(0);
                    if ('a' <= cJ && cJ < '{') {
                        return 3;
                    }
                    if ('A' <= cJ && cJ < '[') {
                        return 3;
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    public static final a0 b(a0 a0Var, a0 a0Var2, boolean z11) {
        a0Var2.getClass();
        if (a(a0Var2) != -1 || a0Var2.g() != null) {
            return a0Var2;
        }
        ia0.j jVarC = c(a0Var);
        if (jVarC == null && (jVarC = c(a0Var2)) == null) {
            jVarC = f(a0.f23602b);
        }
        ia0.g gVar = new ia0.g();
        gVar.y0(a0Var.f23603a);
        if (gVar.f23643b > 0) {
            gVar.y0(jVarC);
        }
        gVar.y0(a0Var2.f23603a);
        return d(gVar, z11);
    }

    public static final ia0.j c(a0 a0Var) {
        ia0.j jVar = a0Var.f23603a;
        ia0.j jVar2 = f24795a;
        if (ia0.j.h(jVar, jVar2) != -1) {
            return jVar2;
        }
        ia0.j jVar3 = a0Var.f23603a;
        ia0.j jVar4 = f24796b;
        if (ia0.j.h(jVar3, jVar4) != -1) {
            return jVar4;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0110 A[EDGE_INSN: B:98:0x0110->B:81:0x0110 BREAK  A[LOOP:1: B:53:0x00ab->B:112:0x00ab], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final ia0.a0 d(ia0.g r17, boolean r18) throws java.io.EOFException {
        /*
            Method dump skipped, instruction units count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ja0.c.d(ia0.g, boolean):ia0.a0");
    }

    public static final ia0.j e(byte b8) {
        if (b8 == 47) {
            return f24795a;
        }
        if (b8 == 92) {
            return f24796b;
        }
        i4.a.f(s.f(b8, "not a directory separator: "));
        return null;
    }

    public static final ia0.j f(String str) {
        if (Intrinsics.areEqual(str, ExpiryDateInput.SEPARATOR)) {
            return f24795a;
        }
        if (Intrinsics.areEqual(str, "\\")) {
            return f24796b;
        }
        i4.a.f(e0.f.k("not a directory separator: ", str));
        return null;
    }
}
