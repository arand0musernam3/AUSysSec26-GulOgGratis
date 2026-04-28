package q80;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements Externalizable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f36358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f36359b;

    private final Object readResolve() {
        long j9 = this.f36358a;
        long j11 = this.f36359b;
        return (j9 == 0 && j11 == 0) ? a.f36355c : new a(j9, j11);
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        objectInput.getClass();
        this.f36358a = objectInput.readLong();
        this.f36359b = objectInput.readLong();
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.getClass();
        objectOutput.writeLong(this.f36358a);
        objectOutput.writeLong(this.f36359b);
    }
}
