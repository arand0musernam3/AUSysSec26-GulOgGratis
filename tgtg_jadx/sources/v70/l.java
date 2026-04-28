package v70;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.c0;
import kotlin.collections.g1;
import kotlin.collections.n0;
import org.jetbrains.annotations.NotNull;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class l implements Externalizable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final k f42056c = new k(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Collection f42057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f42058b;

    public l(int i11, Collection collection) {
        collection.getClass();
        this.f42057a = collection;
        this.f42058b = i11;
    }

    private final Object readResolve() {
        return this.f42057a;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        Collection collectionA;
        objectInput.getClass();
        byte b8 = objectInput.readByte();
        int i11 = b8 & 1;
        if ((b8 & (-2)) != 0) {
            throw new InvalidObjectException(a0.l("Unsupported flags value: ", b8, '.'));
        }
        int i12 = objectInput.readInt();
        if (i12 < 0) {
            throw new InvalidObjectException(a0.l("Illegal size value: ", i12, '.'));
        }
        int i13 = 0;
        if (i11 == 0) {
            e eVar = new e(i12);
            while (i13 < i12) {
                eVar.add(objectInput.readObject());
                i13++;
            }
            collectionA = c0.a(eVar);
        } else {
            if (i11 != 1) {
                throw new InvalidObjectException(a0.l("Unsupported collection type tag: ", i11, '.'));
            }
            p pVar = new p(i12);
            while (i13 < i12) {
                pVar.add(objectInput.readObject());
                i13++;
            }
            collectionA = g1.a(pVar);
        }
        this.f42057a = collectionA;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.getClass();
        objectOutput.writeByte(this.f42058b);
        objectOutput.writeInt(this.f42057a.size());
        Iterator it = this.f42057a.iterator();
        while (it.hasNext()) {
            objectOutput.writeObject(it.next());
        }
    }

    public l() {
        this(0, n0.f26529a);
    }
}
