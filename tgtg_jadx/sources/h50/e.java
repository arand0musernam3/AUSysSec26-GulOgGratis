package h50;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Externalizable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f21442d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f21445g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f21439a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f21440b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f21441c = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f21443e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f21444f = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f21446h = "";

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        this.f21439a = objectInput.readUTF();
        this.f21440b = objectInput.readUTF();
        int i11 = objectInput.readInt();
        for (int i12 = 0; i12 < i11; i12++) {
            this.f21441c.add(objectInput.readUTF());
        }
        if (objectInput.readBoolean()) {
            String utf = objectInput.readUTF();
            this.f21442d = true;
            this.f21443e = utf;
        }
        if (objectInput.readBoolean()) {
            String utf2 = objectInput.readUTF();
            this.f21445g = true;
            this.f21446h = utf2;
        }
        this.f21444f = objectInput.readBoolean();
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeUTF(this.f21439a);
        objectOutput.writeUTF(this.f21440b);
        ArrayList arrayList = this.f21441c;
        int size = arrayList.size();
        objectOutput.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            objectOutput.writeUTF((String) arrayList.get(i11));
        }
        objectOutput.writeBoolean(this.f21442d);
        if (this.f21442d) {
            objectOutput.writeUTF(this.f21443e);
        }
        objectOutput.writeBoolean(this.f21445g);
        if (this.f21445g) {
            objectOutput.writeUTF(this.f21446h);
        }
        objectOutput.writeBoolean(this.f21444f);
    }
}
