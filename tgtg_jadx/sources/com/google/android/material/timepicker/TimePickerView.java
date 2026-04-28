package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import com.app.tgtg.R;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import h7.b;
import p.u1;
import w20.c;
import w20.e;
import w20.f;
import w20.g;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class TimePickerView extends ConstraintLayout {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f12724e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Chip f12725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Chip f12726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ClockHandView f12727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ClockFaceView f12728d;

    public TimePickerView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        f fVar = new f();
        LayoutInflater.from(context).inflate(R.layout.material_timepicker, this);
        this.f12728d = (ClockFaceView) findViewById(R.id.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(R.id.material_clock_period_toggle);
        materialButtonToggleGroup.l.add(new e(this));
        Chip chip = (Chip) findViewById(R.id.material_minute_tv);
        this.f12725a = chip;
        Chip chip2 = (Chip) findViewById(R.id.material_hour_tv);
        this.f12726b = chip2;
        this.f12727c = (ClockHandView) findViewById(R.id.material_clock_hand);
        u1 u1Var = new u1(new GestureDetector(getContext(), new g()), 1);
        chip.setOnTouchListener(u1Var);
        chip2.setOnTouchListener(u1Var);
        chip.setTag(R.id.selection_type, 12);
        chip2.setTag(R.id.selection_type, 10);
        chip.setOnClickListener(fVar);
        chip2.setOnClickListener(fVar);
        chip.setAccessibilityClassName("android.view.View");
        chip2.setAccessibilityClassName("android.view.View");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i11) {
        super.onVisibilityChanged(view, i11);
        if (view == this && i11 == 0) {
            this.f12726b.sendAccessibilityEvent(8);
        }
    }

    public void setActiveSelection(int i11) {
        boolean z11 = i11 == 12;
        Chip chip = this.f12725a;
        chip.setChecked(z11);
        chip.setAccessibilityLiveRegion(z11 ? 2 : 0);
        boolean z12 = i11 == 10;
        Chip chip2 = this.f12726b;
        chip2.setChecked(z12);
        chip2.setAccessibilityLiveRegion(z12 ? 2 : 0);
    }

    public void setAnimateOnTouchUp(boolean z11) {
        this.f12727c.setAnimateOnTouchUp(z11);
    }

    public void setHandRotation(float f11) {
        this.f12727c.setHandRotation(f11);
    }

    public void setHourClickDelegate(b bVar) {
        ViewCompat.b0(this.f12725a, bVar);
    }

    public void setMinuteHourDelegate(b bVar) {
        ViewCompat.b0(this.f12726b, bVar);
    }

    public void setOnActionUpListener(c cVar) {
        this.f12727c.setOnActionUpListener(cVar);
    }

    public void setValues(String[] strArr, int i11) {
        this.f12728d.setValues(strArr, i11);
    }

    public void setHandRotation(float f11, boolean z11) {
        this.f12727c.setHandRotation(f11, z11);
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TimePickerView(Context context) {
        this(context, null);
    }
}
