package com.tgtg.componentlibrary.component.radiobutton;

import b2.l;
import b4.d;
import b4.q;
import b4.t;
import b5.h;
import com.braze.models.FeatureFlag;
import com.tgtg.componentlibrary.component.p000switch.e;
import com.tgtg.componentlibrary.component.radiobutton.ext.RadioButtonColorsExtKt;
import com.tgtg.componentlibrary.component.radiobutton.model.RadioButtonColors;
import com.tgtg.componentlibrary.component.radiobutton.model.RadioButtonGeometry;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import d2.m2;
import d2.p;
import g3.o2;
import g3.s5;
import g3.y7;
import g3.z2;
import j5.j;
import j5.r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import l2.c;
import l2.f;
import l2.g;
import m3.m;
import m3.n;
import m3.s;
import m3.w1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import u3.i;
import x60.a;
import x60.k;
import z4.o;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a9\u0010\b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "selected", "Lkotlin/Function0;", "", "onClick", "Lb4/t;", "modifier", FeatureFlag.ENABLED, "PantryRadioButton", "(ZLkotlin/jvm/functions/Function0;Lb4/t;ZLm3/n;II)V", "app_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPantryRadioButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PantryRadioButton.kt\ncom/tgtg/componentlibrary/component/radiobutton/PantryRadioButtonKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,163:1\n75#2:164\n75#2:165\n75#2:166\n75#2:173\n75#2:174\n1128#3,6:167\n1128#3,6:176\n1128#3,6:214\n1128#3,6:224\n1128#3,6:230\n1128#3,6:236\n1128#3,6:242\n60#4:175\n60#4:248\n60#4:249\n70#5:182\n67#5,9:183\n77#5:223\n81#6,6:192\n88#6,6:207\n96#6:222\n391#7,9:198\n400#7:213\n401#7,2:220\n*S KotlinDebug\n*F\n+ 1 PantryRadioButton.kt\ncom/tgtg/componentlibrary/component/radiobutton/PantryRadioButtonKt\n*L\n51#1:164\n52#1:165\n53#1:166\n91#1:173\n92#1:174\n54#1:167,6\n116#1:176,6\n125#1:214,6\n147#1:224,6\n150#1:230,6\n157#1:236,6\n160#1:242,6\n114#1:175\n130#1:248\n136#1:249\n98#1:182\n98#1:183,9\n98#1:223\n98#1:192,6\n98#1:207,6\n98#1:222\n98#1:198,9\n98#1:213\n98#1:220,2\n*E\n"})
public final class PantryRadioButtonKt {
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void PantryRadioButton(boolean r30, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> r31, @org.jetbrains.annotations.Nullable b4.t r32, boolean r33, @org.jetbrains.annotations.Nullable m3.n r34, int r35, int r36) {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tgtg.componentlibrary.component.radiobutton.PantryRadioButtonKt.PantryRadioButton(boolean, kotlin.jvm.functions.Function0, b4.t, boolean, m3.n, int, int):void");
    }

