package com.google.android.material.appbar;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends y7.b {
    public static final Parcelable.Creator<d> CREATOR = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f12249d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12250e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f12251f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f12252g;

    public d(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f12248c = parcel.readByte() != 0;
        this.f12249d = parcel.readByte() != 0;
        this.f12250e = parcel.readInt();
        this.f12251f = parcel.readFloat();
        this.f12252g = parcel.readByte() != 0;
    }

    @Override // y7.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        super.writeToParcel(parcel, i11);
        parcel.writeByte(this.f12248c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f12249d ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f12250e);
        parcel.writeFloat(this.f12251f);
        parcel.writeByte(this.f12252g ? (byte) 1 : (byte) 0);
    }
}
