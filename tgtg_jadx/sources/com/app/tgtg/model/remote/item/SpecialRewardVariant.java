package com.app.tgtg.model.remote.item;

import a80.a;
import com.app.tgtg.R;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/app/tgtg/model/remote/item/SpecialRewardVariant;", "", "doodleResId", "", "<init>", "(Ljava/lang/String;II)V", "getDoodleResId", "()I", "FREE_PRODUCT", "AMOUNT_OFF", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SpecialRewardVariant {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ SpecialRewardVariant[] $VALUES;
    private final int doodleResId;
    public static final SpecialRewardVariant FREE_PRODUCT = new SpecialRewardVariant("FREE_PRODUCT", 0, R.drawable.specialreward_coffee);
    public static final SpecialRewardVariant AMOUNT_OFF = new SpecialRewardVariant("AMOUNT_OFF", 1, R.drawable.specialreward_star);

    private static final /* synthetic */ SpecialRewardVariant[] $values() {
        return new SpecialRewardVariant[]{FREE_PRODUCT, AMOUNT_OFF};
    }

    static {
        SpecialRewardVariant[] specialRewardVariantArr$values = $values();
        $VALUES = specialRewardVariantArr$values;
        $ENTRIES = n.w(specialRewardVariantArr$values);
    }

    private SpecialRewardVariant(String str, int i11, int i12) {
        this.doodleResId = i12;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static SpecialRewardVariant valueOf(String str) {
        return (SpecialRewardVariant) Enum.valueOf(SpecialRewardVariant.class, str);
    }

    public static SpecialRewardVariant[] values() {
        return (SpecialRewardVariant[]) $VALUES.clone();
    }

    public final int getDoodleResId() {
        return this.doodleResId;
    }
}
