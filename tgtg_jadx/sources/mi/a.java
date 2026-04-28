package mi;

import b3.i;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f29959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f29960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f29961c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f29962d;

    public a(boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f29959a = z11;
        this.f29960b = z12;
        this.f29961c = z13;
        this.f29962d = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f29959a == aVar.f29959a && this.f29960b == aVar.f29960b && this.f29961c == aVar.f29961c && this.f29962d == aVar.f29962d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f29962d) + k.e(k.e(Boolean.hashCode(this.f29959a) * 31, 31, this.f29960b), 31, this.f29961c);
    }

    public final String toString() {
        StringBuilder sbP = i.p("CharityNotificationsSettings(pushNotifications=", this.f29959a, ", smsNotifications=", this.f29960b, ", hasPhoneNumber=");
        sbP.append(this.f29961c);
        sbP.append(", emails=");
        sbP.append(this.f29962d);
        sbP.append(")");
        return sbP.toString();
    }
}
