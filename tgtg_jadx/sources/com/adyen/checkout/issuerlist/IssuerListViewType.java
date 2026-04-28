package com.adyen.checkout.issuerlist;

import a80.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/adyen/checkout/issuerlist/IssuerListViewType;", "", "(Ljava/lang/String;I)V", "RECYCLER_VIEW", "SPINNER_VIEW", "issuer-list_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class IssuerListViewType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ IssuerListViewType[] $VALUES;
    public static final IssuerListViewType RECYCLER_VIEW = new IssuerListViewType("RECYCLER_VIEW", 0);
    public static final IssuerListViewType SPINNER_VIEW = new IssuerListViewType("SPINNER_VIEW", 1);

    private static final /* synthetic */ IssuerListViewType[] $values() {
        return new IssuerListViewType[]{RECYCLER_VIEW, SPINNER_VIEW};
    }

    static {
        IssuerListViewType[] issuerListViewTypeArr$values = $values();
        $VALUES = issuerListViewTypeArr$values;
        $ENTRIES = n.w(issuerListViewTypeArr$values);
    }

    private IssuerListViewType(String str, int i11) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static IssuerListViewType valueOf(String str) {
        return (IssuerListViewType) Enum.valueOf(IssuerListViewType.class, str);
    }

    public static IssuerListViewType[] values() {
        return (IssuerListViewType[]) $VALUES.clone();
    }
}
