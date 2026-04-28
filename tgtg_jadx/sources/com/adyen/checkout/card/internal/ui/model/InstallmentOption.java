package com.adyen.checkout.card.internal.ui.model;

import a80.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/adyen/checkout/card/internal/ui/model/InstallmentOption;", "", "type", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "ONE_TIME", "REGULAR", "REVOLVING", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class InstallmentOption {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ InstallmentOption[] $VALUES;
    public static final InstallmentOption ONE_TIME = new InstallmentOption("ONE_TIME", 0, null);
    public static final InstallmentOption REGULAR = new InstallmentOption("REGULAR", 1, "regular");
    public static final InstallmentOption REVOLVING = new InstallmentOption("REVOLVING", 2, "revolving");

    @Nullable
    private final String type;

    private static final /* synthetic */ InstallmentOption[] $values() {
        return new InstallmentOption[]{ONE_TIME, REGULAR, REVOLVING};
    }

    static {
        InstallmentOption[] installmentOptionArr$values = $values();
        $VALUES = installmentOptionArr$values;
        $ENTRIES = n.w(installmentOptionArr$values);
    }

    private InstallmentOption(String str, int i11, String str2) {
        this.type = str2;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static InstallmentOption valueOf(String str) {
        return (InstallmentOption) Enum.valueOf(InstallmentOption.class, str);
    }

    public static InstallmentOption[] values() {
        return (InstallmentOption[]) $VALUES.clone();
    }

    @Nullable
    public final String getType() {
        return this.type;
    }
}
