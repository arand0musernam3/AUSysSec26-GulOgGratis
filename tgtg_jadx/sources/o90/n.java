package o90;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.collections.d0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.internal.JsonEncodingException;
import m90.g0;
import m90.g1;
import m90.z0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public class n implements n90.s, Encoder, l90.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f32176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n90.c f32177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f32178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n90.j f32179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f32180e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f32181f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f32182g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f32183h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n(n90.c cVar, Function1 function1, int i11) {
        this(cVar, function1, (char) 0);
        this.f32182g = i11;
        cVar.getClass();
        function1.getClass();
        switch (i11) {
            case 1:
                this(cVar, function1, (char) 0);
                this.f32183h = new LinkedHashMap();
                break;
            case 2:
                this(cVar, function1, (char) 0);
                this.f32183h = new ArrayList();
                break;
            default:
                this.f32176a.add("primitive");
                break;
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void A(long j9) {
        String str = (String) K();
        str.getClass();
        L(str, n90.o.a(Long.valueOf(j9)));
    }

    @Override // l90.b
    public final void B(SerialDescriptor serialDescriptor, int i11, long j9) {
        serialDescriptor.getClass();
        L(J(serialDescriptor, i11), n90.o.a(Long.valueOf(j9)));
    }

    @Override // l90.b
    public final boolean C(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return this.f32179d.f30771a;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void D(String str) {
        str.getClass();
        String str2 = (String) K();
        str2.getClass();
        L(str2, n90.o.b(str));
    }

    public final void E(SerialDescriptor serialDescriptor, int i11, KSerializer kSerializer, Object obj) {
        serialDescriptor.getClass();
        kSerializer.getClass();
        this.f32176a.add(J(serialDescriptor, i11));
        if (kSerializer.getDescriptor().c()) {
            w(kSerializer, obj);
        } else if (obj == null) {
            f();
        } else {
            w(kSerializer, obj);
        }
    }

    public final void F(double d3, Object obj) {
        String str = (String) obj;
        str.getClass();
        L(str, n90.o.a(Double.valueOf(d3)));
        this.f32179d.getClass();
        if (Math.abs(d3) <= Double.MAX_VALUE) {
            return;
        }
        Double dValueOf = Double.valueOf(d3);
        String string = I().toString();
        string.getClass();
        throw new JsonEncodingException(k.t(dValueOf, str, string));
    }

    public final void G(float f11, Object obj) {
        String str = (String) obj;
        str.getClass();
        L(str, n90.o.a(Float.valueOf(f11)));
        this.f32179d.getClass();
        if (Math.abs(f11) <= Float.MAX_VALUE) {
            return;
        }
        Float fValueOf = Float.valueOf(f11);
        String string = I().toString();
        string.getClass();
        throw new JsonEncodingException(k.t(fValueOf, str, string));
    }

    public final Encoder H(Object obj, SerialDescriptor serialDescriptor) {
        String str = (String) obj;
        str.getClass();
        serialDescriptor.getClass();
        if (z.a(serialDescriptor)) {
            return new b(this, str);
        }
        if (serialDescriptor.isInline() && Intrinsics.areEqual(serialDescriptor, n90.o.f30779a)) {
            return new b(this, str, serialDescriptor);
        }
        this.f32176a.add(str);
        return this;
    }

    public n90.n I() {
        switch (this.f32182g) {
            case 0:
                n90.n nVar = (n90.n) this.f32183h;
                if (nVar != null) {
                    return nVar;
                }
                i4.a.f("Primitive element has not been recorded. Is call to .encodeXxx is missing in serializer?");
                return null;
            case 1:
                return new n90.b0((LinkedHashMap) this.f32183h);
            default:
                return new n90.e((ArrayList) this.f32183h);
        }
    }

    public final String J(SerialDescriptor serialDescriptor, int i11) {
        String strValueOf;
        serialDescriptor.getClass();
        int i12 = this.f32182g;
        serialDescriptor.getClass();
        switch (i12) {
            case 2:
                strValueOf = String.valueOf(i11);
                break;
            default:
                n90.c cVar = this.f32177b;
                cVar.getClass();
                k.o(serialDescriptor, cVar);
                strValueOf = serialDescriptor.f(i11);
                break;
        }
        strValueOf.getClass();
        return strValueOf;
    }

    public final Object K() {
        ArrayList arrayList = this.f32176a;
        if (arrayList.isEmpty()) {
            throw new SerializationException("No tag in stack for requested element");
        }
        return arrayList.remove(d0.g(arrayList));
    }

    public void L(String str, n90.n nVar) {
        int i11 = this.f32182g;
        str.getClass();
        nVar.getClass();
        switch (i11) {
            case 0:
                if (str != "primitive") {
                    i4.a.f("This output can only consume primitives with 'primitive' tag");
                } else if (((n90.n) this.f32183h) != null) {
                    i4.a.f("Primitive element was already recorded. Does call to .encodeXxx happen more than once?");
                } else {
                    this.f32183h = nVar;
                    this.f32178c.invoke(nVar);
                }
                break;
            case 1:
                ((LinkedHashMap) this.f32183h).put(str, nVar);
                break;
            default:
                ((ArrayList) this.f32183h).add(Integer.parseInt(str), nVar);
                break;
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final i2.x a() {
        return this.f32177b.f30750b;
    }

    @Override // l90.b
    public final void b(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        if (!this.f32176a.isEmpty()) {
            K();
        }
        this.f32178c.invoke(I());
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final l90.b c(SerialDescriptor serialDescriptor) {
        n nVar;
        serialDescriptor.getClass();
        Function1 z0Var = CollectionsKt.X(this.f32176a) == null ? this.f32178c : new z0(this, 8);
        p30.b kind = serialDescriptor.getKind();
        boolean zAreEqual = Intrinsics.areEqual(kind, k90.j.f26241k);
        n90.c cVar = this.f32177b;
        if (zAreEqual || (kind instanceof k90.c)) {
            nVar = new n(cVar, z0Var, 2);
        } else if (Intrinsics.areEqual(kind, k90.j.l)) {
            SerialDescriptor serialDescriptorF = k.f(serialDescriptor.h(0), cVar.f30750b);
            p30.b kind2 = serialDescriptorF.getKind();
            if (!(kind2 instanceof k90.d) && !Intrinsics.areEqual(kind2, k90.i.f26239j)) {
                throw k.b(serialDescriptorF);
            }
            z0Var.getClass();
            r rVar = new r(cVar, z0Var, 1);
            rVar.f32195j = true;
            nVar = rVar;
        } else {
            nVar = new n(cVar, z0Var, 1);
        }
        String str = this.f32180e;
        if (str != null) {
            if (nVar instanceof r) {
                r rVar2 = (r) nVar;
                rVar2.L("key", n90.o.b(str));
                String strA = this.f32181f;
                if (strA == null) {
                    strA = serialDescriptor.a();
                }
                rVar2.L("value", n90.o.b(strA));
            } else {
                String strA2 = this.f32181f;
                if (strA2 == null) {
                    strA2 = serialDescriptor.a();
                }
                nVar.L(str, n90.o.b(strA2));
            }
            this.f32180e = null;
            this.f32181f = null;
        }
        return nVar;
    }

    @Override // l90.b
    public final void d(g1 g1Var, int i11, byte b8) {
        g1Var.getClass();
        L(J(g1Var, i11), n90.o.a(Byte.valueOf(b8)));
    }

    @Override // l90.b
    public final void e(g1 g1Var, int i11, char c3) {
        g1Var.getClass();
        L(J(g1Var, i11), n90.o.b(String.valueOf(c3)));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void f() {
        String str = (String) CollectionsKt.X(this.f32176a);
        if (str == null) {
            this.f32178c.invoke(n90.y.INSTANCE);
        } else {
            L(str, n90.y.INSTANCE);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void g(double d3) {
        F(d3, K());
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void h(short s7) {
        String str = (String) K();
        str.getClass();
        L(str, n90.o.a(Short.valueOf(s7)));
    }

    @Override // l90.b
    public final void i(SerialDescriptor serialDescriptor, int i11, KSerializer kSerializer, Object obj) {
        serialDescriptor.getClass();
        kSerializer.getClass();
        this.f32176a.add(J(serialDescriptor, i11));
        w(kSerializer, obj);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void j(byte b8) {
        String str = (String) K();
        str.getClass();
        L(str, n90.o.a(Byte.valueOf(b8)));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void k(boolean z11) {
        String str = (String) K();
        str.getClass();
        Boolean boolValueOf = Boolean.valueOf(z11);
        g0 g0Var = n90.o.f30779a;
        L(str, new n90.v(boolValueOf, false, null));
    }

    @Override // l90.b
    public final void l(g1 g1Var, int i11, short s7) {
        g1Var.getClass();
        L(J(g1Var, i11), n90.o.a(Short.valueOf(s7)));
    }

    @Override // l90.b
    public final void m(int i11, int i12, SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        L(J(serialDescriptor, i11), n90.o.a(Integer.valueOf(i12)));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void n(float f11) {
        G(f11, K());
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void o(char c3) {
        String str = (String) K();
        str.getClass();
        L(str, n90.o.b(String.valueOf(c3)));
    }

    @Override // l90.b
    public final void p(SerialDescriptor serialDescriptor, int i11, boolean z11) {
        serialDescriptor.getClass();
        String strJ = J(serialDescriptor, i11);
        Boolean boolValueOf = Boolean.valueOf(z11);
        g0 g0Var = n90.o.f30779a;
        L(strJ, new n90.v(boolValueOf, false, null));
    }

    @Override // l90.b
    public final void q(SerialDescriptor serialDescriptor, int i11, String str) {
        serialDescriptor.getClass();
        str.getClass();
        L(J(serialDescriptor, i11), n90.o.b(str));
    }

    @Override // l90.b
    public void r(SerialDescriptor serialDescriptor, int i11, KSerializer kSerializer, Object obj) {
        switch (this.f32182g) {
            case 1:
                serialDescriptor.getClass();
                kSerializer.getClass();
                if (obj != null || this.f32179d.f30774d) {
                    E(serialDescriptor, i11, kSerializer, obj);
                }
                break;
            default:
                E(serialDescriptor, i11, kSerializer, obj);
                break;
        }
    }

    @Override // l90.b
    public final Encoder s(g1 g1Var, int i11) {
        g1Var.getClass();
        return H(J(g1Var, i11), g1Var.h(i11));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void t(SerialDescriptor serialDescriptor, int i11) {
        serialDescriptor.getClass();
        String str = (String) K();
        str.getClass();
        L(str, n90.o.b(serialDescriptor.f(i11)));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void u(int i11) {
        String str = (String) K();
        str.getClass();
        L(str, n90.o.a(Integer.valueOf(i11)));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final Encoder v(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        if (CollectionsKt.X(this.f32176a) == null) {
            return new n(this.f32177b, this.f32178c, 0).v(serialDescriptor);
        }
        if (this.f32180e != null) {
            this.f32181f = serialDescriptor.a();
        }
        return H(K(), serialDescriptor);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
    @Override // kotlinx.serialization.encoding.Encoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(kotlinx.serialization.KSerializer r5, java.lang.Object r6) {
        /*
            r4 = this;
            r5.getClass()
            java.util.ArrayList r0 = r4.f32176a
            java.lang.Object r0 = kotlin.collections.CollectionsKt.X(r0)
            n90.c r1 = r4.f32177b
            if (r0 != 0) goto L33
            kotlinx.serialization.descriptors.SerialDescriptor r0 = r5.getDescriptor()
            i2.x r2 = r1.f30750b
            kotlinx.serialization.descriptors.SerialDescriptor r0 = o90.k.f(r0, r2)
            p30.b r2 = r0.getKind()
            boolean r2 = r2 instanceof k90.d
            if (r2 != 0) goto L27
            p30.b r0 = r0.getKind()
            k90.i r2 = k90.i.f26239j
            if (r0 != r2) goto L33
        L27:
            o90.n r0 = new o90.n
            kotlin.jvm.functions.Function1 r2 = r4.f32178c
            r3 = 0
            r0.<init>(r1, r2, r3)
            r0.w(r5, r6)
            return
        L33:
            n90.j r0 = r1.f30749a
            boolean r2 = r5 instanceof m90.b
            n90.a r0 = r0.f30778h
            if (r2 == 0) goto L40
            n90.a r3 = n90.a.NONE
            if (r0 == r3) goto L76
            goto L69
        L40:
            int[] r3 = o90.u.$EnumSwitchMapping$0
            int r0 = r0.ordinal()
            r0 = r3[r0]
            r3 = 1
            if (r0 == r3) goto L76
            r3 = 2
            if (r0 == r3) goto L76
            r3 = 3
            if (r0 != r3) goto L72
            kotlinx.serialization.descriptors.SerialDescriptor r0 = r5.getDescriptor()
            p30.b r0 = r0.getKind()
            k90.j r3 = k90.j.f26240j
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 != 0) goto L69
            k90.j r3 = k90.j.f26242m
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r0 == 0) goto L76
        L69:
            kotlinx.serialization.descriptors.SerialDescriptor r0 = r5.getDescriptor()
            java.lang.String r0 = o90.k.i(r0, r1)
            goto L77
        L72:
            e40.a.f()
            return
        L76:
            r0 = 0
        L77:
            if (r2 == 0) goto L8f
            r2 = r5
            m90.b r2 = (m90.b) r2
            if (r6 == 0) goto L83
            kotlinx.serialization.KSerializer r2 = b0.a0.u(r2, r4, r6)
            goto L90
        L83:
            kotlinx.serialization.descriptors.SerialDescriptor r5 = r2.getDescriptor()
            java.lang.String r6 = " should always be non-null. Please report issue to the kotlinx.serialization tracker."
            java.lang.String r0 = "Value for serializer "
            e40.a.h(r0, r5, r6)
            return
        L8f:
            r2 = r5
        L90:
            if (r0 == 0) goto Lac
            o90.k.e(r1, r5, r2, r0)
            kotlinx.serialization.descriptors.SerialDescriptor r5 = r2.getDescriptor()
            p30.b r5 = r5.getKind()
            o90.k.h(r5)
            kotlinx.serialization.descriptors.SerialDescriptor r5 = r2.getDescriptor()
            java.lang.String r5 = r5.a()
            r4.f32180e = r0
            r4.f32181f = r5
        Lac:
            r2.serialize(r4, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o90.n.w(kotlinx.serialization.KSerializer, java.lang.Object):void");
    }

    @Override // l90.b
    public final void y(g1 g1Var, int i11, float f11) {
        g1Var.getClass();
        G(f11, J(g1Var, i11));
    }

    @Override // l90.b
    public final void z(SerialDescriptor serialDescriptor, int i11, double d3) {
        serialDescriptor.getClass();
        F(d3, J(serialDescriptor, i11));
    }

    public n(n90.c cVar, Function1 function1, char c3) {
        this.f32176a = new ArrayList();
        this.f32177b = cVar;
        this.f32178c = function1;
        this.f32179d = cVar.f30749a;
    }
}
