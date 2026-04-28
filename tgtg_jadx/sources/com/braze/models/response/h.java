package com.braze.models.response;

import com.braze.requests.o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f10245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f10248d;

    public h(o oVar, int i11, String str, String str2) {
        oVar.getClass();
        this.f10245a = oVar;
        this.f10246b = i11;
        this.f10247c = str;
        this.f10248d = str2;
    }

    @Override // com.braze.models.response.d
    public final String a() {
        return this.f10248d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.areEqual(this.f10245a, hVar.f10245a) && this.f10246b == hVar.f10246b && Intrinsics.areEqual(this.f10247c, hVar.f10247c) && Intrinsics.areEqual(this.f10248d, hVar.f10248d);
    }

    public final int hashCode() {
        int iB = r8.k.b(this.f10246b, this.f10245a.hashCode() * 31, 31);
        String str = this.f10247c;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f10248d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        int i11 = this.f10246b;
        String str = this.f10247c;
        String str2 = this.f10248d;
        StringBuilder sb2 = new StringBuilder("{code = ");
        sb2.append(i11);
        sb2.append(", reason = ");
        sb2.append(str);
        sb2.append(", message = ");
        return r8.k.p(sb2, str2, "}");
    }
}
