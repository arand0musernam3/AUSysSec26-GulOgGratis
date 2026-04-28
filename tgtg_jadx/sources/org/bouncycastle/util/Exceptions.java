package org.bouncycastle.util;

import e0.f;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class Exceptions {
    public static IllegalArgumentException illegalArgumentException(String str, Throwable th2) {
        return new IllegalArgumentException(str, th2);
    }

    public static IllegalStateException illegalStateException(String str, Throwable th2) {
        return new IllegalStateException(str, th2);
    }

    public static IOException ioException(String str, Throwable th2) {
        StringBuilder sbR = f.r(str, "-");
        sbR.append(th2.getMessage());
        return new IOException(sbR.toString());
    }
}
