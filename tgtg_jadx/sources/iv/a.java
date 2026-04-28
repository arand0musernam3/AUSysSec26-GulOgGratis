package iv;

import e0.f;
import kotlin.jvm.internal.Intrinsics;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f24202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f24203d;

    public a(String str, String str2, String str3, String str4) {
        this.f24200a = str;
        this.f24201b = str2;
        this.f24202c = str3;
        this.f24203d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f24200a, aVar.f24200a) && Intrinsics.areEqual(this.f24201b, aVar.f24201b) && Intrinsics.areEqual(this.f24202c, aVar.f24202c) && Intrinsics.areEqual(this.f24203d, aVar.f24203d);
    }

    public final int hashCode() {
        return this.f24203d.hashCode() + l1.b(l1.b(this.f24200a.hashCode() * 31, 31, this.f24201b), 31, this.f24202c);
    }

    public final String toString() {
        return f.o(f.t("ZendeskConfig(channelKey=", this.f24200a, ", orderIdFieldKey=", this.f24201b, ", userIdFieldKey="), this.f24202c, ", appLanguageFieldKey=", this.f24203d, ")");
    }
}
