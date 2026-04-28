package app.cash.paykit.core.models.response;

import a60.i;
import a60.l;
import e0.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@l(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ<\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lapp/cash/paykit/core/models/response/ApiError;", "", "", "category", "code", "detail", "field_value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lapp/cash/paykit/core/models/response/ApiError;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ApiError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f4665d;

    public ApiError(@i(name = "category") @NotNull String str, @i(name = "code") @NotNull String str2, @i(name = "detail") @Nullable String str3, @i(name = "field") @Nullable String str4) {
        str.getClass();
        str2.getClass();
        this.f4662a = str;
        this.f4663b = str2;
        this.f4664c = str3;
        this.f4665d = str4;
    }

    @NotNull
    public final ApiError copy(@i(name = "category") @NotNull String category, @i(name = "code") @NotNull String code, @i(name = "detail") @Nullable String detail, @i(name = "field") @Nullable String field_value) {
        category.getClass();
        code.getClass();
        return new ApiError(category, code, detail, field_value);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApiError)) {
            return false;
        }
        ApiError apiError = (ApiError) obj;
        return Intrinsics.areEqual(this.f4662a, apiError.f4662a) && Intrinsics.areEqual(this.f4663b, apiError.f4663b) && Intrinsics.areEqual(this.f4664c, apiError.f4664c) && Intrinsics.areEqual(this.f4665d, apiError.f4665d);
    }

    public final int hashCode() {
        int iB = l1.b(this.f4662a.hashCode() * 31, 31, this.f4663b);
        String str = this.f4664c;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f4665d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return f.o(f.t("ApiError(category=", this.f4662a, ", code=", this.f4663b, ", detail="), this.f4664c, ", field_value=", this.f4665d, ")");
    }
}
