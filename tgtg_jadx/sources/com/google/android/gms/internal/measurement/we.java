package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class we {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zb f12009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1 f12010b;

    public we(zb zbVar, c1 c1Var) {
        this.f12009a = zbVar;
        if (c1Var != null) {
            this.f12010b = c1Var;
        } else {
            c50.w.l("Null extensionRegistryLite");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof we)) {
            return false;
        }
        we weVar = (we) obj;
        return this.f12009a.equals(weVar.f12009a) && this.f12010b.equals(weVar.f12010b);
    }

    public final int hashCode() {
        return ((this.f12009a.hashCode() ^ 1000003) * 1000003) ^ this.f12010b.hashCode();
    }

    public final String toString() {
        String string = this.f12009a.toString();
        int length = string.length();
        String string2 = this.f12010b.toString();
        StringBuilder sb2 = new StringBuilder(length + 53 + string2.length() + 1);
        j4.s.A(sb2, "ProtoSerializer{defaultValue=", string, ", extensionRegistryLite=", string2);
        sb2.append("}");
        return sb2.toString();
    }
}
