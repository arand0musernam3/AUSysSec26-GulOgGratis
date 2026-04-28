package ia0;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public class w extends m {
    @Override // ia0.m
    public final List A(a0 a0Var) throws IOException {
        a0Var.getClass();
        File file = a0Var.toFile();
        String[] list = file.list();
        if (list == null) {
            if (file.exists()) {
                i4.a.l(a0Var, "failed to list ");
                return null;
            }
            i4.a.e(a0Var, "no such file: ");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            str.getClass();
            arrayList.add(a0Var.f(str));
        }
        kotlin.collections.h0.q(arrayList);
        return arrayList;
    }

    @Override // ia0.m
    public a40.x G(a0 a0Var) {
        a0Var.getClass();
        File file = a0Var.toFile();
        boolean zIsFile = file.isFile();
        boolean zIsDirectory = file.isDirectory();
        long jLastModified = file.lastModified();
        long length = file.length();
        if (zIsFile || zIsDirectory || jLastModified != 0 || length != 0 || file.exists()) {
            return new a40.x(zIsFile, zIsDirectory, null, Long.valueOf(length), null, Long.valueOf(jLastModified), null);
        }
        return null;
    }

    @Override // ia0.m
    public final v H(a0 a0Var) {
        return new v(new RandomAccessFile(a0Var.toFile(), "r"));
    }

    @Override // ia0.m
    public final h0 I(a0 a0Var, boolean z11) throws IOException {
        a0Var.getClass();
        if (!z11 || !u(a0Var)) {
            return new z(new FileOutputStream(a0Var.toFile(), false), new l0());
        }
        throw new IOException(a0Var + " already exists.");
    }

    @Override // ia0.m
    public final j0 J(a0 a0Var) {
        a0Var.getClass();
        return new u(new FileInputStream(a0Var.toFile()), l0.f23657d);
    }

    @Override // ia0.m
    public final h0 a(a0 a0Var) {
        a0Var.getClass();
        return new z(new FileOutputStream(a0Var.toFile(), true), new l0());
    }

    @Override // ia0.m
    public void e(a0 a0Var, a0 a0Var2) throws IOException {
        a0Var.getClass();
        a0Var2.getClass();
        if (a0Var.toFile().renameTo(a0Var2.toFile())) {
            return;
        }
        throw new IOException("failed to move " + a0Var + " to " + a0Var2);
    }

    @Override // ia0.m
    public final void p(a0 a0Var) throws IOException {
        a0Var.getClass();
        if (a0Var.toFile().mkdir()) {
            return;
        }
        a40.x xVarG = G(a0Var);
        if (xVarG == null || !xVarG.f805c) {
            i4.a.l(a0Var, "failed to create directory: ");
        }
    }

    @Override // ia0.m
    public final void r(a0 a0Var) throws IOException {
        a0Var.getClass();
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File file = a0Var.toFile();
        if (file.delete() || !file.exists()) {
            return;
        }
        i4.a.l(a0Var, "failed to delete ");
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
