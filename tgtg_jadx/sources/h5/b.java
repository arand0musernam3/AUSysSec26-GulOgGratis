package h5;

import android.content.res.Resources;
import kotlin.jvm.internal.Intrinsics;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources.Theme f21415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21416b;

    public b(Resources.Theme theme, int i11) {
        this.f21415a = theme;
        this.f21416b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f21415a, bVar.f21415a) && this.f21416b == bVar.f21416b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f21416b) + (this.f21415a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Key(theme=");
        sb2.append(this.f21415a);
        sb2.append(", id=");
        return k.o(sb2, this.f21416b, ')');
    }
}
