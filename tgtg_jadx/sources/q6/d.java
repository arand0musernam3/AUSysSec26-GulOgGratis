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
public final class d extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f36103e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f36104f = Float.NaN;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f36105g = Float.NaN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f36106h = Float.NaN;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f36107i = Float.NaN;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f36108j = Float.NaN;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f36109k = Float.NaN;
    public float l = Float.NaN;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f36110m = Float.NaN;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f36111n = Float.NaN;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f36112o = Float.NaN;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f36113p = Float.NaN;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f36114q = Float.NaN;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f36115r = Float.NaN;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f36116s = Float.NaN;

    public d() {
        this.f36081d = new HashMap();
    }

    @Override // q6.b
    public final void a(HashMap map) {
        for (String str : map.keySet()) {
            p6.l lVar = (p6.l) map.get(str);
            if (lVar != null) {
                if (!str.startsWith("CUSTOM")) {
                    switch (str) {
                        case "rotationX":
                            if (Float.isNaN(this.f36107i)) {
                                break;
                            } else {
                                lVar.b(this.f36107i, this.f36078a);
                                break;
                            }
                            break;
                        case "rotationY":
                            if (Float.isNaN(this.f36108j)) {
                                break;
                            } else {
                                lVar.b(this.f36108j, this.f36078a);
                                break;
                            }
                            break;
                        case "translationX":
                            if (Float.isNaN(this.f36113p)) {
                                break;
                            } else {
                                lVar.b(this.f36113p, this.f36078a);
                                break;
                            }
                            break;
                        case "translationY":
                            if (Float.isNaN(this.f36114q)) {
                                break;
                            } else {
                                lVar.b(this.f36114q, this.f36078a);
                                break;
                            }
                            break;
                        case "translationZ":
                            if (Float.isNaN(this.f36115r)) {
                                break;
                            } else {
                                lVar.b(this.f36115r, this.f36078a);
                                break;
                            }
                            break;
                        case "progress":
                            if (Float.isNaN(this.f36116s)) {
                                break;
                            } else {
                                lVar.b(this.f36116s, this.f36078a);
                                break;
                            }
                            break;
                        case "scaleX":
                            if (Float.isNaN(this.f36111n)) {
                                break;
                            } else {
                                lVar.b(this.f36111n, this.f36078a);
                                break;
                            }
                            break;
                        case "scaleY":
                            if (Float.isNaN(this.f36112o)) {
                                break;
                            } else {
                                lVar.b(this.f36112o, this.f36078a);
                                break;
                            }
                            break;
                        case "transformPivotX":
                            if (Float.isNaN(this.f36107i)) {
                                break;
                            } else {
                                lVar.b(this.f36109k, this.f36078a);
                                break;
                            }
                            break;
                        case "transformPivotY":
                            if (Float.isNaN(this.f36108j)) {
                                break;
                            } else {
                                lVar.b(this.l, this.f36078a);
                                break;
                            }
                            break;
                        case "rotation":
                            if (Float.isNaN(this.f36106h)) {
                                break;
                            } else {
                                lVar.b(this.f36106h, this.f36078a);
                                break;
                            }
                            break;
                        case "elevation":
                            if (Float.isNaN(this.f36105g)) {
                                break;
                            } else {
                                lVar.b(this.f36105g, this.f36078a);
                                break;
                            }
                            break;
                        case "transitionPathRotate":
                            if (Float.isNaN(this.f36110m)) {
                                break;
                            } else {
                                lVar.b(this.f36110m, this.f36078a);
                                break;
                            }
                            break;
                        case "alpha":
                            if (Float.isNaN(this.f36104f)) {
                                break;
                            } else {
                                lVar.b(this.f36104f, this.f36078a);
                                break;
                            }
                            break;
                    }
                } else {
                    androidx.constraintlayout.widget.b bVar = (androidx.constraintlayout.widget.b) this.f36081d.get(str.substring(7));
                    if (bVar != null) {
                        ((p6.i) lVar).f34511f.append(this.f36078a, bVar);
                    }
                }
            }
        }
    }

    @Override // q6.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final b clone() {
        d dVar = new d();
        super.c(this);
        dVar.f36103e = this.f36103e;
        dVar.f36104f = this.f36104f;
        dVar.f36105g = this.f36105g;
        dVar.f36106h = this.f36106h;
        dVar.f36107i = this.f36107i;
        dVar.f36108j = this.f36108j;
        dVar.f36109k = this.f36109k;
        dVar.l = this.l;
        dVar.f36110m = this.f36110m;
        dVar.f36111n = this.f36111n;
        dVar.f36112o = this.f36112o;
        dVar.f36113p = this.f36113p;
        dVar.f36114q = this.f36114q;
        dVar.f36115r = this.f36115r;
        dVar.f36116s = this.f36116s;
        return dVar;
    }

    @Override // q6.b
    public final void d(HashSet hashSet) {
        if (!Float.isNaN(this.f36104f)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f36105g)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f36106h)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f36107i)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f36108j)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f36109k)) {
            hashSet.add("transformPivotX");
        }
        if (!Float.isNaN(this.l)) {
            hashSet.add("transformPivotY");
        }
        if (!Float.isNaN(this.f36113p)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f36114q)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f36115r)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f36110m)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f36111n)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f36112o)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f36116s)) {
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
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.v.f2513g);
        SparseIntArray sparseIntArray = c.f36085a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i11);
            SparseIntArray sparseIntArray2 = c.f36085a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    this.f36104f = typedArrayObtainStyledAttributes.getFloat(index, this.f36104f);
                    break;
                case 2:
                    this.f36105g = typedArrayObtainStyledAttributes.getDimension(index, this.f36105g);
                    break;
                case 3:
                case 11:
                default:
                    Log.e("KeyAttribute", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
                case 4:
                    this.f36106h = typedArrayObtainStyledAttributes.getFloat(index, this.f36106h);
                    break;
                case 5:
                    this.f36107i = typedArrayObtainStyledAttributes.getFloat(index, this.f36107i);
                    break;
                case 6:
                    this.f36108j = typedArrayObtainStyledAttributes.getFloat(index, this.f36108j);
                    break;
                case 7:
                    this.f36111n = typedArrayObtainStyledAttributes.getFloat(index, this.f36111n);
                    break;
                case 8:
                    this.f36110m = typedArrayObtainStyledAttributes.getFloat(index, this.f36110m);
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
                    this.f36103e = typedArrayObtainStyledAttributes.getInteger(index, this.f36103e);
                    break;
                case 14:
                    this.f36112o = typedArrayObtainStyledAttributes.getFloat(index, this.f36112o);
                    break;
                case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                    this.f36113p = typedArrayObtainStyledAttributes.getDimension(index, this.f36113p);
                    break;
                case 16:
                    this.f36114q = typedArrayObtainStyledAttributes.getDimension(index, this.f36114q);
                    break;
                case 17:
                    this.f36115r = typedArrayObtainStyledAttributes.getDimension(index, this.f36115r);
                    break;
                case 18:
                    this.f36116s = typedArrayObtainStyledAttributes.getFloat(index, this.f36116s);
                    break;
                case 19:
                    this.f36109k = typedArrayObtainStyledAttributes.getDimension(index, this.f36109k);
                    break;
                case 20:
                    this.l = typedArrayObtainStyledAttributes.getDimension(index, this.l);
                    break;
            }
        }
    }

    @Override // q6.b
    public final void f(HashMap map) {
        if (this.f36103e == -1) {
            return;
        }
        if (!Float.isNaN(this.f36104f)) {
            map.put("alpha", Integer.valueOf(this.f36103e));
        }
        if (!Float.isNaN(this.f36105g)) {
            map.put("elevation", Integer.valueOf(this.f36103e));
        }
        if (!Float.isNaN(this.f36106h)) {
            map.put("rotation", Integer.valueOf(this.f36103e));
        }
        if (!Float.isNaN(this.f36107i)) {
            map.put("rotationX", Integer.valueOf(this.f36103e));
        }
        if (!Float.isNaN(this.f36108j)) {
            map.put("rotationY", Integer.valueOf(this.f36103e));
        }
        if (!Float.isNaN(this.f36109k)) {
            map.put("transformPivotX", Integer.valueOf(this.f36103e));
        }
        if (!Float.isNaN(this.l)) {
            map.put("transformPivotY", Integer.valueOf(this.f36103e));
        }
        if (!Float.isNaN(this.f36113p)) {
            map.put("translationX", Integer.valueOf(this.f36103e));
        }
        if (!Float.isNaN(this.f36114q)) {
            map.put("translationY", Integer.valueOf(this.f36103e));
        }
        if (!Float.isNaN(this.f36115r)) {
            map.put("translationZ", Integer.valueOf(this.f36103e));
        }
        if (!Float.isNaN(this.f36110m)) {
            map.put("transitionPathRotate", Integer.valueOf(this.f36103e));
        }
        if (!Float.isNaN(this.f36111n)) {
            map.put("scaleX", Integer.valueOf(this.f36103e));
        }
        if (!Float.isNaN(this.f36112o)) {
            map.put("scaleY", Integer.valueOf(this.f36103e));
        }
        if (!Float.isNaN(this.f36116s)) {
            map.put("progress", Integer.valueOf(this.f36103e));
        }
        if (this.f36081d.size() > 0) {
            Iterator it = this.f36081d.keySet().iterator();
            while (it.hasNext()) {
                map.put(e0.f.k("CUSTOM,", (String) it.next()), Integer.valueOf(this.f36103e));
            }
        }
    }
}
