package q6;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 {
    public static final float[][] E = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};
    public static final float[][] F = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};
    public final float A;
    public final float B;
    public final int C;
    public final int D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f36136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f36137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f36138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f36139d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f36140e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f36141f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f36142g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f36143h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f36144i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f36145j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f36146k;
    public float l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f36147m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float[] f36148n = new float[2];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int[] f36149o = new int[2];

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f36150p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f36151q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final MotionLayout f36152r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final float f36153s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final float f36154t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f36155u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final float f36156v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f36157w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final float f36158x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final float f36159y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final float f36160z;

    public e0(Context context, MotionLayout motionLayout, XmlResourceParser xmlResourceParser) {
        this.f36136a = 0;
        this.f36137b = 0;
        this.f36138c = 0;
        this.f36139d = -1;
        this.f36140e = -1;
        this.f36141f = -1;
        this.f36142g = 0.5f;
        this.f36143h = 0.5f;
        this.f36144i = -1;
        this.f36145j = false;
        this.f36146k = 0.0f;
        this.l = 1.0f;
        this.f36153s = 4.0f;
        this.f36154t = 1.2f;
        this.f36155u = true;
        this.f36156v = 1.0f;
        this.f36157w = 0;
        this.f36158x = 10.0f;
        this.f36159y = 10.0f;
        this.f36160z = 1.0f;
        this.A = Float.NaN;
        this.B = Float.NaN;
        this.C = 0;
        this.D = 0;
        this.f36152r = motionLayout;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), androidx.constraintlayout.widget.v.f2523r);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i11);
            if (index == 16) {
                this.f36139d = typedArrayObtainStyledAttributes.getResourceId(index, this.f36139d);
            } else if (index == 17) {
                int i12 = typedArrayObtainStyledAttributes.getInt(index, this.f36136a);
                this.f36136a = i12;
                float[] fArr = E[i12];
                this.f36143h = fArr[0];
                this.f36142g = fArr[1];
            } else if (index == 1) {
                int i13 = typedArrayObtainStyledAttributes.getInt(index, this.f36137b);
                this.f36137b = i13;
                if (i13 < 6) {
                    float[] fArr2 = F[i13];
                    this.f36146k = fArr2[0];
                    this.l = fArr2[1];
                } else {
                    this.l = Float.NaN;
                    this.f36146k = Float.NaN;
                    this.f36145j = true;
                }
            } else if (index == 6) {
                this.f36153s = typedArrayObtainStyledAttributes.getFloat(index, this.f36153s);
            } else if (index == 5) {
                this.f36154t = typedArrayObtainStyledAttributes.getFloat(index, this.f36154t);
            } else if (index == 7) {
                this.f36155u = typedArrayObtainStyledAttributes.getBoolean(index, this.f36155u);
            } else if (index == 2) {
                this.f36156v = typedArrayObtainStyledAttributes.getFloat(index, this.f36156v);
            } else if (index == 3) {
                this.f36158x = typedArrayObtainStyledAttributes.getFloat(index, this.f36158x);
            } else if (index == 18) {
                this.f36140e = typedArrayObtainStyledAttributes.getResourceId(index, this.f36140e);
            } else if (index == 9) {
                this.f36138c = typedArrayObtainStyledAttributes.getInt(index, this.f36138c);
            } else if (index == 8) {
                this.f36157w = typedArrayObtainStyledAttributes.getInteger(index, 0);
            } else if (index == 4) {
                this.f36141f = typedArrayObtainStyledAttributes.getResourceId(index, 0);
            } else if (index == 10) {
                this.f36144i = typedArrayObtainStyledAttributes.getResourceId(index, this.f36144i);
            } else if (index == 12) {
                this.f36159y = typedArrayObtainStyledAttributes.getFloat(index, this.f36159y);
            } else if (index == 13) {
                this.f36160z = typedArrayObtainStyledAttributes.getFloat(index, this.f36160z);
            } else if (index == 14) {
                this.A = typedArrayObtainStyledAttributes.getFloat(index, this.A);
            } else if (index == 15) {
                this.B = typedArrayObtainStyledAttributes.getFloat(index, this.B);
            } else if (index == 11) {
                this.C = typedArrayObtainStyledAttributes.getInt(index, this.C);
            } else if (index == 0) {
                this.D = typedArrayObtainStyledAttributes.getInt(index, this.D);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final RectF a(ViewGroup viewGroup, RectF rectF) {
        View viewFindViewById;
        int i11 = this.f36141f;
        if (i11 == -1 || (viewFindViewById = viewGroup.findViewById(i11)) == null) {
            return null;
        }
        rectF.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
        return rectF;
    }

    public final RectF b(ViewGroup viewGroup, RectF rectF) {
        View viewFindViewById;
        int i11 = this.f36140e;
        if (i11 == -1 || (viewFindViewById = viewGroup.findViewById(i11)) == null) {
            return null;
        }
        rectF.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
        return rectF;
    }

    public final void c(boolean z11) {
        float[][] fArr = E;
        float[][] fArr2 = F;
        if (z11) {
            fArr2[4] = fArr2[3];
            fArr2[5] = fArr2[2];
            fArr[5] = fArr[2];
            fArr[6] = fArr[1];
        } else {
            fArr2[4] = fArr2[2];
            fArr2[5] = fArr2[3];
            fArr[5] = fArr[1];
            fArr[6] = fArr[2];
        }
        float[] fArr3 = fArr[this.f36136a];
        this.f36143h = fArr3[0];
        this.f36142g = fArr3[1];
        int i11 = this.f36137b;
        if (i11 >= 6) {
            return;
        }
        float[] fArr4 = fArr2[i11];
        this.f36146k = fArr4[0];
        this.l = fArr4[1];
    }

    public final String toString() {
        if (Float.isNaN(this.f36146k)) {
            return "rotation";
        }
        return this.f36146k + " , " + this.l;
    }
}
