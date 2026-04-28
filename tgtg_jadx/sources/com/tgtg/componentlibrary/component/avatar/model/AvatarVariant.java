package com.tgtg.componentlibrary.component.avatar.model;

import a80.a;
import a80.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/tgtg/componentlibrary/component/avatar/model/AvatarVariant;", "", "Image", "Text", "IconFilled", "IconTransparent", "Illustration", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AvatarVariant {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AvatarVariant[] $VALUES;
    public static final AvatarVariant IconFilled;
    public static final AvatarVariant IconTransparent;
    public static final AvatarVariant Illustration;
    public static final AvatarVariant Image;
    public static final AvatarVariant Text;

    static {
        AvatarVariant avatarVariant = new AvatarVariant("Image", 0);
        Image = avatarVariant;
        AvatarVariant avatarVariant2 = new AvatarVariant("Text", 1);
        Text = avatarVariant2;
        AvatarVariant avatarVariant3 = new AvatarVariant("IconFilled", 2);
        IconFilled = avatarVariant3;
        AvatarVariant avatarVariant4 = new AvatarVariant("IconTransparent", 3);
        IconTransparent = avatarVariant4;
        AvatarVariant avatarVariant5 = new AvatarVariant("Illustration", 4);
        Illustration = avatarVariant5;
        AvatarVariant[] avatarVariantArr = {avatarVariant, avatarVariant2, avatarVariant3, avatarVariant4, avatarVariant5};
        $VALUES = avatarVariantArr;
        $ENTRIES = new b(avatarVariantArr);
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static AvatarVariant valueOf(String str) {
        return (AvatarVariant) Enum.valueOf(AvatarVariant.class, str);
    }

    public static AvatarVariant[] values() {
        return (AvatarVariant[]) $VALUES.clone();
    }
}
