package androidx.core.view.accessibility;

import a70.a;
import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.app.g0;
import f5.b;
import h7.i0;
import i7.c;
import i7.d;
import i7.e;
import i7.f;
import i7.h;
import i7.i;
import i7.j;
import i7.k;
import i7.l;
import i7.m;
import i7.n;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class AccessibilityNodeInfoCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccessibilityNodeInfo f2743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2744b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2745c = -1;

    public AccessibilityNodeInfoCompat(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f2743a = accessibilityNodeInfo;
    }

    public static AccessibilityNodeInfoCompat T() {
        return Z0(AccessibilityNodeInfo.obtain());
    }

    public static AccessibilityNodeInfoCompat U(View view) {
        return Z0(AccessibilityNodeInfo.obtain(view));
    }

    public static AccessibilityNodeInfoCompat V(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        return Z0(AccessibilityNodeInfo.obtain(accessibilityNodeInfoCompat.f2743a));
    }

    public static AccessibilityNodeInfoCompat Z0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new AccessibilityNodeInfoCompat(accessibilityNodeInfo);
    }

    public static String h(int i11) {
        if (i11 == 1) {
            return "ACTION_FOCUS";
        }
        if (i11 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i11) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case NewHope.SENDB_BYTES /* 2048 */:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE /* 16384 */:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            default:
                switch (i11) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i11) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i11) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        switch (i11) {
                                            case R.id.accessibilityActionScrollInDirection:
                                                return "ACTION_SCROLL_IN_DIRECTION";
                                            case R.id.ALT:
                                                return "ACTION_SET_EXTENDED_SELECTION";
                                            default:
                                                return "ACTION_UNKNOWN";
                                        }
                                }
                        }
                }
        }
    }

    public static ClickableSpan[] p(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    public String A() {
        int i11 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2743a;
        return i11 >= 33 ? a.k(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    }

    public void A0(boolean z11) {
        this.f2743a.setLongClickable(z11);
    }

    public String B() {
        return this.f2743a.getViewIdResourceName();
    }

    public void B0(int i11) {
        this.f2743a.setMaxTextLength(i11);
    }

    public boolean C() {
        return Build.VERSION.SDK_INT >= 34 ? i0.r(this.f2743a) : j(64);
    }

    public void C0(int i11) {
        this.f2743a.setMovementGranularities(i11);
    }

    public boolean D() {
        return this.f2743a.isCheckable();
    }

    public void D0(CharSequence charSequence) {
        this.f2743a.setPackageName(charSequence);
    }

    @Deprecated
    public boolean E() {
        return this.f2743a.isChecked();
    }

    public void E0(CharSequence charSequence) {
        int i11 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2743a;
        if (i11 >= 28) {
            accessibilityNodeInfo.setPaneTitle(charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public boolean F() {
        return this.f2743a.isClickable();
    }

    public void F0(View view) {
        this.f2744b = -1;
        this.f2743a.setParent(view);
    }

    public boolean G() {
        return this.f2743a.isContextClickable();
    }

    public void G0(View view, int i11) {
        this.f2744b = i11;
        this.f2743a.setParent(view, i11);
    }

    public boolean H() {
        return this.f2743a.isEnabled();
    }

    public void H0(boolean z11) {
        this.f2743a.setPassword(z11);
    }

    public boolean I() {
        return this.f2743a.isFocusable();
    }

    public void I0(f fVar) {
        this.f2743a.setRangeInfo((AccessibilityNodeInfo.RangeInfo) fVar.f23476a);
    }

    public boolean J() {
        return this.f2743a.isFocused();
    }

    public void J0(CharSequence charSequence) {
        this.f2743a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }

    public boolean K() {
        return j(67108864);
    }

    public void K0(boolean z11) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f2743a.setScreenReaderFocusable(z11);
        } else {
            c0(1, z11);
        }
    }

    public boolean L() {
        return this.f2743a.isImportantForAccessibility();
    }

    public void L0(boolean z11) {
        this.f2743a.setScrollable(z11);
    }

    public boolean M() {
        return this.f2743a.isLongClickable();
    }

    public void M0(boolean z11) {
        this.f2743a.setSelected(z11);
    }

    public boolean N() {
        return this.f2743a.isPassword();
    }

    public void N0(boolean z11) {
        this.f2743a.setShowingHintText(z11);
    }

    public boolean O() {
        return this.f2743a.isScrollable();
    }

    public void O0(View view, int i11) {
        this.f2745c = i11;
        this.f2743a.setSource(view, i11);
    }

    public boolean P() {
        return this.f2743a.isSelected();
    }

    public void P0(CharSequence charSequence) {
        int i11 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2743a;
        if (i11 >= 30) {
            b.r(accessibilityNodeInfo, charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public boolean Q() {
        return this.f2743a.isShowingHintText();
    }

    public void Q0(CharSequence charSequence) {
        this.f2743a.setText(charSequence);
    }

    public boolean R() {
        return Build.VERSION.SDK_INT >= 33 ? a.o(this.f2743a) : j(8388608);
    }

    public void R0(int i11, int i12) {
        this.f2743a.setTextSelection(i11, i12);
    }

    public boolean S() {
        return this.f2743a.isVisibleToUser();
    }

    public void S0(View view) {
        this.f2743a.setTraversalAfter(view);
    }

    public void T0(View view, int i11) {
        this.f2743a.setTraversalAfter(view, i11);
    }

    public void U0(View view) {
        this.f2743a.setTraversalBefore(view);
    }

    public void V0(View view, int i11) {
        this.f2743a.setTraversalBefore(view, i11);
    }

    public boolean W(int i11, Bundle bundle) {
        return this.f2743a.performAction(i11, bundle);
    }

    public void W0(String str) {
        this.f2743a.setViewIdResourceName(str);
    }

    public void X0(boolean z11) {
        this.f2743a.setVisibleToUser(z11);
    }

    public boolean Y(AccessibilityActionCompat accessibilityActionCompat) {
        return this.f2743a.removeAction((AccessibilityNodeInfo.AccessibilityAction) accessibilityActionCompat.f2767a);
    }

    public AccessibilityNodeInfo Y0() {
        return this.f2743a;
    }

    public void Z(boolean z11) {
        if (Build.VERSION.SDK_INT >= 34) {
            i0.v(this.f2743a, z11);
        } else {
            c0(64, z11);
        }
    }

    public void a(int i11) {
        this.f2743a.addAction(i11);
    }

    public void a0(boolean z11) {
        this.f2743a.setAccessibilityFocused(z11);
    }

    public void b(AccessibilityActionCompat accessibilityActionCompat) {
        this.f2743a.addAction((AccessibilityNodeInfo.AccessibilityAction) accessibilityActionCompat.f2767a);
    }

    public void b0(List<String> list) {
        this.f2743a.setAvailableExtraData(list);
    }

    public void c(View view) {
        this.f2743a.addChild(view);
    }

    public final void c0(int i11, boolean z11) {
        Bundle bundleT = t();
        if (bundleT != null) {
            int i12 = bundleT.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i11);
            if (!z11) {
                i11 = 0;
            }
            bundleT.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i11 | i12);
        }
    }

    public void d(View view, int i11) {
        this.f2743a.addChild(view, i11);
    }

    @Deprecated
    public void d0(Rect rect) {
        this.f2743a.setBoundsInParent(rect);
    }

    public void e0(Rect rect) {
        this.f2743a.setBoundsInScreen(rect);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AccessibilityNodeInfoCompat)) {
            return false;
        }
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = (AccessibilityNodeInfoCompat) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.f2743a;
        AccessibilityNodeInfo accessibilityNodeInfo2 = this.f2743a;
        if (accessibilityNodeInfo2 == null) {
            if (accessibilityNodeInfo != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo2.equals(accessibilityNodeInfo)) {
            return false;
        }
        return this.f2745c == accessibilityNodeInfoCompat.f2745c && this.f2744b == accessibilityNodeInfoCompat.f2744b;
    }

    public final ArrayList f(String str) {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2743a;
        ArrayList<Integer> integerArrayList = accessibilityNodeInfo.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        accessibilityNodeInfo.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    public void f0(boolean z11) {
        this.f2743a.setCheckable(z11);
    }

    public List<AccessibilityActionCompat> g() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f2743a.getActionList();
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new AccessibilityActionCompat(actionList.get(i11), 0, null, null, null));
        }
        return arrayList;
    }

    @Deprecated
    public void g0(boolean z11) {
        this.f2743a.setChecked(z11);
    }

    public void h0(CharSequence charSequence) {
        this.f2743a.setClassName(charSequence);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2743a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    @Deprecated
    public int i() {
        return this.f2743a.getActions();
    }

    public void i0(boolean z11) {
        this.f2743a.setClickable(z11);
    }

    public final boolean j(int i11) {
        Bundle bundleT = t();
        return bundleT != null && (bundleT.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i11) == i11;
    }

    public void j0(Object obj) {
        this.f2743a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((d) obj).f23474a);
    }

    @Deprecated
    public void k(Rect rect) {
        this.f2743a.getBoundsInParent(rect);
    }

    public void k0(Object obj) {
        this.f2743a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((e) obj).f23475a);
    }

    public void l(Rect rect) {
        this.f2743a.getBoundsInScreen(rect);
    }

    public void l0(CharSequence charSequence) {
        this.f2743a.setContentDescription(charSequence);
    }

    public void m(Rect rect) {
        int i11 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2743a;
        if (i11 >= 34) {
            i0.j(accessibilityNodeInfo, rect);
            return;
        }
        Rect rect2 = (Rect) accessibilityNodeInfo.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
        if (rect2 != null) {
            rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
    }

    public void m0(boolean z11) {
        this.f2743a.setContentInvalid(z11);
    }

    public int n() {
        return this.f2743a.getChildCount();
    }

    public void n0(boolean z11) {
        this.f2743a.setDismissable(z11);
    }

    public CharSequence o() {
        return this.f2743a.getClassName();
    }

    public void o0(int i11) {
        this.f2743a.setDrawingOrder(i11);
    }

    public void p0(boolean z11) {
        this.f2743a.setEditable(z11);
    }

    public CharSequence q() {
        int i11 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2743a;
        return i11 >= 34 ? i0.k(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
    }

    public void q0(boolean z11) {
        this.f2743a.setEnabled(z11);
    }

    public CharSequence r() {
        return this.f2743a.getContentDescription();
    }

    public void r0(CharSequence charSequence) {
        this.f2743a.setError(charSequence);
    }

    public CharSequence s() {
        return this.f2743a.getError();
    }

    public void s0(boolean z11) {
        this.f2743a.setFocusable(z11);
    }

    public Bundle t() {
        return this.f2743a.getExtras();
    }

    public void t0(boolean z11) {
        this.f2743a.setFocused(z11);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        Rect rect = new Rect();
        k(rect);
        sb2.append("; boundsInParent: " + rect);
        l(rect);
        sb2.append("; boundsInScreen: " + rect);
        m(rect);
        sb2.append("; boundsInWindow: " + rect);
        sb2.append("; packageName: ");
        sb2.append(w());
        sb2.append("; className: ");
        sb2.append(o());
        sb2.append("; text: ");
        sb2.append(y());
        sb2.append("; error: ");
        sb2.append(s());
        sb2.append("; maxTextLength: ");
        sb2.append(u());
        sb2.append("; stateDescription: ");
        sb2.append(x());
        sb2.append("; contentDescription: ");
        sb2.append(r());
        sb2.append("; supplementalDescription: ");
        int i11 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2743a;
        sb2.append(i11 >= 36 ? i7.b.d(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.SUPPLEMENTAL_DESCRIPTION_KEY"));
        sb2.append("; tooltipText: ");
        sb2.append(z());
        sb2.append("; viewIdResName: ");
        sb2.append(B());
        sb2.append("; uniqueId: ");
        sb2.append(A());
        sb2.append("; checkable: ");
        sb2.append(D());
        sb2.append("; checked: ");
        int iB = i11 >= 36 ? i7.b.b(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.CHECKED_KEY", accessibilityNodeInfo.isChecked() ? 1 : 0);
        String str = "PARTIAL";
        sb2.append(iB == 1 ? "TRUE" : iB == 2 ? "PARTIAL" : "FALSE");
        sb2.append("; fieldRequired: ");
        sb2.append(i11 >= 36 ? i7.b.e(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getBoolean("androidx.view.accessibility.AccessibilityNodeInfoCompat.IS_REQUIRED_KEY"));
        sb2.append("; focusable: ");
        sb2.append(I());
        sb2.append("; focused: ");
        sb2.append(J());
        sb2.append("; selected: ");
        sb2.append(P());
        sb2.append("; clickable: ");
        sb2.append(F());
        sb2.append("; longClickable: ");
        sb2.append(M());
        sb2.append("; contextClickable: ");
        sb2.append(G());
        sb2.append("; expandedState: ");
        int iC = i11 >= 36 ? i7.b.c(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.EXPANDED_STATE_KEY", 0);
        if (iC == 0) {
            str = "UNDEFINED";
        } else if (iC == 1) {
            str = "COLLAPSED";
        } else if (iC != 2) {
            str = iC != 3 ? "UNKNOWN" : "FULL";
        }
        sb2.append(str);
        sb2.append("; enabled: ");
        sb2.append(H());
        sb2.append("; password: ");
        sb2.append(N());
        sb2.append("; scrollable: " + O());
        sb2.append("; containerTitle: ");
        sb2.append(q());
        sb2.append("; granularScrollingSupported: ");
        sb2.append(K());
        sb2.append("; importantForAccessibility: ");
        sb2.append(L());
        sb2.append("; visible: ");
        sb2.append(S());
        sb2.append("; isTextSelectable: ");
        sb2.append(R());
        sb2.append("; accessibilityDataSensitive: ");
        sb2.append(C());
        sb2.append("; [");
        List<AccessibilityActionCompat> listG = g();
        for (int i12 = 0; i12 < listG.size(); i12++) {
            AccessibilityActionCompat accessibilityActionCompat = listG.get(i12);
            String strH = h(accessibilityActionCompat.b());
            if (strH.equals("ACTION_UNKNOWN") && accessibilityActionCompat.c() != null) {
                strH = accessibilityActionCompat.c().toString();
            }
            sb2.append(strH);
            if (i12 != listG.size() - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public int u() {
        return this.f2743a.getMaxTextLength();
    }

    public void u0(boolean z11) {
        c0(67108864, z11);
    }

    public int v() {
        return this.f2743a.getMovementGranularities();
    }

    public void v0(boolean z11) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f2743a.setHeading(z11);
        } else {
            c0(2, z11);
        }
    }

    public CharSequence w() {
        return this.f2743a.getPackageName();
    }

    public void w0(CharSequence charSequence) {
        this.f2743a.setHintText(charSequence);
    }

    public CharSequence x() {
        int i11 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2743a;
        return i11 >= 30 ? b.e(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
    }

    public void x0(boolean z11) {
        this.f2743a.setImportantForAccessibility(z11);
    }

    public CharSequence y() {
        boolean zIsEmpty = f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2743a;
        if (zIsEmpty) {
            return accessibilityNodeInfo.getText();
        }
        ArrayList arrayListF = f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        ArrayList arrayListF2 = f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        ArrayList arrayListF3 = f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        ArrayList arrayListF4 = f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(accessibilityNodeInfo.getText(), 0, accessibilityNodeInfo.getText().length()));
        for (int i11 = 0; i11 < arrayListF.size(); i11++) {
            spannableString.setSpan(new i7.a(((Integer) arrayListF4.get(i11)).intValue(), this, t().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) arrayListF.get(i11)).intValue(), ((Integer) arrayListF2.get(i11)).intValue(), ((Integer) arrayListF3.get(i11)).intValue());
        }
        return spannableString;
    }

    public void y0(View view) {
        this.f2743a.setLabelFor(view);
    }

    public CharSequence z() {
        int i11 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2743a;
        return i11 >= 28 ? accessibilityNodeInfo.getTooltipText() : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
    }

    public void z0(int i11) {
        this.f2743a.setLiveRegion(i11);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static class AccessibilityActionCompat {
        public static final AccessibilityActionCompat G;
        public static final AccessibilityActionCompat H;
        public static final AccessibilityActionCompat I;
        public static final AccessibilityActionCompat J;
        public static final AccessibilityActionCompat K;
        public static final AccessibilityActionCompat L;
        public static final AccessibilityActionCompat M;
        public static final AccessibilityActionCompat N;
        public static final AccessibilityActionCompat O;
        public static final AccessibilityActionCompat P;
        public static final AccessibilityActionCompat Q;
        public static final AccessibilityActionCompat R;
        public static final AccessibilityActionCompat S;
        public static final AccessibilityActionCompat T;
        public static final AccessibilityActionCompat U;
        public static final AccessibilityActionCompat V;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f2767a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f2768b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Class f2769c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        protected final AccessibilityViewCommand f2770d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final AccessibilityActionCompat f2746e = new AccessibilityActionCompat(1, (CharSequence) null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final AccessibilityActionCompat f2747f = new AccessibilityActionCompat(2, (CharSequence) null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final AccessibilityActionCompat f2748g = new AccessibilityActionCompat(4, (CharSequence) null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final AccessibilityActionCompat f2749h = new AccessibilityActionCompat(8, (CharSequence) null);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final AccessibilityActionCompat f2750i = new AccessibilityActionCompat(16, (CharSequence) null);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final AccessibilityActionCompat f2751j = new AccessibilityActionCompat(32, (CharSequence) null);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final AccessibilityActionCompat f2752k = new AccessibilityActionCompat(64, (CharSequence) null);
        public static final AccessibilityActionCompat l = new AccessibilityActionCompat(128, (CharSequence) null);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final AccessibilityActionCompat f2753m = new AccessibilityActionCompat(h.class, 256);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final AccessibilityActionCompat f2754n = new AccessibilityActionCompat(h.class, 512);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final AccessibilityActionCompat f2755o = new AccessibilityActionCompat(i.class, 1024);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final AccessibilityActionCompat f2756p = new AccessibilityActionCompat(i.class, NewHope.SENDB_BYTES);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final AccessibilityActionCompat f2757q = new AccessibilityActionCompat(4096, (CharSequence) null);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final AccessibilityActionCompat f2758r = new AccessibilityActionCompat(8192, (CharSequence) null);

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final AccessibilityActionCompat f2759s = new AccessibilityActionCompat(BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE, (CharSequence) null);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final AccessibilityActionCompat f2760t = new AccessibilityActionCompat(32768, (CharSequence) null);

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final AccessibilityActionCompat f2761u = new AccessibilityActionCompat(65536, (CharSequence) null);

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final AccessibilityActionCompat f2762v = new AccessibilityActionCompat(m.class, 131072);

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final AccessibilityActionCompat f2763w = new AccessibilityActionCompat(262144, (CharSequence) null);

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final AccessibilityActionCompat f2764x = new AccessibilityActionCompat(524288, (CharSequence) null);

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final AccessibilityActionCompat f2765y = new AccessibilityActionCompat(1048576, (CharSequence) null);

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final AccessibilityActionCompat f2766z = new AccessibilityActionCompat(n.class, 2097152);
        public static final AccessibilityActionCompat A = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        public static final AccessibilityActionCompat B = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, k.class);
        public static final AccessibilityActionCompat C = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        public static final AccessibilityActionCompat D = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        public static final AccessibilityActionCompat E = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        public static final AccessibilityActionCompat F = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);

        static {
            AccessibilityNodeInfo.AccessibilityAction accessibilityActionA = null;
            int i11 = Build.VERSION.SDK_INT;
            G = new AccessibilityActionCompat(i11 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
            H = new AccessibilityActionCompat(i11 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
            I = new AccessibilityActionCompat(i11 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
            J = new AccessibilityActionCompat(i11 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
            K = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
            L = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, l.class);
            M = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow, null, null, j.class);
            N = new AccessibilityActionCompat(i11 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
            O = new AccessibilityActionCompat(i11 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
            P = new AccessibilityActionCompat(i11 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
            Q = new AccessibilityActionCompat(i11 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
            R = new AccessibilityActionCompat(i11 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
            S = new AccessibilityActionCompat(i11 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
            T = new AccessibilityActionCompat(i11 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
            U = new AccessibilityActionCompat(i11 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
            V = new AccessibilityActionCompat(i11 >= 34 ? i0.h() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
            d7.b bVar = d7.b.f14555a;
            if (i11 >= 36 && g0.a() >= 3600001) {
                accessibilityActionA = c.a();
            }
            new AccessibilityActionCompat(accessibilityActionA, R.id.ALT, null, null, null);
        }

        public AccessibilityActionCompat(Object obj, int i11, CharSequence charSequence, AccessibilityViewCommand accessibilityViewCommand, Class cls) {
            this.f2768b = i11;
            this.f2770d = accessibilityViewCommand;
            if (obj == null) {
                this.f2767a = new AccessibilityNodeInfo.AccessibilityAction(i11, charSequence);
            } else {
                this.f2767a = obj;
            }
            this.f2769c = cls;
        }

        public AccessibilityActionCompat a(CharSequence charSequence, AccessibilityViewCommand accessibilityViewCommand) {
            return new AccessibilityActionCompat(null, this.f2768b, charSequence, accessibilityViewCommand, this.f2769c);
        }

        public int b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f2767a).getId();
        }

        public CharSequence c() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f2767a).getLabel();
        }

        public boolean d(View view, Bundle bundle) {
            if (this.f2770d == null) {
                return false;
            }
            Class cls = this.f2769c;
            if (cls != null) {
                try {
                    if (cls.getDeclaredConstructor(null).newInstance(null) == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                } catch (Exception e5) {
                    Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e5);
                }
            }
            return this.f2770d.d(view);
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof AccessibilityActionCompat)) {
                return false;
            }
            Object obj2 = ((AccessibilityActionCompat) obj).f2767a;
            Object obj3 = this.f2767a;
            return obj3 == null ? obj2 == null : obj3.equals(obj2);
        }

        public int hashCode() {
            Object obj = this.f2767a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("AccessibilityActionCompat: ");
            String strH = AccessibilityNodeInfoCompat.h(this.f2768b);
            if (strH.equals("ACTION_UNKNOWN") && c() != null) {
                strH = c().toString();
            }
            sb2.append(strH);
            return sb2.toString();
        }

        public AccessibilityActionCompat(int i11, CharSequence charSequence, AccessibilityViewCommand accessibilityViewCommand) {
            this(null, i11, charSequence, accessibilityViewCommand, null);
        }

        public AccessibilityActionCompat(Class cls, int i11) {
            this(null, i11, null, null, cls);
        }

        public AccessibilityActionCompat(int i11, CharSequence charSequence) {
            this(null, i11, charSequence, null, null);
        }
    }

    @Deprecated
    public void X() {
    }

    public void e(CharSequence charSequence, View view) {
    }
}
