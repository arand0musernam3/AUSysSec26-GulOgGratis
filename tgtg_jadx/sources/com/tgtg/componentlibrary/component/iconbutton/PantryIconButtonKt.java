package com.tgtg.componentlibrary.component.iconbutton;

import android.support.v4.media.session.a;
import b0.z;
import b4.d;
import b4.q;
import b4.t;
import b5.g;
import b5.h;
import b5.j;
import com.braze.models.FeatureFlag;
import com.braze.models.inappmessage.InAppMessageBase;
import com.tgtg.componentlibrary.component.iconbutton.ext.IconButtonColorsExtKt;
import com.tgtg.componentlibrary.component.iconbutton.model.IconButtonColors;
import com.tgtg.componentlibrary.component.iconbutton.model.IconButtonGeometry;
import com.tgtg.componentlibrary.component.spinner.PantrySpinnerKt;
import d2.m2;
import d2.p;
import g3.o2;
import g3.s0;
import g3.z2;
import i80.o;
import j5.r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import m3.f;
import m3.m;
import m3.n;
import m3.s;
import m3.w1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import q60.c;
import s1.i;
import s1.l;
import u3.e;
import w.a0;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u001ae\u0010\u000f\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0001¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lkotlin/Function0;", "", "onClick", "Lcom/tgtg/componentlibrary/component/iconbutton/model/IconButtonVariant;", "variant", "Lcom/tgtg/componentlibrary/component/iconbutton/model/IconButtonSize;", "size", "Lb4/t;", "modifier", "", "contentDescription", "", FeatureFlag.ENABLED, "isLoading", InAppMessageBase.ICON, "PantryIconButton", "(Lkotlin/jvm/functions/Function0;Lcom/tgtg/componentlibrary/component/iconbutton/model/IconButtonVariant;Lcom/tgtg/componentlibrary/component/iconbutton/model/IconButtonSize;Lb4/t;Ljava/lang/String;ZZLkotlin/jvm/functions/Function2;Lm3/n;II)V", "app_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPantryIconButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PantryIconButton.kt\ncom/tgtg/componentlibrary/component/iconbutton/PantryIconButtonKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,199:1\n1128#2,6:200\n1128#2,6:206\n1128#2,6:243\n70#3:212\n68#3,8:213\n70#3:249\n67#3,9:250\n77#3:284\n77#3:288\n70#3:289\n67#3,9:290\n77#3:324\n81#4,6:221\n88#4,6:236\n81#4,6:259\n88#4,6:274\n96#4:283\n96#4:287\n81#4,6:299\n88#4,6:314\n96#4:323\n391#5,9:227\n400#5:242\n391#5,9:265\n400#5,3:280\n401#5,2:285\n391#5,9:305\n400#5,3:320\n*S KotlinDebug\n*F\n+ 1 PantryIconButton.kt\ncom/tgtg/componentlibrary/component/iconbutton/PantryIconButtonKt\n*L\n85#1:200,6\n110#1:206,6\n132#1:243,6\n105#1:212\n105#1:213,8\n118#1:249\n118#1:250,9\n118#1:284\n105#1:288\n174#1:289\n174#1:290,9\n174#1:324\n105#1:221,6\n105#1:236,6\n118#1:259,6\n118#1:274,6\n118#1:283\n105#1:287\n174#1:299,6\n174#1:314,6\n174#1:323\n105#1:227,9\n105#1:242\n118#1:265,9\n118#1:280,3\n105#1:285,2\n174#1:305,9\n174#1:320,3\n*E\n"})
public final class PantryIconButtonKt {
    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void PantryIconButton(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> r20, @org.jetbrains.annotations.NotNull com.tgtg.componentlibrary.component.iconbutton.model.IconButtonVariant r21, @org.jetbrains.annotations.NotNull com.tgtg.componentlibrary.component.iconbutton.model.IconButtonSize r22, @org.jetbrains.annotations.Nullable b4.t r23, @org.jetbrains.annotations.Nullable java.lang.String r24, boolean r25, boolean r26, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super m3.n, ? super java.lang.Integer, kotlin.Unit> r27, @org.jetbrains.annotations.Nullable m3.n r28, int r29, int r30) {
        /*
            Method dump skipped, instruction units count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tgtg.componentlibrary.component.iconbutton.PantryIconButtonKt.PantryIconButton(kotlin.jvm.functions.Function0, com.tgtg.componentlibrary.component.iconbutton.model.IconButtonVariant, com.tgtg.componentlibrary.component.iconbutton.model.IconButtonSize, b4.t, java.lang.String, boolean, boolean, kotlin.jvm.functions.Function2, m3.n, int, int):void");
    }

    public static final void a(boolean z11, final IconButtonGeometry iconButtonGeometry, final long j9, final Function2 function2, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.c0(100623193);
        int i12 = i11 | (sVar.g(z11) ? 4 : 2) | (sVar.f(iconButtonGeometry) ? 32 : 16) | (sVar.e(j9) ? 256 : 128) | (sVar.h(function2) ? NewHope.SENDB_BYTES : 1024);
        if (sVar.R(i12 & 1, (i12 & 1171) != 1170)) {
            i.a(Boolean.valueOf(z11), null, null, null, null, null, e.e(728999900, sVar, new o() { // from class: q60.d
                @Override // i80.o
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                    n nVar2 = (n) obj3;
                    ((Integer) obj4).getClass();
                    ((l) obj).getClass();
                    IconButtonGeometry iconButtonGeometry2 = iconButtonGeometry;
                    if (zBooleanValue) {
                        s sVar2 = (s) nVar2;
                        sVar2.a0(-2013572960);
                        PantrySpinnerKt.m939PantrySpinneriJQMabo(iconButtonGeometry2.getSpinnerSize(), j9, sVar2, 0, 0);
                        sVar2.q(false);
                    } else {
                        s sVar3 = (s) nVar2;
                        sVar3.a0(-2013432995);
                        t tVarM = m2.m(q.f5711a, iconButtonGeometry2.m852getIconSizeD9Ej5fM());
                        u0 u0VarD = p.d(b4.d.f5683a, false);
                        int iHashCode = Long.hashCode(sVar3.T);
                        u3.i iVarL = sVar3.l();
                        t tVarC = b4.a.c(tVarM, sVar3);
                        j.R.getClass();
                        h hVar = b5.i.f5839b;
                        sVar3.e0();
                        if (sVar3.S) {
                            sVar3.k(hVar);
                        } else {
                            sVar3.n0();
                        }
                        m3.i.C(u0VarD, b5.i.f5843f, sVar3);
                        m3.i.C(iVarL, b5.i.f5842e, sVar3);
                        m3.i.v(sVar3, Integer.valueOf(iHashCode), b5.i.f5844g);
                        m3.i.z(sVar3, b5.i.f5845h);
                        m3.i.C(tVarC, b5.i.f5841d, sVar3);
                        a0.x(0, function2, sVar3, true, false);
                    }
                    return Unit.f26487a;
                }
            }), sVar, (i12 & 14) | 1572864, 62);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new c(z11, iconButtonGeometry, j9, function2, i11);
        }
    }

    public static final void b(Function0 function0, IconButtonColors iconButtonColors, IconButtonGeometry iconButtonGeometry, t tVar, String str, boolean z11, boolean z12, Function2 function2, n nVar, int i11) {
        int i12;
        IconButtonColors iconButtonColors2;
        boolean z13;
        s sVar = (s) nVar;
        sVar.c0(-1550065508);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(function0) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            iconButtonColors2 = iconButtonColors;
            i12 |= sVar.f(iconButtonColors2) ? 32 : 16;
        } else {
            iconButtonColors2 = iconButtonColors;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.f(iconButtonGeometry) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.f(tVar) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar.f(str) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar.g(z11) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= sVar.g(z12) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i12 |= sVar.h(function2) ? 8388608 : 4194304;
        }
        if (sVar.R(i12 & 1, (4793491 & i12) != 4793490)) {
            Object objM = sVar.M();
            f fVar = m.f29332a;
            if (objM == fVar) {
                objM = a0.g(sVar);
            }
            b2.l lVar = (b2.l) objM;
            boolean zBooleanValue = ((Boolean) a.l(lVar, sVar, 6).getValue()).booleanValue();
            boolean zBooleanValue2 = ((Boolean) z.q(lVar, sVar).getValue()).booleanValue();
            boolean zBooleanValue3 = ((Boolean) a.a.v(lVar, sVar, 6).getValue()).booleanValue();
            int i13 = ((i12 >> 3) & 14) | ((i12 >> 12) & 112) | ((i12 >> 6) & 57344);
            int i14 = i12;
            long jContainerColor = IconButtonColorsExtKt.containerColor(iconButtonColors2, z11, zBooleanValue, zBooleanValue2, z12, sVar, i13);
            long jContentColor = IconButtonColorsExtKt.contentColor(iconButtonColors2, z11, zBooleanValue, zBooleanValue2, z12, sVar, i13);
            z4.o oVar = o2.f19198a;
            t tVarB = q.f5711a;
            if (z11) {
                z13 = false;
                sVar.a0(1488011638);
                sVar.q(false);
            } else {
                sVar.a0(1487914825);
                Object objM2 = sVar.M();
                if (objM2 == fVar) {
                    objM2 = new nv.a(26);
                    sVar.k0(objM2);
                }
                tVarB = r.b(tVarB, (Function1) objM2);
                z13 = false;
                sVar.q(false);
            }
            t tVarThen = z2.f19875b.then(tVarB);
            u0 u0VarD = p.d(d.f5687e, z13);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarThen, sVar);
            j.R.getClass();
            h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            g gVar = b5.i.f5843f;
            m3.i.C(u0VarD, gVar, sVar);
            g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar);
            Integer numValueOf = Integer.valueOf(iHashCode);
            g gVar3 = b5.i.f5844g;
            m3.i.v(sVar, numValueOf, gVar3);
            b5.d dVar = b5.i.f5845h;
            m3.i.z(sVar, dVar);
            g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar);
            t tVarJ = v1.n.j(wd.a.u(m2.m(tVar, iconButtonGeometry.m853getWidthD9Ej5fM()), zBooleanValue3, iconButtonGeometry.m849getFocusRingBorderSizeD9Ej5fM(), iconButtonColors.m839getFocusRingColor0d7_KjU(), iconButtonGeometry.m850getFocusRingPaddingD9Ej5fM(), l2.g.b(iconButtonGeometry.m848getCornerRadiusD9Ej5fM())), jContainerColor, l2.g.b(iconButtonGeometry.m848getCornerRadiusD9Ej5fM()));
            boolean z14 = ((i14 & 57344) == 16384) | ((i14 & 3670016) == 1048576);
            Object objM3 = sVar.M();
            if (z14 || objM3 == fVar) {
                objM3 = new g60.e(str, z12, 2);
                sVar.k0(objM3);
            }
            t tVarC2 = r.c(tVarJ, false, (Function1) objM3);
            u0 u0VarD2 = p.d(d.f5683a, false);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            t tVarC3 = b4.a.c(tVarC2, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(u0VarD2, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC3, gVar4, sVar);
            s0.h(function0, m2.f13850c, z11, null, lVar, null, e.e(-1721868218, sVar, new c(jContentColor, z12, iconButtonGeometry, function2, 0)), sVar, (i14 & 14) | 1597488 | ((i14 >> 9) & 896), 40);
            sVar = sVar;
            sVar.q(true);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new com.tgtg.componentlibrary.component.p000switch.g(function0, iconButtonColors, iconButtonGeometry, tVar, str, z11, z12, function2, i11);
        }
    }
}
