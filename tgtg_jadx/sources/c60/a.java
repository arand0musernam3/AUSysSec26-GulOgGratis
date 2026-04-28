package c60;

import b4.q;
import b4.t;
import b5.g;
import b5.h;
import b5.j;
import c60.a;
import com.app.tgtg.R;
import com.tgtg.componentlibrary.component.avatar.ComposableSingletons$DemoPantryAvatarKt;
import com.tgtg.componentlibrary.component.avatar.ComposableSingletons$PantryAvatarDoc_figmaKt;
import com.tgtg.componentlibrary.component.avatar.ComposableSingletons$PantryAvatarKt;
import com.tgtg.componentlibrary.component.avatar.variant.ComposableSingletons$PantryAvatarIconFilledKt;
import com.tgtg.componentlibrary.component.avatar.variant.ComposableSingletons$PantryAvatarIconTransparentKt;
import com.tgtg.componentlibrary.component.avatar.variant.ComposableSingletons$PantryAvatarIllustrationKt;
import com.tgtg.componentlibrary.component.avatar.variant.ComposableSingletons$PantryAvatarImageKt;
import d2.i;
import d2.j2;
import d2.m2;
import d2.p;
import d2.w;
import d2.y;
import g3.d8;
import g3.i2;
import g3.p8;
import g3.r9;
import i3.n0;
import i4.v;
import i80.n;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m3.b1;
import m3.m;
import m3.s;
import m5.u0;
import o00.x0;
import o30.f0;
import org.bouncycastle.iana.AEADAlgorithm;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;
import s1.d1;
import s1.z;
import u3.d;
import x5.k;
import z4.m1;
import z4.t0;
import z4.w0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7769a;

    public /* synthetic */ a(int i11) {
        this.f7769a = i11;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i11 = this.f7769a;
        m3.f fVar = m.f29332a;
        q qVar = q.f5711a;
        switch (i11) {
            case 0:
                boolean z11 = true;
                t tVar = (t) obj;
                m3.n nVar = (m3.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ComposableSingletons$DemoPantryAvatarKt composableSingletons$DemoPantryAvatarKt = ComposableSingletons$DemoPantryAvatarKt.INSTANCE;
                tVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((s) nVar).f(tVar) ? 4 : 2;
                }
                if ((iIntValue & 19) == 18) {
                    z11 = false;
                }
                s sVar = (s) nVar;
                if (sVar.R(iIntValue & 1, z11)) {
                    i2.a(x0.z(R.drawable.favicon, sVar, 0), null, tVar, v.f23315h, sVar, 3128 | ((iIntValue << 6) & 896), 0);
                } else {
                    sVar.U();
                }
                return Unit.f26487a;
            case 1:
                boolean z12 = true;
                t tVar2 = (t) obj;
                m3.n nVar2 = (m3.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ComposableSingletons$DemoPantryAvatarKt composableSingletons$DemoPantryAvatarKt2 = ComposableSingletons$DemoPantryAvatarKt.INSTANCE;
                tVar2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((s) nVar2).f(tVar2) ? 4 : 2;
                }
                if ((iIntValue2 & 19) == 18) {
                    z12 = false;
                }
                s sVar2 = (s) nVar2;
                if (sVar2.R(iIntValue2 & 1, z12)) {
                    i2.a(x0.z(R.drawable.heart, sVar2, 0), null, tVar2, 0L, sVar2, 56 | ((iIntValue2 << 6) & 896), 8);
                } else {
                    sVar2.U();
                }
                return Unit.f26487a;
            case 2:
                boolean z13 = true;
                t tVar3 = (t) obj;
                m3.n nVar3 = (m3.n) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ComposableSingletons$DemoPantryAvatarKt composableSingletons$DemoPantryAvatarKt3 = ComposableSingletons$DemoPantryAvatarKt.INSTANCE;
                tVar3.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= ((s) nVar3).f(tVar3) ? 4 : 2;
                }
                if ((iIntValue3 & 19) == 18) {
                    z13 = false;
                }
                s sVar3 = (s) nVar3;
                if (sVar3.R(iIntValue3 & 1, z13)) {
                    i2.a(x0.z(R.drawable.heart, sVar3, 0), null, tVar3, 0L, sVar3, 56 | ((iIntValue3 << 6) & 896), 8);
                } else {
                    sVar3.U();
                }
                return Unit.f26487a;
            case 3:
                boolean z14 = true;
                t tVar4 = (t) obj;
                m3.n nVar4 = (m3.n) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ComposableSingletons$DemoPantryAvatarKt composableSingletons$DemoPantryAvatarKt4 = ComposableSingletons$DemoPantryAvatarKt.INSTANCE;
                tVar4.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= ((s) nVar4).f(tVar4) ? 4 : 2;
                }
                if ((iIntValue4 & 19) == 18) {
                    z14 = false;
                }
                s sVar4 = (s) nVar4;
                if (sVar4.R(iIntValue4 & 1, z14)) {
                    i2.a(x0.z(R.drawable.illustration, sVar4, 0), null, tVar4, v.f23315h, sVar4, 3128 | ((iIntValue4 << 6) & 896), 0);
                } else {
                    sVar4.U();
                }
                return Unit.f26487a;
            case 4:
                boolean z15 = true;
                t tVar5 = (t) obj;
                m3.n nVar5 = (m3.n) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ComposableSingletons$PantryAvatarDoc_figmaKt composableSingletons$PantryAvatarDoc_figmaKt = ComposableSingletons$PantryAvatarDoc_figmaKt.INSTANCE;
                tVar5.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= ((s) nVar5).f(tVar5) ? 4 : 2;
                }
                if ((iIntValue5 & 19) == 18) {
                    z15 = false;
                }
                s sVar5 = (s) nVar5;
                if (sVar5.R(iIntValue5 & 1, z15)) {
                    i2.a(x0.z(R.drawable.favicon, sVar5, 0), null, tVar5, 0L, sVar5, 56 | ((iIntValue5 << 6) & 896), 8);
                } else {
                    sVar5.U();
                }
                return Unit.f26487a;
            case 5:
                boolean z16 = true;
                t tVar6 = (t) obj;
                m3.n nVar6 = (m3.n) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ComposableSingletons$PantryAvatarDoc_figmaKt composableSingletons$PantryAvatarDoc_figmaKt2 = ComposableSingletons$PantryAvatarDoc_figmaKt.INSTANCE;
                tVar6.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= ((s) nVar6).f(tVar6) ? 4 : 2;
                }
                if ((iIntValue6 & 19) == 18) {
                    z16 = false;
                }
                s sVar6 = (s) nVar6;
                if (sVar6.R(iIntValue6 & 1, z16)) {
                    i2.a(x0.z(R.drawable.heart, sVar6, 0), null, tVar6, 0L, sVar6, 56 | ((iIntValue6 << 6) & 896), 8);
                } else {
                    sVar6.U();
                }
                return Unit.f26487a;
            case 6:
                boolean z17 = true;
                t tVar7 = (t) obj;
                m3.n nVar7 = (m3.n) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ComposableSingletons$PantryAvatarDoc_figmaKt composableSingletons$PantryAvatarDoc_figmaKt3 = ComposableSingletons$PantryAvatarDoc_figmaKt.INSTANCE;
                tVar7.getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= ((s) nVar7).f(tVar7) ? 4 : 2;
                }
                if ((iIntValue7 & 19) == 18) {
                    z17 = false;
                }
                s sVar7 = (s) nVar7;
                if (sVar7.R(iIntValue7 & 1, z17)) {
                    i2.a(x0.z(R.drawable.heart, sVar7, 0), null, tVar7, 0L, sVar7, 56 | ((iIntValue7 << 6) & 896), 8);
                } else {
                    sVar7.U();
                }
                return Unit.f26487a;
            case 7:
                boolean z18 = true;
                t tVar8 = (t) obj;
                m3.n nVar8 = (m3.n) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ComposableSingletons$PantryAvatarDoc_figmaKt composableSingletons$PantryAvatarDoc_figmaKt4 = ComposableSingletons$PantryAvatarDoc_figmaKt.INSTANCE;
                tVar8.getClass();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= ((s) nVar8).f(tVar8) ? 4 : 2;
                }
                if ((iIntValue8 & 19) == 18) {
                    z18 = false;
                }
                s sVar8 = (s) nVar8;
                if (sVar8.R(iIntValue8 & 1, z18)) {
                    i2.a(x0.z(R.drawable.illustration, sVar8, 0), null, tVar8, 0L, sVar8, 56 | ((iIntValue8 << 6) & 896), 8);
                } else {
                    sVar8.U();
                }
                return Unit.f26487a;
            case 8:
                boolean z19 = true;
                t tVar9 = (t) obj;
                m3.n nVar9 = (m3.n) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ComposableSingletons$PantryAvatarKt composableSingletons$PantryAvatarKt = new Object() { // from class: com.tgtg.componentlibrary.component.avatar.ComposableSingletons$PantryAvatarKt

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final d f12913a = new d(new a(8), false, -396229169);

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public static final d f12914b = new d(new a(9), false, 405970097);

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public static final d f12915c = new d(new a(10), false, -1430830874);

                    @NotNull
                    /* JADX INFO: renamed from: getLambda$-1430830874$app_release, reason: not valid java name */
                    public final n m552getLambda$1430830874$app_release() {
                        return f12915c;
                    }

                    @NotNull
                    /* JADX INFO: renamed from: getLambda$-396229169$app_release, reason: not valid java name */
                    public final n m553getLambda$396229169$app_release() {
                        return f12913a;
                    }

                    @NotNull
                    public final n getLambda$405970097$app_release() {
                        return f12914b;
                    }
                };
                tVar9.getClass();
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= ((s) nVar9).f(tVar9) ? 4 : 2;
                }
                if ((iIntValue9 & 19) == 18) {
                    z19 = false;
                }
                s sVar9 = (s) nVar9;
                if (sVar9.R(iIntValue9 & 1, z19)) {
                    i2.a(x0.z(R.drawable.heart, sVar9, 0), null, tVar9, 0L, sVar9, 56 | ((iIntValue9 << 6) & 896), 8);
                } else {
                    sVar9.U();
                }
                return Unit.f26487a;
            case 9:
                boolean z21 = true;
                t tVar10 = (t) obj;
                m3.n nVar10 = (m3.n) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ComposableSingletons$PantryAvatarKt composableSingletons$PantryAvatarKt2 = new Object() { // from class: com.tgtg.componentlibrary.component.avatar.ComposableSingletons$PantryAvatarKt

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final d f12913a = new d(new a(8), false, -396229169);

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public static final d f12914b = new d(new a(9), false, 405970097);

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public static final d f12915c = new d(new a(10), false, -1430830874);

                    @NotNull
                    /* JADX INFO: renamed from: getLambda$-1430830874$app_release, reason: not valid java name */
                    public final n m552getLambda$1430830874$app_release() {
                        return f12915c;
                    }

                    @NotNull
                    /* JADX INFO: renamed from: getLambda$-396229169$app_release, reason: not valid java name */
                    public final n m553getLambda$396229169$app_release() {
                        return f12913a;
                    }

                    @NotNull
                    public final n getLambda$405970097$app_release() {
                        return f12914b;
                    }
                };
                tVar10.getClass();
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= ((s) nVar10).f(tVar10) ? 4 : 2;
                }
                if ((iIntValue10 & 19) == 18) {
                    z21 = false;
                }
                s sVar10 = (s) nVar10;
                if (sVar10.R(iIntValue10 & 1, z21)) {
                    i2.a(x0.z(R.drawable.favicon, sVar10, 0), null, tVar10, 0L, sVar10, 56 | ((iIntValue10 << 6) & 896), 8);
                } else {
                    sVar10.U();
                }
                return Unit.f26487a;
            case 10:
                boolean z22 = true;
                t tVar11 = (t) obj;
                m3.n nVar11 = (m3.n) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ComposableSingletons$PantryAvatarKt composableSingletons$PantryAvatarKt3 = new Object() { // from class: com.tgtg.componentlibrary.component.avatar.ComposableSingletons$PantryAvatarKt

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final d f12913a = new d(new a(8), false, -396229169);

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public static final d f12914b = new d(new a(9), false, 405970097);

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public static final d f12915c = new d(new a(10), false, -1430830874);

                    @NotNull
                    /* JADX INFO: renamed from: getLambda$-1430830874$app_release, reason: not valid java name */
                    public final n m552getLambda$1430830874$app_release() {
                        return f12915c;
                    }

                    @NotNull
                    /* JADX INFO: renamed from: getLambda$-396229169$app_release, reason: not valid java name */
                    public final n m553getLambda$396229169$app_release() {
                        return f12913a;
                    }

                    @NotNull
                    public final n getLambda$405970097$app_release() {
                        return f12914b;
                    }
                };
                tVar11.getClass();
                if ((iIntValue11 & 6) == 0) {
                    iIntValue11 |= ((s) nVar11).f(tVar11) ? 4 : 2;
                }
                if ((iIntValue11 & 19) == 18) {
                    z22 = false;
                }
                s sVar11 = (s) nVar11;
                if (sVar11.R(iIntValue11 & 1, z22)) {
                    i2.a(x0.z(R.drawable.illustration, sVar11, 0), null, tVar11, 0L, sVar11, 56 | ((iIntValue11 << 6) & 896), 8);
                } else {
                    sVar11.U();
                }
                return Unit.f26487a;
            case 11:
                m3.n nVar12 = (m3.n) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((n0) obj).getClass();
                s sVar12 = (s) nVar12;
                if (sVar12.R(1 & iIntValue12, (iIntValue12 & 17) != 16)) {
                    r9.d("Email", null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28276p, sVar12, 6, 12582912, 131070);
                } else {
                    sVar12.U();
                }
                return Unit.f26487a;
            case 12:
                m3.n nVar13 = (m3.n) obj2;
                ((Integer) obj3).getClass();
                ((z) obj).getClass();
                y yVarA = w.a(i.f13803c, b4.d.f5695n, nVar13, 48);
                s sVar13 = (s) nVar13;
                int iHashCode = Long.hashCode(sVar13.T);
                u3.i iVarL = sVar13.l();
                t tVarC = b4.a.c(qVar, nVar13);
                j.R.getClass();
                h hVar = b5.i.f5839b;
                sVar13.e0();
                if (sVar13.S) {
                    sVar13.k(hVar);
                } else {
                    sVar13.n0();
                }
                m3.i.C(yVarA, b5.i.f5843f, nVar13);
                m3.i.C(iVarL, b5.i.f5842e, nVar13);
                m3.i.v(nVar13, Integer.valueOf(iHashCode), b5.i.f5844g);
                m3.i.z(nVar13, b5.i.f5845h);
                m3.i.C(tVarC, b5.i.f5841d, nVar13);
                String strU = f0.U(nVar13, R.string.email_something_wrong_dialog_title);
                u0 u0Var = lv.v.f28276p;
                long j9 = lv.s.l;
                r9.d(strU, null, j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, nVar13, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
                d2.c.f(m2.e(qVar, lv.t.f28251e), nVar13);
                r9.d(f0.U(nVar13, R.string.email_add_email_error), null, j9, 0L, null, 0L, null, new k(3), 0L, 0, false, 0, 0, null, u0Var, nVar13, MLKEMEngine.KyberPolyBytes, 12582912, 130042);
                d2.c.f(m2.e(qVar, lv.t.f28253g), nVar13);
                sVar13.q(true);
                return Unit.f26487a;
            case 13:
                boolean z23 = true;
                t tVar12 = (t) obj;
                m3.n nVar14 = (m3.n) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ComposableSingletons$PantryAvatarIconFilledKt composableSingletons$PantryAvatarIconFilledKt = new Object() { // from class: com.tgtg.componentlibrary.component.avatar.variant.ComposableSingletons$PantryAvatarIconFilledKt

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final d f12927a = new d(new a(13), false, 254296115);

                    @NotNull
                    public final n getLambda$254296115$app_release() {
                        return f12927a;
                    }
                };
                tVar12.getClass();
                if ((iIntValue13 & 6) == 0) {
                    iIntValue13 |= ((s) nVar14).f(tVar12) ? 4 : 2;
                }
                if ((iIntValue13 & 19) == 18) {
                    z23 = false;
                }
                s sVar14 = (s) nVar14;
                if (sVar14.R(iIntValue13 & 1, z23)) {
                    i2.a(x0.z(R.drawable.heart, sVar14, 0), null, tVar12, 0L, sVar14, 56 | ((iIntValue13 << 6) & 896), 8);
                } else {
                    sVar14.U();
                }
                return Unit.f26487a;
            case 14:
                boolean z24 = true;
                t tVar13 = (t) obj;
                m3.n nVar15 = (m3.n) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                ComposableSingletons$PantryAvatarIconTransparentKt composableSingletons$PantryAvatarIconTransparentKt = new Object() { // from class: com.tgtg.componentlibrary.component.avatar.variant.ComposableSingletons$PantryAvatarIconTransparentKt

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final d f12928a = new d(new a(14), false, -1374813697);

                    @NotNull
                    /* JADX INFO: renamed from: getLambda$-1374813697$app_release, reason: not valid java name */
                    public final n m574getLambda$1374813697$app_release() {
                        return f12928a;
                    }
                };
                tVar13.getClass();
                if ((iIntValue14 & 6) == 0) {
                    iIntValue14 |= ((s) nVar15).f(tVar13) ? 4 : 2;
                }
                if ((iIntValue14 & 19) == 18) {
                    z24 = false;
                }
                s sVar15 = (s) nVar15;
                if (sVar15.R(iIntValue14 & 1, z24)) {
                    i2.a(x0.z(R.drawable.heart, sVar15, 0), null, tVar13, 0L, sVar15, 56 | ((iIntValue14 << 6) & 896), 8);
                } else {
                    sVar15.U();
                }
                return Unit.f26487a;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                boolean z25 = true;
                t tVar14 = (t) obj;
                m3.n nVar16 = (m3.n) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                ComposableSingletons$PantryAvatarIllustrationKt composableSingletons$PantryAvatarIllustrationKt = new Object() { // from class: com.tgtg.componentlibrary.component.avatar.variant.ComposableSingletons$PantryAvatarIllustrationKt

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final d f12929a = new d(new a(15), false, 1111010718);

                    @NotNull
                    public final n getLambda$1111010718$app_release() {
                        return f12929a;
                    }
                };
                tVar14.getClass();
                if ((iIntValue15 & 6) == 0) {
                    iIntValue15 |= ((s) nVar16).f(tVar14) ? 4 : 2;
                }
                if ((iIntValue15 & 19) == 18) {
                    z25 = false;
                }
                s sVar16 = (s) nVar16;
                if (sVar16.R(iIntValue15 & 1, z25)) {
                    i2.a(x0.z(R.drawable.heart, sVar16, 0), null, tVar14, 0L, sVar16, 56 | ((iIntValue15 << 6) & 896), 8);
                } else {
                    sVar16.U();
                }
                return Unit.f26487a;
            case 16:
                boolean z26 = true;
                t tVar15 = (t) obj;
                m3.n nVar17 = (m3.n) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                ComposableSingletons$PantryAvatarImageKt composableSingletons$PantryAvatarImageKt = new Object() { // from class: com.tgtg.componentlibrary.component.avatar.variant.ComposableSingletons$PantryAvatarImageKt

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final d f12930a = new d(new a(16), false, 1259763137);

                    @NotNull
                    public final n getLambda$1259763137$app_release() {
                        return f12930a;
                    }
                };
                tVar15.getClass();
                if ((iIntValue16 & 6) == 0) {
                    iIntValue16 |= ((s) nVar17).f(tVar15) ? 4 : 2;
                }
                if ((iIntValue16 & 19) == 18) {
                    z26 = false;
                }
                s sVar17 = (s) nVar17;
                if (sVar17.R(iIntValue16 & 1, z26)) {
                    i2.a(x0.z(R.drawable.heart, sVar17, 0), null, tVar15, 0L, sVar17, 56 | ((iIntValue16 << 6) & 896), 8);
                } else {
                    sVar17.U();
                }
                return Unit.f26487a;
            case 17:
                m3.n nVar18 = (m3.n) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                ((j2) obj).getClass();
                s sVar18 = (s) nVar18;
                if (sVar18.R(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    r9.d(f0.U(sVar18, R.string.bring_back_magic_browse), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0.a(lv.v.f28281u, lv.s.f28217b, 0L, null, null, 0L, null, 3, 0L, null, null, 16744446), sVar18, 0, 0, 131070);
                } else {
                    sVar18.U();
                }
                return Unit.f26487a;
            case 18:
                m1 m1VarD = ((t0) obj2).D(((z5.a) obj3).f47271a);
                return w0.Y((w0) obj, m1VarD.f47183a, m1VarD.f47184b, new g2.q(i), new d2.k(m1VarD, 6));
            case 19:
                m3.n nVar19 = (m3.n) obj2;
                ((Integer) obj3).getClass();
                s sVar19 = (s) nVar19;
                sVar19.a0(1575598419);
                sVar19.q(false);
                s sVar20 = (s) nVar19;
                Object objM = sVar20.M();
                if (objM == fVar) {
                    objM = m3.i.w(null);
                    sVar20.k0(objM);
                }
                b1 b1Var = (b1) objM;
                z4.u0 u0VarD = p.d(b4.d.f5687e, false);
                int iS = m3.i.s(nVar19);
                s sVar21 = (s) nVar19;
                u3.i iVarL2 = sVar21.l();
                t tVarC2 = b4.a.c(qVar, nVar19);
                j.R.getClass();
                h hVar2 = b5.i.f5839b;
                sVar21.e0();
                if (sVar21.S) {
                    sVar21.k(hVar2);
                } else {
                    sVar21.n0();
                }
                m3.i.C(u0VarD, b5.i.f5843f, nVar19);
                m3.i.C(iVarL2, b5.i.f5842e, nVar19);
                g gVar = b5.i.f5844g;
                if (sVar21.S || !Intrinsics.areEqual(sVar21.M(), Integer.valueOf(iS))) {
                    e0.f.y(iS, sVar21, iS, gVar);
                }
                m3.i.C(tVarC2, b5.i.f5841d, nVar19);
                Function2 function2 = (Function2) b1Var.getValue();
                if (function2 == null) {
                    sVar21.a0(-1538103400);
                } else {
                    sVar21.a0(-326710903);
                    function2.invoke(nVar19, 0);
                }
                sVar21.q(false);
                sVar21.q(true);
                return Unit.f26487a;
            case 20:
                m3.n nVar20 = (m3.n) obj2;
                ((Integer) obj3).getClass();
                s sVar22 = (s) nVar20;
                sVar22.a0(-1218883371);
                sVar22.q(false);
                s sVar23 = (s) nVar20;
                Object objM2 = sVar23.M();
                if (objM2 == fVar) {
                    objM2 = m3.i.w(null);
                    sVar23.k0(objM2);
                }
                b1 b1Var2 = (b1) objM2;
                z4.u0 u0VarD2 = p.d(b4.d.f5687e, false);
                int iS2 = m3.i.s(nVar20);
                s sVar24 = (s) nVar20;
                u3.i iVarL3 = sVar24.l();
                t tVarC3 = b4.a.c(qVar, nVar20);
                j.R.getClass();
                h hVar3 = b5.i.f5839b;
                sVar24.e0();
                if (sVar24.S) {
                    sVar24.k(hVar3);
                } else {
                    sVar24.n0();
                }
                m3.i.C(u0VarD2, b5.i.f5843f, nVar20);
                m3.i.C(iVarL3, b5.i.f5842e, nVar20);
                g gVar2 = b5.i.f5844g;
                if (sVar24.S || !Intrinsics.areEqual(sVar24.M(), Integer.valueOf(iS2))) {
                    e0.f.y(iS2, sVar24, iS2, gVar2);
                }
                m3.i.C(tVarC3, b5.i.f5841d, nVar20);
                Function2 function22 = (Function2) b1Var2.getValue();
                if (function22 == null) {
                    sVar24.a0(-2101783313);
                } else {
                    sVar24.a0(-344894126);
                    function22.invoke(nVar20, 0);
                }
                sVar24.q(false);
                sVar24.q(true);
                return Unit.f26487a;
            case 21:
                m3.n nVar21 = (m3.n) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                s sVar25 = (s) nVar21;
                if (!sVar25.R(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                    sVar25.U();
                }
                return Unit.f26487a;
            case 22:
                m3.n nVar22 = (m3.n) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                s sVar26 = (s) nVar22;
                if (!sVar26.R(iIntValue19 & 1, (iIntValue19 & 17) != 16)) {
                    sVar26.U();
                }
                return Unit.f26487a;
            case 23:
                d8 d8Var = (d8) obj;
                m3.n nVar23 = (m3.n) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                if ((iIntValue20 & 6) == 0) {
                    iIntValue20 |= (iIntValue20 & 8) == 0 ? ((s) nVar23).f(d8Var) : ((s) nVar23).h(d8Var) ? 4 : 2;
                }
                s sVar27 = (s) nVar23;
                if (sVar27.R(iIntValue20 & 1, (iIntValue20 & 19) != 18)) {
                    p8.f19327a.b(d8Var.a(0, true), Float.NaN, 0.0f, 0L, null, sVar27, 196656, 28);
                } else {
                    sVar27.U();
                }
                return Unit.f26487a;
            case 24:
                m3.n nVar24 = (m3.n) obj2;
                ((Integer) obj3).getClass();
                ((z) obj).getClass();
                r9.d(f0.U(nVar24, R.string.charity_loading_connecting_with), m2.d(qVar, 1.0f), lv.s.C, 0L, null, 0L, null, new k(3), 0L, 0, false, 0, 0, null, lv.v.f28271j, nVar24, 432, 12582912, 130040);
                return Unit.f26487a;
            case 25:
                m3.n nVar25 = (m3.n) obj2;
                ((Integer) obj3).getClass();
                ((z) obj).getClass();
                r9.d(f0.U(nVar25, R.string.charity_connecting_with), m2.d(qVar, 1.0f), lv.s.C, 0L, null, 0L, null, new k(3), 0L, 0, false, 0, 0, null, lv.v.f28272k, nVar25, 432, 12582912, 130040);
                return Unit.f26487a;
            case 26:
                m3.n nVar26 = (m3.n) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                ((j2) obj).getClass();
                s sVar28 = (s) nVar26;
                if (sVar28.R(iIntValue21 & 1, (iIntValue21 & 17) != 16)) {
                    r9.d(f0.U(sVar28, R.string.bring_back_magic_submit), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0.a(lv.v.f28274n, ((v) d1.a(lv.s.J, null, "", sVar28, 390, 10).getValue()).f23317a, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), sVar28, 0, 0, 131070);
                } else {
                    sVar28.U();
                }
                return Unit.f26487a;
            case 27:
                m3.n nVar27 = (m3.n) obj2;
                int iIntValue22 = ((Integer) obj3).intValue();
                ((j2) obj).getClass();
                s sVar29 = (s) nVar27;
                if (sVar29.R(iIntValue22 & 1, (iIntValue22 & 17) != 16)) {
                    r9.d(f0.U(sVar29, R.string.bring_back_magic_submit), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0.a(lv.v.f28274n, ((v) d1.a(lv.s.J, null, "", sVar29, 390, 10).getValue()).f23317a, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), sVar29, 0, 0, 131070);
                } else {
                    sVar29.U();
                }
                return Unit.f26487a;
            case 28:
                w0 w0Var = (w0) obj;
                int iQ0 = w0Var.q0(i3.c.f23102a);
                int i12 = iQ0 * 2;
                m1 m1VarD2 = ((t0) obj2).D(z5.b.i(i12, 0, ((z5.a) obj3).f47271a));
                return w0.f(w0Var, m1VarD2.f47183a - i12, m1VarD2.f47184b, new i3.b(iQ0, 0, m1VarD2));
            default:
                w0 w0Var2 = (w0) obj;
                int iQ02 = w0Var2.q0(i3.c.f23103b);
                int i13 = iQ02 * 2;
                m1 m1VarD3 = ((t0) obj2).D(z5.b.i(0, i13, ((z5.a) obj3).f47271a));
                return w0.f(w0Var2, m1VarD3.f47183a, m1VarD3.f47184b - i13, new i3.b(iQ02, 1, m1VarD3));
        }
    }
}
