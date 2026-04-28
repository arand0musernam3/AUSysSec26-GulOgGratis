package com.tgtg.componentlibrary.component.avatar.model;

import a80.a;
import a80.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/tgtg/componentlibrary/component/avatar/model/AvatarSize;", "", "Small", "Medium", "Large", "XLarge", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AvatarSize {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AvatarSize[] $VALUES;
    public static final AvatarSize Large;
    public static final AvatarSize Medium;
    public static final AvatarSize Small;
    public static final AvatarSize XLarge;

    static {
        AvatarSize avatarSize = new AvatarSize("Small", 0);
        Small = avatarSize;
        AvatarSize avatarSize2 = new AvatarSize("Medium", 1);
        Medium = avatarSize2;
        AvatarSize avatarSize3 = new AvatarSize("Large", 2);
        Large = avatarSize3;
        AvatarSize avatarSize4 = new AvatarSize("XLarge", 3);
        XLarge = avatarSize4;
        AvatarSize[] avatarSizeArr = {avatarSize, avatarSize2, avatarSize3, avatarSize4};
        $VALUES = avatarSizeArr;
        $ENTRIES = new b(avatarSizeArr);
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static AvatarSize valueOf(String str) {
        return (AvatarSize) Enum.valueOf(AvatarSize.class, str);
    }

    public static AvatarSize[] values() {
        return (AvatarSize[]) $VALUES.clone();
    }
}
