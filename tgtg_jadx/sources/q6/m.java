package q6;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import o00.x0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends b {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f36256w;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f36239e = 0.1f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f36240f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f36241g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f36242h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public RectF f36243i = new RectF();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public RectF f36244j = new RectF();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public HashMap f36245k = new HashMap();
    public String l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f36246m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f36247n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f36248o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f36249p = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f36250q = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public View f36251r = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f36252s = true;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f36253t = true;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f36254u = true;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f36255v = Float.NaN;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f36257x = false;

    public m() {
        this.f36081d = new HashMap();
    }

    public static void i(RectF rectF, View view, boolean z11) {
        rectF.top = view.getTop();
        rectF.bottom = view.getBottom();
        rectF.left = view.getLeft();
        rectF.right = view.getRight();
        if (z11) {
            view.getMatrix().mapRect(rectF);
        }
    }

    @Override // q6.b
    public final void a(HashMap map) {
        throw null;
    }

    @Override // q6.b
    /* JADX INFO: renamed from: b */
    public final b clone() {
        m mVar = new m();
        super.c(this);
        mVar.l = this.l;
        mVar.f36246m = this.f36246m;
        mVar.f36247n = this.f36247n;
        mVar.f36248o = this.f36248o;
        mVar.f36249p = this.f36249p;
        mVar.f36250q = this.f36250q;
        mVar.f36251r = this.f36251r;
        mVar.f36239e = this.f36239e;
        mVar.f36252s = this.f36252s;
        mVar.f36253t = this.f36253t;
        mVar.f36254u = this.f36254u;
        mVar.f36255v = this.f36255v;
        mVar.f36256w = this.f36256w;
        mVar.f36257x = this.f36257x;
        mVar.f36243i = this.f36243i;
        mVar.f36244j = this.f36244j;
        mVar.f36245k = this.f36245k;
        return mVar;
    }

    @Override // q6.b
    public final void e(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.v.f2517k);
        SparseIntArray sparseIntArray = l.f36238a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i11);
            SparseIntArray sparseIntArray2 = l.f36238a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    this.f36247n = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 2:
                    this.f36248o = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 3:
                default:
                    Log.e("KeyTrigger", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
                case 4:
                    this.l = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 5:
                    this.f36239e = typedArrayObtainStyledAttributes.getFloat(index, this.f36239e);
                    break;
                case 6:
                    this.f36249p = typedArrayObtainStyledAttributes.getResourceId(index, this.f36249p);
                    break;
                case 7:
                    if (MotionLayout.f2261u1) {
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f36079b);
                        this.f36079b = resourceId;
                        if (resourceId == -1) {
                            this.f36080c = typedArrayObtainStyledAttributes.getString(index);
                        }
                    } else if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.f36080c = typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        this.f36079b = typedArrayObtainStyledAttributes.getResourceId(index, this.f36079b);
                    }
                    break;
                case 8:
                    int integer = typedArrayObtainStyledAttributes.getInteger(index, this.f36078a);
                    this.f36078a = integer;
                    this.f36255v = (integer + 0.5f) / 100.0f;
                    break;
                case 9:
                    this.f36250q = typedArrayObtainStyledAttributes.getResourceId(index, this.f36250q);
                    break;
                case 10:
                    this.f36257x = typedArrayObtainStyledAttributes.getBoolean(index, this.f36257x);
                    break;
                case 11:
                    this.f36246m = typedArrayObtainStyledAttributes.getResourceId(index, this.f36246m);
                    break;
                case 12:
                    this.f36242h = typedArrayObtainStyledAttributes.getResourceId(index, this.f36242h);
                    break;
                case 13:
                    this.f36240f = typedArrayObtainStyledAttributes.getResourceId(index, this.f36240f);
                    break;
                case 14:
                    this.f36241g = typedArrayObtainStyledAttributes.getResourceId(index, this.f36241g);
                    break;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(android.view.View r11, float r12) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q6.m.g(android.view.View, float):void");
    }

    public final void h(View view, String str) {
        Method method;
        if (str == null) {
            return;
        }
        if (!str.startsWith(".")) {
            if (this.f36245k.containsKey(str)) {
                method = (Method) this.f36245k.get(str);
                if (method == null) {
                    return;
                }
            } else {
                method = null;
            }
            if (method == null) {
                try {
                    method = view.getClass().getMethod(str, null);
                    this.f36245k.put(str, method);
                } catch (NoSuchMethodException unused) {
                    this.f36245k.put(str, null);
                    Log.e("KeyTrigger", "Could not find method \"" + str + "\"on class " + view.getClass().getSimpleName() + " " + x0.w(view));
                    return;
                }
            }
            try {
                method.invoke(view, null);
                return;
            } catch (Exception unused2) {
                Log.e("KeyTrigger", "Exception in call \"" + this.l + "\"on class " + view.getClass().getSimpleName() + " " + x0.w(view));
                return;
            }
        }
        boolean z11 = str.length() == 1;
        if (!z11) {
            str = str.substring(1).toLowerCase(Locale.ROOT);
        }
        for (String str2 : this.f36081d.keySet()) {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            if (z11 || lowerCase.matches(str)) {
                androidx.constraintlayout.widget.b bVar = (androidx.constraintlayout.widget.b) this.f36081d.get(str2);
                if (bVar != null) {
                    Class<?> cls = view.getClass();
                    String str3 = bVar.f2352b;
                    String strK = !bVar.f2351a ? e0.f.k("set", str3) : str3;
                    try {
                        int iOrdinal = bVar.f2353c.ordinal();
                        Class cls2 = Integer.TYPE;
                        Class cls3 = Float.TYPE;
                        switch (iOrdinal) {
                            case 0:
                            case 7:
                                cls.getMethod(strK, cls2).invoke(view, Integer.valueOf(bVar.f2354d));
                                break;
                            case 1:
                                cls.getMethod(strK, cls3).invoke(view, Float.valueOf(bVar.f2355e));
                                break;
                            case 2:
                                cls.getMethod(strK, cls2).invoke(view, Integer.valueOf(bVar.f2358h));
                                break;
                            case 3:
                                Method method2 = cls.getMethod(strK, Drawable.class);
                                ColorDrawable colorDrawable = new ColorDrawable();
                                colorDrawable.setColor(bVar.f2358h);
                                method2.invoke(view, colorDrawable);
                                break;
                            case 4:
                                cls.getMethod(strK, CharSequence.class).invoke(view, bVar.f2356f);
                                break;
                            case 5:
                                cls.getMethod(strK, Boolean.TYPE).invoke(view, Boolean.valueOf(bVar.f2357g));
                                break;
                            case 6:
                                cls.getMethod(strK, cls3).invoke(view, Float.valueOf(bVar.f2355e));
                                break;
                        }
                    } catch (IllegalAccessException e5) {
                        StringBuilder sbS = e0.f.s(" Custom Attribute \"", str3, "\" not found on ");
                        sbS.append(cls.getName());
                        Log.e("TransitionLayout", sbS.toString(), e5);
                    } catch (NoSuchMethodException e11) {
                        Log.e("TransitionLayout", cls.getName() + " must have a method " + strK, e11);
                    } catch (InvocationTargetException e12) {
                        StringBuilder sbS2 = e0.f.s(" Custom Attribute \"", str3, "\" not found on ");
                        sbS2.append(cls.getName());
                        Log.e("TransitionLayout", sbS2.toString(), e12);
                    }
                }
            }
        }
    }

    @Override // q6.b
    public final void d(HashSet hashSet) {
    }
}
