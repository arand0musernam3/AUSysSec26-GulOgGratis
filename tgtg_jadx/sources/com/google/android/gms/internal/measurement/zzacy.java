package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzacy extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    public zzacy(long j9, long j11, int i11, IndexOutOfBoundsException indexOutOfBoundsException) {
        Locale locale = Locale.US;
        StringBuilder sbG = w2.l1.g("Pos: ", j9, ", limit: ");
        sbG.append(j11);
        sbG.append(", len: ");
        sbG.append(i11);
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(sbG.toString()), indexOutOfBoundsException);
    }

    public zzacy(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }
}
