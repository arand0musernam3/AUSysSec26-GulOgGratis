package com.tgtg.componentlibrary.theme.demo;

import b4.a;
import b4.d;
import b4.q;
import b4.t;
import b5.g;
import b5.j;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import com.tgtg.componentlibrary.theme.demo.ext.ColorExtKt;
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
import e0.f;
import g3.r9;
import i4.g0;
import i4.r0;
import i4.v;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.d0;
import kotlin.jvm.internal.SourceDebugExtension;
import m3.n;
import m3.s;
import m3.w1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.Nullable;
import w.a0;
import x60.h;
import x60.k;
import x60.l;
import x60.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"", "DemoColor", "(Lm3/n;I)V", "app_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDemoColor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DemoColor.kt\ncom/tgtg/componentlibrary/theme/demo/DemoColorKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,246:1\n75#2:247\n75#2:248\n75#2:284\n75#2:285\n75#2:286\n75#2:404\n75#2:405\n75#2:406\n75#2:407\n75#2:408\n87#3:249\n85#3,8:250\n94#3:283\n87#3:287\n83#3,10:288\n87#3:351\n85#3,8:352\n94#3:395\n94#3:403\n87#3:437\n84#3,9:438\n94#3:472\n81#4,6:258\n88#4,6:273\n96#4:282\n81#4,6:298\n88#4,6:313\n81#4,6:329\n88#4,6:344\n81#4,6:360\n88#4,6:375\n96#4:394\n96#4:398\n96#4:402\n81#4,6:415\n88#4,6:430\n81#4,6:447\n88#4,6:462\n96#4:471\n96#4:475\n391#5,9:264\n400#5,3:279\n391#5,9:304\n400#5:319\n391#5,9:335\n400#5:350\n391#5,9:366\n400#5:381\n401#5,2:392\n401#5,2:396\n401#5,2:400\n391#5,9:421\n400#5:436\n391#5,9:453\n400#5,3:468\n401#5,2:473\n99#6:320\n97#6,8:321\n106#6:399\n99#6,6:409\n106#6:476\n788#7:382\n800#7:383\n1924#7,2:384\n801#7,2:386\n1926#7:388\n803#7:389\n1915#7,2:390\n*S KotlinDebug\n*F\n+ 1 DemoColor.kt\ncom/tgtg/componentlibrary/theme/demo/DemoColorKt\n*L\n32#1:247\n33#1:248\n157#1:284\n158#1:285\n159#1:286\n186#1:404\n187#1:405\n188#1:406\n189#1:407\n190#1:408\n35#1:249\n35#1:250,8\n35#1:283\n161#1:287\n161#1:288,10\n170#1:351\n170#1:352,8\n170#1:395\n161#1:403\n205#1:437\n205#1:438,9\n205#1:472\n35#1:258,6\n35#1:273,6\n35#1:282\n161#1:298,6\n161#1:313,6\n163#1:329,6\n163#1:344,6\n170#1:360,6\n170#1:375,6\n170#1:394\n163#1:398\n161#1:402\n192#1:415,6\n192#1:430,6\n205#1:447,6\n205#1:462,6\n205#1:471\n192#1:475\n35#1:264,9\n35#1:279,3\n161#1:304,9\n161#1:319\n163#1:335,9\n163#1:350\n170#1:366,9\n170#1:381\n170#1:392,2\n163#1:396,2\n161#1:400,2\n192#1:421,9\n192#1:436\n205#1:453,9\n205#1:468,3\n192#1:473,2\n163#1:320\n163#1:321,8\n163#1:399\n192#1:409,6\n192#1:476\n174#1:382\n174#1:383\n174#1:384,2\n174#1:386,2\n174#1:388\n174#1:389\n175#1:390,2\n*E\n"})
public final class DemoColorKt {
    public static final void DemoColor(@Nullable n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.c0(-373039601);
        if (sVar.R(i11 & 1, i11 != 0)) {
            h hVar = (h) sVar.j(PantryThemeKt.getLocalPantryColor());
            m mVar = (m) sVar.j(PantryThemeKt.getLocalPantrySpacing());
            long j9 = hVar.f43905a;
            r0 r0Var = g0.f23254b;
            q qVar = q.f5711a;
            t tVarJ = v1.n.j(qVar, j9, r0Var);
            float f11 = mVar.f44015k;
            float f12 = mVar.f44019p;
            t tVarD = m2.d(v1.n.r(c.B(tVarJ, f11, 0.0f, 2), v1.n.q(sVar), true), 1.0f);
            b bVar = i.f13801a;
            y yVarA = w.a(i.g(mVar.f44008d), d.f5694m, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = a.c(tVarD, sVar);
            j.R.getClass();
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
            c.f(m2.m(qVar, f12), sVar);
            b("Content", d0.h(new Pair("contentPrimary", new v(hVar.J)), new Pair("contentBrand", new v(hVar.Y)), new Pair("contentDisabled", new v(hVar.V)), new Pair("contentInteractivePrimary", new v(hVar.N)), new Pair("contentInteractivePrimaryHover", new v(hVar.P)), new Pair("contentInteractivePrimaryPressed", new v(hVar.Q)), new Pair("contentInteractiveInverse", new v(hVar.O)), new Pair("contentInteractiveInverseHover", new v(hVar.R)), new Pair("contentInteractiveInversePressed", new v(hVar.S)), new Pair("contentInverse", new v(hVar.T)), new Pair("contentOnPositive", new v(hVar.U)), new Pair("contentOnNegative", new v(hVar.L)), new Pair("contentOnAttention", new v(hVar.X)), new Pair("contentOnAccent", new v(hVar.W)), new Pair("contentOnDisabled", new v(hVar.Z)), new Pair("contentOnBrand", new v(hVar.f43906a0)), new Pair("contentOnSelected", new v(hVar.f43908b0)), new Pair("contentSubtle", new v(hVar.K)), new Pair("contentSubtlest", new v(hVar.M))), 0, sVar, 6);
            b("Surface", d0.h(new Pair("surfaceBackgroundBase", new v(hVar.f43905a)), new Pair("surfaceBackgroundElevated", new v(hVar.f43907b)), new Pair("surfaceBackgroundOverlayDefault", new v(hVar.f43909c)), new Pair("surfaceBackgroundOverlayBold", new v(hVar.f43911d)), new Pair("surfaceBase", new v(hVar.G)), new Pair("surfacePositiveSubtle", new v(hVar.H)), new Pair("surfaceAccent", new v(hVar.I)), new Pair("surfaceInverse", new v(hVar.E)), new Pair("surfaceBrand", new v(hVar.D)), new Pair("surfaceNeutral", new v(hVar.B)), new Pair("surfaceDisabled", new v(hVar.A)), new Pair("surfaceInteractiveAccent", new v(hVar.f43923j)), new Pair("surfaceInteractiveAccentHover", new v(hVar.f43919h)), new Pair("surfaceInteractiveAccentPressed", new v(hVar.f43921i)), new Pair("surfaceInteractivePrimary", new v(hVar.f43925k)), new Pair("surfaceInteractivePrimaryHover", new v(hVar.l)), new Pair("surfaceInteractivePrimaryPressed", new v(hVar.f43928m)), new Pair("surfaceInteractiveSubtle", new v(hVar.f43917g)), new Pair("surfaceInteractiveSubtleHover", new v(hVar.f43934p)), new Pair("surfaceInteractiveSubtlePressed", new v(hVar.f43936q)), new Pair("surfaceInteractiveState", new v(hVar.f43938r)), new Pair("surfaceInteractiveStateHover", new v(hVar.f43945v)), new Pair("surfaceInteractiveStatePressed", new v(hVar.f43946w)), new Pair("surfaceInteractiveOpacityOverlayHover", new v(hVar.f43930n)), new Pair("surfaceInteractiveOpacityOverlayPressed", new v(hVar.f43932o)), new Pair("surfaceInteractiveOpacityOverlaySelected", new v(hVar.f43947x)), new Pair("surfaceInteractiveSelected", new v(hVar.f43948y)), new Pair("surfaceInteractiveNegative", new v(hVar.f43940s)), new Pair("surfaceInteractiveNegativeHover", new v(hVar.f43942t)), new Pair("surfaceInteractiveNegativePressed", new v(hVar.f43943u)), new Pair("surfacePositiveBold", new v(hVar.f43913e)), new Pair("surfaceNegativeSubtle", new v(hVar.f43915f)), new Pair("surfaceNegativeBold", new v(hVar.C)), new Pair("surfaceAttentionSubtle", new v(hVar.f43949z)), new Pair("surfaceAttentionBold", new v(hVar.F))), 0, sVar, 6);
            b("Border", d0.h(new Pair("borderDisabled", new v(hVar.f43924j0)), new Pair("borderInteractiveSubtle", new v(hVar.f43926k0)), new Pair("borderInteractiveSubtleHover", new v(hVar.f43929m0)), new Pair("borderInteractiveSubtlePressed", new v(hVar.f43931n0)), new Pair("borderInteractiveNegative", new v(hVar.f43933o0)), new Pair("borderInteractiveSelected", new v(hVar.f43935p0)), new Pair("borderNeutral", new v(hVar.f43922i0)), new Pair("borderInverse", new v(hVar.f43937q0)), new Pair("borderElevation", new v(hVar.f43939r0))), 0, sVar, 6);
            b("Brand", d0.h(new Pair("brandCreamyOatMilk", new v(hVar.f43910c0)), new Pair("brandCrunchyApple", new v(hVar.f43912d0)), new Pair("brandDarkCrunchyApple", new v(hVar.f43920h0)), new Pair("brandJuicyWatermelon", new v(hVar.f43916f0)), new Pair("brandLeafyGreen", new v(hVar.f43914e0)), new Pair("brandSourLemon", new v(hVar.f43918g0))), 0, sVar, 6);
            b("Static & Shadow", d0.h(new Pair("staticDark", new v(hVar.t0)), new Pair("staticLight", new v(hVar.f43941s0)), new Pair("neutralTransparent", new v(hVar.f43944u0))), 0, sVar, 6);
            b3.i.y(qVar, f12, sVar, true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new on.j(i11, 21);
        }
    }

    public static final void a(int i11, long j9, t tVar, String str, n nVar) {
        s sVar;
        t tVar2;
        s sVar2 = (s) nVar;
        sVar2.c0(1138496276);
        int i12 = i11 | (sVar2.f(str) ? 4 : 2) | (sVar2.e(j9) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (sVar2.R(i12 & 1, (i12 & 147) != 146)) {
            m mVar = (m) sVar2.j(PantryThemeKt.getLocalPantrySpacing());
            h hVar = (h) sVar2.j(PantryThemeKt.getLocalPantryColor());
            l lVar = (l) sVar2.j(PantryThemeKt.getLocalPantrySize());
            x60.j jVar = (x60.j) sVar2.j(PantryThemeKt.getLocalPantryTypography());
            k kVar = (k) sVar2.j(PantryThemeKt.getLocalPantryRadius());
            q qVar = q.f5711a;
            t tVarD = m2.d(qVar, 1.0f);
            b4.j jVar2 = d.f5693k;
            b bVar = i.f13801a;
            i2 i2VarA = h2.a(i.g(mVar.f44005a), jVar2, sVar2, 48);
            int iHashCode = Long.hashCode(sVar2.T);
            u3.i iVarL = sVar2.l();
            t tVarC = a.c(tVarD, sVar2);
            j.R.getClass();
            b5.h hVar2 = b5.i.f5839b;
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(hVar2);
            } else {
                sVar2.n0();
            }
            g gVar = b5.i.f5843f;
            m3.i.C(i2VarA, gVar, sVar2);
            g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            g gVar3 = b5.i.f5844g;
            m3.i.v(sVar2, numValueOf, gVar3);
            b5.d dVar = b5.i.f5845h;
            m3.i.z(sVar2, dVar);
            g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar2);
            p.a(v1.n.j(m2.m(qVar, lVar.f43992d), j9, l2.g.b(kVar.f43978b)), sVar2, 0);
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            n1 n1Var = new n1(1.0f, true);
            y yVarA = w.a(i.f13803c, d.f5694m, sVar2, 0);
            int iHashCode2 = Long.hashCode(sVar2.T);
            u3.i iVarL2 = sVar2.l();
            t tVarC2 = a.c(n1Var, sVar2);
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(hVar2);
            } else {
                sVar2.n0();
            }
            m3.i.C(yVarA, gVar, sVar2);
            m3.i.C(iVarL2, gVar2, sVar2);
            a0.y(iHashCode2, sVar2, gVar3, sVar2, dVar);
            m3.i.C(tVarC2, gVar4, sVar2);
            r9.d(str, null, hVar.J, 0L, null, 0L, null, null, 0L, 0, false, 1, 0, null, jVar.f43959h, sVar2, i12 & 14, 24576, 114682);
            r9.d(ColorExtKt.m959argbToHex8_81llA(j9), null, hVar.K, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, sVar2, 0, 0, 262138);
            sVar = sVar2;
            sVar.q(true);
            sVar.q(true);
            tVar2 = qVar;
        } else {
            sVar = sVar2;
            sVar.U();
            tVar2 = tVar;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new fg.k(str, j9, tVar2, i11);
        }
    }

