package a80;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.RandomAccess;
import kotlin.collections.f;
import kotlin.collections.y;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends f implements a, RandomAccess, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Enum[] f996b;

    public b(Enum[] enumArr) {
        enumArr.getClass();
        this.f996b = enumArr;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new d(this.f996b);
    }

    @Override // kotlin.collections.a
    public final int b() {
        return this.f996b.length;
    }

    @Override // kotlin.collections.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r42 = (Enum) obj;
        return ((Enum) y.D(r42.ordinal(), this.f996b)) == r42;
    }

    @Override // kotlin.collections.f, java.util.List
    public final Object get(int i11) {
        kotlin.collections.c cVar = f.f26505a;
        Enum[] enumArr = this.f996b;
        int length = enumArr.length;
        cVar.getClass();
        kotlin.collections.c.b(i11, length);
        return enumArr[i11];
    }

    @Override // kotlin.collections.f, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r42 = (Enum) obj;
        int iOrdinal = r42.ordinal();
        if (((Enum) y.D(iOrdinal, this.f996b)) == r42) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // kotlin.collections.f, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r42 = (Enum) obj;
        int iOrdinal = r42.ordinal();
        if (((Enum) y.D(iOrdinal, this.f996b)) == r42) {
            return iOrdinal;
        }
        return -1;
    }
}
