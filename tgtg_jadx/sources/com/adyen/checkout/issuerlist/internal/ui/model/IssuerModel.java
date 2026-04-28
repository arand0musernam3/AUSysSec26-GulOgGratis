package com.adyen.checkout.issuerlist.internal.ui.model;

import com.adyen.checkout.core.Environment;
import e0.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/adyen/checkout/issuerlist/internal/ui/model/IssuerModel;", "", "id", "", "name", "environment", "Lcom/adyen/checkout/core/Environment;", "(Ljava/lang/String;Ljava/lang/String;Lcom/adyen/checkout/core/Environment;)V", "getEnvironment", "()Lcom/adyen/checkout/core/Environment;", "getId", "()Ljava/lang/String;", "getName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "issuer-list_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class IssuerModel {

    @NotNull
    private final Environment environment;

    @NotNull
    private final String id;

    @NotNull
    private final String name;

    public IssuerModel(@NotNull String str, @NotNull String str2, @NotNull Environment environment) {
        str.getClass();
        str2.getClass();
        environment.getClass();
        this.id = str;
        this.name = str2;
        this.environment = environment;
    }

    public static /* synthetic */ IssuerModel copy$default(IssuerModel issuerModel, String str, String str2, Environment environment, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = issuerModel.id;
        }
        if ((i11 & 2) != 0) {
            str2 = issuerModel.name;
        }
        if ((i11 & 4) != 0) {
            environment = issuerModel.environment;
        }
        return issuerModel.copy(str, str2, environment);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Environment getEnvironment() {
        return this.environment;
    }

    @NotNull
    public final IssuerModel copy(@NotNull String id2, @NotNull String name, @NotNull Environment environment) {
        id2.getClass();
        name.getClass();
        environment.getClass();
        return new IssuerModel(id2, name, environment);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IssuerModel)) {
            return false;
        }
        IssuerModel issuerModel = (IssuerModel) other;
        return Intrinsics.areEqual(this.id, issuerModel.id) && Intrinsics.areEqual(this.name, issuerModel.name) && Intrinsics.areEqual(this.environment, issuerModel.environment);
    }

    @NotNull
    public final Environment getEnvironment() {
        return this.environment;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.environment.hashCode() + l1.b(this.id.hashCode() * 31, 31, this.name);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.name;
        Environment environment = this.environment;
        StringBuilder sbT = f.t("IssuerModel(id=", str, ", name=", str2, ", environment=");
        sbT.append(environment);
        sbT.append(")");
        return sbT.toString();
    }
}
