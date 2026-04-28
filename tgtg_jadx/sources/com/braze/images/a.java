package com.braze.images;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.adyen.checkout.ui.core.internal.ui.view.ExpiryDateInput;
import com.braze.lrucache.j;
import com.braze.support.BrazeLogger;
import j4.s;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.braze.lrucache.f f9864a;

    public a(File file) throws IOException {
        Pattern pattern = com.braze.lrucache.f.f9911o;
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else if (!file2.renameTo(file3)) {
                throw new IOException();
            }
        }
        com.braze.lrucache.f fVar = new com.braze.lrucache.f(file);
        if (fVar.f9915b.exists()) {
            try {
                fVar.c();
                fVar.b();
            } catch (IOException e5) {
                BrazeLogger.w(com.braze.lrucache.f.f9912p, "DiskLruCache " + file + " is corrupt: " + e5.getMessage() + ", removing");
                synchronized (fVar) {
                    try {
                        if (fVar.f9922i != null) {
                            Iterator it = new ArrayList(fVar.f9923j.values()).iterator();
                            while (it.hasNext()) {
                                com.braze.lrucache.d dVar = ((com.braze.lrucache.g) it.next()).f9930d;
                                if (dVar != null) {
                                    dVar.f9909d.a(dVar, false);
                                }
                            }
                            while (fVar.f9921h > fVar.f9919f) {
                                fVar.d((String) ((Map.Entry) fVar.f9923j.entrySet().iterator().next()).getKey());
                            }
                            fVar.f9922i.close();
                            fVar.f9922i = null;
                        }
                        j.a(fVar.f9914a);
                        file.mkdirs();
                        fVar = new com.braze.lrucache.f(file);
                        fVar.d();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        } else {
            file.mkdirs();
            fVar = new com.braze.lrucache.f(file);
            fVar.d();
        }
        this.f9864a = fVar;
    }

    public static final String c(String str, String str2) {
        return s.k("Failed to load image from disk cache: ", str, ExpiryDateInput.SEPARATOR, str2);
    }

    public static final String d(String str, String str2) {
        return s.k("Error while producing output stream or compressing bitmap for key ", str, " diskKey ", str2);
    }

    public final void a() {
        try {
            com.braze.lrucache.f fVar = this.f9864a;
            synchronized (fVar) {
                try {
                    if (fVar.f9922i == null) {
                        return;
                    }
                    Iterator it = new ArrayList(fVar.f9923j.values()).iterator();
                    while (it.hasNext()) {
                        com.braze.lrucache.d dVar = ((com.braze.lrucache.g) it.next()).f9930d;
                        if (dVar != null) {
                            dVar.f9909d.a(dVar, false);
                        }
                    }
                    while (fVar.f9921h > fVar.f9919f) {
                        fVar.d((String) ((Map.Entry) fVar.f9923j.entrySet().iterator().next()).getKey());
                    }
                    fVar.f9922i.close();
                    fVar.f9922i = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, th3, false, (Function0) new xh.d(24), 4, (Object) null);
        }
    }

    public final Bitmap b(String str) {
        str.getClass();
        String strValueOf = String.valueOf(str.hashCode());
        try {
            com.braze.lrucache.e eVarB = this.f9864a.b(strValueOf);
            try {
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(eVarB.f9910a[0]);
                eVarB.close();
                return bitmapDecodeStream;
            } finally {
            }
        } catch (Throwable th2) {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.E, th2, false, (Function0) new qw.d(str, strValueOf, 4), 4, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new qw.d(str, strValueOf, 5), 7, (Object) null);
            return null;
        }
    }

    public static final String b(String str, String str2) {
        return s.k("Failed to get bitmap from disk cache for key ", str, " diskKey ", str2);
    }

    public static final String b() {
        return "Failed to shutdown disk cache";
    }

    public static final String a(String str, String str2) {
        return s.k("Error while retrieving disk for key ", str, " diskKey ", str2);
    }

    public final boolean a(String str) {
        str.getClass();
        String strValueOf = String.valueOf(str.hashCode());
        try {
            com.braze.lrucache.e eVarB = this.f9864a.b(strValueOf);
            boolean z11 = eVarB != null;
            u00.d.p(eVarB, null);
            return z11;
        } catch (Throwable th2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, th2, false, (Function0) new qw.d(str, strValueOf, 6), 4, (Object) null);
            return false;
        }
    }

    public final void a(String str, Bitmap bitmap) {
        str.getClass();
        bitmap.getClass();
        String strValueOf = String.valueOf(str.hashCode());
        try {
            com.braze.lrucache.d dVarA = this.f9864a.a(strValueOf);
            OutputStream outputStreamA = dVarA.a();
            try {
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, outputStreamA);
                outputStreamA.flush();
                outputStreamA.close();
                boolean z11 = dVarA.f9908c;
                com.braze.lrucache.f fVar = dVarA.f9909d;
                if (z11) {
                    fVar.a(dVarA, false);
                    dVarA.f9909d.d(dVarA.f9906a.f9927a);
                } else {
                    fVar.a(dVarA, true);
                }
            } finally {
            }
        } catch (Throwable th2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, th2, false, (Function0) new qw.d(str, strValueOf, 7), 4, (Object) null);
        }
    }
}
