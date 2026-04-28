package u70;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class w implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final v f40862b = new v(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f40863a;

    public /* synthetic */ w(byte b8) {
        this.f40863a = b8;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return Intrinsics.compare(this.f40863a & 255, ((w) obj).f40863a & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            return this.f40863a == ((w) obj).f40863a;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.f40863a);
    }

    public final String toString() {
        return String.valueOf(this.f40863a & 255);
    }
}
