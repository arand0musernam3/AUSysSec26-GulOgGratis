package q6;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
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
import androidx.constraintlayout.widget.ConstraintLayout;
import com.adyen.checkout.ui.core.internal.ui.view.ExpiryDateInput;
import com.app.tgtg.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import o00.x0;
import zw.q2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36193a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f36197e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f36198f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final androidx.constraintlayout.widget.l f36199g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f36202j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f36203k;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Context f36206o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f36194b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f36195c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f36196d = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f36200h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f36201i = -1;
    public int l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f36204m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f36205n = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f36207p = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f36208q = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f36209r = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f36210s = -1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f36211t = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f36212u = -1;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0097 A[Catch: IOException -> 0x0043, XmlPullParserException -> 0x0046, TryCatch #2 {IOException -> 0x0043, XmlPullParserException -> 0x0046, blocks: (B:3:0x0028, B:37:0x00ca, B:11:0x0037, B:18:0x0049, B:19:0x0051, B:36:0x0097, B:21:0x0055, B:26:0x0066, B:24:0x005e, B:27:0x006e, B:29:0x0074, B:30:0x0078, B:32:0x0080, B:33:0x0088, B:35:0x0090), top: B:42:0x0028 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g0(android.content.Context r6, android.content.res.XmlResourceParser r7) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q6.g0.<init>(android.content.Context, android.content.res.XmlResourceParser):void");
    }

    public final void a(q2 q2Var, MotionLayout motionLayout, int i11, androidx.constraintlayout.widget.q qVar, View... viewArr) {
        Interpolator interpolatorLoadInterpolator;
        Interpolator interpolator;
        if (this.f36195c) {
            return;
        }
        int i12 = this.f36197e;
        g gVar = this.f36198f;
        int i13 = 0;
        if (i12 != 2) {
            androidx.constraintlayout.widget.l lVar = this.f36199g;
            if (i12 == 1) {
                int[] constraintSetIds = motionLayout.getConstraintSetIds();
                int i14 = 0;
                while (i14 < constraintSetIds.length) {
                    int i15 = constraintSetIds[i14];
                    if (i15 != i11) {
                        d0 d0Var = motionLayout.f2262a;
                        androidx.constraintlayout.widget.q qVarB = d0Var == null ? null : d0Var.b(i15);
                        int length = viewArr.length;
                        for (int i16 = i13; i16 < length; i16++) {
                            androidx.constraintlayout.widget.l lVarJ = qVarB.j(viewArr[i16].getId());
                            if (lVar != null) {
                                androidx.constraintlayout.widget.k kVar = lVar.f2410h;
                                if (kVar != null) {
                                    kVar.e(lVarJ);
                                }
                                lVarJ.f2409g.putAll(lVar.f2409g);
                            }
                        }
                    }
                    i14++;
                    i13 = 0;
                }
            }
            androidx.constraintlayout.widget.q qVar2 = new androidx.constraintlayout.widget.q();
            HashMap map = qVar2.f2494g;
            map.clear();
            for (Integer num : qVar.f2494g.keySet()) {
                androidx.constraintlayout.widget.l lVar2 = (androidx.constraintlayout.widget.l) qVar.f2494g.get(num);
                if (lVar2 != null) {
                    map.put(num, lVar2.clone());
                }
            }
            for (View view : viewArr) {
                androidx.constraintlayout.widget.l lVarJ2 = qVar2.j(view.getId());
                if (lVar != null) {
                    androidx.constraintlayout.widget.k kVar2 = lVar.f2410h;
                    if (kVar2 != null) {
                        kVar2.e(lVarJ2);
                    }
                    lVarJ2.f2409g.putAll(lVar.f2409g);
                }
            }
            motionLayout.C(i11, qVar2);
            motionLayout.C(R.id.view_transition, qVar);
            motionLayout.setState(R.id.view_transition, -1, -1);
            c0 c0Var = new c0(motionLayout.f2262a, i11);
            for (View view2 : viewArr) {
                int i17 = this.f36200h;
                if (i17 != -1) {
                    c0Var.f36093h = Math.max(i17, 8);
                }
                c0Var.f36100p = this.f36196d;
                int i18 = this.l;
                String str = this.f36204m;
                int i19 = this.f36205n;
                c0Var.f36090e = i18;
                c0Var.f36091f = str;
                c0Var.f36092g = i19;
                int id2 = view2.getId();
                if (gVar != null) {
                    ArrayList arrayList = (ArrayList) gVar.f36192a.get(-1);
                    g gVar2 = new g();
                    gVar2.f36192a = new HashMap();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        b bVarB = ((b) it.next()).clone();
                        bVarB.f36079b = id2;
                        gVar2.b(bVarB);
                    }
                    c0Var.f36096k.add(gVar2);
                }
            }
            motionLayout.setTransition(c0Var);
            mr.h hVar = new mr.h(6, this, viewArr);
            motionLayout.o(1.0f);
            motionLayout.f2279k1 = hVar;
            return;
        }
        View view3 = viewArr[0];
        p pVar = new p(view3);
        a0 a0Var = pVar.f36281f;
        a0Var.f36064c = 0.0f;
        a0Var.f36065d = 0.0f;
        pVar.H = true;
        a0Var.e(view3.getX(), view3.getY(), view3.getWidth(), view3.getHeight());
        pVar.f36282g.e(view3.getX(), view3.getY(), view3.getWidth(), view3.getHeight());
        n nVar = pVar.f36283h;
        nVar.getClass();
        view3.getX();
        view3.getY();
        view3.getWidth();
        view3.getHeight();
        nVar.f36260c = view3.getVisibility();
        nVar.f36262e = view3.getVisibility() != 0 ? 0.0f : view3.getAlpha();
        nVar.f36263f = view3.getElevation();
        nVar.f36264g = view3.getRotation();
        nVar.f36265h = view3.getRotationX();
        nVar.f36258a = view3.getRotationY();
        nVar.f36266i = view3.getScaleX();
        nVar.f36267j = view3.getScaleY();
        nVar.f36268k = view3.getPivotX();
        nVar.l = view3.getPivotY();
        nVar.f36269m = view3.getTranslationX();
        nVar.f36270n = view3.getTranslationY();
        nVar.f36271o = view3.getTranslationZ();
        n nVar2 = pVar.f36284i;
        nVar2.getClass();
        view3.getX();
        view3.getY();
        view3.getWidth();
        view3.getHeight();
        nVar2.f36260c = view3.getVisibility();
        nVar2.f36262e = view3.getVisibility() != 0 ? 0.0f : view3.getAlpha();
        nVar2.f36263f = view3.getElevation();
        nVar2.f36264g = view3.getRotation();
        nVar2.f36265h = view3.getRotationX();
        nVar2.f36258a = view3.getRotationY();
        nVar2.f36266i = view3.getScaleX();
        nVar2.f36267j = view3.getScaleY();
        nVar2.f36268k = view3.getPivotX();
        nVar2.l = view3.getPivotY();
        nVar2.f36269m = view3.getTranslationX();
        nVar2.f36270n = view3.getTranslationY();
        nVar2.f36271o = view3.getTranslationZ();
        ArrayList arrayList2 = (ArrayList) gVar.f36192a.get(-1);
        if (arrayList2 != null) {
            pVar.f36297w.addAll(arrayList2);
        }
        pVar.g(motionLayout.getWidth(), motionLayout.getHeight(), System.nanoTime());
        int i21 = this.f36200h;
        int i22 = this.f36201i;
        int i23 = this.f36194b;
        Context context = motionLayout.getContext();
        int i24 = this.l;
        if (i24 == -2) {
            interpolatorLoadInterpolator = AnimationUtils.loadInterpolator(context, this.f36205n);
        } else if (i24 == -1) {
            interpolatorLoadInterpolator = new o(i6.e.d(this.f36204m), 2);
        } else if (i24 == 0) {
            interpolatorLoadInterpolator = new AccelerateDecelerateInterpolator();
        } else if (i24 == 1) {
            interpolatorLoadInterpolator = new AccelerateInterpolator();
        } else if (i24 == 2) {
            interpolatorLoadInterpolator = new DecelerateInterpolator();
        } else if (i24 == 4) {
            interpolatorLoadInterpolator = new BounceInterpolator();
        } else if (i24 == 5) {
            interpolatorLoadInterpolator = new OvershootInterpolator();
        } else {
            if (i24 != 6) {
                interpolator = null;
                new f0(q2Var, pVar, i21, i22, i23, interpolator, this.f36207p, this.f36208q);
            }
            interpolatorLoadInterpolator = new AnticipateInterpolator();
        }
        interpolator = interpolatorLoadInterpolator;
        new f0(q2Var, pVar, i21, i22, i23, interpolator, this.f36207p, this.f36208q);
    }

    public final boolean b(View view) {
        int i11 = this.f36209r;
        boolean z11 = i11 == -1 || view.getTag(i11) != null;
        int i12 = this.f36210s;
        return z11 && (i12 == -1 || view.getTag(i12) == null);
    }

    public final boolean c(View view) {
        String str;
        if (view == null) {
            return false;
        }
        if ((this.f36202j == -1 && this.f36203k == null) || !b(view)) {
            return false;
        }
        if (view.getId() == this.f36202j) {
            return true;
        }
        return this.f36203k != null && (view.getLayoutParams() instanceof ConstraintLayout.a) && (str = ((ConstraintLayout.a) view.getLayoutParams()).Y) != null && str.matches(this.f36203k);
    }

    public final void d(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), androidx.constraintlayout.widget.v.f2530y);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i11);
            if (index == 0) {
                this.f36193a = typedArrayObtainStyledAttributes.getResourceId(index, this.f36193a);
            } else if (index == 8) {
                if (MotionLayout.f2261u1) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f36202j);
                    this.f36202j = resourceId;
                    if (resourceId == -1) {
                        this.f36203k = typedArrayObtainStyledAttributes.getString(index);
                    }
                } else if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                    this.f36203k = typedArrayObtainStyledAttributes.getString(index);
                } else {
                    this.f36202j = typedArrayObtainStyledAttributes.getResourceId(index, this.f36202j);
                }
            } else if (index == 9) {
                this.f36194b = typedArrayObtainStyledAttributes.getInt(index, this.f36194b);
            } else if (index == 12) {
                this.f36195c = typedArrayObtainStyledAttributes.getBoolean(index, this.f36195c);
            } else if (index == 10) {
                this.f36196d = typedArrayObtainStyledAttributes.getInt(index, this.f36196d);
            } else if (index == 4) {
                this.f36200h = typedArrayObtainStyledAttributes.getInt(index, this.f36200h);
            } else if (index == 13) {
                this.f36201i = typedArrayObtainStyledAttributes.getInt(index, this.f36201i);
            } else if (index == 14) {
                this.f36197e = typedArrayObtainStyledAttributes.getInt(index, this.f36197e);
            } else if (index == 7) {
                int i12 = typedArrayObtainStyledAttributes.peekValue(index).type;
                if (i12 == 1) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    this.f36205n = resourceId2;
                    if (resourceId2 != -1) {
                        this.l = -2;
                    }
                } else if (i12 == 3) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f36204m = string;
                    if (string == null || string.indexOf(ExpiryDateInput.SEPARATOR) <= 0) {
                        this.l = -1;
                    } else {
                        this.f36205n = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        this.l = -2;
                    }
                } else {
                    this.l = typedArrayObtainStyledAttributes.getInteger(index, this.l);
                }
            } else if (index == 11) {
                this.f36207p = typedArrayObtainStyledAttributes.getResourceId(index, this.f36207p);
            } else if (index == 3) {
                this.f36208q = typedArrayObtainStyledAttributes.getResourceId(index, this.f36208q);
            } else if (index == 6) {
                this.f36209r = typedArrayObtainStyledAttributes.getResourceId(index, this.f36209r);
            } else if (index == 5) {
                this.f36210s = typedArrayObtainStyledAttributes.getResourceId(index, this.f36210s);
            } else if (index == 2) {
                this.f36212u = typedArrayObtainStyledAttributes.getResourceId(index, this.f36212u);
            } else if (index == 1) {
                this.f36211t = typedArrayObtainStyledAttributes.getInteger(index, this.f36211t);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final String toString() {
        return "ViewTransition(" + x0.v(this.f36206o, this.f36193a) + ")";
    }
}
