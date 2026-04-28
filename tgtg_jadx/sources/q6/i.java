package q6;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f36214e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f36215f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f36216g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f36217h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f36218i = Float.NaN;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f36219j = Float.NaN;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f36220k = Float.NaN;
    public float l = Float.NaN;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f36221m = 0;

    @Override // q6.b
    public final void a(HashMap map) {
        throw null;
    }

    @Override // q6.b
    /* JADX INFO: renamed from: b */
    public final b clone() {
        i iVar = new i();
        super.c(this);
        iVar.f36215f = this.f36215f;
        iVar.f36216g = this.f36216g;
        iVar.f36217h = this.f36217h;
        iVar.f36218i = this.f36218i;
        iVar.f36219j = Float.NaN;
        iVar.f36220k = this.f36220k;
        iVar.l = this.l;
        return iVar;
    }

    @Override // q6.b
    public final void e(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.v.f2515i);
        SparseIntArray sparseIntArray = h.f36213a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i11);
            SparseIntArray sparseIntArray2 = h.f36213a;
            switch (sparseIntArray2.get(index)) {
                case 1:
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
                case 2:
                    this.f36078a = typedArrayObtainStyledAttributes.getInt(index, this.f36078a);
                    break;
                case 3:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.f36215f = typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        this.f36215f = i6.e.f23414d[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                    }
                    break;
                case 4:
                    this.f36214e = typedArrayObtainStyledAttributes.getInteger(index, this.f36214e);
                    break;
                case 5:
                    this.f36217h = typedArrayObtainStyledAttributes.getInt(index, this.f36217h);
                    break;
                case 6:
                    this.f36220k = typedArrayObtainStyledAttributes.getFloat(index, this.f36220k);
                    break;
                case 7:
                    this.l = typedArrayObtainStyledAttributes.getFloat(index, this.l);
                    break;
                case 8:
                    float f11 = typedArrayObtainStyledAttributes.getFloat(index, this.f36219j);
                    this.f36218i = f11;
                    this.f36219j = f11;
                    break;
                case 9:
                    this.f36221m = typedArrayObtainStyledAttributes.getInt(index, this.f36221m);
                    break;
                case 10:
                    this.f36216g = typedArrayObtainStyledAttributes.getInt(index, this.f36216g);
                    break;
                case 11:
                    this.f36218i = typedArrayObtainStyledAttributes.getFloat(index, this.f36218i);
                    break;
                case 12:
                    this.f36219j = typedArrayObtainStyledAttributes.getFloat(index, this.f36219j);
                    break;
                default:
                    Log.e("KeyPosition", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
            }
        }
        if (this.f36078a == -1) {
            Log.e("KeyPosition", "no frame position");
        }
    }

    @Override // q6.b
    public final void d(HashSet hashSet) {
    }
}
