package nk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f30965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f30966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f30967c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f30968d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f30969e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f30970f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f30971g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f30972h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f30973i;

    public a(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, String str, boolean z16, boolean z17, boolean z18) {
        this.f30965a = z11;
        this.f30966b = z12;
        this.f30967c = z13;
        this.f30968d = z14;
        this.f30969e = z15;
        this.f30970f = str;
        this.f30971g = z16;
        this.f30972h = z17;
        this.f30973i = z18;
    }

    public static a a(a aVar, int i11) {
        return new a(aVar.f30965a, aVar.f30966b, (i11 & 4) != 0 ? aVar.f30967c : true, (i11 & 8) != 0 ? aVar.f30968d : true, aVar.f30969e, aVar.f30970f, aVar.f30971g, aVar.f30972h, aVar.f30973i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f30965a == aVar.f30965a && this.f30966b == aVar.f30966b && this.f30967c == aVar.f30967c && this.f30968d == aVar.f30968d && this.f30969e == aVar.f30969e && Intrinsics.areEqual(this.f30970f, aVar.f30970f) && this.f30971g == aVar.f30971g && this.f30972h == aVar.f30972h && this.f30973i == aVar.f30973i;
    }

    public final int hashCode() {
        int iE = r8.k.e(r8.k.e(r8.k.e(r8.k.e(Boolean.hashCode(this.f30965a) * 31, 31, this.f30966b), 31, this.f30967c), 31, this.f30968d), 31, this.f30969e);
        String str = this.f30970f;
        return Boolean.hashCode(this.f30973i) + r8.k.e(r8.k.e((iE + (str == null ? 0 : str.hashCode())) * 31, 31, this.f30971g), 31, this.f30972h);
    }

    public final String toString() {
        StringBuilder sbP = b3.i.p("Constraints(isFavoriteReminderFeatureEnabled=", this.f30965a, ", isFavoriteCustomReminderEnabled=", this.f30966b, ", isNotificationPermissionEnabled=");
        b3.i.C(sbP, this.f30967c, ", hasFavToolTipBeenDismissed=", this.f30968d, ", showShowStationNativeName=");
        sbP.append(this.f30969e);
        sbP.append(", specialRewardsVariant=");
        sbP.append(this.f30970f);
        sbP.append(", shouldHideRatings=");
        b3.i.C(sbP, this.f30971g, ", shouldHideAddress=", this.f30972h, ", shouldHideDescription=");
        return j4.s.o(sbP, this.f30973i, ")");
    }
}
