package com.google.android.gms.internal.measurement;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i3 implements c5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f11484a;

    public i3(Double d3) {
        if (d3 == null) {
            this.f11484a = Double.valueOf(Double.NaN);
        } else {
            this.f11484a = d3;
        }
    }

    @Override // com.google.android.gms.internal.measurement.c5
    public final Iterator c() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.c5
    public final Boolean d() {
        Double d3 = this.f11484a;
        boolean z11 = false;
        if (!Double.isNaN(d3.doubleValue()) && d3.doubleValue() != 0.0d) {
            z11 = true;
        }
        return Boolean.valueOf(z11);
    }

    @Override // com.google.android.gms.internal.measurement.c5
    public final String e() {
        Double d3 = this.f11484a;
        if (Double.isNaN(d3.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(d3.doubleValue())) {
            return d3.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(d3.doubleValue());
        BigDecimal bigDecimal = bigDecimalValueOf.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalValueOf.stripTrailingZeros();
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((bigDecimal.scale() > 0 ? bigDecimal.precision() : bigDecimal.scale()) - 1);
        String str = decimalFormat.format(bigDecimal);
        int iIndexOf = str.indexOf("E");
        if (iIndexOf <= 0) {
            return str;
        }
        int i11 = Integer.parseInt(str.substring(iIndexOf + 1));
        return ((i11 >= 0 || i11 <= -7) && (i11 < 0 || i11 >= 21)) ? str.replace("E-", "e-").replace("E", "e+") : bigDecimal.toPlainString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i3) {
            return this.f11484a.equals(((i3) obj).f11484a);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.c5
    public final Double h() {
        return this.f11484a;
    }

    public final int hashCode() {
        return this.f11484a.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.c5
    public final c5 j(String str, b7 b7Var, ArrayList arrayList) {
        if ("toString".equals(str)) {
            return new f5(e());
        }
        a40.d0.h(e(), ".", str, " is not a function.");
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.c5
    public final c5 m() {
        return new i3(this.f11484a);
    }

    public final String toString() {
        return e();
    }
}
