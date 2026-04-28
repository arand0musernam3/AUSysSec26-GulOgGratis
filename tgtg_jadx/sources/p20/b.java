package p20;

import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.app.tgtg.R;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import m0.l;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends z7.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e f34142n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Rect f34143o;

    public b(e eVar) {
        super(eVar);
        this.f34143o = new Rect();
        this.f34142n = eVar;
    }

    @Override // z7.a
    public final int e(float f11, float f12) {
        int i11 = 0;
        while (true) {
            e eVar = this.f34142n;
            if (i11 >= eVar.getValues().size()) {
                return -1;
            }
            Rect rect = this.f34143o;
            eVar.B(i11, rect);
            if (rect.contains((int) f11, (int) f12)) {
                return i11;
            }
            i11++;
        }
    }

    @Override // z7.a
    public final void f(ArrayList arrayList) {
        for (int i11 = 0; i11 < this.f34142n.getValues().size(); i11++) {
            arrayList.add(Integer.valueOf(i11));
        }
    }

    @Override // z7.a
    public final boolean j(int i11, int i12, Bundle bundle) {
        e eVar = this.f34142n;
        if (!eVar.isEnabled()) {
            return false;
        }
        if (i12 != 4096 && i12 != 8192) {
            if (i12 != 16908349 || bundle == null || !bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE") || !eVar.z(bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"), i11)) {
                return false;
            }
            eVar.C();
            eVar.postInvalidate();
            g(i11);
            return true;
        }
        float fRound = eVar.f34186u1;
        if (fRound == 0.0f) {
            fRound = 1.0f;
        }
        if ((eVar.f34178q1 - eVar.f34176p1) / fRound > 20) {
            fRound *= Math.round(r1 / r4);
        }
        if (i12 == 8192) {
            fRound = -fRound;
        }
        if (eVar.q()) {
            fRound = -fRound;
        }
        if (!eVar.z(xz.b.n(eVar.getValues().get(i11).floatValue() + fRound, eVar.getValueFrom(), eVar.getValueTo()), i11)) {
            return false;
        }
        eVar.setActiveThumbIndex(i11);
        l lVar = eVar.Y1;
        eVar.removeCallbacks(lVar);
        eVar.postDelayed(lVar, eVar.V1);
        eVar.C();
        eVar.postInvalidate();
        g(i11);
        return true;
    }

    @Override // z7.a
    public final void l(int i11, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        accessibilityNodeInfoCompat.b(AccessibilityNodeInfoCompat.AccessibilityActionCompat.L);
        e eVar = this.f34142n;
        List<Float> values = eVar.getValues();
        Float f11 = values.get(i11);
        float fFloatValue = f11.floatValue();
        float valueFrom = eVar.getValueFrom();
        float valueTo = eVar.getValueTo();
        if (eVar.isEnabled()) {
            if (fFloatValue > valueFrom) {
                accessibilityNodeInfoCompat.a(8192);
            }
            if (fFloatValue < valueTo) {
                accessibilityNodeInfoCompat.a(4096);
            }
        }
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.setMaximumFractionDigits(2);
        try {
            valueFrom = numberInstance.parse(numberInstance.format(valueFrom)).floatValue();
            valueTo = numberInstance.parse(numberInstance.format(valueTo)).floatValue();
            fFloatValue = numberInstance.parse(numberInstance.format(fFloatValue)).floatValue();
        } catch (ParseException unused) {
            int i12 = e.f34149a2;
            Log.w("e", "Error parsing value(" + f11 + "), valueFrom(" + valueFrom + "), and valueTo(" + valueTo + ") into a float.");
        }
        accessibilityNodeInfoCompat.I0(new i7.f(AccessibilityNodeInfo.RangeInfo.obtain(1, valueFrom, valueTo, fFloatValue)));
        accessibilityNodeInfoCompat.h0(SeekBar.class.getName());
        StringBuilder sb2 = new StringBuilder();
        if (eVar.getContentDescription() != null) {
            sb2.append(eVar.getContentDescription());
            sb2.append(MessageLogView.COMMA_SEPARATOR);
        }
        String str = String.format(((float) ((int) fFloatValue)) == fFloatValue ? "%.0f" : "%.2f", Float.valueOf(fFloatValue));
        String string = eVar.getContext().getString(R.string.material_slider_value);
        if (values.size() > 1) {
            string = i11 == eVar.getValues().size() - 1 ? eVar.getContext().getString(R.string.material_slider_range_end) : i11 == 0 ? eVar.getContext().getString(R.string.material_slider_range_start) : "";
        }
        CharSequence charSequenceZ = ViewCompat.z(eVar);
        if (TextUtils.isEmpty(charSequenceZ)) {
            Locale.getDefault();
            sb2.append(string + ", " + str);
        } else {
            accessibilityNodeInfoCompat.P0(charSequenceZ);
        }
        accessibilityNodeInfoCompat.l0(sb2.toString());
        Rect rect = this.f34143o;
        eVar.B(i11, rect);
        accessibilityNodeInfoCompat.d0(rect);
    }
}
