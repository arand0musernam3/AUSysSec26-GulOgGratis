package app.cash.paykit.core.models.response;

import a60.i;
import a60.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@l(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lapp/cash/paykit/core/models/response/CustomerTopLevelResponse;", "", "Lapp/cash/paykit/core/models/response/CustomerResponseData;", "customerResponseData", "<init>", "(Lapp/cash/paykit/core/models/response/CustomerResponseData;)V", "copy", "(Lapp/cash/paykit/core/models/response/CustomerResponseData;)Lapp/cash/paykit/core/models/response/CustomerTopLevelResponse;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CustomerTopLevelResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CustomerResponseData f4706a;

    public CustomerTopLevelResponse(@i(name = "request") @NotNull CustomerResponseData customerResponseData) {
        customerResponseData.getClass();
        this.f4706a = customerResponseData;
    }

    @NotNull
    public final CustomerTopLevelResponse copy(@i(name = "request") @NotNull CustomerResponseData customerResponseData) {
        customerResponseData.getClass();
        return new CustomerTopLevelResponse(customerResponseData);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CustomerTopLevelResponse) && Intrinsics.areEqual(this.f4706a, ((CustomerTopLevelResponse) obj).f4706a);
    }

    public final int hashCode() {
        return this.f4706a.hashCode();
    }

    public final String toString() {
        return "CustomerTopLevelResponse(customerResponseData=" + this.f4706a + ")";
    }
}
