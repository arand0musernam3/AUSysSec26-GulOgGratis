package mi;

import b3.i;
import j4.s;
import kotlin.jvm.internal.Intrinsics;
import r8.k;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f29963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f29964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f29965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f29966d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f29967e;

    public b(boolean z11, boolean z12, String str, String str2, boolean z13) {
        str.getClass();
        str2.getClass();
        this.f29963a = z11;
        this.f29964b = z12;
        this.f29965c = str;
        this.f29966d = str2;
        this.f29967e = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f29963a == bVar.f29963a && this.f29964b == bVar.f29964b && Intrinsics.areEqual(this.f29965c, bVar.f29965c) && Intrinsics.areEqual(this.f29966d, bVar.f29966d) && this.f29967e == bVar.f29967e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f29967e) + l1.b(l1.b(k.e(Boolean.hashCode(this.f29963a) * 31, 31, this.f29964b), 31, this.f29965c), 31, this.f29966d);
    }

    public final String toString() {
        StringBuilder sbP = i.p("CharityNotificationsSettingsToSave(pushNotifications=", this.f29963a, ", smsNotifications=", this.f29964b, ", prefix=");
        s.A(sbP, this.f29965c, ", phone=", this.f29966d, ", emails=");
        return s.o(sbP, this.f29967e, ")");
    }
}
