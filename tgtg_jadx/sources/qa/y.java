package qa;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.braze.models.inappmessage.InAppMessageBase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.StringTokenizer;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y implements Cloneable {
    public static final Animator[] C = new Animator[0];
    public static final int[] D = {2, 1, 3, 4};
    public static final ky.p E = new ky.p(10);
    public static final ThreadLocal F = new ThreadLocal();
    public v A;
    public long B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f36750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f36751c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TimeInterpolator f36752d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f36753e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f36754f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f36755g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.google.firebase.messaging.a0 f36756h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.google.firebase.messaging.a0 f36757i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public e0 f36758j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int[] f36759k;
    public ArrayList l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList f36760m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public w[] f36761n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f36762o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Animator[] f36763p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f36764q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f36765r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f36766s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public y f36767t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ArrayList f36768u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ArrayList f36769v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public o f36770w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public s f36771x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ky.p f36772y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f36773z;

    public y(Context context, AttributeSet attributeSet) {
        this.f36749a = getClass().getName();
        this.f36750b = -1L;
        this.f36751c = -1L;
        this.f36752d = null;
        this.f36753e = new ArrayList();
        this.f36754f = new ArrayList();
        this.f36755g = null;
        this.f36756h = new com.google.firebase.messaging.a0(23);
        this.f36757i = new com.google.firebase.messaging.a0(23);
        this.f36758j = null;
        int[] iArr = D;
        this.f36759k = iArr;
        this.f36762o = new ArrayList();
        this.f36763p = C;
        this.f36764q = 0;
        this.f36765r = false;
        this.f36766s = false;
        this.f36767t = null;
        this.f36768u = null;
        this.f36769v = new ArrayList();
        this.f36772y = E;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.f36719a);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        long jD = w6.a.d(typedArrayObtainStyledAttributes, xmlResourceParser, InAppMessageBase.DURATION, 1, -1);
        if (jD >= 0) {
            K(jD);
        }
        long j9 = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "startDelay") != null ? typedArrayObtainStyledAttributes.getInt(2, -1) : -1;
        if (j9 > 0) {
            P(j9);
        }
        int resourceId = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "interpolator") != null ? typedArrayObtainStyledAttributes.getResourceId(0, 0) : 0;
        if (resourceId > 0) {
            M(AnimationUtils.loadInterpolator(context, resourceId));
        }
        String string = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "matchOrder") != null ? typedArrayObtainStyledAttributes.getString(3) : null;
        if (string != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(string, MessageLogView.COMMA_SEPARATOR);
            int[] iArr2 = new int[stringTokenizer.countTokens()];
            int i11 = 0;
            while (stringTokenizer.hasMoreTokens()) {
                String strTrim = stringTokenizer.nextToken().trim();
                if ("id".equalsIgnoreCase(strTrim)) {
                    iArr2[i11] = 3;
                } else if ("instance".equalsIgnoreCase(strTrim)) {
                    iArr2[i11] = 1;
                } else if ("name".equalsIgnoreCase(strTrim)) {
                    iArr2[i11] = 2;
                } else if ("itemId".equalsIgnoreCase(strTrim)) {
                    iArr2[i11] = 4;
                } else {
                    if (!strTrim.isEmpty()) {
                        throw new InflateException(w.a0.p("Unknown match type in matchOrder: '", strTrim, "'"));
                    }
                    int[] iArr3 = new int[iArr2.length - 1];
                    System.arraycopy(iArr2, 0, iArr3, 0, i11);
                    i11--;
                    iArr2 = iArr3;
                }
                i11++;
            }
            if (iArr2.length == 0) {
                this.f36759k = iArr;
            } else {
                for (int i12 = 0; i12 < iArr2.length; i12++) {
                    int i13 = iArr2[i12];
                    if (i13 < 1 || i13 > 4) {
                        i4.a.f("matches contains invalid value");
                        throw null;
                    }
                    for (int i14 = 0; i14 < i12; i14++) {
                        if (iArr2[i14] == i13) {
                            i4.a.f("matches contains a duplicate value");
                            throw null;
                        }
                    }
                }
                this.f36759k = (int[]) iArr2.clone();
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static boolean B(h0 h0Var, h0 h0Var2, String str) {
        Object obj = h0Var.f36673a.get(str);
        Object obj2 = h0Var2.f36673a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public static void c(com.google.firebase.messaging.a0 a0Var, View view, h0 h0Var) {
        q1.e eVar = (q1.e) a0Var.f12779b;
        q1.e eVar2 = (q1.e) a0Var.f12782e;
        SparseArray sparseArray = (SparseArray) a0Var.f12780c;
        q1.z zVar = (q1.z) a0Var.f12781d;
        eVar.put(view, h0Var);
        int id2 = view.getId();
        if (id2 >= 0) {
            if (sparseArray.indexOfKey(id2) >= 0) {
                sparseArray.put(id2, null);
            } else {
                sparseArray.put(id2, view);
            }
        }
        String strA = ViewCompat.A(view);
        if (strA != null) {
            if (eVar2.containsKey(strA)) {
                eVar2.put(strA, null);
            } else {
                eVar2.put(strA, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (zVar.c(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    zVar.h(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) zVar.b(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    zVar.h(itemIdAtPosition, null);
                }
            }
        }
    }

    public static q1.e u() {
        ThreadLocal threadLocal = F;
        q1.e eVar = (q1.e) threadLocal.get();
        if (eVar != null) {
            return eVar;
        }
        q1.e eVar2 = new q1.e(0);
        threadLocal.set(eVar2);
        return eVar2;
    }

    public final boolean A(View view) {
        int size;
        int id2 = view.getId();
        ArrayList arrayList = this.f36755g;
        if (arrayList != null) {
            int size2 = arrayList.size();
            for (int i11 = 0; i11 < size2; i11++) {
                if (((Class) this.f36755g.get(i11)).isInstance(view)) {
                    break;
                }
            }
            ArrayList arrayList2 = this.f36753e;
            size = arrayList2.size();
            ArrayList arrayList3 = this.f36754f;
            if ((size == 0 || arrayList3.size() != 0) && !arrayList2.contains(Integer.valueOf(id2)) && !arrayList3.contains(view)) {
                break;
            }
            return true;
        }
        ArrayList arrayList22 = this.f36753e;
        size = arrayList22.size();
        ArrayList arrayList32 = this.f36754f;
        if (size == 0) {
        }
        return false;
    }

    public final void C(y yVar, x xVar, boolean z11) {
        y yVar2 = this.f36767t;
        if (yVar2 != null) {
            yVar2.C(yVar, xVar, z11);
        }
        ArrayList arrayList = this.f36768u;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f36768u.size();
        w[] wVarArr = this.f36761n;
        if (wVarArr == null) {
            wVarArr = new w[size];
        }
        this.f36761n = null;
        w[] wVarArr2 = (w[]) this.f36768u.toArray(wVarArr);
        for (int i11 = 0; i11 < size; i11++) {
            xVar.a(wVarArr2[i11], yVar, z11);
            wVarArr2[i11] = null;
        }
        this.f36761n = wVarArr2;
    }

    public void D(View view) {
        if (this.f36766s) {
            return;
        }
        ArrayList arrayList = this.f36762o;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f36763p);
        this.f36763p = C;
        for (int i11 = size - 1; i11 >= 0; i11--) {
            Animator animator = animatorArr[i11];
            animatorArr[i11] = null;
            animator.pause();
        }
        this.f36763p = animatorArr;
        C(this, x.f36747d, false);
        this.f36765r = true;
    }

    public void E() {
        q1.e eVarU = u();
        this.f36773z = 0L;
        int i11 = 0;
        while (true) {
            int size = this.f36769v.size();
            ArrayList arrayList = this.f36769v;
            if (i11 >= size) {
                arrayList.clear();
                return;
            }
            Animator animator = (Animator) arrayList.get(i11);
            t tVar = (t) eVarU.get(animator);
            if (animator != null && tVar != null) {
                Animator animator2 = tVar.f36734f;
                long j9 = this.f36751c;
                if (j9 >= 0) {
                    animator2.setDuration(j9);
                }
                long j11 = this.f36750b;
                if (j11 >= 0) {
                    animator2.setStartDelay(animator2.getStartDelay() + j11);
                }
                TimeInterpolator timeInterpolator = this.f36752d;
                if (timeInterpolator != null) {
                    animator2.setInterpolator(timeInterpolator);
                }
                this.f36762o.add(animator);
                this.f36773z = Math.max(this.f36773z, animator.getTotalDuration());
            }
            i11++;
        }
    }

    public y F(w wVar) {
        y yVar;
        ArrayList arrayList = this.f36768u;
        if (arrayList != null) {
            if (!arrayList.remove(wVar) && (yVar = this.f36767t) != null) {
                yVar.F(wVar);
            }
            if (this.f36768u.size() == 0) {
                this.f36768u = null;
            }
        }
        return this;
    }

    public void G(View view) {
        this.f36754f.remove(view);
    }

    public void H(View view) {
        if (this.f36765r) {
            if (!this.f36766s) {
                ArrayList arrayList = this.f36762o;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f36763p);
                this.f36763p = C;
                for (int i11 = size - 1; i11 >= 0; i11--) {
                    Animator animator = animatorArr[i11];
                    animatorArr[i11] = null;
                    animator.resume();
                }
                this.f36763p = animatorArr;
                C(this, x.f36748e, false);
            }
            this.f36765r = false;
        }
    }

    public void I() {
        Q();
        q1.e eVarU = u();
        for (Animator animator : this.f36769v) {
            if (eVarU.containsKey(animator)) {
                Q();
                if (animator != null) {
                    animator.addListener(new h20.b(this, eVarU));
                    long j9 = this.f36751c;
                    if (j9 >= 0) {
                        animator.setDuration(j9);
                    }
                    long j11 = this.f36750b;
                    if (j11 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j11);
                    }
                    TimeInterpolator timeInterpolator = this.f36752d;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new androidx.vectordrawable.graphics.drawable.e(this, 13));
                    animator.start();
                }
            }
        }
        this.f36769v.clear();
        o();
    }

    public void J(long j9, long j11) {
        long j12 = this.f36773z;
        int i11 = 0;
        boolean z11 = j9 < j11;
        if ((j11 < 0 && j9 >= 0) || (j11 > j12 && j9 <= j12)) {
            this.f36766s = false;
            C(this, x.f36744a, z11);
        }
        ArrayList arrayList = this.f36762o;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f36763p);
        this.f36763p = C;
        while (i11 < size) {
            Animator animator = animatorArr[i11];
            animatorArr[i11] = null;
            ((AnimatorSet) animator).setCurrentPlayTime(Math.min(Math.max(0L, j9), animator.getTotalDuration()));
            i11++;
            j12 = j12;
        }
        long j13 = j12;
        this.f36763p = animatorArr;
        if ((j9 <= j13 || j11 > j13) && (j9 >= 0 || j11 < 0)) {
            return;
        }
        if (j9 > j13) {
            this.f36766s = true;
        }
        C(this, x.f36745b, z11);
    }

    public void K(long j9) {
        this.f36751c = j9;
    }

    public void L(s sVar) {
        this.f36771x = sVar;
    }

    public void M(TimeInterpolator timeInterpolator) {
        this.f36752d = timeInterpolator;
    }

    public void N(ky.p pVar) {
        if (pVar == null) {
            this.f36772y = E;
        } else {
            this.f36772y = pVar;
        }
    }

    public void O(o oVar) {
        this.f36770w = oVar;
    }

    public void P(long j9) {
        this.f36750b = j9;
    }

    public final void Q() {
        if (this.f36764q == 0) {
            C(this, x.f36744a, false);
            this.f36766s = false;
        }
        this.f36764q++;
    }

    public String R(String str) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(getClass().getSimpleName());
        sb2.append("@");
        sb2.append(Integer.toHexString(hashCode()));
        sb2.append(": ");
        if (this.f36751c != -1) {
            sb2.append("dur(");
            sb2.append(this.f36751c);
            sb2.append(") ");
        }
        if (this.f36750b != -1) {
            sb2.append("dly(");
            sb2.append(this.f36750b);
            sb2.append(") ");
        }
        if (this.f36752d != null) {
            sb2.append("interp(");
            sb2.append(this.f36752d);
            sb2.append(") ");
        }
        ArrayList arrayList = this.f36753e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f36754f;
        if (size > 0 || arrayList2.size() > 0) {
            sb2.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    if (i11 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(arrayList.get(i11));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    if (i12 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(arrayList2.get(i12));
                }
            }
            sb2.append(")");
        }
        return sb2.toString();
    }

    public void a(w wVar) {
        if (this.f36768u == null) {
            this.f36768u = new ArrayList();
        }
        this.f36768u.add(wVar);
    }

    public void b(View view) {
        this.f36754f.add(view);
    }

    public void cancel() {
        ArrayList arrayList = this.f36762o;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f36763p);
        this.f36763p = C;
        for (int i11 = size - 1; i11 >= 0; i11--) {
            Animator animator = animatorArr[i11];
            animatorArr[i11] = null;
            animator.cancel();
        }
        this.f36763p = animatorArr;
        C(this, x.f36746c, false);
    }

    public abstract void d(h0 h0Var);

    public final void f(View view, boolean z11) {
        if (view == null) {
            return;
        }
        view.getId();
        ArrayList arrayList = this.f36755g;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (((Class) this.f36755g.get(i11)).isInstance(view)) {
                    return;
                }
            }
        }
        if (view.getParent() instanceof ViewGroup) {
            h0 h0Var = new h0(view);
            if (z11) {
                i(h0Var);
            } else {
                d(h0Var);
            }
            h0Var.f36675c.add(this);
            h(h0Var);
            if (z11) {
                c(this.f36756h, view, h0Var);
            } else {
                c(this.f36757i, view, h0Var);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                f(viewGroup.getChildAt(i12), z11);
            }
        }
    }

    public void h(h0 h0Var) {
        if (this.f36770w != null) {
            HashMap map = h0Var.f36673a;
            if (map.isEmpty()) {
                return;
            }
            this.f36770w.getClass();
            for (int i11 = 0; i11 < 2; i11++) {
                if (!map.containsKey(o.f36704b[i11])) {
                    this.f36770w.getClass();
                    View view = h0Var.f36674b;
                    Integer numValueOf = (Integer) map.get("android:visibility:visibility");
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(view.getVisibility());
                    }
                    map.put("android:visibilityPropagation:visibility", numValueOf);
                    int[] iArr = {iRound, 0};
                    view.getLocationOnScreen(iArr);
                    int iRound = Math.round(view.getTranslationX()) + iArr[0];
                    iArr[0] = (view.getWidth() / 2) + iRound;
                    int iRound2 = Math.round(view.getTranslationY()) + iArr[1];
                    iArr[1] = iRound2;
                    iArr[1] = (view.getHeight() / 2) + iRound2;
                    map.put("android:visibilityPropagation:center", iArr);
                    return;
                }
            }
        }
    }

    public abstract void i(h0 h0Var);

    public final void j(ViewGroup viewGroup, boolean z11) {
        k(z11);
        ArrayList arrayList = this.f36753e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f36754f;
        if (size <= 0 && arrayList2.size() <= 0) {
            f(viewGroup, z11);
            return;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            View viewFindViewById = viewGroup.findViewById(((Integer) arrayList.get(i11)).intValue());
            if (viewFindViewById != null) {
                h0 h0Var = new h0(viewFindViewById);
                if (z11) {
                    i(h0Var);
                } else {
                    d(h0Var);
                }
                h0Var.f36675c.add(this);
                h(h0Var);
                if (z11) {
                    c(this.f36756h, viewFindViewById, h0Var);
                } else {
                    c(this.f36757i, viewFindViewById, h0Var);
                }
            }
        }
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            View view = (View) arrayList2.get(i12);
            h0 h0Var2 = new h0(view);
            if (z11) {
                i(h0Var2);
            } else {
                d(h0Var2);
            }
            h0Var2.f36675c.add(this);
            h(h0Var2);
            if (z11) {
                c(this.f36756h, view, h0Var2);
            } else {
                c(this.f36757i, view, h0Var2);
            }
        }
    }

    public final void k(boolean z11) {
        if (z11) {
            ((q1.e) this.f36756h.f12779b).clear();
            ((SparseArray) this.f36756h.f12780c).clear();
            ((q1.z) this.f36756h.f12781d).a();
        } else {
            ((q1.e) this.f36757i.f12779b).clear();
            ((SparseArray) this.f36757i.f12780c).clear();
            ((q1.z) this.f36757i.f12781d).a();
        }
    }

    @Override // 
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public y clone() {
        try {
            y yVar = (y) super.clone();
            yVar.f36769v = new ArrayList();
            yVar.f36756h = new com.google.firebase.messaging.a0(23);
            yVar.f36757i = new com.google.firebase.messaging.a0(23);
            yVar.l = null;
            yVar.f36760m = null;
            yVar.A = null;
            yVar.f36767t = this;
            yVar.f36768u = null;
            return yVar;
        } catch (CloneNotSupportedException e5) {
            org.bouncycastle.jce.provider.a.m(e5);
            return null;
        }
    }

    public Animator m(ViewGroup viewGroup, h0 h0Var, h0 h0Var2) {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0268 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void n(android.view.ViewGroup r31, com.google.firebase.messaging.a0 r32, com.google.firebase.messaging.a0 r33, java.util.ArrayList r34, java.util.ArrayList r35) {
        /*
            Method dump skipped, instruction units count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qa.y.n(android.view.ViewGroup, com.google.firebase.messaging.a0, com.google.firebase.messaging.a0, java.util.ArrayList, java.util.ArrayList):void");
    }

    public final void o() {
        int i11 = this.f36764q - 1;
        this.f36764q = i11;
        if (i11 == 0) {
            C(this, x.f36745b, false);
            for (int i12 = 0; i12 < ((q1.z) this.f36756h.f12781d).j(); i12++) {
                View view = (View) ((q1.z) this.f36756h.f12781d).k(i12);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i13 = 0; i13 < ((q1.z) this.f36757i.f12781d).j(); i13++) {
                View view2 = (View) ((q1.z) this.f36757i.f12781d).k(i13);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f36766s = true;
        }
    }

    public void q() {
        ArrayList arrayList = this.f36755g;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        if (!arrayList.contains(TextView.class)) {
            arrayList.add(TextView.class);
        }
        this.f36755g = arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x002c, code lost:
    
        if (r2 < 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002e, code lost:
    
        if (r6 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0030, code lost:
    
        r5 = r4.f36760m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0033, code lost:
    
        r5 = r4.l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003b, code lost:
    
        return (qa.h0) r5.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003c, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final qa.h0 s(android.view.View r5, boolean r6) {
        /*
            r4 = this;
            qa.e0 r0 = r4.f36758j
            if (r0 == 0) goto L9
            qa.h0 r5 = r0.s(r5, r6)
            return r5
        L9:
            if (r6 == 0) goto Le
            java.util.ArrayList r0 = r4.l
            goto L10
        Le:
            java.util.ArrayList r0 = r4.f36760m
        L10:
            if (r0 != 0) goto L13
            goto L3c
        L13:
            int r1 = r0.size()
            r2 = 0
        L18:
            if (r2 >= r1) goto L2b
            java.lang.Object r3 = r0.get(r2)
            qa.h0 r3 = (qa.h0) r3
            if (r3 != 0) goto L23
            goto L3c
        L23:
            android.view.View r3 = r3.f36674b
            if (r3 != r5) goto L28
            goto L2c
        L28:
            int r2 = r2 + 1
            goto L18
        L2b:
            r2 = -1
        L2c:
            if (r2 < 0) goto L3c
            if (r6 == 0) goto L33
            java.util.ArrayList r5 = r4.f36760m
            goto L35
        L33:
            java.util.ArrayList r5 = r4.l
        L35:
            java.lang.Object r5 = r5.get(r2)
            qa.h0 r5 = (qa.h0) r5
            return r5
        L3c:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: qa.y.s(android.view.View, boolean):qa.h0");
    }

    public final y t() {
        e0 e0Var = this.f36758j;
        return e0Var != null ? e0Var.t() : this;
    }

    public final String toString() {
        return R("");
    }

    public String[] v() {
        return null;
    }

    public final h0 w(View view, boolean z11) {
        e0 e0Var = this.f36758j;
        if (e0Var != null) {
            return e0Var.w(view, z11);
        }
        return (h0) ((q1.e) (z11 ? this.f36756h : this.f36757i).f12779b).get(view);
    }

    public boolean x() {
        return !this.f36762o.isEmpty();
    }

    public boolean y() {
        return this instanceof f;
    }

    public boolean z(h0 h0Var, h0 h0Var2) {
        if (h0Var != null && h0Var2 != null) {
            String[] strArrV = v();
            if (strArrV != null) {
                for (String str : strArrV) {
                    if (B(h0Var, h0Var2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = h0Var.f36673a.keySet().iterator();
                while (it.hasNext()) {
                    if (B(h0Var, h0Var2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public y() {
        this.f36749a = getClass().getName();
        this.f36750b = -1L;
        this.f36751c = -1L;
        this.f36752d = null;
        this.f36753e = new ArrayList();
        this.f36754f = new ArrayList();
        this.f36755g = null;
        this.f36756h = new com.google.firebase.messaging.a0(23);
        this.f36757i = new com.google.firebase.messaging.a0(23);
        this.f36758j = null;
        this.f36759k = D;
        this.f36762o = new ArrayList();
        this.f36763p = C;
        this.f36764q = 0;
        this.f36765r = false;
        this.f36766s = false;
        this.f36767t = null;
        this.f36768u = null;
        this.f36769v = new ArrayList();
        this.f36772y = E;
    }
}
