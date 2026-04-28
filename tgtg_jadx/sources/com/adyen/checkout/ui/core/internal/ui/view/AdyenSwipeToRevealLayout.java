package com.adyen.checkout.ui.core.internal.ui.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.ViewCompat;
import com.adyen.checkout.core.exception.CheckoutException;
import com.adyen.checkout.ui.core.internal.ui.view.AdyenSwipeToRevealLayout;
import com.braze.Constants;
import h7.m;
import h7.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\b\u0006*\u0002JM\u0018\u00002\u00020\u0001:\u0002PQB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\fJ\u001f\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J7\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\nH\u0014¢\u0006\u0004\b\u001e\u0010\fJ\u000f\u0010\u001f\u001a\u00020\nH\u0014¢\u0006\u0004\b\u001f\u0010\fJ\u0017\u0010 \u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\rH\u0017¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\rH\u0016¢\u0006\u0004\b#\u0010!J\u000f\u0010$\u001a\u00020\nH\u0016¢\u0006\u0004\b$\u0010\fJ\u0015\u0010&\u001a\u00020\n2\u0006\u0010%\u001a\u00020\u0016¢\u0006\u0004\b&\u0010'J\u0015\u0010*\u001a\u00020\n2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\n¢\u0006\u0004\b,\u0010\fJ\u0017\u0010/\u001a\u00020\n2\b\u0010.\u001a\u0004\u0018\u00010-¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\n¢\u0006\u0004\b1\u0010\fR\u0016\u00103\u001a\u0002028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b5\u00104R\u0016\u00106\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010%\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010;\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010:R\u0014\u0010<\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010:R\u0014\u0010=\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010:R\u0016\u0010?\u001a\u00020>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010A\u001a\u00020>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010@R\u0016\u0010C\u001a\u00020B8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010F\u001a\u00020E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010HR\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010IR\u0014\u0010K\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010N\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010O¨\u0006R"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/view/AdyenSwipeToRevealLayout;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "fixElevationOverlay", "()V", "Landroid/view/MotionEvent;", "event", "calculateDragDistance", "(Landroid/view/MotionEvent;)V", "expandUnderlay", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "", "changed", "l", Constants.BRAZE_PUSH_TITLE_KEY, "r", "b", "onLayout", "(ZIIII)V", "onFinishInflate", "onAttachedToWindow", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "ev", "onInterceptTouchEvent", "computeScroll", "isDragLocked", "setDragLocked", "(Z)V", "Lcom/adyen/checkout/ui/core/internal/ui/view/AdyenSwipeToRevealLayout$UnderlayListener;", "underlayListener", "setUnderlayListener", "(Lcom/adyen/checkout/ui/core/internal/ui/view/AdyenSwipeToRevealLayout$UnderlayListener;)V", "removeUnderlayListener", "Lcom/adyen/checkout/ui/core/internal/ui/view/AdyenSwipeToRevealLayout$OnMainClickListener;", "onMainClickListener", "setOnMainClickListener", "(Lcom/adyen/checkout/ui/core/internal/ui/view/AdyenSwipeToRevealLayout$OnMainClickListener;)V", "collapseUnderlay", "Landroid/view/View;", "underlayView", "Landroid/view/View;", "mainView", "isDragging", "Z", "Landroid/graphics/Rect;", "rectMainDragged", "Landroid/graphics/Rect;", "rectMainNotDragged", "rectUnderlayDragged", "rectUnderlayNotDragged", "", "dragDistance", "F", "previousX", "Lz7/e;", "dragHelper", "Lz7/e;", "Lh7/m;", "gestureDetector", "Lh7/m;", "Lcom/adyen/checkout/ui/core/internal/ui/view/AdyenSwipeToRevealLayout$UnderlayListener;", "Lcom/adyen/checkout/ui/core/internal/ui/view/AdyenSwipeToRevealLayout$OnMainClickListener;", "com/adyen/checkout/ui/core/internal/ui/view/AdyenSwipeToRevealLayout$viewDragHelperCallback$1", "viewDragHelperCallback", "Lcom/adyen/checkout/ui/core/internal/ui/view/AdyenSwipeToRevealLayout$viewDragHelperCallback$1;", "com/adyen/checkout/ui/core/internal/ui/view/AdyenSwipeToRevealLayout$gestureListener$1", "gestureListener", "Lcom/adyen/checkout/ui/core/internal/ui/view/AdyenSwipeToRevealLayout$gestureListener$1;", "OnMainClickListener", "UnderlayListener", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAdyenSwipeToRevealLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdyenSwipeToRevealLayout.kt\ncom/adyen/checkout/ui/core/internal/ui/view/AdyenSwipeToRevealLayout\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,478:1\n1317#2,2:479\n1317#2,2:481\n1317#2,2:483\n*S KotlinDebug\n*F\n+ 1 AdyenSwipeToRevealLayout.kt\ncom/adyen/checkout/ui/core/internal/ui/view/AdyenSwipeToRevealLayout\n*L\n243#1:479,2\n255#1:481,2\n292#1:483,2\n*E\n"})
public final class AdyenSwipeToRevealLayout extends ViewGroup {
    private float dragDistance;
    private z7.e dragHelper;