    public static final void a(final boolean z11, Function0 function0, l lVar, RadioButtonColors radioButtonColors, final RadioButtonGeometry radioButtonGeometry, t tVar, boolean z12, n nVar, int i11) {
        int i12;
        int i13;
        s sVar = (s) nVar;
        sVar.c0(-437154757);
        if ((i11 & 6) == 0) {
            i12 = (sVar.g(z11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(function0) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.f(lVar) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.f(radioButtonColors) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar.f(radioButtonGeometry) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar.f(tVar) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= sVar.g(z12) ? 1048576 : 524288;
        }
        int i14 = i12;
        if (sVar.R(i14 & 1, (i14 & 599187) != 599186)) {
            k kVar = (k) sVar.j(PantryThemeKt.getLocalPantryRadius());
            final a aVar = (a) sVar.j(PantryThemeKt.getLocalPantryBorder());
            int i15 = ((i14 >> 9) & 14) | ((i14 >> 15) & 112) | ((i14 << 6) & 896);
            final long jRadioDotColor = RadioButtonColorsExtKt.radioDotColor(radioButtonColors, z12, z11, sVar, i15);
            final long jRadioBorderColor = RadioButtonColorsExtKt.radioBorderColor(radioButtonColors, z12, z11, sVar, i15);
            boolean zBooleanValue = ((Boolean) a.a.v(lVar, sVar, (i14 >> 6) & 14).getValue()).booleanValue();
            o oVar = o2.f19198a;
            t tVarThen = tVar.then(z2.f19875b);
            float fM935getRadioButtonBorderSizeD9Ej5fM = radioButtonGeometry.m935getRadioButtonBorderSizeD9Ej5fM();
            long jM923getFocusedRingBorderColor0d7_KjU = radioButtonColors.m923getFocusedRingBorderColor0d7_KjU();
            float fM934getRadioButtonBorderPaddingD9Ej5fM = radioButtonGeometry.m934getRadioButtonBorderPaddingD9Ej5fM();
            c cVar = new c(kVar.f43979c);
            f fVar = g.f26790a;
            t tVarA = k2.c.a(wd.a.u(tVarThen, zBooleanValue, fM935getRadioButtonBorderSizeD9Ej5fM, jM923getFocusedRingBorderColor0d7_KjU, fM934getRadioButtonBorderPaddingD9Ej5fM, new f(cVar, cVar, cVar, cVar)), z11, lVar, s5.a(radioButtonGeometry.m938getRadioButtonDiameterD9Ej5fM() / 2, 4, 0L, false), z12, new j(3), function0);
            int i16 = i14 & 14;
            boolean z13 = i16 == 4;
            Object objM = sVar.M();
            m3.f fVar2 = m.f29332a;
            if (z13 || objM == fVar2) {
                i13 = 2;
                objM = new e(z11, 2);
                sVar.k0(objM);
            } else {
                i13 = 2;
            }
            t tVarU = m2.u(d2.c.z(r.c(tVarA, false, (Function1) objM), aVar.f43895b), d.f5687e, i13);
            u0 u0VarD = p.d(d.f5683a, false);
            int iHashCode = Long.hashCode(sVar.T);
            i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarU, sVar);
            b5.j.R.getClass();
            h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(u0VarD, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            t tVarI = m2.i(q.f5711a, radioButtonGeometry.m938getRadioButtonDiameterD9Ej5fM());
            boolean zF = sVar.f(aVar) | (i16 == 4) | sVar.e(jRadioBorderColor) | ((i14 & 57344) == 16384) | sVar.e(jRadioDotColor);
            Object objM2 = sVar.M();
            if (zF || objM2 == fVar2) {
                Function1 function1 = new Function1() { // from class: u60.b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        x60.a aVar2 = aVar;
                        float f11 = aVar2.f43898e;
                        k4.d dVar = (k4.d) obj;
                        dVar.getClass();
                        boolean z14 = z11;
                        float fC0 = z14 ? dVar.c0(f11) : dVar.c0(aVar2.f43895b);
                        RadioButtonGeometry radioButtonGeometry2 = radioButtonGeometry;
                        float f12 = 2;
                        k4.d.w0(dVar, jRadioBorderColor, dVar.c0(radioButtonGeometry2.m938getRadioButtonDiameterD9Ej5fM() / f12) - dVar.c0(f11 / f12), 0L, new k4.h(fC0, 0.0f, 0, 0, null, 30), 108);
                        if (z14) {
                            k4.d.w0(dVar, jRadioDotColor, dVar.c0(radioButtonGeometry2.m937getRadioButtonCheckSizeD9Ej5fM() / f12), 0L, k4.g.f25943a, 108);
                        }
                        return Unit.f26487a;
                    }
                };
                sVar.k0(function1);
                objM2 = function1;
            }
            v1.n.c(tVarI, (Function1) objM2, sVar, 0);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new y7(z11, function0, lVar, radioButtonColors, radioButtonGeometry, tVar, z12, i11);
        }
    }
}
