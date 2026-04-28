package com.adyen.checkout.card;

import a80.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/adyen/checkout/card/SocialSecurityNumberVisibility;", "", "(Ljava/lang/String;I)V", "SHOW", "HIDE", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SocialSecurityNumberVisibility {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ SocialSecurityNumberVisibility[] $VALUES;
    public static final SocialSecurityNumberVisibility SHOW = new SocialSecurityNumberVisibility("SHOW", 0);
    public static final SocialSecurityNumberVisibility HIDE = new SocialSecurityNumberVisibility("HIDE", 1);

    private static final /* synthetic */ SocialSecurityNumberVisibility[] $values() {
        return new SocialSecurityNumberVisibility[]{SHOW, HIDE};
    }

    static {
        SocialSecurityNumberVisibility[] socialSecurityNumberVisibilityArr$values = $values();
        $VALUES = socialSecurityNumberVisibilityArr$values;
        $ENTRIES = n.w(socialSecurityNumberVisibilityArr$values);
    }

    private SocialSecurityNumberVisibility(String str, int i11) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static SocialSecurityNumberVisibility valueOf(String str) {
        return (SocialSecurityNumberVisibility) Enum.valueOf(SocialSecurityNumberVisibility.class, str);
    }

    public static SocialSecurityNumberVisibility[] values() {
        return (SocialSecurityNumberVisibility[]) $VALUES.clone();
    }
}
