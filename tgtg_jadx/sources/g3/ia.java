package g3;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.MessageBundle;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class ia implements z4.u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i3.u f18851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d2.h f18852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b4.i f18853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f18854d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d2.z1 f18855e;

    public ia(i3.u uVar, d2.h hVar, b4.i iVar, float f11, d2.z1 z1Var) {
        this.f18851a = uVar;
        this.f18852b = hVar;
        this.f18853c = iVar;
        this.f18854d = f11;
        this.f18855e = z1Var;
    }

    @Override // z4.u0
    public final int a(z4.u uVar, List list, int i11) {
        int size = list.size();
        int iY = 0;
        for (int i12 = 0; i12 < size; i12++) {
            iY += ((z4.t) list.get(i12)).y(i11);
        }
        return iY;
    }

    @Override // z4.u0
    public final int b(z4.u uVar, List list, int i11) {
        int size = list.size();
        int iW = 0;
        for (int i12 = 0; i12 < size; i12++) {
            iW += ((z4.t) list.get(i12)).w(i11);
        }
        return iW;
    }

    @Override // z4.u0
    public final z4.v0 c(final z4.w0 w0Var, List list, final long j9) {
        int i11;
        int i12;
        final ia iaVar = this;
        int size = list.size();
        int i13 = 0;
        while (i13 < size) {
            z4.t0 t0Var = (z4.t0) list.get(i13);
            if (Intrinsics.areEqual(z4.c0.j(t0Var), "navigationIcon")) {
                final z4.m1 m1VarD = t0Var.D(z5.a.b(j9, 0, 0, 0, 0, 14));
                int size2 = list.size();
                int i14 = 0;
                while (i14 < size2) {
                    z4.t0 t0Var2 = (z4.t0) list.get(i14);
                    if (Intrinsics.areEqual(z4.c0.j(t0Var2), "actionIcons")) {
                        final z4.m1 m1VarD2 = t0Var2.D(z5.a.b(j9, 0, 0, 0, 0, 14));
                        z5.m layoutDirection = w0Var.getLayoutDirection();
                        d2.z1 z1Var = iaVar.f18855e;
                        float fM = d2.c.m(z1Var, layoutDirection);
                        float fL = d2.c.l(z1Var, w0Var.getLayoutDirection());
                        if (z5.a.i(j9) == Integer.MAX_VALUE) {
                            i11 = z5.a.i(j9);
                        } else {
                            int i15 = (((z5.a.i(j9) - m1VarD.f47183a) - m1VarD2.f47183a) - w0Var.q0(fM)) - w0Var.q0(fL);
                            i11 = i15 < 0 ? 0 : i15;
                        }
                        int i16 = i11;
                        int size3 = list.size();
                        int i17 = 0;
                        while (i17 < size3) {
                            z4.t0 t0Var3 = (z4.t0) list.get(i17);
                            if (Intrinsics.areEqual(z4.c0.j(t0Var3), MessageBundle.TITLE_ENTRY)) {
                                final z4.m1 m1VarD3 = t0Var3.D(z5.a.b(j9, 0, i16, 0, 0, 12));
                                z4.o oVar = z4.d.f47101b;
                                final int iB0 = m1VarD3.b0(oVar) != Integer.MIN_VALUE ? m1VarD3.b0(oVar) : 0;
                                float fInvoke = iaVar.f18851a.invoke();
                                int iB = Float.isNaN(fInvoke) ? 0 : j80.c.b(fInvoke);
                                final int iMax = Math.max(w0Var.q0(iaVar.f18854d), m1VarD3.f47184b) + w0Var.q0(z1Var.c()) + w0Var.q0(z1Var.a());
                                if (z5.a.h(j9) == Integer.MAX_VALUE) {
                                    i12 = iMax;
                                } else {
                                    int i18 = iB + iMax;
                                    i12 = i18 >= 0 ? i18 : 0;
                                }
                                int iQ0 = w0Var.q0(z1Var.c());
                                int iQ02 = w0Var.q0(z1Var.a());
                                final int iQ03 = w0Var.q0(d2.c.m(z1Var, w0Var.getLayoutDirection()));
                                final int iQ04 = w0Var.q0(d2.c.l(z1Var, w0Var.getLayoutDirection()));
                                final int i19 = (iQ0 + i12) - iQ02;
                                return z4.w0.f(w0Var, z5.a.i(j9), i12, new Function1(iQ03, i19, m1VarD3, m1VarD2, j9, iQ04, w0Var, iaVar, iB0, iMax) { // from class: g3.ha

                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                    public final /* synthetic */ int f18783b;

                                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                                    public final /* synthetic */ int f18784c;

                                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                                    public final /* synthetic */ z4.m1 f18785d;

                                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                                    public final /* synthetic */ z4.m1 f18786e;

                                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                                    public final /* synthetic */ long f18787f;

                                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                                    public final /* synthetic */ int f18788g;

                                    /* JADX INFO: renamed from: h, reason: collision with root package name */
                                    public final /* synthetic */ z4.w0 f18789h;

                                    /* JADX INFO: renamed from: i, reason: collision with root package name */
                                    public final /* synthetic */ ia f18790i;

                                    /* JADX WARN: Removed duplicated region for block: B:11:0x005b  */
                                    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
                                    @Override // kotlin.jvm.functions.Function1
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                        To view partially-correct add '--show-bad-code' argument
                                    */
                                    public final java.lang.Object invoke(java.lang.Object r14) {
                                        /*
                                            r13 = this;
                                            z4.l1 r14 = (z4.l1) r14
                                            z4.m1 r0 = r13.f18782a
                                            int r1 = r0.f47184b
                                            int r2 = r13.f18784c
                                            int r1 = r2 - r1
                                            int r1 = r1 / 2
                                            int r3 = r13.f18783b
                                            z4.l1.o(r14, r0, r3, r1)
                                            float r1 = g3.i.f18793c
                                            z4.w0 r4 = r13.f18789h
                                            int r1 = r4.q0(r1)
                                            int r0 = r0.f47183a
                                            int r0 = java.lang.Math.max(r1, r0)
                                            z4.m1 r1 = r13.f18786e
                                            int r4 = r1.f47183a
                                            g3.ia r5 = r13.f18790i
                                            b4.i r6 = r5.f18853c
                                            z4.m1 r7 = r13.f18785d
                                            int r8 = r7.f47183a
                                            long r9 = r13.f18787f
                                            int r11 = z5.a.i(r9)
                                            z5.m r12 = z5.m.Ltr
                                            int r6 = r6.a(r8, r11, r12)
                                            if (r6 >= r0) goto L3d
                                            int r0 = r0 - r6
                                        L3a:
                                            int r0 = r0 + r3
                                            int r6 = r6 + r0
                                            goto L51
                                        L3d:
                                            int r0 = r7.f47183a
                                            int r0 = r0 + r6
                                            int r8 = z5.a.i(r9)
                                            int r8 = r8 - r4
                                            if (r0 <= r8) goto L51
                                            int r0 = z5.a.i(r9)
                                            int r0 = r0 - r4
                                            int r4 = r7.f47183a
                                            int r4 = r4 + r6
                                            int r0 = r0 - r4
                                            goto L3a
                                        L51:
                                            d2.h r0 = r5.f18852b
                                            d2.e r3 = d2.i.f13805e
                                            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
                                            if (r3 == 0) goto L62
                                            int r0 = r7.f47184b
                                            int r0 = r2 - r0
                                            int r0 = r0 / 2
                                            goto L70
                                        L62:
                                            d2.d r3 = d2.i.f13804d
                                            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
                                            if (r0 == 0) goto L6f
                                            int r0 = r7.f47184b
                                            int r0 = r2 - r0
                                            goto L70
                                        L6f:
                                            r0 = 0
                                        L70:
                                            z4.l1.o(r14, r7, r6, r0)
                                            int r0 = z5.a.i(r9)
                                            int r3 = r1.f47183a
                                            int r0 = r0 - r3
                                            int r3 = r13.f18788g
                                            int r0 = r0 - r3
                                            int r3 = r1.f47184b
                                            int r2 = r2 - r3
                                            int r2 = r2 / 2
                                            z4.l1.o(r14, r1, r0, r2)
                                            kotlin.Unit r14 = kotlin.Unit.f26487a
                                            return r14
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: g3.ha.invoke(java.lang.Object):java.lang.Object");
                                    }
                                });
                            }
                            i17++;
                            iaVar = this;
                        }
                        throw b3.i.s("Collection contains no element matching the predicate.");
                    }
                    i14++;
                    iaVar = this;
                }
                throw b3.i.s("Collection contains no element matching the predicate.");
            }
            i13++;
            iaVar = this;
        }
        throw b3.i.s("Collection contains no element matching the predicate.");
    }

    @Override // z4.u0
    public final int d(z4.u uVar, List list, int i11) {
        Integer num;
        int iQ0 = uVar.q0(this.f18854d);
        if (list.isEmpty()) {
            num = null;
        } else {
            Integer numValueOf = Integer.valueOf(((z4.t) list.get(0)).b(i11));
            int i12 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((z4.t) list.get(i12)).b(i11));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i12 == size) {
                        break;
                    }
                    i12++;
                }
            }
            num = numValueOf;
        }
        return Math.max(iQ0, num != null ? num.intValue() : 0);
    }

    @Override // z4.u0
    public final int e(z4.u uVar, List list, int i11) {
        Integer num;
        int iQ0 = uVar.q0(this.f18854d);
        if (list.isEmpty()) {
            num = null;
        } else {
            Integer numValueOf = Integer.valueOf(((z4.t) list.get(0)).V(i11));
            int i12 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((z4.t) list.get(i12)).V(i11));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i12 == size) {
                        break;
                    }
                    i12++;
                }
            }
            num = numValueOf;
        }
        return Math.max(iQ0, num != null ? num.intValue() : 0);
    }
}
