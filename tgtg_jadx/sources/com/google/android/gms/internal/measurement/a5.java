package com.google.android.gms.internal.measurement;

import com.adyen.checkout.components.core.Address;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a5 implements c5 {
    @Override // com.google.android.gms.internal.measurement.c5
    public final Iterator c() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.c5
    public final Boolean d() {
        return Boolean.FALSE;
    }

    @Override // com.google.android.gms.internal.measurement.c5
    public final String e() {
        return Address.ADDRESS_NULL_PLACEHOLDER;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof a5;
    }

    @Override // com.google.android.gms.internal.measurement.c5
    public final Double h() {
        return Double.valueOf(0.0d);
    }

    public final int hashCode() {
        return 1;
    }

    @Override // com.google.android.gms.internal.measurement.c5
    public final c5 j(String str, b7 b7Var, ArrayList arrayList) {
        throw new IllegalStateException("null has no function ".concat(str));
    }

    @Override // com.google.android.gms.internal.measurement.c5
    public final c5 m() {
        return c5.f11303a0;
    }
}
