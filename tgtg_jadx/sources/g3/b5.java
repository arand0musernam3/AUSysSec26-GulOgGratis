package g3;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b5 implements z4.u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f18362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f18363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l9 f18364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i3.p0 f18365d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d2.z1 f18366e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f18367f;

    public b5(Function1 function1, boolean z11, l9 l9Var, i3.p0 p0Var, d2.z1 z1Var, float f11) {
        this.f18362a = function1;
        this.f18363b = z11;
        this.f18364c = l9Var;
        this.f18365d = p0Var;
        this.f18366e = z1Var;
        this.f18367f = f11;
    }

    public static final int j(int i11, b5 b5Var, int i12, int i13, z4.m1 m1Var, z4.m1 m1Var2) {
        if (b5Var.f18363b) {
            i13 = e0.f.a(1, 0.0f, (i12 - m1Var2.f47184b) / 2.0f);
        }
        return Math.max(i11 + i13, (m1Var != null ? m1Var.f47184b : 0) / 2);
    }

    @Override // z4.u0
    public final int a(z4.u uVar, List list, int i11) {
        return i(uVar, list, i11, new t0(12));
    }

    @Override // z4.u0
    public final int b(z4.u uVar, List list, int i11) {
        return i(uVar, list, i11, new t0(14));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v4, types: [T, z4.m1] */
    @Override // z4.u0
    public final z4.v0 c(final z4.w0 w0Var, List list, long j9) {
        Object obj;
        Object obj2;
        z4.m1 m1Var;
        int i11;
        z4.m1 m1VarD;
        Object obj3;
        z4.m1 m1Var2;
        int i12;
        z4.m1 m1VarD2;
        Object obj4;
        z4.m1 m1Var3;
        int i13;
        z4.m1 m1VarD3;
        Object obj5;
        long jFloatToRawIntBits;
        Object obj6;
        Object obj7;
        z4.m1 m1Var4;
        int i14;
        Ref.ObjectRef objectRef;
        int i15;
        Ref.ObjectRef objectRef2;
        z4.m1 m1Var5;
        int i16;
        long j11;
        int i17;
        z4.m1 m1Var6;
        z4.m1 m1Var7;
        int i18;
        z4.m1 m1Var8;
        z4.t0 t0Var;
        b5 b5Var;
        z4.w0 w0Var2;
        z4.m1 m1Var9;
        int i19;
        z4.m1 m1Var10;
        z4.m1 m1Var11;
        int i21;
        int i22;
        int i23;
        Ref.ObjectRef objectRef3;
        int i24;
        b5 b5Var2;
        z4.m1 m1Var12;
        z4.m1 m1Var13;
        int i25;
        z4.m1 m1Var14;
        int i26;
        z4.w0 w0Var3;
        float f11;
        List list2 = list;
        float fInvoke = this.f18365d.invoke();
        d2.z1 z1Var = this.f18366e;
        int iQ0 = w0Var.q0(z1Var.a());
        long jB = z5.a.b(j9, 0, 0, 0, 0, 10);
        int size = list2.size();
        int i27 = 0;
        while (true) {
            if (i27 >= size) {
                obj = null;
                break;
            }
            obj = list2.get(i27);
            if (Intrinsics.areEqual(z4.c0.j((z4.t0) obj), "Leading")) {
                break;
            }
            i27++;
        }
        z4.t0 t0Var2 = (z4.t0) obj;
        z4.m1 m1VarD4 = t0Var2 != null ? t0Var2.D(jB) : null;
        int i28 = m1VarD4 != null ? m1VarD4.f47183a : 0;
        int iMax = Math.max(0, m1VarD4 != null ? m1VarD4.f47184b : 0);
        int size2 = list2.size();
        int i29 = 0;
        while (true) {
            if (i29 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list2.get(i29);
            if (Intrinsics.areEqual(z4.c0.j((z4.t0) obj2), "Trailing")) {
                break;
            }
            i29++;
        }
        z4.t0 t0Var3 = (z4.t0) obj2;
        if (t0Var3 != null) {
            m1Var = m1VarD4;
            i11 = i28;
            m1VarD = t0Var3.D(z5.b.j(-i28, 0, 2, jB));
        } else {
            m1Var = m1VarD4;
            i11 = i28;
            m1VarD = null;
        }
        int i31 = i11 + (m1VarD != null ? m1VarD.f47183a : 0);
        int iMax2 = Math.max(iMax, m1VarD != null ? m1VarD.f47184b : 0);
        int size3 = list2.size();
        int i32 = 0;
        while (true) {
            if (i32 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list2.get(i32);
            int i33 = size3;
            if (Intrinsics.areEqual(z4.c0.j((z4.t0) obj3), "Prefix")) {
                break;
            }
            i32++;
            size3 = i33;
        }
        z4.t0 t0Var4 = (z4.t0) obj3;
        if (t0Var4 != null) {
            m1Var2 = m1VarD;
            i12 = i31;
            m1VarD2 = t0Var4.D(z5.b.j(-i31, 0, 2, jB));
        } else {
            m1Var2 = m1VarD;
            i12 = i31;
            m1VarD2 = null;
        }
        int i34 = i12 + (m1VarD2 != null ? m1VarD2.f47183a : 0);
        int iMax3 = Math.max(iMax2, m1VarD2 != null ? m1VarD2.f47184b : 0);
        int size4 = list2.size();
        int i35 = 0;
        while (true) {
            if (i35 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list2.get(i35);
            int i36 = size4;
            if (Intrinsics.areEqual(z4.c0.j((z4.t0) obj4), "Suffix")) {
                break;
            }
            i35++;
            size4 = i36;
        }
        z4.t0 t0Var5 = (z4.t0) obj4;
        if (t0Var5 != null) {
            m1Var3 = m1VarD2;
            i13 = i34;
            m1VarD3 = t0Var5.D(z5.b.j(-i34, 0, 2, jB));
        } else {
            m1Var3 = m1VarD2;
            i13 = i34;
            m1VarD3 = null;
        }
        int i37 = i13 + (m1VarD3 != null ? m1VarD3.f47183a : 0);
        int iMax4 = Math.max(iMax3, m1VarD3 != null ? m1VarD3.f47184b : 0);
        int size5 = list2.size();
        int i38 = 0;
        while (true) {
            if (i38 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list2.get(i38);
            int i39 = size5;
            if (Intrinsics.areEqual(z4.c0.j((z4.t0) obj5), "Label")) {
                break;
            }
            i38++;
            size5 = i39;
        }
        z4.t0 t0Var6 = (z4.t0) obj5;
        Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
        int iQ02 = w0Var.q0(z1Var.b(w0Var.getLayoutDirection())) + w0Var.q0(z1Var.d(w0Var.getLayoutDirection()));
        int i41 = -ba0.g.D(i37 + iQ02, fInvoke, iQ02);
        int i42 = -iQ0;
        ?? D = t0Var6 != null ? t0Var6.D(z5.b.i(i41, i42, jB)) : 0;
        objectRef4.element = D;
        if (D != 0) {
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(D.f47184b)) & 4294967295L) | (((long) Float.floatToRawIntBits(D.f47183a)) << 32);
        } else {
            jFloatToRawIntBits = 0;
        }
        this.f18362a.invoke(new h4.e(jFloatToRawIntBits));
        int size6 = list2.size();
        int i43 = 0;
        while (true) {
            if (i43 >= size6) {
                obj6 = null;
                break;
            }
            obj6 = list2.get(i43);
            if (Intrinsics.areEqual(z4.c0.j((z4.t0) obj6), "Supporting")) {
                break;
            }
            i43++;
        }
        z4.t0 t0Var7 = (z4.t0) obj6;
        int iV = t0Var7 != null ? t0Var7.V(z5.a.k(j9)) : 0;
        z4.m1 m1Var15 = (z4.m1) objectRef4.element;
        int iMax5 = Math.max((m1Var15 != null ? m1Var15.f47184b : 0) / 2, w0Var.q0(z1Var.c()));
        long j12 = j9;
        long jI = z5.b.i(-i37, (i42 - iMax5) - iV, j12);
        z4.t0 t0Var8 = t0Var7;
        long jB2 = z5.a.b(jI, 0, 0, 0, 0, 11);
        int size7 = list2.size();
        int i44 = 0;
        while (i44 < size7) {
            z4.t0 t0Var9 = t0Var8;
            z4.t0 t0Var10 = (z4.t0) list2.get(i44);
            int i45 = iMax5;
            int i46 = size7;
            if (Intrinsics.areEqual(z4.c0.j(t0Var10), "TextField")) {
                z4.m1 m1VarD5 = t0Var10.D(jB2);
                long jB3 = z5.a.b(jB2, 0, 0, 0, 0, 14);
                int size8 = list2.size();
                int i47 = 0;
                while (true) {
                    if (i47 >= size8) {
                        obj7 = null;
                        break;
                    }
                    Object obj8 = list2.get(i47);
                    int i48 = size8;
                    if (Intrinsics.areEqual(z4.c0.j((z4.t0) obj8), "Hint")) {
                        obj7 = obj8;
                        break;
                    }
                    i47++;
                    size8 = i48;
                }
                z4.t0 t0Var11 = (z4.t0) obj7;
                z4.m1 m1VarD6 = t0Var11 != null ? t0Var11.D(jB3) : null;
                int iMax6 = Math.max(iMax4, Math.max(m1VarD5.f47184b, m1VarD6 != null ? m1VarD6.f47184b : 0) + i45 + iQ0);
                int i49 = m1Var != null ? m1Var.f47183a : 0;
                z4.m1 m1Var16 = m1Var2;
                int i51 = m1Var2 != null ? m1Var16.f47183a : 0;
                z4.m1 m1Var17 = m1Var3;
                int i52 = m1Var3 != null ? m1Var17.f47183a : 0;
                if (m1VarD3 != null) {
                    i14 = m1VarD3.f47183a;
                    m1Var4 = m1Var16;
                } else {
                    m1Var4 = m1Var16;
                    i14 = 0;
                }
                int i53 = m1VarD5.f47183a;
                z4.m1 m1Var18 = m1Var4;
                z4.m1 m1Var19 = (z4.m1) objectRef4.element;
                if (m1Var19 != null) {
                    i15 = m1Var19.f47183a;
                    objectRef = objectRef4;
                } else {
                    objectRef = objectRef4;
                    i15 = 0;
                }
                if (m1VarD6 != null) {
                    m1Var5 = m1VarD5;
                    i16 = i49;
                    objectRef2 = objectRef;
                    j11 = j12;
                    i17 = m1VarD6.f47183a;
                    m1Var6 = m1VarD6;
                    m1Var7 = m1VarD3;
                    i18 = i52;
                    m1Var8 = m1Var17;
                    t0Var = t0Var9;
                    b5Var = this;
                    m1Var9 = m1Var;
                    i19 = iMax6;
                    m1Var10 = m1Var18;
                    w0Var2 = w0Var;
                } else {
                    objectRef2 = objectRef;
                    m1Var5 = m1VarD5;
                    i16 = i49;
                    j11 = j12;
                    i17 = 0;
                    m1Var6 = m1VarD6;
                    m1Var7 = m1VarD3;
                    i18 = i52;
                    m1Var8 = m1Var17;
                    t0Var = t0Var9;
                    b5Var = this;
                    w0Var2 = w0Var;
                    m1Var9 = m1Var;
                    i19 = iMax6;
                    m1Var10 = m1Var18;
                }
                final int iG = b5Var.g(w0Var2, i16, i51, i18, i14, i53, i15, i17, j11, fInvoke);
                final z4.m1 m1VarD7 = t0Var != null ? t0Var.D(z5.a.b(z5.b.j(0, -i19, 1, jB), 0, iG, 0, 0, 9)) : null;
                int i54 = m1VarD7 != null ? m1VarD7.f47184b : 0;
                z4.m1 m1Var20 = m1Var9;
                int i55 = m1Var9 != null ? m1Var20.f47184b : 0;
                final z4.m1 m1Var21 = m1Var10;
                int i56 = m1Var10 != null ? m1Var21.f47184b : 0;
                z4.m1 m1Var22 = m1Var8;
                int i57 = m1Var22 != null ? m1Var22.f47184b : 0;
                z4.m1 m1Var23 = m1Var7;
                int i58 = m1Var23 != null ? m1Var23.f47184b : 0;
                z4.m1 m1Var24 = m1Var5;
                int i59 = m1Var24.f47184b;
                Ref.ObjectRef objectRef5 = objectRef2;
                z4.m1 m1Var25 = (z4.m1) objectRef5.element;
                int i61 = m1Var25 != null ? m1Var25.f47184b : 0;
                int i62 = i54;
                final z4.m1 m1Var26 = m1Var6;
                if (m1Var26 != null) {
                    m1Var11 = m1Var23;
                    i21 = i58;
                    i22 = i59;
                    i23 = m1Var26.f47184b;
                } else {
                    m1Var11 = m1Var23;
                    i21 = i58;
                    i22 = i59;
                    i23 = 0;
                }
                if (m1VarD7 != null) {
                    objectRef3 = objectRef5;
                    i24 = m1VarD7.f47184b;
                    m1Var12 = m1Var22;
                    m1Var13 = m1Var24;
                    i25 = i61;
                    m1Var14 = m1Var20;
                    i26 = 0;
                    w0Var3 = w0Var;
                    f11 = fInvoke;
                    b5Var2 = this;
                } else {
                    objectRef3 = objectRef5;
                    i24 = 0;
                    b5Var2 = this;
                    m1Var12 = m1Var22;
                    m1Var13 = m1Var24;
                    i25 = i61;
                    m1Var14 = m1Var20;
                    i26 = 0;
                    w0Var3 = w0Var;
                    f11 = fInvoke;
                }
                final int iF = b5Var2.f(w0Var3, i55, i56, i57, i21, i22, i25, i23, i24, j9, f11);
                final float f12 = f11;
                int i63 = iF - i62;
                int size9 = list.size();
                int i64 = i26;
                while (i64 < size9) {
                    z4.t0 t0Var12 = (z4.t0) list.get(i64);
                    if (Intrinsics.areEqual(z4.c0.j(t0Var12), "Container")) {
                        final z4.m1 m1VarD8 = t0Var12.D(z5.b.a(iG != Integer.MAX_VALUE ? iG : i26, iG, i63 != Integer.MAX_VALUE ? i63 : i26, i63));
                        final z4.m1 m1Var27 = m1Var14;
                        final z4.m1 m1Var28 = m1Var12;
                        final z4.m1 m1Var29 = m1Var11;
                        final Ref.ObjectRef objectRef6 = objectRef3;
                        final z4.m1 m1Var30 = m1Var13;
                        return z4.w0.f(w0Var, iG, iF, new Function1() { // from class: g3.a5
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj9) {
                                float f13;
                                int i65;
                                float f14;
                                b5 b5Var3;
                                int i66;
                                int i67;
                                b5 b5Var4;
                                int i68;
                                int iA;
                                float f15;
                                float f16;
                                float f17;
                                float f18;
                                z4.l1 l1Var = (z4.l1) obj9;
                                z4.m1 m1Var31 = (z4.m1) objectRef6.element;
                                z4.w0 w0Var4 = w0Var;
                                float fA = w0Var4.a();
                                z5.m layoutDirection = w0Var4.getLayoutDirection();
                                b5 b5Var5 = this.f18310a;
                                float fC0 = w0Var4.c0(b5Var5.f18367f);
                                l9 l9Var = b5Var5.f18364c;
                                d2.z1 z1Var2 = b5Var5.f18366e;
                                l1Var.j(m1VarD8, 0, 0, 0.0f);
                                z4.m1 m1Var32 = m1VarD7;
                                int i69 = iF - (m1Var32 != null ? m1Var32.f47184b : 0);
                                int iB = j80.c.b(z1Var2.c() * fA);
                                z4.m1 m1Var33 = m1Var27;
                                if (m1Var33 != null) {
                                    f13 = fC0;
                                    z4.l1.o(l1Var, m1Var33, 0, e0.f.a(1, 0.0f, (i69 - m1Var33.f47184b) / 2.0f));
                                } else {
                                    f13 = fC0;
                                }
                                int i71 = iG;
                                z4.m1 m1Var34 = m1Var21;
                                if (m1Var31 != null) {
                                    if (b5Var5.f18363b) {
                                        i65 = i71;
                                        iA = e0.f.a(1, 0.0f, (i69 - m1Var31.f47184b) / 2.0f);
                                    } else {
                                        i65 = i71;
                                        iA = iB;
                                    }
                                    int i72 = -(m1Var31.f47184b / 2);
                                    float f19 = f12;
                                    int iD = ba0.g.D(iA, f19, i72);
                                    float fM = d2.c.m(z1Var2, layoutDirection) * fA;
                                    float fL = d2.c.l(z1Var2, layoutDirection) * fA;
                                    if (m1Var33 == null) {
                                        f16 = fM;
                                        f15 = 0.0f;
                                    } else {
                                        float f20 = m1Var33.f47183a;
                                        float f21 = fM - f13;
                                        f15 = 0.0f;
                                        if (f21 < 0.0f) {
                                            f21 = 0.0f;
                                        }
                                        f16 = f20 + f21;
                                    }
                                    if (m1Var34 == null) {
                                        f17 = fM;
                                        f18 = fL;
                                    } else {
                                        f17 = fM;
                                        float f22 = m1Var34.f47183a;
                                        float f23 = fL - f13;
                                        if (f23 < f15) {
                                            f23 = 0.0f;
                                        }
                                        f18 = f22 + f23;
                                    }
                                    z5.m mVar = z5.m.Ltr;
                                    float f24 = layoutDirection == mVar ? f17 : fL;
                                    float f25 = layoutDirection == mVar ? f16 : f18;
                                    float f26 = i3.q0.f23171a;
                                    float f27 = f25;
                                    if (!(l9Var instanceof l9)) {
                                        j4.d.o(l9Var, "Unknown position: ");
                                        return null;
                                    }
                                    b5Var3 = b5Var5;
                                    int iB2 = j80.c.b(ba0.g.C(l9Var.f19042b.a(m1Var31.f47183a, i65 - j80.c.b(f16 + f18), layoutDirection) + f27, ((b4.i) i3.q0.d(l9Var)).a(m1Var31.f47183a, i65 - j80.c.b(f17 + fL), layoutDirection) + f24, f19));
                                    f14 = 0.0f;
                                    l1Var.j(m1Var31, iB2, iD, 0.0f);
                                } else {
                                    i65 = i71;
                                    f14 = 0.0f;
                                    b5Var3 = b5Var5;
                                }
                                z4.m1 m1Var35 = m1Var28;
                                if (m1Var35 != null) {
                                    i66 = iB;
                                    i67 = i69;
                                    b5Var4 = b5Var3;
                                    i68 = 0;
                                    z4.l1.o(l1Var, m1Var35, m1Var33 != null ? m1Var33.f47183a : 0, b5.j(0, b5Var4, i67, i66, m1Var31, m1Var35));
                                } else {
                                    i66 = iB;
                                    i67 = i69;
                                    b5Var4 = b5Var3;
                                    i68 = 0;
                                }
                                int i73 = (m1Var33 != null ? m1Var33.f47183a : 0) + (m1Var35 != null ? m1Var35.f47183a : 0);
                                z4.m1 m1Var36 = m1Var30;
                                z4.l1.o(l1Var, m1Var36, i73, b5.j(i68, b5Var4, i67, i66, m1Var31, m1Var36));
                                z4.m1 m1Var37 = m1Var26;
                                if (m1Var37 != null) {
                                    z4.l1.o(l1Var, m1Var37, i73, b5.j(i68, b5Var4, i67, i66, m1Var31, m1Var37));
                                }
                                z4.m1 m1Var38 = m1Var29;
                                if (m1Var38 != null) {
                                    z4.l1.o(l1Var, m1Var38, (i65 - (m1Var34 != null ? m1Var34.f47183a : 0)) - m1Var38.f47183a, b5.j(i68, b5Var4, i67, i66, m1Var31, m1Var38));
                                }
                                if (m1Var34 != null) {
                                    z4.l1.o(l1Var, m1Var34, i65 - m1Var34.f47183a, e0.f.a(1, f14, (i67 - m1Var34.f47184b) / 2.0f));
                                }
                                if (m1Var32 != null) {
                                    z4.l1.o(l1Var, m1Var32, 0, i67);
                                }
                                return Unit.f26487a;
                            }
                        });
                    }
                    i64++;
                    iF = iF;
                }
                throw b3.i.s("Collection contains no element matching the predicate.");
            }
            i44++;
            j12 = j9;
            t0Var8 = t0Var9;
            size7 = i46;
            m1Var3 = m1Var3;
            list2 = list2;
            iMax5 = i45;
        }
        throw b3.i.s("Collection contains no element matching the predicate.");
    }

    @Override // z4.u0
    public final int d(z4.u uVar, List list, int i11) {
        return h(uVar, list, i11, new t0(13));
    }

    @Override // z4.u0
    public final int e(z4.u uVar, List list, int i11) {
        return h(uVar, list, i11, new t0(11));
    }

    public final int f(z4.u uVar, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, long j9, float f11) {
        int iB = w70.b.b(i15, i17, i13, i14, ba0.g.D(i16, f11, 0));
        d2.z1 z1Var = this.f18366e;
        float fC0 = uVar.c0(z1Var.c());
        return z5.b.f(Math.max(i11, Math.max(i12, j80.c.b(ba0.g.C(fC0, Math.max(fC0, i16 / 2.0f), f11) + iB + uVar.c0(z1Var.a())))) + i18, j9);
    }

    public final int g(z4.u uVar, int i11, int i12, int i13, int i14, int i15, int i16, int i17, long j9, float f11) {
        int i18 = i13 + i14;
        int iMax = Math.max(i15 + i18, Math.max(i17 + i18, ba0.g.D(i16, f11, 0))) + i11 + i12;
        z5.m mVar = z5.m.Ltr;
        d2.z1 z1Var = this.f18366e;
        return z5.b.g(Math.max(iMax, j80.c.b((i16 + uVar.c0(z1Var.b(mVar) + z1Var.d(mVar))) * f11)), j9);
    }

    public final int h(z4.u uVar, List list, int i11, Function2 function2) {
        Object obj;
        int iL;
        int iIntValue;
        Object obj2;
        int iIntValue2;
        Object obj3;
        Object obj4;
        int iIntValue3;
        Object obj5;
        int iIntValue4;
        Object obj6;
        Object obj7;
        b5 b5Var = this;
        float fInvoke = b5Var.f18365d.invoke();
        int size = list.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i12);
            if (Intrinsics.areEqual(i3.r.i((z4.t) obj), "Leading")) {
                break;
            }
            i12++;
        }
        z4.t tVar = (z4.t) obj;
        if (tVar != null) {
            iL = i3.r.l(i11, tVar.y(Integer.MAX_VALUE));
            iIntValue = ((Number) function2.invoke(tVar, Integer.valueOf(i11))).intValue();
        } else {
            iL = i11;
            iIntValue = 0;
        }
        int size2 = list.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i13);
            if (Intrinsics.areEqual(i3.r.i((z4.t) obj2), "Trailing")) {
                break;
            }
            i13++;
        }
        z4.t tVar2 = (z4.t) obj2;
        if (tVar2 != null) {
            iL = i3.r.l(iL, tVar2.y(Integer.MAX_VALUE));
            iIntValue2 = ((Number) function2.invoke(tVar2, Integer.valueOf(i11))).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i14);
            if (Intrinsics.areEqual(i3.r.i((z4.t) obj3), "Label")) {
                break;
            }
            i14++;
        }
        Object obj8 = (z4.t) obj3;
        int iIntValue5 = obj8 != null ? ((Number) function2.invoke(obj8, Integer.valueOf(ba0.g.D(iL, fInvoke, i11)))).intValue() : 0;
        int size4 = list.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i15);
            if (Intrinsics.areEqual(i3.r.i((z4.t) obj4), "Prefix")) {
                break;
            }
            i15++;
        }
        z4.t tVar3 = (z4.t) obj4;
        if (tVar3 != null) {
            iIntValue3 = ((Number) function2.invoke(tVar3, Integer.valueOf(iL))).intValue();
            iL = i3.r.l(iL, tVar3.y(Integer.MAX_VALUE));
        } else {
            iIntValue3 = 0;
        }
        int size5 = list.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i16);
            if (Intrinsics.areEqual(i3.r.i((z4.t) obj5), "Suffix")) {
                break;
            }
            i16++;
        }
        z4.t tVar4 = (z4.t) obj5;
        if (tVar4 != null) {
            iIntValue4 = ((Number) function2.invoke(tVar4, Integer.valueOf(iL))).intValue();
            iL = i3.r.l(iL, tVar4.y(Integer.MAX_VALUE));
        } else {
            iIntValue4 = 0;
        }
        int size6 = list.size();
        int i17 = 0;
        while (i17 < size6) {
            Object obj9 = list.get(i17);
            if (Intrinsics.areEqual(i3.r.i((z4.t) obj9), "TextField")) {
                int iIntValue6 = ((Number) function2.invoke(obj9, Integer.valueOf(iL))).intValue();
                int size7 = list.size();
                int i18 = 0;
                while (true) {
                    if (i18 >= size7) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i18);
                    if (Intrinsics.areEqual(i3.r.i((z4.t) obj6), "Hint")) {
                        break;
                    }
                    i18++;
                }
                Object obj10 = (z4.t) obj6;
                int iIntValue7 = obj10 != null ? ((Number) function2.invoke(obj10, Integer.valueOf(iL))).intValue() : 0;
                int size8 = list.size();
                int i19 = 0;
                while (true) {
                    if (i19 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list.get(i19);
                    if (Intrinsics.areEqual(i3.r.i((z4.t) obj7), "Supporting")) {
                        break;
                    }
                    i19++;
                }
                Object obj11 = (z4.t) obj7;
                return b5Var.f(uVar, iIntValue, iIntValue2, iIntValue3, iIntValue4, iIntValue6, iIntValue5, iIntValue7, obj11 != null ? ((Number) function2.invoke(obj11, Integer.valueOf(i11))).intValue() : 0, z5.b.b(0, 0, 15), fInvoke);
            }
            i17++;
            iIntValue4 = iIntValue4;
            b5Var = this;
            iIntValue3 = iIntValue3;
        }
        throw b3.i.s("Collection contains no element matching the predicate.");
    }

    public final int i(z4.u uVar, List list, int i11, Function2 function2) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            Object obj7 = list.get(i12);
            if (Intrinsics.areEqual(i3.r.i((z4.t) obj7), "TextField")) {
                int iIntValue = ((Number) function2.invoke(obj7, Integer.valueOf(i11))).intValue();
                int size2 = list.size();
                int i13 = 0;
                while (true) {
                    obj = null;
                    if (i13 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i13);
                    if (Intrinsics.areEqual(i3.r.i((z4.t) obj2), "Label")) {
                        break;
                    }
                    i13++;
                }
                z4.t tVar = (z4.t) obj2;
                int iIntValue2 = tVar != null ? ((Number) function2.invoke(tVar, Integer.valueOf(i11))).intValue() : 0;
                int size3 = list.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size3) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list.get(i14);
                    if (Intrinsics.areEqual(i3.r.i((z4.t) obj3), "Trailing")) {
                        break;
                    }
                    i14++;
                }
                z4.t tVar2 = (z4.t) obj3;
                int iIntValue3 = tVar2 != null ? ((Number) function2.invoke(tVar2, Integer.valueOf(i11))).intValue() : 0;
                int size4 = list.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size4) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i15);
                    if (Intrinsics.areEqual(i3.r.i((z4.t) obj4), "Leading")) {
                        break;
                    }
                    i15++;
                }
                z4.t tVar3 = (z4.t) obj4;
                int iIntValue4 = tVar3 != null ? ((Number) function2.invoke(tVar3, Integer.valueOf(i11))).intValue() : 0;
                int size5 = list.size();
                int i16 = 0;
                while (true) {
                    if (i16 >= size5) {
                        obj5 = null;
                        break;
                    }
                    obj5 = list.get(i16);
                    if (Intrinsics.areEqual(i3.r.i((z4.t) obj5), "Prefix")) {
                        break;
                    }
                    i16++;
                }
                z4.t tVar4 = (z4.t) obj5;
                int iIntValue5 = tVar4 != null ? ((Number) function2.invoke(tVar4, Integer.valueOf(i11))).intValue() : 0;
                int size6 = list.size();
                int i17 = 0;
                while (true) {
                    if (i17 >= size6) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i17);
                    if (Intrinsics.areEqual(i3.r.i((z4.t) obj6), "Suffix")) {
                        break;
                    }
                    i17++;
                }
                z4.t tVar5 = (z4.t) obj6;
                int iIntValue6 = tVar5 != null ? ((Number) function2.invoke(tVar5, Integer.valueOf(i11))).intValue() : 0;
                int size7 = list.size();
                int i18 = 0;
                while (true) {
                    if (i18 >= size7) {
                        break;
                    }
                    Object obj8 = list.get(i18);
                    if (Intrinsics.areEqual(i3.r.i((z4.t) obj8), "Hint")) {
                        obj = obj8;
                        break;
                    }
                    i18++;
                }
                z4.t tVar6 = (z4.t) obj;
                return g(uVar, iIntValue4, iIntValue3, iIntValue5, iIntValue6, iIntValue, iIntValue2, tVar6 != null ? ((Number) function2.invoke(tVar6, Integer.valueOf(i11))).intValue() : 0, z5.b.b(0, 0, 15), this.f18365d.invoke());
            }
        }
        throw b3.i.s("Collection contains no element matching the predicate.");
    }
}
