package com.amplitude.android.internal.compose;

import b4.s;
import b5.h1;
import bf.a;
import c5.l3;
import c5.o2;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/amplitude/android/internal/compose/AmpFrustrationIgnoreElement;", "Lb5/h1;", "Lbf/a;", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class AmpFrustrationIgnoreElement extends h1 {
    @Override // b5.h1
    public final s create() {
        return new a();
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof AmpFrustrationIgnoreElement);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (Boolean.hashCode(false) * 31);
    }

    @Override // b5.h1
    public final void inspectableProperties(o2 o2Var) {
        o2Var.f7307a = "ampIgnoreFrustrationAnalytics";
        l3 l3Var = o2Var.f7309c;
        Boolean bool = Boolean.FALSE;
        l3Var.b(bool, "ignoreRageClick");
        l3Var.b(bool, "ignoreDeadClick");
    }

    public final String toString() {
        return "AmpFrustrationIgnoreElement(ignoreRageClick=false, ignoreDeadClick=false)";
    }

    @Override // b5.h1
    public final void update(s sVar) {
        ((a) sVar).getClass();
    }
}
