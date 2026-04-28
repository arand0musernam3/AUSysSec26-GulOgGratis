package com.tgtg.componentlibrary.component.avatar.ext;

import com.tgtg.componentlibrary.component.avatar.model.AvatarGeometry;
import com.tgtg.componentlibrary.component.avatar.model.AvatarSize;
import com.tgtg.componentlibrary.component.avatar.model.AvatarVariant;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import m3.n;
import m3.s;
import m5.u0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x60.a;
import x60.j;
import x60.k;
import x60.l;
import x60.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tgtg/componentlibrary/component/avatar/model/AvatarSize;", "size", "Lcom/tgtg/componentlibrary/component/avatar/model/AvatarVariant;", "variant", "Lcom/tgtg/componentlibrary/component/avatar/model/AvatarGeometry;", "avatarGeometryFor", "(Lcom/tgtg/componentlibrary/component/avatar/model/AvatarSize;Lcom/tgtg/componentlibrary/component/avatar/model/AvatarVariant;Lm3/n;I)Lcom/tgtg/componentlibrary/component/avatar/model/AvatarGeometry;", "app_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAvatarGeometryExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AvatarGeometryExt.kt\ncom/tgtg/componentlibrary/component/avatar/ext/AvatarGeometryExtKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,62:1\n75#2:63\n75#2:64\n75#2:65\n75#2:66\n75#2:67\n*S KotlinDebug\n*F\n+ 1 AvatarGeometryExt.kt\ncom/tgtg/componentlibrary/component/avatar/ext/AvatarGeometryExtKt\n*L\n15#1:63\n16#1:64\n17#1:65\n18#1:66\n19#1:67\n*E\n"})
public final class AvatarGeometryExtKt {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AvatarSize.values().length];
            try {
                iArr[AvatarSize.Small.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AvatarSize.Medium.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AvatarSize.Large.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AvatarSize.XLarge.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final AvatarGeometry avatarGeometryFor(@NotNull AvatarSize avatarSize, @NotNull AvatarVariant avatarVariant, @Nullable n nVar, int i11) {
        float f11;
        float f12;
        u0 u0Var;
        float f13;
        avatarSize.getClass();
        avatarVariant.getClass();
        s sVar = (s) nVar;
        l lVar = (l) sVar.j(PantryThemeKt.getLocalPantrySize());
        j jVar = (j) sVar.j(PantryThemeKt.getLocalPantryTypography());
        m mVar = (m) sVar.j(PantryThemeKt.getLocalPantrySpacing());
        k kVar = (k) sVar.j(PantryThemeKt.getLocalPantryRadius());
        a aVar = (a) sVar.j(PantryThemeKt.getLocalPantryBorder());
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i12 = iArr[avatarSize.ordinal()];
        if (i12 == 1) {
            f11 = lVar.f43993e;
        } else if (i12 == 2) {
            f11 = lVar.f43994f;
        } else if (i12 == 3) {
            f11 = lVar.f43990b;
        } else {
            if (i12 != 4) {
                e40.a.f();
                return null;
            }
            f11 = lVar.f43992d;
        }
        float f14 = f11;
        int i13 = iArr[avatarSize.ordinal()];
        if (i13 == 1) {
            f12 = lVar.f43999k;
        } else if (i13 == 2) {
            f12 = lVar.f43995g;
        } else if (i13 == 3) {
            f12 = lVar.f43993e;
        } else {
            if (i13 != 4) {
                e40.a.f();
                return null;
            }
            f12 = lVar.f43994f;
        }
        float f15 = f12;
        int i14 = iArr[avatarSize.ordinal()];
        if (i14 == 1) {
            u0Var = jVar.f43972v;
        } else if (i14 == 2) {
            u0Var = jVar.f43971u;
        } else if (i14 == 3) {
            u0Var = jVar.f43970t;
        } else {
            if (i14 != 4) {
                e40.a.f();
                return null;
            }
            u0Var = jVar.f43969s;
        }
        u0 u0Var2 = u0Var;
        if (avatarVariant == AvatarVariant.Image) {
            int i15 = iArr[avatarSize.ordinal()];
            if (i15 == 1 || i15 == 2) {
                f13 = aVar.f43895b;
            } else if (i15 == 3) {
                f13 = aVar.f43896c;
            } else {
                if (i15 != 4) {
                    e40.a.f();
                    return null;
                }
                f13 = aVar.f43898e;
            }
        } else {
            f13 = aVar.f43894a;
        }
        return new AvatarGeometry(f14, f15, u0Var2, kVar.f43979c, mVar.f44020q, f13, null);
    }
}
