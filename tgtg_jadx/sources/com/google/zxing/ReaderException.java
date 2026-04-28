package com.google.zxing;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ReaderException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f12901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final StackTraceElement[] f12902b;

    static {
        f12901a = System.getProperty("surefire.test.class.path") != null;
        f12902b = new StackTraceElement[0];
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }
}
