package com.adyen.checkout.components.core.internal.ui.model;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0019\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\fJ4\u0010\u0010\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001R!\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/adyen/checkout/components/core/internal/ui/model/SessionInstallmentConfiguration;", "", "installmentOptions", "", "", "Lcom/adyen/checkout/components/core/internal/ui/model/SessionInstallmentOptionsParams;", "showInstallmentAmount", "", "(Ljava/util/Map;Ljava/lang/Boolean;)V", "getInstallmentOptions", "()Ljava/util/Map;", "getShowInstallmentAmount", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Ljava/util/Map;Ljava/lang/Boolean;)Lcom/adyen/checkout/components/core/internal/ui/model/SessionInstallmentConfiguration;", "equals", "other", "hashCode", "", "toString", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SessionInstallmentConfiguration {

    @Nullable
    private final Map<String, SessionInstallmentOptionsParams> installmentOptions;

    @Nullable
    private final Boolean showInstallmentAmount;

    public SessionInstallmentConfiguration(@Nullable Map<String, SessionInstallmentOptionsParams> map, @Nullable Boolean bool) {
        this.installmentOptions = map;
        this.showInstallmentAmount = bool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SessionInstallmentConfiguration copy$default(SessionInstallmentConfiguration sessionInstallmentConfiguration, Map map, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            map = sessionInstallmentConfiguration.installmentOptions;
        }
        if ((i11 & 2) != 0) {
            bool = sessionInstallmentConfiguration.showInstallmentAmount;
        }
        return sessionInstallmentConfiguration.copy(map, bool);
    }

    @Nullable
    public final Map<String, SessionInstallmentOptionsParams> component1() {
        return this.installmentOptions;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getShowInstallmentAmount() {
        return this.showInstallmentAmount;
    }

    @NotNull
    public final SessionInstallmentConfiguration copy(@Nullable Map<String, SessionInstallmentOptionsParams> installmentOptions, @Nullable Boolean showInstallmentAmount) {
        return new SessionInstallmentConfiguration(installmentOptions, showInstallmentAmount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionInstallmentConfiguration)) {
            return false;
        }
        SessionInstallmentConfiguration sessionInstallmentConfiguration = (SessionInstallmentConfiguration) other;
        return Intrinsics.areEqual(this.installmentOptions, sessionInstallmentConfiguration.installmentOptions) && Intrinsics.areEqual(this.showInstallmentAmount, sessionInstallmentConfiguration.showInstallmentAmount);
    }

    @Nullable
    public final Map<String, SessionInstallmentOptionsParams> getInstallmentOptions() {
        return this.installmentOptions;
    }

    @Nullable
    public final Boolean getShowInstallmentAmount() {
        return this.showInstallmentAmount;
    }

    public int hashCode() {
        Map<String, SessionInstallmentOptionsParams> map = this.installmentOptions;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        Boolean bool = this.showInstallmentAmount;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SessionInstallmentConfiguration(installmentOptions=" + this.installmentOptions + ", showInstallmentAmount=" + this.showInstallmentAmount + ")";
    }
}
