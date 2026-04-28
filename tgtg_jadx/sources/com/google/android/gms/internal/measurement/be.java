package com.google.android.gms.internal.measurement;

import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class be implements ke {
    @Override // com.google.android.gms.internal.measurement.ke
    public final de a(Uri uri) throws zzsi {
        File fileB = fa.b(uri);
        return new de(new FileInputStream(fileB), fileB);
    }

    @Override // com.google.android.gms.internal.measurement.ke
    public final boolean b(Uri uri) {
        return fa.b(uri).exists();
    }

    @Override // com.google.android.gms.internal.measurement.ke
    public final File c(Uri uri) {
        return fa.b(uri);
    }

    @Override // com.google.android.gms.internal.measurement.ke
    public final OutputStream d(Uri uri) throws IOException {
        File fileB = fa.b(uri);
        zz.f.p(fileB);
        return new ee(new FileOutputStream(fileB), fileB);
    }

    @Override // com.google.android.gms.internal.measurement.ke
    public final String e() {
        return "file";
    }

    @Override // com.google.android.gms.internal.measurement.ke
    public final void f(Uri uri) throws IOException {
        File fileB = fa.b(uri);
        if (fileB.isDirectory()) {
            throw new FileNotFoundException(String.format("%s is a directory", uri));
        }
        if (fileB.delete()) {
            return;
        }
        if (!fileB.exists()) {
            throw new FileNotFoundException(String.format("%s does not exist", uri));
        }
        throw new IOException(String.format("%s could not be deleted", uri));
    }

    @Override // com.google.android.gms.internal.measurement.ke
    public final void g(Uri uri, Uri uri2) throws IOException {
        File fileB = fa.b(uri);
        File fileB2 = fa.b(uri2);
        zz.f.p(fileB2);
        if (!fileB.renameTo(fileB2)) {
            throw new IOException(String.format("%s could not be renamed to %s", uri, uri2));
        }
    }
}
