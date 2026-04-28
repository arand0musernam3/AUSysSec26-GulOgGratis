package q6;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f36223e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f36224f = Float.NaN;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f36225g = Float.NaN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f36226h = Float.NaN;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f36227i = Float.NaN;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f36228j = Float.NaN;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f36229k = Float.NaN;
    public float l = Float.NaN;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f36230m = Float.NaN;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f36231n = Float.NaN;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f36232o = Float.NaN;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f36233p = Float.NaN;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f36234q = Float.NaN;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f36235r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f36236s = Float.NaN;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f36237t = 0.0f;

    public k() {
        this.f36081d = new HashMap();
    }

    @Override // q6.b
    public final void a(HashMap map) {
        throw null;
    }

    @Override // q6.b
    /* JADX INFO: renamed from: b */
    public final b clone() {
        k kVar = new k();
        super.c(this);
        kVar.f36223e = this.f36223e;
        kVar.f36235r = this.f36235r;
        kVar.f36236s = this.f36236s;
        kVar.f36237t = this.f36237t;
        kVar.f36234q = this.f36234q;
        kVar.f36224f = this.f36224f;
        kVar.f36225g = this.f36225g;
        kVar.f36226h = this.f36226h;
        kVar.f36229k = this.f36229k;
        kVar.f36227i = this.f36227i;
        kVar.f36228j = this.f36228j;
        kVar.l = this.l;
        kVar.f36230m = this.f36230m;
        kVar.f36231n = this.f36231n;
        kVar.f36232o = this.f36232o;
        kVar.f36233p = this.f36233p;
        return kVar;
    }

    @Override // q6.b
    public final void d(HashSet hashSet) {
        if (!Float.isNaN(this.f36224f)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f36225g)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f36226h)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f36227i)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f36228j)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f36231n)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f36232o)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f36233p)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f36229k)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.l)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f36230m)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f36234q)) {
            hashSet.add("progress");
        }
        if (this.f36081d.size() > 0) {
            Iterator it = this.f36081d.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + ((String) it.next()));
            }
        }
    }

    @Override // q6.b
    public final void e(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.v.f2516j);
        SparseIntArray sparseIntArray = j.f36222a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i11);
            SparseIntArray sparseIntArray2 = j.f36222a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    this.f36224f = typedArrayObtainStyledAttributes.getFloat(index, this.f36224f);
                    break;
                case 2:
                    this.f36225g = typedArrayObtainStyledAttributes.getDimension(index, this.f36225g);
                    break;
                case 3:
                case 11:
                default:
                    Log.e("KeyTimeCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
                case 4:
                    this.f36226h = typedArrayObtainStyledAttributes.getFloat(index, this.f36226h);
                    break;
                case 5:
                    this.f36227i = typedArrayObtainStyledAttributes.getFloat(index, this.f36227i);
                    break;
                case 6:
                    this.f36228j = typedArrayObtainStyledAttributes.getFloat(index, this.f36228j);
                    break;
                case 7:
                    this.l = typedArrayObtainStyledAttributes.getFloat(index, this.l);
                    break;
                case 8:
                    this.f36229k = typedArrayObtainStyledAttributes.getFloat(index, this.f36229k);
                    break;
                case 9:
                    typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 10:
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
                case 12:
                    this.f36078a = typedArrayObtainStyledAttributes.getInt(index, this.f36078a);
                    break;
                case 13:
                    this.f36223e = typedArrayObtainStyledAttributes.getInteger(index, this.f36223e);
                    break;
                case 14:
                    this.f36230m = typedArrayObtainStyledAttributes.getFloat(index, this.f36230m);
                    break;
                case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                    this.f36231n = typedArrayObtainStyledAttributes.getDimension(index, this.f36231n);
                    break;
                case 16:
                    this.f36232o = typedArrayObtainStyledAttributes.getDimension(index, this.f36232o);
                    break;
                case 17:
                    this.f36233p = typedArrayObtainStyledAttributes.getDimension(index, this.f36233p);
                    break;
                case 18:
                    this.f36234q = typedArrayObtainStyledAttributes.getFloat(index, this.f36234q);
                    break;
                case 19:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                        this.f36235r = 7;
                    } else {
                        this.f36235r = typedArrayObtainStyledAttributes.getInt(index, this.f36235r);
                    }
                    break;
                case 20:
                    this.f36236s = typedArrayObtainStyledAttributes.getFloat(index, this.f36236s);
                    break;
                case 21:
                    int i12 = typedArrayObtainStyledAttributes.peekValue(index).type;
                    float f11 = this.f36237t;
                    if (i12 == 5) {
                        this.f36237t = typedArrayObtainStyledAttributes.getDimension(index, f11);
                    } else {
                        this.f36237t = typedArrayObtainStyledAttributes.getFloat(index, f11);
                    }
                    break;
            }
        }
    }

    @Override // q6.b
    public final void f(HashMap map) {
        if (this.f36223e == -1) {
            return;
        }
        if (!Float.isNaN(this.f36224f)) {
            map.put("alpha", Integer.valueOf(this.f36223e));
        }
        if (!Float.isNaN(this.f36225g)) {
            map.put("elevation", Integer.valueOf(this.f36223e));
        }
        if (!Float.isNaN(this.f36226h)) {
            map.put("rotation", Integer.valueOf(this.f36223e));
        }
        if (!Float.isNaN(this.f36227i)) {
            map.put("rotationX", Integer.valueOf(this.f36223e));
        }
        if (!Float.isNaN(this.f36228j)) {
            map.put("rotationY", Integer.valueOf(this.f36223e));
        }
        if (!Float.isNaN(this.f36231n)) {
            map.put("translationX", Integer.valueOf(this.f36223e));
        }
        if (!Float.isNaN(this.f36232o)) {
            map.put("translationY", Integer.valueOf(this.f36223e));
        }
        if (!Float.isNaN(this.f36233p)) {
            map.put("translationZ", Integer.valueOf(this.f36223e));
        }
        if (!Float.isNaN(this.f36229k)) {
            map.put("transitionPathRotate", Integer.valueOf(this.f36223e));
        }
        if (!Float.isNaN(this.l)) {
            map.put("scaleX", Integer.valueOf(this.f36223e));
        }
        if (!Float.isNaN(this.l)) {
            map.put("scaleY", Integer.valueOf(this.f36223e));
        }
        if (!Float.isNaN(this.f36234q)) {
            map.put("progress", Integer.valueOf(this.f36223e));
        }
        if (this.f36081d.size() > 0) {
            Iterator it = this.f36081d.keySet().iterator();
            while (it.hasNext()) {
                map.put(e0.f.k("CUSTOM,", (String) it.next()), Integer.valueOf(this.f36223e));
            }
        }
    }

    public final void g(HashMap map) {
        for (String str : map.keySet()) {
            p6.q qVar = (p6.q) map.get(str);
            if (qVar != null) {
                if (!str.startsWith("CUSTOM")) {
                    switch (str) {
                        case "rotationX":
                            if (Float.isNaN(this.f36227i)) {
                                break;
                            } else {
                                qVar.c(this.f36227i, this.f36236s, this.f36237t, this.f36078a, this.f36235r);
                                break;
                            }
                            break;
                        case "rotationY":
                            if (Float.isNaN(this.f36228j)) {
                                break;
                            } else {
                                qVar.c(this.f36228j, this.f36236s, this.f36237t, this.f36078a, this.f36235r);
                                break;
                            }
                            break;
                        case "translationX":
                            if (Float.isNaN(this.f36231n)) {
                                break;
                            } else {
                                qVar.c(this.f36231n, this.f36236s, this.f36237t, this.f36078a, this.f36235r);
                                break;
                            }
                            break;
                        case "translationY":
                            if (Float.isNaN(this.f36232o)) {
                                break;
                            } else {
                                qVar.c(this.f36232o, this.f36236s, this.f36237t, this.f36078a, this.f36235r);
                                break;
                            }
                            break;
                        case "translationZ":
                            if (Float.isNaN(this.f36233p)) {
                                break;
                            } else {
                                qVar.c(this.f36233p, this.f36236s, this.f36237t, this.f36078a, this.f36235r);
                                break;
                            }
                            break;
                        case "progress":
                            if (Float.isNaN(this.f36234q)) {
                                break;
                            } else {
                                qVar.c(this.f36234q, this.f36236s, this.f36237t, this.f36078a, this.f36235r);
                                break;
                            }
                            break;
                        case "scaleX":
                            if (Float.isNaN(this.l)) {
                                break;
                            } else {
                                qVar.c(this.l, this.f36236s, this.f36237t, this.f36078a, this.f36235r);
                                break;
                            }
                            break;
                        case "scaleY":
                            if (Float.isNaN(this.f36230m)) {
                                break;
                            } else {
                                qVar.c(this.f36230m, this.f36236s, this.f36237t, this.f36078a, this.f36235r);
                                break;
                            }
                            break;
                        case "rotation":
                            if (Float.isNaN(this.f36226h)) {
                                break;
                            } else {
                                qVar.c(this.f36226h, this.f36236s, this.f36237t, this.f36078a, this.f36235r);
                                break;
                            }
                            break;
                        case "elevation":
                            if (Float.isNaN(this.f36225g)) {
                                break;
                            } else {
                                qVar.c(this.f36225g, this.f36236s, this.f36237t, this.f36078a, this.f36235r);
                                break;
                            }
                            break;
                        case "transitionPathRotate":
                            if (Float.isNaN(this.f36229k)) {
                                break;
                            } else {
                                qVar.c(this.f36229k, this.f36236s, this.f36237t, this.f36078a, this.f36235r);
                                break;
                            }
                            break;
                        case "alpha":
                            if (Float.isNaN(this.f36224f)) {
                                break;
                            } else {
                                qVar.c(this.f36224f, this.f36236s, this.f36237t, this.f36078a, this.f36235r);
                                break;
                            }
                            break;
                        default:
                            Log.e("KeyTimeCycles", "UNKNOWN addValues \"" + str + "\"");
                            break;
                    }
                } else {
                    androidx.constraintlayout.widget.b bVar = (androidx.constraintlayout.widget.b) this.f36081d.get(str.substring(7));
                    if (bVar != null) {
                        p6.n nVar = (p6.n) qVar;
                        int i11 = this.f36078a;
                        float f11 = this.f36236s;
                        int i12 = this.f36235r;
                        float f12 = this.f36237t;
                        nVar.l.append(i11, bVar);
                        nVar.f34521m.append(i11, new float[]{f11, f12});
                        nVar.f34525b = Math.max(nVar.f34525b, i12);
                    }
                }
            }
        }
    }
}
