package jg;

import kotlin.jvm.internal.Intrinsics;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f25177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f25178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f25179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f25180d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f25181e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f25182f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f25183g;

    public h(boolean z11, e eVar, int i11, String str) {
        eVar.getClass();
        this.f25177a = z11;
        this.f25178b = eVar;
        this.f25179c = i11;
        this.f25180d = str;
        this.f25181e = false;
        this.f25182f = false;
        this.f25183g = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f25177a == hVar.f25177a && this.f25178b == hVar.f25178b && this.f25179c == hVar.f25179c && Intrinsics.areEqual(this.f25180d, hVar.f25180d) && this.f25181e == hVar.f25181e && this.f25182f == hVar.f25182f && this.f25183g == hVar.f25183g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f25183g) + r8.k.e(r8.k.e(l1.b(r8.k.b(this.f25179c, (this.f25178b.hashCode() + (Boolean.hashCode(this.f25177a) * 31)) * 31, 31), 31, this.f25180d), 31, this.f25181e), 31, this.f25182f);
    }

    public final String toString() {
        boolean z11 = this.f25181e;
        boolean z12 = this.f25182f;
        boolean z13 = this.f25183g;
        StringBuilder sb2 = new StringBuilder("FieldValidation(required=");
        sb2.append(this.f25177a);
        sb2.append(", keyboardType=");
        sb2.append(this.f25178b);
        sb2.append(", maxLength=");
        sb2.append(this.f25179c);
        sb2.append(", regexValidation=");
        sb2.append(this.f25180d);
        sb2.append(", hasHadFocus=");
        b3.i.C(sb2, z11, ", isValidating=", z12, ", isValid=");
        return j4.s.o(sb2, z13, ")");
    }
}
