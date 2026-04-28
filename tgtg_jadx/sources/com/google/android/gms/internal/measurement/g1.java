package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.SystemClock;
import android.os.Trace;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.google.android.gms.common.api.h f11429a = new com.google.android.gms.common.api.h("Phenotype.API", new a10.b(2), new com.google.android.gms.common.api.g());

    public static int a(int i11) {
        if (i11 == 0) {
            return 1;
        }
        if (i11 == 1) {
            return 2;
        }
        if (i11 == 2) {
            return 3;
        }
        if (i11 != 3) {
            return i11 != 4 ? 0 : 5;
        }
        return 4;
    }

    public static File b(Context context) {
        File filesDir = context.getFilesDir();
        if (filesDir != null) {
            return filesDir;
        }
        SystemClock.sleep(100L);
        File filesDir2 = context.getFilesDir();
        if (filesDir2 != null) {
            return filesDir2;
        }
        com.braze.h2.b("getFilesDir returned null twice.");
        return null;
    }

    public static void c(Object obj, String str) {
        if (obj != null) {
            return;
        }
        c50.w.l(str.concat(" must not be null"));
    }

    public static c1 d() {
        ClassLoader classLoader = g1.class.getClassLoader();
        if (c1.class.equals(c1.class)) {
            try {
                try {
                    if (Class.forName("com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader", true, classLoader).getConstructor(null).newInstance(null) == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                } catch (ReflectiveOperationException e5) {
                    throw new IllegalStateException(e5);
                }
            } catch (ClassNotFoundException unused) {
            }
        }
        try {
            Iterator it = Arrays.asList(new g1[0]).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    if (it.next() == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                } catch (ServiceConfigurationError e11) {
                    Logger.getLogger(b1.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(c1.class.getSimpleName()), (Throwable) e11);
                }
            }
            if (arrayList.size() == 1) {
                return (c1) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (c1) c1.class.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (ReflectiveOperationException e12) {
                throw new IllegalStateException(e12);
            }
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(th2.getMessage(), th2);
        }
    }

    public static void e(yf yfVar) {
        bf bfVar;
        if (g(yfVar) || (bfVar = ((bf) yfVar).f11290a) == null) {
            Trace.beginSection(((bf) yfVar).f11292c);
            h(yfVar);
        } else {
            e(bfVar);
            h(yfVar);
        }
    }

    public static void f(yf yfVar) {
        if (!g(yfVar)) {
            bf bfVar = (bf) yfVar;
            if (bfVar.f11290a != null) {
                Trace.endSection();
                f(bfVar.f11290a);
                return;
            }
        }
        Trace.endSection();
        Trace.endSection();
    }

    public static boolean g(yf yfVar) {
        return ((bf) yfVar).f11294e != Thread.currentThread();
    }

    public static void h(yf yfVar) {
        String strSubstring = ((bf) yfVar).f11293d;
        AtomicReference atomicReference = hf.f11474a;
        if (strSubstring.length() > 127) {
            strSubstring = strSubstring.substring(0, 127);
        }
        Trace.beginSection(strSubstring);
    }
}
