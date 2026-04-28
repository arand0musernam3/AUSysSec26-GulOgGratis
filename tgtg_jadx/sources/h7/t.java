package h7;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewParent f21618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewParent f21619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewGroup f21620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f21621d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f21622e;

    public t(ViewGroup viewGroup) {
        this.f21620c = viewGroup;
    }

    public final boolean a(float f11, float f12, boolean z11) {
        ViewParent viewParentE;
        if (this.f21621d && (viewParentE = e(0)) != null) {
            try {
                return viewParentE.onNestedFling(this.f21620c, f11, f12, z11);
            } catch (AbstractMethodError e5) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedFling", e5);
            }
        }
        return false;
    }

    public final boolean b(float f11, float f12) {
        ViewParent viewParentE;
        if (this.f21621d && (viewParentE = e(0)) != null) {
            try {
                return viewParentE.onNestedPreFling(this.f21620c, f11, f12);
            } catch (AbstractMethodError e5) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedPreFling", e5);
            }
        }
        return false;
    }

    public final boolean c(int i11, int[] iArr, int i12, int i13, int[] iArr2) {
        ViewParent viewParentE;
        int i14;
        int i15;
        ViewGroup viewGroup;
        if (!this.f21621d || (viewParentE = e(i13)) == null) {
            return false;
        }
        if (i11 == 0 && i12 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        ViewGroup viewGroup2 = this.f21620c;
        if (iArr2 != null) {
            viewGroup2.getLocationInWindow(iArr2);
            i14 = iArr2[0];
            i15 = iArr2[1];
        } else {
            i14 = 0;
            i15 = 0;
        }
        if (iArr == null) {
            if (this.f21622e == null) {
                this.f21622e = new int[2];
            }
            iArr = this.f21622e;
        }
        int[] iArr3 = iArr;
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (viewParentE instanceof u) {
            ((u) viewParentE).h(viewGroup2, i11, i12, iArr3, i13);
            viewGroup = viewGroup2;
        } else {
            viewGroup = viewGroup2;
            if (i13 == 0) {
                try {
                    viewParentE.onNestedPreScroll(viewGroup, i11, i12, iArr3);
                } catch (AbstractMethodError e5) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedPreScroll", e5);
                }
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i14;
            iArr2[1] = iArr2[1] - i15;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public final boolean d(int i11, int[] iArr, int i12, int i13, int i14, int[] iArr2, int i15) {
        ViewParent viewParentE;
        int i16;
        int i17;
        int[] iArr3;
        if (this.f21621d && (viewParentE = e(i15)) != null) {
            if (i11 != 0 || i12 != 0 || i13 != 0 || i14 != 0) {
                ViewGroup viewGroup = this.f21620c;
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    i16 = iArr[0];
                    i17 = iArr[1];
                } else {
                    i16 = 0;
                    i17 = 0;
                }
                if (iArr2 == null) {
                    if (this.f21622e == null) {
                        this.f21622e = new int[2];
                    }
                    int[] iArr4 = this.f21622e;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (viewParentE instanceof v) {
                    ((v) viewParentE).d(viewGroup, i11, i12, i13, i14, i15, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i13;
                    iArr3[1] = iArr3[1] + i14;
                    if (viewParentE instanceof u) {
                        ((u) viewParentE).e(viewGroup, i11, i12, i13, i14, i15);
                    } else if (i15 == 0) {
                        try {
                            viewParentE.onNestedScroll(viewGroup, i11, i12, i13, i14);
                        } catch (AbstractMethodError e5) {
                            Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedScroll", e5);
                        }
                    }
                }
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i16;
                    iArr[1] = iArr[1] - i17;
                }
                return true;
            }
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
        }
        return false;
    }

    public final ViewParent e(int i11) {
        if (i11 == 0) {
            return this.f21618a;
        }
        if (i11 != 1) {
            return null;
        }
        return this.f21619b;
    }

    public final boolean f(int i11) {
        return e(i11) != null;
    }

    public final boolean g(int i11, int i12) {
        boolean zOnStartNestedScroll;
        if (!f(i12)) {
            if (this.f21621d) {
                View view = this.f21620c;
                View view2 = view;
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z11 = parent instanceof u;
                    if (z11) {
                        zOnStartNestedScroll = ((u) parent).f(view2, view, i11, i12);
                    } else if (i12 == 0) {
                        try {
                            zOnStartNestedScroll = parent.onStartNestedScroll(view2, view, i11);
                        } catch (AbstractMethodError e5) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e5);
                            zOnStartNestedScroll = false;
                        }
                    } else {
                        zOnStartNestedScroll = false;
                    }
                    if (zOnStartNestedScroll) {
                        if (i12 == 0) {
                            this.f21618a = parent;
                        } else if (i12 == 1) {
                            this.f21619b = parent;
                        }
                        if (z11) {
                            ((u) parent).g(view2, view, i11, i12);
                        } else if (i12 == 0) {
                            try {
                                parent.onNestedScrollAccepted(view2, view, i11);
                            } catch (AbstractMethodError e11) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e11);
                            }
                        }
                    } else {
                        if (parent instanceof View) {
                            view2 = (View) parent;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void h(int i11) {
        ViewParent viewParentE = e(i11);
        if (viewParentE != null) {
            boolean z11 = viewParentE instanceof u;
            ViewGroup viewGroup = this.f21620c;
            if (z11) {
                ((u) viewParentE).c(i11, viewGroup);
            } else if (i11 == 0) {
                try {
                    viewParentE.onStopNestedScroll(viewGroup);
                } catch (AbstractMethodError e5) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onStopNestedScroll", e5);
                }
            }
            if (i11 == 0) {
                this.f21618a = null;
            } else {
                if (i11 != 1) {
                    return;
                }
                this.f21619b = null;
            }
        }
    }
}
