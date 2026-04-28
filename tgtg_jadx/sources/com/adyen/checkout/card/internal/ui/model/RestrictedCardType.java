package com.adyen.checkout.card.internal.ui.model;

import a80.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/adyen/checkout/card/internal/ui/model/RestrictedCardType;", "", "txVariant", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getTxVariant", "()Ljava/lang/String;", "ACCEL", "PULSE", "STAR", "NYCE", "Companion", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RestrictedCardType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ RestrictedCardType[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private final String txVariant;
    public static final RestrictedCardType ACCEL = new RestrictedCardType("ACCEL", 0, "accel");
    public static final RestrictedCardType PULSE = new RestrictedCardType("PULSE", 1, "pulse");
    public static final RestrictedCardType STAR = new RestrictedCardType("STAR", 2, "star");
    public static final RestrictedCardType NYCE = new RestrictedCardType("NYCE", 3, "nyce");

    private static final /* synthetic */ RestrictedCardType[] $values() {
        return new RestrictedCardType[]{ACCEL, PULSE, STAR, NYCE};
    }

    static {
        RestrictedCardType[] restrictedCardTypeArr$values = $values();
        $VALUES = restrictedCardTypeArr$values;
        $ENTRIES = n.w(restrictedCardTypeArr$values);
        INSTANCE = new Companion(null);
    }

    private RestrictedCardType(String str, int i11, String str2) {
        this.txVariant = str2;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static RestrictedCardType valueOf(String str) {
        return (RestrictedCardType) Enum.valueOf(RestrictedCardType.class, str);
    }

    public static RestrictedCardType[] values() {
        return (RestrictedCardType[]) $VALUES.clone();
    }

    @NotNull
    public final String getTxVariant() {
        return this.txVariant;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/adyen/checkout/card/internal/ui/model/RestrictedCardType$Companion;", "", "()V", "isRestrictedCardType", "", "brand", "", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nRestrictedCardType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RestrictedCardType.kt\ncom/adyen/checkout/card/internal/ui/model/RestrictedCardType$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,21:1\n12574#2,2:22\n*S KotlinDebug\n*F\n+ 1 RestrictedCardType.kt\ncom/adyen/checkout/card/internal/ui/model/RestrictedCardType$Companion\n*L\n18#1:22,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isRestrictedCardType(@NotNull String brand) {
            brand.getClass();
            for (RestrictedCardType restrictedCardType : RestrictedCardType.values()) {
                if (Intrinsics.areEqual(brand, restrictedCardType.getTxVariant())) {
                    return true;
                }
            }
            return false;
        }

        private Companion() {
        }
    }
}
