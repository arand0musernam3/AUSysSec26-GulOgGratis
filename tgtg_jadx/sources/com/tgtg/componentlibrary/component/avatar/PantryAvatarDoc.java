package com.tgtg.componentlibrary.component.avatar;

import c60.c;
import com.braze.Constants;
import com.tgtg.componentlibrary.component.avatar.model.AvatarSize;
import com.tgtg.componentlibrary.component.avatar.model.AvatarVariant;
import com.tgtg.componentlibrary.component.avatar.variant.PantryAvatarIconFilledKt;
import com.tgtg.componentlibrary.component.avatar.variant.PantryAvatarIconTransparentKt;
import com.tgtg.componentlibrary.component.avatar.variant.PantryAvatarIllustrationKt;
import com.tgtg.componentlibrary.component.avatar.variant.PantryAvatarImageKt;
import com.tgtg.componentlibrary.component.avatar.variant.PantryAvatarTextKt;
import e0.f;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.y;
import m3.n;
import m3.s;
import m3.w1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\r\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\t\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\n\u0010\u000bR \u0010\u0014\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0013\u0010\u0003\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0016\u001a\u00020\u00158\u0006X\u0087D¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u001a\u0010\u0003\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/tgtg/componentlibrary/component/avatar/PantryAvatarDoc;", "", "<init>", "()V", "", "PantryAvatar", "(Lm3/n;I)V", "Lcom/tgtg/componentlibrary/component/avatar/model/AvatarVariant;", Constants.BRAZE_PUSH_CONTENT_KEY, "Lcom/tgtg/componentlibrary/component/avatar/model/AvatarVariant;", "getVariant", "()Lcom/tgtg/componentlibrary/component/avatar/model/AvatarVariant;", "getVariant$annotations", "variant", "Lcom/tgtg/componentlibrary/component/avatar/model/AvatarSize;", "b", "Lcom/tgtg/componentlibrary/component/avatar/model/AvatarSize;", "getSize", "()Lcom/tgtg/componentlibrary/component/avatar/model/AvatarSize;", "getSize$annotations", "size", "", "badge", "Z", "getBadge", "()Z", "getBadge$annotations", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PantryAvatarDoc {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final AvatarVariant variant = (AvatarVariant) ((Pair) y.x(new Pair[]{new Pair("Image", AvatarVariant.Image), new Pair("Text", AvatarVariant.Text), new Pair("Icon filled", AvatarVariant.IconFilled), new Pair("Icon transparent", AvatarVariant.IconTransparent), new Pair("Illustration", AvatarVariant.Illustration)})).f26486b;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final AvatarSize size = (AvatarSize) ((Pair) y.x(new Pair[]{new Pair("Small", AvatarSize.Small), new Pair("Medium", AvatarSize.Medium), new Pair("Large", AvatarSize.Large), new Pair("XLarge", AvatarSize.XLarge)})).f26486b;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AvatarVariant.values().length];
            try {
                iArr[AvatarVariant.Text.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AvatarVariant.Image.ordinal()] = 2;
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

    public final void PantryAvatar(@Nullable n nVar, int i11) {
        int i12;
        s sVar = (s) nVar;
        sVar.c0(183046326);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(this) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            int i13 = WhenMappings.$EnumSwitchMapping$0[this.variant.ordinal()];
            if (i13 == 1) {
                sVar.a0(-186137157);
                PantryAvatarTextKt.PantryAvatarText("JM", null, "User", this.size, sVar, 390, 2);
                sVar.q(false);
            } else if (i13 == 2) {
                sVar.a0(-186131460);
                PantryAvatarImageKt.PantryAvatarImage(ComposableSingletons$PantryAvatarDoc_figmaKt.INSTANCE.m551getLambda$1512243897$app_release(), null, "Avatar", this.size, sVar, 390, 2);
                sVar.q(false);
            } else if (i13 == 3) {
                sVar.a0(-186117634);
                PantryAvatarIconFilledKt.PantryAvatarIconFilled(ComposableSingletons$PantryAvatarDoc_figmaKt.INSTANCE.getLambda$1620633278$app_release(), null, "Avatar", this.size, sVar, 390, 2);
                sVar.q(false);
            } else if (i13 == 4) {
                sVar.a0(-186103581);
                PantryAvatarIconTransparentKt.PantryAvatarIconTransparent(ComposableSingletons$PantryAvatarDoc_figmaKt.INSTANCE.getLambda$1750758339$app_release(), null, "Avatar", this.size, sVar, 390, 2);
                sVar.q(false);
            } else {
                if (i13 != 5) {
                    throw f.v(sVar, -186136970, false);
                }
                sVar.a0(-186089457);
                PantryAvatarIllustrationKt.PantryAvatarIllustration(ComposableSingletons$PantryAvatarDoc_figmaKt.INSTANCE.getLambda$1033371793$app_release(), null, "Avatar", this.size, sVar, 390, 2);
                sVar.q(false);
            }
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new c(this, i11, 0);
        }
    }

    public final boolean getBadge() {
        return false;
    }

    @NotNull
    public final AvatarSize getSize() {
        return this.size;
    }

    @NotNull
    public final AvatarVariant getVariant() {
        return this.variant;
    }

    public static /* synthetic */ void getBadge$annotations() {
    }

    public static /* synthetic */ void getSize$annotations() {
    }

    public static /* synthetic */ void getVariant$annotations() {
    }
}
