package com.google.android.gms.internal.measurement;

import android.net.Uri;
import android.system.Os;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pz.d f11441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final pz.d f11442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final pz.d f11443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final pz.d[] f11444d;

    static {
        pz.d dVar = new pz.d("commit_to_configuration_v2_api", -1, 1L, true);
        f11441a = dVar;
        pz.d dVar2 = new pz.d("get_serving_version_api", -1, 1L, true);
        pz.d dVar3 = new pz.d("get_experiment_tokens_api", -1, 1L, true);
        pz.d dVar4 = new pz.d("register_flag_update_listener_api", -1, 2L, true);
        f11442b = dVar4;
        pz.d dVar5 = new pz.d("sync_after_api", -1, 1L, true);
        pz.d dVar6 = new pz.d("sync_after_for_application_api", -1, 1L, true);
        pz.d dVar7 = new pz.d("set_app_wide_properties_api", -1, 1L, true);
        pz.d dVar8 = new pz.d("set_runtime_properties_api", -1, 1L, true);
        pz.d dVar9 = new pz.d("get_storage_info_api", -1, 1L, true);
        f11443c = dVar9;
        f11444d = new pz.d[]{dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, dVar9};
    }

    public static IOException a(wd wdVar, Uri uri, IOException iOException, String str) {
        try {
            ie ieVar = new ie();
            ieVar.f11499a = true;
            File file = (File) wdVar.a(uri, ieVar);
            return file.exists() ? file.isFile() ? file.canRead() ? file.canWrite() ? e(file, iOException, str) : e(file, iOException, str) : file.canWrite() ? e(file, iOException, str) : e(file, iOException, str) : file.canRead() ? file.canWrite() ? e(file, iOException, str) : e(file, iOException, str) : file.canWrite() ? e(file, iOException, str) : e(file, iOException, str) : e(file, iOException, str);
        } catch (IOException unused) {
            return new IOException(iOException);
        }
    }

    public static String b(String str) {
        if (str.length() > 23) {
            int i11 = -1;
            for (int length = str.length() - 1; length >= 0; length--) {
                char cCharAt = str.charAt(length);
                if (cCharAt == '.' || cCharAt == '$') {
                    i11 = length;
                    break;
                }
            }
            str = str.substring(i11 + 1);
        }
        String strConcat = "".concat(str);
        return strConcat.substring(0, Math.min(strConcat.length(), 23));
    }

    public static int c(Level level) {
        int iIntValue = level.intValue();
        if (iIntValue >= Level.SEVERE.intValue()) {
            return 6;
        }
        if (iIntValue >= Level.WARNING.intValue()) {
            return 5;
        }
        if (iIntValue >= Level.INFO.intValue()) {
            return 4;
        }
        return iIntValue >= Level.FINE.intValue() ? 3 : 2;
    }

    public static c5 d(n1 n1Var, b7 b7Var, ArrayList arrayList, boolean z11) {
        c5 c5VarA;
        fa.f("reduce", arrayList, 1);
        fa.h(2, "reduce", arrayList);
        c5 c5VarE = ((i5) b7Var.f11283c).e(b7Var, (c5) arrayList.get(0));
        if (!(c5VarE instanceof b4)) {
            i4.a.f("Callback should be a method");
            return null;
        }
        if (arrayList.size() == 2) {
            c5VarA = ((i5) b7Var.f11283c).e(b7Var, (c5) arrayList.get(1));
            if (c5VarA instanceof q2) {
                i4.a.f("Failed to parse initial value");
                return null;
            }
        } else {
            if (n1Var.p() == 0) {
                com.braze.h2.b("Empty array with no initial value error");
                return null;
            }
            c5VarA = null;
        }
        b4 b4Var = (b4) c5VarE;
        int iP = n1Var.p();
        int i11 = z11 ? 0 : iP - 1;
        int i12 = z11 ? iP - 1 : 0;
        int i13 = true == z11 ? 1 : -1;
        if (c5VarA == null) {
            c5VarA = n1Var.q(i11);
            i11 += i13;
        }
        while ((i12 - i11) * i13 >= 0) {
            if (n1Var.s(i11)) {
                c5VarA = b4Var.a(b7Var, Arrays.asList(c5VarA, n1Var.q(i11), new i3(Double.valueOf(i11)), n1Var));
                if (c5VarA instanceof q2) {
                    com.braze.h2.b("Reduce operation failed");
                    return null;
                }
                i11 += i13;
            } else {
                i11 += i13;
            }
        }
        return c5VarA;
    }

    public static IOException e(File file, IOException iOException, String str) {
        File parentFile = file.getParentFile();
        return parentFile == null ? g(file, iOException, str) : parentFile.exists() ? parentFile.isDirectory() ? parentFile.canRead() ? parentFile.canWrite() ? g(file, iOException, str) : g(file, iOException, str) : parentFile.canWrite() ? g(file, iOException, str) : g(file, iOException, str) : parentFile.canRead() ? parentFile.canWrite() ? g(file, iOException, str) : g(file, iOException, str) : parentFile.canWrite() ? g(file, iOException, str) : g(file, iOException, str) : g(file, iOException, str);
    }

    public static n1 f(n1 n1Var, b7 b7Var, b5 b5Var, Boolean bool, Boolean bool2) {
        n1 n1Var2 = new n1();
        Iterator itO = n1Var.o();
        while (itO.hasNext()) {
            int iIntValue = ((Integer) itO.next()).intValue();
            if (n1Var.s(iIntValue)) {
                c5 c5VarA = b5Var.a(b7Var, Arrays.asList(n1Var.q(iIntValue), new i3(Double.valueOf(iIntValue)), n1Var));
                if (c5VarA.d().equals(bool)) {
                    break;
                }
                if (bool2 == null || c5VarA.d().equals(bool2)) {
                    n1Var2.r(iIntValue, c5VarA);
                }
            }
        }
        return n1Var2;
    }

    public static IOException g(File file, IOException iOException, String str) {
        String strConcat;
        try {
            Locale locale = Locale.US;
            String str2 = " canonical[" + file.getCanonicalPath() + "] freeSpace[" + file.getFreeSpace() + "] protoName[" + str + "]";
            StringBuilder sb2 = new StringBuilder(str2.length() + 16);
            sb2.append("Inoperable file:");
            sb2.append(str2);
            strConcat = sb2.toString();
            try {
                String str3 = " mode[" + Os.stat(file.getCanonicalPath()).st_mode + "]";
                StringBuilder sb3 = new StringBuilder(strConcat.length() + str3.length());
                sb3.append(strConcat);
                sb3.append(str3);
                strConcat = sb3.toString();
            } catch (Exception unused) {
            }
        } catch (IOException unused2) {
            strConcat = "Inoperable file:".concat(" failed");
        }
        return new IOException(strConcat, iOException);
    }

    public static final void h(Level level, Executor executor, Exception exc, String str, Object... objArr) {
        ea eaVar = new ea(level, exc, str, objArr, 1);
        int i11 = ag.f11261a;
        executor.execute(new zf(new Ref.ObjectRef(), hf.a(), eaVar));
    }
}
