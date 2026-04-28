package com.adyen.checkout.components.core.internal.ui.model;

import e0.f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\fJ\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J>\u0010\u0012\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0004HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/adyen/checkout/components/core/internal/ui/model/SessionInstallmentOptionsParams;", "", "plans", "", "", "preselectedValue", "", "values", "(Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;)V", "getPlans", "()Ljava/util/List;", "getPreselectedValue", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getValues", "component1", "component2", "component3", "copy", "(Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;)Lcom/adyen/checkout/components/core/internal/ui/model/SessionInstallmentOptionsParams;", "equals", "", "other", "hashCode", "toString", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SessionInstallmentOptionsParams {

    @Nullable
    private final List<String> plans;

    @Nullable
    private final Integer preselectedValue;

    @Nullable
    private final List<Integer> values;

    public SessionInstallmentOptionsParams(@Nullable List<String> list, @Nullable Integer num, @Nullable List<Integer> list2) {
        this.plans = list;
        this.preselectedValue = num;
        this.values = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SessionInstallmentOptionsParams copy$default(SessionInstallmentOptionsParams sessionInstallmentOptionsParams, List list, Integer num, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = sessionInstallmentOptionsParams.plans;
        }
        if ((i11 & 2) != 0) {
            num = sessionInstallmentOptionsParams.preselectedValue;
        }
        if ((i11 & 4) != 0) {
            list2 = sessionInstallmentOptionsParams.values;
        }
        return sessionInstallmentOptionsParams.copy(list, num, list2);
    }

    @Nullable
    public final List<String> component1() {
        return this.plans;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getPreselectedValue() {
        return this.preselectedValue;
    }

    @Nullable
    public final List<Integer> component3() {
        return this.values;
    }

    @NotNull
    public final SessionInstallmentOptionsParams copy(@Nullable List<String> plans, @Nullable Integer preselectedValue, @Nullable List<Integer> values) {
        return new SessionInstallmentOptionsParams(plans, preselectedValue, values);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionInstallmentOptionsParams)) {
            return false;
        }
        SessionInstallmentOptionsParams sessionInstallmentOptionsParams = (SessionInstallmentOptionsParams) other;
        return Intrinsics.areEqual(this.plans, sessionInstallmentOptionsParams.plans) && Intrinsics.areEqual(this.preselectedValue, sessionInstallmentOptionsParams.preselectedValue) && Intrinsics.areEqual(this.values, sessionInstallmentOptionsParams.values);
    }

    @Nullable
    public final List<String> getPlans() {
        return this.plans;
    }

    @Nullable
    public final Integer getPreselectedValue() {
        return this.preselectedValue;
    }

    @Nullable
    public final List<Integer> getValues() {
        return this.values;
    }

    public int hashCode() {
        List<String> list = this.plans;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.preselectedValue;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<Integer> list2 = this.values;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<String> list = this.plans;
        Integer num = this.preselectedValue;
        List<Integer> list2 = this.values;
        StringBuilder sb2 = new StringBuilder("SessionInstallmentOptionsParams(plans=");
        sb2.append(list);
        sb2.append(", preselectedValue=");
        sb2.append(num);
        sb2.append(", values=");
        return f.p(sb2, list2, ")");
    }
}
