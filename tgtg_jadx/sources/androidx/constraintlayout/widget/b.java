package androidx.constraintlayout.widget;

import a40.d0;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f2351a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f2352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f2353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2354d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f2355e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f2356f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f2357g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f2358h;

    public b(b bVar, Object obj) {
        this.f2352b = bVar.f2352b;
        this.f2353c = bVar.f2353c;
        f(obj);
    }

    public static void d(Context context, XmlResourceParser xmlResourceParser, HashMap map) {
        a aVar;
        Object objValueOf;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), v.f2512f);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string = null;
        Object objValueOf2 = null;
        a aVar2 = null;
        boolean z11 = false;
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i11);
            if (index == 0) {
                string = typedArrayObtainStyledAttributes.getString(index);
                if (string != null && string.length() > 0) {
                    string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                }
            } else if (index == 10) {
                string = typedArrayObtainStyledAttributes.getString(index);
                z11 = true;
            } else if (index == 1) {
                objValueOf2 = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                aVar2 = a.BOOLEAN_TYPE;
            } else {
                if (index == 3) {
                    aVar = a.COLOR_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == 2) {
                    aVar = a.COLOR_DRAWABLE_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == 7) {
                    aVar = a.DIMENSION_TYPE;
                    objValueOf = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == 4) {
                    aVar = a.DIMENSION_TYPE;
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == 5) {
                    aVar = a.FLOAT_TYPE;
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == 6) {
                    aVar = a.INT_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                } else if (index == 9) {
                    aVar = a.STRING_TYPE;
                    objValueOf = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == 8) {
                    aVar = a.REFERENCE_TYPE;
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    objValueOf = Integer.valueOf(resourceId);
                }
                Object obj = objValueOf;
                aVar2 = aVar;
                objValueOf2 = obj;
            }
        }
        if (string != null && objValueOf2 != null) {
            b bVar = new b();
            bVar.f2352b = string;
            bVar.f2353c = aVar2;
            bVar.f2351a = z11;
            bVar.f(objValueOf2);
            map.put(string, bVar);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void e(View view, HashMap map) {
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            b bVar = (b) map.get(str);
            String strK = !bVar.f2351a ? e0.f.k("set", str) : str;
            try {
                int iOrdinal = bVar.f2353c.ordinal();
                Class cls2 = Float.TYPE;
                Class cls3 = Integer.TYPE;
                switch (iOrdinal) {
                    case 0:
                        cls.getMethod(strK, cls3).invoke(view, Integer.valueOf(bVar.f2354d));
                        break;
                    case 1:
                        cls.getMethod(strK, cls2).invoke(view, Float.valueOf(bVar.f2355e));
                        break;
                    case 2:
                        cls.getMethod(strK, cls3).invoke(view, Integer.valueOf(bVar.f2358h));
                        break;
                    case 3:
                        Method method = cls.getMethod(strK, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(bVar.f2358h);
                        method.invoke(view, colorDrawable);
                        break;
                    case 4:
                        cls.getMethod(strK, CharSequence.class).invoke(view, bVar.f2356f);
                        break;
                    case 5:
                        cls.getMethod(strK, Boolean.TYPE).invoke(view, Boolean.valueOf(bVar.f2357g));
                        break;
                    case 6:
                        cls.getMethod(strK, cls2).invoke(view, Float.valueOf(bVar.f2355e));
                        break;
                    case 7:
                        cls.getMethod(strK, cls3).invoke(view, Integer.valueOf(bVar.f2354d));
                        break;
                }
            } catch (IllegalAccessException e5) {
                StringBuilder sbS = e0.f.s(" Custom Attribute \"", str, "\" not found on ");
                sbS.append(cls.getName());
                Log.e("TransitionLayout", sbS.toString(), e5);
            } catch (NoSuchMethodException e11) {
                Log.e("TransitionLayout", cls.getName() + " must have a method " + strK, e11);
            } catch (InvocationTargetException e12) {
                StringBuilder sbS2 = e0.f.s(" Custom Attribute \"", str, "\" not found on ");
                sbS2.append(cls.getName());
                Log.e("TransitionLayout", sbS2.toString(), e12);
            }
        }
    }

    public final float a() {
        switch (this.f2353c.ordinal()) {
            case 2:
            case 3:
                d0.k("Color does not have a single color to interpolate");
                break;
            case 4:
                d0.k("Cannot interpolate String");
                break;
            case 5:
                if (this.f2357g) {
                }
                break;
        }
        return 0.0f;
    }

    public final void b(float[] fArr) {
        switch (this.f2353c.ordinal()) {
            case 0:
                fArr[0] = this.f2354d;
                break;
            case 1:
                fArr[0] = this.f2355e;
                break;
            case 2:
            case 3:
                int i11 = (this.f2358h >> 24) & 255;
                float fPow = (float) Math.pow(((r0 >> 16) & 255) / 255.0f, 2.2d);
                float fPow2 = (float) Math.pow(((r0 >> 8) & 255) / 255.0f, 2.2d);
                float fPow3 = (float) Math.pow((r0 & 255) / 255.0f, 2.2d);
                fArr[0] = fPow;
                fArr[1] = fPow2;
                fArr[2] = fPow3;
                fArr[3] = i11 / 255.0f;
                break;
            case 4:
                d0.k("Color does not have a single color to interpolate");
                break;
            case 5:
                fArr[0] = this.f2357g ? 1.0f : 0.0f;
                break;
            case 6:
                fArr[0] = this.f2355e;
                break;
        }
    }

    public final int c() {
        int iOrdinal = this.f2353c.ordinal();
        return (iOrdinal == 2 || iOrdinal == 3) ? 4 : 1;
    }

    public final void f(Object obj) {
        switch (this.f2353c.ordinal()) {
            case 0:
            case 7:
                this.f2354d = ((Integer) obj).intValue();
                break;
            case 1:
                this.f2355e = ((Float) obj).floatValue();
                break;
            case 2:
            case 3:
                this.f2358h = ((Integer) obj).intValue();
                break;
            case 4:
                this.f2356f = (String) obj;
                break;
            case 5:
                this.f2357g = ((Boolean) obj).booleanValue();
                break;
            case 6:
                this.f2355e = ((Float) obj).floatValue();
                break;
        }
    }
}
