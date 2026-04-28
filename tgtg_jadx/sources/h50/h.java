package h50;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements Externalizable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f21477a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f21481e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f21478b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f21479c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f21480d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f21482f = "";

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        if (objectInput.readBoolean()) {
            String utf = objectInput.readUTF();
            this.f21477a = true;
            this.f21478b = utf;
        }
        int i11 = objectInput.readInt();
        for (int i12 = 0; i12 < i11; i12++) {
            this.f21479c.add(Integer.valueOf(objectInput.readInt()));
        }
        int i13 = objectInput.readInt();
        for (int i14 = 0; i14 < i13; i14++) {
            this.f21480d.add(Integer.valueOf(objectInput.readInt()));
        }
        if (objectInput.readBoolean()) {
            String utf2 = objectInput.readUTF();
            this.f21481e = true;
            this.f21482f = utf2;
        }
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeBoolean(this.f21477a);
        if (this.f21477a) {
            objectOutput.writeUTF(this.f21478b);
        }
        ArrayList arrayList = this.f21479c;
        int size = arrayList.size();
        objectOutput.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            objectOutput.writeInt(((Integer) arrayList.get(i11)).intValue());
        }
        ArrayList arrayList2 = this.f21480d;
        int size2 = arrayList2.size();
        objectOutput.writeInt(size2);
        for (int i12 = 0; i12 < size2; i12++) {
            objectOutput.writeInt(((Integer) arrayList2.get(i12)).intValue());
        }
        objectOutput.writeBoolean(this.f21481e);
        if (this.f21481e) {
            objectOutput.writeUTF(this.f21482f);
        }
    }
}
