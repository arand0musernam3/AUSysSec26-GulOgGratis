package com.tgtg.componentlibrary.component.checkbox;

import b2.l;
import b4.d;
import b4.k;
import b4.q;
import b4.t;
import b5.h;
import com.app.tgtg.R;
import com.braze.models.FeatureFlag;
import com.tgtg.componentlibrary.component.checkbox.ext.CheckboxColorsExtKt;
import com.tgtg.componentlibrary.component.checkbox.model.CheckboxColors;
import com.tgtg.componentlibrary.component.checkbox.model.CheckboxGeometry;
import d2.m2;
import d2.p;
import g3.c0;
import g3.i2;
import g3.o2;
import g3.q9;
import g3.s5;
import g3.z2;
import j5.j;
import j5.r;
import k2.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import l2.g;
import l5.a;
import m3.f;
import m3.m;
import m3.n;
import m3.s;
import m3.w1;
import o00.x0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import u3.i;
import z4.o;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a?\u0010\b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\b\u0010\t\u001a9\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"", "checked", "Lkotlin/Function1;", "", "onCheckedChange", "Lb4/t;", "modifier", FeatureFlag.ENABLED, "PantryCheckbox", "(ZLkotlin/jvm/functions/Function1;Lb4/t;ZLm3/n;II)V", "Ll5/a;", "state", "Lkotlin/Function0;", "onClick", "PantryTristateCheckbox", "(Ll5/a;Lkotlin/jvm/functions/Function0;Lb4/t;ZLm3/n;II)V", "app_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPantryCheckbox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PantryCheckbox.kt\ncom/tgtg/componentlibrary/component/checkbox/PantryCheckboxKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadiusKt\n+ 8 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,311:1\n1128#2,6:312\n1128#2,6:323\n1128#2,6:329\n1128#2,6:335\n1128#2,6:372\n1128#2,6:382\n1128#2,6:388\n1128#2,6:394\n1128#2,6:400\n1128#2,6:406\n1128#2,6:412\n1128#2,6:418\n1128#2,6:424\n1128#2,6:430\n1128#2,6:436\n1128#2,6:442\n1128#2,6:448\n1128#2,6:454\n75#3:318\n75#3:319\n75#3:320\n75#3:321\n75#3:322\n70#4:341\n68#4,8:342\n77#4:381\n81#5,6:350\n88#5,6:365\n96#5:380\n391#6,9:356\n400#6:371\n401#6,2:378\n33#7:460\n33#7:464\n53#8,3:461\n53#8,3:465\n*S KotlinDebug\n*F\n+ 1 PantryCheckbox.kt\ncom/tgtg/componentlibrary/component/checkbox/PantryCheckboxKt\n*L\n59#1:312,6\n78#1:323,6\n83#1:329,6\n152#1:335,6\n166#1:372,6\n212#1:382,6\n215#1:388,6\n225#1:394,6\n235#1:400,6\n243#1:406,6\n246#1:412,6\n254#1:418,6\n257#1:424,6\n271#1:430,6\n274#1:436,6\n288#1:442,6\n291#1:448,6\n307#1:454,6\n73#1:318\n74#1:319\n75#1:320\n76#1:321\n77#1:322\n134#1:341\n134#1:342,8\n134#1:381\n134#1:350,6\n134#1:365,6\n134#1:380\n134#1:356,9\n134#1:371\n134#1:378,2\n171#1:460\n182#1:464\n171#1:461,3\n182#1:465,3\n*E\n"})
public final class PantryCheckboxKt {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.Off.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.Indeterminate.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void PantryCheckbox(boolean r16, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r17, @org.jetbrains.annotations.Nullable b4.t r18, boolean r19, @org.jetbrains.annotations.Nullable m3.n r20, int r21, int r22) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tgtg.componentlibrary.component.checkbox.PantryCheckboxKt.PantryCheckbox(boolean, kotlin.jvm.functions.Function1, b4.t, boolean, m3.n, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void PantryTristateCheckbox(@org.jetbrains.annotations.NotNull l5.a r55, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> r56, @org.jetbrains.annotations.Nullable b4.t r57, boolean r58, @org.jetbrains.annotations.Nullable m3.n r59, int r60, int r61) {
        /*
            Method dump skipped, instruction units count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tgtg.componentlibrary.component.checkbox.PantryCheckboxKt.PantryTristateCheckbox(l5.a, kotlin.jvm.functions.Function0, b4.t, boolean, m3.n, int, int):void");
    }

    public static final void a(final a aVar, Function0 function0, l lVar, CheckboxColors checkboxColors, final CheckboxGeometry checkboxGeometry, t tVar, boolean z11, n nVar, int i11) {
        int i12;
        boolean z12;
        s sVar;
        int i13;
        s sVar2 = (s) nVar;
        sVar2.c0(644158310);
        if ((i11 & 6) == 0) {
            i12 = (sVar2.d(aVar.ordinal()) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar2.h(function0) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar2.f(lVar) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar2.f(checkboxColors) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar2.f(checkboxGeometry) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar2.f(tVar) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= sVar2.g(z11) ? 1048576 : 524288;
        }
        int i14 = i12;
        if (sVar2.R(i14 & 1, (i14 & 599187) != 599186)) {
            boolean zBooleanValue = ((Boolean) a.a.v(lVar, sVar2, (i14 >> 6) & 14).getValue()).booleanValue();
            int i15 = ((i14 >> 9) & 14) | ((i14 >> 15) & 112);
            int i16 = ((i14 << 6) & 896) | i15;
            final long jBoxColor = CheckboxColorsExtKt.boxColor(checkboxColors, z11, aVar, sVar2, i16);
            final long jBorderColor = CheckboxColorsExtKt.borderColor(checkboxColors, z11, aVar, sVar2, i16);
            float fM710getCheckboxBorderSizeD9Ej5fM = z11 ? checkboxGeometry.m710getCheckboxBorderSizeD9Ej5fM() : checkboxGeometry.m711getCheckboxBorderSizeDisabledD9Ej5fM();
            o oVar = o2.f19198a;
            t tVarU = wd.a.u(tVar.then(z2.f19875b), zBooleanValue, checkboxGeometry.m716getFocusRingBorderSizeD9Ej5fM(), checkboxColors.m697getFocusedRingBorderColor0d7_KjU(), checkboxGeometry.m716getFocusRingBorderSizeD9Ej5fM(), g.b(checkboxGeometry.m717getFocusRingCornerRadiusD9Ej5fM()));
            final float f11 = fM710getCheckboxBorderSizeD9Ej5fM;
            t tVarE = c.e(tVarU, aVar, lVar, s5.a(checkboxGeometry.m715getCheckboxSizeD9Ej5fM(), 4, 0L, false), z11, new j(1), function0);
            int i17 = i14 & 14;
            boolean z13 = i17 == 4;
            Object objM = sVar2.M();
            f fVar = m.f29332a;
            if (z13 || objM == fVar) {
                objM = new q9(aVar, 25);
                sVar2.k0(objM);
            }
            t tVarZ = d2.c.z(r.c(tVarE, false, (Function1) objM), checkboxGeometry.m714getCheckboxPaddingD9Ej5fM());
            k kVar = d.f5687e;
            t tVarU2 = m2.u(tVarZ, kVar, 2);
            u0 u0VarD = p.d(kVar, false);
            int iHashCode = Long.hashCode(sVar2.T);
            i iVarL = sVar2.l();
            t tVarC = b4.a.c(tVarU2, sVar2);
            b5.j.R.getClass();
            h hVar = b5.i.f5839b;
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(hVar);
            } else {
                sVar2.n0();
            }
            m3.i.C(u0VarD, b5.i.f5843f, sVar2);
            m3.i.C(iVarL, b5.i.f5842e, sVar2);
            m3.i.v(sVar2, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar2, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar2);
            float fM715getCheckboxSizeD9Ej5fM = checkboxGeometry.m715getCheckboxSizeD9Ej5fM();
            q qVar = q.f5711a;
            t tVarI = m2.i(qVar, fM715getCheckboxSizeD9Ej5fM);
            boolean zE = sVar2.e(jBoxColor) | (i17 == 4) | ((i14 & 57344) == 16384) | sVar2.e(jBorderColor) | sVar2.c(f11);
            Object objM2 = sVar2.M();
            if (zE || objM2 == fVar) {
                i13 = i15;
                z12 = z11;
                Function1 function1 = new Function1() { // from class: i60.b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        k4.d dVar = (k4.d) obj;
                        dVar.getClass();
                        l5.a aVar2 = l5.a.Off;
                        l5.a aVar3 = aVar;
                        CheckboxGeometry checkboxGeometry2 = checkboxGeometry;
                        if (aVar3 != aVar2) {
                            long jD = dVar.d();
                            float fC0 = dVar.c0(checkboxGeometry2.m712getCheckboxCornerRadiusD9Ej5fM());
                            float fC02 = dVar.c0(checkboxGeometry2.m712getCheckboxCornerRadiusD9Ej5fM());
                            k4.d.M(dVar, jBoxColor, 0L, jD, (((long) Float.floatToRawIntBits(fC0)) << 32) | (((long) Float.floatToRawIntBits(fC02)) & 4294967295L), k4.g.f25943a, 226);
                        }
                        long jD2 = dVar.d();
                        float fC03 = dVar.c0(checkboxGeometry2.m712getCheckboxCornerRadiusD9Ej5fM());
                        float fC04 = dVar.c0(checkboxGeometry2.m712getCheckboxCornerRadiusD9Ej5fM());
                        k4.d.M(dVar, jBorderColor, 0L, jD2, (((long) Float.floatToRawIntBits(fC03)) << 32) | (((long) Float.floatToRawIntBits(fC04)) & 4294967295L), new k4.h(dVar.c0(f11), 0.0f, 0, 0, null, 30), 226);
                        return Unit.f26487a;
                    }
                };
                sVar2.k0(function1);
                objM2 = function1;
            } else {
                z12 = z11;
                i13 = i15;
            }
            v1.n.c(tVarI, (Function1) objM2, sVar2, 0);
            if (aVar != a.Off) {
                sVar2.a0(-1656474476);
                int i18 = WhenMappings.$EnumSwitchMapping$0[aVar.ordinal()];
                sVar = sVar2;
                i2.a(x0.z(i18 != 1 ? i18 != 3 ? -1 : R.drawable.minus : R.drawable.check, sVar2, 0), null, m2.i(qVar, checkboxGeometry.m713getCheckboxIconSizeD9Ej5fM()), CheckboxColorsExtKt.iconTint(checkboxColors, z12, sVar2, i13), sVar, 56, 0);
                sVar.q(false);
            } else {
                sVar = sVar2;
                sVar.a0(-1655919018);
                sVar.q(false);
            }
            sVar.q(true);
        } else {
            z12 = z11;
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new c0(aVar, function0, lVar, checkboxColors, checkboxGeometry, tVar, z12, i11);
        }
    }
}
