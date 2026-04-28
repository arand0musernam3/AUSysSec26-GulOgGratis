package androidx.recyclerview.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends s1 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static TimeInterpolator f3887s;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f3888g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f3889h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f3890i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f3891j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f3892k;
    public final ArrayList l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f3893m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f3894n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f3895o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f3896p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList f3897q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList f3898r;

    public r() {
        this.f3912a = null;
        this.f3913b = new ArrayList();
        this.f3914c = 120L;
        this.f3915d = 120L;
        this.f3916e = 250L;
        this.f3917f = 250L;
        this.f3888g = true;
        this.f3889h = new ArrayList();
        this.f3890i = new ArrayList();
        this.f3891j = new ArrayList();
        this.f3892k = new ArrayList();
        this.l = new ArrayList();
        this.f3893m = new ArrayList();
        this.f3894n = new ArrayList();
        this.f3895o = new ArrayList();
        this.f3896p = new ArrayList();
        this.f3897q = new ArrayList();
        this.f3898r = new ArrayList();
    }

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((r2) arrayList.get(size)).itemView.animate().cancel();
        }
    }

    @Override // androidx.recyclerview.widget.s1
    public final boolean a(r2 r2Var, r2 r2Var2, r1 r1Var, r1 r1Var2) {
        int i11;
        int i12;
        int i13 = r1Var.f3900a;
        int i14 = r1Var.f3901b;
        if (r2Var2.shouldIgnore()) {
            int i15 = r1Var.f3900a;
            i12 = r1Var.f3901b;
            i11 = i15;
        } else {
            i11 = r1Var2.f3900a;
            i12 = r1Var2.f3901b;
        }
        if (r2Var == r2Var2) {
            return g(r2Var, i13, i14, i11, i12);
        }
        float translationX = r2Var.itemView.getTranslationX();
        float translationY = r2Var.itemView.getTranslationY();
        float alpha = r2Var.itemView.getAlpha();
        l(r2Var);
        r2Var.itemView.setTranslationX(translationX);
        r2Var.itemView.setTranslationY(translationY);
        r2Var.itemView.setAlpha(alpha);
        l(r2Var2);
        r2Var2.itemView.setTranslationX(-((int) ((i11 - i13) - translationX)));
        r2Var2.itemView.setTranslationY(-((int) ((i12 - i14) - translationY)));
        r2Var2.itemView.setAlpha(0.0f);
        p pVar = new p();
        pVar.f3844a = r2Var;
        pVar.f3845b = r2Var2;
        pVar.f3846c = i13;
        pVar.f3847d = i14;
        pVar.f3848e = i11;
        pVar.f3849f = i12;
        this.f3892k.add(pVar);
        return true;
    }

    @Override // androidx.recyclerview.widget.s1
    public final void d(r2 r2Var) {
        View view = r2Var.itemView;
        view.animate().cancel();
        ArrayList arrayList = this.f3891j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((q) arrayList.get(size)).f3875a == r2Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(r2Var);
                arrayList.remove(size);
            }
        }
        j(this.f3892k, r2Var);
        if (this.f3889h.remove(r2Var)) {
            view.setAlpha(1.0f);
            c(r2Var);
        }
        if (this.f3890i.remove(r2Var)) {
            view.setAlpha(1.0f);
            c(r2Var);
        }
        ArrayList arrayList2 = this.f3894n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            j(arrayList3, r2Var);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f3893m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((q) arrayList5.get(size4)).f3875a == r2Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(r2Var);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList6 = this.l;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(r2Var)) {
                view.setAlpha(1.0f);
                c(r2Var);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.f3897q.remove(r2Var);
        this.f3895o.remove(r2Var);
        this.f3898r.remove(r2Var);
        this.f3896p.remove(r2Var);
        i();
    }

    @Override // androidx.recyclerview.widget.s1
    public final void e() {
        ArrayList arrayList = this.f3891j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            q qVar = (q) arrayList.get(size);
            View view = qVar.f3875a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(qVar.f3875a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f3889h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            c((r2) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f3890i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            r2 r2Var = (r2) arrayList3.get(size3);
            r2Var.itemView.setAlpha(1.0f);
            c(r2Var);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f3892k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            p pVar = (p) arrayList4.get(size4);
            r2 r2Var2 = pVar.f3844a;
            if (r2Var2 != null) {
                k(pVar, r2Var2);
            }
            r2 r2Var3 = pVar.f3845b;
            if (r2Var3 != null) {
                k(pVar, r2Var3);
            }
        }
        arrayList4.clear();
        if (f()) {
            ArrayList arrayList5 = this.f3893m;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    q qVar2 = (q) arrayList6.get(size6);
                    View view2 = qVar2.f3875a.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(qVar2.f3875a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList arrayList7 = this.l;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    r2 r2Var4 = (r2) arrayList8.get(size8);
                    r2Var4.itemView.setAlpha(1.0f);
                    c(r2Var4);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList arrayList9 = this.f3894n;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    p pVar2 = (p) arrayList10.get(size10);
                    r2 r2Var5 = pVar2.f3844a;
                    if (r2Var5 != null) {
                        k(pVar2, r2Var5);
                    }
                    r2 r2Var6 = pVar2.f3845b;
                    if (r2Var6 != null) {
                        k(pVar2, r2Var6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            h(this.f3897q);
            h(this.f3896p);
            h(this.f3895o);
            h(this.f3898r);
            ArrayList arrayList11 = this.f3913b;
            if (arrayList11.size() <= 0) {
                arrayList11.clear();
            } else {
                arrayList11.get(0).getClass();
                org.bouncycastle.jce.provider.a.c();
            }
        }
    }

    @Override // androidx.recyclerview.widget.s1
    public final boolean f() {
        return (this.f3890i.isEmpty() && this.f3892k.isEmpty() && this.f3891j.isEmpty() && this.f3889h.isEmpty() && this.f3896p.isEmpty() && this.f3897q.isEmpty() && this.f3895o.isEmpty() && this.f3898r.isEmpty() && this.f3893m.isEmpty() && this.l.isEmpty() && this.f3894n.isEmpty()) ? false : true;
    }

    public final boolean g(r2 r2Var, int i11, int i12, int i13, int i14) {
        View view = r2Var.itemView;
        int translationX = i11 + ((int) view.getTranslationX());
        int translationY = i12 + ((int) r2Var.itemView.getTranslationY());
        l(r2Var);
        int i15 = i13 - translationX;
        int i16 = i14 - translationY;
        if (i15 == 0 && i16 == 0) {
            c(r2Var);
            return false;
        }
        if (i15 != 0) {
            view.setTranslationX(-i15);
        }
        if (i16 != 0) {
            view.setTranslationY(-i16);
        }
        q qVar = new q();
        qVar.f3875a = r2Var;
        qVar.f3876b = translationX;
        qVar.f3877c = translationY;
        qVar.f3878d = i13;
        qVar.f3879e = i14;
        this.f3891j.add(qVar);
        return true;
    }

    public final void i() {
        if (f()) {
            return;
        }
        ArrayList arrayList = this.f3913b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            org.bouncycastle.jce.provider.a.c();
        }
    }

    public final void j(ArrayList arrayList, r2 r2Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            p pVar = (p) arrayList.get(size);
            if (k(pVar, r2Var) && pVar.f3844a == null && pVar.f3845b == null) {
                arrayList.remove(pVar);
            }
        }
    }

    public final boolean k(p pVar, r2 r2Var) {
        if (pVar.f3845b == r2Var) {
            pVar.f3845b = null;
        } else {
            if (pVar.f3844a != r2Var) {
                return false;
            }
            pVar.f3844a = null;
        }
        r2Var.itemView.setAlpha(1.0f);
        r2Var.itemView.setTranslationX(0.0f);
        r2Var.itemView.setTranslationY(0.0f);
        c(r2Var);
        return true;
    }

    public final void l(r2 r2Var) {
        if (f3887s == null) {
            f3887s = new ValueAnimator().getInterpolator();
        }
        r2Var.itemView.animate().setInterpolator(f3887s);
        d(r2Var);
    }
}
