package com.tgtg.componentlibrary.theme.demo;

import b4.a;
import b4.d;
import b4.q;
import b4.t;
import b5.g;
import b5.r2;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import com.tgtg.componentlibrary.theme.demo.DemoSpacingKt;
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
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import m3.n;
import m3.s;
import m3.w1;
import org.jetbrains.annotations.Nullable;
import r8.k;
import u3.e;
import x60.h;
import x60.j;
import x60.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"", "DemoSpacing", "(Lm3/n;I)V", "app_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDemoSpacing.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DemoSpacing.kt\ncom/tgtg/componentlibrary/theme/demo/DemoSpacingKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,113:1\n75#2:114\n75#2:115\n75#2:116\n75#2:217\n87#3:117\n85#3,8:118\n94#3:151\n87#3:152\n83#3,10:153\n94#3:188\n87#3:218\n84#3,9:219\n94#3:253\n81#4,6:126\n88#4,6:141\n96#4:150\n81#4,6:163\n88#4,6:178\n96#4:187\n81#4,6:195\n88#4,6:210\n81#4,6:228\n88#4,6:243\n96#4:252\n96#4:256\n391#5,9:132\n400#5,3:147\n391#5,9:169\n400#5,3:184\n391#5,9:201\n400#5:216\n391#5,9:234\n400#5,3:249\n401#5,2:254\n99#6,6:189\n106#6:257\n*S KotlinDebug\n*F\n+ 1 DemoSpacing.kt\ncom/tgtg/componentlibrary/theme/demo/DemoSpacingKt\n*L\n26#1:114\n27#1:115\n28#1:116\n47#1:217\n62#1:117\n62#1:118,8\n62#1:151\n32#1:152\n32#1:153,10\n32#1:188\n51#1:218\n51#1:219,9\n51#1:253\n62#1:126,6\n62#1:141,6\n62#1:150\n32#1:163,6\n32#1:178,6\n32#1:187\n40#1:195,6\n40#1:210,6\n51#1:228,6\n51#1:243,6\n51#1:252\n40#1:256\n62#1:132,9\n62#1:147,3\n32#1:169,9\n32#1:184,3\n40#1:201,9\n40#1:216\n51#1:234,9\n51#1:249,3\n40#1:254,2\n40#1:189,6\n40#1:257\n*E\n"})
public final class DemoSpacingKt {
    public static final void DemoSpacing(@Nullable n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.c0(-1859972785);
        final int i12 = 0;
        final int i13 = 1;
        if (sVar.R(i11 & 1, i11 != 0)) {
            final m mVar = (m) sVar.j(PantryThemeKt.getLocalPantrySpacing());
            final h hVar = (h) sVar.j(PantryThemeKt.getLocalPantryColor());
            final j jVar = (j) sVar.j(PantryThemeKt.getLocalPantryTypography());
            t tVarD = m2.d(v1.n.r(c.z(v1.n.j(q.f5711a, hVar.f43905a, g0.f23254b), mVar.f44015k), v1.n.q(sVar), true), 1.0f);
            b bVar = i.f13801a;
            y yVarA = w.a(i.g(mVar.f44007c), d.f5694m, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = a.c(tVarD, sVar);
            b5.j.R.getClass();
            b5.h hVar2 = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar2);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            a(mVar, jVar, hVar, "Wrapper spacings", e.e(-405502688, sVar, new Function2() { // from class: z60.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i14 = i12;
                    n nVar2 = (n) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    switch (i14) {
                        case 0:
                            s sVar2 = (s) nVar2;
                            if (sVar2.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                m mVar2 = mVar;
                                float f11 = mVar2.f44011g;
                                h hVar3 = hVar;
                                j jVar2 = jVar;
                                DemoSpacingKt.b(mVar2, hVar3, jVar2, "wrapperVertical", f11, sVar2);
                                DemoSpacingKt.b(mVar2, hVar3, jVar2, "wrapperVerticalLarge", mVar2.f44012h, sVar2);
                                DemoSpacingKt.b(mVar2, hVar3, jVar2, "wrapperHorizontal", mVar2.f44010f, sVar2);
                            } else {
                                sVar2.U();
                            }
                            break;
                        case 1:
                            s sVar3 = (s) nVar2;
                            if (sVar3.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                m mVar3 = mVar;
                                float f12 = mVar3.f44009e;
                                h hVar4 = hVar;
                                j jVar3 = jVar;
                                DemoSpacingKt.b(mVar3, hVar4, jVar3, "verticalBetweenCards", f12, sVar3);
                                DemoSpacingKt.b(mVar3, hVar4, jVar3, "verticalSectionContent", mVar3.f44008d, sVar3);
                                DemoSpacingKt.b(mVar3, hVar4, jVar3, "verticalBetweenSections", mVar3.f44007c, sVar3);
                            } else {
                                sVar3.U();
                            }
                            break;
                        case 2:
                            s sVar4 = (s) nVar2;
                            if (sVar4.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                m mVar4 = mVar;
                                float f13 = mVar4.f44006b;
                                h hVar5 = hVar;
                                j jVar4 = jVar;
                                DemoSpacingKt.b(mVar4, hVar5, jVar4, "horizontalBetweenTags", f13, sVar4);
                                DemoSpacingKt.b(mVar4, hVar5, jVar4, "horizontalBetweenCards", mVar4.f44005a, sVar4);
                            } else {
                                sVar4.U();
                            }
                            break;
                        default:
                            s sVar5 = (s) nVar2;
                            if (sVar5.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                m mVar5 = mVar;
                                float f14 = mVar5.f44019p;
                                h hVar6 = hVar;
                                j jVar5 = jVar;
                                DemoSpacingKt.b(mVar5, hVar6, jVar5, "neutralNone", f14, sVar5);
                                DemoSpacingKt.b(mVar5, hVar6, jVar5, "neutralXxsmall", mVar5.f44020q, sVar5);
                                DemoSpacingKt.b(mVar5, hVar6, jVar5, "neutralXsmall", mVar5.f44016m, sVar5);
                                DemoSpacingKt.b(mVar5, hVar6, jVar5, "neutralSmall", mVar5.l, sVar5);
                                DemoSpacingKt.b(mVar5, hVar6, jVar5, "neutralMedium", mVar5.f44017n, sVar5);
                                DemoSpacingKt.b(mVar5, hVar6, jVar5, "neutralLarge", mVar5.f44015k, sVar5);
                                DemoSpacingKt.b(mVar5, hVar6, jVar5, "neutralXlarge", mVar5.f44014j, sVar5);
                                DemoSpacingKt.b(mVar5, hVar6, jVar5, "neutralXxlarge", mVar5.f44021r, sVar5);
                                DemoSpacingKt.b(mVar5, hVar6, jVar5, "neutralHuge", mVar5.f44013i, sVar5);
                                DemoSpacingKt.b(mVar5, hVar6, jVar5, "neutralGigantic", mVar5.f44018o, sVar5);
                            } else {
                                sVar5.U();
                            }
                            break;
                    }
                    return Unit.f26487a;
                }
            }), sVar);
            a(mVar, jVar, hVar, "Vertical spacings", e.e(-162976759, sVar, new Function2() { // from class: z60.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i14 = i13;
                    n nVar2 = (n) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    switch (i14) {
                        case 0:
                            s sVar2 = (s) nVar2;
                            if (sVar2.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                m mVar2 = mVar;
                                float f11 = mVar2.f44011g;
                                h hVar3 = hVar;
                                j jVar2 = jVar;
                                DemoSpacingKt.b(mVar2, hVar3, jVar2, "wrapperVertical", f11, sVar2);
                                DemoSpacingKt.b(mVar2, hVar3, jVar2, "wrapperVerticalLarge", mVar2.f44012h, sVar2);
                                DemoSpacingKt.b(mVar2, hVar3, jVar2, "wrapperHorizontal", mVar2.f44010f, sVar2);
                            } else {
                                sVar2.U();
                            }
                            break;
                        case 1:
                            s sVar3 = (s) nVar2;
                            if (sVar3.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                m mVar3 = mVar;
                                float f12 = mVar3.f44009e;
                                h hVar4 = hVar;
                                j jVar3 = jVar;
                                DemoSpacingKt.b(mVar3, hVar4, jVar3, "verticalBetweenCards", f12, sVar3);
                                DemoSpacingKt.b(mVar3, hVar4, jVar3, "verticalSectionContent", mVar3.f44008d, sVar3);
                                DemoSpacingKt.b(mVar3, hVar4, jVar3, "verticalBetweenSections", mVar3.f44007c, sVar3);
                            } else {
                                sVar3.U();
                            }
                            break;
                        case 2:
                            s sVar4 = (s) nVar2;
                            if (sVar4.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                m mVar4 = mVar;
                                float f13 = mVar4.f44006b;
                                h hVar5 = hVar;
                                j jVar4 = jVar;
                                DemoSpacingKt.b(mVar4, hVar5, jVar4, "horizontalBetweenTags", f13, sVar4);
                                DemoSpacingKt.b(mVar4, hVar5, jVar4, "horizontalBetweenCards", mVar4.f44005a, sVar4);
                            } else {
                                sVar4.U();
                            }
                            break;
                        default:
                            s sVar5 = (s) nVar2;
                            if (sVar5.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                m mVar5 = mVar;
                                float f14 = mVar5.f44019p;
                                h hVar6 = hVar;
                                j jVar5 = jVar;
                                DemoSpacingKt.b(mVar5, hVar6, jVar5, "neutralNone", f14, sVar5);
                                DemoSpacingKt.b(mVar5, hVar6, jVar5, "neutralXxsmall", mVar5.f44020q, sVar5);
                                DemoSpacingKt.b(mVar5, hVar6, jVar5, "neutralXsmall", mVar5.f44016m, sVar5);
                                DemoSpacingKt.b(mVar5, hVar6, jVar5, "neutralSmall", mVar5.l, sVar5);
                                DemoSpacingKt.b(mVar5, hVar6, jVar5, "neutralMedium", mVar5.f44017n, sVar5);
                                DemoSpacingKt.b(mVar5, hVar6, jVar5, "neutralLarge", mVar5.f44015k, sVar5);
                                DemoSpacingKt.b(mVar5, hVar6, jVar5, "neutralXlarge", mVar5.f44014j, sVar5);
                                DemoSpacingKt.b(mVar5, hVar6, jVar5, "neutralXxlarge", mVar5.f44021r, sVar5);
                                DemoSpacingKt.b(mVar5, hVar6, jVar5, "neutralHuge", mVar5.f44013i, sVar5);
                                DemoSpacingKt.b(mVar5, hVar6, jVar5, "neutralGigantic", mVar5.f44018o, sVar5);
                            } else {
                                sVar5.U();
                            }
                            break;
                    }
                    return Unit.f26487a;
                }
            }), sVar);
            final int i14 = 2;
            a(mVar, jVar, hVar, "Horizontal spacings", e.e(-2101516056, sVar, new Function2() { // from class: z60.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i142 = i14;
                    n nVar2 = (n) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    switch (i142) {
                        case 0:
                            s sVar2 = (s) nVar2;
                            if (sVar2.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                m mVar2 = mVar;
                                float f11 = mVar2.f44011g;
                                h hVar3 = hVar;
                                j jVar2 = jVar;
                                DemoSpacingKt.b(mVar2, hVar3, jVar2, "wrapperVertical", f11, sVar2);
                                DemoSpacingKt.b(mVar2, hVar3, jVar2, "wrapperVerticalLarge", mVar2.f44012h, sVar2);
                                DemoSpacingKt.b(mVar2, hVar3, jVar2, "wrapperHorizontal", mVar2.f44010f, sVar2);
                            } else {
                                sVar2.U();
                            }
                            break;
                        case 1:
                            s sVar3 = (s) nVar2;
                            if (sVar3.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                m mVar3 = mVar;
                                float f12 = mVar3.f44009e;
                                h hVar4 = hVar;
                                j jVar3 = jVar;
                                DemoSpacingKt.b(mVar3, hVar4, jVar3, "verticalBetweenCards", f12, sVar3);
                                DemoSpacingKt.b(mVar3, hVar4, jVar3, "verticalSectionContent", mVar3.f44008d, sVar3);
                                DemoSpacingKt.b(mVar3, hVar4, jVar3, "verticalBetweenSections", mVar3.f44007c, sVar3);
                            } else {
                                sVar3.U();
                            }
                            break;
                        case 2:
                            s sVar4 = (s) nVar2;
                            if (sVar4.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                m mVar4 = mVar;
                                float f13 = mVar4.f44006b;
                                h hVar5 = hVar;
                                j jVar4 = jVar;
                                DemoSpacingKt.b(mVar4, hVar5, jVar4, "horizontalBetweenTags", f13, sVar4);
                                DemoSpacingKt.b(mVar4, hVar5, jVar4, "horizontalBetweenCards", mVar4.f44005a, sVar4);
                            } else {
                                sVar4.U();
                            }
                            break;
                        default:
                            s sVar5 = (s) nVar2;
                            if (sVar5.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                m mVar5 = mVar;
                                float f14 = mVar5.f44019p;
                                h hVar6 = hVar;
                                j jVar5 = jVar;
                                DemoSpacingKt.b(mVar5, hVar6, jVar5, "neutralNone", f14, sVar5);
                                DemoSpacingKt.b(mVar5, hVar6, jVar5, "neutralXxsmall", mVar5.f44020q, sVar5);
                                DemoSpacingKt.b(mVar5, hVar6, jVar5, "neutralXsmall", mVar5.f44016m, sVar5);
                                DemoSpacingKt.b(mVar5, hVar6, jVar5, "neutralSmall", mVar5.l, sVar5);
                                DemoSpacingKt.b(mVar5, hVar6, jVar5, "neutralMedium", mVar5.f44017n, sVar5);
                                DemoSpacingKt.b(mVar5, hVar6, jVar5, "neutralLarge", mVar5.f44015k, sVar5);
                                DemoSpacingKt.b(mVar5, hVar6, jVar5, "neutralXlarge", mVar5.f44014j, sVar5);
                                DemoSpacingKt.b(mVar5, hVar6, jVar5, "neutralXxlarge", mVar5.f44021r, sVar5);
                                DemoSpacingKt.b(mVar5, hVar6, jVar5, "neutralHuge", mVar5.f44013i, sVar5);
                                DemoSpacingKt.b(mVar5, hVar6, jVar5, "neutralGigantic", mVar5.f44018o, sVar5);
                            } else {
                                sVar5.U();
                            }
                            break;
                    }
                    return Unit.f26487a;
                }
            }), sVar);
            final int i15 = 3;
            a(mVar, jVar, hVar, "Neutral spacings", e.e(254911943, sVar, new Function2() { // from class: z60.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i142 = i15;
                    n nVar2 = (n) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    switch (i142) {
                        case 0:
                            s sVar2 = (s) nVar2;
                            if (sVar2.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                m mVar2 = mVar;
                                float f11 = mVar2.f44011g;
                                h hVar3 = hVar;
                                j jVar2 = jVar;
                                DemoSpacingKt.b(mVar2, hVar3, jVar2, "wrapperVertical", f11, sVar2);
                                DemoSpacingKt.b(mVar2, hVar3, jVar2, "wrapperVerticalLarge", mVar2.f44012h, sVar2);
                                DemoSpacingKt.b(mVar2, hVar3, jVar2, "wrapperHorizontal", mVar2.f44010f, sVar2);
                            } else {
                                sVar2.U();
                            }
                            break;
                        case 1:
                            s sVar3 = (s) nVar2;
                            if (sVar3.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                m mVar3 = mVar;
                                float f12 = mVar3.f44009e;
                                h hVar4 = hVar;
                                j jVar3 = jVar;
                                DemoSpacingKt.b(mVar3, hVar4, jVar3, "verticalBetweenCards", f12, sVar3);
                                DemoSpacingKt.b(mVar3, hVar4, jVar3, "verticalSectionContent", mVar3.f44008d, sVar3);
                                DemoSpacingKt.b(mVar3, hVar4, jVar3, "verticalBetweenSections", mVar3.f44007c, sVar3);
                            } else {
                                sVar3.U();
                            }
                            break;
                        case 2:
                            s sVar4 = (s) nVar2;
                            if (sVar4.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                m mVar4 = mVar;
                                float f13 = mVar4.f44006b;
                                h hVar5 = hVar;
                                j jVar4 = jVar;
                                DemoSpacingKt.b(mVar4, hVar5, jVar4, "horizontalBetweenTags", f13, sVar4);
                                DemoSpacingKt.b(mVar4, hVar5, jVar4, "horizontalBetweenCards", mVar4.f44005a, sVar4);
                            } else {
                                sVar4.U();
                            }
                            break;
                        default:
                            s sVar5 = (s) nVar2;
                            if (sVar5.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                m mVar5 = mVar;
                                float f14 = mVar5.f44019p;
                                h hVar6 = hVar;
                                j jVar5 = jVar;
                                DemoSpacingKt.b(mVar5, hVar6, jVar5, "neutralNone", f14, sVar5);
                                DemoSpacingKt.b(mVar5, hVar6, jVar5, "neutralXxsmall", mVar5.f44020q, sVar5);
                                DemoSpacingKt.b(mVar5, hVar6, jVar5, "neutralXsmall", mVar5.f44016m, sVar5);
                                DemoSpacingKt.b(mVar5, hVar6, jVar5, "neutralSmall", mVar5.l, sVar5);
                                DemoSpacingKt.b(mVar5, hVar6, jVar5, "neutralMedium", mVar5.f44017n, sVar5);
                                DemoSpacingKt.b(mVar5, hVar6, jVar5, "neutralLarge", mVar5.f44015k, sVar5);
                                DemoSpacingKt.b(mVar5, hVar6, jVar5, "neutralXlarge", mVar5.f44014j, sVar5);
                                DemoSpacingKt.b(mVar5, hVar6, jVar5, "neutralXxlarge", mVar5.f44021r, sVar5);
                                DemoSpacingKt.b(mVar5, hVar6, jVar5, "neutralHuge", mVar5.f44013i, sVar5);
                                DemoSpacingKt.b(mVar5, hVar6, jVar5, "neutralGigantic", mVar5.f44018o, sVar5);
                            } else {
                                sVar5.U();
                            }
                            break;
                    }
                    return Unit.f26487a;
                }
            }), sVar);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new on.j(i11, 25);
        }
    }

    public static final void a(m mVar, j jVar, h hVar, String str, u3.d dVar, s sVar) {
        b bVar = i.f13801a;
        y yVarA = w.a(i.g(mVar.l), d.f5694m, sVar, 0);
        int iHashCode = Long.hashCode(sVar.T);
        u3.i iVarL = sVar.l();
        t tVarC = a.c(q.f5711a, sVar);
        b5.j.R.getClass();
        b5.h hVar2 = b5.i.f5839b;
        sVar.e0();
        if (sVar.S) {
            sVar.k(hVar2);
        } else {
            sVar.n0();
        }
        m3.i.C(yVarA, b5.i.f5843f, sVar);
        m3.i.C(iVarL, b5.i.f5842e, sVar);
        m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
        m3.i.z(sVar, b5.i.f5845h);
        m3.i.C(tVarC, b5.i.f5841d, sVar);
        r9.d(str, null, hVar.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar.f43957f, sVar, 6, 0, 131066);
        k.w(6, dVar, sVar, true);
    }

    public static final void b(m mVar, h hVar, j jVar, String str, float f11, n nVar) {
        q qVar = q.f5711a;
        t tVarD = m2.d(qVar, 1.0f);
        b4.j jVar2 = d.f5693k;
        b bVar = i.f13801a;
        i2 i2VarA = h2.a(i.g(mVar.f44005a), jVar2, nVar, 48);
        s sVar = (s) nVar;
        int iHashCode = Long.hashCode(sVar.T);
        u3.i iVarL = sVar.l();
        t tVarC = a.c(tVarD, nVar);
        b5.j.R.getClass();
        b5.h hVar2 = b5.i.f5839b;
        r2 r2Var = sVar.f29417a;
        sVar.e0();
        if (sVar.S) {
            sVar.k(hVar2);
        } else {
            sVar.n0();
        }
        g gVar = b5.i.f5843f;
        m3.i.C(i2VarA, gVar, nVar);
        g gVar2 = b5.i.f5842e;
        m3.i.C(iVarL, gVar2, nVar);
        Integer numValueOf = Integer.valueOf(iHashCode);
        g gVar3 = b5.i.f5844g;
        m3.i.v(nVar, numValueOf, gVar3);
        b5.d dVar = b5.i.f5845h;
        m3.i.z(nVar, dVar);
        g gVar4 = b5.i.f5841d;
        m3.i.C(tVarC, gVar4, nVar);
        p.a(v1.n.j(m2.q(m2.e(qVar, ((m) sVar.j(PantryThemeKt.getLocalPantrySpacing())).l), f11), hVar.f43925k, g0.f23254b), nVar, 0);
        if (1.0f <= 0.0d) {
            e2.a.a("invalid weight; must be greater than zero");
        }
        n1 n1Var = new n1(1.0f, true);
        y yVarA = w.a(i.f13803c, d.f5694m, nVar, 0);
        int iHashCode2 = Long.hashCode(sVar.T);
        u3.i iVarL2 = sVar.l();
        t tVarC2 = a.c(n1Var, nVar);
        sVar.e0();
        if (sVar.S) {
            sVar.k(hVar2);
        } else {
            sVar.n0();
        }
        m3.i.C(yVarA, gVar, nVar);
        m3.i.C(iVarL2, gVar2, nVar);
        m3.i.v(nVar, Integer.valueOf(iHashCode2), gVar3);
        m3.i.z(nVar, dVar);
        m3.i.C(tVarC2, gVar4, nVar);
        r9.d(str, null, hVar.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar.f43959h, nVar, 6, 0, 131066);
        r9.d(f11 + " dp", null, hVar.K, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, nVar, 0, 0, 262138);
        sVar.q(true);
        sVar.q(true);
    }
}
