package com.google.android.material.bottomsheet;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import com.app.tgtg.R;
import java.util.ArrayList;
import k.y;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class l extends y {
    private g20.f backOrchestrator;
    private BottomSheetBehavior<FrameLayout> behavior;
    private FrameLayout bottomSheet;

    @NonNull
    private c bottomSheetCallback;
    boolean cancelable;
    private boolean canceledOnTouchOutside;
    private boolean canceledOnTouchOutsideSet;
    private FrameLayout container;
    private CoordinatorLayout coordinator;
    boolean dismissWithAnimation;
    private k edgeToEdgeCallback;
    private boolean edgeToEdgeEnabled;

    public l(Context context, int i11) {
        if (i11 == 0) {
            TypedValue typedValue = new TypedValue();
            i11 = context.getTheme().resolveAttribute(R.attr.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : R.style.Theme_Design_Light_BottomSheetDialog;
        }
        super(context, i11);
        this.cancelable = true;
        this.canceledOnTouchOutside = true;
        this.bottomSheetCallback = new j(this, 0);
        supportRequestWindowFeature(1);
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge});
        this.edgeToEdgeEnabled = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Deprecated
    public static void setLightStatusBar(@NonNull View view, boolean z11) {
        int systemUiVisibility = view.getSystemUiVisibility();
        view.setSystemUiVisibility(z11 ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
    }

    public final void c() {
        if (this.container == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, null);
            this.container = frameLayout;
            this.coordinator = (CoordinatorLayout) frameLayout.findViewById(R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.container.findViewById(R.id.design_bottom_sheet);
            this.bottomSheet = frameLayout2;
            BottomSheetBehavior<FrameLayout> bottomSheetBehaviorB = BottomSheetBehavior.B(frameLayout2);
            this.behavior = bottomSheetBehaviorB;
            c cVar = this.bottomSheetCallback;
            ArrayList arrayList = bottomSheetBehaviorB.t0;
            if (!arrayList.contains(cVar)) {
                arrayList.add(cVar);
            }
            this.behavior.H(this.cancelable);
            this.backOrchestrator = new g20.f(this.behavior, this.bottomSheet);
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        BottomSheetBehavior<FrameLayout> behavior = getBehavior();
        if (!this.dismissWithAnimation || behavior.N == 5) {
            super.cancel();
        } else {
            behavior.J(5);
        }
    }

    public final FrameLayout d(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        c();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.container.findViewById(R.id.coordinator);
        if (i11 != 0 && view == null) {
            view = getLayoutInflater().inflate(i11, (ViewGroup) coordinatorLayout, false);
        }
        if (this.edgeToEdgeEnabled) {
            ViewCompat.k0(this.container, new f(this));
        }
        this.bottomSheet.removeAllViews();
        FrameLayout frameLayout = this.bottomSheet;
        if (layoutParams == null) {
            frameLayout.addView(view);
        } else {
            frameLayout.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new g(this));
        ViewCompat.b0(this.bottomSheet, new h(this));
        this.bottomSheet.setOnTouchListener(new i(0));
        return this.container;
    }

    @NonNull
    public BottomSheetBehavior<FrameLayout> getBehavior() {
        if (this.behavior == null) {
            c();
        }
        return this.behavior;
    }

    public boolean getDismissWithAnimation() {
        return this.dismissWithAnimation;
    }

    public boolean getEdgeToEdgeEnabled() {
        return this.edgeToEdgeEnabled;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z11 = this.edgeToEdgeEnabled && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.container;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z11);
            }
            CoordinatorLayout coordinatorLayout = this.coordinator;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z11);
            }
            v0.n.G(window, !z11);
            k kVar = this.edgeToEdgeCallback;
            if (kVar != null) {
                kVar.e(window);
            }
        }
        g20.f fVar = this.backOrchestrator;
        if (fVar == null) {
            return;
        }
        if (this.cancelable) {
            fVar.a(false);
        } else {
            fVar.b();
        }
    }

    @Override // k.y, androidx.activity.o, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        k kVar = this.edgeToEdgeCallback;
        if (kVar != null) {
            kVar.e(null);
        }
        g20.f fVar = this.backOrchestrator;
        if (fVar != null) {
            fVar.b();
        }
    }

    @Override // androidx.activity.o, android.app.Dialog
    public void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.behavior;
        if (bottomSheetBehavior == null || bottomSheetBehavior.N != 5) {
            return;
        }
        bottomSheetBehavior.J(4);
    }

    public void removeDefaultCallback() {
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.behavior;
        bottomSheetBehavior.t0.remove(this.bottomSheetCallback);
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z11) {
        g20.f fVar;
        super.setCancelable(z11);
        if (this.cancelable != z11) {
            this.cancelable = z11;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.behavior;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.H(z11);
            }
            if (getWindow() == null || (fVar = this.backOrchestrator) == null) {
                return;
            }
            if (this.cancelable) {
                fVar.a(false);
            } else {
                fVar.b();
            }
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z11) {
        super.setCanceledOnTouchOutside(z11);
        if (z11 && !this.cancelable) {
            this.cancelable = true;
        }
        this.canceledOnTouchOutside = z11;
        this.canceledOnTouchOutsideSet = true;
    }

    @Override // k.y, androidx.activity.o, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(d(view, 0, null));
    }

    public void setDismissWithAnimation(boolean z11) {
        this.dismissWithAnimation = z11;
    }

    public boolean shouldWindowCloseOnTouchOutside() {
        if (!this.canceledOnTouchOutsideSet) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{android.R.attr.windowCloseOnTouchOutside});
            this.canceledOnTouchOutside = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
            this.canceledOnTouchOutsideSet = true;
        }
        return this.canceledOnTouchOutside;
    }

    @Override // k.y, androidx.activity.o, android.app.Dialog
    public void setContentView(int i11) {
        super.setContentView(d(null, i11, null));
    }

    @Override // k.y, androidx.activity.o, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(d(view, 0, layoutParams));
    }

    public l(Context context) {
        this(context, 0);
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge});
        this.edgeToEdgeEnabled = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
    }
}
