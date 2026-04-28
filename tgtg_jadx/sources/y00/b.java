package y00;

import com.adyen.checkout.components.core.Address;
import com.google.android.gms.internal.measurement.h7;
import com.google.android.gms.internal.measurement.j7;
import com.google.android.gms.internal.measurement.l7;
import com.google.android.gms.internal.measurement.l9;
import com.google.android.gms.internal.measurement.n7;
import com.google.android.gms.internal.measurement.o7;
import java.math.BigDecimal;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends g9.a0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f44587g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c f44588h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.k1 f44589i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, String str, int i11, com.google.android.gms.internal.measurement.k1 k1Var, int i12) {
        super(str, i11);
        this.f44587g = i12;
        this.f44588h = cVar;
        this.f44589i = k1Var;
    }

    @Override // g9.a0
    public final int c() {
        switch (this.f44587g) {
            case 0:
                return ((h7) this.f44589i).u();
            default:
                return ((n7) this.f44589i).u();
        }
    }

    @Override // g9.a0
    public final boolean d() {
        switch (this.f44587g) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    @Override // g9.a0
    public final boolean e() {
        switch (this.f44587g) {
            case 0:
                return ((h7) this.f44589i).z();
            default:
                return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x03c9 A[EDGE_INSN: B:234:0x03c9->B:161:0x03c9 BREAK  A[LOOP:3: B:89:0x0246->B:238:0x0246], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x017c  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean i(java.lang.Long r22, java.lang.Long r23, com.google.android.gms.internal.measurement.t8 r24, long r25, y00.r r27, boolean r28) {
        /*
            Method dump skipped, instruction units count: 1085
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y00.b.i(java.lang.Long, java.lang.Long, com.google.android.gms.internal.measurement.t8, long, y00.r, boolean):boolean");
    }

    public boolean j(Long l, Long l7, l9 l9Var, boolean z11) {
        boolean z12;
        Boolean boolF;
        Boolean boolH;
        Boolean boolH2;
        Boolean boolH3;
        com.google.android.gms.internal.measurement.s3.a();
        n1 n1Var = (n1) this.f44588h.f21216b;
        g gVar = n1Var.f44985d;
        r0 r0Var = n1Var.f44991j;
        w0 w0Var = n1Var.f44987f;
        boolean zA = gVar.A(this.f20097a, g0.D0);
        n7 n7Var = (n7) this.f44589i;
        boolean zX = n7Var.x();
        boolean zY = n7Var.y();
        boolean zA2 = n7Var.A();
        boolean z13 = zX || zY || zA2;
        if (z11 && !z13) {
            n1.m(w0Var);
            w0Var.f45267o.c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.f20098b), n7Var.t() ? Integer.valueOf(n7Var.u()) : null);
            return true;
        }
        j7 j7VarW = n7Var.w();
        boolean zY2 = j7VarW.y();
        if (!l9Var.y()) {
            z12 = zA2;
            if (!l9Var.C()) {
                if (!l9Var.w()) {
                    n1.m(w0Var);
                    w0Var.f45263j.b(r0Var.c(l9Var.v()), "User property has no value, property");
                } else if (j7VarW.t()) {
                    String strX = l9Var.x();
                    o7 o7VarU = j7VarW.u();
                    n1.m(w0Var);
                    boolF = g9.a0.f(g9.a0.g(strX, o7VarU, w0Var), zY2);
                } else if (!j7VarW.v()) {
                    n1.m(w0Var);
                    w0Var.f45263j.b(r0Var.c(l9Var.v()), "No string or number filter defined. property");
                } else if (n4.T(l9Var.x())) {
                    String strX2 = l9Var.x();
                    l7 l7VarW = j7VarW.w();
                    if (n4.T(strX2)) {
                        try {
                            boolH = g9.a0.h(new BigDecimal(strX2), l7VarW, 0.0d);
                        } catch (NumberFormatException unused) {
                            boolH = null;
                        }
                        boolF = g9.a0.f(boolH, zY2);
                    } else {
                        boolH = null;
                        boolF = g9.a0.f(boolH, zY2);
                    }
                } else {
                    n1.m(w0Var);
                    w0Var.f45263j.c("Invalid user property value for Numeric number filter. property, value", r0Var.c(l9Var.v()), l9Var.x());
                }
                boolF = null;
            } else if (j7VarW.v()) {
                double D = l9Var.D();
                try {
                    boolH2 = g9.a0.h(new BigDecimal(D), j7VarW.w(), Math.ulp(D));
                } catch (NumberFormatException unused2) {
                    boolH2 = null;
                }
                boolF = g9.a0.f(boolH2, zY2);
            } else {
                n1.m(w0Var);
                w0Var.f45263j.b(r0Var.c(l9Var.v()), "No number filter for double property. property");
                boolF = null;
            }
        } else if (j7VarW.v()) {
            z12 = zA2;
            try {
                boolH3 = g9.a0.h(new BigDecimal(l9Var.z()), j7VarW.w(), 0.0d);
            } catch (NumberFormatException unused3) {
                boolH3 = null;
            }
            boolF = g9.a0.f(boolH3, zY2);
        } else {
            n1.m(w0Var);
            w0Var.f45263j.b(r0Var.c(l9Var.v()), "No number filter for long property. property");
            z12 = zA2;
            boolF = null;
        }
        n1.m(w0Var);
        w0Var.f45267o.b(boolF == null ? Address.ADDRESS_NULL_PLACEHOLDER : boolF, "Property filter result");
        if (boolF == null) {
            return false;
        }
        this.f20099c = Boolean.TRUE;
        if (!z12 || boolF.booleanValue()) {
            if (!z11 || n7Var.x()) {
                this.f20100d = boolF;
            }
            if (boolF.booleanValue() && z13 && l9Var.t()) {
                long jU = l9Var.u();
                if (l != null) {
                    jU = l.longValue();
                }
                if (zA && n7Var.x() && !n7Var.y() && l7 != null) {
                    jU = l7.longValue();
                }
                if (n7Var.y()) {
                    this.f20102f = Long.valueOf(jU);
                } else {
                    this.f20101e = Long.valueOf(jU);
                }
            }
        }
        return true;
    }
}
