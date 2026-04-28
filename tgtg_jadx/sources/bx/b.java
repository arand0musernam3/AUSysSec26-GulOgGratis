package bx;

import java.io.ObjectStreamException;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import tx.n0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6708b;

    public b(String str, String str2) {
        this.f6707a = str2;
        this.f6708b = n0.x(str) ? null : str;
    }

    private final Object writeReplace() throws ObjectStreamException {
        return new a(this.f6707a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            String str = bVar.f6708b;
            String str2 = this.f6708b;
            if ((str == null ? str2 == null : Intrinsics.areEqual(str, str2)) && Intrinsics.areEqual(bVar.f6707a, this.f6707a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f6708b;
        return (str != null ? str.hashCode() : 0) ^ this.f6707a.hashCode();
    }
}
