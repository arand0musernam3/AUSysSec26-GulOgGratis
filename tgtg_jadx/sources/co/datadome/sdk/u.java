package co.datadome.sdk;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import w2.l1;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u90.n f8709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f8710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8711c;

    public u(u90.n nVar, Map map, String str) {
        str.getClass();
        this.f8709a = nVar;
        this.f8710b = map;
        this.f8711c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Intrinsics.areEqual(this.f8709a, uVar.f8709a) && Intrinsics.areEqual(this.f8710b, uVar.f8710b) && Intrinsics.areEqual(this.f8711c, uVar.f8711c);
    }

    public final int hashCode() {
        return this.f8711c.hashCode() + w.a0.f(this.f8710b, this.f8709a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SDKCallModel(call=");
        sb2.append(this.f8709a);
        sb2.append(", headers=");
        sb2.append(this.f8710b);
        sb2.append(", data=");
        return l1.f(sb2, this.f8711c, ')');
    }
}
