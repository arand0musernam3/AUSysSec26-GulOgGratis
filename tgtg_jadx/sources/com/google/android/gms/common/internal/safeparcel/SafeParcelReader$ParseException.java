package com.google.android.gms.common.internal.safeparcel;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class SafeParcelReader$ParseException extends RuntimeException {
    public SafeParcelReader$ParseException(Parcel parcel, String str) {
        int iDataPosition = parcel.dataPosition();
        int iDataSize = parcel.dataSize();
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(length + 13 + String.valueOf(iDataPosition).length() + 6 + String.valueOf(iDataSize).length());
        sb2.append(str);
        sb2.append(" Parcel: pos=");
        sb2.append(iDataPosition);
        sb2.append(" size=");
        sb2.append(iDataSize);
        super(sb2.toString());
    }
}
