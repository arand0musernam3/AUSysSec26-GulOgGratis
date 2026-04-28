package com.tgtg.componentlibrary.component.iconbutton;

import b4.a;
import b4.d;
import b4.q;
import b4.t;
import b5.h;
import com.tgtg.componentlibrary.component.iconbutton.variant.AccentPantryIconButtonKt;
import com.tgtg.componentlibrary.component.iconbutton.variant.IconOnlyPantryIconButtonKt;
import com.tgtg.componentlibrary.component.iconbutton.variant.SubtlePantryIconButtonKt;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import d2.b;
import d2.c;
import d2.e;
import d2.g;
import d2.h2;
import d2.i;
import d2.i2;
import d2.k2;
import d2.m2;
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
import m5.u0;
import org.jetbrains.annotations.Nullable;
import w.a0;
import x60.j;
import x60.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"", "DemoPantryIconButton", "(Lm3/n;I)V", "app_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDemoPantryIconButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DemoPantryIconButton.kt\ncom/tgtg/componentlibrary/component/iconbutton/DemoPantryIconButtonKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,280:1\n75#2:281\n75#2:282\n75#2:283\n87#3:284\n85#3,8:285\n87#3:346\n83#3,10:347\n94#3:382\n87#3:383\n83#3,10:384\n94#3:419\n87#3:420\n83#3,10:421\n94#3:456\n87#3:461\n83#3,10:462\n94#3:607\n94#3:776\n81#4,6:293\n88#4,6:308\n81#4,6:324\n88#4,6:339\n81#4,6:357\n88#4,6:372\n96#4:381\n81#4,6:394\n88#4,6:409\n96#4:418\n81#4,6:431\n88#4,6:446\n96#4:455\n96#4:459\n81#4,6:472\n88#4,6:487\n81#4,6:505\n88#4,6:520\n96#4:547\n81#4,6:560\n88#4,6:575\n96#4:602\n96#4:606\n81#4,6:619\n88#4,6:634\n96#4:661\n81#4,6:674\n88#4,6:689\n96#4:716\n81#4,6:729\n88#4,6:744\n96#4:771\n96#4:775\n391#5,9:299\n400#5:314\n391#5,9:330\n400#5:345\n391#5,9:363\n400#5,3:378\n391#5,9:400\n400#5,3:415\n391#5,9:437\n400#5,3:452\n401#5,2:457\n391#5,9:478\n400#5:493\n391#5,9:511\n400#5:526\n401#5,2:545\n391#5,9:566\n400#5:581\n401#5,2:600\n401#5,2:604\n391#5,9:625\n400#5:640\n401#5,2:659\n391#5,9:680\n400#5:695\n401#5,2:714\n391#5,9:735\n400#5:750\n401#5,2:769\n401#5,2:773\n99#6:315\n97#6,8:316\n106#6:460\n99#6:494\n95#6,10:495\n106#6:548\n99#6:549\n95#6,10:550\n106#6:603\n99#6:608\n95#6,10:609\n106#6:662\n99#6:663\n95#6,10:664\n106#6:717\n99#6:718\n95#6,10:719\n106#6:772\n1128#7,6:527\n1128#7,6:533\n1128#7,6:539\n1128#7,6:582\n1128#7,6:588\n1128#7,6:594\n1128#7,6:641\n1128#7,6:647\n1128#7,6:653\n1128#7,6:696\n1128#7,6:702\n1128#7,6:708\n1128#7,6:751\n1128#7,6:757\n1128#7,6:763\n*S KotlinDebug\n*F\n+ 1 DemoPantryIconButton.kt\ncom/tgtg/componentlibrary/component/iconbutton/DemoPantryIconButtonKt\n*L\n44#1:281\n45#1:282\n46#1:283\n48#1:284\n48#1:285,8\n61#1:346\n61#1:347,10\n61#1:382\n65#1:383\n65#1:384,10\n65#1:419\n69#1:420\n69#1:421,10\n69#1:456\n78#1:461\n78#1:462,10\n78#1:607\n48#1:776\n48#1:293,6\n48#1:308,6\n57#1:324,6\n57#1:339,6\n61#1:357,6\n61#1:372,6\n61#1:381\n65#1:394,6\n65#1:409,6\n65#1:418\n69#1:431,6\n69#1:446,6\n69#1:455\n57#1:459\n78#1:472,6\n78#1:487,6\n86#1:505,6\n86#1:520,6\n86#1:547\n128#1:560,6\n128#1:575,6\n128#1:602\n78#1:606\n167#1:619,6\n167#1:634,6\n167#1:661\n187#1:674,6\n187#1:689,6\n187#1:716\n208#1:729,6\n208#1:744,6\n208#1:771\n48#1:775\n48#1:299,9\n48#1:314\n57#1:330,9\n57#1:345\n61#1:363,9\n61#1:378,3\n65#1:400,9\n65#1:415,3\n69#1:437,9\n69#1:452,3\n57#1:457,2\n78#1:478,9\n78#1:493\n86#1:511,9\n86#1:526\n86#1:545,2\n128#1:566,9\n128#1:581\n128#1:600,2\n78#1:604,2\n167#1:625,9\n167#1:640\n167#1:659,2\n187#1:680,9\n187#1:695\n187#1:714,2\n208#1:735,9\n208#1:750\n208#1:769,2\n48#1:773,2\n57#1:315\n57#1:316,8\n57#1:460\n86#1:494\n86#1:495,10\n86#1:548\n128#1:549\n128#1:550,10\n128#1:603\n167#1:608\n167#1:609,10\n167#1:662\n187#1:663\n187#1:664,10\n187#1:717\n208#1:718\n208#1:719,10\n208#1:772\n88#1:527,6\n100#1:533,6\n112#1:539,6\n130#1:582,6\n142#1:588,6\n154#1:594,6\n169#1:641,6\n175#1:647,6\n181#1:653,6\n189#1:696,6\n195#1:702,6\n201#1:708,6\n210#1:751,6\n216#1:757,6\n222#1:763,6\n*E\n"})
public final class DemoPantryIconButtonKt {
    public static final void DemoPantryIconButton(@Nullable n nVar, int i11) {
        h hVar;
        h hVar2;
        h hVar3;
        h hVar4;
        char c3;
        h hVar5;
        h hVar6;
        s sVar = (s) nVar;
        sVar.c0(381116455);
        if (sVar.R(i11 & 1, i11 != 0)) {
            m mVar = (m) sVar.j(PantryThemeKt.getLocalPantrySpacing());
            j jVar = (j) sVar.j(PantryThemeKt.getLocalPantryTypography());
            x60.h hVar7 = (x60.h) sVar.j(PantryThemeKt.getLocalPantryColor());
            t tVarJ = v1.n.j(m2.f13850c, hVar7.f43905a, g0.f23254b);
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
            h hVar8 = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar8);
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
            u0 u0Var = jVar.f43957f;
            u0 u0Var2 = jVar.f43967q;
            u0 u0Var3 = jVar.f43966p;
            r9.d("Variants", null, hVar7.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar, 6, 0, 131066);
            q qVar = q.f5711a;
            t tVarD = m2.d(qVar, 1.0f);
            e eVar = i.f13807g;
            b4.j jVar2 = d.f5692j;
            i2 i2VarA = h2.a(eVar, jVar2, sVar, 6);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            t tVarC2 = a.c(tVarD, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar8);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC2, gVar4, sVar);
            d2.d dVar2 = i.f13803c;
            y yVarA2 = w.a(dVar2, iVar, sVar, 0);
            int iHashCode3 = Long.hashCode(sVar.T);
            u3.i iVarL3 = sVar.l();
            t tVarC3 = a.c(qVar, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar8);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA2, gVar, sVar);
            m3.i.C(iVarL3, gVar2, sVar);
            a0.y(iHashCode3, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC3, gVar4, sVar);
            r9.d("Subtle", null, hVar7.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var3, sVar, 6, 0, 131066);
            SubtlePantryIconButtonKt.PreviewSubtleIconButtons(sVar, 0);
            sVar.q(true);
            y yVarA3 = w.a(dVar2, iVar, sVar, 0);
            int iHashCode4 = Long.hashCode(sVar.T);
            u3.i iVarL4 = sVar.l();
            t tVarC4 = a.c(qVar, sVar);
            sVar.e0();
            if (sVar.S) {
                hVar = hVar8;
                sVar.k(hVar);
            } else {
                hVar = hVar8;
                sVar.n0();
            }
            m3.i.C(yVarA3, gVar, sVar);
            m3.i.C(iVarL4, gVar2, sVar);
            a0.y(iHashCode4, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC4, gVar4, sVar);
            h hVar9 = hVar;
            r9.d("IconOnly", null, hVar7.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var3, sVar, 6, 0, 131066);
            IconOnlyPantryIconButtonKt.PreviewIconOnlyIconButtons(sVar, 0);
            sVar.q(true);
            y yVarA4 = w.a(dVar2, iVar, sVar, 0);
            int iHashCode5 = Long.hashCode(sVar.T);
            u3.i iVarL5 = sVar.l();
            t tVarC5 = a.c(qVar, sVar);
            sVar.e0();
            if (sVar.S) {
                hVar2 = hVar9;
                sVar.k(hVar2);
            } else {
                hVar2 = hVar9;
                sVar.n0();
            }
            m3.i.C(yVarA4, gVar, sVar);
            m3.i.C(iVarL5, gVar2, sVar);
            a0.y(iHashCode5, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC5, gVar4, sVar);
            h hVar10 = hVar2;
            r9.d("Accent", null, hVar7.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var3, sVar, 6, 0, 131066);
            AccentPantryIconButtonKt.PreviewAccentIconButtons(sVar, 0);
            sVar.q(true);
            sVar.q(true);
            s0.g(null, 0.0f, hVar7.f43922i0, sVar, 0, 3);
            r9.d("Icons & States", null, hVar7.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar.f43957f, sVar, 6, 0, 131066);
            r9.d("Disabled", null, hVar7.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var3, sVar, 6, 0, 131066);
            y yVarA5 = w.a(i.g(f12), iVar, sVar, 0);
            int iHashCode6 = Long.hashCode(sVar.T);
            u3.i iVarL6 = sVar.l();
            t tVarC6 = a.c(qVar, sVar);
            sVar.e0();
            if (sVar.S) {
                hVar3 = hVar10;
                sVar.k(hVar3);
            } else {
                hVar3 = hVar10;
                sVar.n0();
            }
            m3.i.C(yVarA5, gVar, sVar);
            m3.i.C(iVarL6, gVar2, sVar);
            a0.y(iHashCode6, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC6, gVar4, sVar);
            h hVar11 = hVar3;
            r9.d("Disabled Accents", null, hVar7.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var2, sVar, 6, 0, 131066);
            i2 i2VarA2 = h2.a(i.g(f12), jVar2, sVar, 0);
            int iHashCode7 = Long.hashCode(sVar.T);
            u3.i iVarL7 = sVar.l();
            t tVarC7 = a.c(qVar, sVar);
            sVar.e0();
            if (sVar.S) {
                hVar4 = hVar11;
                sVar.k(hVar4);
            } else {
                hVar4 = hVar11;
                sVar.n0();
            }
            m3.i.C(i2VarA2, gVar, sVar);
            m3.i.C(iVarL7, gVar2, sVar);
            a0.y(iHashCode7, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC7, gVar4, sVar);
            k2 k2Var = k2.f13824a;
            t tVarA = k2Var.a(1.0f, qVar, true);
            Object objM = sVar.M();
            f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = new p9.a(21);
                sVar.k0(objM);
            }
            ComposableSingletons$DemoPantryIconButtonKt composableSingletons$DemoPantryIconButtonKt = ComposableSingletons$DemoPantryIconButtonKt.INSTANCE;
            h hVar12 = hVar4;
            AccentPantryIconButtonKt.MediumAccentPantryIconButton((Function0) objM, tVarA, null, false, false, composableSingletons$DemoPantryIconButtonKt.getLambda$1357301597$app_release(), sVar, 199686, 20);
            t tVarA2 = k2Var.a(1.0f, qVar, true);
            Object objM2 = sVar.M();
            if (objM2 == fVar) {
                objM2 = new q60.a(3);
                sVar.k0(objM2);
            }
            AccentPantryIconButtonKt.SmallAccentPantryIconButton((Function0) objM2, tVarA2, null, false, false, composableSingletons$DemoPantryIconButtonKt.getLambda$2058163757$app_release(), sVar, 199686, 20);
            t tVarA3 = k2Var.a(1.0f, qVar, true);
            Object objM3 = sVar.M();
            if (objM3 == fVar) {
                c3 = 4;
                objM3 = new q60.a(4);
                sVar.k0(objM3);
            } else {
                c3 = 4;
            }
            AccentPantryIconButtonKt.TinyAccentPantryIconButton((Function0) objM3, tVarA3, null, false, false, composableSingletons$DemoPantryIconButtonKt.getLambda$1797261490$app_release(), sVar, 199686, 20);
            sVar.q(true);
            r9.d("Disabled Icon Only", null, hVar7.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var2, sVar, 6, 0, 131066);
            i2 i2VarA3 = h2.a(i.g(f12), jVar2, sVar, 0);
            int iHashCode8 = Long.hashCode(sVar.T);
            u3.i iVarL8 = sVar.l();
            t tVarC8 = a.c(qVar, sVar);
            sVar.e0();
            if (sVar.S) {
                hVar5 = hVar12;
                sVar.k(hVar5);
            } else {
                hVar5 = hVar12;
                sVar.n0();
            }
            m3.i.C(i2VarA3, gVar, sVar);
            m3.i.C(iVarL8, gVar2, sVar);
            a0.y(iHashCode8, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC8, gVar4, sVar);
            t tVarA4 = k2Var.a(1.0f, qVar, true);
            Object objM4 = sVar.M();
            if (objM4 == fVar) {
                objM4 = new q60.a(5);
                sVar.k0(objM4);
            }
            h hVar13 = hVar5;
            IconOnlyPantryIconButtonKt.MediumIconOnlyPantryIconButton((Function0) objM4, tVarA4, null, false, false, composableSingletons$DemoPantryIconButtonKt.getLambda$1562492331$app_release(), sVar, 199686, 20);
            t tVarA5 = k2Var.a(1.0f, qVar, true);
            Object objM5 = sVar.M();
            if (objM5 == fVar) {
                objM5 = new p9.a(22);
                sVar.k0(objM5);
            }
            IconOnlyPantryIconButtonKt.SmallIconOnlyPantryIconButton((Function0) objM5, tVarA5, null, false, false, composableSingletons$DemoPantryIconButtonKt.m813getLambda$1971051397$app_release(), sVar, 199686, 20);
            t tVarA6 = k2Var.a(1.0f, qVar, true);
            Object objM6 = sVar.M();
            if (objM6 == fVar) {
                objM6 = new p9.a(23);
                sVar.k0(objM6);
            }
            IconOnlyPantryIconButtonKt.TinyIconOnlyPantryIconButton((Function0) objM6, tVarA6, null, false, false, composableSingletons$DemoPantryIconButtonKt.getLambda$1266699392$app_release(), sVar, 199686, 20);
            sVar.q(true);
            sVar.q(true);
            r9.d("Loading", null, hVar7.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var3, sVar, 6, 0, 131066);
            sVar = sVar;
            i2 i2VarA4 = h2.a(i.g(f12), jVar2, sVar, 0);
            int iHashCode9 = Long.hashCode(sVar.T);
            u3.i iVarL9 = sVar.l();
            t tVarC9 = a.c(qVar, sVar);
            sVar.e0();
            if (sVar.S) {
                hVar6 = hVar13;
                sVar.k(hVar6);
            } else {
                hVar6 = hVar13;
                sVar.n0();
            }
            m3.i.C(i2VarA4, gVar, sVar);
            m3.i.C(iVarL9, gVar2, sVar);
            a0.y(iHashCode9, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC9, gVar4, sVar);
            t tVarA7 = k2Var.a(1.0f, qVar, true);
            Object objM7 = sVar.M();
            if (objM7 == fVar) {
                objM7 = new p9.a(24);
                sVar.k0(objM7);
            }
            SubtlePantryIconButtonKt.MediumSubtlePantryIconButton((Function0) objM7, tVarA7, null, false, true, composableSingletons$DemoPantryIconButtonKt.getLambda$1357835513$app_release(), sVar, 221190, 12);
            t tVarA8 = k2Var.a(1.0f, qVar, true);
            Object objM8 = sVar.M();
            if (objM8 == fVar) {
                objM8 = new p9.a(25);
                sVar.k0(objM8);
            }
            SubtlePantryIconButtonKt.SmallSubtlePantryIconButton((Function0) objM8, tVarA8, null, false, true, composableSingletons$DemoPantryIconButtonKt.m809getLambda$1084649527$app_release(), sVar, 221190, 12);
            t tVarA9 = k2Var.a(1.0f, qVar, true);
            Object objM9 = sVar.M();
            if (objM9 == fVar) {
                objM9 = new p9.a(26);
                sVar.k0(objM9);
            }
            SubtlePantryIconButtonKt.TinySubtlePantryIconButton((Function0) objM9, tVarA9, null, false, true, composableSingletons$DemoPantryIconButtonKt.getLambda$1045159310$app_release(), sVar, 221190, 12);
            sVar.q(true);
            i2 i2VarA5 = h2.a(i.g(f12), jVar2, sVar, 0);
            int iHashCode10 = Long.hashCode(sVar.T);
            u3.i iVarL10 = sVar.l();
            t tVarC10 = a.c(qVar, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar6);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA5, gVar, sVar);
            m3.i.C(iVarL10, gVar2, sVar);
            a0.y(iHashCode10, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC10, gVar4, sVar);
            t tVarA10 = k2Var.a(1.0f, qVar, true);
            Object objM10 = sVar.M();
            if (objM10 == fVar) {
                objM10 = new p9.a(27);
                sVar.k0(objM10);
            }
            IconOnlyPantryIconButtonKt.MediumIconOnlyPantryIconButton((Function0) objM10, tVarA10, null, false, true, composableSingletons$DemoPantryIconButtonKt.getLambda$1749725888$app_release(), sVar, 221190, 12);
            t tVarA11 = k2Var.a(1.0f, qVar, true);
            Object objM11 = sVar.M();
            if (objM11 == fVar) {
                objM11 = new p9.a(28);
                sVar.k0(objM11);
            }
            IconOnlyPantryIconButtonKt.SmallIconOnlyPantryIconButton((Function0) objM11, tVarA11, null, false, true, composableSingletons$DemoPantryIconButtonKt.m814getLambda$426253936$app_release(), sVar, 221190, 12);
            t tVarA12 = k2Var.a(1.0f, qVar, true);
            Object objM12 = sVar.M();
            if (objM12 == fVar) {
                objM12 = new p9.a(29);
                sVar.k0(objM12);
            }
            IconOnlyPantryIconButtonKt.TinyIconOnlyPantryIconButton((Function0) objM12, tVarA12, null, false, true, composableSingletons$DemoPantryIconButtonKt.getLambda$1915605525$app_release(), sVar, 221190, 12);
            sVar.q(true);
            i2 i2VarA6 = h2.a(i.g(f12), jVar2, sVar, 0);
            int iHashCode11 = Long.hashCode(sVar.T);
            u3.i iVarL11 = sVar.l();
            t tVarC11 = a.c(qVar, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar6);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA6, gVar, sVar);
            m3.i.C(iVarL11, gVar2, sVar);
            a0.y(iHashCode11, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC11, gVar4, sVar);
            t tVarA13 = k2Var.a(1.0f, qVar, true);
            Object objM13 = sVar.M();
            if (objM13 == fVar) {
                objM13 = new q60.a(0);
                sVar.k0(objM13);
            }
            AccentPantryIconButtonKt.MediumAccentPantryIconButton((Function0) objM13, tVarA13, null, false, true, composableSingletons$DemoPantryIconButtonKt.m811getLambda$1862500742$app_release(), sVar, 221190, 12);
            t tVarA14 = k2Var.a(1.0f, qVar, true);
            Object objM14 = sVar.M();
            if (objM14 == fVar) {
                objM14 = new q60.a(1);
                sVar.k0(objM14);
            }
            AccentPantryIconButtonKt.SmallAccentPantryIconButton((Function0) objM14, tVarA14, null, false, true, composableSingletons$DemoPantryIconButtonKt.m808getLambda$10018486$app_release(), sVar, 221190, 12);
            t tVarA15 = k2Var.a(1.0f, qVar, true);
            Object objM15 = sVar.M();
            if (objM15 == fVar) {
                objM15 = new q60.a(2);
                sVar.k0(objM15);
            }
            AccentPantryIconButtonKt.TinyAccentPantryIconButton((Function0) objM15, tVarA15, null, false, true, composableSingletons$DemoPantryIconButtonKt.getLambda$2119790351$app_release(), sVar, 221190, 12);
            sVar.q(true);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new on.j(i11, 4);
        }
    }
}
