package dy;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.app.tgtg.R;
import com.facebook.login.widget.LoginButton;
import java.lang.ref.WeakReference;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n80.p;
import t1.b2;
import t1.o;
import t1.s;
import t1.v1;
import t1.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class j implements t1.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f15231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f15232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f15233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f15234d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f15235e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f15236f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f15237g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f15238h;

    public j(s sVar, v1 v1Var, Object obj, o oVar) {
        o oVar2;
        z zVar;
        b2 b2Var = new b2(sVar.f39564a);
        this.f15232b = b2Var;
        this.f15233c = v1Var;
        this.f15234d = obj;
        o oVar3 = (o) v1Var.f39591a.invoke(obj);
        this.f15235e = oVar3;
        this.f15236f = t1.c.e(oVar);
        Function1 function1 = v1Var.f39592b;
        if (b2Var.f39378d == null) {
            b2Var.f39378d = oVar3.c();
        }
        o oVar4 = b2Var.f39378d;
        o oVar5 = null;
        if (oVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("targetVector");
            oVar4 = null;
        }
        int iB = oVar4.b();
        int i11 = 0;
        while (true) {
            oVar2 = b2Var.f39378d;
            zVar = b2Var.f39375a;
            if (i11 >= iB) {
                break;
            }
            if (oVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("targetVector");
                oVar2 = null;
            }
            oVar2.e(zVar.l(oVar3.a(i11), oVar.a(i11)), i11);
            i11++;
        }
        if (oVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("targetVector");
            oVar2 = null;
        }
        this.f15238h = function1.invoke(oVar2);
        if (b2Var.f39377c == null) {
            b2Var.f39377c = oVar3.c();
        }
        o oVar6 = b2Var.f39377c;
        if (oVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
        } else {
            oVar5 = oVar6;
        }
        int iB2 = oVar5.b();
        long jMax = 0;
        for (int i12 = 0; i12 < iB2; i12++) {
            oVar3.getClass();
            jMax = Math.max(jMax, zVar.k(oVar.a(i12)));
        }
        this.f15231a = jMax;
        o oVarE = t1.c.e(((b2) this.f15232b).a(jMax, (o) this.f15235e, oVar));
        this.f15237g = oVarE;
        int iB3 = oVarE.b();
        for (int i13 = 0; i13 < iB3; i13++) {
            o oVar7 = (o) this.f15237g;
            float fA = oVar7.a(i13);
            float f11 = ((b2) this.f15232b).f39379e;
            oVar7.e(p.b(fA, -f11, f11), i13);
        }
    }

    @Override // t1.e
    public boolean a() {
        return false;
    }

    @Override // t1.e
    public long b() {
        return this.f15231a;
    }

    @Override // t1.e
    public v1 c() {
        return (v1) this.f15233c;
    }

    @Override // t1.e
    public o d(long j9) {
        return !e(j9) ? ((b2) this.f15232b).a(j9, (o) this.f15235e, (o) this.f15236f) : (o) this.f15237g;
    }

    @Override // t1.e
    public Object f(long j9) {
        o oVar;
        if (e(j9)) {
            return this.f15238h;
        }
        Function1 function1 = ((v1) this.f15233c).f39592b;
        b2 b2Var = (b2) this.f15232b;
        o oVar2 = (o) this.f15235e;
        o oVar3 = (o) this.f15236f;
        if (b2Var.f39376b == null) {
            b2Var.f39376b = oVar2.c();
        }
        o oVar4 = b2Var.f39376b;
        o oVar5 = null;
        if (oVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("valueVector");
            oVar4 = null;
        }
        int iB = oVar4.b();
        int i11 = 0;
        while (true) {
            oVar = b2Var.f39376b;
            if (i11 >= iB) {
                break;
            }
            if (oVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("valueVector");
                oVar = null;
            }
            oVar.e(b2Var.f39375a.f(oVar2.a(i11), oVar3.a(i11), j9), i11);
            i11++;
        }
        if (oVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("valueVector");
        } else {
            oVar5 = oVar;
        }
        return function1.invoke(oVar5);
    }

    @Override // t1.e
    public Object g() {
        return this.f15238h;
    }

    public void h() {
        if (yx.a.f46339a.contains(this)) {
            return;
        }
        try {
            j();
            PopupWindow popupWindow = (PopupWindow) this.f15236f;
            if (popupWindow != null) {
                popupWindow.dismiss();
            }
        } catch (Throwable th2) {
            yx.a.a(this, th2);
        }
    }

    public void i() {
        ViewTreeObserver viewTreeObserver;
        Context context = (Context) this.f15234d;
        WeakReference weakReference = (WeakReference) this.f15233c;
        Set set = yx.a.f46339a;
        if (set.contains(this)) {
            return;
        }
        try {
            if (weakReference.get() != null) {
                h hVar = new h(context);
                ImageView imageView = hVar.f15230d;
                ImageView imageView2 = hVar.f15227a;
                ImageView imageView3 = hVar.f15228b;
                this.f15235e = hVar;
                View viewFindViewById = hVar.findViewById(R.id.com_facebook_tooltip_bubble_view_text_body);
                viewFindViewById.getClass();
                ((TextView) viewFindViewById).setText((String) this.f15232b);
                i iVar = (i) this.f15237g;
                i iVar2 = i.BLUE;
                View view = hVar.f15229c;
                if (iVar == iVar2) {
                    view.setBackgroundResource(2131231057);
                    imageView3.setImageResource(2131231058);
                    imageView2.setImageResource(2131231059);
                    imageView.setImageResource(2131231060);
                } else {
                    view.setBackgroundResource(2131231053);
                    imageView3.setImageResource(2131231054);
                    imageView2.setImageResource(2131231055);
                    imageView.setImageResource(2131231056);
                }
                View decorView = ((Activity) context).getWindow().getDecorView();
                decorView.getClass();
                int width = decorView.getWidth();
                int height = decorView.getHeight();
                if (!set.contains(this)) {
                    try {
                        j();
                        View view2 = (View) weakReference.get();
                        if (view2 != null && (viewTreeObserver = view2.getViewTreeObserver()) != null) {
                            viewTreeObserver.addOnScrollChangedListener((g) this.f15238h);
                        }
                    } catch (Throwable th2) {
                        yx.a.a(this, th2);
                    }
                }
                hVar.measure(View.MeasureSpec.makeMeasureSpec(width, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(height, Integer.MIN_VALUE));
                PopupWindow popupWindow = new PopupWindow(hVar, hVar.getMeasuredWidth(), hVar.getMeasuredHeight());
                this.f15236f = popupWindow;
                popupWindow.showAsDropDown((View) weakReference.get());
                if (!yx.a.f46339a.contains(this)) {
                    try {
                        PopupWindow popupWindow2 = (PopupWindow) this.f15236f;
                        if (popupWindow2 != null && popupWindow2.isShowing()) {
                            boolean zIsAboveAnchor = popupWindow2.isAboveAnchor();
                            h hVar2 = (h) this.f15235e;
                            if (zIsAboveAnchor) {
                                if (hVar2 != null) {
                                    hVar2.f15227a.setVisibility(4);
                                    hVar2.f15228b.setVisibility(0);
                                }
                            } else if (hVar2 != null) {
                                hVar2.f15227a.setVisibility(0);
                                hVar2.f15228b.setVisibility(4);
                            }
                        }
                    } catch (Throwable th3) {
                        yx.a.a(this, th3);
                    }
                }
                long j9 = this.f15231a;
                if (j9 > 0) {
                    hVar.postDelayed(new d1.e(this, 6), j9);
                }
                popupWindow.setTouchable(true);
                hVar.setOnClickListener(new ax.s(this, 16));
            }
        } catch (Throwable th4) {
            yx.a.a(this, th4);
        }
    }

    public void j() {
        ViewTreeObserver viewTreeObserver;
        if (yx.a.f46339a.contains(this)) {
            return;
        }
        try {
            View view = (View) ((WeakReference) this.f15233c).get();
            if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null) {
                return;
            }
            viewTreeObserver.removeOnScrollChangedListener((g) this.f15238h);
        } catch (Throwable th2) {
            yx.a.a(this, th2);
        }
    }

    public j(String str, LoginButton loginButton) {
        str.getClass();
        this.f15232b = str;
        this.f15233c = new WeakReference(loginButton);
        Context context = loginButton.getContext();
        context.getClass();
        this.f15234d = context;
        this.f15237g = i.BLUE;
        this.f15231a = 6000L;
        this.f15238h = new g(this, 0);
    }
}
