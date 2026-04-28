package n90;

import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.serialization.json.internal.JsonDecodingException;
import m90.c1;
import m90.r1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m90.g0 f30779a;

    static {
        o30.f0.R(StringCompanionObject.INSTANCE);
        f30779a = c1.a("kotlinx.serialization.json.JsonUnquotedLiteral", r1.f29848a);
    }

    public static final g0 a(Number number) {
        return new v(number, false, null);
    }

    public static final g0 b(String str) {
        return str == null ? y.INSTANCE : new v(str, true, null);
    }

    public static final void c(String str, n nVar) {
        throw new IllegalArgumentException("Element " + Reflection.getOrCreateKotlinClass(nVar.getClass()) + " is not a " + str);
    }

    public static final boolean d(g0 g0Var) {
        Boolean boolB = o90.a0.b(g0Var.b());
        if (boolB != null) {
            return boolB.booleanValue();
        }
        throw new IllegalStateException(g0Var + " does not represent a Boolean");
    }

    public static final int e(g0 g0Var) {
        try {
            long jI = i(g0Var);
            if (-2147483648L <= jI && jI <= 2147483647L) {
                return (int) jI;
            }
            throw new NumberFormatException(g0Var.b() + " is not an Int");
        } catch (JsonDecodingException e5) {
            throw new NumberFormatException(e5.getMessage());
        }
    }

    public static final e f(n nVar) {
        e eVar = nVar instanceof e ? (e) nVar : null;
        if (eVar != null) {
            return eVar;
        }
        c("JsonArray", nVar);
        throw null;
    }

    public static final b0 g(n nVar) {
        nVar.getClass();
        b0 b0Var = nVar instanceof b0 ? (b0) nVar : null;
        if (b0Var != null) {
            return b0Var;
        }
        c("JsonObject", nVar);
        throw null;
    }

    public static final g0 h(n nVar) {
        g0 g0Var = nVar instanceof g0 ? (g0) nVar : null;
        if (g0Var != null) {
            return g0Var;
        }
        c("JsonPrimitive", nVar);
        throw null;
    }

    public static final long i(g0 g0Var) {
        String strB = g0Var.b();
        i0.w wVar = new i0.w(strB);
        long jO = wVar.o();
        if (wVar.l() == 10) {
            return jO;
        }
        int i11 = wVar.f22745b;
        int i12 = i11 - 1;
        i0.w.t(wVar, w.a0.p("Expected input to contain a single valid number, but got '", (i11 == strB.length() || i12 < 0) ? "EOF" : String.valueOf(strB.charAt(i12)), "' after it"), i12, null, 4);
        throw null;
    }
}
