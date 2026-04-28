package com.app.tgtg.model.remote.item.response;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/app/tgtg/model/remote/item/response/HeroComponentType;", "", "<init>", "(Ljava/lang/String;I)V", "ITEMS", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class HeroComponentType {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ HeroComponentType[] $VALUES;
    public static final HeroComponentType ITEMS = new HeroComponentType("ITEMS", 0);

    private static final /* synthetic */ HeroComponentType[] $values() {
        return new HeroComponentType[]{ITEMS};
    }

    static {
        HeroComponentType[] heroComponentTypeArr$values = $values();
        $VALUES = heroComponentTypeArr$values;
        $ENTRIES = n.w(heroComponentTypeArr$values);
    }

    private HeroComponentType(String str, int i11) {
    }

    @NotNull
    public static a80.a getEntries() {
        return $ENTRIES;
    }

    public static HeroComponentType valueOf(String str) {
        return (HeroComponentType) Enum.valueOf(HeroComponentType.class, str);
    }

    public static HeroComponentType[] values() {
        return (HeroComponentType[]) $VALUES.clone();
    }
}
