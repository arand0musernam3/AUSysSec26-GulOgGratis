package com.tgtg.componentlibrary.component.button.ext;

import com.tgtg.componentlibrary.component.button.model.ButtonGeometry;
import com.tgtg.componentlibrary.component.button.model.ButtonSize;
import com.tgtg.componentlibrary.component.spinner.model.SpinnerSize;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import m3.n;
import m3.s;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x60.a;
import x60.j;
import x60.k;
import x60.l;
import x60.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tgtg/componentlibrary/component/button/model/ButtonSize;", "size", "Lcom/tgtg/componentlibrary/component/button/model/ButtonGeometry;", "buttonGeometryFor", "(Lcom/tgtg/componentlibrary/component/button/model/ButtonSize;Lm3/n;I)Lcom/tgtg/componentlibrary/component/button/model/ButtonGeometry;", "app_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nButtonGeometryExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ButtonGeometryExt.kt\ncom/tgtg/componentlibrary/component/button/ext/ButtonGeometryExtKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,70:1\n75#2:71\n75#2:72\n75#2:73\n75#2:74\n75#2:75\n*S KotlinDebug\n*F\n+ 1 ButtonGeometryExt.kt\ncom/tgtg/componentlibrary/component/button/ext/ButtonGeometryExtKt\n*L\n16#1:71\n17#1:72\n18#1:73\n19#1:74\n20#1:75\n*E\n"})
public final class ButtonGeometryExtKt {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ButtonSize.values().length];
            try {
                iArr[ButtonSize.Large.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonSize.Medium.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ButtonSize.Small.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final ButtonGeometry buttonGeometryFor(@NotNull ButtonSize buttonSize, @Nullable n nVar, int i11) {
        buttonSize.getClass();
        s sVar = (s) nVar;
        l lVar = (l) sVar.j(PantryThemeKt.getLocalPantrySize());
        m mVar = (m) sVar.j(PantryThemeKt.getLocalPantrySpacing());
        k kVar = (k) sVar.j(PantryThemeKt.getLocalPantryRadius());
        j jVar = (j) sVar.j(PantryThemeKt.getLocalPantryTypography());
        a aVar = (a) sVar.j(PantryThemeKt.getLocalPantryBorder());
        int i12 = WhenMappings.$EnumSwitchMapping$0[buttonSize.ordinal()];
        if (i12 == 1) {
            return new ButtonGeometry(lVar.f43990b, Float.NaN, lVar.f43989a, Float.NaN, mVar.f44014j, mVar.f44015k, mVar.l, kVar.f43979c, jVar.f43974x, lVar.f43999k, SpinnerSize.Large, aVar.f43898e, mVar.f44016m, null);
        }
        if (i12 == 2) {
            float f11 = lVar.f43994f;
            float f12 = lVar.f43992d;
            float f13 = mVar.f44015k;
            float f14 = mVar.f44016m;
            return new ButtonGeometry(f11, Float.NaN, f12, Float.NaN, f13, f13, f14, kVar.f43979c, jVar.f43975y, lVar.f43999k, SpinnerSize.Medium, aVar.f43898e, f14, null);
        }
        if (i12 != 3) {
            e40.a.f();
            return null;
        }
        float f15 = lVar.f43993e;
        float f16 = lVar.f43990b;
        float f17 = mVar.f44017n;
        float f18 = mVar.f44019p;
        float f19 = mVar.f44016m;
        return new ButtonGeometry(f15, Float.NaN, f16, Float.NaN, f17, f18, f19, kVar.f43979c, jVar.f43975y, lVar.l, SpinnerSize.Small, aVar.f43898e, f19, null);
    }
}
