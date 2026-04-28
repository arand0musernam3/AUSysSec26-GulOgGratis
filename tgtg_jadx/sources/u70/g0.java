package u70;

import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.hpke.HPKE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class g0 implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final f0 f40838b = new f0(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final short f40839a;

    public /* synthetic */ g0(short s7) {
        this.f40839a = s7;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return Intrinsics.compare(this.f40839a & HPKE.aead_EXPORT_ONLY, ((g0) obj).f40839a & HPKE.aead_EXPORT_ONLY);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g0) {
            return this.f40839a == ((g0) obj).f40839a;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.f40839a);
    }

    public final String toString() {
        return String.valueOf(this.f40839a & HPKE.aead_EXPORT_ONLY);
    }
}
