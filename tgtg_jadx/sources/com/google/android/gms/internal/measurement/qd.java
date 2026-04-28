package com.google.android.gms.internal.measurement;

import android.os.StrictMode;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class qd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pd f11801a;

    static {
        pd pdVar;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                Iterator it = Arrays.asList(new pd[0]).iterator();
                if (it.hasNext()) {
                    pdVar = (pd) it.next();
                    na0.a.e0("Expected at most one FlagsService", !it.hasNext());
                } else {
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    pdVar = new pd();
                }
                f11801a = pdVar;
            } catch (Throwable th2) {
                throw new ServiceConfigurationError(th2.getMessage(), th2);
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }
}
