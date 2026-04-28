package w6;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import com.adyen.checkout.ui.core.internal.ui.view.RoundCornerImageView;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float[][] f43232a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float[][] f43233b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float[] f43234c = {95.047f, 100.0f, 108.883f};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float[][] f43235d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f43236e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Method f43237f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f43238g;

    public static ColorStateList b(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        if (e(xmlPullParser, "tint")) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(1, typedValue);
            int i11 = typedValue.type;
            if (i11 != 2) {
                if (i11 >= 28 && i11 <= 31) {
                    return ColorStateList.valueOf(typedValue.data);
                }
                Resources resources = typedArray.getResources();
                int resourceId = typedArray.getResourceId(1, 0);
                ThreadLocal threadLocal = b.f43239a;
                try {
                    return b.a(resources, resources.getXml(resourceId), theme);
                } catch (Exception e5) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e5);
                    return null;
                }
            }
            j4.d.l(typedValue, "Failed to resolve attribute at index 1: ");
        }
        return null;
    }

    public static a3.j c(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i11) {
        a3.j jVarG;
        if (e(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i11, typedValue);
            int i12 = typedValue.type;
            if (i12 >= 28 && i12 <= 31) {
                return new a3.j((Shader) null, (ColorStateList) null, typedValue.data);
            }
            try {
                jVarG = a3.j.g(typedArray.getResources(), typedArray.getResourceId(i11, 0), theme);
            } catch (Exception e5) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e5);
                jVarG = null;
            }
            if (jVarG != null) {
                return jVarG;
            }
        }
        return new a3.j((Shader) null, (ColorStateList) null, 0);
    }

    public static int d(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i11, int i12) {
        return !e(xmlPullParser, str) ? i12 : typedArray.getInt(i11, i12);
    }

    public static boolean e(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static int f(float f11) {
        if (f11 < 1.0f) {
            return RoundCornerImageView.DEFAULT_STROKE_COLOR;
        }
        if (f11 > 99.0f) {
            return -1;
        }
        float f12 = (f11 + 16.0f) / 116.0f;
        float f13 = f11 > 8.0f ? f12 * f12 * f12 : f11 / 903.2963f;
        float f14 = f12 * f12 * f12;
        boolean z11 = f14 > 0.008856452f;
        float f15 = z11 ? f14 : ((f12 * 116.0f) - 16.0f) / 903.2963f;
        if (!z11) {
            f14 = ((f12 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f43234c;
        return x6.c.a(f15 * fArr[0], f13 * fArr[1], f14 * fArr[2]);
    }

    public static float g(int i11) {
        float f11 = i11 / 255.0f;
        return (f11 <= 0.04045f ? f11 / 12.92f : (float) Math.pow((f11 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static TypedArray h(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0118 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:195:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static w6.c k(android.content.res.XmlResourceParser r26, android.content.res.Resources r27) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w6.a.k(android.content.res.XmlResourceParser, android.content.res.Resources):w6.c");
    }

    public static List l(Resources resources, int i11) {
        if (i11 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i11);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (typedArrayObtainTypedArray.getType(0) == 1) {
                for (int i12 = 0; i12 < typedArrayObtainTypedArray.length(); i12++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i12, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i11);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    public static void m(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i11 = 1;
        while (i11 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i11++;
            } else if (next == 3) {
                i11--;
            }
        }
    }

    public static float n() {
        return ((float) Math.pow((((double) 50.0f) + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    public void a(int i11) {
        new Handler(Looper.getMainLooper()).post(new b0.h(this, i11, 7));
    }

    public abstract void i(int i11);

    public abstract void j(Typeface typeface);
}
