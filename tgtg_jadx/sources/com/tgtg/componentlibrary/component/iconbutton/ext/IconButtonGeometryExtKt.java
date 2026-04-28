package com.tgtg.componentlibrary.component.iconbutton.ext;

import com.tgtg.componentlibrary.component.iconbutton.model.IconButtonGeometry;
import com.tgtg.componentlibrary.component.iconbutton.model.IconButtonSize;
import com.tgtg.componentlibrary.component.spinner.model.SpinnerSize;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import m3.n;
import m3.s;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x60.a;
import x60.k;
import x60.l;
import x60.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tgtg/componentlibrary/component/iconbutton/model/IconButtonSize;", "size", "Lcom/tgtg/componentlibrary/component/iconbutton/model/IconButtonGeometry;", "iconButtonGeometryFor", "(Lcom/tgtg/componentlibrary/component/iconbutton/model/IconButtonSize;Lm3/n;I)Lcom/tgtg/componentlibrary/component/iconbutton/model/IconButtonGeometry;", "app_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nIconButtonGeometryExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IconButtonGeometryExt.kt\ncom/tgtg/componentlibrary/component/iconbutton/ext/IconButtonGeometryExtKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,51:1\n75#2:52\n75#2:53\n75#2:54\n75#2:55\n*S KotlinDebug\n*F\n+ 1 IconButtonGeometryExt.kt\ncom/tgtg/componentlibrary/component/iconbutton/ext/IconButtonGeometryExtKt\n*L\n14#1:52\n15#1:53\n16#1:54\n17#1:55\n*E\n"})
public final class IconButtonGeometryExtKt {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IconButtonSize.values().length];
            try {
                iArr[IconButtonSize.Medium.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IconButtonSize.Small.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IconButtonSize.Tiny.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final IconButtonGeometry iconButtonGeometryFor(@NotNull IconButtonSize iconButtonSize, @Nullable n nVar, int i11) {
        iconButtonSize.getClass();
        s sVar = (s) nVar;
        l lVar = (l) sVar.j(PantryThemeKt.getLocalPantrySize());
        k kVar = (k) sVar.j(PantryThemeKt.getLocalPantryRadius());
        a aVar = (a) sVar.j(PantryThemeKt.getLocalPantryBorder());
        m mVar = (m) sVar.j(PantryThemeKt.getLocalPantrySpacing());
        int i12 = WhenMappings.$EnumSwitchMapping$0[iconButtonSize.ordinal()];
        if (i12 == 1) {
            float f11 = lVar.f43994f;
            return new IconButtonGeometry(f11, f11, kVar.f43979c, lVar.f43995g, SpinnerSize.Medium, aVar.f43898e, mVar.f44019p, null);
        }
        if (i12 == 2) {
            float f12 = lVar.f43993e;
            return new IconButtonGeometry(f12, f12, kVar.f43979c, lVar.f43999k, SpinnerSize.Small, aVar.f43898e, mVar.f44019p, null);
        }
        if (i12 == 3) {
            float f13 = lVar.f43995g;
            return new IconButtonGeometry(f13, f13, kVar.f43979c, lVar.l, SpinnerSize.Tiny, aVar.f43898e, mVar.f44019p, null);
        }
        e40.a.f();
        return null;
    }
}
