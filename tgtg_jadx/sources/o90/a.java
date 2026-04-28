package o90;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.d0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import m90.g1;
import n90.g0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements n90.l, Decoder, l90.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f32149a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f32150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n90.c f32151c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f32152d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n90.j f32153e;

    public a(String str, n90.c cVar) {
        this.f32151c = cVar;
        this.f32152d = str;
        this.f32153e = cVar.f30749a;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final byte A() {
        return H(T());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final short B() {
        return O(T());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final float C() {
        return K(T());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final double D() {
        return J(T());
    }

    public abstract n90.n E(String str);

    public final n90.n F() {
        n90.n nVarE;
        String str = (String) CollectionsKt.X(this.f32149a);
        return (str == null || (nVarE = E(str)) == null) ? S() : nVarE;
    }

    public final boolean G(Object obj) {
        String str = (String) obj;
        str.getClass();
        n90.n nVarE = E(str);
        if (!(nVarE instanceof g0)) {
            throw k.d(-1, "Expected " + Reflection.getOrCreateKotlinClass(g0.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(nVarE.getClass()).getSimpleName() + " as the serialized body of boolean at element: " + V(str), nVarE.toString());
        }
        g0 g0Var = (g0) nVarE;
        try {
            m90.g0 g0Var2 = n90.o.f30779a;
            Boolean boolB = a0.b(g0Var.b());
            if (boolB != null) {
                return boolB.booleanValue();
            }
            W(g0Var, "boolean", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            W(g0Var, "boolean", str);
            throw null;
        }
    }

    public final byte H(Object obj) {
        String str = (String) obj;
        str.getClass();
        n90.n nVarE = E(str);
        if (!(nVarE instanceof g0)) {
            throw k.d(-1, "Expected " + Reflection.getOrCreateKotlinClass(g0.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(nVarE.getClass()).getSimpleName() + " as the serialized body of byte at element: " + V(str), nVarE.toString());
        }
        g0 g0Var = (g0) nVarE;
        try {
            long jI = n90.o.i(g0Var);
            Byte bValueOf = (-128 > jI || jI > 127) ? null : Byte.valueOf((byte) jI);
            if (bValueOf != null) {
                return bValueOf.byteValue();
            }
            W(g0Var, "byte", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            W(g0Var, "byte", str);
            throw null;
        }
    }

    public final char I(Object obj) {
        String str = (String) obj;
        str.getClass();
        n90.n nVarE = E(str);
        if (!(nVarE instanceof g0)) {
            throw k.d(-1, "Expected " + Reflection.getOrCreateKotlinClass(g0.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(nVarE.getClass()).getSimpleName() + " as the serialized body of char at element: " + V(str), nVarE.toString());
        }
        g0 g0Var = (g0) nVarE;
        try {
            String strB = g0Var.b();
            strB.getClass();
            int length = strB.length();
            if (length == 0) {
                throw new NoSuchElementException("Char sequence is empty.");
            }
            if (length == 1) {
                return strB.charAt(0);
            }
            throw new IllegalArgumentException("Char sequence has more than one element.");
        } catch (IllegalArgumentException unused) {
            W(g0Var, "char", str);
            throw null;
        }
    }

    public final double J(Object obj) {
        String str = (String) obj;
        str.getClass();
        n90.n nVarE = E(str);
        if (!(nVarE instanceof g0)) {
            throw k.d(-1, "Expected " + Reflection.getOrCreateKotlinClass(g0.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(nVarE.getClass()).getSimpleName() + " as the serialized body of double at element: " + V(str), nVarE.toString());
        }
        g0 g0Var = (g0) nVarE;
        try {
            m90.g0 g0Var2 = n90.o.f30779a;
            double d3 = Double.parseDouble(g0Var.b());
            n90.j jVar = this.f32151c.f30749a;
            if (Math.abs(d3) <= Double.MAX_VALUE) {
                return d3;
            }
            Double dValueOf = Double.valueOf(d3);
            String string = F().toString();
            string.getClass();
            throw k.c(-1, k.t(dValueOf, str, string));
        } catch (IllegalArgumentException unused) {
            W(g0Var, "double", str);
            throw null;
        }
    }

    public final float K(Object obj) {
        String str = (String) obj;
        str.getClass();
        n90.n nVarE = E(str);
        if (!(nVarE instanceof g0)) {
            throw k.d(-1, "Expected " + Reflection.getOrCreateKotlinClass(g0.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(nVarE.getClass()).getSimpleName() + " as the serialized body of float at element: " + V(str), nVarE.toString());
        }
        g0 g0Var = (g0) nVarE;
        try {
            m90.g0 g0Var2 = n90.o.f30779a;
            float f11 = Float.parseFloat(g0Var.b());
            n90.j jVar = this.f32151c.f30749a;
            if (Math.abs(f11) <= Float.MAX_VALUE) {
                return f11;
            }
            Float fValueOf = Float.valueOf(f11);
            String string = F().toString();
            string.getClass();
            throw k.c(-1, k.t(fValueOf, str, string));
        } catch (IllegalArgumentException unused) {
            W(g0Var, "float", str);
            throw null;
        }
    }

    public final Decoder L(Object obj, SerialDescriptor serialDescriptor) {
        String str = (String) obj;
        str.getClass();
        serialDescriptor.getClass();
        if (!z.a(serialDescriptor)) {
            this.f32149a.add(str);
            return this;
        }
        n90.n nVarE = E(str);
        String strA = serialDescriptor.a();
        if (nVarE instanceof g0) {
            String strB = ((g0) nVarE).b();
            n90.c cVar = this.f32151c;
            cVar.getClass();
            strB.getClass();
            return new i(new i0.w(strB), cVar);
        }
        throw k.d(-1, "Expected " + Reflection.getOrCreateKotlinClass(g0.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(nVarE.getClass()).getSimpleName() + " as the serialized body of " + strA + " at element: " + V(str), nVarE.toString());
    }

    public final int M(Object obj) {
        String str = (String) obj;
        str.getClass();
        n90.n nVarE = E(str);
        if (!(nVarE instanceof g0)) {
            throw k.d(-1, "Expected " + Reflection.getOrCreateKotlinClass(g0.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(nVarE.getClass()).getSimpleName() + " as the serialized body of int at element: " + V(str), nVarE.toString());
        }
        g0 g0Var = (g0) nVarE;
        try {
            long jI = n90.o.i(g0Var);
            Integer numValueOf = (-2147483648L > jI || jI > 2147483647L) ? null : Integer.valueOf((int) jI);
            if (numValueOf != null) {
                return numValueOf.intValue();
            }
            W(g0Var, "int", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            W(g0Var, "int", str);
            throw null;
        }
    }

    public final long N(Object obj) {
        String str = (String) obj;
        str.getClass();
        n90.n nVarE = E(str);
        if (nVarE instanceof g0) {
            g0 g0Var = (g0) nVarE;
            try {
                return n90.o.i(g0Var);
            } catch (IllegalArgumentException unused) {
                W(g0Var, "long", str);
                throw null;
            }
        }
        throw k.d(-1, "Expected " + Reflection.getOrCreateKotlinClass(g0.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(nVarE.getClass()).getSimpleName() + " as the serialized body of long at element: " + V(str), nVarE.toString());
    }

    public final short O(Object obj) {
        String str = (String) obj;
        str.getClass();
        n90.n nVarE = E(str);
        if (!(nVarE instanceof g0)) {
            throw k.d(-1, "Expected " + Reflection.getOrCreateKotlinClass(g0.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(nVarE.getClass()).getSimpleName() + " as the serialized body of short at element: " + V(str), nVarE.toString());
        }
        g0 g0Var = (g0) nVarE;
        try {
            long jI = n90.o.i(g0Var);
            Short shValueOf = (-32768 > jI || jI > 32767) ? null : Short.valueOf((short) jI);
            if (shValueOf != null) {
                return shValueOf.shortValue();
            }
            W(g0Var, "short", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            W(g0Var, "short", str);
            throw null;
        }
    }

    public final String P(Object obj) {
        String str = (String) obj;
        str.getClass();
        n90.n nVarE = E(str);
        if (!(nVarE instanceof g0)) {
            throw k.d(-1, "Expected " + Reflection.getOrCreateKotlinClass(g0.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(nVarE.getClass()).getSimpleName() + " as the serialized body of string at element: " + V(str), nVarE.toString());
        }
        g0 g0Var = (g0) nVarE;
        if (!(g0Var instanceof n90.v)) {
            StringBuilder sbS = e0.f.s("Expected string value for a non-null key '", str, "', got null literal instead at element: ");
            sbS.append(V(str));
            throw k.d(-1, sbS.toString(), F().toString());
        }
        n90.v vVar = (n90.v) g0Var;
        if (vVar.f30784a || this.f32151c.f30749a.f30773c) {
            return vVar.f30786c;
        }
        StringBuilder sbS2 = e0.f.s("String literal for key '", str, "' should be quoted at element: ");
        sbS2.append(V(str));
        sbS2.append(".\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.");
        throw k.d(-1, sbS2.toString(), F().toString());
    }

    public String Q(SerialDescriptor serialDescriptor, int i11) {
        serialDescriptor.getClass();
        return serialDescriptor.f(i11);
    }

    public final String R(SerialDescriptor serialDescriptor, int i11) {
        serialDescriptor.getClass();
        String strQ = Q(serialDescriptor, i11);
        strQ.getClass();
        return strQ;
    }

    public abstract n90.n S();

    public final Object T() {
        ArrayList arrayList = this.f32149a;
        Object objRemove = arrayList.remove(d0.g(arrayList));
        this.f32150b = true;
        return objRemove;
    }

    public final String U() {
        ArrayList arrayList = this.f32149a;
        return arrayList.isEmpty() ? "$" : CollectionsKt.U(arrayList, ".", "$.", null, null, 60);
    }

    public final String V(String str) {
        str.getClass();
        return U() + '.' + str;
    }

    public final void W(g0 g0Var, String str, String str2) {
        throw k.d(-1, "Failed to parse literal '" + g0Var + "' as " + (kotlin.text.y.p(str, "i", false) ? "an " : "a ").concat(str) + " value at element: " + V(str2), F().toString());
    }

    @Override // kotlinx.serialization.encoding.Decoder, l90.a
    public final i2.x a() {
        return this.f32151c.f30750b;
    }

    @Override // l90.a
    public void b(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public l90.a c(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        n90.n nVarF = F();
        p30.b kind = serialDescriptor.getKind();
        boolean zAreEqual = Intrinsics.areEqual(kind, k90.j.f26241k);
        n90.c cVar = this.f32151c;
        if (zAreEqual || (kind instanceof k90.c)) {
            String strA = serialDescriptor.a();
            if (nVarF instanceof n90.e) {
                return new p(cVar, (n90.e) nVarF);
            }
            throw k.d(-1, "Expected " + Reflection.getOrCreateKotlinClass(n90.e.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(nVarF.getClass()).getSimpleName() + " as the serialized body of " + strA + " at element: " + U(), nVarF.toString());
        }
        if (!Intrinsics.areEqual(kind, k90.j.l)) {
            String strA2 = serialDescriptor.a();
            if (nVarF instanceof n90.b0) {
                return new o(cVar, (n90.b0) nVarF, this.f32152d, 8);
            }
            throw k.d(-1, "Expected " + Reflection.getOrCreateKotlinClass(n90.b0.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(nVarF.getClass()).getSimpleName() + " as the serialized body of " + strA2 + " at element: " + U(), nVarF.toString());
        }
        SerialDescriptor serialDescriptorF = k.f(serialDescriptor.h(0), cVar.f30750b);
        p30.b kind2 = serialDescriptorF.getKind();
        if (!(kind2 instanceof k90.d) && !Intrinsics.areEqual(kind2, k90.i.f26239j)) {
            throw k.b(serialDescriptorF);
        }
        String strA3 = serialDescriptor.a();
        if (nVarF instanceof n90.b0) {
            return new q(cVar, (n90.b0) nVarF);
        }
        throw k.d(-1, "Expected " + Reflection.getOrCreateKotlinClass(n90.b0.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(nVarF.getClass()).getSimpleName() + " as the serialized body of " + strA3 + " at element: " + U(), nVarF.toString());
    }

    @Override // l90.a
    public final char d(g1 g1Var, int i11) {
        g1Var.getClass();
        return I(R(g1Var, i11));
    }

    @Override // l90.a
    public final short e(g1 g1Var, int i11) {
        g1Var.getClass();
        return O(R(g1Var, i11));
    }

    @Override // l90.a
    public final byte f(g1 g1Var, int i11) {
        g1Var.getClass();
        return H(R(g1Var, i11));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final boolean g() {
        return G(T());
    }

    @Override // n90.l
    public final n90.c getJson() {
        return this.f32151c;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final Object h(i90.b bVar) {
        bVar.getClass();
        if (!(bVar instanceof m90.b)) {
            return bVar.deserialize(this);
        }
        n90.c cVar = this.f32151c;
        n90.j jVar = cVar.f30749a;
        m90.b bVar2 = (m90.b) bVar;
        String strI = k.i(bVar2.getDescriptor(), cVar);
        n90.n nVarF = F();
        String strA = bVar2.getDescriptor().a();
        if (!(nVarF instanceof n90.b0)) {
            throw k.d(-1, "Expected " + Reflection.getOrCreateKotlinClass(n90.b0.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(nVarF.getClass()).getSimpleName() + " as the serialized body of " + strA + " at element: " + U(), nVarF.toString());
        }
        n90.b0 b0Var = (n90.b0) nVarF;
        n90.n nVar = (n90.n) b0Var.get(strI);
        String strB = null;
        if (nVar != null) {
            g0 g0VarH = n90.o.h(nVar);
            if (!(g0VarH instanceof n90.y)) {
                strB = g0VarH.b();
            }
        }
        try {
            return k.p(cVar, strI, b0Var, b0.a0.t((m90.b) bVar, this, strB));
        } catch (SerializationException e5) {
            String message = e5.getMessage();
            message.getClass();
            throw k.d(-1, message, b0Var.toString());
        }
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final char i() {
        return I(T());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final int j(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        String str = (String) T();
        str.getClass();
        n90.n nVarE = E(str);
        String strA = serialDescriptor.a();
        if (nVarE instanceof g0) {
            return k.k(serialDescriptor, this.f32151c, ((g0) nVarE).b(), "");
        }
        throw k.d(-1, "Expected " + Reflection.getOrCreateKotlinClass(g0.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(nVarE.getClass()).getSimpleName() + " as the serialized body of " + strA + " at element: " + V(str), nVarE.toString());
    }

    @Override // l90.a
    public final long k(SerialDescriptor serialDescriptor, int i11) {
        serialDescriptor.getClass();
        return N(R(serialDescriptor, i11));
    }

    @Override // l90.a
    public final float l(g1 g1Var, int i11) {
        g1Var.getClass();
        return K(R(g1Var, i11));
    }

    @Override // l90.a
    public final Object m(SerialDescriptor serialDescriptor, int i11, i90.b bVar, Object obj) {
        serialDescriptor.getClass();
        bVar.getClass();
        this.f32149a.add(R(serialDescriptor, i11));
        Object objH = (bVar.getDescriptor().c() || v()) ? h(bVar) : null;
        if (!this.f32150b) {
            T();
        }
        this.f32150b = false;
        return objH;
    }

    @Override // l90.a
    public final Object n(SerialDescriptor serialDescriptor, int i11, i90.b bVar, Object obj) {
        serialDescriptor.getClass();
        bVar.getClass();
        this.f32149a.add(R(serialDescriptor, i11));
        bVar.getClass();
        Object objH = h(bVar);
        if (!this.f32150b) {
            T();
        }
        this.f32150b = false;
        return objH;
    }

    @Override // n90.l
    public final n90.n o() {
        return F();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final int p() {
        return M(T());
    }

    @Override // l90.a
    public final int q(SerialDescriptor serialDescriptor, int i11) {
        serialDescriptor.getClass();
        return M(R(serialDescriptor, i11));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final String r() {
        return P(T());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final long s() {
        return N(T());
    }

    @Override // l90.a
    public final boolean t(SerialDescriptor serialDescriptor, int i11) {
        serialDescriptor.getClass();
        return G(R(serialDescriptor, i11));
    }

    @Override // l90.a
    public final String u(SerialDescriptor serialDescriptor, int i11) {
        serialDescriptor.getClass();
        return P(R(serialDescriptor, i11));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean v() {
        return !(F() instanceof n90.y);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final Decoder x(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        if (CollectionsKt.X(this.f32149a) != null) {
            return L(T(), serialDescriptor);
        }
        return new m(this.f32151c, S(), this.f32152d).x(serialDescriptor);
    }

    @Override // l90.a
    public final double y(SerialDescriptor serialDescriptor, int i11) {
        serialDescriptor.getClass();
        return J(R(serialDescriptor, i11));
    }

    @Override // l90.a
    public final Decoder z(g1 g1Var, int i11) {
        g1Var.getClass();
        return L(R(g1Var, i11), g1Var.h(i11));
    }
}
