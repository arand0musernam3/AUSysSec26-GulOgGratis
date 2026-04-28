package w9;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f43319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f43320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f43321d;

    public g(int i11, int i12, long j9, long j11) {
        this.f43318a = i11;
        this.f43319b = i12;
        this.f43320c = j9;
        this.f43321d = j11;
    }

    public static g a(File file) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            g gVar = new g(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return gVar;
        } finally {
        }
    }

    public final void b(File file) throws IOException {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f43318a);
            dataOutputStream.writeInt(this.f43319b);
            dataOutputStream.writeLong(this.f43320c);
            dataOutputStream.writeLong(this.f43321d);
            dataOutputStream.close();
        } catch (Throwable th2) {
            try {
                dataOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof g)) {
            g gVar = (g) obj;
            if (this.f43319b == gVar.f43319b && this.f43320c == gVar.f43320c && this.f43318a == gVar.f43318a && this.f43321d == gVar.f43321d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f43319b), Long.valueOf(this.f43320c), Integer.valueOf(this.f43318a), Long.valueOf(this.f43321d));
    }
}
