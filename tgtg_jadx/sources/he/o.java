package he;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import com.adyen.checkout.ui.core.internal.ui.view.ExpiryDateInput;
import com.google.android.gms.internal.measurement.ib;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import zendesk.messaging.android.internal.AttachmentFileResolver;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f21952a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashSet f21953b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f21954c = {80, 75, 3, 4};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f21955d = {31, -117, 8};

    public static f0 a(final String str, Callable callable, Runnable runnable) {
        k kVarA = str == null ? null : oe.h.f32476b.a(str);
        f0 f0Var = kVarA != null ? new f0(kVarA) : null;
        HashMap map = f21952a;
        if (str != null && map.containsKey(str)) {
            f0Var = (f0) map.get(str);
        }
        if (f0Var != null) {
            if (runnable != null) {
                runnable.run();
            }
            return f0Var;
        }
        f0 f0Var2 = new f0(callable, false);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            final int i11 = 0;
            f0Var2.b(new c0() { // from class: he.m
                @Override // he.c0
                public final void onResult(Object obj) {
                    switch (i11) {
                        case 0:
                            HashMap map2 = o.f21952a;
                            map2.remove(str);
                            atomicBoolean.set(true);
                            if (map2.size() == 0) {
                                o.k();
                            }
                            break;
                        default:
                            HashMap map3 = o.f21952a;
                            map3.remove(str);
                            atomicBoolean.set(true);
                            if (map3.size() == 0) {
                                o.k();
                            }
                            break;
                    }
                }
            });
            final int i12 = 1;
            f0Var2.a(new c0() { // from class: he.m
                @Override // he.c0
                public final void onResult(Object obj) {
                    switch (i12) {
                        case 0:
                            HashMap map2 = o.f21952a;
                            map2.remove(str);
                            atomicBoolean.set(true);
                            if (map2.size() == 0) {
                                o.k();
                            }
                            break;
                        default:
                            HashMap map3 = o.f21952a;
                            map3.remove(str);
                            atomicBoolean.set(true);
                            if (map3.size() == 0) {
                                o.k();
                            }
                            break;
                    }
                }
            });
            if (!atomicBoolean.get()) {
                map.put(str, f0Var2);
                if (map.size() == 1) {
                    k();
                }
            }
        }
        return f0Var2;
    }

    public static f0 b(Context context, String str) {
        String strK = e0.f.k("asset_", str);
        return a(strK, new l(context.getApplicationContext(), str, strK, 1), null);
    }

    public static e0 c(Context context, String str, String str2) {
        k kVarA = str2 == null ? null : oe.h.f32476b.a(str2);
        if (kVarA != null) {
            return new e0(kVarA);
        }
        try {
            return d(context, context.getAssets().open(str), str2);
        } catch (IOException e5) {
            return new e0(e5);
        }
    }

    public static e0 d(Context context, InputStream inputStream, String str) {
        k kVarA = str == null ? null : oe.h.f32476b.a(str);
        if (kVarA != null) {
            return new e0(kVarA);
        }
        try {
            ia0.d0 d0Var = new ia0.d0(ia0.b.g(inputStream));
            int i11 = 3;
            if (j(d0Var, f21954c).booleanValue()) {
                return h(context, new ZipInputStream(new ib(d0Var, i11)), str);
            }
            if (j(d0Var, f21955d).booleanValue()) {
                return f(ia0.b.g(new GZIPInputStream(new ib(d0Var, i11))), str);
            }
            String[] strArr = ue.d.f41063e;
            return e(new ue.e(d0Var), str, true);
        } catch (IOException e5) {
            return new e0(e5);
        }
    }

    public static e0 e(ue.e eVar, String str, boolean z11) {
        k kVarA;
        try {
            if (str == null) {
                kVarA = null;
            } else {
                try {
                    kVarA = oe.h.f32476b.a(str);
                } catch (Exception e5) {
                    e0 e0Var = new e0(e5);
                    if (z11) {
                        ve.k.b(eVar);
                    }
                    return e0Var;
                }
            }
            if (kVarA != null) {
                e0 e0Var2 = new e0(kVarA);
                if (z11) {
                    ve.k.b(eVar);
                }
                return e0Var2;
            }
            k kVarA2 = te.t.a(eVar);
            if (str != null) {
                oe.h.f32476b.f32477a.d(str, kVarA2);
            }
            e0 e0Var3 = new e0(kVarA2);
            if (z11) {
                ve.k.b(eVar);
            }
            return e0Var3;
        } catch (Throwable th2) {
            if (z11) {
                ve.k.b(eVar);
            }
            throw th2;
        }
    }

    public static e0 f(ia0.u uVar, String str) {
        ia0.d0 d0Var = new ia0.d0(uVar);
        String[] strArr = ue.d.f41063e;
        return e(new ue.e(d0Var), str, true);
    }

    public static e0 g(Context context, String str, int i11) {
        k kVarA = str == null ? null : oe.h.f32476b.a(str);
        if (kVarA != null) {
            return new e0(kVarA);
        }
        try {
            ia0.d0 d0Var = new ia0.d0(ia0.b.g(context.getResources().openRawResource(i11)));
            int i12 = 3;
            if (j(d0Var, f21954c).booleanValue()) {
                return h(context, new ZipInputStream(new ib(d0Var, i12)), str);
            }
            if (!j(d0Var, f21955d).booleanValue()) {
                String[] strArr = ue.d.f41063e;
                return e(new ue.e(d0Var), str, true);
            }
            try {
                return f(ia0.b.g(new GZIPInputStream(new ib(d0Var, i12))), str);
            } catch (IOException e5) {
                return new e0(e5);
            }
        } catch (Resources.NotFoundException e11) {
            return new e0(e11);
        }
    }

    public static e0 h(Context context, ZipInputStream zipInputStream, String str) {
        try {
            return i(context, zipInputStream, str);
        } finally {
            ve.k.b(zipInputStream);
        }
    }

    public static e0 i(Context context, ZipInputStream zipInputStream, String str) {
        k kVarA;
        b0 b0Var;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        if (str == null) {
            kVarA = null;
        } else {
            try {
                kVarA = oe.h.f32476b.a(str);
            } catch (IOException e5) {
                return new e0(e5);
            }
        }
        if (kVarA != null) {
            return new e0(kVarA);
        }
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        k kVar = null;
        while (nextEntry != null) {
            String name = nextEntry.getName();
            if (name.contains("__MACOSX")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().contains(".json")) {
                ia0.d0 d0Var = new ia0.d0(ia0.b.g(zipInputStream));
                String[] strArr = ue.d.f41063e;
                kVar = e(new ue.e(d0Var), null, false).f21902a;
            } else if (name.contains(".png") || name.contains(".webp") || name.contains(AttachmentFileResolver.TEMP_FILE_SUFFIX) || name.contains(".jpeg")) {
                String[] strArrSplit = name.split(ExpiryDateInput.SEPARATOR);
                map.put(strArrSplit[strArrSplit.length - 1], BitmapFactory.decodeStream(zipInputStream));
            } else if (name.contains(".ttf") || name.contains(".otf")) {
                String[] strArrSplit2 = name.split(ExpiryDateInput.SEPARATOR);
                String str2 = strArrSplit2[strArrSplit2.length - 1];
                String str3 = str2.split("\\.")[0];
                if (context == null) {
                    return new e0(new IllegalStateException("Unable to extract font " + str3 + " please pass a non-null Context parameter"));
                }
                File file = new File(context.getCacheDir(), str2);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                        try {
                            byte[] bArr = new byte[4096];
                            while (true) {
                                int i11 = zipInputStream.read(bArr);
                                if (i11 == -1) {
                                    break;
                                }
                                fileOutputStream2.write(bArr, 0, i11);
                            }
                            fileOutputStream2.flush();
                            fileOutputStream2.close();
                            fileOutputStream.close();
                        } catch (Throwable th2) {
                            try {
                                fileOutputStream2.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    } finally {
                    }
                } catch (Throwable th4) {
                    ve.c.c("Unable to save font " + str3 + " to the temporary file: " + str2 + ". ", th4);
                }
                Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                if (!file.delete()) {
                    ve.c.b("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                }
                map2.put(str3, typefaceCreateFromFile);
            } else {
                zipInputStream.closeEntry();
            }
            nextEntry = zipInputStream.getNextEntry();
        }
        if (kVar == null) {
            return new e0(new IllegalArgumentException("Unable to parse composition"));
        }
        for (Map.Entry entry : map.entrySet()) {
            String str4 = (String) entry.getKey();
            Iterator it = ((HashMap) kVar.c()).values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    b0Var = null;
                    break;
                }
                b0Var = (b0) it.next();
                if (b0Var.f21869d.equals(str4)) {
                    break;
                }
            }
            if (b0Var != null) {
                b0Var.f21871f = ve.k.d((Bitmap) entry.getValue(), b0Var.f21866a, b0Var.f21867b);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            boolean z11 = false;
            for (oe.d dVar : kVar.f21931f.values()) {
                if (dVar.f32464a.equals(entry2.getKey())) {
                    dVar.f32467d = (Typeface) entry2.getValue();
                    z11 = true;
                }
            }
            if (!z11) {
                ve.c.b("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
            }
        }
        if (map.isEmpty()) {
            Iterator it2 = ((HashMap) kVar.c()).entrySet().iterator();
            while (it2.hasNext()) {
                b0 b0Var2 = (b0) ((Map.Entry) it2.next()).getValue();
                if (b0Var2 == null) {
                    return null;
                }
                String str5 = b0Var2.f21869d;
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                if (str5.startsWith("data:") && str5.indexOf("base64,") > 0) {
                    try {
                        byte[] bArrDecode = Base64.decode(str5.substring(str5.indexOf(44) + 1), 0);
                        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                        if (bitmapDecodeByteArray != null) {
                            b0Var2.f21871f = ve.k.d(bitmapDecodeByteArray, b0Var2.f21866a, b0Var2.f21867b);
                        }
                    } catch (IllegalArgumentException e11) {
                        ve.c.c("data URL did not have correct base64 format.", e11);
                        return null;
                    }
                }
            }
        }
        if (str != null) {
            oe.h.f32476b.f32477a.d(str, kVar);
        }
        return new e0(kVar);
    }

    public static Boolean j(ia0.d0 d0Var, byte[] bArr) {
        try {
            ia0.d0 d0VarG = d0Var.g();
            for (byte b8 : bArr) {
                if (d0VarG.readByte() != b8) {
                    return Boolean.FALSE;
                }
            }
            d0VarG.close();
            return Boolean.TRUE;
        } catch (Exception unused) {
            ve.c.f42247a.getClass();
            a aVar = e.f21898a;
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused2) {
            return Boolean.FALSE;
        }
    }

    public static void k() {
        ArrayList arrayList = new ArrayList(f21953b);
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        org.bouncycastle.jce.provider.a.c();
    }

    public static String l(Context context, int i11) {
        return e0.f.h(i11, (context.getResources().getConfiguration().uiMode & 48) == 32 ? "_night_" : "_day_", new StringBuilder("rawRes"));
    }
}
