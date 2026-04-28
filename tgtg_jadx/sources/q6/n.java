package q6;

import android.graphics.Rect;
import android.util.Log;
import java.util.HashMap;
import java.util.LinkedHashMap;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements Comparable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f36260c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f36258a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f36259b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f36261d = new LinkedHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f36262e = 1.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f36263f = 0.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f36264g = 0.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f36265h = 0.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f36266i = 1.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f36267j = 1.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f36268k = Float.NaN;
    public float l = Float.NaN;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f36269m = 0.0f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f36270n = 0.0f;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f36271o = 0.0f;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f36272p = Float.NaN;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f36273q = Float.NaN;

    public static boolean c(float f11, float f12) {
        return (Float.isNaN(f11) || Float.isNaN(f12)) ? Float.isNaN(f11) != Float.isNaN(f12) : Math.abs(f11 - f12) > 1.0E-6f;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void a(HashMap map, int i11) {
        for (String str : map.keySet()) {
            p6.l lVar = (p6.l) map.get(str);
            if (lVar != null) {
                str.getClass();
                byte b8 = -1;
                switch (str.hashCode()) {
                    case -1249320806:
                        if (str.equals("rotationX")) {
                            b8 = 0;
                        }
                        break;
                    case -1249320805:
                        if (str.equals("rotationY")) {
                            b8 = 1;
                        }
                        break;
                    case -1225497657:
                        if (str.equals("translationX")) {
                            b8 = 2;
                        }
                        break;
                    case -1225497656:
                        if (str.equals("translationY")) {
                            b8 = 3;
                        }
                        break;
                    case -1225497655:
                        if (str.equals("translationZ")) {
                            b8 = 4;
                        }
                        break;
                    case -1001078227:
                        if (str.equals("progress")) {
                            b8 = 5;
                        }
                        break;
                    case -908189618:
                        if (str.equals("scaleX")) {
                            b8 = 6;
                        }
                        break;
                    case -908189617:
                        if (str.equals("scaleY")) {
                            b8 = 7;
                        }
                        break;
                    case -760884510:
                        if (str.equals("transformPivotX")) {
                            b8 = 8;
                        }
                        break;
                    case -760884509:
                        if (str.equals("transformPivotY")) {
                            b8 = 9;
                        }
                        break;
                    case -40300674:
                        if (str.equals("rotation")) {
                            b8 = 10;
                        }
                        break;
                    case -4379043:
                        if (str.equals("elevation")) {
                            b8 = 11;
                        }
                        break;
                    case 37232917:
                        if (str.equals("transitionPathRotate")) {
                            b8 = 12;
                        }
                        break;
                    case 92909918:
                        if (str.equals("alpha")) {
                            b8 = 13;
                        }
                        break;
                }
                switch (b8) {
                    case 0:
                        lVar.b(Float.isNaN(this.f36265h) ? 0.0f : this.f36265h, i11);
                        break;
                    case 1:
                        lVar.b(Float.isNaN(this.f36258a) ? 0.0f : this.f36258a, i11);
                        break;
                    case 2:
                        lVar.b(Float.isNaN(this.f36269m) ? 0.0f : this.f36269m, i11);
                        break;
                    case 3:
                        lVar.b(Float.isNaN(this.f36270n) ? 0.0f : this.f36270n, i11);
                        break;
                    case 4:
                        lVar.b(Float.isNaN(this.f36271o) ? 0.0f : this.f36271o, i11);
                        break;
                    case 5:
                        lVar.b(Float.isNaN(this.f36273q) ? 0.0f : this.f36273q, i11);
                        break;
                    case 6:
                        lVar.b(Float.isNaN(this.f36266i) ? 1.0f : this.f36266i, i11);
                        break;
                    case 7:
                        lVar.b(Float.isNaN(this.f36267j) ? 1.0f : this.f36267j, i11);
                        break;
                    case 8:
                        lVar.b(Float.isNaN(this.f36268k) ? 0.0f : this.f36268k, i11);
                        break;
                    case 9:
                        lVar.b(Float.isNaN(this.l) ? 0.0f : this.l, i11);
                        break;
                    case 10:
                        lVar.b(Float.isNaN(this.f36264g) ? 0.0f : this.f36264g, i11);
                        break;
                    case 11:
                        lVar.b(Float.isNaN(this.f36263f) ? 0.0f : this.f36263f, i11);
                        break;
                    case 12:
                        lVar.b(Float.isNaN(this.f36272p) ? 0.0f : this.f36272p, i11);
                        break;
                    case 13:
                        lVar.b(Float.isNaN(this.f36262e) ? 1.0f : this.f36262e, i11);
                        break;
                    default:
                        if (str.startsWith("CUSTOM")) {
                            String str2 = str.split(MessageLogView.COMMA_SEPARATOR)[1];
                            LinkedHashMap linkedHashMap = this.f36261d;
                            if (linkedHashMap.containsKey(str2)) {
                                androidx.constraintlayout.widget.b bVar = (androidx.constraintlayout.widget.b) linkedHashMap.get(str2);
                                if (lVar instanceof p6.i) {
                                    ((p6.i) lVar).f34511f.append(i11, bVar);
                                } else {
                                    Log.e("MotionPaths", str + " ViewSpline not a CustomSet frame = " + i11 + ", value" + bVar.a() + lVar);
                                }
                            }
                        } else {
                            Log.e("MotionPaths", "UNKNOWN spline ".concat(str));
                        }
                        break;
                }
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ((n) obj).getClass();
        return Float.compare(0.0f, 0.0f);
    }

    public final void d(Rect rect, androidx.constraintlayout.widget.q qVar, int i11, int i12) {
        rect.width();
        rect.height();
        androidx.constraintlayout.widget.l lVarI = qVar.i(i12);
        androidx.constraintlayout.widget.o oVar = lVarI.f2405c;
        androidx.constraintlayout.widget.n nVar = lVarI.f2406d;
        int i13 = oVar.f2468c;
        this.f36259b = i13;
        int i14 = oVar.f2467b;
        this.f36260c = i14;
        this.f36262e = (i14 == 0 || i13 != 0) ? oVar.f2469d : 0.0f;
        androidx.constraintlayout.widget.p pVar = lVarI.f2408f;
        boolean z11 = pVar.f2483m;
        this.f36263f = pVar.f2484n;
        this.f36264g = pVar.f2473b;
        this.f36265h = pVar.f2474c;
        this.f36258a = pVar.f2475d;
        this.f36266i = pVar.f2476e;
        this.f36267j = pVar.f2477f;
        this.f36268k = pVar.f2478g;
        this.l = pVar.f2479h;
        this.f36269m = pVar.f2481j;
        this.f36270n = pVar.f2482k;
        this.f36271o = pVar.l;
        i6.e.d(nVar.f2457d);
        this.f36272p = nVar.f2461h;
        this.f36273q = lVarI.f2405c.f2470e;
        for (String str : lVarI.f2409g.keySet()) {
            androidx.constraintlayout.widget.b bVar = (androidx.constraintlayout.widget.b) lVarI.f2409g.get(str);
            int iOrdinal = bVar.f2353c.ordinal();
            if (iOrdinal != 4 && iOrdinal != 5 && iOrdinal != 7) {
                this.f36261d.put(str, bVar);
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        return;
                    }
                }
            }
            float f11 = this.f36264g + 90.0f;
            this.f36264g = f11;
            if (f11 > 180.0f) {
                this.f36264g = f11 - 360.0f;
                return;
            }
            return;
        }
        this.f36264g -= 90.0f;
    }
}
