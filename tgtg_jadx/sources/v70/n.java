package v70;

import j4.s;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;
import kotlin.collections.o0;
import org.jetbrains.annotations.NotNull;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class n implements Externalizable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final m f42059b = new m(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f42060a;

    public n() {
        o0 o0Var = o0.f26530a;
        o0Var.getClass();
        this.f42060a = o0Var;
    }

    private final Object readResolve() {
        return this.f42060a;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        objectInput.getClass();
        byte b8 = objectInput.readByte();
        if (b8 != 0) {
            throw new InvalidObjectException(s.f(b8, "Unsupported flags value: "));
        }
        int i11 = objectInput.readInt();
        if (i11 < 0) {
            throw new InvalidObjectException(a0.l("Illegal size value: ", i11, '.'));
        }
        i iVar = new i(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            iVar.put(objectInput.readObject(), objectInput.readObject());
        }
        this.f42060a = iVar.b();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.getClass();
        objectOutput.writeByte(0);
        objectOutput.writeInt(this.f42060a.size());
        for (Map.Entry entry : this.f42060a.entrySet()) {
            objectOutput.writeObject(entry.getKey());
            objectOutput.writeObject(entry.getValue());
        }
    }
}
