package com.tgtg.componentlibrary.component.spinner;

import b4.q;
import com.tgtg.componentlibrary.component.spinner.PantrySpinnerKt;
import com.tgtg.componentlibrary.component.spinner.model.SpinnerSize;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import d2.m2;
import g3.m5;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import m3.i;
import m3.n;
import m3.s;
import m3.w1;
import org.jetbrains.annotations.Nullable;
import x60.a;
import x60.h;
import x60.l;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a#\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/tgtg/componentlibrary/component/spinner/model/SpinnerSize;", "size", "Li4/v;", "color", "", "PantrySpinner-iJQMabo", "(Lcom/tgtg/componentlibrary/component/spinner/model/SpinnerSize;JLm3/n;II)V", "PantrySpinner", "app_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPantrySpinner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PantrySpinner.kt\ncom/tgtg/componentlibrary/component/spinner/PantrySpinnerKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,65:1\n75#2:66\n75#2:67\n75#2:68\n75#2:69\n99#3,6:70\n106#3:101\n81#4,6:76\n88#4,6:91\n96#4:100\n391#5,9:82\n400#5,3:97\n*S KotlinDebug\n*F\n+ 1 PantrySpinner.kt\ncom/tgtg/componentlibrary/component/spinner/PantrySpinnerKt\n*L\n23#1:66\n25#1:67\n26#1:68\n53#1:69\n54#1:70,6\n54#1:101\n54#1:76,6\n54#1:91,6\n54#1:100\n54#1:82,9\n54#1:97,3\n*E\n"})
public final class PantrySpinnerKt {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SpinnerSize.values().length];
            try {
                iArr[SpinnerSize.Tiny.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SpinnerSize.Small.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SpinnerSize.Medium.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SpinnerSize.Large.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: PantrySpinner-iJQMabo, reason: not valid java name */
    public static final void m939PantrySpinneriJQMabo(@Nullable SpinnerSize spinnerSize, long j9, @Nullable n nVar, final int i11, final int i12) {
        int i13;
        long j11;
        final SpinnerSize spinnerSize2;
        final long j12;
        SpinnerSize spinnerSize3;
        float f11;
        float f12;
        s sVar = (s) nVar;
        sVar.c0(-112489832);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = i11 | (sVar.d(spinnerSize == null ? -1 : spinnerSize.ordinal()) ? 4 : 2);
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            if ((i12 & 2) == 0) {
                j11 = j9;
                int i15 = sVar.e(j11) ? 32 : 16;
                i13 |= i15;
            } else {
                j11 = j9;
            }
            i13 |= i15;
        } else {
            j11 = j9;
        }
        if (sVar.R(i13 & 1, (i13 & 19) != 18)) {
            sVar.W();
            if ((i11 & 1) == 0 || sVar.z()) {
                SpinnerSize spinnerSize4 = i14 != 0 ? SpinnerSize.Medium : spinnerSize;
                if ((i12 & 2) != 0) {
                    j11 = ((h) sVar.j(PantryThemeKt.getLocalPantryColor())).J;
                    i13 &= -113;
                }
                spinnerSize3 = spinnerSize4;
            } else {
                sVar.U();
                if ((i12 & 2) != 0) {
                    i13 &= -113;
                }
                spinnerSize3 = spinnerSize;
            }
            sVar.r();
            l lVar = (l) sVar.j(PantryThemeKt.getLocalPantrySize());
            a aVar = (a) sVar.j(PantryThemeKt.getLocalPantryBorder());
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            int i16 = iArr[spinnerSize3.ordinal()];
            if (i16 == 1) {
                f11 = lVar.l;
            } else if (i16 == 2) {
                f11 = lVar.f43999k;
            } else if (i16 == 3) {
                f11 = lVar.f44002o;
            } else {
                if (i16 != 4) {
                    e40.a.f();
                    return;
                }
                f11 = lVar.f43995g;
            }
            int i17 = iArr[spinnerSize3.ordinal()];
            if (i17 == 1 || i17 == 2) {
                f12 = aVar.f43895b;
            } else if (i17 == 3) {
                f12 = aVar.f43896c;
            } else {
                if (i17 != 4) {
                    e40.a.f();
                    return;
                }
                f12 = aVar.f43898e;
            }
            int i18 = i13 & 112;
            float f13 = f12;
            long j13 = j11;
            m5.a(m2.m(q.f5711a, f11), j13, f13, 0L, 1, 0.0f, sVar, i18, 40);
            j12 = j13;
            spinnerSize2 = spinnerSize3;
        } else {
            sVar.U();
            spinnerSize2 = spinnerSize;
            j12 = j11;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new Function2() { // from class: v60.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    PantrySpinnerKt.m939PantrySpinneriJQMabo(spinnerSize2, j12, (n) obj, i.F(i11 | 1), i12);
                    return Unit.f26487a;
                }
            };
        }
    }
}
