package com.tgtg.componentlibrary.component.p000switch;

import b4.a;
import b4.d;
import b4.q;
import b4.t;
import b5.j;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import d2.b;
import d2.c;
import d2.h2;
import d2.i;
import d2.i2;
import d2.m2;
import d2.n1;
import d2.w;
import d2.y;
import defpackage.g;
import g3.r9;
import i4.g0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import m3.b1;
import m3.f;
import m3.n;
import m3.s;
import m3.w1;
import m5.u0;
import org.jetbrains.annotations.Nullable;
import r8.k;
import u3.e;
import x60.h;
import x60.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"", "DemoPantrySwitch", "(Lm3/n;I)V", "app_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDemoPantrySwitch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DemoPantrySwitch.kt\ncom/tgtg/componentlibrary/component/switch/DemoPantrySwitchKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,157:1\n75#2:158\n75#2:159\n75#2:195\n75#2:196\n75#2:197\n87#3:160\n85#3,8:161\n94#3:194\n81#4,6:169\n88#4,6:184\n96#4:193\n81#4,6:204\n88#4,6:219\n96#4:228\n81#4,6:241\n88#4,6:256\n96#4:277\n81#4,6:290\n88#4,6:305\n96#4:326\n81#4,6:339\n88#4,6:354\n96#4:375\n81#4,6:388\n88#4,6:403\n96#4:424\n391#5,9:175\n400#5,3:190\n391#5,9:210\n400#5,3:225\n391#5,9:247\n400#5:262\n401#5,2:275\n391#5,9:296\n400#5:311\n401#5,2:324\n391#5,9:345\n400#5:360\n401#5,2:373\n391#5,9:394\n400#5:409\n401#5,2:422\n99#6,6:198\n106#6:229\n99#6:230\n95#6,10:231\n106#6:278\n99#6:279\n95#6,10:280\n106#6:327\n99#6:328\n95#6,10:329\n106#6:376\n99#6:377\n95#6,10:378\n106#6:425\n1128#7,6:263\n1128#7,6:269\n1128#7,6:312\n1128#7,6:318\n1128#7,6:361\n1128#7,6:367\n1128#7,6:410\n1128#7,6:416\n*S KotlinDebug\n*F\n+ 1 DemoPantrySwitch.kt\ncom/tgtg/componentlibrary/component/switch/DemoPantrySwitchKt\n*L\n29#1:158\n33#1:159\n123#1:195\n124#1:196\n125#1:197\n31#1:160\n31#1:161,8\n31#1:194\n31#1:169,6\n31#1:184,6\n31#1:193\n127#1:204,6\n127#1:219,6\n127#1:228\n40#1:241,6\n40#1:256,6\n40#1:277\n60#1:290,6\n60#1:305,6\n60#1:326\n80#1:339,6\n80#1:354,6\n80#1:375\n99#1:388,6\n99#1:403,6\n99#1:424\n31#1:175,9\n31#1:190,3\n127#1:210,9\n127#1:225,3\n40#1:247,9\n40#1:262\n40#1:275,2\n60#1:296,9\n60#1:311\n60#1:324,2\n80#1:345,9\n80#1:360\n80#1:373,2\n99#1:394,9\n99#1:409\n99#1:422,2\n127#1:198,6\n127#1:229\n40#1:230\n40#1:231,10\n40#1:278\n60#1:279\n60#1:280,10\n60#1:327\n80#1:328\n80#1:329,10\n80#1:376\n99#1:377\n99#1:378,10\n99#1:425\n44#1:263,6\n45#1:269,6\n64#1:312,6\n65#1:318,6\n88#1:361,6\n93#1:367,6\n105#1:410,6\n110#1:416,6\n*E\n"})
public final class DemoPantrySwitchKt {
    public static final void DemoPantrySwitch(@Nullable n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.c0(-1286184162);
        final int i12 = 0;
        final int i13 = 1;
        if (sVar.R(i11 & 1, i11 != 0)) {
            final m mVar = (m) sVar.j(PantryThemeKt.getLocalPantrySpacing());
            t tVarD = m2.d(v1.n.r(c.A(v1.n.j(q.f5711a, ((h) sVar.j(PantryThemeKt.getLocalPantryColor())).f43905a, g0.f23254b), mVar.f44010f, mVar.f44011g), v1.n.q(sVar), true), 1.0f);
            b bVar = i.f13801a;
            y yVarA = w.a(i.g(mVar.f44007c), d.f5694m, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = a.c(tVarD, sVar);
            j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            a("Checked", e.e(1243139438, sVar, new Function2() { // from class: com.tgtg.componentlibrary.component.switch.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i14 = i12;
                    f fVar = m3.m.f29332a;
                    q qVar = q.f5711a;
                    m mVar2 = mVar;
                    switch (i14) {
                        case 0:
                            n nVar2 = (n) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            s sVar2 = (s) nVar2;
                            if (sVar2.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                b bVar2 = i.f13801a;
                                i2 i2VarA = h2.a(i.g(mVar2.f44005a), d.f5693k, sVar2, 48);
                                int iHashCode2 = Long.hashCode(sVar2.T);
                                u3.i iVarL2 = sVar2.l();
                                t tVarC2 = b4.a.c(qVar, sVar2);
                                j.R.getClass();
                                b5.h hVar2 = b5.i.f5839b;
                                sVar2.e0();
                                if (sVar2.S) {
                                    sVar2.k(hVar2);
                                } else {
                                    sVar2.n0();
                                }
                                m3.i.C(i2VarA, b5.i.f5843f, sVar2);
                                m3.i.C(iVarL2, b5.i.f5842e, sVar2);
                                m3.i.v(sVar2, Integer.valueOf(iHashCode2), b5.i.f5844g);
                                m3.i.z(sVar2, b5.i.f5845h);
                                m3.i.C(tVarC2, b5.i.f5841d, sVar2);
                                Object objM = sVar2.M();
                                if (objM == fVar) {
                                    objM = m3.i.w(Boolean.TRUE);
                                    sVar2.k0(objM);
                                }
                                b1 b1Var = (b1) objM;
                                boolean zBooleanValue = ((Boolean) b1Var.component1()).booleanValue();
                                Function1 function1Component2 = b1Var.component2();
                                Object objM2 = sVar2.M();
                                if (objM2 == fVar) {
                                    objM2 = m3.i.w(Boolean.TRUE);
                                    sVar2.k0(objM2);
                                }
                                b1 b1Var2 = (b1) objM2;
                                boolean zBooleanValue2 = ((Boolean) b1Var2.component1()).booleanValue();
                                Function1 function1Component22 = b1Var2.component2();
                                PantrySwitchKt.LargePantrySwitch(zBooleanValue, null, function1Component2, true, sVar2, 3072, 2);
                                PantrySwitchKt.SmallPantrySwitch(zBooleanValue2, null, function1Component22, true, sVar2, 3072, 2);
                                sVar2.q(true);
                            } else {
                                sVar2.U();
                            }
                            break;
                        case 1:
                            n nVar3 = (n) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            s sVar3 = (s) nVar3;
                            if (sVar3.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                b bVar3 = i.f13801a;
                                i2 i2VarA2 = h2.a(i.g(mVar2.f44005a), d.f5693k, sVar3, 48);
                                int iHashCode3 = Long.hashCode(sVar3.T);
                                u3.i iVarL3 = sVar3.l();
                                t tVarC3 = b4.a.c(qVar, sVar3);
                                j.R.getClass();
                                b5.h hVar3 = b5.i.f5839b;
                                sVar3.e0();
                                if (sVar3.S) {
                                    sVar3.k(hVar3);
                                } else {
                                    sVar3.n0();
                                }
                                m3.i.C(i2VarA2, b5.i.f5843f, sVar3);
                                m3.i.C(iVarL3, b5.i.f5842e, sVar3);
                                m3.i.v(sVar3, Integer.valueOf(iHashCode3), b5.i.f5844g);
                                m3.i.z(sVar3, b5.i.f5845h);
                                m3.i.C(tVarC3, b5.i.f5841d, sVar3);
                                Object objM3 = sVar3.M();
                                if (objM3 == fVar) {
                                    objM3 = m3.i.w(Boolean.FALSE);
                                    sVar3.k0(objM3);
                                }
                                b1 b1Var3 = (b1) objM3;
                                boolean zBooleanValue3 = ((Boolean) b1Var3.component1()).booleanValue();
                                Function1 function1Component23 = b1Var3.component2();
                                Object objM4 = sVar3.M();
                                if (objM4 == fVar) {
                                    objM4 = m3.i.w(Boolean.FALSE);
                                    sVar3.k0(objM4);
                                }
                                b1 b1Var4 = (b1) objM4;
                                boolean zBooleanValue4 = ((Boolean) b1Var4.component1()).booleanValue();
                                Function1 function1Component24 = b1Var4.component2();
                                PantrySwitchKt.LargePantrySwitch(zBooleanValue3, null, function1Component23, true, sVar3, 3072, 2);
                                PantrySwitchKt.SmallPantrySwitch(zBooleanValue4, null, function1Component24, true, sVar3, 3072, 2);
                                sVar3.q(true);
                            } else {
                                sVar3.U();
                            }
                            break;
                        case 2:
                            n nVar4 = (n) obj;
                            int iIntValue3 = ((Integer) obj2).intValue();
                            s sVar4 = (s) nVar4;
                            if (sVar4.R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                b bVar4 = i.f13801a;
                                i2 i2VarA3 = h2.a(i.g(mVar2.f44005a), d.f5693k, sVar4, 48);
                                int iHashCode4 = Long.hashCode(sVar4.T);
                                u3.i iVarL4 = sVar4.l();
                                t tVarC4 = b4.a.c(qVar, sVar4);
                                j.R.getClass();
                                b5.h hVar4 = b5.i.f5839b;
                                sVar4.e0();
                                if (sVar4.S) {
                                    sVar4.k(hVar4);
                                } else {
                                    sVar4.n0();
                                }
                                m3.i.C(i2VarA3, b5.i.f5843f, sVar4);
                                m3.i.C(iVarL4, b5.i.f5842e, sVar4);
                                m3.i.v(sVar4, Integer.valueOf(iHashCode4), b5.i.f5844g);
                                m3.i.z(sVar4, b5.i.f5845h);
                                m3.i.C(tVarC4, b5.i.f5841d, sVar4);
                                Object objM5 = sVar4.M();
                                if (objM5 == fVar) {
                                    objM5 = new g(25);
                                    sVar4.k0(objM5);
                                }
                                PantrySwitchKt.LargePantrySwitch(true, null, (Function1) objM5, false, sVar4, 3462, 2);
                                Object objM6 = sVar4.M();
                                if (objM6 == fVar) {
                                    objM6 = new g(26);
                                    sVar4.k0(objM6);
                                }
                                PantrySwitchKt.SmallPantrySwitch(true, null, (Function1) objM6, false, sVar4, 3462, 2);
                                sVar4.q(true);
                            } else {
                                sVar4.U();
                            }
                            break;
                        default:
                            n nVar5 = (n) obj;
                            int iIntValue4 = ((Integer) obj2).intValue();
                            s sVar5 = (s) nVar5;
                            if (sVar5.R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                b bVar5 = i.f13801a;
                                i2 i2VarA4 = h2.a(i.g(mVar2.f44005a), d.f5693k, sVar5, 48);
                                int iHashCode5 = Long.hashCode(sVar5.T);
                                u3.i iVarL5 = sVar5.l();
                                t tVarC5 = b4.a.c(qVar, sVar5);
                                j.R.getClass();
                                b5.h hVar5 = b5.i.f5839b;
                                sVar5.e0();
                                if (sVar5.S) {
                                    sVar5.k(hVar5);
                                } else {
                                    sVar5.n0();
                                }
                                m3.i.C(i2VarA4, b5.i.f5843f, sVar5);
                                m3.i.C(iVarL5, b5.i.f5842e, sVar5);
                                m3.i.v(sVar5, Integer.valueOf(iHashCode5), b5.i.f5844g);
                                m3.i.z(sVar5, b5.i.f5845h);
                                m3.i.C(tVarC5, b5.i.f5841d, sVar5);
                                Object objM7 = sVar5.M();
                                if (objM7 == fVar) {
                                    objM7 = new g(23);
                                    sVar5.k0(objM7);
                                }
                                PantrySwitchKt.LargePantrySwitch(false, null, (Function1) objM7, false, sVar5, 3462, 2);
                                Object objM8 = sVar5.M();
                                if (objM8 == fVar) {
                                    objM8 = new g(24);
                                    sVar5.k0(objM8);
                                }
                                PantrySwitchKt.SmallPantrySwitch(false, null, (Function1) objM8, false, sVar5, 3462, 2);
                                sVar5.q(true);
                            } else {
                                sVar5.U();
                            }
                            break;
                    }
                    return Unit.f26487a;
                }
            }), sVar, 54);
            a("Unchecked", e.e(-103784809, sVar, new Function2() { // from class: com.tgtg.componentlibrary.component.switch.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i14 = i13;
                    f fVar = m3.m.f29332a;
                    q qVar = q.f5711a;
                    m mVar2 = mVar;
                    switch (i14) {
                        case 0:
                            n nVar2 = (n) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            s sVar2 = (s) nVar2;
                            if (sVar2.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                b bVar2 = i.f13801a;
                                i2 i2VarA = h2.a(i.g(mVar2.f44005a), d.f5693k, sVar2, 48);
                                int iHashCode2 = Long.hashCode(sVar2.T);
                                u3.i iVarL2 = sVar2.l();
                                t tVarC2 = b4.a.c(qVar, sVar2);
                                j.R.getClass();
                                b5.h hVar2 = b5.i.f5839b;
                                sVar2.e0();
                                if (sVar2.S) {
                                    sVar2.k(hVar2);
                                } else {
                                    sVar2.n0();
                                }
                                m3.i.C(i2VarA, b5.i.f5843f, sVar2);
                                m3.i.C(iVarL2, b5.i.f5842e, sVar2);
                                m3.i.v(sVar2, Integer.valueOf(iHashCode2), b5.i.f5844g);
                                m3.i.z(sVar2, b5.i.f5845h);
                                m3.i.C(tVarC2, b5.i.f5841d, sVar2);
                                Object objM = sVar2.M();
                                if (objM == fVar) {
                                    objM = m3.i.w(Boolean.TRUE);
                                    sVar2.k0(objM);
                                }
                                b1 b1Var = (b1) objM;
                                boolean zBooleanValue = ((Boolean) b1Var.component1()).booleanValue();
                                Function1 function1Component2 = b1Var.component2();
                                Object objM2 = sVar2.M();
                                if (objM2 == fVar) {
                                    objM2 = m3.i.w(Boolean.TRUE);
                                    sVar2.k0(objM2);
                                }
                                b1 b1Var2 = (b1) objM2;
                                boolean zBooleanValue2 = ((Boolean) b1Var2.component1()).booleanValue();
                                Function1 function1Component22 = b1Var2.component2();
                                PantrySwitchKt.LargePantrySwitch(zBooleanValue, null, function1Component2, true, sVar2, 3072, 2);
                                PantrySwitchKt.SmallPantrySwitch(zBooleanValue2, null, function1Component22, true, sVar2, 3072, 2);
                                sVar2.q(true);
                            } else {
                                sVar2.U();
                            }
                            break;
                        case 1:
                            n nVar3 = (n) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            s sVar3 = (s) nVar3;
                            if (sVar3.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                b bVar3 = i.f13801a;
                                i2 i2VarA2 = h2.a(i.g(mVar2.f44005a), d.f5693k, sVar3, 48);
                                int iHashCode3 = Long.hashCode(sVar3.T);
                                u3.i iVarL3 = sVar3.l();
                                t tVarC3 = b4.a.c(qVar, sVar3);
                                j.R.getClass();
                                b5.h hVar3 = b5.i.f5839b;
                                sVar3.e0();
                                if (sVar3.S) {
                                    sVar3.k(hVar3);
                                } else {
                                    sVar3.n0();
                                }
                                m3.i.C(i2VarA2, b5.i.f5843f, sVar3);
                                m3.i.C(iVarL3, b5.i.f5842e, sVar3);
                                m3.i.v(sVar3, Integer.valueOf(iHashCode3), b5.i.f5844g);
                                m3.i.z(sVar3, b5.i.f5845h);
                                m3.i.C(tVarC3, b5.i.f5841d, sVar3);
                                Object objM3 = sVar3.M();
                                if (objM3 == fVar) {
                                    objM3 = m3.i.w(Boolean.FALSE);
                                    sVar3.k0(objM3);
                                }
                                b1 b1Var3 = (b1) objM3;
                                boolean zBooleanValue3 = ((Boolean) b1Var3.component1()).booleanValue();
                                Function1 function1Component23 = b1Var3.component2();
                                Object objM4 = sVar3.M();
                                if (objM4 == fVar) {
                                    objM4 = m3.i.w(Boolean.FALSE);
                                    sVar3.k0(objM4);
                                }
                                b1 b1Var4 = (b1) objM4;
                                boolean zBooleanValue4 = ((Boolean) b1Var4.component1()).booleanValue();
                                Function1 function1Component24 = b1Var4.component2();
                                PantrySwitchKt.LargePantrySwitch(zBooleanValue3, null, function1Component23, true, sVar3, 3072, 2);
                                PantrySwitchKt.SmallPantrySwitch(zBooleanValue4, null, function1Component24, true, sVar3, 3072, 2);
                                sVar3.q(true);
                            } else {
                                sVar3.U();
                            }
                            break;
                        case 2:
                            n nVar4 = (n) obj;
                            int iIntValue3 = ((Integer) obj2).intValue();
                            s sVar4 = (s) nVar4;
                            if (sVar4.R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                b bVar4 = i.f13801a;
                                i2 i2VarA3 = h2.a(i.g(mVar2.f44005a), d.f5693k, sVar4, 48);
                                int iHashCode4 = Long.hashCode(sVar4.T);
                                u3.i iVarL4 = sVar4.l();
                                t tVarC4 = b4.a.c(qVar, sVar4);
                                j.R.getClass();
                                b5.h hVar4 = b5.i.f5839b;
                                sVar4.e0();
                                if (sVar4.S) {
                                    sVar4.k(hVar4);
                                } else {
                                    sVar4.n0();
                                }
                                m3.i.C(i2VarA3, b5.i.f5843f, sVar4);
                                m3.i.C(iVarL4, b5.i.f5842e, sVar4);
                                m3.i.v(sVar4, Integer.valueOf(iHashCode4), b5.i.f5844g);
                                m3.i.z(sVar4, b5.i.f5845h);
                                m3.i.C(tVarC4, b5.i.f5841d, sVar4);
                                Object objM5 = sVar4.M();
                                if (objM5 == fVar) {
                                    objM5 = new g(25);
                                    sVar4.k0(objM5);
                                }
                                PantrySwitchKt.LargePantrySwitch(true, null, (Function1) objM5, false, sVar4, 3462, 2);
                                Object objM6 = sVar4.M();
                                if (objM6 == fVar) {
                                    objM6 = new g(26);
                                    sVar4.k0(objM6);
                                }
                                PantrySwitchKt.SmallPantrySwitch(true, null, (Function1) objM6, false, sVar4, 3462, 2);
                                sVar4.q(true);
                            } else {
                                sVar4.U();
                            }
                            break;
                        default:
                            n nVar5 = (n) obj;
                            int iIntValue4 = ((Integer) obj2).intValue();
                            s sVar5 = (s) nVar5;
                            if (sVar5.R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                b bVar5 = i.f13801a;
                                i2 i2VarA4 = h2.a(i.g(mVar2.f44005a), d.f5693k, sVar5, 48);
                                int iHashCode5 = Long.hashCode(sVar5.T);
                                u3.i iVarL5 = sVar5.l();
                                t tVarC5 = b4.a.c(qVar, sVar5);
                                j.R.getClass();
                                b5.h hVar5 = b5.i.f5839b;
                                sVar5.e0();
                                if (sVar5.S) {
                                    sVar5.k(hVar5);
                                } else {
                                    sVar5.n0();
                                }
                                m3.i.C(i2VarA4, b5.i.f5843f, sVar5);
                                m3.i.C(iVarL5, b5.i.f5842e, sVar5);
                                m3.i.v(sVar5, Integer.valueOf(iHashCode5), b5.i.f5844g);
                                m3.i.z(sVar5, b5.i.f5845h);
                                m3.i.C(tVarC5, b5.i.f5841d, sVar5);
                                Object objM7 = sVar5.M();
                                if (objM7 == fVar) {
                                    objM7 = new g(23);
                                    sVar5.k0(objM7);
                                }
                                PantrySwitchKt.LargePantrySwitch(false, null, (Function1) objM7, false, sVar5, 3462, 2);
                                Object objM8 = sVar5.M();
                                if (objM8 == fVar) {
                                    objM8 = new g(24);
                                    sVar5.k0(objM8);
                                }
                                PantrySwitchKt.SmallPantrySwitch(false, null, (Function1) objM8, false, sVar5, 3462, 2);
                                sVar5.q(true);
                            } else {
                                sVar5.U();
                            }
                            break;
                    }
                    return Unit.f26487a;
                }
            }), sVar, 54);
            final int i14 = 2;
            a("Disabled (Checked)", e.e(843382134, sVar, new Function2() { // from class: com.tgtg.componentlibrary.component.switch.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i142 = i14;
                    f fVar = m3.m.f29332a;
                    q qVar = q.f5711a;
                    m mVar2 = mVar;
                    switch (i142) {
                        case 0:
                            n nVar2 = (n) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            s sVar2 = (s) nVar2;
                            if (sVar2.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                b bVar2 = i.f13801a;
                                i2 i2VarA = h2.a(i.g(mVar2.f44005a), d.f5693k, sVar2, 48);
                                int iHashCode2 = Long.hashCode(sVar2.T);
                                u3.i iVarL2 = sVar2.l();
                                t tVarC2 = b4.a.c(qVar, sVar2);
                                j.R.getClass();
                                b5.h hVar2 = b5.i.f5839b;
                                sVar2.e0();
                                if (sVar2.S) {
                                    sVar2.k(hVar2);
                                } else {
                                    sVar2.n0();
                                }
                                m3.i.C(i2VarA, b5.i.f5843f, sVar2);
                                m3.i.C(iVarL2, b5.i.f5842e, sVar2);
                                m3.i.v(sVar2, Integer.valueOf(iHashCode2), b5.i.f5844g);
                                m3.i.z(sVar2, b5.i.f5845h);
                                m3.i.C(tVarC2, b5.i.f5841d, sVar2);
                                Object objM = sVar2.M();
                                if (objM == fVar) {
                                    objM = m3.i.w(Boolean.TRUE);
                                    sVar2.k0(objM);
                                }
                                b1 b1Var = (b1) objM;
                                boolean zBooleanValue = ((Boolean) b1Var.component1()).booleanValue();
                                Function1 function1Component2 = b1Var.component2();
                                Object objM2 = sVar2.M();
                                if (objM2 == fVar) {
                                    objM2 = m3.i.w(Boolean.TRUE);
                                    sVar2.k0(objM2);
                                }
                                b1 b1Var2 = (b1) objM2;
                                boolean zBooleanValue2 = ((Boolean) b1Var2.component1()).booleanValue();
                                Function1 function1Component22 = b1Var2.component2();
                                PantrySwitchKt.LargePantrySwitch(zBooleanValue, null, function1Component2, true, sVar2, 3072, 2);
                                PantrySwitchKt.SmallPantrySwitch(zBooleanValue2, null, function1Component22, true, sVar2, 3072, 2);
                                sVar2.q(true);
                            } else {
                                sVar2.U();
                            }
                            break;
                        case 1:
                            n nVar3 = (n) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            s sVar3 = (s) nVar3;
                            if (sVar3.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                b bVar3 = i.f13801a;
                                i2 i2VarA2 = h2.a(i.g(mVar2.f44005a), d.f5693k, sVar3, 48);
                                int iHashCode3 = Long.hashCode(sVar3.T);
                                u3.i iVarL3 = sVar3.l();
                                t tVarC3 = b4.a.c(qVar, sVar3);
                                j.R.getClass();
                                b5.h hVar3 = b5.i.f5839b;
                                sVar3.e0();
                                if (sVar3.S) {
                                    sVar3.k(hVar3);
                                } else {
                                    sVar3.n0();
                                }
                                m3.i.C(i2VarA2, b5.i.f5843f, sVar3);
                                m3.i.C(iVarL3, b5.i.f5842e, sVar3);
                                m3.i.v(sVar3, Integer.valueOf(iHashCode3), b5.i.f5844g);
                                m3.i.z(sVar3, b5.i.f5845h);
                                m3.i.C(tVarC3, b5.i.f5841d, sVar3);
                                Object objM3 = sVar3.M();
                                if (objM3 == fVar) {
                                    objM3 = m3.i.w(Boolean.FALSE);
                                    sVar3.k0(objM3);
                                }
                                b1 b1Var3 = (b1) objM3;
                                boolean zBooleanValue3 = ((Boolean) b1Var3.component1()).booleanValue();
                                Function1 function1Component23 = b1Var3.component2();
                                Object objM4 = sVar3.M();
                                if (objM4 == fVar) {
                                    objM4 = m3.i.w(Boolean.FALSE);
                                    sVar3.k0(objM4);
                                }
                                b1 b1Var4 = (b1) objM4;
                                boolean zBooleanValue4 = ((Boolean) b1Var4.component1()).booleanValue();
                                Function1 function1Component24 = b1Var4.component2();
                                PantrySwitchKt.LargePantrySwitch(zBooleanValue3, null, function1Component23, true, sVar3, 3072, 2);
                                PantrySwitchKt.SmallPantrySwitch(zBooleanValue4, null, function1Component24, true, sVar3, 3072, 2);
                                sVar3.q(true);
                            } else {
                                sVar3.U();
                            }
                            break;
                        case 2:
                            n nVar4 = (n) obj;
                            int iIntValue3 = ((Integer) obj2).intValue();
                            s sVar4 = (s) nVar4;
                            if (sVar4.R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                b bVar4 = i.f13801a;
                                i2 i2VarA3 = h2.a(i.g(mVar2.f44005a), d.f5693k, sVar4, 48);
                                int iHashCode4 = Long.hashCode(sVar4.T);
                                u3.i iVarL4 = sVar4.l();
                                t tVarC4 = b4.a.c(qVar, sVar4);
                                j.R.getClass();
                                b5.h hVar4 = b5.i.f5839b;
                                sVar4.e0();
                                if (sVar4.S) {
                                    sVar4.k(hVar4);
                                } else {
                                    sVar4.n0();
                                }
                                m3.i.C(i2VarA3, b5.i.f5843f, sVar4);
                                m3.i.C(iVarL4, b5.i.f5842e, sVar4);
                                m3.i.v(sVar4, Integer.valueOf(iHashCode4), b5.i.f5844g);
                                m3.i.z(sVar4, b5.i.f5845h);
                                m3.i.C(tVarC4, b5.i.f5841d, sVar4);
                                Object objM5 = sVar4.M();
                                if (objM5 == fVar) {
                                    objM5 = new g(25);
                                    sVar4.k0(objM5);
                                }
                                PantrySwitchKt.LargePantrySwitch(true, null, (Function1) objM5, false, sVar4, 3462, 2);
                                Object objM6 = sVar4.M();
                                if (objM6 == fVar) {
                                    objM6 = new g(26);
                                    sVar4.k0(objM6);
                                }
                                PantrySwitchKt.SmallPantrySwitch(true, null, (Function1) objM6, false, sVar4, 3462, 2);
                                sVar4.q(true);
                            } else {
                                sVar4.U();
                            }
                            break;
                        default:
                            n nVar5 = (n) obj;
                            int iIntValue4 = ((Integer) obj2).intValue();
                            s sVar5 = (s) nVar5;
                            if (sVar5.R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                b bVar5 = i.f13801a;
                                i2 i2VarA4 = h2.a(i.g(mVar2.f44005a), d.f5693k, sVar5, 48);
                                int iHashCode5 = Long.hashCode(sVar5.T);
                                u3.i iVarL5 = sVar5.l();
                                t tVarC5 = b4.a.c(qVar, sVar5);
                                j.R.getClass();
                                b5.h hVar5 = b5.i.f5839b;
                                sVar5.e0();
                                if (sVar5.S) {
                                    sVar5.k(hVar5);
                                } else {
                                    sVar5.n0();
                                }
                                m3.i.C(i2VarA4, b5.i.f5843f, sVar5);
                                m3.i.C(iVarL5, b5.i.f5842e, sVar5);
                                m3.i.v(sVar5, Integer.valueOf(iHashCode5), b5.i.f5844g);
                                m3.i.z(sVar5, b5.i.f5845h);
                                m3.i.C(tVarC5, b5.i.f5841d, sVar5);
                                Object objM7 = sVar5.M();
                                if (objM7 == fVar) {
                                    objM7 = new g(23);
                                    sVar5.k0(objM7);
                                }
                                PantrySwitchKt.LargePantrySwitch(false, null, (Function1) objM7, false, sVar5, 3462, 2);
                                Object objM8 = sVar5.M();
                                if (objM8 == fVar) {
                                    objM8 = new g(24);
                                    sVar5.k0(objM8);
                                }
                                PantrySwitchKt.SmallPantrySwitch(false, null, (Function1) objM8, false, sVar5, 3462, 2);
                                sVar5.q(true);
                            } else {
                                sVar5.U();
                            }
                            break;
                    }
                    return Unit.f26487a;
                }
            }), sVar, 54);
            final int i15 = 3;
            a("Disabled (Unchecked)", e.e(1790549077, sVar, new Function2() { // from class: com.tgtg.componentlibrary.component.switch.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i142 = i15;
                    f fVar = m3.m.f29332a;
                    q qVar = q.f5711a;
                    m mVar2 = mVar;
                    switch (i142) {
                        case 0:
                            n nVar2 = (n) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            s sVar2 = (s) nVar2;
                            if (sVar2.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                b bVar2 = i.f13801a;
                                i2 i2VarA = h2.a(i.g(mVar2.f44005a), d.f5693k, sVar2, 48);
                                int iHashCode2 = Long.hashCode(sVar2.T);
                                u3.i iVarL2 = sVar2.l();
                                t tVarC2 = b4.a.c(qVar, sVar2);
                                j.R.getClass();
                                b5.h hVar2 = b5.i.f5839b;
                                sVar2.e0();
                                if (sVar2.S) {
                                    sVar2.k(hVar2);
                                } else {
                                    sVar2.n0();
                                }
                                m3.i.C(i2VarA, b5.i.f5843f, sVar2);
                                m3.i.C(iVarL2, b5.i.f5842e, sVar2);
                                m3.i.v(sVar2, Integer.valueOf(iHashCode2), b5.i.f5844g);
                                m3.i.z(sVar2, b5.i.f5845h);
                                m3.i.C(tVarC2, b5.i.f5841d, sVar2);
                                Object objM = sVar2.M();
                                if (objM == fVar) {
                                    objM = m3.i.w(Boolean.TRUE);
                                    sVar2.k0(objM);
                                }
                                b1 b1Var = (b1) objM;
                                boolean zBooleanValue = ((Boolean) b1Var.component1()).booleanValue();
                                Function1 function1Component2 = b1Var.component2();
                                Object objM2 = sVar2.M();
                                if (objM2 == fVar) {
                                    objM2 = m3.i.w(Boolean.TRUE);
                                    sVar2.k0(objM2);
                                }
                                b1 b1Var2 = (b1) objM2;
                                boolean zBooleanValue2 = ((Boolean) b1Var2.component1()).booleanValue();
                                Function1 function1Component22 = b1Var2.component2();
                                PantrySwitchKt.LargePantrySwitch(zBooleanValue, null, function1Component2, true, sVar2, 3072, 2);
                                PantrySwitchKt.SmallPantrySwitch(zBooleanValue2, null, function1Component22, true, sVar2, 3072, 2);
                                sVar2.q(true);
                            } else {
                                sVar2.U();
                            }
                            break;
                        case 1:
                            n nVar3 = (n) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            s sVar3 = (s) nVar3;
                            if (sVar3.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                b bVar3 = i.f13801a;
                                i2 i2VarA2 = h2.a(i.g(mVar2.f44005a), d.f5693k, sVar3, 48);
                                int iHashCode3 = Long.hashCode(sVar3.T);
                                u3.i iVarL3 = sVar3.l();
                                t tVarC3 = b4.a.c(qVar, sVar3);
                                j.R.getClass();
                                b5.h hVar3 = b5.i.f5839b;
                                sVar3.e0();
                                if (sVar3.S) {
                                    sVar3.k(hVar3);
                                } else {
                                    sVar3.n0();
                                }
                                m3.i.C(i2VarA2, b5.i.f5843f, sVar3);
                                m3.i.C(iVarL3, b5.i.f5842e, sVar3);
                                m3.i.v(sVar3, Integer.valueOf(iHashCode3), b5.i.f5844g);
                                m3.i.z(sVar3, b5.i.f5845h);
                                m3.i.C(tVarC3, b5.i.f5841d, sVar3);
                                Object objM3 = sVar3.M();
                                if (objM3 == fVar) {
                                    objM3 = m3.i.w(Boolean.FALSE);
                                    sVar3.k0(objM3);
                                }
                                b1 b1Var3 = (b1) objM3;
                                boolean zBooleanValue3 = ((Boolean) b1Var3.component1()).booleanValue();
                                Function1 function1Component23 = b1Var3.component2();
                                Object objM4 = sVar3.M();
                                if (objM4 == fVar) {
                                    objM4 = m3.i.w(Boolean.FALSE);
                                    sVar3.k0(objM4);
                                }
                                b1 b1Var4 = (b1) objM4;
                                boolean zBooleanValue4 = ((Boolean) b1Var4.component1()).booleanValue();
                                Function1 function1Component24 = b1Var4.component2();
                                PantrySwitchKt.LargePantrySwitch(zBooleanValue3, null, function1Component23, true, sVar3, 3072, 2);
                                PantrySwitchKt.SmallPantrySwitch(zBooleanValue4, null, function1Component24, true, sVar3, 3072, 2);
                                sVar3.q(true);
                            } else {
                                sVar3.U();
                            }
                            break;
                        case 2:
                            n nVar4 = (n) obj;
                            int iIntValue3 = ((Integer) obj2).intValue();
                            s sVar4 = (s) nVar4;
                            if (sVar4.R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                b bVar4 = i.f13801a;
                                i2 i2VarA3 = h2.a(i.g(mVar2.f44005a), d.f5693k, sVar4, 48);
                                int iHashCode4 = Long.hashCode(sVar4.T);
                                u3.i iVarL4 = sVar4.l();
                                t tVarC4 = b4.a.c(qVar, sVar4);
                                j.R.getClass();
                                b5.h hVar4 = b5.i.f5839b;
                                sVar4.e0();
                                if (sVar4.S) {
                                    sVar4.k(hVar4);
                                } else {
                                    sVar4.n0();
                                }
                                m3.i.C(i2VarA3, b5.i.f5843f, sVar4);
                                m3.i.C(iVarL4, b5.i.f5842e, sVar4);
                                m3.i.v(sVar4, Integer.valueOf(iHashCode4), b5.i.f5844g);
                                m3.i.z(sVar4, b5.i.f5845h);
                                m3.i.C(tVarC4, b5.i.f5841d, sVar4);
                                Object objM5 = sVar4.M();
                                if (objM5 == fVar) {
                                    objM5 = new g(25);
                                    sVar4.k0(objM5);
                                }
                                PantrySwitchKt.LargePantrySwitch(true, null, (Function1) objM5, false, sVar4, 3462, 2);
                                Object objM6 = sVar4.M();
                                if (objM6 == fVar) {
                                    objM6 = new g(26);
                                    sVar4.k0(objM6);
                                }
                                PantrySwitchKt.SmallPantrySwitch(true, null, (Function1) objM6, false, sVar4, 3462, 2);
                                sVar4.q(true);
                            } else {
                                sVar4.U();
                            }
                            break;
                        default:
                            n nVar5 = (n) obj;
                            int iIntValue4 = ((Integer) obj2).intValue();
                            s sVar5 = (s) nVar5;
                            if (sVar5.R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                b bVar5 = i.f13801a;
                                i2 i2VarA4 = h2.a(i.g(mVar2.f44005a), d.f5693k, sVar5, 48);
                                int iHashCode5 = Long.hashCode(sVar5.T);
                                u3.i iVarL5 = sVar5.l();
                                t tVarC5 = b4.a.c(qVar, sVar5);
                                j.R.getClass();
                                b5.h hVar5 = b5.i.f5839b;
                                sVar5.e0();
                                if (sVar5.S) {
                                    sVar5.k(hVar5);
                                } else {
                                    sVar5.n0();
                                }
                                m3.i.C(i2VarA4, b5.i.f5843f, sVar5);
                                m3.i.C(iVarL5, b5.i.f5842e, sVar5);
                                m3.i.v(sVar5, Integer.valueOf(iHashCode5), b5.i.f5844g);
                                m3.i.z(sVar5, b5.i.f5845h);
                                m3.i.C(tVarC5, b5.i.f5841d, sVar5);
                                Object objM7 = sVar5.M();
                                if (objM7 == fVar) {
                                    objM7 = new g(23);
                                    sVar5.k0(objM7);
                                }
                                PantrySwitchKt.LargePantrySwitch(false, null, (Function1) objM7, false, sVar5, 3462, 2);
                                Object objM8 = sVar5.M();
                                if (objM8 == fVar) {
                                    objM8 = new g(24);
                                    sVar5.k0(objM8);
                                }
                                PantrySwitchKt.SmallPantrySwitch(false, null, (Function1) objM8, false, sVar5, 3462, 2);
                                sVar5.q(true);
                            } else {
                                sVar5.U();
                            }
                            break;
                    }
                    return Unit.f26487a;
                }
            }), sVar, 54);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new c60.b(i11, i13);
        }
    }

    public static final void a(String str, u3.d dVar, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.c0(-33563709);
        if (sVar.R(i11 & 1, (i11 & 19) != 18)) {
            m mVar = (m) sVar.j(PantryThemeKt.getLocalPantrySpacing());
            x60.j jVar = (x60.j) sVar.j(PantryThemeKt.getLocalPantryTypography());
            h hVar = (h) sVar.j(PantryThemeKt.getLocalPantryColor());
            t tVarD = m2.d(q.f5711a, 1.0f);
            b bVar = i.f13801a;
            i2 i2VarA = h2.a(i.g(mVar.f44005a), d.f5693k, sVar, 48);
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
            m3.i.C(i2VarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            u0 u0Var = jVar.f43959h;
            long j9 = hVar.J;
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            r9.d(str, new n1(1.0f, true), j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar, 6, 0, 131064);
            sVar = sVar;
            k.w(6, dVar, sVar, true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new b(str, dVar, i11);
        }
    }
}
