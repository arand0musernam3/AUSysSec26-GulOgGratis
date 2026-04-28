package eo;

import kotlin.jvm.internal.Intrinsics;
import r8.k;
import w.a0;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f16190c;

    public a(String str, String str2, String str3) {
        a0.C(str, str2, str3);
        this.f16188a = str;
        this.f16189b = str2;
        this.f16190c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f16188a, aVar.f16188a) && Intrinsics.areEqual(this.f16189b, aVar.f16189b) && Intrinsics.areEqual(this.f16190c, aVar.f16190c);
    }

    public final int hashCode() {
        return this.f16190c.hashCode() + l1.b(this.f16188a.hashCode() * 31, 31, this.f16189b);
    }

    public final String toString() {
        return k.p(e0.f.t("DownloadData(url=", this.f16188a, ", contentDisposition=", this.f16189b, ", mimeType="), this.f16190c, ")");
    }
}
