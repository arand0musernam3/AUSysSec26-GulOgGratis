package com.tgtg.componentlibrary.component.button;

import androidx.compose.foundation.b;
import b0.z;
import b2.l;
import b4.a;
import b4.d;
import b4.k;
import b4.q;
import b4.t;
import b5.h;
import b5.j;
import com.braze.models.FeatureFlag;
import com.tgtg.componentlibrary.component.button.PantryButtonKt;
import com.tgtg.componentlibrary.component.button.ext.ButtonColorsExtKt;
import com.tgtg.componentlibrary.component.button.model.ButtonColors;
import com.tgtg.componentlibrary.component.button.model.ButtonGeometry;
import com.tgtg.componentlibrary.component.spinner.PantrySpinnerKt;
import d2.c;
import d2.h2;
import d2.i2;
import d2.m2;
import d2.p;
import g3.o2;
import g3.r9;
import g3.s5;
import g3.v0;
import g3.z2;
import g60.e;
import g60.f;
import i4.g0;
import j5.r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import l2.g;
import m3.m;
import m3.n;
import m3.s;
import m3.w1;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import u3.i;
import w.a0;
import z4.o;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a\u0087\u0001\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0001¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"", TextBundle.TEXT_ENTRY, "Lkotlin/Function0;", "", "onClick", "Lb4/t;", "modifier", "contentDescription", "Lcom/tgtg/componentlibrary/component/button/model/ButtonVariant;", "variant", "Lcom/tgtg/componentlibrary/component/button/model/ButtonSize;", "size", "", FeatureFlag.ENABLED, "isLoading", "leadingIcon", "trailingIcon", "PantryButton", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lb4/t;Ljava/lang/String;Lcom/tgtg/componentlibrary/component/button/model/ButtonVariant;Lcom/tgtg/componentlibrary/component/button/model/ButtonSize;ZZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lm3/n;II)V", "app_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPantryButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PantryButton.kt\ncom/tgtg/componentlibrary/component/button/PantryButtonKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,229:1\n1128#2,6:230\n1128#2,6:236\n1128#2,6:273\n70#3:242\n68#3,8:243\n77#3:314\n70#3:315\n67#3,9:316\n77#3:350\n70#3:351\n67#3,9:352\n77#3:386\n81#4,6:251\n88#4,6:266\n81#4,6:285\n88#4,6:300\n96#4:309\n96#4:313\n81#4,6:325\n88#4,6:340\n96#4:349\n81#4,6:361\n88#4,6:376\n96#4:385\n391#5,9:257\n400#5:272\n391#5,9:291\n400#5,3:306\n401#5,2:311\n391#5,9:331\n400#5,3:346\n391#5,9:367\n400#5,3:382\n99#6,6:279\n106#6:310\n*S KotlinDebug\n*F\n+ 1 PantryButton.kt\ncom/tgtg/componentlibrary/component/button/PantryButtonKt\n*L\n98#1:230,6\n118#1:236,6\n135#1:273,6\n106#1:242\n106#1:243,8\n106#1:314\n184#1:315\n184#1:316,9\n184#1:350\n205#1:351\n205#1:352,9\n205#1:386\n106#1:251,6\n106#1:266,6\n125#1:285,6\n125#1:300,6\n125#1:309\n106#1:313\n184#1:325,6\n184#1:340,6\n184#1:349\n205#1:361,6\n205#1:376,6\n205#1:385\n106#1:257,9\n106#1:272\n125#1:291,9\n125#1:306,3\n106#1:311,2\n184#1:331,9\n184#1:346,3\n205#1:367,9\n205#1:382,3\n125#1:279,6\n125#1:310\n*E\n"})
public final class PantryButtonKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void PantryButton(@org.jetbrains.annotations.NotNull java.lang.String r26, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> r27, @org.jetbrains.annotations.Nullable b4.t r28, @org.jetbrains.annotations.Nullable java.lang.String r29, @org.jetbrains.annotations.Nullable com.tgtg.componentlibrary.component.button.model.ButtonVariant r30, @org.jetbrains.annotations.Nullable com.tgtg.componentlibrary.component.button.model.ButtonSize r31, boolean r32, boolean r33, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super m3.n, ? super java.lang.Integer, kotlin.Unit> r34, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super m3.n, ? super java.lang.Integer, kotlin.Unit> r35, @org.jetbrains.annotations.Nullable m3.n r36, int r37, int r38) {
        /*
            Method dump skipped, instruction units count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tgtg.componentlibrary.component.button.PantryButtonKt.PantryButton(java.lang.String, kotlin.jvm.functions.Function0, b4.t, java.lang.String, com.tgtg.componentlibrary.component.button.model.ButtonVariant, com.tgtg.componentlibrary.component.button.model.ButtonSize, boolean, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, m3.n, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public static final void a(String str, boolean z11, ButtonGeometry buttonGeometry, long j9, Function2 function2, Function2 function22, n nVar, int i11) {
        s sVar;
        boolean z12;
        s sVar2;
        ?? r12;
        k kVar = d.f5683a;
        s sVar3 = (s) nVar;
        sVar3.c0(1279397505);
        int i12 = i11 | (sVar3.f(str) ? 4 : 2) | (sVar3.g(z11) ? 32 : 16) | (sVar3.f(buttonGeometry) ? 256 : 128) | (sVar3.e(j9) ? NewHope.SENDB_BYTES : 1024) | (sVar3.h(function2) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192) | (sVar3.h(function22) ? 131072 : 65536);
        if (!sVar3.R(i12 & 1, (74899 & i12) != 74898)) {
            sVar3.U();
            sVar = sVar3;
        } else if (z11) {
            sVar3.a0(991515471);
            PantrySpinnerKt.m939PantrySpinneriJQMabo(buttonGeometry.getSpinnerSize(), j9, sVar3, (i12 >> 6) & 112, 0);
            sVar3.q(false);
            sVar = sVar3;
        } else {
            sVar3.a0(991655529);
            q qVar = q.f5711a;
            if (function2 != null) {
                sVar3.a0(991673230);
                t tVarM = m2.m(qVar, buttonGeometry.m651getIconSizeD9Ej5fM());
                u0 u0VarD = p.d(kVar, false);
                int iHashCode = Long.hashCode(sVar3.T);
                i iVarL = sVar3.l();
                t tVarC = a.c(tVarM, sVar3);
                j.R.getClass();
                Function0 function0 = b5.i.f5839b;
                sVar3.e0();
                if (sVar3.S) {
                    sVar3.k(function0);
                } else {
                    sVar3.n0();
                }
                m3.i.C(u0VarD, b5.i.f5843f, sVar3);
                m3.i.C(iVarL, b5.i.f5842e, sVar3);
                m3.i.v(sVar3, Integer.valueOf(iHashCode), b5.i.f5844g);
                m3.i.z(sVar3, b5.i.f5845h);
                m3.i.C(tVarC, b5.i.f5841d, sVar3);
                function2.invoke(sVar3, Integer.valueOf((i12 >> 12) & 14));
                sVar3.q(true);
                if (str.length() > 0) {
                    sVar3.a0(991818031);
                    z12 = false;
                    p.a(m2.m(qVar, buttonGeometry.m649getGapD9Ej5fM()), sVar3, 0);
                    sVar3.q(false);
                } else {
                    z12 = false;
                    sVar3.a0(991896833);
                    sVar3.q(false);
                }
                sVar3.q(z12);
            } else {
                z12 = false;
                sVar3.a0(991906753);
                sVar3.q(false);
            }
            if (str.length() > 0) {
                sVar3.a0(991958678);
                boolean z13 = z12;
                r9.d(str, null, 0L, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, buttonGeometry.getTextStyle(), sVar3, i12 & 14, 24960, 110590);
                s sVar4 = sVar3;
                sVar4.q(z13);
                r12 = z13;
                sVar2 = sVar4;
            } else {
                boolean z14 = z12;
                sVar3.a0(992132929);
                sVar3.q(z14);
                r12 = z14;
                sVar2 = sVar3;
            }
            if (function22 != null) {
                sVar2.a0(992176205);
                if (str.length() > 0) {
                    sVar2.a0(992207887);
                    p.a(m2.m(qVar, buttonGeometry.m649getGapD9Ej5fM()), sVar2, r12);
                    sVar2.q(r12);
                } else {
                    sVar2.a0(992286689);
                    sVar2.q(r12);
                }
                t tVarM2 = m2.m(qVar, buttonGeometry.m651getIconSizeD9Ej5fM());
                u0 u0VarD2 = p.d(kVar, r12);
                int iHashCode2 = Long.hashCode(sVar2.T);
                i iVarL2 = sVar2.l();
                t tVarC2 = a.c(tVarM2, sVar2);
                j.R.getClass();
                h hVar = b5.i.f5839b;
                sVar2.e0();
                if (sVar2.S) {
                    sVar2.k(hVar);
                } else {
                    sVar2.n0();
                }
                m3.i.C(u0VarD2, b5.i.f5843f, sVar2);
                m3.i.C(iVarL2, b5.i.f5842e, sVar2);
                m3.i.v(sVar2, Integer.valueOf(iHashCode2), b5.i.f5844g);
                m3.i.z(sVar2, b5.i.f5845h);
                m3.i.C(tVarC2, b5.i.f5841d, sVar2);
                a0.x((i12 >> 15) & 14, function22, sVar2, true, r12);
            } else {
                sVar2.a0(992410689);
                sVar2.q(r12);
            }
            sVar2.q(r12);
            sVar = sVar2;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new f(str, z11, buttonGeometry, j9, function2, function22, i11);
        }
    }

    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v37 */
    public static final void b(final String str, final String str2, final Function0 function0, final boolean z11, final boolean z12, final ButtonColors buttonColors, final ButtonGeometry buttonGeometry, final t tVar, final Function2 function2, final Function2 function22, n nVar, final int i11) {
        int i12;
        s sVar;
        boolean z13;
        t tVarB;
        ?? r52;
        s sVar2 = (s) nVar;
        sVar2.c0(139351027);
        if ((i11 & 6) == 0) {
            i12 = (sVar2.f(str) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar2.f(str2) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar2.h(function0) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar2.g(z11) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar2.g(z12) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar2.f(buttonColors) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= sVar2.f(buttonGeometry) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i12 |= sVar2.f(tVar) ? 8388608 : 4194304;
        }
        if ((100663296 & i11) == 0) {
            i12 |= sVar2.h(function2) ? 67108864 : 33554432;
        }
        if ((805306368 & i11) == 0) {
            i12 |= sVar2.h(function22) ? 536870912 : 268435456;
        }
        int i13 = i12;
        if (sVar2.R(i13 & 1, (i13 & 306783379) != 306783378)) {
            Object objM = sVar2.M();
            m3.f fVar = m.f29332a;
            if (objM == fVar) {
                objM = a0.g(sVar2);
            }
            l lVar = (l) objM;
            boolean zBooleanValue = ((Boolean) android.support.v4.media.session.a.l(lVar, sVar2, 6).getValue()).booleanValue();
            boolean zBooleanValue2 = ((Boolean) z.q(lVar, sVar2).getValue()).booleanValue();
            boolean zBooleanValue3 = ((Boolean) a.a.v(lVar, sVar2, 6).getValue()).booleanValue();
            int i14 = ((i13 >> 15) & 14) | ((i13 >> 6) & 112);
            long jContainerColor = ButtonColorsExtKt.containerColor(buttonColors, z11, zBooleanValue, zBooleanValue2, sVar2, i14);
            long jContentColor = ButtonColorsExtKt.contentColor(buttonColors, z11, zBooleanValue, zBooleanValue2, sVar2, i14);
            o oVar = o2.f19198a;
            t tVarU = wd.a.u(tVar.then(z2.f19875b), zBooleanValue3, buttonGeometry.m647getFocusRingBorderSizeD9Ej5fM(), buttonColors.m632getFocusRingColor0d7_KjU(), buttonGeometry.m648getFocusRingPaddingD9Ej5fM(), g.b(buttonGeometry.m646getCornerRadiusD9Ej5fM()));
            q qVar = q.f5711a;
            if (z11) {
                z13 = false;
                sVar2.a0(-1825524705);
                sVar2.q(false);
                tVarB = qVar;
            } else {
                sVar2.a0(-1825602298);
                Object objM2 = sVar2.M();
                if (objM2 == fVar) {
                    objM2 = new g2.q(22);
                    sVar2.k0(objM2);
                }
                tVarB = r.b(qVar, (Function1) objM2);
                z13 = false;
                sVar2.q(false);
            }
            t tVarThen = tVarU.then(tVarB);
            u0 u0VarD = p.d(d.f5687e, z13);
            int iHashCode = Long.hashCode(sVar2.T);
            i iVarL = sVar2.l();
            t tVarC = a.c(tVarThen, sVar2);
            j.R.getClass();
            h hVar = b5.i.f5839b;
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(hVar);
            } else {
                sVar2.n0();
            }
            b5.g gVar = b5.i.f5843f;
            m3.i.C(u0VarD, gVar, sVar2);
            b5.g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b5.g gVar3 = b5.i.f5844g;
            m3.i.v(sVar2, numValueOf, gVar3);
            b5.d dVar = b5.i.f5845h;
            m3.i.z(sVar2, dVar);
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar2);
            t tVarJ = v1.n.j(f4.g.b(m2.o(qVar, buttonGeometry.m655getMinWidthD9Ej5fM(), buttonGeometry.m654getMinHeightD9Ej5fM(), buttonGeometry.m653getMaxWidthD9Ej5fM(), buttonGeometry.m652getMaxHeightD9Ej5fM()), g.b(buttonGeometry.m646getCornerRadiusD9Ej5fM())), jContainerColor, g0.f23254b);
            boolean z14 = ((i13 & 112) == 32) | ((i13 & 57344) == 16384);
            Object objM3 = sVar2.M();
            if (z14 || objM3 == fVar) {
                r52 = 0;
                objM3 = new e(str2, z12, 0);
                sVar2.k0(objM3);
            } else {
                r52 = 0;
            }
            t tVarB2 = c.B(b.b(r.c(tVarJ, r52, (Function1) objM3), lVar, s5.a(0.0f, 7, 0L, r52), z11, null, new j5.j(r52), function0, 8), buttonGeometry.m650getHorizontalPaddingD9Ej5fM(), 0.0f, 2);
            sVar = sVar2;
            i2 i2VarA = h2.a(d2.i.f13805e, d.f5693k, sVar, 54);
            int iHashCode2 = Long.hashCode(sVar.T);
            i iVarL2 = sVar.l();
            t tVarC2 = a.c(tVarB2, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC2, gVar4, sVar);
            m3.i.a(b3.i.u(jContentColor, v0.f19606a), u3.e.e(-349352823, sVar, new f(str, z12, buttonGeometry, jContentColor, function2, function22)), sVar, 56);
            sVar.q(true);
            sVar.q(true);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new Function2() { // from class: g60.g
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    PantryButtonKt.b(str, str2, function0, z11, z12, buttonColors, buttonGeometry, tVar, function2, function22, (n) obj, m3.i.F(i11 | 1));
                    return Unit.f26487a;
                }
            };
        }
    }
}
