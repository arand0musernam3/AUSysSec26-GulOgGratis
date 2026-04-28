package vz;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import bx.k;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.internal.common.zzy;
import d40.t1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f42629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f42630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Boolean f42631c;

    public static String a() throws Throwable {
        BufferedReader bufferedReader;
        if (f42629a == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                f42629a = Application.getProcessName();
            } else {
                int iMyPid = f42630b;
                if (iMyPid == 0) {
                    iMyPid = Process.myPid();
                    f42630b = iMyPid;
                }
                String strTrim = null;
                strTrim = null;
                strTrim = null;
                BufferedReader bufferedReader2 = null;
                if (iMyPid > 0) {
                    try {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(iMyPid).length() + 14);
                        sb2.append("/proc/");
                        sb2.append(iMyPid);
                        sb2.append("/cmdline");
                        String string = sb2.toString();
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            bufferedReader = new BufferedReader(new FileReader(string));
                        } finally {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        }
                    } catch (IOException unused) {
                        bufferedReader = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        String line = bufferedReader.readLine();
                        i0.h(line);
                        strTrim = line.trim();
                    } catch (IOException unused2) {
                    } catch (Throwable th3) {
                        th = th3;
                        bufferedReader2 = bufferedReader;
                        c.a(bufferedReader2);
                        throw th;
                    }
                    c.a(bufferedReader);
                }
                f42629a = strTrim;
            }
        }
        return f42629a;
    }

    public static boolean b() {
        Boolean boolValueOf = f42631c;
        if (boolValueOf == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                boolValueOf = Boolean.valueOf(Process.isIsolated());
            } else {
                try {
                    Object objI = k.I(Process.class, "isIsolated", new dn.k[0]);
                    Object[] objArr = new Object[0];
                    if (objI == null) {
                        throw new zzy(t1.M("expected a non-null reference", objArr));
                    }
                    boolValueOf = (Boolean) objI;
                } catch (ReflectiveOperationException unused) {
                    boolValueOf = Boolean.FALSE;
                }
            }
            f42631c = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }
}
