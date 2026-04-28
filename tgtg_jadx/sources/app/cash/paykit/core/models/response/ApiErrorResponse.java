package app.cash.paykit.core.models.response;

import a60.i;
import a60.l;
import e0.f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@l(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u0007\u001a\u00020\u00002\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lapp/cash/paykit/core/models/response/ApiErrorResponse;", "", "", "Lapp/cash/paykit/core/models/response/ApiError;", "apiErrors", "<init>", "(Ljava/util/List;)V", "copy", "(Ljava/util/List;)Lapp/cash/paykit/core/models/response/ApiErrorResponse;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ApiErrorResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f4669a;

    public ApiErrorResponse(@i(name = "errors") @NotNull List<ApiError> list) {
        list.getClass();
        this.f4669a = list;
    }

    @NotNull
    public final ApiErrorResponse copy(@i(name = "errors") @NotNull List<ApiError> apiErrors) {
        apiErrors.getClass();
        return new ApiErrorResponse(apiErrors);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ApiErrorResponse) && Intrinsics.areEqual(this.f4669a, ((ApiErrorResponse) obj).f4669a);
    }

    public final int hashCode() {
        return this.f4669a.hashCode();
    }

    public final String toString() {
        return f.m("ApiErrorResponse(apiErrors=", ")", this.f4669a);
    }
}
