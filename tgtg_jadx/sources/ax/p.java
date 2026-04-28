package ax;

import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Intent f4989c;

    public p(int i11, int i12, Intent intent) {
        this.f4987a = i11;
        this.f4988b = i12;
        this.f4989c = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f4987a == pVar.f4987a && this.f4988b == pVar.f4988b && Intrinsics.areEqual(this.f4989c, pVar.f4989c);
    }

    public final int hashCode() {
        int iB = r8.k.b(this.f4988b, Integer.hashCode(this.f4987a) * 31, 31);
        Intent intent = this.f4989c;
        return iB + (intent == null ? 0 : intent.hashCode());
    }

    public final String toString() {
        return "ActivityResultParameters(requestCode=" + this.f4987a + ", resultCode=" + this.f4988b + ", data=" + this.f4989c + ')';
    }
}
