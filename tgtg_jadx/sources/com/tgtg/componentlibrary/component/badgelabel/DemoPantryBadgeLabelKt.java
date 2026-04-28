package com.tgtg.componentlibrary.component.badgelabel;

import b4.a;
import b4.d;
import b4.q;
import b4.t;
import b5.h;
import com.tgtg.componentlibrary.component.badgelabel.variant.AccentPantryBadgeLabelKt;
import com.tgtg.componentlibrary.component.badgelabel.variant.AttentionPantryBadgeLabelKt;
import com.tgtg.componentlibrary.component.badgelabel.variant.BasePantryBadgeLabelKt;
import com.tgtg.componentlibrary.component.badgelabel.variant.NegativePantryBadgeLabelKt;
import com.tgtg.componentlibrary.component.badgelabel.variant.PositivePantryBadgeLabelKt;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import d2.b;
import d2.c;
import d2.g;
import d2.h2;
import d2.i;
import d2.i2;
import d2.w;
import d2.y;
import e0.f;
import g3.r9;
import g3.s0;
import i4.g0;
import i4.r0;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
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
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"", "DemoPantryBadgeLabel", "(Lm3/n;I)V", "app_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDemoPantryBadgeLabel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DemoPantryBadgeLabel.kt\ncom/tgtg/componentlibrary/component/badgelabel/DemoPantryBadgeLabelKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,193:1\n75#2:194\n75#2:195\n75#2:196\n87#3:197\n85#3,8:198\n87#3:228\n83#3,10:229\n94#3:264\n87#3:265\n83#3,10:266\n94#3:301\n87#3:302\n83#3,10:303\n94#3:338\n87#3:339\n83#3,10:340\n94#3:375\n87#3:376\n83#3,10:377\n94#3:412\n87#3:413\n83#3,10:414\n94#3:523\n94#3:527\n81#4,6:206\n88#4,6:221\n81#4,6:239\n88#4,6:254\n96#4:263\n81#4,6:276\n88#4,6:291\n96#4:300\n81#4,6:313\n88#4,6:328\n96#4:337\n81#4,6:350\n88#4,6:365\n96#4:374\n81#4,6:387\n88#4,6:402\n96#4:411\n81#4,6:424\n88#4,6:439\n81#4,6:457\n88#4,6:472\n96#4:481\n81#4,6:494\n88#4,6:509\n96#4:518\n96#4:522\n96#4:526\n391#5,9:212\n400#5:227\n391#5,9:245\n400#5,3:260\n391#5,9:282\n400#5,3:297\n391#5,9:319\n400#5,3:334\n391#5,9:356\n400#5,3:371\n391#5,9:393\n400#5,3:408\n391#5,9:430\n400#5:445\n391#5,9:463\n400#5,3:478\n391#5,9:500\n400#5,3:515\n401#5,2:520\n401#5,2:524\n99#6:446\n95#6,10:447\n106#6:482\n99#6:483\n95#6,10:484\n106#6:519\n*S KotlinDebug\n*F\n+ 1 DemoPantryBadgeLabel.kt\ncom/tgtg/componentlibrary/component/badgelabel/DemoPantryBadgeLabelKt\n*L\n41#1:194\n42#1:195\n43#1:196\n45#1:197\n45#1:198,8\n54#1:228\n54#1:229,10\n54#1:264\n59#1:265\n59#1:266,10\n59#1:301\n64#1:302\n64#1:303,10\n64#1:338\n69#1:339\n69#1:340,10\n69#1:375\n74#1:376\n74#1:377,10\n74#1:412\n81#1:413\n81#1:414,10\n81#1:523\n45#1:527\n45#1:206,6\n45#1:221,6\n54#1:239,6\n54#1:254,6\n54#1:263\n59#1:276,6\n59#1:291,6\n59#1:300\n64#1:313,6\n64#1:328,6\n64#1:337\n69#1:350,6\n69#1:365,6\n69#1:374\n74#1:387,6\n74#1:402,6\n74#1:411\n81#1:424,6\n81#1:439,6\n87#1:457,6\n87#1:472,6\n87#1:481\n117#1:494,6\n117#1:509,6\n117#1:518\n81#1:522\n45#1:526\n45#1:212,9\n45#1:227\n54#1:245,9\n54#1:260,3\n59#1:282,9\n59#1:297,3\n64#1:319,9\n64#1:334,3\n69#1:356,9\n69#1:371,3\n74#1:393,9\n74#1:408,3\n81#1:430,9\n81#1:445\n87#1:463,9\n87#1:478,3\n117#1:500,9\n117#1:515,3\n81#1:520,2\n45#1:524,2\n87#1:446\n87#1:447,10\n87#1:482\n117#1:483\n117#1:484,10\n117#1:519\n*E\n"})
public final class DemoPantryBadgeLabelKt {
    public static final void DemoPantryBadgeLabel(@Nullable n nVar, int i11) {
        h hVar;
        h hVar2;
        s sVar = (s) nVar;
        sVar.c0(1278321505);
        if (sVar.R(i11 & 1, i11 != 0)) {
            m mVar = (m) sVar.j(PantryThemeKt.getLocalPantrySpacing());
            j jVar = (j) sVar.j(PantryThemeKt.getLocalPantryTypography());
            x60.h hVar3 = (x60.h) sVar.j(PantryThemeKt.getLocalPantryColor());
            long j9 = hVar3.f43905a;
            r0 r0Var = g0.f23254b;
            q qVar = q.f5711a;
            t tVarJ = v1.n.j(qVar, j9, r0Var);
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
            u0 u0Var = jVar.f43957f;
            u0 u0Var2 = jVar.f43959h;
            r9.d("Variants", null, hVar3.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar, 6, 0, 131066);
            y yVarA2 = w.a(i.g(f12), iVar, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
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
            AccentPantryBadgeLabelKt.MediumAccentPantryBadgeLabel("Medium Accent", null, null, null, null, sVar, 6, 30);
            AccentPantryBadgeLabelKt.SmallAccentPantryBadgeLabel("Small Accent", null, null, null, null, sVar, 6, 30);
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
            AttentionPantryBadgeLabelKt.MediumAttentionPantryBadgeLabel("Medium Attention", null, null, null, null, sVar, 6, 30);
            AttentionPantryBadgeLabelKt.SmallAttentionPantryBadgeLabel("Small Attention", null, null, null, null, sVar, 6, 30);
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
            BasePantryBadgeLabelKt.MediumBasePantryBadgeLabel("Medium Base", null, null, null, null, sVar, 6, 30);
            BasePantryBadgeLabelKt.SmallBasePantryBadgeLabel("Small Base", null, null, null, null, sVar, 6, 30);
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
            NegativePantryBadgeLabelKt.MediumNegativePantryBadgeLabel("Medium Negative", null, null, null, null, sVar, 6, 30);
            NegativePantryBadgeLabelKt.SmallNegativePantryBadgeLabel("Small Negative", null, null, null, null, sVar, 6, 30);
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
            PositivePantryBadgeLabelKt.MediumPositivePantryBadgeLabel("Medium Positive", null, null, null, null, sVar, 6, 30);
            PositivePantryBadgeLabelKt.SmallPositivePantryBadgeLabel("Small Positive", null, null, null, null, sVar, 6, 30);
            sVar.q(true);
            s0.g(null, 0.0f, hVar3.f43922i0, sVar, 0, 3);
            y yVarA7 = w.a(i.g(f12), iVar, sVar, 0);
            int iHashCode7 = Long.hashCode(sVar.T);
            u3.i iVarL7 = sVar.l();
            t tVarC7 = a.c(qVar, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA7, gVar, sVar);
            m3.i.C(iVarL7, gVar2, sVar);
            a0.y(iHashCode7, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC7, gVar4, sVar);
            h hVar5 = hVar;
            r9.d("Leading icon Only", null, hVar3.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var2, sVar, 6, 0, 131066);
            b4.j jVar2 = d.f5693k;
            i2 i2VarA = h2.a(i.g(f12), jVar2, sVar, 48);
            int iHashCode8 = Long.hashCode(sVar.T);
            u3.i iVarL8 = sVar.l();
            t tVarC8 = a.c(qVar, sVar);
            sVar.e0();
            if (sVar.S) {
                hVar2 = hVar5;
                sVar.k(hVar2);
            } else {
                hVar2 = hVar5;
                sVar.n0();
            }
            m3.i.C(i2VarA, gVar, sVar);
            m3.i.C(iVarL8, gVar2, sVar);
            a0.y(iHashCode8, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC8, gVar4, sVar);
            ComposableSingletons$DemoPantryBadgeLabelKt composableSingletons$DemoPantryBadgeLabelKt = ComposableSingletons$DemoPantryBadgeLabelKt.INSTANCE;
            AccentPantryBadgeLabelKt.MediumAccentPantryBadgeLabel("Medium Accent", null, null, composableSingletons$DemoPantryBadgeLabelKt.getLambda$2055100728$app_release(), null, sVar, 3078, 22);
            PositivePantryBadgeLabelKt.SmallPositivePantryBadgeLabel("Small Positive", null, null, composableSingletons$DemoPantryBadgeLabelKt.getLambda$489343029$app_release(), null, sVar, 3078, 22);
            sVar.q(true);
            h hVar6 = hVar2;
            r9.d("Trailing icon Only", null, hVar3.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var2, sVar, 6, 0, 131066);
            sVar = sVar;
            i2 i2VarA2 = h2.a(i.g(f12), jVar2, sVar, 48);
            int iHashCode9 = Long.hashCode(sVar.T);
            u3.i iVarL9 = sVar.l();
            t tVarC9 = a.c(qVar, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar6);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA2, gVar, sVar);
            m3.i.C(iVarL9, gVar2, sVar);
            a0.y(iHashCode9, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC9, gVar4, sVar);
            NegativePantryBadgeLabelKt.MediumNegativePantryBadgeLabel("Medium Negative", null, null, null, composableSingletons$DemoPantryBadgeLabelKt.getLambda$1276430261$app_release(), sVar, 24582, 14);
            BasePantryBadgeLabelKt.SmallBasePantryBadgeLabel("Small Base", null, null, null, composableSingletons$DemoPantryBadgeLabelKt.getLambda$464733959$app_release(), sVar, 24582, 14);
            f.D(sVar, true, true, true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new c60.b(i11, 2);
        }
    }
}
