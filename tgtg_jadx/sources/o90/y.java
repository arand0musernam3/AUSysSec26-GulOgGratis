package o90;

import com.adyen.checkout.components.core.Address;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class y extends na0.a implements n90.s {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c40.i f32213f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n90.c f32214g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b0 f32215h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final n90.s[] f32216i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i2.x f32217j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final n90.j f32218k;
    public boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f32219m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f32220n;

    public y(c40.i iVar, n90.c cVar, b0 b0Var, n90.s[] sVarArr) {
        iVar.getClass();
        this.f32213f = iVar;
        this.f32214g = cVar;
        this.f32215h = b0Var;
        this.f32216i = sVarArr;
        this.f32217j = cVar.f30750b;
        this.f32218k = cVar.f30749a;
        int iOrdinal = b0Var.ordinal();
        if (sVarArr != null) {
            n90.s sVar = sVarArr[iOrdinal];
            if (sVar == null && sVar == this) {
                return;
            }
            sVarArr[iOrdinal] = this;
        }
    }

    @Override // na0.a, kotlinx.serialization.encoding.Encoder
    public final void A(long j9) {
        if (this.l) {
            D(String.valueOf(j9));
        } else {
            this.f32213f.l(j9);
        }
    }

    @Override // l90.b
    public final boolean C(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return this.f32218k.f30771a;
    }

    @Override // na0.a, kotlinx.serialization.encoding.Encoder
    public final void D(String str) {
        str.getClass();
        this.f32213f.o(str);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final i2.x a() {
        return this.f32217j;
    }

    @Override // na0.a, l90.b
    public final void b(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        b0 b0Var = this.f32215h;
        if (b0Var.end != 0) {
            c40.i iVar = this.f32213f;
            iVar.getClass();
            iVar.f7069a = false;
            iVar.j(b0Var.end);
        }
    }

    @Override // na0.a, kotlinx.serialization.encoding.Encoder
    public final l90.b c(SerialDescriptor serialDescriptor) {
        n90.s sVar;
        serialDescriptor.getClass();
        n90.c cVar = this.f32214g;
        b0 b0VarQ = k.q(serialDescriptor, cVar);
        char c3 = b0VarQ.begin;
        c40.i iVar = this.f32213f;
        if (c3 != 0) {
            iVar.j(c3);
            iVar.f7069a = true;
        }
        String str = this.f32219m;
        if (str != null) {
            String strA = this.f32220n;
            if (strA == null) {
                strA = serialDescriptor.a();
            }
            iVar.g();
            iVar.o(str);
            iVar.j(':');
            iVar.getClass();
            D(strA);
            this.f32219m = null;
            this.f32220n = null;
        }
        if (this.f32215h == b0VarQ) {
            return this;
        }
        n90.s[] sVarArr = this.f32216i;
        return (sVarArr == null || (sVar = sVarArr[b0VarQ.ordinal()]) == null) ? new y(iVar, cVar, b0VarQ, sVarArr) : sVar;
    }

    @Override // na0.a, kotlinx.serialization.encoding.Encoder
    public final void f() {
        c40.i iVar = this.f32213f;
        iVar.getClass();
        ((androidx.constraintlayout.widget.z) iVar.f7070b).q(Address.ADDRESS_NULL_PLACEHOLDER);
    }

    @Override // na0.a, kotlinx.serialization.encoding.Encoder
    public final void g(double d3) {
        boolean z11 = this.l;
        c40.i iVar = this.f32213f;
        if (z11) {
            D(String.valueOf(d3));
        } else {
            ((androidx.constraintlayout.widget.z) iVar.f7070b).q(String.valueOf(d3));
        }
        if (Math.abs(d3) > Double.MAX_VALUE) {
            throw k.a(Double.valueOf(d3), ((androidx.constraintlayout.widget.z) iVar.f7070b).toString());
        }
    }

    @Override // na0.a, kotlinx.serialization.encoding.Encoder
    public final void h(short s7) {
        if (this.l) {
            D(String.valueOf((int) s7));
        } else {
            this.f32213f.n(s7);
        }
    }

    @Override // na0.a, kotlinx.serialization.encoding.Encoder
    public final void j(byte b8) {
        if (this.l) {
            D(String.valueOf((int) b8));
        } else {
            this.f32213f.i(b8);
        }
    }

    @Override // na0.a, kotlinx.serialization.encoding.Encoder
    public final void k(boolean z11) {
        if (this.l) {
            D(String.valueOf(z11));
        } else {
            ((androidx.constraintlayout.widget.z) this.f32213f.f7070b).q(String.valueOf(z11));
        }
    }

    @Override // na0.a
    public final void m0(SerialDescriptor serialDescriptor, int i11) {
        serialDescriptor.getClass();
        int i12 = x.$EnumSwitchMapping$0[this.f32215h.ordinal()];
        c40.i iVar = this.f32213f;
        boolean z11 = true;
        if (i12 == 1) {
            if (!iVar.f7069a) {
                iVar.j(',');
            }
            iVar.g();
            return;
        }
        if (i12 == 2) {
            if (iVar.f7069a) {
                this.l = true;
                iVar.g();
                return;
            }
            if (i11 % 2 == 0) {
                iVar.j(',');
                iVar.g();
            } else {
                iVar.j(':');
                iVar.p();
                z11 = false;
            }
            this.l = z11;
            return;
        }
        if (i12 != 3) {
            if (!iVar.f7069a) {
                iVar.j(',');
            }
            iVar.g();
            k.o(serialDescriptor, this.f32214g);
            D(serialDescriptor.f(i11));
            iVar.j(':');
            iVar.p();
            return;
        }
        if (i11 == 0) {
            this.l = true;
        }
        if (i11 == 1) {
            iVar.j(',');
            iVar.p();
            this.l = false;
        }
    }

    @Override // na0.a, kotlinx.serialization.encoding.Encoder
    public final void n(float f11) {
        boolean z11 = this.l;
        c40.i iVar = this.f32213f;
        if (z11) {
            D(String.valueOf(f11));
        } else {
            ((androidx.constraintlayout.widget.z) iVar.f7070b).q(String.valueOf(f11));
        }
        if (Math.abs(f11) > Float.MAX_VALUE) {
            throw k.a(Float.valueOf(f11), ((androidx.constraintlayout.widget.z) iVar.f7070b).toString());
        }
    }

    @Override // na0.a, kotlinx.serialization.encoding.Encoder
    public final void o(char c3) {
        D(String.valueOf(c3));
    }

    @Override // na0.a, l90.b
    public final void r(SerialDescriptor serialDescriptor, int i11, KSerializer kSerializer, Object obj) {
        serialDescriptor.getClass();
        kSerializer.getClass();
        if (obj != null || this.f32218k.f30774d) {
            super.r(serialDescriptor, i11, kSerializer, obj);
        }
    }

    @Override // na0.a, kotlinx.serialization.encoding.Encoder
    public final void t(SerialDescriptor serialDescriptor, int i11) {
        serialDescriptor.getClass();
        D(serialDescriptor.f(i11));
    }

    @Override // na0.a, kotlinx.serialization.encoding.Encoder
    public final void u(int i11) {
        if (this.l) {
            D(String.valueOf(i11));
        } else {
            this.f32213f.k(i11);
        }
    }

    @Override // na0.a, kotlinx.serialization.encoding.Encoder
    public final Encoder v(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        boolean zA = z.a(serialDescriptor);
        b0 b0Var = this.f32215h;
        n90.c cVar = this.f32214g;
        c40.i fVar = this.f32213f;
        if (zA) {
            if (!(fVar instanceof g)) {
                fVar = new g((androidx.constraintlayout.widget.z) fVar.f7070b, this.l);
            }
            return new y(fVar, cVar, b0Var, null);
        }
        if (serialDescriptor.isInline() && Intrinsics.areEqual(serialDescriptor, n90.o.f30779a)) {
            if (!(fVar instanceof f)) {
                fVar = new f((androidx.constraintlayout.widget.z) fVar.f7070b, this.l);
            }
            return new y(fVar, cVar, b0Var, null);
        }
        if (this.f32219m != null) {
            this.f32220n = serialDescriptor.a();
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    @Override // kotlinx.serialization.encoding.Encoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(kotlinx.serialization.KSerializer r5, java.lang.Object r6) {
        /*
            r4 = this;
            r5.getClass()
            n90.c r0 = r4.f32214g
            n90.j r1 = r0.f30749a
            boolean r2 = r5 instanceof m90.b
            n90.a r1 = r1.f30778h
            if (r2 == 0) goto L12
            n90.a r3 = n90.a.NONE
            if (r1 == r3) goto L48
            goto L3b
        L12:
            int[] r3 = o90.u.$EnumSwitchMapping$0
            int r1 = r1.ordinal()
            r1 = r3[r1]
            r3 = 1
            if (r1 == r3) goto L48
            r3 = 2
            if (r1 == r3) goto L48
            r3 = 3
            if (r1 != r3) goto L44
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r5.getDescriptor()
            p30.b r1 = r1.getKind()
            k90.j r3 = k90.j.f26240j
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r3 != 0) goto L3b
            k90.j r3 = k90.j.f26242m
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 == 0) goto L48
        L3b:
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r5.getDescriptor()
            java.lang.String r1 = o90.k.i(r1, r0)
            goto L49
        L44:
            e40.a.f()
            return
        L48:
            r1 = 0
        L49:
            if (r2 == 0) goto L61
            r2 = r5
            m90.b r2 = (m90.b) r2
            if (r6 == 0) goto L55
            kotlinx.serialization.KSerializer r2 = b0.a0.u(r2, r4, r6)
            goto L62
        L55:
            kotlinx.serialization.descriptors.SerialDescriptor r5 = r2.getDescriptor()
            java.lang.String r6 = " should always be non-null. Please report issue to the kotlinx.serialization tracker."
            java.lang.String r0 = "Value for serializer "
            e40.a.h(r0, r5, r6)
            return
        L61:
            r2 = r5
        L62:
            if (r1 == 0) goto L7e
            o90.k.e(r0, r5, r2, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r5 = r2.getDescriptor()
            p30.b r5 = r5.getKind()
            o90.k.h(r5)
            kotlinx.serialization.descriptors.SerialDescriptor r5 = r2.getDescriptor()
            java.lang.String r5 = r5.a()
            r4.f32219m = r1
            r4.f32220n = r5
        L7e:
            r2.serialize(r4, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o90.y.w(kotlinx.serialization.KSerializer, java.lang.Object):void");
    }
}
