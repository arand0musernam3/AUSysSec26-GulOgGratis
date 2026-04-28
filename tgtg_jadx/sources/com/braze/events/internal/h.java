package com.braze.events.internal;

import kotlin.jvm.internal.Intrinsics;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9807c;

    public h(String str, String str2, String str3) {
        w.a0.C(str, str2, str3);
        this.f9805a = str;
        this.f9806b = str2;
        this.f9807c = str3;
    }

    public final String a() {
        return this.f9806b;
    }

    public final String b() {
        return this.f9805a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.areEqual(this.f9805a, hVar.f9805a) && Intrinsics.areEqual(this.f9806b, hVar.f9806b) && Intrinsics.areEqual(this.f9807c, hVar.f9807c);
    }

    public final int hashCode() {
        return this.f9807c.hashCode() + l1.b(this.f9805a.hashCode() * 31, 31, this.f9806b);
    }

    public final String toString() {
        String str = this.f9805a;
        String str2 = this.f9806b;
        return r8.k.p(e0.f.t("DustConfigReceivedEvent(mite=", str, ", host=", str2, ", auth="), this.f9807c, ")");
    }
}
