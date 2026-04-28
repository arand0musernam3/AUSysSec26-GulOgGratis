package com.braze.models.response;

import com.braze.requests.o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f10249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10251c;

    public i(o oVar, int i11, String str) {
        oVar.getClass();
        this.f10249a = oVar;
        this.f10250b = i11;
        this.f10251c = str;
    }

    @Override // com.braze.models.response.d
    public final String a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.areEqual(this.f10249a, iVar.f10249a) && this.f10250b == iVar.f10250b && Intrinsics.areEqual(this.f10251c, iVar.f10251c);
    }

    public final int hashCode() {
        int iB = r8.k.b(this.f10250b, this.f10249a.hashCode() * 31, 31);
        String str = this.f10251c;
        return iB + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "{code = " + this.f10250b + ", reason = " + this.f10251c + "}";
    }
}
