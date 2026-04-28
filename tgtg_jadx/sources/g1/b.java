package g1;

import a3.d2;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import s0.g0;
import s0.i0;
import s0.o2;
import v0.o;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final double f18067h = Math.sqrt(2.3703703703703702d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Size f18068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rational f18069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rational f18070c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet f18071d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t5.a f18072e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g0 f18073f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f18074g;

    public b(i0 i0Var, HashSet hashSet) {
        Size sizeG = o.g(i0Var.q().i());
        g0 g0VarQ = i0Var.q();
        t5.a aVar = new t5.a(g0VarQ, sizeG);
        this.f18074g = new HashMap();
        this.f18068a = sizeG;
        Rational rational = ((double) sizeG.getWidth()) / ((double) sizeG.getHeight()) > f18067h ? v0.a.f41586c : v0.a.f41584a;
        wd.a.p("ResolutionsMerger", "The closer aspect ratio to the sensor size (" + sizeG + ") is " + rational + ".");
        this.f18069b = rational;
        Rational rational2 = v0.a.f41584a;
        if (rational.equals(rational2)) {
            rational2 = v0.a.f41586c;
        } else if (!rational.equals(v0.a.f41586c)) {
            j4.d.o(rational, "Invalid sensor aspect-ratio: ");
            throw null;
        }
        this.f18070c = rational2;
        this.f18073f = g0VarQ;
        this.f18071d = hashSet;
        this.f18072e = aVar;
    }

    public static Rect a(Size size, Size size2) {
        RectF rectF;
        RectF rectF2;
        Rational rationalH = h(size2);
        int width = size.getWidth();
        int height = size.getHeight();
        Rational rationalH2 = h(size);
        if (rationalH.floatValue() == rationalH2.floatValue()) {
            rectF2 = new RectF(0.0f, 0.0f, width, height);
        } else {
            if (rationalH.floatValue() > rationalH2.floatValue()) {
                float f11 = width;
                float fFloatValue = f11 / rationalH.floatValue();
                float f12 = (height - fFloatValue) / 2.0f;
                rectF = new RectF(0.0f, f12, f11, fFloatValue + f12);
            } else {
                float f13 = height;
                float fFloatValue2 = rationalH.floatValue() * f13;
                float f14 = (width - fFloatValue2) / 2.0f;
                rectF = new RectF(f14, 0.0f, fFloatValue2 + f14, f13);
            }
            rectF2 = rectF;
        }
        Rect rect = new Rect();
        rectF2.round(rect);
        return rect;
    }

    public static boolean d(Size size, Size size2) {
        return size.getHeight() > size2.getHeight() || size.getWidth() > size2.getWidth();
    }

    public static Rational h(Size size) {
        return new Rational(size.getWidth(), size.getHeight());
    }

    public final a b(o2 o2Var, Rect rect, int i11, boolean z11) {
        boolean z12;
        Size size;
        Size size2;
        Pair pairCreate;
        if (o.d(i11)) {
            z12 = true;
            rect = new Rect(rect.top, rect.left, rect.bottom, rect.right);
        } else {
            z12 = false;
        }
        if (z11) {
            Size sizeG = o.g(rect);
            Iterator it = c(o2Var).iterator();
            while (true) {
                if (!it.hasNext()) {
                    pairCreate = Pair.create(sizeG, sizeG);
                    break;
                }
                Size size3 = (Size) it.next();
                Size sizeG2 = o.g(a(size3, sizeG));
                if (!d(sizeG2, sizeG)) {
                    pairCreate = Pair.create(size3, sizeG2);
                    break;
                }
            }
            size = (Size) pairCreate.first;
            size2 = (Size) pairCreate.second;
        } else {
            Size sizeG3 = o.g(rect);
            List listC = c(o2Var);
            Iterator it2 = listC.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    Iterator it3 = listC.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            size = sizeG3;
                            break;
                        }
                        size = (Size) it3.next();
                        if (!d(size, sizeG3)) {
                            break;
                        }
                    }
                } else {
                    Size size4 = (Size) it2.next();
                    Rational rationalH = v0.a.f41584a;
                    if (!v0.a.a(rationalH, sizeG3)) {
                        rationalH = v0.a.f41586c;
                        if (!v0.a.a(rationalH, sizeG3)) {
                            rationalH = h(sizeG3);
                        }
                    }
                    if (!e(rationalH, size4) && !d(size4, sizeG3)) {
                        size = size4;
                        break;
                    }
                }
            }
            rect = a(sizeG3, size);
            size2 = size;
        }
        return z12 ? new a(new Rect(rect.top, rect.left, rect.bottom, rect.right), new Size(size2.getHeight(), size2.getWidth()), size) : new a(rect, size2, size);
    }

    public final List c(o2 o2Var) {
        Rational rationalH;
        if (!this.f18071d.contains(o2Var)) {
            j4.d.o(o2Var, "Invalid child config: ");
            return null;
        }
        HashMap map = this.f18074g;
        if (map.containsKey(o2Var)) {
            List list = (List) map.get(o2Var);
            Objects.requireNonNull(list);
            return list;
        }
        ArrayList<Size> arrayListV = this.f18072e.v(o2Var);
        HashMap map2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Size size : arrayListV) {
            Iterator it = map2.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    rationalH = null;
                    break;
                }
                rationalH = (Rational) it.next();
                if (v0.a.a(rationalH, size)) {
                    break;
                }
            }
            if (rationalH != null) {
                Size size2 = (Size) map2.get(rationalH);
                Objects.requireNonNull(size2);
                if (size.getHeight() > size2.getHeight() || size.getWidth() > size2.getWidth() || (size.getWidth() == size2.getWidth() && size.getHeight() == size2.getHeight())) {
                }
            } else {
                rationalH = h(size);
            }
            arrayList.add(size);
            map2.put(rationalH, size);
        }
        map.put(o2Var, arrayList);
        return arrayList;
    }

    public final boolean e(Rational rational, Size size) {
        Rational rational2 = this.f18069b;
        if (rational2.equals(rational) || v0.a.a(rational, size)) {
            return false;
        }
        float fFloatValue = rational2.floatValue();
        float fFloatValue2 = rational.floatValue();
        Rational rationalH = v0.a.f41584a;
        if (!v0.a.a(rationalH, size)) {
            rationalH = v0.a.f41586c;
            if (!v0.a.a(rationalH, size)) {
                rationalH = h(size);
            }
        }
        float fFloatValue3 = rationalH.floatValue();
        if (fFloatValue == fFloatValue2 || fFloatValue2 == fFloatValue3) {
            return false;
        }
        return fFloatValue > fFloatValue2 ? fFloatValue2 < fFloatValue3 : fFloatValue2 > fFloatValue3;
    }

    public final ArrayList f(List list, boolean z11) {
        List arrayList;
        HashMap map = new HashMap();
        Rational rational = v0.a.f41584a;
        map.put(rational, new ArrayList());
        Rational rational2 = v0.a.f41586c;
        map.put(rational2, new ArrayList());
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(rational);
        arrayList2.add(rational2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            if (size.getHeight() > 0) {
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        arrayList = null;
                        break;
                    }
                    Rational rational3 = (Rational) it2.next();
                    if (v0.a.a(rational3, size)) {
                        arrayList = (List) map.get(rational3);
                        break;
                    }
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    Rational rationalH = h(size);
                    arrayList2.add(rationalH);
                    map.put(rationalH, arrayList);
                }
                arrayList.add(size);
            }
        }
        ArrayList<Rational> arrayList3 = new ArrayList(map.keySet());
        Collections.sort(arrayList3, new d2(h(this.f18068a), 1));
        ArrayList arrayList4 = new ArrayList();
        for (Rational rational4 : arrayList3) {
            if (!rational4.equals(v0.a.f41586c) && !rational4.equals(v0.a.f41584a)) {
                List list2 = (List) map.get(rational4);
                Objects.requireNonNull(list2);
                arrayList4.addAll(g(rational4, list2, z11));
            }
        }
        return arrayList4;
    }

    public final ArrayList g(Rational rational, List list, boolean z11) {
        ArrayList arrayList;
        ArrayList<Size> arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            if (v0.a.a(rational, size)) {
                arrayList2.add(size);
            }
        }
        Collections.sort(arrayList2, new v0.b(true));
        HashSet hashSet = new HashSet(arrayList2);
        Iterator it2 = this.f18071d.iterator();
        while (it2.hasNext()) {
            List<Size> listC = c((o2) it2.next());
            if (!z11) {
                ArrayList arrayList3 = new ArrayList();
                for (Size size2 : listC) {
                    if (!e(rational, size2)) {
                        arrayList3.add(size2);
                    }
                }
                listC = arrayList3;
            }
            if (listC.isEmpty()) {
                return new ArrayList();
            }
            if (listC.isEmpty() || arrayList2.isEmpty()) {
                arrayList2 = new ArrayList();
            } else {
                ArrayList arrayList4 = new ArrayList();
                for (Size size3 : arrayList2) {
                    Iterator it3 = listC.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        if (!d((Size) it3.next(), size3)) {
                            arrayList4.add(size3);
                            break;
                        }
                    }
                }
                arrayList2 = arrayList4;
            }
            if (listC.isEmpty() || arrayList2.isEmpty()) {
                arrayList = new ArrayList();
            } else {
                ArrayList<Size> arrayList5 = arrayList2.isEmpty() ? arrayList2 : new ArrayList(new LinkedHashSet(arrayList2));
                arrayList = new ArrayList();
                for (Size size4 : arrayList5) {
                    Iterator it4 = listC.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            arrayList.add(size4);
                            break;
                        }
                        if (d((Size) it4.next(), size4)) {
                            break;
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    arrayList.remove(arrayList.size() - 1);
                }
            }
            hashSet.retainAll(arrayList);
        }
        ArrayList arrayList6 = new ArrayList();
        for (Size size5 : arrayList2) {
            if (!hashSet.contains(size5)) {
                arrayList6.add(size5);
            }
        }
        return arrayList6;
    }
}
