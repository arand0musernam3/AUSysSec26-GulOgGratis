package com.braze.managers;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f10118b;

    public w0(String str, long j9) {
        str.getClass();
        this.f10117a = str;
        this.f10118b = j9;
    }

    public final String a() {
        return this.f10117a;
    }

    public final long b() {
        return this.f10118b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return Intrinsics.areEqual(this.f10117a, w0Var.f10117a) && this.f10118b == w0Var.f10118b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f10118b) + (this.f10117a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbN = b3.i.n(this.f10118b, "CampaignData(id=", this.f10117a, ", timestamp=");
        sbN.append(")");
        return sbN.toString();
    }
}
