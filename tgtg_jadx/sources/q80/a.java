package q80;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.text.Charsets;
import o30.f0;
import u70.b0;
import u70.c0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements Comparable, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f36355c = new a(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f36356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f36357b;

    public a(long j9, long j11) {
        this.f36356a = j9;
        this.f36357b = j11;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        b bVar = new b();
        bVar.f36358a = this.f36356a;
        bVar.f36359b = this.f36357b;
        return bVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        a aVar = (a) obj;
        aVar.getClass();
        long j9 = aVar.f36356a;
        long j11 = this.f36356a;
        if (j11 != j9) {
            b0 b0Var = c0.f40833b;
            return Long.compareUnsigned(j11, j9);
        }
        b0 b0Var2 = c0.f40833b;
        return Long.compareUnsigned(this.f36357b, aVar.f36357b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f36356a == aVar.f36356a && this.f36357b == aVar.f36357b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f36356a ^ this.f36357b);
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        f0.y(this.f36356a, bArr, 0, 0, 4);
        bArr[8] = 45;
        f0.y(this.f36356a, bArr, 9, 4, 6);
        bArr[13] = 45;
        f0.y(this.f36356a, bArr, 14, 6, 8);
        bArr[18] = 45;
        f0.y(this.f36357b, bArr, 19, 0, 2);
        bArr[23] = 45;
        f0.y(this.f36357b, bArr, 24, 2, 8);
        return new String(bArr, Charsets.UTF_8);
    }
}
