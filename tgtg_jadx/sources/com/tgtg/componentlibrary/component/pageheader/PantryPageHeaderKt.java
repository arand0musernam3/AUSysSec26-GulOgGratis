package com.tgtg.componentlibrary.component.pageheader;

import a3.t0;
import b4.a;
import b4.d;
import b4.q;
import b4.t;
import b5.g;
import b5.h;
import b5.j;
import c60.f;
import cn.x;
import com.tgtg.componentlibrary.component.iconbutton.variant.SubtlePantryIconButtonKt;
import com.tgtg.componentlibrary.component.pageheader.PantryPageHeaderKt;
import com.tgtg.componentlibrary.component.pageheader.model.PageHeaderColors;
import com.tgtg.componentlibrary.component.pageheader.model.PageHeaderGeometry;
import com.tgtg.componentlibrary.component.pageheader.model.PageHeaderState;
import com.tgtg.componentlibrary.component.pageheader.model.PageHeaderVariant;
import d2.b;
import d2.c;
import d2.h2;
import d2.i;
import d2.i2;
import d2.m2;
import d2.n1;
import d2.p;
import d2.w;
import d2.y;
import g3.r9;
import i4.g0;
import j5.r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import m3.m;
import m3.n;
import m3.s;
import m3.w1;
import m5.u0;
import org.bouncycastle.i18n.MessageBundle;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import org.jetbrains.annotations.NotNull;
import rk.z;
import s1.r0;
import u3.e;
import w.a0;
import x5.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\u001aÓ\u0001\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00002\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00002\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00002\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0001¢\u0006\u0004\b\u0014\u0010\u0015\"\u0014\u0010\u0016\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\"\u0014\u0010\u0018\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017¨\u0006\u0019"}, d2 = {"", MessageBundle.TITLE_ENTRY, "Lcom/tgtg/componentlibrary/component/pageheader/model/PageHeaderVariant;", "variant", "Lcom/tgtg/componentlibrary/component/pageheader/model/PageHeaderState;", "state", "Lb4/t;", "modifier", "supportingText", "Lkotlin/Function0;", "", "onLeadingClick", "leadingContentDescription", "leadingSlot", "onCloseClick", "closeContentDescription", "trailingAction1", "trailingAction2", "ctaSlot", "tabs", "PantryPageHeader", "(Ljava/lang/String;Lcom/tgtg/componentlibrary/component/pageheader/model/PageHeaderVariant;Lcom/tgtg/componentlibrary/component/pageheader/model/PageHeaderState;Lb4/t;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lm3/n;III)V", "BACK_CONTENT_DESCRIPTION", "Ljava/lang/String;", "CLOSE_CONTENT_DESCRIPTION", "app_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPantryPageHeader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PantryPageHeader.kt\ncom/tgtg/componentlibrary/component/pageheader/PantryPageHeaderKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,322:1\n87#2:323\n84#2,9:324\n94#2:400\n87#2:438\n83#2,10:439\n94#2:480\n81#3,6:333\n88#3,6:348\n81#3,6:365\n88#3,6:380\n96#3:395\n96#3:399\n81#3,6:412\n88#3,6:427\n96#3:436\n81#3,6:449\n88#3,6:464\n96#3:479\n391#4,9:339\n400#4:354\n391#4,9:371\n400#4:386\n401#4,2:393\n401#4,2:397\n391#4,9:418\n400#4,3:433\n391#4,9:455\n400#4:470\n401#4,2:477\n99#5:355\n96#5,9:356\n106#5:396\n99#5:401\n95#5,10:402\n106#5:437\n1128#6,6:387\n1128#6,6:471\n*S KotlinDebug\n*F\n+ 1 PantryPageHeader.kt\ncom/tgtg/componentlibrary/component/pageheader/PantryPageHeaderKt\n*L\n110#1:323\n110#1:324,9\n110#1:400\n164#1:438\n164#1:439,10\n164#1:480\n110#1:333,6\n110#1:348,6\n115#1:365,6\n115#1:380,6\n115#1:395\n110#1:399\n225#1:412,6\n225#1:427,6\n225#1:436\n164#1:449,6\n164#1:464,6\n164#1:479\n110#1:339,9\n110#1:354\n115#1:371,9\n115#1:386\n115#1:393,2\n110#1:397,2\n225#1:418,9\n225#1:433,3\n164#1:455,9\n164#1:470\n164#1:477,2\n115#1:355\n115#1:356,9\n115#1:396\n225#1:401\n225#1:402,10\n225#1:437\n136#1:387,6\n169#1:471,6\n*E\n"})
public final class PantryPageHeaderKt {

    @NotNull
    public static final String BACK_CONTENT_DESCRIPTION = "Back";

