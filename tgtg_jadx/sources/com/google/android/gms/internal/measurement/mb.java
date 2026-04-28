package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class mb extends b4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f11633c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mb(String str, int i11) {
        super(str);
        this.f11633c = i11;
    }

    @Override // com.google.android.gms.internal.measurement.b4
    public final c5 a(b7 b7Var, List list) {
        switch (this.f11633c) {
            case 0:
                return c5.U;
            case 1:
            case 2:
                return this;
            case 3:
                return new i3(Double.valueOf(0.0d));
            default:
                return c5.U;
        }
    }
}
