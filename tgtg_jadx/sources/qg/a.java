package qg;

import e0.f;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.HttpException;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends Throwable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f37047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f37048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HttpException f37049d;

    public a(String str, String str2, String str3, HttpException httpException) {
        super(str2, httpException);
        this.f37046a = str;
        this.f37047b = str2;
        this.f37048c = str3;
        this.f37049d = httpException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f37046a, aVar.f37046a) && Intrinsics.areEqual(this.f37047b, aVar.f37047b) && Intrinsics.areEqual(this.f37048c, aVar.f37048c) && Intrinsics.areEqual(this.f37049d, aVar.f37049d);
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f37049d;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f37047b;
    }

    public final int hashCode() {
        String str = this.f37046a;
        int iB = l1.b((str == null ? 0 : str.hashCode()) * 31, 31, this.f37047b);
        String str2 = this.f37048c;
        return this.f37049d.hashCode() + ((iB + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sbT = f.t("ApiException(code=", this.f37046a, ", message=", this.f37047b, ", stackTrace=");
        sbT.append(this.f37048c);
        sbT.append(", cause=");
        sbT.append(this.f37049d);
        sbT.append(")");
        return sbT.toString();
    }
}
