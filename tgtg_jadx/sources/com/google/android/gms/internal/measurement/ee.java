package com.google.android.gms.internal.measurement;

import java.io.File;
import java.io.FileOutputStream;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class ee extends ge implements ce {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FileOutputStream f11390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f11391b;

    public ee(FileOutputStream fileOutputStream, File file) {
        super(fileOutputStream);
        this.f11390a = fileOutputStream;
        this.f11391b = file;
    }

    @Override // com.google.android.gms.internal.measurement.ce
    public final File a() {
        return this.f11391b;
    }
}
