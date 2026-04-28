package com.google.android.gms.internal.measurement;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class pg extends qg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11762b;

    @Override // com.google.android.gms.internal.measurement.qg
    public final String a() {
        return "com/google/android/libraries/phenotype/client/Phlogger".replace('/', '.');
    }

    @Override // com.google.android.gms.internal.measurement.qg
    public final String b() {
        return "logInternal";
    }

    @Override // com.google.android.gms.internal.measurement.qg
    public final int c() {
        return 44;
    }

    @Override // com.google.android.gms.internal.measurement.qg
    public final String d() {
        return "Phlogger.java".substring("Phlogger.java".lastIndexOf(File.separatorChar) + 1);
    }

    @Override // com.google.android.gms.internal.measurement.qg
    public final String e() {
        return "Phlogger.java";
    }

    public final boolean equals(Object obj) {
        return obj instanceof pg;
    }

    public final int hashCode() {
        int i11 = this.f11762b;
        if (i11 != 0) {
            return i11;
        }
        this.f11762b = -1391114360;
        return -1391114360;
    }
}
