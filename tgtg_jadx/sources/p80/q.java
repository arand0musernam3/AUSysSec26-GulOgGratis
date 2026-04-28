package p80;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class q implements Externalizable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f34574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f34575b;

    private final Object readResolve() {
        l lVar = l.f34565c;
        return o.c(this.f34575b, this.f34574a);
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        objectInput.getClass();
        this.f34574a = objectInput.readLong();
        this.f34575b = objectInput.readInt();
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.getClass();
        objectOutput.writeLong(this.f34574a);
        objectOutput.writeInt(this.f34575b);
    }
}
