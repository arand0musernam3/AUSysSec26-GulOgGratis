package uk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.z;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.o0;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.n1;
import ax.s;
import b0.a0;
import b5.r1;
import bg.n0;
import com.app.tgtg.R;
import com.app.tgtg.feature.locationpicker.LocationPickerActivity;
import com.app.tgtg.feature.locationpicker.LocationPickerOverlay;
import com.app.tgtg.model.local.AppConstants;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.slider.Slider;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import pg.s1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Luk/c;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLocationPickerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocationPickerFragment.kt\ncom/app/tgtg/feature/locationpicker/LocationPickerFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,352:1\n106#2,15:353\n13243#3,2:368\n1#4:370\n*S KotlinDebug\n*F\n+ 1 LocationPickerFragment.kt\ncom/app/tgtg/feature/locationpicker/LocationPickerFragment\n*L\n32#1:353,15\n160#1:368,2\n*E\n"})
public final class c extends Fragment implements r70.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p70.k f41310a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile p70.g f41312c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n1 f41315f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ft.j f41316g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ky.p f41317h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f41318i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f41319j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f41320k;
    public boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f41321m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public q f41322n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final al.i f41323o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f41311b = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f41313d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f41314e = false;

    public c() {
        u70.j jVarA = u70.l.a(u70.m.NONE, new ky.i(new ky.i(this, 15), 16));
        this.f41315f = new n1(Reflection.getOrCreateKotlinClass(r.class), new bl.c(jVarA, 22), new r1(14, this, jVarA), new bl.c(jVarA, 23));
        this.f41321m = "";
        this.f41323o = new al.i(this, 5);
    }

    @Override // r70.b
    public final Object a() {
        if (this.f41312c == null) {
            synchronized (this.f41313d) {
                try {
                    if (this.f41312c == null) {
                        this.f41312c = new p70.g(this);
                    }
                } finally {
                }
            }
        }
        return this.f41312c.a();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f41311b) {
            return null;
        }
        r();
        return this.f41310a;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.p
    public final ViewModelProvider$Factory getDefaultViewModelProviderFactory() {
        return zz.f.s(this, super.getDefaultViewModelProviderFactory());
    }

    public final ft.j o() {
        ft.j jVar = this.f41316g;
        if (jVar != null) {
            return jVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("locationManager");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        if (i11 == 222 && i12 == -1) {
            v();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        p70.k kVar = this.f41310a;
        ox.h.q(kVar == null || p70.g.d(kVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        r();
        s();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        o0 o0VarRequireActivity = requireActivity();
        o0VarRequireActivity.getClass();
        q qVar = new q(o0VarRequireActivity);
        qVar.f41356i = bundle;
        this.f41322n = qVar;
        qVar.setViewFragment(this);
        final q qVar2 = this.f41322n;
        if (qVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("view");
            qVar2 = null;
        }
        q().getClass();
        double dA = r.a();
        rt.a aVar = qVar2.f41351d;
        Context context = qVar2.getContext();
        context.getClass();
        aVar.getClass();
        rt.f fVar = new rt.f(context);
        qVar2.f41348a = fVar;
        t00.c cVar = fVar.f38239a;
        qVar2.f41350c = cVar;
        s1 s1Var = qVar2.f41370x;
        FrameLayout frameLayout = (FrameLayout) s1Var.f35152f;
        LocationPickerOverlay locationPickerOverlay = (LocationPickerOverlay) s1Var.f35150d;
        pg.r1 r1Var = (pg.r1) s1Var.f35151e;
        Slider slider = r1Var.f35121f;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapView");
            cVar = null;
        }
        frameLayout.addView(cVar);
        int i11 = 1;
        qVar2.l = true;
        qVar2.f41366t = BottomSheetBehavior.B(r1Var.f35117b);
        r1Var.f35119d.getViewTreeObserver().addOnGlobalLayoutListener(new h(0, qVar2));
        new Handler().postDelayed(new m0.l(qVar2, 26), 700L);
        t00.c cVar2 = qVar2.f41350c;
        if (cVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapView");
            cVar2 = null;
        }
        cVar2.setVisibility(0);
        t00.c cVar3 = qVar2.f41350c;
        if (cVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapView");
            cVar3 = null;
        }
        cVar3.getViewTreeObserver().addOnGlobalLayoutListener(new h(i11, qVar2));
        int i12 = 2;
        qVar2.getRootView().getViewTreeObserver().addOnGlobalLayoutListener(new h(i12, qVar2));
        Bundle bundle2 = qVar2.f41356i;
        rt.f fVar2 = qVar2.f41348a;
        if (fVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapViewAdapter");
            fVar2 = null;
        }
        fVar2.b(bundle2);
        rt.f fVar3 = qVar2.f41348a;
        if (fVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapViewAdapter");
            fVar3 = null;
        }
        fVar3.a(new sg.c(qVar2, 8));
        EditText editText = r1Var.f35126k;
        editText.setCompoundDrawablesWithIntrinsicBounds(a0.x(qVar2.getContext(), R.drawable.system_icon_search_neutral_60), (Drawable) null, (Drawable) null, (Drawable) null);
        editText.setPadding(editText.getPaddingLeft(), editText.getPaddingTop(), d70.b.a(30), editText.getPaddingBottom());
        editText.setGravity(17);
        BottomSheetBehavior bottomSheetBehavior = qVar2.f41366t;
        if (bottomSheetBehavior != null) {
            com.google.android.material.bottomsheet.j jVar = new com.google.android.material.bottomsheet.j(qVar2, i12);
            Log.w("BottomSheetBehavior", "BottomSheetBehavior now supports multiple callbacks. `setBottomSheetCallback()` removes all existing callbacks, including ones set internally by library authors, which may result in unintended behavior. This may change in the future. Please use `addBottomSheetCallback()` and `removeBottomSheetCallback()` instead to set your own callbacks.");
            ArrayList arrayList = bottomSheetBehavior.t0;
            arrayList.clear();
            arrayList.add(jVar);
        }
        BottomSheetBehavior bottomSheetBehavior2 = qVar2.f41366t;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.J(4);
        }
        locationPickerOverlay.setRadius(((double) 1000) * dA);
        p30.b.E(locationPickerOverlay, true);
        qVar2.f41368v = Double.valueOf(dA);
        int iA = j80.c.a(mv.d.A() ? Math.min(dA * 0.621371d, xk.d.MAX.a()) : Math.min(dA, xk.c.MAX.a()));
        boolean zA = mv.d.A();
        TextView textView = r1Var.f35120e;
        if (zA) {
            textView.setText(q.n(iA));
            slider.setValue(iA);
            slider.setValueFrom((float) xk.d.MIN.a());
            slider.setValueTo((float) xk.d.MAX.a());
            slider.setStepSize((float) xk.d.STEP.a());
        } else {
            textView.setText(q.n(iA));
            slider.setValue(iA);
            slider.setValueFrom((float) xk.c.MIN.a());
            slider.setValueTo((float) xk.c.MAX.a());
            slider.setStepSize((float) xk.c.STEP.a());
        }
        slider.f34171n.add(new p(qVar2, 0));
        slider.f34169m.add(new p20.a() { // from class: uk.j
            @Override // p20.a
            public final void a(p20.e eVar, float f11) {
                int i13 = q.f41347y;
                ((pg.r1) qVar2.f41370x.f35151e).f35120e.setText(q.n((int) f11));
            }
        });
        r1Var.f35124i.setMovementMethod(LinkMovementMethod.getInstance());
        q qVar3 = this.f41322n;
        if (qVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("view");
            qVar3 = null;
        }
        q().getClass();
        boolean zIsValid = ft.c.z().isValid();
        s1 s1Var2 = qVar3.f41370x;
        if (zIsValid) {
            p30.b.E((ImageButton) s1Var2.f35149c, true);
            ((ImageButton) s1Var2.f35149c).setClickable(true);
        } else {
            ((ImageButton) s1Var2.f35149c).setVisibility(8);
            ((ImageButton) s1Var2.f35149c).setClickable(false);
        }
        q qVar4 = this.f41322n;
        if (qVar4 != null) {
            return qVar4;
        }
        Intrinsics.throwUninitializedPropertyAccessException("view");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        q qVar = this.f41322n;
        rt.f fVar = null;
        if (qVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("view");
            qVar = null;
        }
        rt.f fVar2 = qVar.f41348a;
        if (fVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapViewAdapter");
        } else {
            fVar = fVar2;
        }
        fVar.c();
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new p70.k(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onLowMemory() {
        super.onLowMemory();
        q qVar = this.f41322n;
        rt.f fVar = null;
        if (qVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("view");
            qVar = null;
        }
        rt.f fVar2 = qVar.f41348a;
        if (fVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapViewAdapter");
        } else {
            fVar = fVar2;
        }
        fVar.d();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        q qVar = this.f41322n;
        rt.f fVar = null;
        if (qVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("view");
            qVar = null;
        }
        rt.f fVar2 = qVar.f41348a;
        if (fVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapViewAdapter");
        } else {
            fVar = fVar2;
        }
        fVar.e();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        super.onRequestPermissionsResult(i11, strArr, iArr);
        for (int i12 : iArr) {
            if (i12 == 0) {
                if (o().i()) {
                    v();
                    return;
                }
                ft.j jVarO = o();
                o0 o0VarRequireActivity = requireActivity();
                o0VarRequireActivity.getClass();
                jVarO.c(o0VarRequireActivity);
                return;
            }
        }
        q().getClass();
        if (!ft.c.m()) {
            q().getClass();
            ft.c.Q();
            return;
        }
        q qVar = this.f41322n;
        if (qVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("view");
            qVar = null;
        }
        LocationPickerActivity locationPickerActivity = qVar.f41355h;
        View viewInflate = View.inflate(locationPickerActivity, R.layout.alert_dialog_gps_promt_to_settings, null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tvTitle);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.tvContent);
        Button button = (Button) viewInflate.findViewById(R.id.btnPositive);
        Button button2 = (Button) viewInflate.findViewById(R.id.btnNegative);
        z zVar = new z(locationPickerActivity);
        ((k.c) zVar.f2543c).f25529m = viewInflate;
        k.f fVarG = zVar.g();
        Window window = fVarG.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        textView.setText(qVar.getContext().getString(R.string.location_picker_alert_box_permission_title));
        textView2.setText(qVar.getContext().getString(R.string.location_picker_alert_box_permission_description));
        button.setOnClickListener(new n0(19, qVar, fVarG));
        button2.setOnClickListener(new s(fVarG, 25));
        fVarG.show();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        q qVar = this.f41322n;
        rt.f fVar = null;
        if (qVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("view");
            qVar = null;
        }
        rt.f fVar2 = qVar.f41348a;
        if (fVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapViewAdapter");
        } else {
            fVar = fVar2;
        }
        fVar.f();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        q qVar = this.f41322n;
        rt.f fVar = null;
        if (qVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("view");
            qVar = null;
        }
        qVar.getClass();
        bundle.getClass();
        rt.f fVar2 = qVar.f41348a;
        if (fVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapViewAdapter");
        } else {
            fVar = fVar2;
        }
        fVar.g(bundle);
        super.onSaveInstanceState(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        q qVar = this.f41322n;
        rt.f fVar = null;
        if (qVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("view");
            qVar = null;
        }
        rt.f fVar2 = qVar.f41348a;
        if (fVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapViewAdapter");
        } else {
            fVar = fVar2;
        }
        fVar.h();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        q qVar = this.f41322n;
        rt.f fVar = null;
        if (qVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("view");
            qVar = null;
        }
        rt.f fVar2 = qVar.f41348a;
        if (fVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapViewAdapter");
        } else {
            fVar = fVar2;
        }
        fVar.i();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        r rVarQ = q();
        cv.b bVar = rVarQ.f41374d;
        cv.i iVar = cv.i.SCREEN_LOCATIONPICKER;
        dv.a aVar = dv.a.SOURCE;
        f70.i iVar2 = (f70.i) rVarQ.f41375e.a("ORIGIN");
        String strA = iVar2 != null ? zz.f.y(iVar2).a() : null;
        if (strA == null) {
            strA = "";
        }
        bVar.d(iVar, aVar, strA);
        this.f41318i = ((f70.i) q().f41375e.a("ORIGIN")) == f70.i.ONBOARDING;
        q().f41383n = requireActivity().getResources().getDisplayMetrics().widthPixels;
        q().f41384o = requireActivity().getResources().getDisplayMetrics().heightPixels;
        r rVarQ2 = q();
        rVarQ2.f41379i.e(getViewLifecycleOwner(), new dk.b(new b(this, 0), 8));
        rVarQ2.f41381k.e(getViewLifecycleOwner(), new dk.b(new b(this, 1), 8));
    }

    public final ky.p p() {
        ky.p pVar = this.f41317h;
        if (pVar != null) {
            return pVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("locationPickerNavigation");
        return null;
    }

    public final r q() {
        return (r) this.f41315f.getValue();
    }

    public final void r() {
        if (this.f41310a == null) {
            this.f41310a = new p70.k(super.getContext(), this);
            this.f41311b = b0.z.v(super.getContext());
        }
    }

    public final void s() {
        if (this.f41314e) {
            return;
        }
        this.f41314e = true;
        ag.i iVar = ((ag.e) ((d) a())).f1298a;
        this.f41316g = (ft.j) iVar.f1352w.get();
        this.f41317h = new ky.p(22);
    }

    public final void t() {
        this.f41319j = true;
        this.f41320k = false;
        q qVar = this.f41322n;
        q qVar2 = null;
        if (qVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("view");
            qVar = null;
        }
        qVar.setTextOnBtnUseMarkedLocation(R.string.location_picker_user_selected_location);
        q qVar3 = this.f41322n;
        if (qVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("view");
        } else {
            qVar2 = qVar3;
        }
        qVar2.k();
    }

    public final void u() {
        q qVar = this.f41322n;
        q qVar2 = null;
        if (qVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("view");
            qVar = null;
        }
        qVar.setHintForList(R.string.location_picker_hint_for_list);
        q qVar3 = this.f41322n;
        if (qVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("view");
        } else {
            qVar2 = qVar3;
        }
        qVar2.q(true);
        this.l = false;
    }

    public final void v() {
        q().getClass();
        ft.c.g0(AppConstants.LOCATION_PICKER_YOUR_LOCATION);
        q qVar = this.f41322n;
        if (qVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("view");
            qVar = null;
        }
        if (qVar.getSelectedDistance() != null) {
            r rVarQ = q();
            q qVar2 = this.f41322n;
            if (qVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("view");
                qVar2 = null;
            }
            Double selectedDistance = qVar2.getSelectedDistance();
            selectedDistance.getClass();
            double dDoubleValue = selectedDistance.doubleValue();
            rVarQ.getClass();
            ft.e.f17923d.f17906b = selectedDistance;
            SharedPreferences.Editor editorEdit = ft.c.x().edit();
            String strY = ft.c.y();
            editorEdit.putLong(r8.k.l(strY != null ? strY : null, "_customSelectedRadiusLong"), Double.doubleToRawLongBits(dDoubleValue));
            editorEdit.apply();
        }
        q().b(true, this.f41320k);
        if (!this.f41318i) {
            ky.p pVarP = p();
            o0 o0VarRequireActivity = requireActivity();
            o0VarRequireActivity.getClass();
            pVarP.getClass();
            ky.p.o(o0VarRequireActivity);
            return;
        }
        ky.p pVarP2 = p();
        o0 o0VarRequireActivity2 = requireActivity();
        o0VarRequireActivity2.getClass();
        pVarP2.getClass();
        mv.a0 a0Var = new mv.a0();
        mv.z zVar = mv.z.DISCOVER;
        zVar.getClass();
        a0Var.f30138a = zVar;
        a0Var.f30144g = true;
        a0Var.c(o0VarRequireActivity2);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        r();
        s();
    }
}
