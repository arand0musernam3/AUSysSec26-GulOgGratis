package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2949e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f2950f;

    public e(byte[] bArr, int i11, int i12) {
        super(bArr);
        f.c(i11, i11 + i12, bArr.length);
        this.f2949e = i11;
        this.f2950f = i12;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }

    @Override // androidx.datastore.preferences.protobuf.f
    public final byte b(int i11) {
        int i12 = this.f2950f;
        if (((i12 - (i11 + 1)) | i11) >= 0) {
            return this.f2959b[this.f2949e + i11];
        }
        if (i11 < 0) {
            throw new ArrayIndexOutOfBoundsException(j4.s.f(i11, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(r8.k.k("Index > length: ", i11, i12, ", "));
    }

    @Override // androidx.datastore.preferences.protobuf.f
    public final void e(int i11, byte[] bArr) {
        System.arraycopy(this.f2959b, this.f2949e, bArr, 0, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.f
    public final int g() {
        return this.f2949e;
    }

    @Override // androidx.datastore.preferences.protobuf.f
    public final byte h(int i11) {
        return this.f2959b[this.f2949e + i11];
    }

    @Override // androidx.datastore.preferences.protobuf.f
    public final int size() {
        return this.f2950f;
    }

    public Object writeReplace() {
        byte[] bArr;
        int size = size();
        if (size == 0) {
            bArr = b0.f2931b;
        } else {
            byte[] bArr2 = new byte[size];
            e(size, bArr2);
            bArr = bArr2;
        }
        return new f(bArr);
    }
}
