package x6;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class g extends na0.a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static Class f43882m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static Constructor f43883n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static Method f43884o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static Method f43885p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static boolean f43886q = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Class f43887f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Constructor f43888g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Method f43889h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Method f43890i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Method f43891j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Method f43892k;
    public final Method l;

    public g() throws NoSuchMethodException {
        Method methodD0;
        Constructor<?> constructor;
        Method methodC0;
        Method method;
        Method method2;
        Method method3;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodC0 = C0(cls2);
            Class cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodD0 = D0(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e5) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e5.getClass().getName()), e5);
            methodD0 = null;
            constructor = null;
            methodC0 = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.f43887f = cls;
        this.f43888g = constructor;
        this.f43889h = methodC0;
        this.f43890i = method;
        this.f43891j = method2;
        this.f43892k = method3;
        this.l = methodD0;
    }

    public static void B0() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f43886q) {
            return;
        }
        f43886q = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e5) {
            Log.e("TypefaceCompatApi21Impl", e5.getClass().getName(), e5);
            method = null;
            cls = null;
            method2 = null;
        }
        f43883n = constructor;
        f43882m = cls;
        f43884o = method2;
        f43885p = method;
    }

    public static Method C0(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    public static boolean y0(Object obj, String str, int i11, boolean z11) throws NoSuchMethodException {
        B0();
        try {
            return ((Boolean) f43884o.invoke(obj, str, Integer.valueOf(i11), Boolean.valueOf(z11))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e5) {
            org.bouncycastle.jce.provider.a.m(e5);
            return false;
        }
    }

    public final boolean A0(Object obj) {
        try {
            return ((Boolean) this.f43891j.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Method D0(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // na0.a
    public final Typeface h0(Context context, w6.d dVar, Resources resources, int i11) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        InputStream inputStreamOpenRawResource;
        w6.e[] eVarArr = dVar.f43240a;
        Method method = this.f43889h;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        int i12 = 0;
        if (method == null) {
            B0();
            try {
                Object objNewInstance2 = f43883n.newInstance(null);
                for (w6.e eVar : eVarArr) {
                    File fileV = nx.d.v(context);
                    if (fileV != null) {
                        try {
                            try {
                                inputStreamOpenRawResource = resources.openRawResource(eVar.f43246f);
                                try {
                                    boolean zN = nx.d.n(fileV, inputStreamOpenRawResource);
                                    if (inputStreamOpenRawResource != null) {
                                        try {
                                            inputStreamOpenRawResource.close();
                                        } catch (IOException unused) {
                                        }
                                    }
                                    if (!zN) {
                                        fileV.delete();
                                        return null;
                                    }
                                    if (!y0(objNewInstance2, fileV.getPath(), eVar.f43242b, eVar.f43243c)) {
                                        fileV.delete();
                                        return null;
                                    }
                                    fileV.delete();
                                } catch (Throwable th2) {
                                    th = th2;
                                    Throwable th3 = th;
                                    if (inputStreamOpenRawResource == null) {
                                        throw th3;
                                    }
                                    try {
                                        inputStreamOpenRawResource.close();
                                        throw th3;
                                    } catch (IOException unused2) {
                                        throw th3;
                                    }
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                inputStreamOpenRawResource = null;
                            }
                        } catch (RuntimeException unused3) {
                            fileV.delete();
                            return null;
                        } catch (Throwable th5) {
                            fileV.delete();
                            throw th5;
                        }
                    }
                }
                B0();
                try {
                    Object objNewInstance3 = Array.newInstance((Class<?>) f43882m, 1);
                    Array.set(objNewInstance3, 0, objNewInstance2);
                    return (Typeface) f43885p.invoke(null, objNewInstance3);
                } catch (IllegalAccessException | InvocationTargetException e5) {
                    org.bouncycastle.jce.provider.a.m(e5);
                    return null;
                }
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException e11) {
                org.bouncycastle.jce.provider.a.m(e11);
                return null;
            }
        }
        try {
            objNewInstance = this.f43888g.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused4) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            int length = eVarArr.length;
            while (true) {
                if (i12 < length) {
                    w6.e eVar2 = eVarArr[i12];
                    Context context2 = context;
                    if (x0(context2, objNewInstance, eVar2.f43241a, eVar2.f43245e, eVar2.f43242b, eVar2.f43243c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(eVar2.f43244d))) {
                        i12++;
                        context = context2;
                    } else {
                        try {
                            this.f43892k.invoke(objNewInstance, null);
                            break;
                        } catch (IllegalAccessException | InvocationTargetException unused5) {
                        }
                    }
                } else if (A0(objNewInstance)) {
                    return z0(objNewInstance);
                }
            }
        }
        return null;
    }

    @Override // na0.a
    public final Typeface i0(Context context, e7.i[] iVarArr, int i11) throws IOException {
        Object objNewInstance;
        Typeface typefaceZ0;
        boolean zBooleanValue;
        if (iVarArr.length >= 1) {
            Method method = this.f43889h;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    HashMap map = new HashMap();
                    for (e7.i iVar : iVarArr) {
                        if (iVar.f15837f == 0) {
                            Uri uri = iVar.f15832a;
                            if (!map.containsKey(uri)) {
                                map.put(uri, nx.d.C(context, uri));
                            }
                        }
                    }
                    Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                    try {
                        objNewInstance = this.f43888g.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        objNewInstance = null;
                    }
                    if (objNewInstance != null) {
                        int length = iVarArr.length;
                        int i12 = 0;
                        boolean z11 = false;
                        while (true) {
                            Method method2 = this.f43892k;
                            if (i12 < length) {
                                e7.i iVar2 = iVarArr[i12];
                                ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(iVar2.f15832a);
                                if (byteBuffer != null) {
                                    try {
                                        zBooleanValue = ((Boolean) this.f43890i.invoke(objNewInstance, byteBuffer, Integer.valueOf(iVar2.f15833b), null, Integer.valueOf(iVar2.f15834c), Integer.valueOf(iVar2.f15835d ? 1 : 0))).booleanValue();
                                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                                        zBooleanValue = false;
                                    }
                                    if (!zBooleanValue) {
                                        method2.invoke(objNewInstance, null);
                                        break;
                                    }
                                    z11 = true;
                                }
                                i12++;
                                z11 = z11;
                            } else if (!z11) {
                                method2.invoke(objNewInstance, null);
                            } else if (A0(objNewInstance) && (typefaceZ0 = z0(objNewInstance)) != null) {
                                return Typeface.create(typefaceZ0, i11);
                            }
                        }
                    }
                } else {
                    int i13 = (i11 & 1) == 0 ? 400 : 700;
                    boolean z12 = (i11 & 2) != 0;
                    int i14 = Integer.MAX_VALUE;
                    e7.i iVar3 = null;
                    for (e7.i iVar4 : iVarArr) {
                        int iAbs = (Math.abs(iVar4.f15834c - i13) * 2) + (iVar4.f15835d == z12 ? 0 : 1);
                        if (iVar3 == null || i14 > iAbs) {
                            iVar3 = iVar4;
                            i14 = iAbs;
                        }
                    }
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(iVar3.f15832a, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(iVar3.f15834c).setItalic(iVar3.f15835d).build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceBuild;
                        } finally {
                        }
                    }
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return null;
                    }
                }
            } catch (IOException | IllegalAccessException | InvocationTargetException unused3) {
            }
        }
        return null;
    }

    @Override // na0.a
    public final Typeface k0(Context context, Resources resources, int i11, String str) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        InputStream inputStreamOpenRawResource;
        Method method = this.f43889h;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method != null) {
            try {
                objNewInstance = this.f43888g.newInstance(null);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                objNewInstance = null;
            }
            if (objNewInstance != null) {
                if (!x0(context, objNewInstance, str, 0, -1, -1, null)) {
                    try {
                        this.f43892k.invoke(objNewInstance, null);
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                } else if (A0(objNewInstance)) {
                    return z0(objNewInstance);
                }
            }
        } else {
            File fileV = nx.d.v(context);
            try {
                if (fileV != null) {
                    try {
                        inputStreamOpenRawResource = resources.openRawResource(i11);
                        try {
                            boolean zN = nx.d.n(fileV, inputStreamOpenRawResource);
                            if (inputStreamOpenRawResource != null) {
                                try {
                                    inputStreamOpenRawResource.close();
                                } catch (IOException unused3) {
                                }
                            }
                            if (!zN) {
                                fileV.delete();
                                return null;
                            }
                            Typeface typefaceCreateFromFile = Typeface.createFromFile(fileV.getPath());
                            fileV.delete();
                            return typefaceCreateFromFile;
                        } catch (Throwable th2) {
                            th = th2;
                            Throwable th3 = th;
                            if (inputStreamOpenRawResource == null) {
                                throw th3;
                            }
                            try {
                                inputStreamOpenRawResource.close();
                                throw th3;
                            } catch (IOException unused4) {
                                throw th3;
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        inputStreamOpenRawResource = null;
                    }
                }
            } catch (RuntimeException unused5) {
                fileV.delete();
                return null;
            } catch (Throwable th5) {
                fileV.delete();
                throw th5;
            }
        }
        return null;
    }

    public final boolean x0(Context context, Object obj, String str, int i11, int i12, int i13, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f43889h.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface z0(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f43887f, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.l.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }
}
