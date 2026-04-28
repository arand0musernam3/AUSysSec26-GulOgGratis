package kn;

import i90.h;
import k9.f;
import n90.u;
import org.jetbrains.annotations.NotNull;
import r8.k;
import y9.w;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u f26469d = w.h(new f(3));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26472c;

    public c(int i11, int i12, int i13) {
        this.f26470a = i11;
        this.f26471b = i12;
        this.f26472c = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f26470a == cVar.f26470a && this.f26471b == cVar.f26471b && this.f26472c == cVar.f26472c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f26472c) + k.b(this.f26471b, Integer.hashCode(this.f26470a) * 31, 31);
    }

    public final String toString() {
        return k.i(this.f26472c, ")", k.r(this.f26470a, this.f26471b, "ProfileAvatarDesign(background=", ", graphics=", ", tint="));
    }
}
