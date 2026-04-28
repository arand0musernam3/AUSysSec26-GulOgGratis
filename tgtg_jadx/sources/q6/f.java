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
public final class f extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f36161e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f36162f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f36163g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f36164h = Float.NaN;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f36165i = 0.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f36166j = 0.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f36167k = Float.NaN;
    public int l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f36168m = Float.NaN;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f36169n = Float.NaN;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f36170o = Float.NaN;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f36171p = Float.NaN;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f36172q = Float.NaN;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f36173r = Float.NaN;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f36174s = Float.NaN;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f36175t = Float.NaN;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f36176u = Float.NaN;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f36177v = Float.NaN;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f36178w = Float.NaN;

    public f() {
        this.f36081d = new HashMap();
    }

    @Override // q6.b
    public final void a(HashMap map) {
        throw null;
    }

    @Override // q6.b
    /* JADX INFO: renamed from: b */
    public final b clone() {
        f fVar = new f();
        super.c(this);
        fVar.f36161e = this.f36161e;
        fVar.f36162f = this.f36162f;
        fVar.f36163g = this.f36163g;
        fVar.f36164h = this.f36164h;
        fVar.f36165i = this.f36165i;
        fVar.f36166j = this.f36166j;
        fVar.f36167k = this.f36167k;
        fVar.l = this.l;
        fVar.f36168m = this.f36168m;
        fVar.f36169n = this.f36169n;
        fVar.f36170o = this.f36170o;
        fVar.f36171p = this.f36171p;
        fVar.f36172q = this.f36172q;
        fVar.f36173r = this.f36173r;
        fVar.f36174s = this.f36174s;
        fVar.f36175t = this.f36175t;
        fVar.f36176u = this.f36176u;
        fVar.f36177v = this.f36177v;
        fVar.f36178w = this.f36178w;
        return fVar;
    }

    @Override // q6.b
    public final void d(HashSet hashSet) {
        if (!Float.isNaN(this.f36168m)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f36169n)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f36170o)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f36172q)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f36173r)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f36174s)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f36175t)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f36171p)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f36176u)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f36177v)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f36178w)) {
            hashSet.add("translationZ");
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
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.v.f2514h);
        SparseIntArray sparseIntArray = e.f36135a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i11);
            SparseIntArray sparseIntArray2 = e.f36135a;
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
                    typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 4:
                    this.f36161e = typedArrayObtainStyledAttributes.getInteger(index, this.f36161e);
                    break;
                case 5:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.f36163g = typedArrayObtainStyledAttributes.getString(index);
                        this.f36162f = 7;
                    } else {
                        this.f36162f = typedArrayObtainStyledAttributes.getInt(index, this.f36162f);
                    }
                    break;
                case 6:
                    this.f36164h = typedArrayObtainStyledAttributes.getFloat(index, this.f36164h);
                    break;
                case 7:
                    int i12 = typedArrayObtainStyledAttributes.peekValue(index).type;
                    float f11 = this.f36165i;
                    if (i12 == 5) {
                        this.f36165i = typedArrayObtainStyledAttributes.getDimension(index, f11);
                    } else {
                        this.f36165i = typedArrayObtainStyledAttributes.getFloat(index, f11);
                    }
                    break;
                case 8:
                    this.l = typedArrayObtainStyledAttributes.getInt(index, this.l);
                    break;
                case 9:
                    this.f36168m = typedArrayObtainStyledAttributes.getFloat(index, this.f36168m);
                    break;
                case 10:
                    this.f36169n = typedArrayObtainStyledAttributes.getDimension(index, this.f36169n);
                    break;
                case 11:
                    this.f36170o = typedArrayObtainStyledAttributes.getFloat(index, this.f36170o);
                    break;
                case 12:
                    this.f36172q = typedArrayObtainStyledAttributes.getFloat(index, this.f36172q);
                    break;
                case 13:
                    this.f36173r = typedArrayObtainStyledAttributes.getFloat(index, this.f36173r);
                    break;
                case 14:
                    this.f36171p = typedArrayObtainStyledAttributes.getFloat(index, this.f36171p);
                    break;
                case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                    this.f36174s = typedArrayObtainStyledAttributes.getFloat(index, this.f36174s);
                    break;
                case 16:
                    this.f36175t = typedArrayObtainStyledAttributes.getFloat(index, this.f36175t);
                    break;
                case 17:
                    this.f36176u = typedArrayObtainStyledAttributes.getDimension(index, this.f36176u);
                    break;
                case 18:
                    this.f36177v = typedArrayObtainStyledAttributes.getDimension(index, this.f36177v);
                    break;
                case 19:
                    this.f36178w = typedArrayObtainStyledAttributes.getDimension(index, this.f36178w);
                    break;
                case 20:
                    this.f36167k = typedArrayObtainStyledAttributes.getFloat(index, this.f36167k);
                    break;
                case 21:
                    this.f36166j = typedArrayObtainStyledAttributes.getFloat(index, this.f36166j) / 360.0f;
                    break;
                default:
                    Log.e("KeyCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
            }
        }
    }

    public final void g(HashMap map) {
        p6.g gVar;
        float f11;
        p6.g gVar2;
        for (String str : map.keySet()) {
            if (str.startsWith("CUSTOM")) {
                androidx.constraintlayout.widget.b bVar = (androidx.constraintlayout.widget.b) this.f36081d.get(str.substring(7));
                if (bVar != null && bVar.f2353c == androidx.constraintlayout.widget.a.FLOAT_TYPE && (gVar = (p6.g) map.get(str)) != null) {
                    int i11 = this.f36078a;
                    int i12 = this.f36162f;
                    String str2 = this.f36163g;
                    int i13 = this.l;
                    gVar.f34509f.add(new i6.f(this.f36164h, this.f36165i, this.f36166j, bVar.a(), i11));
                    if (i13 != -1) {
                        gVar.f34508e = i13;
                    }
                    gVar.f34506c = i12;
                    gVar.c(bVar);
                    gVar.f34507d = str2;
                }
            } else {
                switch (str) {
                    case "rotationX":
                        f11 = this.f36172q;
                        break;
                    case "rotationY":
                        f11 = this.f36173r;
                        break;
                    case "translationX":
                        f11 = this.f36176u;
                        break;
                    case "translationY":
                        f11 = this.f36177v;
                        break;
                    case "translationZ":
                        f11 = this.f36178w;
                        break;
                    case "progress":
                        f11 = this.f36167k;
                        break;
                    case "scaleX":
                        f11 = this.f36174s;
                        break;
                    case "scaleY":
                        f11 = this.f36175t;
                        break;
                    case "rotation":
                        f11 = this.f36170o;
                        break;
                    case "elevation":
                        f11 = this.f36169n;
                        break;
                    case "transitionPathRotate":
                        f11 = this.f36171p;
                        break;
                    case "alpha":
                        f11 = this.f36168m;
                        break;
                    case "waveOffset":
                        f11 = this.f36165i;
                        break;
                    case "wavePhase":
                        f11 = this.f36166j;
                        break;
                    default:
                        if (!str.startsWith("CUSTOM")) {
                            Log.v("WARNING! KeyCycle", "  UNKNOWN  ".concat(str));
                        }
                        f11 = Float.NaN;
                        break;
                }
                float f12 = f11;
                if (!Float.isNaN(f12) && (gVar2 = (p6.g) map.get(str)) != null) {
                    int i14 = this.f36078a;
                    int i15 = this.f36162f;
                    String str3 = this.f36163g;
                    int i16 = this.l;
                    gVar2.f34509f.add(new i6.f(this.f36164h, this.f36165i, this.f36166j, f12, i14));
                    if (i16 != -1) {
                        gVar2.f34508e = i16;
                    }
                    gVar2.f34506c = i15;
                    gVar2.f34507d = str3;
                }
            }
        }
    }
}