    @NotNull
    private m gestureDetector;

    @NotNull
    private final AdyenSwipeToRevealLayout$gestureListener$1 gestureListener;
    private volatile boolean isDragLocked;
    private volatile boolean isDragging;
    private View mainView;

    @Nullable
    private OnMainClickListener onMainClickListener;
    private float previousX;

    @NotNull
    private final Rect rectMainDragged;

    @NotNull
    private final Rect rectMainNotDragged;

    @NotNull
    private final Rect rectUnderlayDragged;

    @NotNull
    private final Rect rectUnderlayNotDragged;

    @Nullable
    private UnderlayListener underlayListener;
    private View underlayView;

    @NotNull
    private final AdyenSwipeToRevealLayout$viewDragHelperCallback$1 viewDragHelperCallback;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/view/AdyenSwipeToRevealLayout$OnMainClickListener;", "", "onClick", "", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface OnMainClickListener {
        void onClick();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/view/AdyenSwipeToRevealLayout$UnderlayListener;", "", "onUnderlayExpanded", "", "view", "Lcom/adyen/checkout/ui/core/internal/ui/view/AdyenSwipeToRevealLayout;", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface UnderlayListener {
        void onUnderlayExpanded(@NotNull AdyenSwipeToRevealLayout view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r4v6, types: [com.adyen.checkout.ui.core.internal.ui.view.AdyenSwipeToRevealLayout$viewDragHelperCallback$1, z7.d] */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.adyen.checkout.ui.core.internal.ui.view.AdyenSwipeToRevealLayout$gestureListener$1] */
    public AdyenSwipeToRevealLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        context.getClass();
        this.rectMainDragged = new Rect();
        this.rectMainNotDragged = new Rect();
        this.rectUnderlayDragged = new Rect();
        this.rectUnderlayNotDragged = new Rect();
        this.previousX = -1.0f;
        ?? r42 = new z7.d() { // from class: com.adyen.checkout.ui.core.internal.ui.view.AdyenSwipeToRevealLayout$viewDragHelperCallback$1
            @Override // z7.d
            public int clampViewPositionHorizontal(@NotNull View child, int left, int dx2) {
                child.getClass();
                int iMin = Math.min(left, this.this$0.rectMainNotDragged.left);
                int i12 = this.this$0.rectMainNotDragged.left;
                View view = this.this$0.underlayView;
                if (view == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("underlayView");
                    view = null;
                }
                return Math.max(iMin, i12 - view.getWidth());
            }

            @Override // z7.d
            public void onEdgeDragStarted(int edgeFlags, int pointerId) {
                if (!this.this$0.isDragLocked && edgeFlags == 1) {
                    z7.e eVar = this.this$0.dragHelper;
                    View view = null;
                    if (eVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("dragHelper");
                        eVar = null;
                    }
                    View view2 = this.this$0.mainView;
                    if (view2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mainView");
                    } else {
                        view = view2;
                    }
                    eVar.b(pointerId, view);
                }
            }

            @Override // z7.d
            public void onViewPositionChanged(@NotNull View changedView, int left, int top, int dx2, int dy2) {
                changedView.getClass();
                ViewCompat.T(this.this$0);
            }

            @Override // z7.d
            public void onViewReleased(@NotNull View releasedChild, float xvel, float yvel) {
                releasedChild.getClass();
                int i12 = this.this$0.rectMainNotDragged.right;
                View view = this.this$0.underlayView;
                View view2 = null;
                if (view == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("underlayView");
                    view = null;
                }
                int width = i12 - (view.getWidth() / 2);
                View view3 = this.this$0.mainView;
                if (view3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mainView");
                } else {
                    view2 = view3;
                }
                int right = view2.getRight();
                AdyenSwipeToRevealLayout adyenSwipeToRevealLayout = this.this$0;
                if (right < width) {
                    adyenSwipeToRevealLayout.expandUnderlay();
                } else {
                    adyenSwipeToRevealLayout.collapseUnderlay();
                }
            }

            @Override // z7.d
            public boolean tryCaptureView(@NotNull View child, int pointerId) {
                child.getClass();
                if (this.this$0.isDragLocked) {
                    return false;
                }
                View view = this.this$0.mainView;
                z7.e eVar = null;
                if (view == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mainView");
                    view = null;
                }
                if (!Intrinsics.areEqual(child, view)) {
                    return false;
                }
                z7.e eVar2 = this.this$0.dragHelper;
                if (eVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dragHelper");
                } else {
                    eVar = eVar2;
                }
                eVar.b(pointerId, child);
                return true;
            }
        };
        this.viewDragHelperCallback = r42;
        ?? r52 = new GestureDetector.SimpleOnGestureListener() { // from class: com.adyen.checkout.ui.core.internal.ui.view.AdyenSwipeToRevealLayout$gestureListener$1
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onDown(@NotNull MotionEvent e5) {
                e5.getClass();
                this.this$0.isDragging = false;
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onFling(@Nullable MotionEvent e12, @NotNull MotionEvent e22, float velocityX, float velocityY) {
                e22.getClass();
                this.this$0.isDragging = true;
                return false;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public void onLongPress(@NotNull MotionEvent e5) {
                e5.getClass();
                View view = this.this$0.mainView;
                View view2 = null;
                if (view == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mainView");
                    view = null;
                }
                boolean z11 = false;
                boolean z12 = view.getRight() == this.this$0.rectMainNotDragged.right;
                float x11 = e5.getX();
                View view3 = this.this$0.mainView;
                if (view3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mainView");
                    view3 = null;
                }
                if (x11 >= view3.getLeft()) {
                    float x12 = e5.getX();
                    View view4 = this.this$0.mainView;
                    if (view4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mainView");
                        view4 = null;
                    }
                    if (x12 <= view4.getRight()) {
                        float y5 = e5.getY();
                        View view5 = this.this$0.mainView;
                        if (view5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mainView");
                            view5 = null;
                        }
                        if (y5 >= view5.getTop()) {
                            float y6 = e5.getY();
                            View view6 = this.this$0.mainView;
                            if (view6 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mainView");
                            } else {
                                view2 = view6;
                            }
                            if (y6 <= view2.getBottom()) {
                                z11 = true;
                            }
                        }
                    }
                }
                if (z12 && z11 && !this.this$0.isDragLocked) {
                    this.this$0.expandUnderlay();
                }
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onScroll(@Nullable MotionEvent e12, @NotNull MotionEvent e22, float distanceX, float distanceY) {
                e22.getClass();
                this.this$0.isDragging = true;
                if (this.this$0.getParent() == null) {
                    return false;
                }
                this.this$0.getParent().requestDisallowInterceptTouchEvent(true);
                return false;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onSingleTapConfirmed(@NotNull MotionEvent e5) {
                e5.getClass();
                View view = this.this$0.mainView;
                View view2 = null;
                if (view == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mainView");
                    view = null;
                }
                boolean z11 = view.getRight() == this.this$0.rectMainNotDragged.right;
                float x11 = e5.getX();
                View view3 = this.this$0.mainView;
                if (view3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mainView");
                    view3 = null;
                }
                if (x11 >= view3.getLeft()) {
                    float x12 = e5.getX();
                    View view4 = this.this$0.mainView;
                    if (view4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mainView");
                        view4 = null;
                    }
                    if (x12 <= view4.getRight()) {
                        float y5 = e5.getY();
                        View view5 = this.this$0.mainView;
                        if (view5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mainView");
                            view5 = null;
                        }
                        if (y5 >= view5.getTop()) {
                            float y6 = e5.getY();
                            View view6 = this.this$0.mainView;
                            if (view6 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mainView");
                            } else {
                                view2 = view6;
                            }
                            if (y6 <= view2.getBottom()) {
                                AdyenSwipeToRevealLayout adyenSwipeToRevealLayout = this.this$0;
                                if (z11) {
                                    AdyenSwipeToRevealLayout.OnMainClickListener onMainClickListener = adyenSwipeToRevealLayout.onMainClickListener;
                                    if (onMainClickListener != null) {
                                        onMainClickListener.onClick();
                                    }
                                } else {
                                    adyenSwipeToRevealLayout.collapseUnderlay();
                                }
                                return true;
                            }
                        }
                    }
                }
                return super.onSingleTapConfirmed(e5);
            }
        };
        this.gestureListener = r52;
        z7.e eVar = new z7.e(getContext(), this, r42);
        eVar.f47325b = (int) (1.0f * eVar.f47325b);
        this.dragHelper = eVar;
        eVar.f47339q = 15;
        this.gestureDetector = new m(context, r52);
    }

    private final void calculateDragDistance(MotionEvent event) {
        if (event.getAction() == 0) {
            this.dragDistance = 0.0f;
        } else {
            this.dragDistance = Math.abs(event.getX() - this.previousX) + this.dragDistance;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void expandUnderlay() {
        z7.e eVar = this.dragHelper;
        View view = null;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dragHelper");
            eVar = null;
        }
        View view2 = this.mainView;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mainView");
        } else {
            view = view2;
        }
        Rect rect = this.rectMainDragged;
        eVar.s(view, rect.left, rect.top);
        ViewCompat.T(this);
        UnderlayListener underlayListener = this.underlayListener;
        if (underlayListener != null) {
            underlayListener.onUnderlayExpanded(this);
        }
    }

    private final void fixElevationOverlay() {
        a20.a aVar = new a20.a(getContext());
        if (aVar.f237a) {
            float elevation = 0.0f;
            for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
                elevation += ((View) parent).getElevation();
            }
            int iA = aVar.a(elevation - 44.0f, aVar.f240d);
            View view = this.mainView;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mainView");
                view = null;
            }
            view.setBackgroundColor(iA);
        }
    }

    public final void collapseUnderlay() {
        z7.e eVar = this.dragHelper;
        View view = null;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dragHelper");
            eVar = null;
        }
        View view2 = this.mainView;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mainView");
        } else {
            view = view2;
        }
        Rect rect = this.rectMainNotDragged;
        eVar.s(view, rect.left, rect.top);
        ViewCompat.T(this);
    }

    @Override // android.view.View
    public void computeScroll() {
        z7.e eVar = this.dragHelper;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dragHelper");
            eVar = null;
        }
        if (eVar.g()) {
            ViewCompat.T(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        fixElevationOverlay();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        if (getChildCount() != 2) {
            throw new CheckoutException("AdyenSwipeToRevealLayout must contain two children.", null, 2, null);
        }
        View childAt = getChildAt(1);
        childAt.getClass();
        this.mainView = childAt;
        View childAt2 = getChildAt(0);
        childAt2.getClass();
        this.underlayView = childAt2;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0099  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(@org.jetbrains.annotations.NotNull android.view.MotionEvent r9) {
        /*
            r8 = this;
            r9.getClass()
            h7.m r0 = r8.gestureDetector
            android.view.GestureDetector r0 = r0.f21590a
            r0.onTouchEvent(r9)
            z7.e r0 = r8.dragHelper
            java.lang.String r1 = "dragHelper"
            r2 = 0
            if (r0 != 0) goto L15
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            r0 = r2
        L15:
            r0.k(r9)
            r8.calculateDragDistance(r9)
            z7.e r0 = r8.dragHelper
            if (r0 != 0) goto L23
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            r0 = r2
        L23:
            int r0 = r0.f47324a
            r3 = 0
            r4 = 1
            if (r0 != 0) goto L2f
            boolean r0 = r8.isDragging
            if (r0 == 0) goto L2f
            r0 = r4
            goto L30
        L2f:
            r0 = r3
        L30:
            float r5 = r9.getX()
            android.view.View r6 = r8.mainView
            java.lang.String r7 = "mainView"
            if (r6 != 0) goto L3e
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
            r6 = r2
        L3e:
            int r6 = r6.getRight()
            float r6 = (float) r6
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 < 0) goto L99
            float r5 = r9.getX()
            android.view.View r6 = r8.mainView
            if (r6 != 0) goto L53
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
            r6 = r2
        L53:
            int r6 = r6.getLeft()
            float r6 = (float) r6
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 > 0) goto L99
            float r5 = r9.getY()
            android.view.View r6 = r8.mainView
            if (r6 != 0) goto L68
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
            r6 = r2
        L68:
            int r6 = r6.getTop()
            float r6 = (float) r6
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 < 0) goto L99
            float r5 = r9.getY()
            android.view.View r6 = r8.mainView
            if (r6 != 0) goto L7d
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
            r6 = r2
        L7d:
            int r6 = r6.getBottom()
            float r6 = (float) r6
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 > 0) goto L99
            float r5 = r8.dragDistance
            z7.e r6 = r8.dragHelper
            if (r6 != 0) goto L90
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            r6 = r2
        L90:
            int r6 = r6.f47325b
            float r6 = (float) r6
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 >= 0) goto L99
            r5 = r4
            goto L9a
        L99:
            r5 = r3
        L9a:
            z7.e r6 = r8.dragHelper
            if (r6 != 0) goto La2
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            goto La3
        La2:
            r2 = r6
        La3:
            int r1 = r2.f47324a
            r2 = 2
            if (r1 != r2) goto Laa
            r1 = r4
            goto Lab
        Laa:
            r1 = r3
        Lab:
            float r9 = r9.getX()
            r8.previousX = r9
            if (r5 != 0) goto Lb8
            if (r1 != 0) goto Lb7
            if (r0 == 0) goto Lb8
        Lb7:
            return r4
        Lb8:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adyen.checkout.ui.core.internal.ui.view.AdyenSwipeToRevealLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l, int t9, int r11, int b8) {
        for (View view : new z0(this)) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            if (layoutParams.height == -1) {
                measuredHeight = ((b8 - t9) - getPaddingTop()) - getPaddingBottom();
                layoutParams.height = measuredHeight;
            }
            if (layoutParams.width == -1) {
                measuredWidth = ((r11 - l) - getPaddingLeft()) - getPaddingRight();
                layoutParams.width = measuredWidth;
            }
            int iMax = Math.max(((r11 - measuredWidth) - getPaddingRight()) - l, getPaddingLeft());
            int iMax2 = Math.max((r11 - l) - getPaddingRight(), getPaddingLeft());
            int iMax3 = Math.max(getPaddingTop() + measuredHeight, Math.max((b8 - t9) - getPaddingBottom(), 0));
            view.layout(iMax, Math.min(getPaddingTop(), iMax3), iMax2, iMax3);
        }
        Rect rect = this.rectMainNotDragged;
        View view2 = this.mainView;
        View view3 = null;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mainView");
            view2 = null;
        }
        int left = view2.getLeft();
        View view4 = this.mainView;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mainView");
            view4 = null;
        }
        int top = view4.getTop();
        View view5 = this.mainView;
        if (view5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mainView");
            view5 = null;
        }
        int right = view5.getRight();
        View view6 = this.mainView;
        if (view6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mainView");
            view6 = null;
        }
        rect.set(left, top, right, view6.getBottom());
        Rect rect2 = this.rectUnderlayNotDragged;
        View view7 = this.underlayView;
        if (view7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("underlayView");
            view7 = null;
        }
        int left2 = view7.getLeft();
        View view8 = this.underlayView;
        if (view8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("underlayView");
            view8 = null;
        }
        int top2 = view8.getTop();
        View view9 = this.underlayView;
        if (view9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("underlayView");
            view9 = null;
        }
        int right2 = view9.getRight();
        View view10 = this.underlayView;
        if (view10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("underlayView");
            view10 = null;
        }
        rect2.set(left2, top2, right2, view10.getBottom());
        Rect rect3 = this.rectMainDragged;
        int i11 = this.rectMainNotDragged.left;
        View view11 = this.underlayView;
        if (view11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("underlayView");
            view11 = null;
        }
        int width = i11 - view11.getWidth();
        Rect rect4 = this.rectMainNotDragged;
        int i12 = rect4.top;
        int i13 = rect4.left;
        View view12 = this.mainView;
        if (view12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mainView");
            view12 = null;
        }
        int width2 = view12.getWidth() + i13;
        View view13 = this.underlayView;
        if (view13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("underlayView");
            view13 = null;
        }
        int width3 = width2 - view13.getWidth();
        int i14 = this.rectMainNotDragged.top;
        View view14 = this.mainView;
        if (view14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mainView");
            view14 = null;
        }
        rect3.set(width, i12, width3, view14.getHeight() + i14);
        Rect rect5 = this.rectUnderlayDragged;
        Rect rect6 = this.rectUnderlayNotDragged;
        int i15 = rect6.left;
        int i16 = rect6.top;
        View view15 = this.underlayView;
        if (view15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("underlayView");
            view15 = null;
        }
        int width4 = view15.getWidth() + i15;
        int i17 = this.rectUnderlayNotDragged.top;
        View view16 = this.underlayView;
        if (view16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("underlayView");
        } else {
            view3 = view16;
        }
        rect5.set(i15, i16, width4, view3.getHeight() + i17);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
        int iMax = 0;
        int iMax2 = 0;
        for (View view : new z0(this)) {
            measureChild(view, widthMeasureSpec, heightMeasureSpec);
            if (iMax < view.getMeasuredHeight()) {
                iMax = view.getMeasuredHeight();
            }
            if (iMax2 < view.getMeasuredWidth()) {
                iMax2 = view.getMeasuredWidth();
            }
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, mode2);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax2, mode);
        int size = View.MeasureSpec.getSize(iMakeMeasureSpec);
        int size2 = View.MeasureSpec.getSize(iMakeMeasureSpec2);
        for (View view2 : new z0(this)) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams.height == -1) {
                    view2.setMinimumHeight(size);
                }
                if (layoutParams.width == -1) {
                    view2.setMinimumWidth(size2);
                }
            }
            measureChild(view2, iMakeMeasureSpec2, iMakeMeasureSpec);
            iMax2 = Math.max(view2.getMeasuredWidth(), iMax2);
            iMax = Math.max(view2.getMeasuredHeight(), iMax);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax;
        int paddingRight = getPaddingRight() + getPaddingLeft() + iMax2;
        if (mode != 1073741824 && getLayoutParams().width != -1) {
            if (mode == Integer.MIN_VALUE) {
                Math.min(size2, paddingRight);
            }
            size2 = paddingRight;
        }
        if (mode2 != 1073741824 && getLayoutParams().height != -1) {
            if (mode2 == Integer.MIN_VALUE) {
                Math.min(size, paddingBottom);
            }
            size = paddingBottom;
        }
        setMeasuredDimension(size2, size);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        event.getClass();
        this.gestureDetector.f21590a.onTouchEvent(event);
        z7.e eVar = this.dragHelper;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dragHelper");
            eVar = null;
        }
        eVar.k(event);
        return true;
    }

    public final void removeUnderlayListener() {
        this.underlayListener = null;
    }

    public final void setDragLocked(boolean isDragLocked) {
        this.isDragLocked = isDragLocked;
    }

    public final void setOnMainClickListener(@Nullable OnMainClickListener onMainClickListener) {
        this.onMainClickListener = onMainClickListener;
    }

    public final void setUnderlayListener(@NotNull UnderlayListener underlayListener) {
        underlayListener.getClass();
        this.underlayListener = underlayListener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdyenSwipeToRevealLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ AdyenSwipeToRevealLayout(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdyenSwipeToRevealLayout(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
