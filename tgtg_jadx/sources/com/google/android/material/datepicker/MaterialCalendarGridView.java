package com.google.android.material.datepicker;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.view.ViewCompat;
import j8.c;
import x10.j;
import x10.m;
import x10.r;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class MaterialCalendarGridView extends GridView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f12434a;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        r.c(null);
        if (j.r(getContext(), R.attr.windowFullscreen)) {
            setNextFocusLeftId(com.app.tgtg.R.id.cancel_button);
            setNextFocusRightId(com.app.tgtg.R.id.confirm_button);
        }
        this.f12434a = j.r(getContext(), com.app.tgtg.R.attr.nestedScrollable);
        ViewCompat.b0(this, new c(5));
    }

    public final m a() {
        return (m) super.getAdapter();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final Adapter getAdapter() {
        return (m) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((m) super.getAdapter()).notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m mVar = (m) super.getAdapter();
        mVar.getClass();
        int iMax = Math.max(mVar.a(), getFirstVisiblePosition());
        int iMin = Math.min(mVar.c(), getLastVisiblePosition());
        mVar.getItem(iMax);
        mVar.getItem(iMin);
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z11, int i11, Rect rect) {
        if (!z11) {
            super.onFocusChanged(false, i11, rect);
            return;
        }
        if (i11 == 33) {
            setSelection(((m) super.getAdapter()).c());
        } else if (i11 == 130) {
            setSelection(((m) super.getAdapter()).a());
        } else {
            super.onFocusChanged(true, i11, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i11, KeyEvent keyEvent) {
        if (!super.onKeyDown(i11, keyEvent)) {
            return false;
        }
        int selectedItemPosition = getSelectedItemPosition();
        if (selectedItemPosition == -1 || (selectedItemPosition >= ((m) super.getAdapter()).a() && selectedItemPosition <= ((m) super.getAdapter()).c())) {
            return true;
        }
        if (19 != i11) {
            return false;
        }
        setSelection(((m) super.getAdapter()).a());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i11, int i12) {
        if (!this.f12434a) {
            super.onMeasure(i11, i12);
            return;
        }
        super.onMeasure(i11, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof m)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), m.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i11) {
        if (i11 < ((m) super.getAdapter()).a()) {
            super.setSelection(((m) super.getAdapter()).a());
        } else {
            super.setSelection(i11);
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (m) super.getAdapter();
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaterialCalendarGridView(Context context) {
        this(context, null);
    }
}
