package vf;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import w.a0;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f42311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f42312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f42313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f42314d;

    public e(int i11, String str, String str2, Map map) {
        map.getClass();
        this.f42311a = i11;
        this.f42312b = str;
        this.f42313c = map;
        this.f42314d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f42311a == eVar.f42311a && Intrinsics.areEqual(this.f42312b, eVar.f42312b) && Intrinsics.areEqual(this.f42313c, eVar.f42313c) && Intrinsics.areEqual(this.f42314d, eVar.f42314d);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f42311a) * 31;
        String str = this.f42312b;
        int iF = a0.f(this.f42313c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.f42314d;
        return iF + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Response(statusCode=");
        sb2.append(this.f42311a);
        sb2.append(", body=");
        sb2.append(this.f42312b);
        sb2.append(", headers=");
        sb2.append(this.f42313c);
        sb2.append(", statusMessage=");
        return l1.f(sb2, this.f42314d, ')');
    }
}