    @NotNull
    public static final String CLOSE_CONTENT_DESCRIPTION = "Close";

    /* JADX WARN: Removed duplicated region for block: B:109:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:193:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void PantryPageHeader(@org.jetbrains.annotations.NotNull final java.lang.String r36, @org.jetbrains.annotations.NotNull final com.tgtg.componentlibrary.component.pageheader.model.PageHeaderVariant r37, @org.jetbrains.annotations.NotNull final com.tgtg.componentlibrary.component.pageheader.model.PageHeaderState r38, @org.jetbrains.annotations.Nullable b4.t r39, @org.jetbrains.annotations.Nullable java.lang.String r40, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function0<kotlin.Unit> r41, @org.jetbrains.annotations.Nullable java.lang.String r42, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super m3.n, ? super java.lang.Integer, kotlin.Unit> r43, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function0<kotlin.Unit> r44, @org.jetbrains.annotations.Nullable java.lang.String r45, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super m3.n, ? super java.lang.Integer, kotlin.Unit> r46, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super m3.n, ? super java.lang.Integer, kotlin.Unit> r47, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super m3.n, ? super java.lang.Integer, kotlin.Unit> r48, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super m3.n, ? super java.lang.Integer, kotlin.Unit> r49, @org.jetbrains.annotations.Nullable m3.n r50, final int r51, final int r52, final int r53) {
        /*
            Method dump skipped, instruction units count: 686
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tgtg.componentlibrary.component.pageheader.PantryPageHeaderKt.PantryPageHeader(java.lang.String, com.tgtg.componentlibrary.component.pageheader.model.PageHeaderVariant, com.tgtg.componentlibrary.component.pageheader.model.PageHeaderState, b4.t, java.lang.String, kotlin.jvm.functions.Function0, java.lang.String, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, java.lang.String, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, m3.n, int, int, int):void");
    }

    public static final void a(PageHeaderVariant pageHeaderVariant, Function0 function0, String str, Function2 function2, n nVar, int i11) {
        int i12;
        s sVar = (s) nVar;
        sVar.c0(-1869712440);
        if ((i11 & 6) == 0) {
            i12 = (sVar.d(pageHeaderVariant.ordinal()) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(function0) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.f(str) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.h(function2) ? NewHope.SENDB_BYTES : 1024;
        }
        if (!sVar.R(i12 & 1, (i12 & 1171) != 1170)) {
            sVar.U();
        } else if (function2 != null) {
            sVar.a0(827777205);
            a0.w((i12 >> 9) & 14, function2, sVar, false);
        } else if (pageHeaderVariant != PageHeaderVariant.Page || function0 == null) {
            sVar.a0(828265114);
            sVar.q(false);
        } else {
            sVar.a0(827896865);
            SubtlePantryIconButtonKt.MediumSubtlePantryIconButton(function0, null, str == null ? BACK_CONTENT_DESCRIPTION : str, false, false, ComposableSingletons$PantryPageHeaderKt.INSTANCE.getLambda$600803338$app_release(), sVar, ((i12 >> 3) & 14) | 196608, 26);
            sVar.q(false);
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new t0(pageHeaderVariant, function0, i11, str, function2, 18);
        }
    }

    public static final void b(String str, final PageHeaderVariant pageHeaderVariant, final PageHeaderState pageHeaderState, final PageHeaderColors pageHeaderColors, PageHeaderGeometry pageHeaderGeometry, final t tVar, final String str2, final Function0 function0, final String str3, final Function2 function2, final Function0 function02, final String str4, final Function2 function22, final Function2 function23, final Function2 function24, Function2 function25, n nVar, final int i11, final int i12) {
        int i13;
        int i14;
        Function2 function26;
        int i15;
        String str5;
        s sVar;
        PageHeaderGeometry pageHeaderGeometry2;
        boolean z11;
        q qVar;
        float f11;
        boolean z12;
        Function2 function27 = function25;
        s sVar2 = (s) nVar;
        sVar2.c0(-802998424);
        if ((i11 & 6) == 0) {
            i13 = (sVar2.f(str) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= sVar2.d(pageHeaderVariant.ordinal()) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i13 |= sVar2.d(pageHeaderState.ordinal()) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= sVar2.f(pageHeaderColors) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i13 |= sVar2.f(pageHeaderGeometry) ? 16384 : 8192;
        }
        if ((i11 & 196608) == 0) {
            i13 |= sVar2.f(tVar) ? 131072 : 65536;
        }
        if ((i11 & 1572864) == 0) {
            i13 |= sVar2.f(str2) ? 1048576 : 524288;
        }
        if ((i11 & 12582912) == 0) {
            i13 |= sVar2.h(function0) ? 8388608 : 4194304;
        }
        if ((i11 & 100663296) == 0) {
            i13 |= sVar2.f(str3) ? 67108864 : 33554432;
        }
        if ((i11 & 805306368) == 0) {
            i14 = 196608;
            function26 = function2;
            i13 |= sVar2.h(function26) ? 536870912 : 268435456;
        } else {
            i14 = 196608;
            function26 = function2;
        }
        int i16 = i13;
        if ((i12 & 6) == 0) {
            i15 = i12 | (sVar2.h(function02) ? 4 : 2);
        } else {
            i15 = i12;
        }
        if ((i12 & 48) == 0) {
            i15 |= sVar2.f(str4) ? 32 : 16;
        }
        if ((i12 & MLKEMEngine.KyberPolyBytes) == 0) {
            i15 |= sVar2.h(function22) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i15 |= sVar2.h(function23) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            i15 |= sVar2.h(function24) ? 16384 : 8192;
        }
        if ((i12 & i14) == 0) {
            i15 |= sVar2.h(function27) ? 131072 : 65536;
        }
        if (sVar2.R(i16 & 1, ((i16 & 306783379) == 306783378 && (i15 & 74899) == 74898) ? false : true)) {
            boolean z13 = pageHeaderState == PageHeaderState.Collapsed;
            t tVarJ = v1.n.j(m2.d(tVar, 1.0f), pageHeaderColors.m891getBackgroundColor0d7_KjU(), g0.f23254b);
            y yVarA = w.a(i.f13803c, d.f5694m, sVar2, 0);
            int iHashCode = Long.hashCode(sVar2.T);
            u3.i iVarL = sVar2.l();
            t tVarC = a.c(tVarJ, sVar2);
            j.R.getClass();
            h hVar = b5.i.f5839b;
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(hVar);
            } else {
                sVar2.n0();
            }
            g gVar = b5.i.f5843f;
            m3.i.C(yVarA, gVar, sVar2);
            g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            g gVar3 = b5.i.f5844g;
            m3.i.v(sVar2, numValueOf, gVar3);
            b5.d dVar = b5.i.f5845h;
            m3.i.z(sVar2, dVar);
            g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar2);
            q qVar2 = q.f5711a;
            t tVarD = m2.d(qVar2, 1.0f);
            i2 i2VarA = h2.a(i.f13801a, d.f5693k, sVar2, 48);
            int iHashCode2 = Long.hashCode(sVar2.T);
            u3.i iVarL2 = sVar2.l();
            t tVarC2 = a.c(tVarD, sVar2);
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(hVar);
            } else {
                sVar2.n0();
            }
            m3.i.C(i2VarA, gVar, sVar2);
            m3.i.C(iVarL2, gVar2, sVar2);
            a0.y(iHashCode2, sVar2, gVar3, sVar2, dVar);
            m3.i.C(tVarC2, gVar4, sVar2);
            int i17 = (i16 >> 3) & 14;
            int i18 = i16 >> 18;
            a(pageHeaderVariant, function0, str3, function26, sVar2, i17 | (i18 & 112) | (i18 & 896) | (i18 & 7168));
            sVar = sVar2;
            if (z13) {
                sVar.a0(-432950601);
                u0 titleStyle = pageHeaderGeometry.getTitleStyle();
                long jM894getTitleColor0d7_KjU = pageHeaderColors.m894getTitleColor0d7_KjU();
                if (1.0f <= 0.0d) {
                    e2.a.a("invalid weight; must be greater than zero");
                }
                n1 n1Var = new n1(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true);
                Object objM = sVar.M();
                if (objM == m.f29332a) {
                    objM = new z(2);
                    sVar.k0(objM);
                }
                r9.d(str, r.c(n1Var, false, (Function1) objM), jM894getTitleColor0d7_KjU, 0L, null, 0L, null, new k(3), 0L, 2, false, 1, 0, null, titleStyle, sVar, i16 & 14, 24960, 109560);
                str5 = str;
                sVar = sVar;
                if (function22 == null && function23 == null && function24 == null) {
                    sVar.a0(-432445549);
                    qVar = qVar2;
                    z11 = false;
                    p.a(m2.q(qVar, pageHeaderGeometry.m902getIconSizeD9Ej5fM()), sVar, 0);
                    sVar.q(false);
                } else {
                    qVar = qVar2;
                    z11 = false;
                    sVar.a0(-432352332);
                    sVar.q(false);
                }
                sVar.q(z11);
                f11 = 1.0f;
                z12 = true;
            } else {
                z11 = false;
                str5 = str;
                qVar = qVar2;
                sVar.a0(-432330322);
                f11 = 1.0f;
                if (1.0f <= 0.0d) {
                    e2.a.a("invalid weight; must be greater than zero");
                }
                z12 = true;
                c.f(new n1(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true), sVar);
                sVar.q(false);
            }
            int i19 = i15 << 6;
            c(pageHeaderVariant, pageHeaderGeometry, function02, str4, function22, function23, function24, sVar, i17 | ((i16 >> 9) & 112) | (i19 & 896) | (i19 & 7168) | (57344 & i19) | (458752 & i19) | (i19 & 3670016));
            pageHeaderGeometry2 = pageHeaderGeometry;
            sVar.q(z12);
            s1.y.b(d2.z.f13980a, !z13, c.D(m2.d(qVar, f11), 0.0f, pageHeaderGeometry2.m905getTitleTopPaddingD9Ej5fM(), 0.0f, 0.0f, 13), r0.c(null, 15), r0.j(null, 15), null, e.e(-145439782, sVar, new x(pageHeaderGeometry2, pageHeaderColors, str5, str2)), sVar, 1600518, 16);
            function27 = function25;
            if (function27 != null) {
                sVar.a0(-1352518555);
                c.f(m2.m(qVar, pageHeaderGeometry2.m904getTabsTopPaddingD9Ej5fM()), sVar);
                a0.w((i15 >> 15) & 14, function27, sVar, z11);
            } else {
                sVar.a0(-1352415728);
                sVar.q(z11);
            }
            sVar.q(z12);
        } else {
            str5 = str;
            sVar = sVar2;
            pageHeaderGeometry2 = pageHeaderGeometry;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            final Function2 function28 = function27;
            final String str6 = str5;
            final PageHeaderGeometry pageHeaderGeometry3 = pageHeaderGeometry2;
            w1VarS.f29476d = new Function2() { // from class: s60.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iF = m3.i.F(i11 | 1);
                    int iF2 = m3.i.F(i12);
                    PantryPageHeaderKt.b(str6, pageHeaderVariant, pageHeaderState, pageHeaderColors, pageHeaderGeometry3, tVar, str2, function0, str3, function2, function02, str4, function22, function23, function24, function28, (n) obj, iF, iF2);
                    return Unit.f26487a;
                }
            };
        }
    }

    public static final void c(PageHeaderVariant pageHeaderVariant, PageHeaderGeometry pageHeaderGeometry, Function0 function0, String str, Function2 function2, Function2 function22, Function2 function23, n nVar, int i11) {
        int i12;
        PageHeaderVariant pageHeaderVariant2;
        s sVar = (s) nVar;
        sVar.c0(480371858);
        if ((i11 & 6) == 0) {
            i12 = (sVar.d(pageHeaderVariant.ordinal()) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(pageHeaderGeometry) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.h(function0) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.f(str) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar.h(function2) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        }
        if ((i11 & 196608) == 0) {
            i12 |= sVar.h(function22) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= sVar.h(function23) ? 1048576 : 524288;
        }
        if (sVar.R(i12 & 1, (599187 & i12) != 599186)) {
            b bVar = i.f13801a;
            i2 i2VarA = h2.a(i.g(pageHeaderGeometry.m906getTrailingContentSpacedByD9Ej5fM()), d.f5693k, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = a.c(q.f5711a, sVar);
            j.R.getClass();
            h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            if (function2 == null) {
                sVar.a0(-921293781);
                sVar.q(false);
            } else {
                sVar.a0(247375510);
                a0.w((i12 >> 12) & 14, function2, sVar, false);
            }
            if (function22 == null) {
                sVar.a0(-921260053);
                sVar.q(false);
            } else {
                sVar.a0(247376598);
                a0.w((i12 >> 15) & 14, function22, sVar, false);
            }
            if (function23 == null) {
                sVar.a0(-921234261);
                sVar.q(false);
            } else {
                sVar.a0(247377430);
                a0.w((i12 >> 18) & 14, function23, sVar, false);
            }
            pageHeaderVariant2 = pageHeaderVariant;
            if (pageHeaderVariant2 != PageHeaderVariant.Modal || function0 == null) {
                sVar.a0(-920788108);
                sVar.q(false);
            } else {
                sVar.a0(-921142717);
                SubtlePantryIconButtonKt.MediumSubtlePantryIconButton(function0, null, str == null ? CLOSE_CONTENT_DESCRIPTION : str, false, false, ComposableSingletons$PantryPageHeaderKt.INSTANCE.getLambda$1666367670$app_release(), sVar, ((i12 >> 6) & 14) | 196608, 26);
                sVar.q(false);
            }
            sVar.q(true);
        } else {
            pageHeaderVariant2 = pageHeaderVariant;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new f(pageHeaderVariant2, pageHeaderGeometry, function0, str, function2, function22, function23, i11);
        }
    }
}
