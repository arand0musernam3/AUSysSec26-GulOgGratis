package com.tgtg.componentlibrary.component.avatar.ext;

import com.tgtg.componentlibrary.component.avatar.model.AvatarColors;
import com.tgtg.componentlibrary.component.avatar.model.AvatarVariant;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import e40.a;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import m3.n;
import m3.s;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x60.h;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tgtg/componentlibrary/component/avatar/model/AvatarVariant;", "variant", "Lcom/tgtg/componentlibrary/component/avatar/model/AvatarColors;", "avatarColorsFor", "(Lcom/tgtg/componentlibrary/component/avatar/model/AvatarVariant;Lm3/n;I)Lcom/tgtg/componentlibrary/component/avatar/model/AvatarColors;", "app_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAvatarColorsExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AvatarColorsExt.kt\ncom/tgtg/componentlibrary/component/avatar/ext/AvatarColorsExtKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,40:1\n75#2:41\n*S KotlinDebug\n*F\n+ 1 AvatarColorsExt.kt\ncom/tgtg/componentlibrary/component/avatar/ext/AvatarColorsExtKt\n*L\n10#1:41\n*E\n"})
public final class AvatarColorsExtKt {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AvatarVariant.values().length];
            try {
                iArr[AvatarVariant.Image.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AvatarVariant.Text.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AvatarVariant.IconFilled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AvatarVariant.IconTransparent.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AvatarVariant.Illustration.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final AvatarColors avatarColorsFor(@NotNull AvatarVariant avatarVariant, @Nullable n nVar, int i11) {
        avatarVariant.getClass();
        h hVar = (h) ((s) nVar).j(PantryThemeKt.getLocalPantryColor());
        int i12 = WhenMappings.$EnumSwitchMapping$0[avatarVariant.ordinal()];
        if (i12 == 1) {
            return new AvatarColors(0L, 0L, hVar.f43922i0, 3, null);
        }
        if (i12 == 2) {
            return new AvatarColors(hVar.f43925k, hVar.T, 0L, 4, null);
        }
        if (i12 == 3) {
            return new AvatarColors(hVar.B, hVar.J, 0L, 4, null);
        }
        if (i12 == 4) {
            return new AvatarColors(hVar.f43944u0, hVar.J, 0L, 4, null);
        }
        if (i12 == 5) {
            return new AvatarColors(0L, 0L, 0L, 7, null);
        }
        a.f();
        return null;
    }
}
