package ai;

import b3.i;
import i90.h;
import j4.s;
import kotlin.jvm.internal.Intrinsics;
import m90.c1;
import org.jetbrains.annotations.NotNull;
import r8.k;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f1483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f1484d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Boolean f1485e;

    public /* synthetic */ c(int i11, boolean z11, boolean z12, String str, String str2, Boolean bool) {
        if (15 != (i11 & 15)) {
            c1.j(i11, 15, a.f1480a.getDescriptor());
            throw null;
        }
        this.f1481a = z11;
        this.f1482b = z12;
        this.f1483c = str;
        this.f1484d = str2;
        if ((i11 & 16) == 0) {
            this.f1485e = null;
        } else {
            this.f1485e = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f1481a == cVar.f1481a && this.f1482b == cVar.f1482b && Intrinsics.areEqual(this.f1483c, cVar.f1483c) && Intrinsics.areEqual(this.f1484d, cVar.f1484d) && Intrinsics.areEqual(this.f1485e, cVar.f1485e);
    }

    public final int hashCode() {
        int iB = l1.b(l1.b(k.e(Boolean.hashCode(this.f1481a) * 31, 31, this.f1482b), 31, this.f1483c), 31, this.f1484d);
        Boolean bool = this.f1485e;
        return iB + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sbP = i.p("CharityUserSettingsRequest(pushNotifications=", this.f1481a, ", smsNotifications=", this.f1482b, ", prefix=");
        s.A(sbP, this.f1483c, ", phoneNumber=", this.f1484d, ", orderEmails=");
        sbP.append(this.f1485e);
        sbP.append(")");
        return sbP.toString();
    }

    public c(boolean z11, boolean z12, String str, String str2, Boolean bool) {
        str.getClass();
        str2.getClass();
        this.f1481a = z11;
        this.f1482b = z12;
        this.f1483c = str;
        this.f1484d = str2;
        this.f1485e = bool;
    }
}
