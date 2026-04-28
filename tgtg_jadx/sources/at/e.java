package at;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends p30.b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Uri f4772j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Uri uri) {
        super(2);
        uri.getClass();
        this.f4772j = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.areEqual(this.f4772j, ((e) obj).f4772j);
    }

    @Override // p30.b
    public final int hashCode() {
        return this.f4772j.hashCode();
    }

    @Override // p30.b
    public final String toString() {
        return "OpenPdf(uri=" + this.f4772j + ")";
    }
}
