package j30;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class m implements l, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient Object f24516a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f24517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile transient boolean f24518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient Object f24519d;

    public m(l lVar) {
        lVar.getClass();
        this.f24517b = lVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f24516a = new Object();
    }

    @Override // j30.l
    public final Object get() {
        if (!this.f24518c) {
            synchronized (this.f24516a) {
                try {
                    if (!this.f24518c) {
                        Object obj = this.f24517b.get();
                        this.f24519d = obj;
                        this.f24518c = true;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f24519d;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb2 = new StringBuilder("Suppliers.memoize(");
        if (this.f24518c) {
            obj = "<supplier that returned " + this.f24519d + ">";
        } else {
            obj = this.f24517b;
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
