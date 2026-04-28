package com.google.android.material.bottomsheet;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import z3.q;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends y7.b {
    public static final Parcelable.Creator<d> CREATOR = new q(2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f12348d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f12349e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f12350f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f12351g;

    public d(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f12347c = parcel.readInt();
        this.f12348d = parcel.readInt();
        this.f12349e = parcel.readInt() == 1;
        this.f12350f = parcel.readInt() == 1;
        this.f12351g = parcel.readInt() == 1;
    }

    @Override // y7.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        super.writeToParcel(parcel, i11);
        parcel.writeInt(this.f12347c);
        parcel.writeInt(this.f12348d);
        parcel.writeInt(this.f12349e ? 1 : 0);
        parcel.writeInt(this.f12350f ? 1 : 0);
        parcel.writeInt(this.f12351g ? 1 : 0);
    }

    public d(BottomSheetBehavior bottomSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.f12347c = bottomSheetBehavior.N;
        this.f12348d = bottomSheetBehavior.f12314e;
        this.f12349e = bottomSheetBehavior.f12311b;
        this.f12350f = bottomSheetBehavior.I;
        this.f12351g = bottomSheetBehavior.J;
    }
}
