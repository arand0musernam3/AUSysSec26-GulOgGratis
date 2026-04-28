package ai;

import b3.i;
import i90.h;
import j4.s;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r8.k;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f1489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f1490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f1491e;

    public /* synthetic */ f(int i11, String str, String str2, boolean z11, boolean z12, boolean z13) {
        if ((i11 & 1) == 0) {
            this.f1487a = false;
        } else {
            this.f1487a = z11;
        }
        if ((i11 & 2) == 0) {
            this.f1488b = false;
        } else {
            this.f1488b = z12;
        }
        if ((i11 & 4) == 0) {
            this.f1489c = "";
        } else {
            this.f1489c = str;
        }
        if ((i11 & 8) == 0) {
            this.f1490d = "";
        } else {
            this.f1490d = str2;
        }
        if ((i11 & 16) == 0) {
            this.f1491e = false;
        } else {
            this.f1491e = z13;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f1487a == fVar.f1487a && this.f1488b == fVar.f1488b && Intrinsics.areEqual(this.f1489c, fVar.f1489c) && Intrinsics.areEqual(this.f1490d, fVar.f1490d) && this.f1491e == fVar.f1491e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f1491e) + l1.b(l1.b(k.e(Boolean.hashCode(this.f1487a) * 31, 31, this.f1488b), 31, this.f1489c), 31, this.f1490d);
    }

    public final String toString() {
        StringBuilder sbP = i.p("CharityUserSettingsResponse(pushNotifications=", this.f1487a, ", smsNotifications=", this.f1488b, ", prefix=");
        s.A(sbP, this.f1489c, ", phoneNumber=", this.f1490d, ", orderEmails=");
        return s.o(sbP, this.f1491e, ")");
    }
}
