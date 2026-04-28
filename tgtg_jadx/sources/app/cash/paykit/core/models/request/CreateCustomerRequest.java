package app.cash.paykit.core.models.request;

import a60.i;
import a60.l;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@l(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lapp/cash/paykit/core/models/request/CreateCustomerRequest;", "", "", "idempotencyKey", "Lapp/cash/paykit/core/models/request/CustomerRequestData;", "customerRequestData", "<init>", "(Ljava/lang/String;Lapp/cash/paykit/core/models/request/CustomerRequestData;)V", "copy", "(Ljava/lang/String;Lapp/cash/paykit/core/models/request/CustomerRequestData;)Lapp/cash/paykit/core/models/request/CreateCustomerRequest;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CreateCustomerRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CustomerRequestData f4649b;

    public CreateCustomerRequest(@i(name = "idempotency_key") @Nullable String str, @i(name = "request") @NotNull CustomerRequestData customerRequestData) {
        customerRequestData.getClass();
        this.f4648a = str;
        this.f4649b = customerRequestData;
    }

    @NotNull
    public final CreateCustomerRequest copy(@i(name = "idempotency_key") @Nullable String idempotencyKey, @i(name = "request") @NotNull CustomerRequestData customerRequestData) {
        customerRequestData.getClass();
        return new CreateCustomerRequest(idempotencyKey, customerRequestData);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateCustomerRequest)) {
            return false;
        }
        CreateCustomerRequest createCustomerRequest = (CreateCustomerRequest) obj;
        return Intrinsics.areEqual(this.f4648a, createCustomerRequest.f4648a) && Intrinsics.areEqual(this.f4649b, createCustomerRequest.f4649b);
    }

    public final int hashCode() {
        String str = this.f4648a;
        return this.f4649b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "CreateCustomerRequest(idempotencyKey=" + this.f4648a + ", customerRequestData=" + this.f4649b + ")";
    }

    public /* synthetic */ CreateCustomerRequest(String str, CustomerRequestData customerRequestData, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, customerRequestData);
    }
}
