package com.tgtg.componentlibrary.component.button;

import b4.a;
import b4.d;
import b4.q;
import b4.t;
import b5.h;
import com.tgtg.componentlibrary.component.button.variant.AccentPantryButtonKt;
import com.tgtg.componentlibrary.component.button.variant.NegativePantryButtonKt;
import com.tgtg.componentlibrary.component.button.variant.PrimaryPantryButtonKt;
import com.tgtg.componentlibrary.component.button.variant.SubtlePantryButtonKt;
import com.tgtg.componentlibrary.component.button.variant.TextTransparentPantryButtonKt;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import d2.b;
import d2.c;
import d2.g;
import d2.h2;
import d2.i;
import d2.i2;
import d2.m2;
import d2.n1;
import d2.w;
import d2.y;
import g3.r9;
import g3.s0;
import i4.g0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import m3.f;
import m3.n;
import m3.s;
import m3.w1;
import org.jetbrains.annotations.Nullable;
import w.a0;
import x60.j;
import x60.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"", "DemoPantryButton", "(Lm3/n;I)V", "app_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDemoPantryButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DemoPantryButton.kt\ncom/tgtg/componentlibrary/component/button/DemoPantryButtonKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,235:1\n75#2:236\n75#2:237\n75#2:238\n87#3:239\n85#3,8:240\n87#3:270\n83#3,10:271\n94#3:324\n87#3:325\n83#3,10:326\n94#3:379\n87#3:380\n83#3,10:381\n94#3:434\n87#3:435\n83#3,10:436\n94#3:489\n87#3:490\n83#3,10:491\n94#3:544\n87#3:545\n83#3,10:546\n94#3:599\n87#3:661\n83#3,10:662\n94#3:758\n94#3:762\n81#4,6:248\n88#4,6:263\n81#4,6:281\n88#4,6:296\n96#4:323\n81#4,6:336\n88#4,6:351\n96#4:378\n81#4,6:391\n88#4,6:406\n96#4:433\n81#4,6:446\n88#4,6:461\n96#4:488\n81#4,6:501\n88#4,6:516\n96#4:543\n81#4,6:556\n88#4,6:571\n96#4:598\n81#4,6:611\n88#4,6:626\n96#4:659\n81#4,6:672\n88#4,6:687\n81#4,6:705\n88#4,6:720\n96#4:753\n96#4:757\n96#4:761\n391#5,9:254\n400#5:269\n391#5,9:287\n400#5:302\n401#5,2:321\n391#5,9:342\n400#5:357\n401#5,2:376\n391#5,9:397\n400#5:412\n401#5,2:431\n391#5,9:452\n400#5:467\n401#5,2:486\n391#5,9:507\n400#5:522\n401#5,2:541\n391#5,9:562\n400#5:577\n401#5,2:596\n391#5,9:617\n400#5:632\n401#5,2:657\n391#5,9:678\n400#5:693\n391#5,9:711\n400#5:726\n401#5,2:751\n401#5,2:755\n401#5,2:759\n1128#6,6:303\n1128#6,6:309\n1128#6,6:315\n1128#6,6:358\n1128#6,6:364\n1128#6,6:370\n1128#6,6:413\n1128#6,6:419\n1128#6,6:425\n1128#6,6:468\n1128#6,6:474\n1128#6,6:480\n1128#6,6:523\n1128#6,6:529\n1128#6,6:535\n1128#6,6:578\n1128#6,6:584\n1128#6,6:590\n1128#6,6:633\n1128#6,6:639\n1128#6,6:645\n1128#6,6:651\n1128#6,6:727\n1128#6,6:733\n1128#6,6:739\n1128#6,6:745\n99#7:600\n95#7,10:601\n106#7:660\n99#7:694\n95#7,10:695\n106#7:754\n*S KotlinDebug\n*F\n+ 1 DemoPantryButton.kt\ncom/tgtg/componentlibrary/component/button/DemoPantryButtonKt\n*L\n47#1:236\n48#1:237\n49#1:238\n51#1:239\n51#1:240,8\n61#1:270\n61#1:271,10\n61#1:324\n67#1:325\n67#1:326,10\n67#1:379\n73#1:380\n73#1:381,10\n73#1:434\n79#1:435\n79#1:436,10\n79#1:489\n85#1:490\n85#1:491,10\n85#1:544\n94#1:545\n94#1:546,10\n94#1:599\n138#1:661\n138#1:662,10\n138#1:758\n51#1:762\n51#1:248,6\n51#1:263,6\n61#1:281,6\n61#1:296,6\n61#1:323\n67#1:336,6\n67#1:351,6\n67#1:378\n73#1:391,6\n73#1:406,6\n73#1:433\n79#1:446,6\n79#1:461,6\n79#1:488\n85#1:501,6\n85#1:516,6\n85#1:543\n94#1:556,6\n94#1:571,6\n94#1:598\n115#1:611,6\n115#1:626,6\n115#1:659\n138#1:672,6\n138#1:687,6\n140#1:705,6\n140#1:720,6\n140#1:753\n138#1:757\n51#1:761\n51#1:254,9\n51#1:269\n61#1:287,9\n61#1:302\n61#1:321,2\n67#1:342,9\n67#1:357\n67#1:376,2\n73#1:397,9\n73#1:412\n73#1:431,2\n79#1:452,9\n79#1:467\n79#1:486,2\n85#1:507,9\n85#1:522\n85#1:541,2\n94#1:562,9\n94#1:577\n94#1:596,2\n115#1:617,9\n115#1:632\n115#1:657,2\n138#1:678,9\n138#1:693\n140#1:711,9\n140#1:726\n140#1:751,2\n138#1:755,2\n51#1:759,2\n62#1:303,6\n63#1:309,6\n64#1:315,6\n68#1:358,6\n69#1:364,6\n70#1:370,6\n74#1:413,6\n75#1:419,6\n76#1:425,6\n80#1:468,6\n81#1:474,6\n82#1:480,6\n86#1:523,6\n87#1:529,6\n88#1:535,6\n97#1:578,6\n103#1:584,6\n109#1:590,6\n118#1:633,6\n123#1:639,6\n128#1:645,6\n133#1:651,6\n143#1:727,6\n153#1:733,6\n163#1:739,6\n173#1:745,6\n115#1:600\n115#1:601,10\n115#1:660\n140#1:694\n140#1:695,10\n140#1:754\n*E\n"})
public final class DemoPantryButtonKt {
    public static final void DemoPantryButton(@Nullable n nVar, int i11) {
        h hVar;
        char c3;
        h hVar2;
        s sVar = (s) nVar;
        sVar.c0(-349266016);
        if (sVar.R(i11 & 1, i11 != 0)) {
            m mVar = (m) sVar.j(PantryThemeKt.getLocalPantrySpacing());
            j jVar = (j) sVar.j(PantryThemeKt.getLocalPantryTypography());
            x60.h hVar3 = (x60.h) sVar.j(PantryThemeKt.getLocalPantryColor());
            t tVarJ = v1.n.j(m2.f13850c, hVar3.f43905a, g0.f23254b);
            float f11 = mVar.f44010f;
            float f12 = mVar.l;
            t tVarR = v1.n.r(c.A(tVarJ, f11, mVar.f44011g), v1.n.q(sVar), true);
            b bVar = i.f13801a;
            g gVarG = i.g(mVar.f44008d);
            b4.i iVar = d.f5694m;
            y yVarA = w.a(gVarG, iVar, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = a.c(tVarR, sVar);
            b5.j.R.getClass();
            h hVar4 = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar4);
            } else {
                sVar.n0();
            }
            b5.g gVar = b5.i.f5843f;
            m3.i.C(yVarA, gVar, sVar);
            b5.g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b5.g gVar3 = b5.i.f5844g;
            m3.i.v(sVar, numValueOf, gVar3);
            b5.d dVar = b5.i.f5845h;
            m3.i.z(sVar, dVar);
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar);
            r9.d("Variants", null, hVar3.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar.f43957f, sVar, 6, 0, 131066);
            y yVarA2 = w.a(i.g(f12), iVar, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            q qVar = q.f5711a;
            t tVarC2 = a.c(qVar, sVar);
            sVar.e0();
            if (sVar.S) {
                hVar = hVar4;
                sVar.k(hVar);
            } else {
                hVar = hVar4;
                sVar.n0();
            }
            m3.i.C(yVarA2, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC2, gVar4, sVar);
            Object objM = sVar.M();
            f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = new g60.b(0);
                sVar.k0(objM);
            }
            PrimaryPantryButtonKt.LargePrimaryPantryButton("Large Primary", (Function0) objM, null, null, false, false, null, null, sVar, 54, 252);
            Object objM2 = sVar.M();
            if (objM2 == fVar) {
                objM2 = new g60.b(2);
                sVar.k0(objM2);
            }
            PrimaryPantryButtonKt.MediumPrimaryPantryButton("Medium Primary", (Function0) objM2, null, null, false, false, null, null, sVar, 54, 252);
            Object objM3 = sVar.M();
            if (objM3 == fVar) {
                c3 = '\t';
                objM3 = new g60.b(9);
                sVar.k0(objM3);
            } else {
                c3 = '\t';
            }
            PrimaryPantryButtonKt.SmallPrimaryPantryButton("Small Primary", (Function0) objM3, null, null, false, false, null, null, sVar, 54, 252);
            sVar.q(true);
            y yVarA3 = w.a(i.g(f12), iVar, sVar, 0);
            int iHashCode3 = Long.hashCode(sVar.T);
            u3.i iVarL3 = sVar.l();
            t tVarC3 = a.c(qVar, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA3, gVar, sVar);
            m3.i.C(iVarL3, gVar2, sVar);
            a0.y(iHashCode3, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC3, gVar4, sVar);
            Object objM4 = sVar.M();
            if (objM4 == fVar) {
                objM4 = new g60.b(11);
                sVar.k0(objM4);
            }
            SubtlePantryButtonKt.LargeSubtlePantryButton("Large Subtle", (Function0) objM4, null, null, false, false, null, null, sVar, 54, 252);
            Object objM5 = sVar.M();
            if (objM5 == fVar) {
                objM5 = new g60.b(12);
                sVar.k0(objM5);
            }
            SubtlePantryButtonKt.MediumSubtlePantryButton("Medium Subtle", (Function0) objM5, null, null, false, false, null, null, sVar, 54, 252);
            Object objM6 = sVar.M();
            if (objM6 == fVar) {
                objM6 = new g60.b(13);
                sVar.k0(objM6);
            }
            SubtlePantryButtonKt.SmallSubtlePantryButton("Small Subtle", (Function0) objM6, null, null, false, false, null, null, sVar, 54, 252);
            sVar.q(true);
            y yVarA4 = w.a(i.g(f12), iVar, sVar, 0);
            int iHashCode4 = Long.hashCode(sVar.T);
            u3.i iVarL4 = sVar.l();
            t tVarC4 = a.c(qVar, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA4, gVar, sVar);
            m3.i.C(iVarL4, gVar2, sVar);
            a0.y(iHashCode4, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC4, gVar4, sVar);
            Object objM7 = sVar.M();
            if (objM7 == fVar) {
                objM7 = new g60.b(14);
                sVar.k0(objM7);
            }
            TextTransparentPantryButtonKt.LargeTextTransparentPantryButton("Large Text Transparent", (Function0) objM7, null, null, false, false, null, null, sVar, 54, 252);
            Object objM8 = sVar.M();
            if (objM8 == fVar) {
                objM8 = new g60.b(15);
                sVar.k0(objM8);
            }
            TextTransparentPantryButtonKt.MediumTextTransparentPantryButton("Medium Text Transparent", (Function0) objM8, null, null, false, false, null, null, sVar, 54, 252);
            Object objM9 = sVar.M();
            if (objM9 == fVar) {
                objM9 = new g60.b(16);
                sVar.k0(objM9);
            }
            TextTransparentPantryButtonKt.SmallTextTransparentPantryButton("Small Text Transparent", (Function0) objM9, null, null, false, false, null, null, sVar, 54, 252);
            sVar.q(true);
            y yVarA5 = w.a(i.g(f12), iVar, sVar, 0);
            int iHashCode5 = Long.hashCode(sVar.T);
            u3.i iVarL5 = sVar.l();
            t tVarC5 = a.c(qVar, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA5, gVar, sVar);
            m3.i.C(iVarL5, gVar2, sVar);
            a0.y(iHashCode5, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC5, gVar4, sVar);
            Object objM10 = sVar.M();
            if (objM10 == fVar) {
                objM10 = new g60.b(17);
                sVar.k0(objM10);
            }
            AccentPantryButtonKt.LargeAccentPantryButton("Large Accent", (Function0) objM10, null, null, false, false, null, null, sVar, 54, 252);
            Object objM11 = sVar.M();
            if (objM11 == fVar) {
                objM11 = new g60.b(10);
                sVar.k0(objM11);
            }
            AccentPantryButtonKt.MediumAccentPantryButton("Medium Accent", (Function0) objM11, null, null, false, false, null, null, sVar, 54, 252);
            Object objM12 = sVar.M();
            if (objM12 == fVar) {
                objM12 = new g60.b(18);
                sVar.k0(objM12);
            }
            AccentPantryButtonKt.SmallAccentPantryButton("Small Accent", (Function0) objM12, null, null, false, false, null, null, sVar, 54, 252);
            sVar.q(true);
            y yVarA6 = w.a(i.g(f12), iVar, sVar, 0);
            int iHashCode6 = Long.hashCode(sVar.T);
            u3.i iVarL6 = sVar.l();
            t tVarC6 = a.c(qVar, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA6, gVar, sVar);
            m3.i.C(iVarL6, gVar2, sVar);
            a0.y(iHashCode6, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC6, gVar4, sVar);
            Object objM13 = sVar.M();
            if (objM13 == fVar) {
                objM13 = new g60.b(19);
                sVar.k0(objM13);
            }
            NegativePantryButtonKt.LargeNegativePantryButton("Large Negative", (Function0) objM13, null, null, false, false, null, null, sVar, 54, 252);
            Object objM14 = sVar.M();
            if (objM14 == fVar) {
                objM14 = new g60.b(20);
                sVar.k0(objM14);
            }
            NegativePantryButtonKt.MediumNegativePantryButton("Medium Negative", (Function0) objM14, null, null, false, false, null, null, sVar, 54, 252);
            Object objM15 = sVar.M();
            if (objM15 == fVar) {
                objM15 = new g60.b(21);
                sVar.k0(objM15);
            }
            NegativePantryButtonKt.SmallNegativePantryButton("Small Negative", (Function0) objM15, null, null, false, false, null, null, sVar, 54, 252);
            sVar.q(true);
            s0.g(null, 0.0f, hVar3.f43922i0, sVar, 0, 3);
            h hVar5 = hVar;
            r9.d("Icons & States", null, hVar3.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar.f43957f, sVar, 6, 0, 131066);
            y yVarA7 = w.a(i.g(f12), iVar, sVar, 0);
            int iHashCode7 = Long.hashCode(sVar.T);
            u3.i iVarL7 = sVar.l();
            t tVarC7 = a.c(qVar, sVar);
            sVar.e0();
            if (sVar.S) {
                hVar2 = hVar5;
                sVar.k(hVar2);
            } else {
                hVar2 = hVar5;
                sVar.n0();
            }
            m3.i.C(yVarA7, gVar, sVar);
            m3.i.C(iVarL7, gVar2, sVar);
            a0.y(iHashCode7, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC7, gVar4, sVar);
            t tVarD = m2.d(qVar, 1.0f);
            Object objM16 = sVar.M();
            if (objM16 == fVar) {
                objM16 = new g60.b(22);
                sVar.k0(objM16);
            }
            ComposableSingletons$DemoPantryButtonKt composableSingletons$DemoPantryButtonKt = ComposableSingletons$DemoPantryButtonKt.INSTANCE;
            PrimaryPantryButtonKt.LargePrimaryPantryButton("Leading Icon", (Function0) objM16, tVarD, null, false, false, composableSingletons$DemoPantryButtonKt.getLambda$1217352527$app_release(), null, sVar, 1573302, 184);
            t tVarD2 = m2.d(qVar, 1.0f);
            Object objM17 = sVar.M();
            if (objM17 == fVar) {
                objM17 = new g60.b(23);
                sVar.k0(objM17);
            }
            PrimaryPantryButtonKt.LargePrimaryPantryButton("Trailing Icon", (Function0) objM17, tVarD2, null, false, false, null, composableSingletons$DemoPantryButtonKt.m610getLambda$357124777$app_release(), sVar, 12583350, 120);
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            n1 n1Var = new n1(1.0f, true);
            Object objM18 = sVar.M();
            if (objM18 == fVar) {
                objM18 = new g60.b(24);
                sVar.k0(objM18);
            }
            PrimaryPantryButtonKt.LargePrimaryPantryButton("Disabled", (Function0) objM18, n1Var, null, false, false, null, null, sVar, 24630, 232);
            sVar.q(true);
            g gVarG2 = i.g(f12);
            b4.j jVar2 = d.f5692j;
            i2 i2VarA = h2.a(gVarG2, jVar2, sVar, 0);
            int iHashCode8 = Long.hashCode(sVar.T);
            u3.i iVarL8 = sVar.l();
            t tVarC8 = a.c(qVar, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar2);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA, gVar, sVar);
            m3.i.C(iVarL8, gVar2, sVar);
            a0.y(iHashCode8, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC8, gVar4, sVar);
            Object objM19 = sVar.M();
            if (objM19 == fVar) {
                objM19 = new g60.b(25);
                sVar.k0(objM19);
            }
            PrimaryPantryButtonKt.LargePrimaryPantryButton("Loading", (Function0) objM19, null, null, false, true, null, null, sVar, 196662, 220);
            Object objM20 = sVar.M();
            if (objM20 == fVar) {
                objM20 = new g60.b(1);
                sVar.k0(objM20);
            }
            SubtlePantryButtonKt.MediumSubtlePantryButton("Loading", (Function0) objM20, null, null, false, true, null, null, sVar, 196662, 220);
            Object objM21 = sVar.M();
            if (objM21 == fVar) {
                objM21 = new g60.b(3);
                sVar.k0(objM21);
            }
            AccentPantryButtonKt.SmallAccentPantryButton("Loading", (Function0) objM21, null, null, false, true, null, null, sVar, 196662, 220);
            Object objM22 = sVar.M();
            if (objM22 == fVar) {
                objM22 = new g60.b(4);
                sVar.k0(objM22);
            }
            NegativePantryButtonKt.SmallNegativePantryButton("Loading", (Function0) objM22, null, null, false, true, null, null, sVar, 196662, 220);
            sVar.q(true);
            y yVarA8 = w.a(i.g(f12), iVar, sVar, 0);
            int iHashCode9 = Long.hashCode(sVar.T);
            u3.i iVarL9 = sVar.l();
            t tVarC9 = a.c(qVar, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar2);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA8, gVar, sVar);
            m3.i.C(iVarL9, gVar2, sVar);
            a0.y(iHashCode9, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC9, gVar4, sVar);
            h hVar6 = hVar2;
            r9.d("Icon Only", null, hVar3.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar.f43959h, sVar, 6, 0, 131066);
            sVar = sVar;
            i2 i2VarA2 = h2.a(i.g(f12), jVar2, sVar, 0);
            int iHashCode10 = Long.hashCode(sVar.T);
            u3.i iVarL10 = sVar.l();
            t tVarC10 = a.c(qVar, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar6);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA2, gVar, sVar);
            m3.i.C(iVarL10, gVar2, sVar);
            a0.y(iHashCode10, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC10, gVar4, sVar);
            Object objM23 = sVar.M();
            if (objM23 == fVar) {
                objM23 = new g60.b(5);
                sVar.k0(objM23);
            }
            PrimaryPantryButtonKt.LargePrimaryPantryButton("", (Function0) objM23, null, null, false, false, composableSingletons$DemoPantryButtonKt.m607getLambda$1891338038$app_release(), null, sVar, 1572918, 188);
            Object objM24 = sVar.M();
            if (objM24 == fVar) {
                objM24 = new g60.b(6);
                sVar.k0(objM24);
            }
            SubtlePantryButtonKt.MediumSubtlePantryButton("", (Function0) objM24, null, null, false, false, composableSingletons$DemoPantryButtonKt.getLambda$93546543$app_release(), null, sVar, 1572918, 188);
            Object objM25 = sVar.M();
            if (objM25 == fVar) {
                objM25 = new g60.b(7);
                sVar.k0(objM25);
            }
            AccentPantryButtonKt.SmallAccentPantryButton("", (Function0) objM25, null, null, false, false, composableSingletons$DemoPantryButtonKt.m608getLambda$1967736796$app_release(), null, sVar, 1572918, 188);
            Object objM26 = sVar.M();
            if (objM26 == fVar) {
                objM26 = new g60.b(8);
                sVar.k0(objM26);
            }
            NegativePantryButtonKt.SmallNegativePantryButton("", (Function0) objM26, null, null, false, false, composableSingletons$DemoPantryButtonKt.getLambda$1647990681$app_release(), null, sVar, 1572918, 188);
            e0.f.D(sVar, true, true, true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new c60.b(i11, 9);
        }
    }
}
