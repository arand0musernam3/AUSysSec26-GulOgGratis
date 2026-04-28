package com.google.android.gms.internal.measurement;

import java.io.File;
import java.io.FileInputStream;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class de extends fe implements ce {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f11352a;

    public de(FileInputStream fileInputStream, File file) {
        super(fileInputStream);
        this.f11352a = file;
    }

    @Override // com.google.android.gms.internal.measurement.ce
    public final File a() {
        return this.f11352a;
    }
}
