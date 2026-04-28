package q6;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.adyen.checkout.ui.core.internal.ui.view.ExpiryDateInput;
import com.app.tgtg.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import o00.x0;
import org.xmlpull.v1.XmlPullParserException;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;
import zw.q2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MotionLayout f36117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.constraintlayout.widget.z f36118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c0 f36119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f36120d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c0 f36121e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f36122f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SparseArray f36123g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f36124h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final SparseIntArray f36125i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f36126j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f36127k;
    public MotionEvent l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f36128m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f36129n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public w f36130o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f36131p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final q2 f36132q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f36133r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f36134s;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public d0(Context context, MotionLayout motionLayout, int i11) {
        this.f36118b = null;
        this.f36119c = null;
        ArrayList arrayList = new ArrayList();
        this.f36120d = arrayList;
        this.f36121e = null;
        this.f36122f = new ArrayList();
        this.f36123g = new SparseArray();
        this.f36124h = new HashMap();
        this.f36125i = new SparseIntArray();
        this.f36126j = 400;
        this.f36127k = 0;
        this.f36128m = false;
        this.f36129n = false;
        this.f36117a = motionLayout;
        q2 q2Var = new q2();
        q2Var.f48334b = new ArrayList();
        q2Var.f48336d = "ViewTransitionController";
        q2Var.f48338f = new ArrayList();
        q2Var.f48333a = motionLayout;
        this.f36132q = q2Var;
        XmlResourceParser xml = context.getResources().getXml(i11);
        try {
            c0 c0Var = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                h(context, xml);
                            }
                            break;
                        case -1239391468:
                            if (name.equals("KeyFrameSet")) {
                                g gVar = new g(context, xml);
                                if (c0Var != null) {
                                    c0Var.f36096k.add(gVar);
                                }
                            }
                            break;
                        case -687739768:
                            if (name.equals("Include")) {
                                j(context, xml);
                            }
                            break;
                        case 61998586:
                            if (name.equals("ViewTransition")) {
                                g0 g0Var = new g0(context, xml);
                                q2 q2Var2 = this.f36132q;
                                ((ArrayList) q2Var2.f48334b).add(g0Var);
                                q2Var2.f48335c = null;
                                int i12 = g0Var.f36194b;
                                if (i12 == 4) {
                                    q2.N(g0Var);
                                } else if (i12 == 5) {
                                    q2.N(g0Var);
                                }
                            }
                            break;
                        case 269306229:
                            if (name.equals("Transition")) {
                                c0Var = new c0(this, context, xml);
                                boolean z11 = c0Var.f36087b;
                                arrayList.add(c0Var);
                                if (this.f36119c == null && !z11) {
                                    this.f36119c = c0Var;
                                    e0 e0Var = c0Var.l;
                                    if (e0Var != null) {
                                        e0Var.c(this.f36131p);
                                    }
                                }
                                if (z11) {
                                    if (c0Var.f36088c == -1) {
                                        this.f36121e = c0Var;
                                    } else {
                                        this.f36122f.add(c0Var);
                                    }
                                    arrayList.remove(c0Var);
                                }
                            }
                            break;
                        case 312750793:
                            if (name.equals("OnClick") && c0Var != null && !motionLayout.isInEditMode()) {
                                c0Var.f36097m.add(new b0(context, c0Var, xml));
                            }
                            break;
                        case 327855227:
                            if (name.equals("OnSwipe")) {
                                if (c0Var == null) {
                                    Log.v("MotionScene", " OnSwipe (" + context.getResources().getResourceEntryName(i11) + ".xml:" + xml.getLineNumber() + ")");
                                }
                                if (c0Var != null) {
                                    c0Var.l = new e0(context, motionLayout, xml);
                                }
                            }
                            break;
                        case 793277014:
                            if (name.equals("MotionScene")) {
                                k(context, xml);
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                this.f36118b = new androidx.constraintlayout.widget.z(context, xml);
                            }
                            break;
                        case 1942574248:
                            if (name.equals("include")) {
                                j(context, xml);
                            }
                            break;
                    }
                }
            }
        } catch (IOException e5) {
            Log.e("MotionScene", "Error parsing resource: " + i11, e5);
        } catch (XmlPullParserException e11) {
            Log.e("MotionScene", "Error parsing resource: " + i11, e11);
        }
        this.f36123g.put(R.id.motion_base, new androidx.constraintlayout.widget.q());
        this.f36124h.put("motion_base", Integer.valueOf(R.id.motion_base));
    }

    public static int c(Context context, String str) {
        int identifier;
        if (str.contains(ExpiryDateInput.SEPARATOR)) {
            identifier = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), "id", context.getPackageName());
        } else {
            identifier = -1;
        }
        if (identifier == -1) {
            if (str.length() > 1) {
                return Integer.parseInt(str.substring(1));
            }
            Log.e("MotionScene", "error in parsing id");
        }
        return identifier;
    }

    public final boolean a(int i11, MotionLayout motionLayout) {
        c0 c0Var;
        if (this.f36130o != null) {
            return false;
        }
        for (c0 c0Var2 : this.f36120d) {
            int i12 = c0Var2.f36098n;
            if (i12 != 0 && ((c0Var = this.f36119c) != c0Var2 || (c0Var.f36102r & 2) == 0)) {
                if (i11 == c0Var2.f36089d && (i12 == 4 || i12 == 2)) {
                    z zVar = z.FINISHED;
                    motionLayout.setState(zVar);
                    motionLayout.setTransition(c0Var2);
                    if (c0Var2.f36098n == 4) {
                        motionLayout.A();
                        motionLayout.setState(z.SETUP);
                        motionLayout.setState(z.MOVING);
                        return true;
                    }
                    motionLayout.setProgress(1.0f);
                    motionLayout.q(true);
                    motionLayout.setState(z.SETUP);
                    motionLayout.setState(z.MOVING);
                    motionLayout.setState(zVar);
                    motionLayout.w();
                    return true;
                }
                if (i11 == c0Var2.f36088c && (i12 == 3 || i12 == 1)) {
                    z zVar2 = z.FINISHED;
                    motionLayout.setState(zVar2);
                    motionLayout.setTransition(c0Var2);
                    if (c0Var2.f36098n == 3) {
                        motionLayout.o(0.0f);
                        motionLayout.setState(z.SETUP);
                        motionLayout.setState(z.MOVING);
                        return true;
                    }
                    motionLayout.setProgress(0.0f);
                    motionLayout.q(true);
                    motionLayout.setState(z.SETUP);
                    motionLayout.setState(z.MOVING);
                    motionLayout.setState(zVar2);
                    motionLayout.w();
                    return true;
                }
            }
        }
        return false;
    }

    public final androidx.constraintlayout.widget.q b(int i11) {
        int iP;
        androidx.constraintlayout.widget.z zVar = this.f36118b;
        if (zVar != null && (iP = zVar.p(i11)) != -1) {
            i11 = iP;
        }
        SparseArray sparseArray = this.f36123g;
        if (sparseArray.get(i11) != null) {
            return (androidx.constraintlayout.widget.q) sparseArray.get(i11);
        }
        Log.e("MotionScene", "Warning could not find ConstraintSet id/" + x0.v(this.f36117a.getContext(), i11) + " In MotionScene");
        return (androidx.constraintlayout.widget.q) sparseArray.get(sparseArray.keyAt(0));
    }

    public final Interpolator d() {
        c0 c0Var = this.f36119c;
        int i11 = c0Var.f36090e;
        if (i11 == -2) {
            return AnimationUtils.loadInterpolator(this.f36117a.getContext(), this.f36119c.f36092g);
        }
        if (i11 == -1) {
            return new o(i6.e.d(c0Var.f36091f), 1);
        }
        if (i11 == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i11 == 1) {
            return new AccelerateInterpolator();
        }
        if (i11 == 2) {
            return new DecelerateInterpolator();
        }
        if (i11 == 4) {
            return new BounceInterpolator();
        }
        if (i11 == 5) {
            return new OvershootInterpolator();
        }
        if (i11 != 6) {
            return null;
        }
        return new AnticipateInterpolator();
    }

    public final void e(p pVar) {
        c0 c0Var = this.f36119c;
        if (c0Var != null) {
            Iterator it = c0Var.f36096k.iterator();
            while (it.hasNext()) {
                ((g) it.next()).a(pVar);
            }
        } else {
            c0 c0Var2 = this.f36121e;
            if (c0Var2 != null) {
                Iterator it2 = c0Var2.f36096k.iterator();
                while (it2.hasNext()) {
                    ((g) it2.next()).a(pVar);
                }
            }
        }
    }

    public final float f() {
        e0 e0Var;
        c0 c0Var = this.f36119c;
        if (c0Var == null || (e0Var = c0Var.l) == null) {
            return 0.0f;
        }
        return e0Var.f36154t;
    }

    public final int g() {
        c0 c0Var = this.f36119c;
        if (c0Var == null) {
            return -1;
        }
        return c0Var.f36089d;
    }

    public final int h(Context context, XmlResourceParser xmlResourceParser) {
        String attributeValue;
        androidx.constraintlayout.widget.q qVar = new androidx.constraintlayout.widget.q();
        qVar.f2493f = false;
        int attributeCount = xmlResourceParser.getAttributeCount();
        int iC = -1;
        int iC2 = -1;
        for (int i11 = 0; i11 < attributeCount; i11++) {
            String attributeName = xmlResourceParser.getAttributeName(i11);
            attributeValue = xmlResourceParser.getAttributeValue(i11);
            attributeName.getClass();
            switch (attributeName) {
                case "deriveConstraintsFrom":
                    iC2 = c(context, attributeValue);
                    break;
                case "constraintRotate":
                    try {
                        qVar.f2491d = Integer.parseInt(attributeValue);
                        break;
                    } catch (NumberFormatException unused) {
                        attributeValue.getClass();
                        switch (attributeValue) {
                            case "x_left":
                                qVar.f2491d = 4;
                                break;
                            case "left":
                                qVar.f2491d = 2;
                                break;
                            case "none":
                                qVar.f2491d = 0;
                                break;
                            case "right":
                                qVar.f2491d = 1;
                                break;
                            case "x_right":
                                qVar.f2491d = 3;
                                break;
                        }
                    }
                    break;
                case "id":
                    iC = c(context, attributeValue);
                    int iIndexOf = attributeValue.indexOf(47);
                    if (iIndexOf >= 0) {
                        attributeValue = attributeValue.substring(iIndexOf + 1);
                    }
                    this.f36124h.put(attributeValue, Integer.valueOf(iC));
                    qVar.f2488a = x0.v(context, iC);
                    break;
                case "stateLabels":
                    qVar.f2490c = attributeValue.split(MessageLogView.COMMA_SEPARATOR);
                    int i12 = 0;
                    while (true) {
                        String[] strArr = qVar.f2490c;
                        if (i12 < strArr.length) {
                            strArr[i12] = strArr[i12].trim();
                            i12++;
                        }
                    }
                    break;
            }
        }
        if (iC != -1) {
            int i13 = this.f36117a.f2297u;
            qVar.l(context, xmlResourceParser);
            if (iC2 != -1) {
                this.f36125i.put(iC, iC2);
            }
            this.f36123g.put(iC, qVar);
        }
        return iC;
    }

    public final int i(Context context, int i11) {
        XmlResourceParser xml = context.getResources().getXml(i11);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                String name = xml.getName();
                if (2 == eventType && "ConstraintSet".equals(name)) {
                    return h(context, xml);
                }
            }
            return -1;
        } catch (IOException e5) {
            Log.e("MotionScene", "Error parsing resource: " + i11, e5);
            return -1;
        } catch (XmlPullParserException e11) {
            Log.e("MotionScene", "Error parsing resource: " + i11, e11);
            return -1;
        }
    }

    public final void j(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), androidx.constraintlayout.widget.v.f2531z);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i11);
            if (index == 0) {
                i(context, typedArrayObtainStyledAttributes.getResourceId(index, -1));
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void k(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), androidx.constraintlayout.widget.v.f2521p);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i11);
            if (index == 0) {
                int i12 = typedArrayObtainStyledAttributes.getInt(index, this.f36126j);
                this.f36126j = i12;
                if (i12 < 8) {
                    this.f36126j = 8;
                }
            } else if (index == 1) {
                this.f36127k = typedArrayObtainStyledAttributes.getInteger(index, 0);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void l(int i11, MotionLayout motionLayout) {
        SparseArray sparseArray = this.f36123g;
        androidx.constraintlayout.widget.q qVar = (androidx.constraintlayout.widget.q) sparseArray.get(i11);
        String str = qVar.f2488a;
        HashMap map = qVar.f2494g;
        qVar.f2489b = str;
        int i12 = this.f36125i.get(i11);
        if (i12 > 0) {
            l(i12, motionLayout);
            androidx.constraintlayout.widget.q qVar2 = (androidx.constraintlayout.widget.q) sparseArray.get(i12);
            if (qVar2 == null) {
                Log.e("MotionScene", "ERROR! invalid deriveConstraintsFrom: @id/" + x0.v(this.f36117a.getContext(), i12));
                return;
            }
            HashMap map2 = qVar2.f2494g;
            qVar.f2489b += ExpiryDateInput.SEPARATOR + qVar2.f2489b;
            for (Integer num : map2.keySet()) {
                num.getClass();
                androidx.constraintlayout.widget.l lVar = (androidx.constraintlayout.widget.l) map2.get(num);
                if (!map.containsKey(num)) {
                    map.put(num, new androidx.constraintlayout.widget.l());
                }
                androidx.constraintlayout.widget.l lVar2 = (androidx.constraintlayout.widget.l) map.get(num);
                if (lVar2 != null) {
                    androidx.constraintlayout.widget.m mVar = lVar2.f2407e;
                    if (!mVar.f2414b) {
                        mVar.a(lVar.f2407e);
                    }
                    androidx.constraintlayout.widget.o oVar = lVar2.f2405c;
                    if (!oVar.f2466a) {
                        androidx.constraintlayout.widget.o oVar2 = lVar.f2405c;
                        oVar.f2466a = oVar2.f2466a;
                        oVar.f2467b = oVar2.f2467b;
                        oVar.f2469d = oVar2.f2469d;
                        oVar.f2470e = oVar2.f2470e;
                        oVar.f2468c = oVar2.f2468c;
                    }
                    androidx.constraintlayout.widget.p pVar = lVar2.f2408f;
                    if (!pVar.f2472a) {
                        pVar.a(lVar.f2408f);
                    }
                    androidx.constraintlayout.widget.n nVar = lVar2.f2406d;
                    if (!nVar.f2454a) {
                        nVar.a(lVar.f2406d);
                    }
                    for (String str2 : lVar.f2409g.keySet()) {
                        if (!lVar2.f2409g.containsKey(str2)) {
                            lVar2.f2409g.put(str2, (androidx.constraintlayout.widget.b) lVar.f2409g.get(str2));
                        }
                    }
                }
            }
        } else {
            qVar.f2489b = r8.k.p(new StringBuilder(), qVar.f2489b, "  layout");
            int childCount = motionLayout.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = motionLayout.getChildAt(i13);
                ConstraintLayout.a aVar = (ConstraintLayout.a) childAt.getLayoutParams();
                int id2 = childAt.getId();
                if (qVar.f2493f && id2 == -1) {
                    a40.d0.k("All children of ConstraintLayout must have ids to use ConstraintSet");
                    return;
                }
                if (!map.containsKey(Integer.valueOf(id2))) {
                    map.put(Integer.valueOf(id2), new androidx.constraintlayout.widget.l());
                }
                androidx.constraintlayout.widget.l lVar3 = (androidx.constraintlayout.widget.l) map.get(Integer.valueOf(id2));
                if (lVar3 != null) {
                    androidx.constraintlayout.widget.o oVar3 = lVar3.f2405c;
                    androidx.constraintlayout.widget.m mVar2 = lVar3.f2407e;
                    androidx.constraintlayout.widget.p pVar2 = lVar3.f2408f;
                    if (!mVar2.f2414b) {
                        lVar3.c(id2, aVar);
                        if (childAt instanceof androidx.constraintlayout.widget.c) {
                            mVar2.f2431j0 = ((androidx.constraintlayout.widget.c) childAt).getReferencedIds();
                            if (childAt instanceof Barrier) {
                                Barrier barrier = (Barrier) childAt;
                                mVar2.f2440o0 = barrier.getAllowsGoneWidget();
                                mVar2.f2425g0 = barrier.getType();
                                mVar2.f2427h0 = barrier.getMargin();
                            }
                        }
                        mVar2.f2414b = true;
                    }
                    if (!oVar3.f2466a) {
                        oVar3.f2467b = childAt.getVisibility();
                        oVar3.f2469d = childAt.getAlpha();
                        oVar3.f2466a = true;
                    }
                    if (!pVar2.f2472a) {
                        pVar2.f2472a = true;
                        pVar2.f2473b = childAt.getRotation();
                        pVar2.f2474c = childAt.getRotationX();
                        pVar2.f2475d = childAt.getRotationY();
                        pVar2.f2476e = childAt.getScaleX();
                        pVar2.f2477f = childAt.getScaleY();
                        float pivotX = childAt.getPivotX();
                        float pivotY = childAt.getPivotY();
                        if (pivotX != 0.0d || pivotY != 0.0d) {
                            pVar2.f2478g = pivotX;
                            pVar2.f2479h = pivotY;
                        }
                        pVar2.f2481j = childAt.getTranslationX();
                        pVar2.f2482k = childAt.getTranslationY();
                        pVar2.l = childAt.getTranslationZ();
                        if (pVar2.f2483m) {
                            pVar2.f2484n = childAt.getElevation();
                        }
                    }
                }
            }
        }
        for (androidx.constraintlayout.widget.l lVar4 : map.values()) {
            if (lVar4.f2410h != null) {
                if (lVar4.f2404b == null) {
                    lVar4.f2410h.e(qVar.j(lVar4.f2403a));
                } else {
                    Iterator it = map.keySet().iterator();
                    while (it.hasNext()) {
                        androidx.constraintlayout.widget.l lVarJ = qVar.j(((Integer) it.next()).intValue());
                        String str3 = lVarJ.f2407e.f2434l0;
                        if (str3 != null && lVar4.f2404b.matches(str3)) {
                            lVar4.f2410h.e(lVarJ);
                            lVarJ.f2409g.putAll((HashMap) lVar4.f2409g.clone());
                        }
                    }
                }
            }
        }
    }

    public final void m(MotionLayout motionLayout) {
        int i11 = 0;
        loop0: while (true) {
            SparseArray sparseArray = this.f36123g;
            if (i11 >= sparseArray.size()) {
                return;
            }
            int iKeyAt = sparseArray.keyAt(i11);
            SparseIntArray sparseIntArray = this.f36125i;
            int i12 = sparseIntArray.get(iKeyAt);
            int size = sparseIntArray.size();
            while (i12 > 0) {
                if (i12 == iKeyAt) {
                    break loop0;
                }
                int i13 = size - 1;
                if (size < 0) {
                    break loop0;
                }
                i12 = sparseIntArray.get(i12);
                size = i13;
            }
            l(iKeyAt, motionLayout);
            i11++;
        }
        Log.e("MotionScene", "Cannot be derived from yourself");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(int r9, int r10) {
        /*
            r8 = this;
            r0 = -1
            androidx.constraintlayout.widget.z r1 = r8.f36118b
            if (r1 == 0) goto L18
            int r1 = r1.p(r9)
            if (r1 == r0) goto Lc
            goto Ld
        Lc:
            r1 = r9
        Ld:
            androidx.constraintlayout.widget.z r2 = r8.f36118b
            int r2 = r2.p(r10)
            if (r2 == r0) goto L16
            goto L1a
        L16:
            r2 = r10
            goto L1a
        L18:
            r1 = r9
            goto L16
        L1a:
            q6.c0 r3 = r8.f36119c
            if (r3 == 0) goto L27
            int r4 = r3.f36088c
            if (r4 != r10) goto L27
            int r3 = r3.f36089d
            if (r3 != r9) goto L27
            goto L52
        L27:
            java.util.ArrayList r3 = r8.f36120d
            java.util.Iterator r4 = r3.iterator()
        L2d:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L53
            java.lang.Object r5 = r4.next()
            q6.c0 r5 = (q6.c0) r5
            int r6 = r5.f36088c
            if (r6 != r2) goto L41
            int r7 = r5.f36089d
            if (r7 == r1) goto L47
        L41:
            if (r6 != r10) goto L2d
            int r6 = r5.f36089d
            if (r6 != r9) goto L2d
        L47:
            r8.f36119c = r5
            q6.e0 r9 = r5.l
            if (r9 == 0) goto L52
            boolean r10 = r8.f36131p
            r9.c(r10)
        L52:
            return
        L53:
            java.util.ArrayList r9 = r8.f36122f
            java.util.Iterator r9 = r9.iterator()
            q6.c0 r4 = r8.f36121e
        L5b:
            boolean r5 = r9.hasNext()
            if (r5 == 0) goto L6d
            java.lang.Object r5 = r9.next()
            q6.c0 r5 = (q6.c0) r5
            int r6 = r5.f36088c
            if (r6 != r10) goto L5b
            r4 = r5
            goto L5b
        L6d:
            q6.c0 r9 = new q6.c0
            r9.<init>(r8, r4)
            r9.f36089d = r1
            r9.f36088c = r2
            if (r1 == r0) goto L7b
            r3.add(r9)
        L7b:
            r8.f36119c = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q6.d0.n(int, int):void");
    }

    public final boolean o() {
        Iterator it = this.f36120d.iterator();
        while (it.hasNext()) {
            if (((c0) it.next()).l != null) {
                return true;
            }
        }
        c0 c0Var = this.f36119c;
        return (c0Var == null || c0Var.l == null) ? false : true;
    }
}
