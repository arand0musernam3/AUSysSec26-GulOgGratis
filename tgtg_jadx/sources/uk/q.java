package uk;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ViewPropertyAnimator;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.m1;
import ax.s;
import bg.l0;
import com.adyen.checkout.ui.core.internal.ui.view.RoundCornerImageView;
import com.app.tgtg.R;
import com.app.tgtg.feature.locationpicker.LocationPickerActivity;
import com.app.tgtg.feature.locationpicker.LocationPickerOverlay;
import com.app.tgtg.model.remote.item.LatLngInfo;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import h20.u;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import mv.r0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pg.r1;
import pg.s1;
import qc.y;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class q extends ConstraintLayout {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f41347y = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public rt.f f41348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public st.a f41349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public t00.c f41350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final rt.a f41351d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f41352e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f41353f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public m f41354g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LocationPickerActivity f41355h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Bundle f41356i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f41357j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f41358k;
    public boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f41359m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f41360n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f41361o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f41362p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f41363q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f41364r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Rect f41365s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public BottomSheetBehavior f41366t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f41367u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Double f41368v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final LinkedHashMap f41369w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final s1 f41370x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        this.f41351d = new rt.a();
        Context context2 = getContext();
        context2.getClass();
        this.f41355h = (LocationPickerActivity) context2;
        this.f41362p = true;
        this.f41365s = new Rect();
        this.f41367u = true;
        this.f41369w = new LinkedHashMap();
        this.f41370x = s1.a(LayoutInflater.from(getContext()), this);
    }

    private final void getMapClusters() {
        st.a aVar = this.f41349b;
        x70.c cVar = null;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapAdapter");
            aVar = null;
        }
        xk.b bVarI = ((rt.d) aVar).i();
        LatLngInfo latLngInfo = bVarI.f44440a;
        LatLngInfo latLngInfo2 = bVarI.f44441b;
        LatLngInfo latLngInfo3 = new LatLngInfo(latLngInfo2.getLatitude(), latLngInfo.getLongitude());
        LatLngInfo latLngInfo4 = new LatLngInfo(latLngInfo.getLatitude(), latLngInfo2.getLongitude());
        c cVar2 = this.f41353f;
        if (cVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewFragment");
            cVar2 = null;
        }
        cVar2.getClass();
        r rVarQ = cVar2.q();
        rVarQ.getClass();
        f0.B(m1.d(rVarQ), null, null, new tg.g(latLngInfo3, latLngInfo4, rVarQ, cVar, 3), 3);
    }

    public static Unit j(q qVar) {
        qVar.getMapClusters();
        st.a aVar = qVar.f41349b;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapAdapter");
            aVar = null;
        }
        ((rt.d) aVar).j();
        qVar.f41367u = true;
        return Unit.f26487a;
    }

    public static String n(int i11) {
        return i11 + " " + (mv.d.A() ? "mi" : "km");
    }

    @NotNull
    public final xk.b getBounds() {
        st.a aVar = this.f41349b;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapAdapter");
            aVar = null;
        }
        return ((rt.d) aVar).i();
    }

    @NotNull
    public final Location getLocation() {
        st.a aVar = this.f41349b;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapAdapter");
            aVar = null;
        }
        return ((rt.d) aVar).g();
    }

    public final boolean getMarkedLocationBtnClickable() {
        return this.f41367u;
    }

    @Nullable
    public final Double getSelectedDistance() {
        return this.f41368v;
    }

    @Nullable
    public final BottomSheetBehavior<?> getSheetBehavior() {
        return this.f41366t;
    }

    public final float getZoomLevel() {
        st.a aVar = this.f41349b;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapAdapter");
            aVar = null;
        }
        return ((rt.d) aVar).j();
    }

    public final void k() {
        BottomSheetBehavior bottomSheetBehavior = this.f41366t;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.J(4);
        }
        c cVar = this.f41353f;
        q qVar = null;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewFragment");
            cVar = null;
        }
        String string = ((r1) this.f41370x.f35151e).f35126k.getText().toString();
        if (string != null) {
            cVar.getClass();
            if (string.length() == 0) {
                q qVar2 = cVar.f41322n;
                if (qVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("view");
                    qVar2 = null;
                }
                qVar2.q(false);
            }
        }
        q qVar3 = cVar.f41322n;
        if (qVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("view");
            qVar3 = null;
        }
        qVar3.p(false);
        q qVar4 = cVar.f41322n;
        if (qVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("view");
            qVar4 = null;
        }
        qVar4.t(true);
        q qVar5 = cVar.f41322n;
        if (qVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("view");
            qVar5 = null;
        }
        qVar5.o(true);
        q qVar6 = cVar.f41322n;
        if (qVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("view");
            qVar6 = null;
        }
        if (qVar6.f41360n) {
            t00.c cVar2 = qVar6.f41350c;
            if (cVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mapView");
                cVar2 = null;
            }
            cVar2.getOverlay().clear();
            qVar6.f41360n = false;
        }
        q qVar7 = cVar.f41322n;
        if (qVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("view");
            qVar7 = null;
        }
        ((r1) qVar7.f41370x.f35151e).f35126k.clearFocus();
        q qVar8 = cVar.f41322n;
        if (qVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("view");
        } else {
            qVar = qVar8;
        }
        ((r1) qVar.f41370x.f35151e).f35126k.getText().clear();
        u(true);
        t(true);
        o(true);
        p(false);
        s();
    }

    public final void l() {
        BottomSheetBehavior bottomSheetBehavior = this.f41366t;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.J(3);
        }
        p(true);
        c cVar = this.f41353f;
        q qVar = null;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewFragment");
            cVar = null;
        }
        m mVar = this.f41354g;
        int count = mVar != null ? mVar.getCount() : 0;
        s1 s1Var = this.f41370x;
        String string = ((r1) s1Var.f35151e).f35126k.getText().toString();
        cVar.getClass();
        if (string != null && count == 0 && string.length() == 0) {
            q qVar2 = cVar.f41322n;
            if (qVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("view");
                qVar2 = null;
            }
            qVar2.q(true);
            q qVar3 = cVar.f41322n;
            if (qVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("view");
                qVar3 = null;
            }
            qVar3.setHintForList(R.string.location_picker_hint_for_list);
        }
        q qVar4 = cVar.f41322n;
        if (qVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("view");
            qVar4 = null;
        }
        qVar4.t(false);
        q qVar5 = cVar.f41322n;
        if (qVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("view");
            qVar5 = null;
        }
        qVar5.o(false);
        q qVar6 = cVar.f41322n;
        if (qVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("view");
            qVar6 = null;
        }
        qVar6.p(true);
        q qVar7 = cVar.f41322n;
        if (qVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("view");
        } else {
            qVar = qVar7;
        }
        qVar.setDim();
        t(false);
        o(false);
        ((r1) s1Var.f35151e).l.setVisibility(4);
        if (this.f41359m) {
            u(false);
        }
    }

    public final void m() {
        s1 s1Var = this.f41370x;
        ((ImageView) s1Var.f35153g).animate().y(this.f41357j).start();
        ImageView imageView = (ImageView) s1Var.f35154h;
        imageView.animate().scaleX(1.0f).start();
        imageView.animate().scaleY(0.6f).start();
    }

    public final void o(boolean z11) {
        s1 s1Var = this.f41370x;
        if (z11) {
            ViewPropertyAnimator startDelay = ((r1) s1Var.f35151e).f35122g.animate().alpha(1.0f).setDuration(300L).setStartDelay(100L);
            c70.b bVar = new c70.b(null, null, 15);
            bVar.f7799c = new g(this, 5);
            startDelay.setListener(bVar).start();
            return;
        }
        ViewPropertyAnimator startDelay2 = ((r1) s1Var.f35151e).f35122g.animate().alpha(0.0f).setDuration(300L).setStartDelay(0L);
        c70.b bVar2 = new c70.b(null, null, 15);
        bVar2.f7799c = new g(this, 0);
        startDelay2.setListener(bVar2).start();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z11 = this.l;
        s1 s1Var = this.f41370x;
        if (z11 && this.f41352e) {
            ImageView imageView = (ImageView) s1Var.f35153g;
            ImageView imageView2 = (ImageView) s1Var.f35154h;
            imageView.setVisibility(0);
            imageView2.setVisibility(0);
            ((ImageView) s1Var.f35153g).animate().alpha(1.0f).setDuration(100L).start();
            imageView2.animate().alpha(1.0f).setDuration(100L).start();
            setupLocationButton();
            this.l = false;
        }
        if (motionEvent != null) {
            float y5 = motionEvent.getY();
            r1 r1Var = (r1) s1Var.f35151e;
            ImageView imageView3 = (ImageView) s1Var.f35154h;
            r1 r1Var2 = (r1) s1Var.f35151e;
            ImageView imageView4 = (ImageView) s1Var.f35153g;
            if (y5 < r1Var.f35117b.getY()) {
                r0.p(this.f41355h);
                m mVar = this.f41354g;
                if (mVar != null && mVar.getCount() != 0) {
                    mVar.clear();
                }
                r1Var2.f35126k.getText().clear();
                q(false);
            }
            if (this.f41357j == 0.0d) {
                float y6 = imageView4.getY();
                this.f41357j = y6;
                this.f41358k = y6 - 25;
            }
            if (imageView4.getY() > this.f41357j) {
                m();
            }
            if (motionEvent.getY() > r1Var2.f35117b.getY() && motionEvent.getAction() == 2) {
                m();
                return super.onInterceptTouchEvent(motionEvent);
            }
            if (motionEvent.getY() > r1Var2.f35117b.getY() || motionEvent.getY() < ((RelativeLayout) s1Var.f35155i).getBottom() || !(motionEvent.getAction() == 0 || motionEvent.getAction() == 2 || motionEvent.getAction() == 1)) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            if (this.f41365s.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1) {
                    m();
                } else if (action == 2) {
                    c cVar = this.f41353f;
                    if (cVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewFragment");
                        cVar = null;
                    }
                    cVar.t();
                }
            } else if (imageView4.getY() == this.f41357j) {
                imageView4.clearAnimation();
                imageView4.animate().y(this.f41358k).setDuration(200L).start();
                imageView3.animate().scaleX(1.5f).setDuration(200L).start();
                imageView3.animate().scaleY(1.1f).setDuration(200L).start();
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void p(boolean z11) {
        ((r1) this.f41370x.f35151e).f35118c.setVisibility(z11 ? 0 : 8);
    }

    public final void q(boolean z11) {
        ((r1) this.f41370x.f35151e).f35127m.setVisibility(z11 ? 0 : 8);
    }

    public final void r(boolean z11) {
        ((r1) this.f41370x.f35151e).f35123h.setVisibility(z11 ? 0 : 8);
    }

    public final void s() {
        ((r1) this.f41370x.f35151e).l.setVisibility(8);
    }

    public final void setDim() {
        if (this.f41360n) {
            return;
        }
        ColorDrawable colorDrawable = new ColorDrawable(RoundCornerImageView.DEFAULT_STROKE_COLOR);
        t00.c cVar = this.f41350c;
        t00.c cVar2 = null;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapView");
            cVar = null;
        }
        int width = cVar.getWidth();
        t00.c cVar3 = this.f41350c;
        if (cVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapView");
            cVar3 = null;
        }
        colorDrawable.setBounds(0, 0, width, cVar3.getHeight());
        colorDrawable.setAlpha(102);
        t00.c cVar4 = this.f41350c;
        if (cVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapView");
        } else {
            cVar2 = cVar4;
        }
        cVar2.getOverlay().add(colorDrawable);
        this.f41360n = true;
    }

    public final void setHintForList(int i11) {
        ((r1) this.f41370x.f35151e).f35127m.setText(i11);
    }

    public final void setMarkedLocationBtnClickable(boolean z11) {
        this.f41367u = z11;
    }

    public final void setSelectedDistance(@Nullable Double d3) {
        this.f41368v = d3;
    }

    public final void setSheetBehavior(@Nullable BottomSheetBehavior<?> bottomSheetBehavior) {
        this.f41366t = bottomSheetBehavior;
    }

    public final void setTextOnBtnUseMarkedLocation(int i11) {
        ((r1) this.f41370x.f35151e).f35119d.setText(getContext().getString(i11));
    }

    public final void setViewFragment(@NotNull c cVar) {
        cVar.getClass();
        this.f41353f = cVar;
    }

    public final void setupListeners() {
        boolean z11 = this.f41363q;
        s1 s1Var = this.f41370x;
        if (!z11) {
            ((r1) s1Var.f35151e).f35126k.addTextChangedListener(new fl.f(new g(this, 2), 3));
            r1 r1Var = (r1) s1Var.f35151e;
            r1Var.f35126k.addTextChangedListener(new pt.a(new bs.c(8, this, r1Var)));
            this.f41363q = true;
        }
        r1 r1Var2 = (r1) s1Var.f35151e;
        r1Var2.f35118c.setOnClickListener(new pt.c(new g(this, 3)));
        r1Var2.f35123h.setOnItemClickListener(new bg.n(this, 2));
        r1Var2.f35126k.setOnFocusChangeListener(new l0(1, this, r1Var2));
        r1Var2.f35128n.setOnClickListener(new pt.c(new g(this, 4)));
        ((ImageButton) s1Var.f35149c).setOnClickListener(new s(this, 26));
    }

    public final void setupLocationButton() {
        if (this.f41359m) {
            return;
        }
        s1 s1Var = this.f41370x;
        r1 r1Var = (r1) s1Var.f35151e;
        r1 r1Var2 = (r1) s1Var.f35151e;
        r1Var.f35119d.setVisibility(0);
        r1Var2.f35119d.getViewTreeObserver().addOnGlobalLayoutListener(new u(this, 5));
        this.f41359m = true;
        r1Var2.f35119d.setText(R.string.location_picker_user_selected_location);
        r0.p(this.f41355h);
        r1Var2.f35119d.setOnClickListener(new pt.c(new g(this, 1)));
    }

    public final void setupMap(@NotNull xk.a aVar) {
        aVar.getClass();
        LatLngInfo latLngInfo = aVar.f44436a;
        st.a aVar2 = null;
        if (latLngInfo == null || latLngInfo.getLatitude() == 0.0d || latLngInfo.getLongitude() == 0.0d) {
            st.a aVar3 = this.f41349b;
            if (aVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mapAdapter");
                aVar3 = null;
            }
            st.a.a(aVar3, aVar, 0.0f, 6);
        } else {
            String str = this.f41364r;
            if (str != null) {
                st.a aVar4 = this.f41349b;
                if (aVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mapAdapter");
                    aVar4 = null;
                }
                ((rt.d) aVar4).l(str);
            }
            if (this.f41368v == null) {
                this.f41368v = Double.valueOf(r0.k());
            }
            Double d3 = this.f41368v;
            d3.getClass();
            double dDoubleValue = d3.doubleValue() * ((double) 1000);
            st.a aVar5 = this.f41349b;
            if (aVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mapAdapter");
                aVar5 = null;
            }
            this.f41364r = ((rt.d) aVar5).b(new st.b(latLngInfo.getLatitude(), latLngInfo.getLongitude()), dDoubleValue, getContext().getColor(android.R.color.transparent));
            st.a aVar6 = this.f41349b;
            if (aVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mapAdapter");
                aVar6 = null;
            }
            String str2 = this.f41364r;
            str2.getClass();
            float fK = ((rt.d) aVar6).k(str2);
            st.a aVar7 = this.f41349b;
            if (aVar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mapAdapter");
                aVar7 = null;
            }
            st.a.a(aVar7, aVar, fK, 4);
        }
        st.a aVar8 = this.f41349b;
        if (aVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapAdapter");
            aVar8 = null;
        }
        ((rt.d) aVar8).n();
        st.a aVar9 = this.f41349b;
        if (aVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapAdapter");
            aVar9 = null;
        }
        ((rt.d) aVar9).x(true);
        st.a aVar10 = this.f41349b;
        if (aVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapAdapter");
            aVar10 = null;
        }
        ((rt.d) aVar10).u(true);
        st.a aVar11 = this.f41349b;
        if (aVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapAdapter");
            aVar11 = null;
        }
        try {
            u00.g gVar = (u00.g) ((rt.d) aVar11).f38233a.f33836b;
            Parcel parcelL = gVar.L();
            parcelL.writeFloat(20.0f);
            gVar.M(93, parcelL);
            st.a aVar12 = this.f41349b;
            if (aVar12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mapAdapter");
                aVar12 = null;
            }
            try {
                u00.g gVar2 = (u00.g) ((rt.d) aVar12).f38233a.f33836b;
                Parcel parcelL2 = gVar2.L();
                parcelL2.writeFloat(7.0f);
                gVar2.M(92, parcelL2);
                st.a aVar13 = this.f41349b;
                if (aVar13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mapAdapter");
                    aVar13 = null;
                }
                rt.d dVar = (rt.d) aVar13;
                dVar.f38233a.w(new rt.b(new i(this, 0), dVar));
                st.a aVar14 = this.f41349b;
                if (aVar14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mapAdapter");
                } else {
                    aVar2 = aVar14;
                }
                ((rt.d) aVar2).s(new i(this, 1));
            } catch (RemoteException e5) {
                y.l(e5);
            }
        } catch (RemoteException e11) {
            y.l(e11);
        }
    }

    public final void t(boolean z11) {
        s1 s1Var = this.f41370x;
        if (z11) {
            ((RelativeLayout) s1Var.f35155i).animate().alpha(1.0f).setDuration(300L).setStartDelay(100L).start();
        } else {
            ((RelativeLayout) s1Var.f35155i).animate().alpha(0.0f).setDuration(300L).setStartDelay(0L).start();
        }
    }

    public final void u(boolean z11) {
        s1 s1Var = this.f41370x;
        ((r1) s1Var.f35151e).f35119d.setVisibility(z11 ? 0 : 8);
        ((LocationPickerOverlay) s1Var.f35150d).setVisibility(z11 ? 0 : 8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(@NotNull Context context) {
        super(context);
        context.getClass();
        this.f41351d = new rt.a();
        Context context2 = getContext();
        context2.getClass();
        this.f41355h = (LocationPickerActivity) context2;
        this.f41362p = true;
        this.f41365s = new Rect();
        this.f41367u = true;
        this.f41369w = new LinkedHashMap();
        this.f41370x = s1.a(LayoutInflater.from(getContext()), this);
    }
}
