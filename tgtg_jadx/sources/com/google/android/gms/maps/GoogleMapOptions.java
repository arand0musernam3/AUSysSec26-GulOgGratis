package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import lx.u;
import rz.a;
import s00.e;
import t00.f;
import z20.b;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class GoogleMapOptions extends a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<GoogleMapOptions> CREATOR = new e(6);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Integer f12121u = Integer.valueOf(Color.argb(255, 236, 233, 225));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Boolean f12122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f12123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CameraPosition f12125d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Boolean f12126e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Boolean f12127f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Boolean f12128g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Boolean f12129h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Boolean f12130i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Boolean f12131j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Boolean f12132k;
    public Boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Boolean f12133m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Float f12134n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Float f12135o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public LatLngBounds f12136p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Boolean f12137q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Integer f12138r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f12139s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f12140t;

    public static GoogleMapOptions d(Context context, AttributeSet attributeSet) {
        String string;
        LatLngBounds latLngBounds = null;
        if (context == null || attributeSet == null) {
            return null;
        }
        Resources resources = context.getResources();
        int[] iArr = f.f39341a;
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, iArr);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        googleMapOptions.f12124c = -1;
        googleMapOptions.f12134n = null;
        googleMapOptions.f12135o = null;
        googleMapOptions.f12136p = null;
        googleMapOptions.f12138r = null;
        googleMapOptions.f12139s = null;
        if (typedArrayObtainAttributes.hasValue(16)) {
            googleMapOptions.f12124c = typedArrayObtainAttributes.getInt(16, -1);
        }
        if (typedArrayObtainAttributes.hasValue(26)) {
            googleMapOptions.f12122a = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(26, false));
        }
        if (typedArrayObtainAttributes.hasValue(25)) {
            googleMapOptions.f12123b = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(25, false));
        }
        if (typedArrayObtainAttributes.hasValue(17)) {
            googleMapOptions.f12127f = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(17, true));
        }
        if (typedArrayObtainAttributes.hasValue(19)) {
            googleMapOptions.f12131j = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(19, true));
        }
        if (typedArrayObtainAttributes.hasValue(21)) {
            googleMapOptions.f12137q = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(21, true));
        }
        if (typedArrayObtainAttributes.hasValue(20)) {
            googleMapOptions.f12128g = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(20, true));
        }
        if (typedArrayObtainAttributes.hasValue(22)) {
            googleMapOptions.f12130i = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(22, true));
        }
        if (typedArrayObtainAttributes.hasValue(24)) {
            googleMapOptions.f12129h = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(24, true));
        }
        if (typedArrayObtainAttributes.hasValue(23)) {
            googleMapOptions.f12126e = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(23, true));
        }
        if (typedArrayObtainAttributes.hasValue(13)) {
            googleMapOptions.f12132k = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(13, false));
        }
        if (typedArrayObtainAttributes.hasValue(18)) {
            googleMapOptions.l = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(18, true));
        }
        if (typedArrayObtainAttributes.hasValue(0)) {
            googleMapOptions.f12133m = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(0, false));
        }
        if (typedArrayObtainAttributes.hasValue(4)) {
            googleMapOptions.f12134n = Float.valueOf(typedArrayObtainAttributes.getFloat(4, Float.NEGATIVE_INFINITY));
        }
        if (typedArrayObtainAttributes.hasValue(4)) {
            googleMapOptions.f12135o = Float.valueOf(typedArrayObtainAttributes.getFloat(3, Float.POSITIVE_INFINITY));
        }
        if (typedArrayObtainAttributes.hasValue(1)) {
            googleMapOptions.f12138r = Integer.valueOf(typedArrayObtainAttributes.getColor(1, f12121u.intValue()));
        }
        if (typedArrayObtainAttributes.hasValue(15) && (string = typedArrayObtainAttributes.getString(15)) != null && !string.isEmpty()) {
            googleMapOptions.f12139s = string;
        }
        if (typedArrayObtainAttributes.hasValue(14)) {
            googleMapOptions.f12140t = typedArrayObtainAttributes.getInt(14, 0);
        }
        TypedArray typedArrayObtainAttributes2 = context.getResources().obtainAttributes(attributeSet, iArr);
        Float fValueOf = typedArrayObtainAttributes2.hasValue(11) ? Float.valueOf(typedArrayObtainAttributes2.getFloat(11, 0.0f)) : null;
        Float fValueOf2 = typedArrayObtainAttributes2.hasValue(12) ? Float.valueOf(typedArrayObtainAttributes2.getFloat(12, 0.0f)) : null;
        Float fValueOf3 = typedArrayObtainAttributes2.hasValue(9) ? Float.valueOf(typedArrayObtainAttributes2.getFloat(9, 0.0f)) : null;
        Float fValueOf4 = typedArrayObtainAttributes2.hasValue(10) ? Float.valueOf(typedArrayObtainAttributes2.getFloat(10, 0.0f)) : null;
        typedArrayObtainAttributes2.recycle();
        if (fValueOf != null && fValueOf2 != null && fValueOf3 != null && fValueOf4 != null) {
            latLngBounds = new LatLngBounds(new LatLng(fValueOf.floatValue(), fValueOf2.floatValue()), new LatLng(fValueOf3.floatValue(), fValueOf4.floatValue()));
        }
        googleMapOptions.f12136p = latLngBounds;
        TypedArray typedArrayObtainAttributes3 = context.getResources().obtainAttributes(attributeSet, iArr);
        LatLng latLng = new LatLng(typedArrayObtainAttributes3.hasValue(5) ? typedArrayObtainAttributes3.getFloat(5, 0.0f) : 0.0f, typedArrayObtainAttributes3.hasValue(6) ? typedArrayObtainAttributes3.getFloat(6, 0.0f) : 0.0f);
        float f11 = typedArrayObtainAttributes3.hasValue(8) ? typedArrayObtainAttributes3.getFloat(8, 0.0f) : 0.0f;
        float f12 = typedArrayObtainAttributes3.hasValue(2) ? typedArrayObtainAttributes3.getFloat(2, 0.0f) : 0.0f;
        float f13 = typedArrayObtainAttributes3.hasValue(7) ? typedArrayObtainAttributes3.getFloat(7, 0.0f) : 0.0f;
        typedArrayObtainAttributes3.recycle();
        googleMapOptions.f12125d = new CameraPosition(latLng, f11, f13, f12);
        typedArrayObtainAttributes.recycle();
        return googleMapOptions;
    }

    public final String toString() {
        q qVar = new q(this);
        qVar.b(Integer.valueOf(this.f12124c), "MapType");
        qVar.b(this.f12132k, "LiteMode");
        qVar.b(this.f12125d, "Camera");
        qVar.b(this.f12127f, "CompassEnabled");
        qVar.b(this.f12126e, "ZoomControlsEnabled");
        qVar.b(this.f12128g, "ScrollGesturesEnabled");
        qVar.b(this.f12129h, "ZoomGesturesEnabled");
        qVar.b(this.f12130i, "TiltGesturesEnabled");
        qVar.b(this.f12131j, "RotateGesturesEnabled");
        qVar.b(this.f12137q, "ScrollGesturesEnabledDuringRotateOrZoom");
        qVar.b(this.l, "MapToolbarEnabled");
        qVar.b(this.f12133m, "AmbientEnabled");
        qVar.b(this.f12134n, "MinZoomPreference");
        qVar.b(this.f12135o, "MaxZoomPreference");
        qVar.b(this.f12138r, "BackgroundColor");
        qVar.b(this.f12136p, "LatLngBoundsForCameraTarget");
        qVar.b(this.f12122a, "ZOrderOnTop");
        qVar.b(this.f12123b, "UseViewLifecycleInFragment");
        qVar.b(Integer.valueOf(this.f12140t), "mapColorScheme");
        return qVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = u.h0(20293, parcel);
        byte bF = b.F(this.f12122a);
        u.g0(parcel, 2, 4);
        parcel.writeInt(bF);
        byte bF2 = b.F(this.f12123b);
        u.g0(parcel, 3, 4);
        parcel.writeInt(bF2);
        int i12 = this.f12124c;
        u.g0(parcel, 4, 4);
        parcel.writeInt(i12);
        u.a0(parcel, 5, this.f12125d, i11);
        byte bF3 = b.F(this.f12126e);
        u.g0(parcel, 6, 4);
        parcel.writeInt(bF3);
        byte bF4 = b.F(this.f12127f);
        u.g0(parcel, 7, 4);
        parcel.writeInt(bF4);
        byte bF5 = b.F(this.f12128g);
        u.g0(parcel, 8, 4);
        parcel.writeInt(bF5);
        byte bF6 = b.F(this.f12129h);
        u.g0(parcel, 9, 4);
        parcel.writeInt(bF6);
        byte bF7 = b.F(this.f12130i);
        u.g0(parcel, 10, 4);
        parcel.writeInt(bF7);
        byte bF8 = b.F(this.f12131j);
        u.g0(parcel, 11, 4);
        parcel.writeInt(bF8);
        byte bF9 = b.F(this.f12132k);
        u.g0(parcel, 12, 4);
        parcel.writeInt(bF9);
        byte bF10 = b.F(this.l);
        u.g0(parcel, 14, 4);
        parcel.writeInt(bF10);
        byte bF11 = b.F(this.f12133m);
        u.g0(parcel, 15, 4);
        parcel.writeInt(bF11);
        u.V(parcel, 16, this.f12134n);
        u.V(parcel, 17, this.f12135o);
        u.a0(parcel, 18, this.f12136p, i11);
        byte bF12 = b.F(this.f12137q);
        u.g0(parcel, 19, 4);
        parcel.writeInt(bF12);
        u.Z(parcel, 20, this.f12138r);
        u.b0(this.f12139s, parcel, 21);
        int i13 = this.f12140t;
        u.g0(parcel, 23, 4);
        parcel.writeInt(i13);
        u.i0(iH0, parcel);
    }
}
