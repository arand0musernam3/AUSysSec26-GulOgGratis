package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f2381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f2382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f2383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f2384d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2385e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final q f2386f;

    public i(Context context, XmlResourceParser xmlResourceParser) {
        this.f2381a = Float.NaN;
        this.f2382b = Float.NaN;
        this.f2383c = Float.NaN;
        this.f2384d = Float.NaN;
        this.f2385e = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), v.f2529x);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i11);
            if (index == 0) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f2385e);
                this.f2385e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    q qVar = new q();
                    this.f2386f = qVar;
                    qVar.e((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.f2384d = typedArrayObtainStyledAttributes.getDimension(index, this.f2384d);
            } else if (index == 2) {
                this.f2382b = typedArrayObtainStyledAttributes.getDimension(index, this.f2382b);
            } else if (index == 3) {
                this.f2383c = typedArrayObtainStyledAttributes.getDimension(index, this.f2383c);
            } else if (index == 4) {
                this.f2381a = typedArrayObtainStyledAttributes.getDimension(index, this.f2381a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final boolean a(float f11, float f12) {
        float f13 = this.f2381a;
        if (!Float.isNaN(f13) && f11 < f13) {
            return false;
        }
        float f14 = this.f2382b;
        if (!Float.isNaN(f14) && f12 < f14) {
            return false;
        }
        float f15 = this.f2383c;
        if (!Float.isNaN(f15) && f11 > f15) {
            return false;
        }
        float f16 = this.f2384d;
        return Float.isNaN(f16) || f12 <= f16;
    }
}
