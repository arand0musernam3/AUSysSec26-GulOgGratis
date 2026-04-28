package g3;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n9 implements z4.u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f19187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l9 f19188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i3.p0 f19189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d2.z1 f19190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f19191e;

    public n9(boolean z11, l9 l9Var, i3.p0 p0Var, d2.z1 z1Var, float f11) {
        this.f19187a = z11;
        this.f19188b = l9Var;
        this.f19189c = p0Var;
        this.f19190d = z1Var;
        this.f19191e = f11;
    }

    public static int h(List list, int i11, Function2 function2) {
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
                    if (Intrinsics.areEqual(i3.r.i((z4.t) obj4), "Prefix")) {
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
                    if (Intrinsics.areEqual(i3.r.i((z4.t) obj5), "Suffix")) {
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
                    if (Intrinsics.areEqual(i3.r.i((z4.t) obj6), "Leading")) {
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
                int i19 = iIntValue4 + iIntValue5;
                return z5.b.g(Math.max(iIntValue + i19, Math.max((tVar6 != null ? ((Number) function2.invoke(tVar6, Integer.valueOf(i11))).intValue() : 0) + i19, iIntValue2)) + iIntValue6 + iIntValue3, z5.b.b(0, 0, 15));
            }
        }
        throw b3.i.s("Collection contains no element matching the predicate.");
    }

    public static final int i(n9 n9Var, int i11, int i12, z4.m1 m1Var) {
        if (!n9Var.f19187a) {
            return i12;
        }
        return e0.f.a(1, 0.0f, (i11 - m1Var.f47184b) / 2.0f);
    }

    @Override // z4.u0
    public final int a(z4.u uVar, List list, int i11) {
        return h(list, i11, new t0(18));
    }

    @Override // z4.u0
    public final int b(z4.u uVar, List list, int i11) {
        return h(list, i11, new t0(17));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // z4.u0
    public final z4.v0 c(final z4.w0 w0Var, List list, long j9) {
        Object obj;
        Object obj2;
        Object obj3;
        int i11;
        z4.m1 m1VarD;
        Object obj4;
        int i12;
        z4.m1 m1VarD2;
        Object obj5;
        int i13;
        Object obj6;
        Object obj7;
        z4.m1 m1Var;
        int i14;
        int i15;
        int i16;
        int i17;
        z4.m1 m1Var2;
        int i18;
        z4.m1 m1Var3;
        int i19;
        z4.m1 m1Var4;
        int i21;
        float f11;
        z4.m1 m1Var5;
        Ref.ObjectRef objectRef;
        int i22;
        z4.m1 m1Var6;
        z4.m1 m1Var7;
        int i23;
        int i24;
        n9 n9Var;
        int i25;
        float fInvoke = this.f19189c.invoke();
        d2.z1 z1Var = this.f19190d;
        final int iQ0 = w0Var.q0(z1Var.c());
        int iQ02 = w0Var.q0(z1Var.a());
        long jB = z5.a.b(j9, 0, 0, 0, 0, 10);
        int size = list.size();
        int i26 = 0;
        while (true) {
            if (i26 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i26);
            if (Intrinsics.areEqual(z4.c0.j((z4.t0) obj), "Leading")) {
                break;
            }
            i26++;
        }
        z4.t0 t0Var = (z4.t0) obj;
        z4.m1 m1VarD3 = t0Var != null ? t0Var.D(jB) : null;
        int i27 = m1VarD3 != null ? m1VarD3.f47183a : 0;
        int iMax = Math.max(0, m1VarD3 != null ? m1VarD3.f47184b : 0);
        int size2 = list.size();
        int i28 = 0;
        while (true) {
            if (i28 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i28);
            if (Intrinsics.areEqual(z4.c0.j((z4.t0) obj2), "Trailing")) {
                break;
            }
            i28++;
        }
        z4.t0 t0Var2 = (z4.t0) obj2;
        z4.m1 m1VarD4 = t0Var2 != null ? t0Var2.D(z5.b.j(-i27, 0, 2, jB)) : null;
        int i29 = i27 + (m1VarD4 != null ? m1VarD4.f47183a : 0);
        int iMax2 = Math.max(iMax, m1VarD4 != null ? m1VarD4.f47184b : 0);
        int size3 = list.size();
        int i31 = 0;
        while (true) {
            if (i31 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i31);
            if (Intrinsics.areEqual(z4.c0.j((z4.t0) obj3), "Prefix")) {
                break;
            }
            i31++;
        }
        z4.t0 t0Var3 = (z4.t0) obj3;
        if (t0Var3 != null) {
            i11 = i29;
            m1VarD = t0Var3.D(z5.b.j(-i29, 0, 2, jB));
        } else {
            i11 = i29;
            m1VarD = null;
        }
        int i32 = (m1VarD != null ? m1VarD.f47183a : 0) + i11;
        int iMax3 = Math.max(iMax2, m1VarD != null ? m1VarD.f47184b : 0);
        int size4 = list.size();
        int i33 = 0;
        while (true) {
            if (i33 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i33);
            if (Intrinsics.areEqual(z4.c0.j((z4.t0) obj4), "Suffix")) {
                break;
            }
            i33++;
        }
        z4.t0 t0Var4 = (z4.t0) obj4;
        if (t0Var4 != null) {
            i12 = i32;
            m1VarD2 = t0Var4.D(z5.b.j(-i32, 0, 2, jB));
        } else {
            i12 = i32;
            m1VarD2 = null;
        }
        int i34 = i12 + (m1VarD2 != null ? m1VarD2.f47183a : 0);
        int iMax4 = Math.max(iMax3, m1VarD2 != null ? m1VarD2.f47184b : 0);
        int size5 = list.size();
        int i35 = 0;
        while (true) {
            if (i35 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i35);
            int i36 = size5;
            if (Intrinsics.areEqual(z4.c0.j((z4.t0) obj5), "Label")) {
                break;
            }
            i35++;
            size5 = i36;
        }
        z4.t0 t0Var5 = (z4.t0) obj5;
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        int i37 = -i34;
        objectRef2.element = t0Var5 != null ? t0Var5.D(z5.b.i(i37, -iQ02, jB)) : 0;
        int size6 = list.size();
        int i38 = 0;
        while (true) {
            if (i38 >= size6) {
                i13 = iQ02;
                obj6 = null;
                break;
            }
            obj6 = list.get(i38);
            i13 = iQ02;
            if (Intrinsics.areEqual(z4.c0.j((z4.t0) obj6), "Supporting")) {
                break;
            }
            i38++;
            iQ02 = i13;
        }
        z4.t0 t0Var6 = (z4.t0) obj6;
        int iV = t0Var6 != null ? t0Var6.V(z5.a.k(j9)) : 0;
        z4.m1 m1Var8 = (z4.m1) objectRef2.element;
        int i39 = iQ0 + (m1Var8 != null ? m1Var8.f47184b : 0);
        long jI = z5.b.i(i37, ((-i39) - i13) - iV, z5.a.b(j9, 0, 0, 0, 0, 11));
        int size7 = list.size();
        int i41 = 0;
        while (i41 < size7) {
            int i42 = i39;
            z4.t0 t0Var7 = (z4.t0) list.get(i41);
            int i43 = size7;
            float f12 = fInvoke;
            if (Intrinsics.areEqual(z4.c0.j(t0Var7), "TextField")) {
                z4.m1 m1VarD5 = t0Var7.D(jI);
                long jB2 = z5.a.b(jI, 0, 0, 0, 0, 14);
                int size8 = list.size();
                int i44 = 0;
                while (true) {
                    if (i44 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list.get(i44);
                    int i45 = size8;
                    int i46 = i44;
                    if (Intrinsics.areEqual(z4.c0.j((z4.t0) obj7), "Hint")) {
                        break;
                    }
                    i44 = i46 + 1;
                    size8 = i45;
                }
                z4.t0 t0Var8 = (z4.t0) obj7;
                z4.m1 m1VarD6 = t0Var8 != null ? t0Var8.D(jB2) : null;
                int iMax5 = Math.max(iMax4, Math.max(m1VarD5.f47184b, m1VarD6 != null ? m1VarD6.f47184b : 0) + i42 + i13);
                int i47 = m1VarD3 != null ? m1VarD3.f47183a : 0;
                int i48 = m1VarD4 != null ? m1VarD4.f47183a : 0;
                int i49 = m1VarD != null ? m1VarD.f47183a : 0;
                int i51 = m1VarD2 != null ? m1VarD2.f47183a : 0;
                int i52 = i48;
                int i53 = m1VarD5.f47183a;
                z4.m1 m1Var9 = (z4.m1) objectRef2.element;
                int i54 = i49 + i51;
                int iG = z5.b.g(Math.max(i53 + i54, Math.max((m1VarD6 != null ? m1VarD6.f47183a : 0) + i54, m1Var9 != null ? m1Var9.f47183a : 0)) + i47 + i52, j9);
                z4.m1 m1VarD7 = t0Var6 != null ? t0Var6.D(z5.a.b(z5.b.j(0, -iMax5, 1, jB), 0, iG, 0, 0, 9)) : null;
                int i55 = m1VarD7 != null ? m1VarD7.f47184b : 0;
                int i56 = m1VarD5.f47184b;
                z4.m1 m1Var10 = (z4.m1) objectRef2.element;
                int i57 = m1Var10 != null ? m1Var10.f47184b : 0;
                int i58 = m1VarD3 != null ? m1VarD3.f47184b : 0;
                if (m1VarD4 != null) {
                    m1Var = m1VarD3;
                    i14 = i57;
                    i15 = m1VarD4.f47184b;
                } else {
                    m1Var = m1VarD3;
                    i14 = i57;
                    i15 = 0;
                }
                if (m1VarD != null) {
                    i16 = i58;
                    i17 = m1VarD.f47184b;
                } else {
                    i16 = i58;
                    i17 = 0;
                }
                final z4.m1 m1Var11 = m1VarD4;
                if (m1VarD2 != null) {
                    m1Var2 = m1VarD;
                    i18 = m1VarD2.f47184b;
                } else {
                    m1Var2 = m1VarD;
                    i18 = 0;
                }
                if (m1VarD6 != null) {
                    z4.m1 m1Var12 = m1Var;
                    i19 = m1VarD6.f47184b;
                    m1Var3 = m1Var12;
                } else {
                    m1Var3 = m1Var;
                    i19 = 0;
                }
                if (m1VarD7 != null) {
                    m1Var5 = m1Var3;
                    m1Var4 = m1VarD2;
                    i21 = i16;
                    f11 = f12;
                    objectRef = objectRef2;
                    i22 = m1VarD7.f47184b;
                    m1Var6 = m1VarD6;
                    m1Var7 = m1VarD7;
                    i23 = iG;
                    i24 = 0;
                    i25 = i56;
                    n9Var = this;
                } else {
                    m1Var4 = m1VarD2;
                    i21 = i16;
                    f11 = f12;
                    m1Var5 = m1Var3;
                    objectRef = objectRef2;
                    i22 = 0;
                    m1Var6 = m1VarD6;
                    m1Var7 = m1VarD7;
                    i23 = iG;
                    i24 = 0;
                    n9Var = this;
                    i25 = i56;
                }
                final int iF = n9Var.f(w0Var, i25, i14, i21, i15, i17, i18, i19, i22, j9, f11);
                final int i59 = iF - i55;
                int size9 = list.size();
                int i61 = i24;
                while (i61 < size9) {
                    z4.t0 t0Var9 = (z4.t0) list.get(i61);
                    if (Intrinsics.areEqual(z4.c0.j(t0Var9), "Container")) {
                        final z4.m1 m1VarD8 = t0Var9.D(z5.b.a(i23 != Integer.MAX_VALUE ? i23 : i24, i23, i59 != Integer.MAX_VALUE ? i59 : i24, i59));
                        final int i62 = i23;
                        final float f13 = f11;
                        final z4.m1 m1Var13 = m1VarD5;
                        final z4.m1 m1Var14 = m1Var5;
                        final z4.m1 m1Var15 = m1Var4;
                        final Ref.ObjectRef objectRef3 = objectRef;
                        final z4.m1 m1Var16 = m1Var2;
                        final z4.m1 m1Var17 = m1Var6;
                        final z4.m1 m1Var18 = m1Var7;
                        return z4.w0.f(w0Var, i62, iF, new Function1() { // from class: g3.m9
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Removed duplicated region for block: B:20:0x009f  */
                            /* JADX WARN: Removed duplicated region for block: B:25:0x00ab  */
                            /* JADX WARN: Removed duplicated region for block: B:65:0x0143  */
                            @Override // kotlin.jvm.functions.Function1
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final java.lang.Object invoke(java.lang.Object r22) {
                                /*
                                    Method dump skipped, instruction units count: 480
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: g3.m9.invoke(java.lang.Object):java.lang.Object");
                            }
                        });
                    }
                    i61++;
                    i59 = i59;
                    m1VarD5 = m1VarD5;
                }
                throw b3.i.s("Collection contains no element matching the predicate.");
            }
            fInvoke = f12;
            i41++;
            m1VarD3 = m1VarD3;
            size7 = i43;
            i39 = i42;
        }
        throw b3.i.s("Collection contains no element matching the predicate.");
    }

    @Override // z4.u0
    public final int d(z4.u uVar, List list, int i11) {
        return g(uVar, list, i11, new t0(20));
    }

    @Override // z4.u0
    public final int e(z4.u uVar, List list, int i11) {
        return g(uVar, list, i11, new t0(19));
    }

    public final int f(z4.u uVar, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, long j9, float f11) {
        d2.z1 z1Var = this.f19190d;
        int iQ0 = uVar.q0(z1Var.a() + z1Var.c());
        int iMax = 0;
        int iB = w70.b.b(i11, i17, i15, i16, ba0.g.D(i12, f11, 0));
        if (i12 > 0) {
            iMax = Math.max(uVar.q0(this.f19191e * 2), ba0.g.D(0, l3.g0.f26960a.a(f11), i12));
        }
        return z5.b.f(Math.max(i13, Math.max(i14, iQ0 + iMax + iB)) + i18, j9);
    }

    public final int g(z4.u uVar, List list, int i11, Function2 function2) {
        Object obj;
        int i12;
        int iIntValue;
        int iL;
        Object obj2;
        int iIntValue2;
        Object obj3;
        Object obj4;
        int i13;
        Object obj5;
        int i14;
        Object obj6;
        Object obj7;
        int size = list.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i15);
            if (Intrinsics.areEqual(i3.r.i((z4.t) obj), "Leading")) {
                break;
            }
            i15++;
        }
        z4.t tVar = (z4.t) obj;
        if (tVar != null) {
            i12 = i11;
            iL = i3.r.l(i12, tVar.y(Integer.MAX_VALUE));
            iIntValue = ((Number) function2.invoke(tVar, Integer.valueOf(i12))).intValue();
        } else {
            i12 = i11;
            iIntValue = 0;
            iL = i12;
        }
        int size2 = list.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i16);
            if (Intrinsics.areEqual(i3.r.i((z4.t) obj2), "Trailing")) {
                break;
            }
            i16++;
        }
        z4.t tVar2 = (z4.t) obj2;
        if (tVar2 != null) {
            iL = i3.r.l(iL, tVar2.y(Integer.MAX_VALUE));
            iIntValue2 = ((Number) function2.invoke(tVar2, Integer.valueOf(i12))).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i17);
            if (Intrinsics.areEqual(i3.r.i((z4.t) obj3), "Label")) {
                break;
            }
            i17++;
        }
        Object obj8 = (z4.t) obj3;
        int iIntValue3 = obj8 != null ? ((Number) function2.invoke(obj8, Integer.valueOf(iL))).intValue() : 0;
        int size4 = list.size();
        int i18 = 0;
        while (true) {
            if (i18 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i18);
            if (Intrinsics.areEqual(i3.r.i((z4.t) obj4), "Prefix")) {
                break;
            }
            i18++;
        }
        z4.t tVar3 = (z4.t) obj4;
        if (tVar3 != null) {
            int iIntValue4 = ((Number) function2.invoke(tVar3, Integer.valueOf(iL))).intValue();
            iL = i3.r.l(iL, tVar3.y(Integer.MAX_VALUE));
            i13 = iIntValue4;
        } else {
            i13 = 0;
        }
        int size5 = list.size();
        int i19 = 0;
        while (true) {
            if (i19 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i19);
            if (Intrinsics.areEqual(i3.r.i((z4.t) obj5), "Suffix")) {
                break;
            }
            i19++;
        }
        z4.t tVar4 = (z4.t) obj5;
        if (tVar4 != null) {
            int iIntValue5 = ((Number) function2.invoke(tVar4, Integer.valueOf(iL))).intValue();
            iL = i3.r.l(iL, tVar4.y(Integer.MAX_VALUE));
            i14 = iIntValue5;
        } else {
            i14 = 0;
        }
        int size6 = list.size();
        for (int i21 = 0; i21 < size6; i21++) {
            Object obj9 = list.get(i21);
            if (Intrinsics.areEqual(i3.r.i((z4.t) obj9), "TextField")) {
                int iIntValue6 = ((Number) function2.invoke(obj9, Integer.valueOf(iL))).intValue();
                int size7 = list.size();
                int i22 = 0;
                while (true) {
                    if (i22 >= size7) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i22);
                    if (Intrinsics.areEqual(i3.r.i((z4.t) obj6), "Hint")) {
                        break;
                    }
                    i22++;
                }
                Object obj10 = (z4.t) obj6;
                int iIntValue7 = obj10 != null ? ((Number) function2.invoke(obj10, Integer.valueOf(iL))).intValue() : 0;
                int size8 = list.size();
                int i23 = 0;
                while (true) {
                    if (i23 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list.get(i23);
                    if (Intrinsics.areEqual(i3.r.i((z4.t) obj7), "Supporting")) {
                        break;
                    }
                    i23++;
                }
                Object obj11 = (z4.t) obj7;
                return f(uVar, iIntValue6, iIntValue3, iIntValue, iIntValue2, i13, i14, iIntValue7, obj11 != null ? ((Number) function2.invoke(obj11, Integer.valueOf(i12))).intValue() : 0, z5.b.b(0, 0, 15), this.f19189c.invoke());
            }
        }
        throw b3.i.s("Collection contains no element matching the predicate.");
    }
}
