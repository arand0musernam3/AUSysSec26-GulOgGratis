package p;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 {
    public static final RectF l = new RectF();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final ConcurrentHashMap f34067m = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f34068a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f34069b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f34070c = -1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f34071d = -1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f34072e = -1.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f34073f = new int[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f34074g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextPaint f34075h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f34076i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Context f34077j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final u0 f34078k;

    public x0(TextView textView) {
        this.f34076i = textView;
        this.f34077j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f34078k = new v0();
        } else {
            this.f34078k = new u0();
        }
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i11 : iArr) {
                if (i11 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i11)) < 0) {
                    arrayList.add(Integer.valueOf(i11));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i12 = 0; i12 < size; i12++) {
                    iArr2[i12] = ((Integer) arrayList.get(i12)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public static Method d(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = f34067m;
            Method declaredMethod = (Method) concurrentHashMap.get(str);
            if (declaredMethod != null || (declaredMethod = TextView.class.getDeclaredMethod(str, null)) == null) {
                return declaredMethod;
            }
            declaredMethod.setAccessible(true);
            concurrentHashMap.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e5) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e5);
            return null;
        }
    }

    public static Object e(String str, Object obj, Object obj2) {
        try {
            return d(str).invoke(obj, null);
        } catch (Exception e5) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e5);
            return obj2;
        }
    }

    public final void a() {
        if (f()) {
            if (this.f34069b) {
                if (this.f34076i.getMeasuredHeight() <= 0 || this.f34076i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f34078k.b(this.f34076i) ? 1048576 : (this.f34076i.getMeasuredWidth() - this.f34076i.getTotalPaddingLeft()) - this.f34076i.getTotalPaddingRight();
                int height = (this.f34076i.getHeight() - this.f34076i.getCompoundPaddingBottom()) - this.f34076i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fC = c(rectF);
                        if (fC != this.f34076i.getTextSize()) {
                            g(fC, 0);
                        }
                    } finally {
                    }
                }
            }
            this.f34069b = true;
        }
    }

    public final int c(RectF rectF) {
        CharSequence transformation;
        int length = this.f34073f.length;
        if (length == 0) {
            com.braze.h2.b("No available text sizes to choose from.");
            return 0;
        }
        int i11 = length - 1;
        int i12 = 0;
        int i13 = 1;
        while (true) {
            int[] iArr = this.f34073f;
            if (i13 > i11) {
                return iArr[i12];
            }
            int i14 = (i13 + i11) / 2;
            int i15 = iArr[i14];
            TextView textView = this.f34076i;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                text = transformation;
            }
            int maxLines = textView.getMaxLines();
            TextPaint textPaint = this.f34075h;
            if (textPaint == null) {
                this.f34075h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f34075h.set(textView.getPaint());
            this.f34075h.setTextSize(i15);
            StaticLayout staticLayoutA = t0.a(text, (Layout.Alignment) e("getLayoutAlignment", textView, Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines, textView, this.f34075h, this.f34078k);
            if ((maxLines == -1 || (staticLayoutA.getLineCount() <= maxLines && staticLayoutA.getLineEnd(staticLayoutA.getLineCount() - 1) == text.length())) && staticLayoutA.getHeight() <= rectF.bottom) {
                int i16 = i14 + 1;
                i12 = i13;
                i13 = i16;
            } else {
                i12 = i14 - 1;
                i11 = i12;
            }
        }
    }

    public final boolean f() {
        return j() && this.f34068a != 0;
    }

    public final void g(float f11, int i11) {
        Context context = this.f34077j;
        float fApplyDimension = TypedValue.applyDimension(i11, f11, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.f34076i;
        if (fApplyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(fApplyDimension);
            boolean zIsInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f34069b = false;
                try {
                    Method methodD = d("nullLayouts");
                    if (methodD != null) {
                        methodD.invoke(textView, null);
                    }
                } catch (Exception e5) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e5);
                }
                if (zIsInLayout) {
                    textView.forceLayout();
                } else {
                    textView.requestLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean h() {
        if (j() && this.f34068a == 1) {
            if (!this.f34074g || this.f34073f.length == 0) {
                int iFloor = ((int) Math.floor((this.f34072e - this.f34071d) / this.f34070c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i11 = 0; i11 < iFloor; i11++) {
                    iArr[i11] = Math.round((i11 * this.f34070c) + this.f34071d);
                }
                this.f34073f = b(iArr);
            }
            this.f34069b = true;
        } else {
            this.f34069b = false;
        }
        return this.f34069b;
    }

    public final boolean i() {
        boolean z11 = this.f34073f.length > 0;
        this.f34074g = z11;
        if (z11) {
            this.f34068a = 1;
            this.f34071d = r0[0];
            this.f34072e = r0[r1 - 1];
            this.f34070c = -1.0f;
        }
        return z11;
    }

    public final boolean j() {
        return !(this.f34076i instanceof o);
    }

    public final void k(float f11, float f12, float f13) {
        if (f11 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f11 + "px) is less or equal to (0px)");
        }
        if (f12 <= f11) {
            j4.d.g("Maximum auto-size text size (", f12, "px) is less or equal to minimum auto-size text size (", f11, "px)");
            return;
        }
        if (f13 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f13 + "px) is less or equal to (0px)");
        }
        this.f34068a = 1;
        this.f34071d = f11;
        this.f34072e = f12;
        this.f34070c = f13;
        this.f34074g = false;
    }
}
