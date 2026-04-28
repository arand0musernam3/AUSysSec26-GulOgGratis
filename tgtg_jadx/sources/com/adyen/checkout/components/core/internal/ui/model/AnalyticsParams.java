package com.adyen.checkout.components.core.internal.ui.model;

import com.adyen.checkout.components.core.AnalyticsConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u0015\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\bHÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/adyen/checkout/components/core/internal/ui/model/AnalyticsParams;", "", "analyticsConfiguration", "Lcom/adyen/checkout/components/core/AnalyticsConfiguration;", "clientKey", "", "(Lcom/adyen/checkout/components/core/AnalyticsConfiguration;Ljava/lang/String;)V", "level", "Lcom/adyen/checkout/components/core/internal/ui/model/AnalyticsParamsLevel;", "(Lcom/adyen/checkout/components/core/internal/ui/model/AnalyticsParamsLevel;Ljava/lang/String;)V", "getClientKey", "()Ljava/lang/String;", "getLevel", "()Lcom/adyen/checkout/components/core/internal/ui/model/AnalyticsParamsLevel;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class AnalyticsParams {

    @NotNull
    private final String clientKey;

    @NotNull
    private final AnalyticsParamsLevel level;

    public AnalyticsParams(@NotNull AnalyticsParamsLevel analyticsParamsLevel, @NotNull String str) {
        analyticsParamsLevel.getClass();
        str.getClass();
        this.level = analyticsParamsLevel;
        this.clientKey = str;
    }

    public static /* synthetic */ AnalyticsParams copy$default(AnalyticsParams analyticsParams, AnalyticsParamsLevel analyticsParamsLevel, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            analyticsParamsLevel = analyticsParams.level;
        }
        if ((i11 & 2) != 0) {
            str = analyticsParams.clientKey;
        }
        return analyticsParams.copy(analyticsParamsLevel, str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AnalyticsParamsLevel getLevel() {
        return this.level;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getClientKey() {
        return this.clientKey;
    }

    @NotNull
    public final AnalyticsParams copy(@NotNull AnalyticsParamsLevel level, @NotNull String clientKey) {
        level.getClass();
        clientKey.getClass();
        return new AnalyticsParams(level, clientKey);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnalyticsParams)) {
            return false;
        }
        AnalyticsParams analyticsParams = (AnalyticsParams) other;
        return this.level == analyticsParams.level && Intrinsics.areEqual(this.clientKey, analyticsParams.clientKey);
    }

    @NotNull
    public final String getClientKey() {
        return this.clientKey;
    }

    @NotNull
    public final AnalyticsParamsLevel getLevel() {
        return this.level;
    }

    public int hashCode() {
        return this.clientKey.hashCode() + (this.level.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "AnalyticsParams(level=" + this.level + ", clientKey=" + this.clientKey + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AnalyticsParams(@Nullable AnalyticsConfiguration analyticsConfiguration, @NotNull String str) {
        this(AnalyticsParamsKt.getLevel(analyticsConfiguration), str);
        str.getClass();
    }
}