    public static final void b(String str, List list, int i11, n nVar, int i12) {
        int i13;
        b4.i iVar = d.f5694m;
        s sVar = (s) nVar;
        sVar.c0(-728962518);
        int i14 = i12 | (sVar.h(list) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (sVar.R(i14 & 1, (i14 & 147) != 146)) {
            m mVar = (m) sVar.j(PantryThemeKt.getLocalPantrySpacing());
            x60.j jVar = (x60.j) sVar.j(PantryThemeKt.getLocalPantryTypography());
            h hVar = (h) sVar.j(PantryThemeKt.getLocalPantryColor());
            b bVar = i.f13801a;
            y yVarA = w.a(i.g(mVar.l), iVar, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            q qVar = q.f5711a;
            t tVarC = a.c(qVar, sVar);
            j.R.getClass();
            b5.h hVar2 = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar2);
            } else {
                sVar.n0();
            }
            g gVar = b5.i.f5843f;
            m3.i.C(yVarA, gVar, sVar);
            g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar);
            Integer numValueOf = Integer.valueOf(iHashCode);
            g gVar3 = b5.i.f5844g;
            m3.i.v(sVar, numValueOf, gVar3);
            b5.d dVar = b5.i.f5845h;
            m3.i.z(sVar, dVar);
            g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar);
            b4.i iVar2 = iVar;
            r9.d(str, null, hVar.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar.f43957f, sVar, 6, 0, 131066);
            sVar = sVar;
            d2.g gVarG = i.g(mVar.f44005a);
            t tVarD = m2.d(qVar, 1.0f);
            i2 i2VarA = h2.a(gVarG, d.f5692j, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            t tVarC2 = a.c(tVarD, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar2);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC2, gVar4, sVar);
            sVar.a0(-718571230);
            int i15 = 0;
            while (true) {
                i13 = 3;
                if (i15 >= 3) {
                    f.D(sVar, false, true, true);
                    break;
                }
                if (1.0f <= 0.0d) {
                    e2.a.a("invalid weight; must be greater than zero");
                }
                n1 n1Var = new n1(1.0f, true);
                b bVar2 = i.f13801a;
                b4.i iVar3 = iVar2;
                y yVarA2 = w.a(i.g(mVar.l), iVar3, sVar, 0);
                int iHashCode3 = Long.hashCode(sVar.T);
                u3.i iVarL3 = sVar.l();
                t tVarC3 = a.c(n1Var, sVar);
                j.R.getClass();
                b5.h hVar3 = b5.i.f5839b;
                sVar.e0();
                if (sVar.S) {
                    sVar.k(hVar3);
                } else {
                    sVar.n0();
                }
                m3.i.C(yVarA2, b5.i.f5843f, sVar);
                m3.i.C(iVarL3, b5.i.f5842e, sVar);
                m3.i.v(sVar, Integer.valueOf(iHashCode3), b5.i.f5844g);
                m3.i.z(sVar, b5.i.f5845h);
                m3.i.C(tVarC3, b5.i.f5841d, sVar);
                sVar.a0(-1628607020);
                ArrayList<Pair> arrayList = new ArrayList();
                int i16 = 0;
                for (Object obj : list) {
                    int i17 = i16 + 1;
                    if (i16 < 0) {
                        d0.n();
                        throw null;
                    }
                    if (i16 % 3 == i15) {
                        arrayList.add(obj);
                    }
                    i16 = i17;
                }
                for (Pair pair : arrayList) {
                    a(0, ((v) pair.f26486b).f23317a, null, (String) pair.f26485a, sVar);
                }
                sVar.q(false);
                sVar.q(true);
                i15++;
                iVar2 = iVar3;
            }
        } else {
            sVar.U();
            i13 = i11;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new ug.i(str, list, i13, i12);
        }
    }
}
